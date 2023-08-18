package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"strconv"
)

type SentenciaIfElse struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Ifop      []interface{}
	Elseop    []interface{}
}

func NewSentenciaIfElse(lin int, col int, expresion interfaces.Expression, Ifop []interface{}, Elseop []interface{}) SentenciaIfElse {
	return SentenciaIfElse{lin, col, expresion, Ifop, Elseop}
}

func (v SentenciaIfElse) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = v.Expresion.Ejecutar(ast, env)
	if condicion.Tipo == environment.BOOLEAN {
		ast.AumentarAmbito()
		if condicion.Valor.(bool) {
			for _, inst := range v.Ifop {
				if inst == nil {
					continue
				}
				instruction, ok := inst.(interfaces.Instruction)
				if !ok {
					continue
				}
				instruction.Ejecutar(ast, env)
			}
		} else {
			for _, inst := range v.Elseop {
				if inst == nil {
					continue
				}
				instruction, ok := inst.(interfaces.Instruction)
				if !ok {
					continue
				}
				instruction.Ejecutar(ast, env)
			}
		}
		ast.DisminuirAmbito()
	} else {
		Errores := environment.Errores{
			Descripcion: "Se ha querido asignar un valor no correspondiente en la condicion del if-else tiene que ser un tipo boleano.",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      condicion.Scope,
		}
		ast.ErroresHTML(Errores)
	}
	return nil
}
