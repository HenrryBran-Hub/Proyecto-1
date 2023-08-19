package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type SentenciaSwitch struct {
	Lin     int
	Col     int
	Case    []interface{}
	Default []interface{}
}

func NewSentenciaSwitch(lin int, col int, cases []interface{}, defaultt []interface{}) SentenciaSwitch {
	return SentenciaSwitch{lin, col, cases, defaultt}
}

func (v SentenciaSwitch) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	//var comprobacion bool = false
	for _, inst := range v.Case {
		if inst == nil {
			continue
		}
		instruction, ok := inst.(interfaces.Instruction)
		if !ok {
			continue
		}
		ejecucion := instruction.Ejecutar(ast, env)
		if ejecucion.(bool) {
			//comprobacion = true
			fmt.Println("probando")
		}
	}
	// if comprobacion {
	// 	for _, inst := range v.Default {
	// 		if inst == nil {
	// 			continue
	// 		}
	// 		instruction, ok := inst.(interfaces.Instruction)
	// 		if !ok {
	// 			continue
	// 		}
	// 		instruction.Ejecutar(ast, env)
	// 	}
	// }
	return nil
}
