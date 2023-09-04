package instructions

import (
	"Backend/environment"
	"Backend/interfaces"
	"container/list"
)

type FuncionesDeclaracionP struct {
	Lin        int
	Col        int
	Name       string
	Parametros interfaces.Instruction
	Bloque     []interface{}
}

func NewFuncionesDeclaracionP(lin int, col int, name string, parametros interfaces.Instruction, bloque []interface{}) FuncionesDeclaracionP {
	return FuncionesDeclaracionP{lin, col, name, parametros, bloque}
}

func (v FuncionesDeclaracionP) Ejecutar(ast *environment.AST, env interface{}) interface{} {
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
		IsReturn:      false,
		IsParame:      true,
		Parametros:    listavalores,
		CodigoFuncion: v.Bloque,
	}

	ast.GuardarFuncion(funcion)
	ast.Lista_Funciones_Var.Init()
	return nil
}
