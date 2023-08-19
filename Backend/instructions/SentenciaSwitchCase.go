package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"strconv"
)

type SentenciaSwitchCase struct {
	Lin  int
	Col  int
	Exp1 interfaces.Expression
	Exp2 interfaces.Expression
	Ifop []interface{}
}

func NewSentenciaSwitchCase(lin int, col int, expr1 interfaces.Expression, expr2 interfaces.Expression, operations []interface{}) SentenciaSwitchCase {
	return SentenciaSwitchCase{lin, col, expr1, expr2, operations}
}

func (v SentenciaSwitchCase) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var exp1, exp2 environment.Symbol
	exp1 = v.Exp1.Ejecutar(ast, env)
	exp2 = v.Exp2.Ejecutar(ast, env)
	if exp1.Valor == exp2.Valor && exp1.Tipo == exp1.Tipo {
		ast.AumentarAmbito()
		for _, inst := range v.Ifop {
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
		return true
	} else {
		Errores := environment.Errores{
			Descripcion: "Se ha querido comparar diferentes tipos de datos en el switch, condicion de switch:" + fmt.Sprintf("%v", exp1.Valor) + ", valor del case: " + fmt.Sprintf("%v", exp2.Valor),
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      exp1.Scope,
		}
		ast.ErroresHTML(Errores)
	}
	return nil
}
