package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type ArregloParametros struct {
	Lin int
	Col int
	Op  interfaces.Expression
}

func NewArregloParametros(lin int, col int, op interfaces.Expression) ArregloParametros {
	exp := ArregloParametros{Lin: lin, Col: col, Op: op}
	return exp
}

func (o ArregloParametros) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var op environment.Symbol
	op = o.Op.Ejecutar(ast, env)
	return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: op.Tipo, Valor: op.Valor}
}
