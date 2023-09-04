package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"container/list"
)

type FuncionesDeclaracionRP struct {
	Lin        int
	Col        int
	Name       string
	Parametros interfaces.Instruction
	Tipo       environment.TipoExpresion
	Bloque     []interface{}
}

func NewFuncionesDeclaracionRP(lin int, col int, name string, parametros interfaces.Instruction, tipo environment.TipoExpresion, bloque []interface{}) FuncionesDeclaracionRP {
	return FuncionesDeclaracionRP{lin, col, name, parametros, tipo, bloque}
}

func (v FuncionesDeclaracionRP) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	listavalores := list.New()
	v.Parametros.Ejecutar(ast, env)
	for e := ast.Lista_Funciones_Var.Front(); e != nil; e = e.Next() {
		valor := e.Value.(environment.VariableFuncion)
		valor.Symbols.Scope = "Funcion-" + v.Name
		listavalores.PushBack(valor)
	}

	funcion := environment.Funcion{
		Lin:           v.Lin,
		Col:           v.Col,
		Nombre:        v.Name,
		IsReturn:      true,
		IsParame:      true,
		Parametros:    listavalores,
		CodigoFuncion: v.Bloque,
		Tipo:          v.Tipo,
	}

	ast.GuardarFuncion(funcion)
	ast.Lista_Funciones_Var.Init()
	return nil
}
