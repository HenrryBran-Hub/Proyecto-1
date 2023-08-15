package main

import (
	//"encoding/json"
	"fmt"
	//"net/http"

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
	//Entrada
	//code := "var Cadena:String = \"hola\" \n var entero:Int = 3.25 \nprint(Cadena + entero)"
	code := "var Cadena:Int = 25 \n var entero:Int = cadena \nprint(entero + Cadena)"
	//Leyendo entrada
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	//creacion de parser
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	tree := p.S()
	//listener
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	//create ast
	var Ast environment.AST
	Ast.IniciarAmbito()
	//ejecución
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, nil)
	}
	fmt.Println("imprimimos el ast " + Ast.GetPrint())
	fmt.Println("imprimimos el ast " + Ast.GetErrors())
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}

/*
	http.HandleFunc("/nombre", func(w http.ResponseWriter, r *http.Request) {
		names := []string{"Alice", "Bob", "Charlie", "David", "Eva"}
		randomName := names[0]
		data := map[string]string{"name": randomName}
		w.Header().Set("Content-Type", "application/json")
		json.NewEncoder(w).Encode(data)
	})

	http.HandleFunc("/direccion", func(w http.ResponseWriter, r *http.Request) {
		addresses := []string{"123 Main St", "456 Elm St", "789 Oak St", "321 Maple St", "654 Pine St"}
		randomAddress := addresses[0]
		data := map[string]string{"address": randomAddress}
		w.Header().Set("Content-Type", "application/json")
		json.NewEncoder(w).Encode(data)
	})

	// Configuración de CORS para permitir peticiones desde el frontend
	corsHandler := func(next http.Handler) http.Handler {
		return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
			w.Header().Set("Access-Control-Allow-Origin", "*")
			w.Header().Set("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
			w.Header().Set("Access-Control-Allow-Headers", "Content-Type")
			next.ServeHTTP(w, r)
		})
	}

	fmt.Println("Servidor escuchando en http://localhost:8080")
	http.ListenAndServe(":8080", corsHandler(http.DefaultServeMux))
*/
