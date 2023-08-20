package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"strconv"
)

type SentenciaForRango struct {
	Lin   int
	Col   int
	Id    string
	Left  interfaces.Expression
	Right interfaces.Expression
	slice []interface{}
}

func NewSentenciaForRango(lin int, col int, id string, left interfaces.Expression, right interfaces.Expression, bloque []interface{}) SentenciaForRango {
	return SentenciaForRango{lin, col, id, left, right, bloque}
}

func (v SentenciaForRango) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var left, right environment.Symbol
	left = v.Left.Ejecutar(ast, env)
	right = v.Right.Ejecutar(ast, env)

	if left.Tipo != environment.INTEGER && right.Tipo != environment.INTEGER {
		Errores := environment.Errores{
			Descripcion: "El rango de for solo admite valores de tipo Int",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      left.Scope,
		}
		ast.ErroresHTML(Errores)
		return nil
	}

	if left.Valor.(int) > right.Valor.(int) {
		Errores := environment.Errores{
			Descripcion: "El rango de for tiene que ser el lado izquierdo (<=) derecho no mayor",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      left.Scope,
		}
		ast.ErroresHTML(Errores)
		return nil
	}

	symbol := environment.Symbol{
		Lin:   v.Lin,
		Col:   v.Col,
		Tipo:  environment.INTEGER,
		Valor: left.Valor,
		Scope: "Local",
	}
	Variable := environment.Variable{
		Name:        v.Id,
		Symbols:     symbol,
		Mutable:     true,
		TipoSimbolo: "Variable",
	}
	ast.AumentarAmbito()
	ast.GuardarVariable(Variable)
	for i := left.Valor.(int); i <= right.Valor.(int); i++ {
		for _, inst := range v.slice {
			if inst == nil {
				continue
			}
			instruction, ok := inst.(interfaces.Instruction)
			if !ok {
				continue
			}
			instruction.Ejecutar(ast, env)
		}
		vari := ast.GetVariable(v.Id)
		symbol := environment.Symbol{
			Lin:   vari.Symbols.Lin,
			Col:   vari.Symbols.Col,
			Tipo:  environment.INTEGER,
			Valor: vari.Symbols.Valor.(int) + 1,
			Scope: "Local",
		}
		Variable := environment.Variable{
			Name:        vari.Name,
			Symbols:     symbol,
			Mutable:     true,
			TipoSimbolo: "Variable",
		}
		ast.ActualizarVariable(&Variable, symbol)
	}
	ast.DisminuirAmbito()

	return nil
}
