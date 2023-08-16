package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net/http"

	"Backend/environment"
	"Backend/interfaces"
	"Backend/parser"

	"github.com/antlr4-go/antlr/v4"
)

type TreeShapeListener struct {
	*parser.BaseSwiftGrammarListener
	Code []interface{}
}

func main() {
	http.Handle("/simbolos", corsMiddleware(http.HandlerFunc(handleSimbolos)))
	//http.Handle("/ejecutar", corsMiddleware(http.HandlerFunc(handleEjecutar)))
	http.Handle("/errores", corsMiddleware(http.HandlerFunc(handleErrores)))

	fmt.Println("Servidor escuchando en http://localhost:8080")
	http.ListenAndServe(":8080", nil)
}

func handleEjecutar(w http.ResponseWriter, r *http.Request) {
	if r.Method == http.MethodOptions {
		w.WriteHeader(http.StatusOK)
		return
	}

	body, err := ioutil.ReadAll(r.Body)
	if err != nil {
		http.Error(w, "Error al leer el cuerpo de la petición", http.StatusInternalServerError)
		return
	}

	var data map[string]string
	err = json.Unmarshal(body, &data)
	if err != nil {
		http.Error(w, "Error al procesar el cuerpo de la petición", http.StatusBadRequest)
		return
	}

	code := data["code"]
	result := ejecutar(code)

	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(map[string]string{"result": result})
}

func ejecutar(code string) string {
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	tree := p.S()
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	var Ast environment.AST
	Ast.IniciarAmbito()
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, nil)
	}
	fmt.Println("creamos la tabla html ejecutar")
	return Ast.GetPrint()
}

func handleSimbolos(w http.ResponseWriter, r *http.Request) {
	if r.Method == http.MethodOptions {
		w.WriteHeader(http.StatusOK)
		return
	}

	body, err := ioutil.ReadAll(r.Body)
	if err != nil {
		http.Error(w, "Error al leer el cuerpo de la petición", http.StatusInternalServerError)
		return
	}

	var data map[string]string
	err = json.Unmarshal(body, &data)
	if err != nil {
		http.Error(w, "Error al procesar el cuerpo de la petición", http.StatusBadRequest)
		return
	}

	code := data["code"]
	result := ejecutar(code)

	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(map[string]string{"result": result})
}

func simbolos(code string) string {
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	tree := p.S()
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	var Ast environment.AST
	Ast.IniciarAmbito()
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, nil)
	}
	fmt.Println("creamos la tabla html")
	//Ast.TablaVariablesHTML()
	fmt.Println("terminamos la tabla html")
	return Ast.GetPrint()
}

func handleErrores(w http.ResponseWriter, r *http.Request) {
	if r.Method == http.MethodOptions {
		w.WriteHeader(http.StatusOK)
		return
	}

	body, err := ioutil.ReadAll(r.Body)
	if err != nil {
		http.Error(w, "Error al leer el cuerpo de la petición", http.StatusInternalServerError)
		return
	}

	var data map[string]string
	err = json.Unmarshal(body, &data)
	if err != nil {
		http.Error(w, "Error al procesar el cuerpo de la petición", http.StatusBadRequest)
		return
	}

	code := data["code"]
	result := ejecutar(code)

	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(map[string]string{"result": result})
}

func errores(code string) string {
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	tree := p.S()
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	var Ast environment.AST
	Ast.IniciarAmbito()
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, nil)
	}
	return Ast.GetPrint()
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}

func corsMiddleware(next http.Handler) http.Handler {
	return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		// Set CORS headers
		w.Header().Set("Access-Control-Allow-Origin", "*")
		w.Header().Set("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
		w.Header().Set("Access-Control-Allow-Headers", "Content-Type")

		// Call the next handler in the chain
		next.ServeHTTP(w, r)
	})
}
