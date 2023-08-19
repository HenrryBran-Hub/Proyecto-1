package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type SentenciaSwitchDefault struct {
	Lin     int
	Col     int
	Default []interface{}
}

func NewSentenciaSwitchDefault(lin int, col int, defaultt []interface{}) SentenciaSwitchDefault {
	return SentenciaSwitchDefault{lin, col, defaultt}
}

func (v SentenciaSwitchDefault) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	ast.AumentarAmbito()
	for _, inst := range v.Default {
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
