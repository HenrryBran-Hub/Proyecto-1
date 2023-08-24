package environment

import (
	list "container/list"
	"fmt"
	"log"
	"os"
	"strconv"

	"github.com/skratchdot/open-golang/open"
)

type AST struct {
	Instructions        []interface{}
	Print               string
	Errors              string
	Pila_Variables      *list.List
	Lista_Variables     *list.List
	Lista_VariablesHTML *list.List
	Lista_Errores       *list.List
	Lista_Ambitos_Var   *list.List
	Variables           Variable
}

type Variable struct {
	Name        string
	Symbols     Symbol
	Mutable     bool
	TipoSimbolo string
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
	a.Lista_VariablesHTML = list.New()
	a.Pila_Variables.PushBack(a.Lista_Variables)
	a.Lista_Errores = list.New()
	a.Lista_Ambitos_Var = list.New()
}

func (a *AST) AumentarAmbito(ambito string) {
	nuevaLista := list.New()
	a.Pila_Variables.PushFront(nuevaLista)
	a.Lista_Variables = nuevaLista
	a.Lista_Ambitos_Var.PushBack(ambito)
}

func (a *AST) DisminuirAmbito() {
	a.Pila_Variables.Remove(a.Pila_Variables.Front())
	a.Lista_Variables = a.Pila_Variables.Front().Value.(*list.List)
	if a.Lista_Ambitos_Var.Len() > 0 {
		a.Lista_Ambitos_Var.Remove(a.Lista_Ambitos_Var.Back())
	}
}

func (a *AST) GuardarVariable(variable Variable) {
	var lastScope string
	if a.Lista_Ambitos_Var.Len() > 0 {
		lastScope = a.Lista_Ambitos_Var.Back().Value.(string)
		variable.Symbols.Scope = lastScope
	}
	for e := a.Lista_Variables.Front(); e != nil; e = e.Next() {
		if e.Value.(Variable).Name == variable.Name {
			Errores := Errores{
				Descripcion: "La variale que esta intentando guardar ya existe en este ambito: \n Variable: " + variable.Name,
				Fila:        strconv.Itoa(e.Value.(Variable).Symbols.Lin),
				Columna:     strconv.Itoa(e.Value.(Variable).Symbols.Col),
				Tipo:        "Error Semantico",
				Ambito:      variable.Symbols.Scope,
			}
			a.ErroresHTML(Errores)
			return
		}
	}
	a.Lista_Variables.PushBack(variable)
	if variable.Name == "Break" || variable.Name == "Continue" || variable.Name == "Return" || variable.Name == "ReturnExp" {
		return
	}
	a.Lista_VariablesHTML.PushBack(variable)
}

