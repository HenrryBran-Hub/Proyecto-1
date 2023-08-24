package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"strconv"
)

type SentenciaIf struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	slice     []interface{}
}

func NewSentenciaIf(lin int, col int, expresion interfaces.Expression, bloque []interface{}) SentenciaIf {
	return SentenciaIf{lin, col, expresion, bloque}
}

func (v SentenciaIf) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = v.Expresion.Ejecutar(ast, env)
	var retornable int = 0
	var reexp environment.Symbol
	ast.AumentarAmbito()
	if condicion.Tipo == environment.BOOLEAN {
		if condicion.Valor.(bool) {
			var continueflag bool = false
			breakPosition := -1
			for i, inst := range v.slice {
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
					breakPosition = i
					break
				}
				rvari := ast.GetVariable("Return")
				if rvari != nil {
					retornable = 2
					breakPosition = i
					break
				}
				revari := ast.GetVariable("ReturnExp")
				if revari != nil {
					retornable = 3
					reexp = revari.Symbols
					breakPosition = i
					break
				}
				cvari := ast.GetVariable("Continue")
				if cvari != nil {
					continueflag = true
					breakPosition = i
					break
				}
			}

			if continueflag {
				for i := breakPosition; i < len(v.slice); i++ {
					inst := v.slice[i]
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
						continueflag = true
						break
					}
				}
			}
		}
	} else {
		Errores := environment.Errores{
			Descripcion: "Se ha querido asignar un valor no correspondiente en la condicion del if tiene que ser un tipo boleano.",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      condicion.Scope,
		}
		ast.ErroresHTML(Errores)
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
	if tamanio == 1 && retornable == 3 {
		Errores := environment.Errores{
			Descripcion: "Estas retornando un valor fuera de una funcion",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      condicion.Scope,
		}
		ast.ErroresHTML(Errores)
	}
	return nil
}
