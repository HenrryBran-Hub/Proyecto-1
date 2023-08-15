package environment

import (
	list "container/list"
	"strconv"
)

type AST struct {
	Instructions    []interface{}
	Print           string
	Errors          string
	Pila_Variables  *list.List
	Lista_Variables *list.List
	Lista_Errores   *list.List
	Variables       Variable
}

type Variable struct {
	Name    string
	Symbols Symbol
	Ambito  string
}

type Errores struct {
	Descripcion string
	Fila        string
	Columna     string
	Tipo        string
	Ambito      string
}

type TablaSymbolosHTML struct {
	Id          string
	TipoSymbolo string
	TipoDato    string
	Lin         string
	Col         string
	Ambito      string
}

func NewAST(inst []interface{}, print string, err string) AST {
	ast := AST{Instructions: inst, Print: print, Errors: err}
	return ast
}

func (a *AST) GetPrint() string {
	return a.Print
}

func (a *AST) SetPrint(ToPrint string) {
	a.Print = a.Print + ToPrint
}

func (a *AST) GetErrors() string {
	return a.Errors
}

func (a *AST) SetError(ToErr string) {
	a.Errors = a.Errors + ToErr
}

func (a *AST) IniciarAmbito() {
	a.Pila_Variables = list.New()
	a.Lista_Variables = list.New()
	a.Pila_Variables.PushBack(a.Lista_Variables)
	a.Lista_Errores = list.New()
}

func (a *AST) AumentarAmbito() {
	nuevaLista := list.New()
	a.Pila_Variables.PushFront(nuevaLista)
	a.Lista_Variables = nuevaLista
}

func (a *AST) DisminuirAmbito() {
	a.Pila_Variables.Remove(a.Pila_Variables.Front())
	a.Lista_Variables = a.Pila_Variables.Front().Value.(*list.List)
}

func (a *AST) GuardarVariable(variable Variable) {
	for e := a.Lista_Variables.Front(); e != nil; e = e.Next() {
		if e.Value.(Variable).Name == variable.Name {
			Errores := Errores{
				Descripcion: "La variale que esta intentando guardar ya existe en este ambito: \n Variable: " + variable.Name,
				Fila:        strconv.Itoa(e.Value.(Variable).Symbols.Lin),
				Columna:     strconv.Itoa(e.Value.(Variable).Symbols.Col),
				Tipo:        "Error Semantico",
			}
			a.ErroresHTML(Errores)
			return
		}
	}
	a.Lista_Variables.PushBack(variable)
}

func (a *AST) ActualizarVariable(nombre string, nuevoValor Symbol) {
	for e := a.Pila_Variables.Front(); e != nil; e = e.Next() {
		lista := e.Value.(*list.List)
		for v := lista.Front(); v != nil; v = v.Next() {
			variable := v.Value.(Variable)
			if variable.Name == nombre {
				variable.Symbols = nuevoValor
				return
			}
		}
	}
	Errores := Errores{
		Descripcion: "La variale que esta intentando modificar no existe: \n Variable: " + nombre,
		Fila:        strconv.Itoa(nuevoValor.Lin),
		Columna:     strconv.Itoa(nuevoValor.Col),
		Tipo:        "Error Semantico",
	}
	a.ErroresHTML(Errores)
}

func (a *AST) GetVariable(nombre string) *Variable {
	for e := a.Pila_Variables.Front(); e != nil; e = e.Next() {
		lista := e.Value.(*list.List)
		for v := lista.Front(); v != nil; v = v.Next() {
			variable := v.Value.(Variable)
			if variable.Name == nombre {
				return &variable
			}
		}
	}
	return nil
}

func (a *AST) ErroresHTML(errores Errores) {
	a.Lista_Errores.PushBack(errores)
}

/*
func (a *AST) TablaVariablesHTML() {
	for e := a.Pila_Variables.Front(); e != nil; e = e.Next() {
		lista := e.Value.(*list.List)
		for v := lista.Front(); v != nil; v = v.Next() {
			variable := v.Value.(Variable)
			a.SetPrint("")
		}
	}
	a.SetError("Error: no hay valores")
}
*/
