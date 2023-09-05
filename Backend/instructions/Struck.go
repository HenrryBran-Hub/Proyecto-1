package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type Struck struct {
	Line int
	Col  int
	Name string
	Op   []interface{}
}

func NewStruck(line, col int, name string, op []interface{}) Struck {
	return Struck{line, col, name, op}
}

func (v Struck) Ejecutar(ast *environment.AST) interface{} {

	for _, inst := range v.Op {
		if inst == nil {
			continue
		}
		instruction, ok := inst.(interfaces.Instruction)
		if !ok {
			continue
		}
		instruction.Ejecutar(ast)
	}

	fmt.Println(ast.AtributosStruct)
	return nil
}
