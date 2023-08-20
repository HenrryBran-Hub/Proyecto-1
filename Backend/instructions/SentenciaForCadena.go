package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"strconv"
)

type SentenciaForCadena struct {
	Lin   int
	Col   int
	Id    string
	Expre interfaces.Expression
	slice []interface{}
}

func NewSentenciaForCadena(lin int, col int, id string, expre interfaces.Expression, bloque []interface{}) SentenciaForCadena {
	return SentenciaForCadena{lin, col, id, expre, bloque}
}

func (v SentenciaForCadena) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var cadena environment.Symbol
	cadena = v.Expre.Ejecutar(ast, env)

	if cadena.Tipo == environment.VECTOR || cadena.Tipo == environment.STRING {
		symbol := environment.Symbol{
			Lin:   v.Lin,
			Col:   v.Col,
			Tipo:  environment.CHARACTER,
			Valor: nil,
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

		if cadena.Tipo == environment.STRING {
			for i := 0; i < len(cadena.Valor.(string)); i++ {
				vari := ast.GetVariable(v.Id)
				cade := cadena.Valor.(string)[i]
				character := fmt.Sprintf("%c", cade)
				symbol := environment.Symbol{
					Lin:   vari.Symbols.Lin,
					Col:   vari.Symbols.Col,
					Tipo:  environment.CHARACTER,
					Valor: character,
					Scope: "Local",
				}
				Variable := environment.Variable{
					Name:        vari.Name,
					Symbols:     symbol,
					Mutable:     true,
					TipoSimbolo: "Variable",
				}
				ast.ActualizarVariable(&Variable, symbol)
				Variable.Mutable = false
				ast.ActualizarVariable(&Variable, symbol)
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
			}
		}
		ast.DisminuirAmbito()
	} else {
		Errores := environment.Errores{
			Descripcion: "El for que se esta ejecutando solo funciona con arreglos unidimensionales",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      cadena.Scope,
		}
		ast.ErroresHTML(Errores)
		return nil
	}

	return nil
}
