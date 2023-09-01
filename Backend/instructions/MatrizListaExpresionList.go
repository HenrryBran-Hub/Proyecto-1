package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type MatrizListaExpresionList struct {
	Op1 interfaces.Instruction
	Op2 interfaces.Instruction
}

func NewMatrizListaExpresionList(op1 interfaces.Instruction, op2 interfaces.Instruction) MatrizListaExpresionList {
	exp := MatrizListaExpresionList{op1, op2}
	return exp
}

func (o MatrizListaExpresionList) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	o.Op1.Ejecutar(ast, env)
	o.Op2.Ejecutar(ast, env)
	return nil
}
