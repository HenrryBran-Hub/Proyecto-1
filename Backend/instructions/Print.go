package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
)

type Print struct {
	Lin   int
	Col   int
	Value interface{}
}

func NewPrint(lin int, col int, val interface{}) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST) interface{} {
	valueToPrint := p.Value.(interfaces.Expression).Ejecutar(ast)
	consoleOut := fmt.Sprintf("%v", valueToPrint.Valor)
	ast.SetPrint(consoleOut + "\n")
	return nil
}
