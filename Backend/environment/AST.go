package environment

import (
	list "container/list"
	"fmt"
	"log"
	"os"
	"path/filepath"
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
	Mutable bool
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
				Ambito:      variable.Symbols.Scope,
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
			if variable.Name == nombre && variable.Mutable {
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
	fmt.Println("creamos la tabla html en funcion")
	file, err := os.Create("TablaDeSimbolos.html")
	if err != nil {
		log.Fatal(err)
	}
	defer file.Close()

	// Imprimir la ruta del archivo recién creado
	absPath, err := filepath.Abs("TablaDeSimbolos.html")
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println("Archivo creado en:", absPath)
}

/*
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
	   		table {
	   			border-collapse: collapse;
	   			width: 100%;
	   		}
	   		th, td {
	   			text-align: left;
	   			padding: 8px;
	   			border-bottom: 1px solid #ddd;
	   		}
	   		tr:hover {background-color: #555;}
	   	</style>
	   </head>
	   <body>
	   	<h1>Tabla de Simbolos</h1>
	   	<table>
	   		<tr>
	   			<th>No</th>
	   			<th>Nombre</th>
	   			<th>Mutable</th>
	   			<th>Fila</th>
	   			<th>Columna</th>
	   			<th>Valor</th>
	   			<th>Tipo</th>
	   			<th>Ambito</th>
	   		</tr>`)

	   		rowNumber := 1
	   		for e := a.Pila_Variables.Front(); e != nil; e = e.Next() {
	   			lista := e.Value.(*list.List)
	   			for v := lista.Front(); v != nil; v = v.Next() {
	   				variable := v.Value.(Variable)

	   				fmt.Fprintf(file, `
	   					<tr>
	   						<td>%d</td>
	   						<td>%s</td>
	   						<td>%t</td>
	   						<td>%d</td>
	   						<td>%d</td>
	   						<td>%v</td>
	   						<td>%s</td>
	   						<td>%s</td>
	   					</tr>`,
	   					rowNumber,
	   					variable.Name,
	   					variable.Mutable,
	   					variable.Symbols.Lin,
	   					variable.Symbols.Col,
	   					variable.Symbols.Valor,
	   					variable.Symbols.Tipo,
	   					variable.Symbols.Scope,
	   				)
	   				rowNumber++
	   			}
	   		}

	   	// Write the HTML footer
	   	fmt.Fprintln(file, `
	           </table>
	       </body>
	       </html>`)

	   	// Open the HTML file in the default web browser
	   	open.Start("TablaDeSimbolos.html")
}
*/

func (a *AST) TablaErroresHTML() {
	fmt.Println("----- Tabla de Errores -----")
	for e := a.Lista_Errores.Front(); e != nil; e = e.Next() {
		errorItem := e.Value.(Errores)
		fmt.Println("Descripción:", errorItem.Descripcion)
		fmt.Println("Fila:", errorItem.Fila)
		fmt.Println("Columna:", errorItem.Columna)
		fmt.Println("Tipo:", errorItem.Tipo)
		fmt.Println("Ambito:", errorItem.Ambito)
		fmt.Println("------------------------------")
	}
	fmt.Println("------------------------------")
}
