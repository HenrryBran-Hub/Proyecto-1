package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"strconv"
)

type SentenciaIf struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	slice     []interface{}
}

func NewSentenciaIf(lin int, col int, expresion interfaces.Expression, bloque []interface{}) SentenciaIf {
	return SentenciaIf{lin, col, expresion, bloque}
}

func (v SentenciaIf) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = v.Expresion.Ejecutar(ast, env)
	if condicion.Tipo == environment.BOOLEAN {
		ast.AumentarAmbito()
		if condicion.Valor.(bool) {
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
		ast.DisminuirAmbito()
	} else {
		Errores := environment.Errores{
			Descripcion: "Se ha querido asignar un valor no correspondiente en la condicion del if tiene que ser un tipo boleano.",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      condicion.Scope,
		}
		ast.ErroresHTML(Errores)
	}
	return nil
}
