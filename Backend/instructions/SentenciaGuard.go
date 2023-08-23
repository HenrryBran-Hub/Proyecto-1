package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"reflect"
	"strconv"
)

type SentenciaGuard struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	slice     []interface{}
}

func NewSentenciaGuard(lin int, col int, expresion interfaces.Expression, bloque []interface{}) SentenciaGuard {
	return SentenciaGuard{lin, col, expresion, bloque}
}

func (v SentenciaGuard) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	ultimoValor := v.slice[len(v.slice)-1]
	instType := reflect.TypeOf(ultimoValor).String()
	if instType == "instructions.TransferenciaContinue" || instType == "instructions.TransferenciaBreak" || instType == "instructions.TransferenciaReturn" || instType == "instructions.TransferenciaReturnExp" {
		var condicion environment.Symbol
		condicion = v.Expresion.Ejecutar(ast, env)
		if condicion.Tipo == environment.BOOLEAN {
			var retornable int = 0
			var reexp environment.Symbol
			ast.AumentarAmbito()
			if condicion.Valor.(bool) == false {
				for _, inst := range v.slice {
					if inst == nil {
						continue
					}
					instruction, ok := inst.(interfaces.Instruction)
					if !ok {
						continue
					}
					instruction.Ejecutar(ast, env)
					bvari := ast.GetVariable("Break")
					if bvari != nil {
						retornable = 1
						break
					}
					rvari := ast.GetVariable("Return")
					if rvari != nil {
						retornable = 2
						break
					}
					revari := ast.GetVariable("ReturnExp")
					if revari != nil {
						retornable = 3
						reexp = revari.Symbols
						break
					}
					cvari := ast.GetVariable("Continue")
					if cvari != nil {
						continue
					}
				}
			}
			ast.DisminuirAmbito()
			tamanio := ast.Pila_Variables.Len()
			if tamanio > 1 {
				if retornable == 1 {
					symbol := environment.Symbol{
						Lin:   v.Lin,
						Col:   v.Col,
						Tipo:  environment.BOOLEAN,
						Valor: true,
						Scope: "Local",
					}
					Variable := environment.Variable{
						Name:        "Break",
						Symbols:     symbol,
						Mutable:     false,
						TipoSimbolo: "Sentencia de Transferencia",
					}
					ast.GuardarVariable(Variable)
				}
				if retornable == 2 {
					symbol := environment.Symbol{
						Lin:   v.Lin,
						Col:   v.Col,
						Tipo:  environment.BOOLEAN,
						Valor: true,
						Scope: "Local",
					}
					Variable := environment.Variable{
						Name:        "Return",
						Symbols:     symbol,
						Mutable:     false,
						TipoSimbolo: "Sentencia de Transferencia",
					}
					ast.GuardarVariable(Variable)
				}
				if retornable == 3 {
					symbol := environment.Symbol{
						Lin:   v.Lin,
						Col:   v.Col,
						Tipo:  reexp.Tipo,
						Valor: reexp.Valor,
						Scope: reexp.Scope,
					}
					Variable := environment.Variable{
						Name:        "ReturnExp",
						Symbols:     symbol,
						Mutable:     false,
						TipoSimbolo: "Sentencia de Transferencia",
					}
					ast.GuardarVariable(Variable)
				}
			}
		} else {
			Errores := environment.Errores{
				Descripcion: "Se ha querido asignar un valor no correspondiente en la condicion del guard tiene que ser un tipo boleano.",
				Fila:        strconv.Itoa(v.Lin),
				Columna:     strconv.Itoa(v.Col),
				Tipo:        "Error Semantico",
				Ambito:      condicion.Scope,
			}
			ast.ErroresHTML(Errores)
		}
	} else {
		Errores := environment.Errores{
			Descripcion: "El Guard tiene que finalizar con break,continue,return. otro tipo de valor no es admitido",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      "Guard",
		}
		ast.ErroresHTML(Errores)
	}
	return nil
}
