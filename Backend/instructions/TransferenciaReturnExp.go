package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
)

type TransferenciaReturnExp struct {
	Lin   int
	Col   int
	Value interfaces.Expression
}

func NewTransferenciaReturnExp(lin int, col int, value interfaces.Expression) TransferenciaReturnExp {
	return TransferenciaReturnExp{Lin: lin, Col: col, Value: value}
}

func (v TransferenciaReturnExp) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	value := v.Value.Ejecutar(ast, env)
	symbol := environment.Symbol{
		Lin:   value.Lin,
		Col:   value.Col,
		Tipo:  value.Tipo,
		Valor: value.Valor,
		Scope: "Local",
	}
	Variable := environment.Variable{
		Name:        "ReturnExp",
		Symbols:     symbol,
		Mutable:     true,
		TipoSimbolo: "Sentencia de Transferencia",
	}

	ast.GuardarVariable(Variable)
	return nil
}
