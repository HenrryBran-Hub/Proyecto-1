package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type SentenciaSwitch struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Case      []interface{}
}

func NewSentenciaSwitch(lin int, col int, expresion interfaces.Expression, cases []interface{}) SentenciaSwitch {
	return SentenciaSwitch{lin, col, expresion, cases}
}

func (v SentenciaSwitch) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	for _, inst := range v.Case {
		switchCase, _ := inst.(SentenciaSwitchCase)
		valorcase := switchCase.Exp1.Ejecutar(ast, env)
		valorswitch := v.Expresion.Ejecutar(ast, env)
		if valorcase.Valor == valorswitch.Valor && valorcase.Tipo == valorswitch.Tipo {
			ast.AumentarAmbito()
			for _, inst := range switchCase.Case {
				if inst == nil {
					continue
				}
				instruction, ok := inst.(interfaces.Instruction)
				if !ok {
					continue
				}
				instruction.Ejecutar(ast, env)
			}
			ast.DisminuirAmbito()
			return nil
		}
	}
	return nil
}