func (a *AST) ActualizarVariable(mariable *Variable, nuevoValor Symbol) {
	for e := a.Pila_Variables.Front(); e != nil; e = e.Next() {
		lista := e.Value.(*list.List)
		for v := lista.Front(); v != nil; v = v.Next() {
			if v.Value.(Variable).Name == mariable.Name && mariable.Mutable {
				variable := v.Value.(Variable)
				variable.Symbols.Col = nuevoValor.Col
				variable.Symbols.Lin = nuevoValor.Lin
				variable.Symbols.Scope = nuevoValor.Scope
				variable.Symbols.Tipo = nuevoValor.Tipo
				variable.Symbols.Valor = nuevoValor.Valor
				v.Value = variable
				return
			}
		}
	}
	Errores := Errores{
		Descripcion: "La variale que esta intentando modificar no existe: \n Variable: " + mariable.Name,
		Fila:        strconv.Itoa(nuevoValor.Lin),
		Columna:     strconv.Itoa(nuevoValor.Col),
		Tipo:        "Error Semantico",
		Ambito:      nuevoValor.Scope,
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

func (a *AST) TablaVariablesHTML() {
	// Create a new HTML file
	file, err := os.Create("TablaDeSimbolos.html")
	if err != nil {
		log.Fatal(err)
	}
	defer file.Close()

	// Write the HTML header and table structure
	fmt.Fprintln(file, `<!DOCTYPE html>
	   <html>
	   <head>
	   	<title>Tabla de Simbolos</title>
	   	<style>
	   		body {
	   			background-color: #333;
	   			color: white;
	   			font-family: sans-serif;
	   		}
	   		h1 {
	   			text-align: center;
	   		}
	   		table {
	   			border-collapse: collapse;
	   			width: 100%;
	   			border: 2px double black;
	   		}
	   		th, td {
	   			text-align: center;
	   			padding: 8px;
	   			border-bottom: 1px solid #ddd;
	   		}
	   		th {
	   			background-color: goldenrod;
	   		}
	   		tr:hover {background-color: #555;}
	   	</style>
	   </head>
	   <body>
	   	<h1>Tabla de Simbolos</h1>
	   	<table>
	   		<tr>
	   			<th>No</th>
				<th>Tipo Simbolo</th>
	   			<th>Nombre</th>
	   			<th>Mutable</th>
	   			<th>Fila</th>
	   			<th>Columna</th>
	   			<th>Valor</th>
	   			<th>Tipo</th>
	   			<th>Ambito</th>
	   		</tr>`)

	rowNumber := 1
	for e := a.Lista_VariablesHTML.Front(); e != nil; e = e.Next() {
		variable := e.Value.(Variable)
		var tipoexpstr string
		switch variable.Symbols.Tipo {
		case 0:
			tipoexpstr = "Int"
		case 1:
			tipoexpstr = "Float"
		case 2:
			tipoexpstr = "String"
		case 3:
			tipoexpstr = "Boolean"
		case 4:
			tipoexpstr = "Character"
		default:
			tipoexpstr = "nil"
		}
		fmt.Fprintf(file, `
   					<tr>
   						<td>%d</td>
						<td>%s</td>
   						<td>%s</td>
   						<td>%t</td>
   						<td>%d</td>
   						<td>%d</td>
   						<td>%v</td>
   						<td>%s</td>
   						<td>%s</td>
   					</tr>`,
			rowNumber,
			variable.TipoSimbolo,
			variable.Name,
			variable.Mutable,
			variable.Symbols.Lin,
			variable.Symbols.Col,
			variable.Symbols.Valor,
			tipoexpstr,
			variable.Symbols.Scope,
		)
		rowNumber++
	}

	// Write the HTML footer
	fmt.Fprintln(file, `
           </table>
       </body>
       </html>`)

	// Open the HTML file in the default web browser
	open.Start("TablaDeSimbolos.html")
}

func (a *AST) TablaErroresHTML() {
	// Create a new HTML file
	file, err := os.Create("TablaErrores.html")
	if err != nil {
		log.Fatal(err)
	}
	defer file.Close()

	// Write the HTML header and table structure
	fmt.Fprintln(file, `<!DOCTYPE html>
	   <html>
	   <head>
	   	<title>Reporte de Errores</title>
	   	<style>
	   		body {
	   			background-color: #333;
	   			color: white;
	   			font-family: sans-serif;
	   		}
	   		h1 {
	   			text-align: center;
	   		}
	   		table {
	   			border-collapse: collapse;
	   			width: 100%;
	   			border: 2px double black;
	   		}
	   		th, td {
	   			text-align: center;
	   			padding: 8px;
	   			border-bottom: 1px solid #ddd;
	   		}
	   		th {
	   			background-color: firebrick;
	   		}
	   		tr:hover {background-color: #555;}
	   	</style>
	   </head>
	   <body>
	   	<h1>Tabla de Errores</h1>
	   	<table>
	   		<tr>
	   			<th>No</th>
				<th>Descripcion</th>
	   			<th>Ambito</th>
	   			<th>Fila</th>
	   			<th>Columna</th>
				<th>Tipo de Error</th>
	   		</tr>`)

	rowNumber := 1
	for e := a.Lista_Errores.Front(); e != nil; e = e.Next() {
		errorItem := e.Value.(Errores)
		fmt.Fprintf(file, `
   					<tr>
   						<td>%d</td>
   						<td>%s</td>
						<td>%s</td>
						<td>%s</td>
						<td>%s</td>
						<td>%s</td>
   					</tr>`,
			rowNumber,
			errorItem.Descripcion,
			errorItem.Ambito,
			errorItem.Fila,
			errorItem.Columna,
			errorItem.Tipo,
		)
		rowNumber++
	}
	// Write the HTML footer
	fmt.Fprintln(file, `
           </table>
       </body>
       </html>`)

	// Open the HTML file in the default web browser
	open.Start("TablaErrores.html")
}

func (a *AST) removeFromListFromBack(valor int) {
	for e := 0; e < valor; e++ {
		lastElement := a.Lista_VariablesHTML.Back()
		if lastElement != nil {
			a.Lista_VariablesHTML.Remove(lastElement)
		}
	}
}

func (a *AST) LimpiarLista() {
	numElementsToRemove := a.Lista_Variables.Len()
	for i := 0; i < numElementsToRemove; i++ {
		lastElement := a.Lista_Variables.Back()
		if lastElement != nil {
			a.Lista_Variables.Remove(lastElement)
		}
	}
	a.removeFromListFromBack(numElementsToRemove)
}
