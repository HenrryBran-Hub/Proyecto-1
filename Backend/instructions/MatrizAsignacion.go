package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"container/list"
	"fmt"
	"strconv"
)

type MatrizAsiginacion struct {
	Name string
	Expr interfaces.Expression
	Op   []interface{}
}

func NewMatrizAsiginacion(name string, tipo interfaces.Expression, values []interface{}) MatrizAsiginacion {
	return MatrizAsiginacion{name, tipo, values}
}

func (v MatrizAsiginacion) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	primerval := v.Expr.Ejecutar(ast, env)

	if primerval.Tipo != environment.INTEGER {
		Errores := environment.Errores{
			Descripcion: "Las posiciones ingresadas deben de ser Enteros o el resultado de una operacion que de entero",
			Fila:        strconv.Itoa(primerval.Lin),
			Columna:     strconv.Itoa(primerval.Col),
			Tipo:        "Error Semantico",
			Ambito:      ast.ObtenerAmbito(),
		}
		ast.ErroresHTML(Errores)
		return nil
	}

	listavalores := list.New()
	for _, inst := range v.Op {
		if inst == nil {
			continue
		}
		instruction, ok := inst.(interfaces.Expression)
		if !ok {
			continue
		}
		values := instruction.Ejecutar(ast, env)
		listavalores.PushBack(values)
	}

	for e := listavalores.Front(); e != nil; e = e.Next() {
		symbol := e.Value.(environment.Symbol)
		if symbol.Tipo != environment.INTEGER {
			Errores := environment.Errores{
				Descripcion: "Las posiciones ingresadas deben de ser Enteros o el resultado de una operacion que de entero",
				Fila:        strconv.Itoa(symbol.Lin),
				Columna:     strconv.Itoa(symbol.Col),
				Tipo:        "Error Semantico",
				Ambito:      ast.ObtenerAmbito(),
			}
			ast.ErroresHTML(Errores)
			return nil
		}
	}

	var valoresSlice []int
	valoresSlice = append(valoresSlice, primerval.Valor.(int))
	for e := listavalores.Front(); e != nil; e = e.Next() {
		symbol := e.Value.(environment.Symbol)
		valor, ok := symbol.Valor.(int)
		if ok {
			valoresSlice = append(valoresSlice, valor)
		}
	}

	matriz := ast.GetMatriz(v.Name)
	fmt.Println(matriz)
	fmt.Println("////////////////////////")
	fmt.Println(valoresSlice)

	return nil
}
