package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
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
	return nil
}
