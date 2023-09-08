package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"fmt"
	"strconv"
)

type StruckAsignacion struct {
	Lin        int
	Col        int
	IdStruct   string
	IdVariable string
	Op         interfaces.Expression
}

func NewStruckAsignacionExpre(lin int, col int, varstr string, variable string, op interfaces.Expression) StruckAsignacion {
	return StruckAsignacion{lin, col, varstr, variable, op}
}

func (v StruckAsignacion) Ejecutar(ast *environment.AST) interface{} {
	estructura := ast.GetVariableStruc(v.IdStruct)
	if estructura == nil {
		Errores := environment.Errores{
			Descripcion: "El struc que estas intentando ingresar no existe",
			Fila:        strconv.Itoa(v.Lin),
			Columna:     strconv.Itoa(v.Col),
			Tipo:        "Error Semantico",
			Ambito:      ast.ObtenerAmbito(),
		}
		ast.ErroresHTML(Errores)
		return nil
	} else {

		expresion := v.Op.Ejecutar(ast)
		fmt.Println(estructura)
		fmt.Println(expresion)
		return nil
	}
}
