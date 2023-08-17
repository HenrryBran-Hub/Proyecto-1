package instructions

import (
	"Backend/environment"
)

type VariableDeclaracionSinExp struct {
	Lin   int
	Col   int
	Name  string
	Scope string
	Type  environment.TipoExpresion
}

func NewVariableDeclaracionSinExp(lin int, col int, name string, scope string, tipo environment.TipoExpresion) VariableDeclaracionSinExp {
	return VariableDeclaracionSinExp{Lin: lin, Col: col, Name: name, Scope: scope, Type: tipo}
}

func (v VariableDeclaracionSinExp) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	symbol := environment.Symbol{
		Lin:   v.Lin,
		Col:   v.Col,
		Tipo:  v.Type,
		Valor: nil,
		Scope: v.Scope,
	}
	Variable := environment.Variable{
		Name:        v.Name,
		Symbols:     symbol,
		Mutable:     true,
		TipoSimbolo: "Variable",
	}

	ast.GuardarVariable(Variable)
	return nil
}
