package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
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
	ast.AumentarAmbito()
	if condicion.Valor.(bool) {
		for _, inst := range v.slice {
			if inst == nil {
				continue
			}
			instruction, ok := inst.(interfaces.Instruction)
			if !ok {
				continue
			}
			instruction.Ejecutar(ast, env)
			// instruction2, ok2 := inst.(interfaces.Expression)
			// if !ok2 {
			// 	continue
			// }
		}
	}
	ast.DisminuirAmbito()
	return nil
}
