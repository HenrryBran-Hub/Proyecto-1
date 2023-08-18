// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import (
	"fmt"
	"strconv"
	"sync"

	"github.com/antlr4-go/antlr/v4"
)

import "Backend/interfaces"
import "Backend/environment"
import "Backend/expressions"
import "Backend/instructions"
import "strings"

// Suppress unused import errors
var _ = fmt.Printf
var _ = strconv.Itoa
var _ = sync.Once{}

type SwiftGrammarParser struct {
	*antlr.BaseParser
}

var SwiftGrammarParserStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func swiftgrammarParserInit() {
	staticData := &SwiftGrammarParserStaticData
	staticData.LiteralNames = []string{
		"", "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", "'true'",
		"'false'", "'var'", "'Let'", "'nil'", "'if'", "'else'", "'switch'",
		"'case'", "'default'", "'breack'", "'continue'", "'for'", "'in'", "'...'",
		"'while'", "'guard'", "'return'", "'func'", "'print'", "'inout'", "'append'",
		"'remove'", "'removeLast'", "'count'", "'isEmpty'", "'at'", "'repeating'",
		"'struct'", "'mutating'", "", "", "", "", "", "'='", "':'", "';'", "'?'",
		"'('", "')'", "'!='", "'=='", "'!'", "'||'", "'&&'", "'>='", "'<='",
		"'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'+='", "'-='", "'{'",
		"'}'", "'->'", "','", "'.'", "'_'", "'['", "']'",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR",
		"LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE",
		"FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", "PRINT",
		"INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "ISEMPTY", "AT",
		"REPEATING", "STRUCT", "MUTATING", "NUMBER", "CADENA", "ID_VALIDO",
		"CHARACTER", "WS", "IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ",
		"PARDER", "DIF", "IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR",
		"MENOR", "MODULO", "MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ",
		"LLAVEDER", "RETORNO", "COMA", "PUNTO", "GUIONBAJO", "CORCHIZQ", "CORCHDER",
		"WHITESPACE", "COMMENT", "LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"s", "block", "instruction", "blockinterno", "instructionint", "printstmt",
		"declavarible", "declaconstante", "asignacionvariable", "printstmtint",
		"declavaribleint", "declaconstanteint", "asignacionvariableint", "tipodato",
		"expr", "sentenciaifelse",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 73, 345, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2, 10, 7,
		10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15, 7, 15,
		1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 4, 1, 38, 8, 1, 11, 1, 12, 1, 39, 1, 1, 1,
		1, 1, 2, 1, 2, 3, 2, 46, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 52, 8, 2,
		1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 58, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 64,
		8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 71, 8, 2, 1, 3, 4, 3, 74, 8,
		3, 11, 3, 12, 3, 75, 1, 3, 1, 3, 1, 4, 1, 4, 3, 4, 82, 8, 4, 1, 4, 1, 4,
		1, 4, 1, 4, 3, 4, 88, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 94, 8, 4, 1,
		4, 1, 4, 1, 4, 1, 4, 3, 4, 100, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3,
		4, 107, 8, 4, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 3, 6, 136, 8, 6, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 3, 7, 152,
		8, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8,
		1, 8, 1, 8, 1, 8, 1, 8, 3, 8, 169, 8, 8, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9,
		1, 9, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10,
		1, 10, 3, 10, 198, 8, 10, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1,
		11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 3, 11, 214, 8, 11,
		1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1,
		12, 1, 12, 1, 12, 1, 12, 1, 12, 3, 12, 231, 8, 12, 1, 13, 1, 13, 1, 13,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 3, 13, 243, 8, 13, 1,
		14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 3, 14, 269, 8, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 1, 14, 5, 14, 311, 8, 14, 10, 14, 12, 14, 314, 9, 14,
		1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15,
		1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 3, 15, 343, 8, 15, 1, 15, 0,
		1, 28, 16, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 0,
		5, 1, 0, 57, 58, 1, 0, 59, 60, 2, 0, 52, 52, 54, 54, 2, 0, 53, 53, 55,
		55, 1, 0, 47, 48, 378, 0, 32, 1, 0, 0, 0, 2, 37, 1, 0, 0, 0, 4, 70, 1,
		0, 0, 0, 6, 73, 1, 0, 0, 0, 8, 106, 1, 0, 0, 0, 10, 108, 1, 0, 0, 0, 12,
		135, 1, 0, 0, 0, 14, 151, 1, 0, 0, 0, 16, 168, 1, 0, 0, 0, 18, 170, 1,
		0, 0, 0, 20, 197, 1, 0, 0, 0, 22, 213, 1, 0, 0, 0, 24, 230, 1, 0, 0, 0,
		26, 242, 1, 0, 0, 0, 28, 268, 1, 0, 0, 0, 30, 342, 1, 0, 0, 0, 32, 33,
		3, 2, 1, 0, 33, 34, 5, 0, 0, 1, 34, 35, 6, 0, -1, 0, 35, 1, 1, 0, 0, 0,
		36, 38, 3, 4, 2, 0, 37, 36, 1, 0, 0, 0, 38, 39, 1, 0, 0, 0, 39, 37, 1,
		0, 0, 0, 39, 40, 1, 0, 0, 0, 40, 41, 1, 0, 0, 0, 41, 42, 6, 1, -1, 0, 42,
		3, 1, 0, 0, 0, 43, 45, 3, 10, 5, 0, 44, 46, 5, 43, 0, 0, 45, 44, 1, 0,
		0, 0, 45, 46, 1, 0, 0, 0, 46, 47, 1, 0, 0, 0, 47, 48, 6, 2, -1, 0, 48,
		71, 1, 0, 0, 0, 49, 51, 3, 12, 6, 0, 50, 52, 5, 43, 0, 0, 51, 50, 1, 0,
		0, 0, 51, 52, 1, 0, 0, 0, 52, 53, 1, 0, 0, 0, 53, 54, 6, 2, -1, 0, 54,
		71, 1, 0, 0, 0, 55, 57, 3, 14, 7, 0, 56, 58, 5, 43, 0, 0, 57, 56, 1, 0,
		0, 0, 57, 58, 1, 0, 0, 0, 58, 59, 1, 0, 0, 0, 59, 60, 6, 2, -1, 0, 60,
		71, 1, 0, 0, 0, 61, 63, 3, 16, 8, 0, 62, 64, 5, 43, 0, 0, 63, 62, 1, 0,
		0, 0, 63, 64, 1, 0, 0, 0, 64, 65, 1, 0, 0, 0, 65, 66, 6, 2, -1, 0, 66,
		71, 1, 0, 0, 0, 67, 68, 3, 30, 15, 0, 68, 69, 6, 2, -1, 0, 69, 71, 1, 0,
		0, 0, 70, 43, 1, 0, 0, 0, 70, 49, 1, 0, 0, 0, 70, 55, 1, 0, 0, 0, 70, 61,
		1, 0, 0, 0, 70, 67, 1, 0, 0, 0, 71, 5, 1, 0, 0, 0, 72, 74, 3, 8, 4, 0,
		73, 72, 1, 0, 0, 0, 74, 75, 1, 0, 0, 0, 75, 73, 1, 0, 0, 0, 75, 76, 1,
		0, 0, 0, 76, 77, 1, 0, 0, 0, 77, 78, 6, 3, -1, 0, 78, 7, 1, 0, 0, 0, 79,
		81, 3, 18, 9, 0, 80, 82, 5, 43, 0, 0, 81, 80, 1, 0, 0, 0, 81, 82, 1, 0,
		0, 0, 82, 83, 1, 0, 0, 0, 83, 84, 6, 4, -1, 0, 84, 107, 1, 0, 0, 0, 85,
		87, 3, 20, 10, 0, 86, 88, 5, 43, 0, 0, 87, 86, 1, 0, 0, 0, 87, 88, 1, 0,
		0, 0, 88, 89, 1, 0, 0, 0, 89, 90, 6, 4, -1, 0, 90, 107, 1, 0, 0, 0, 91,
		93, 3, 22, 11, 0, 92, 94, 5, 43, 0, 0, 93, 92, 1, 0, 0, 0, 93, 94, 1, 0,
		0, 0, 94, 95, 1, 0, 0, 0, 95, 96, 6, 4, -1, 0, 96, 107, 1, 0, 0, 0, 97,
		99, 3, 24, 12, 0, 98, 100, 5, 43, 0, 0, 99, 98, 1, 0, 0, 0, 99, 100, 1,
		0, 0, 0, 100, 101, 1, 0, 0, 0, 101, 102, 6, 4, -1, 0, 102, 107, 1, 0, 0,
		0, 103, 104, 3, 30, 15, 0, 104, 105, 6, 4, -1, 0, 105, 107, 1, 0, 0, 0,
		106, 79, 1, 0, 0, 0, 106, 85, 1, 0, 0, 0, 106, 91, 1, 0, 0, 0, 106, 97,
		1, 0, 0, 0, 106, 103, 1, 0, 0, 0, 107, 9, 1, 0, 0, 0, 108, 109, 5, 25,
		0, 0, 109, 110, 5, 45, 0, 0, 110, 111, 3, 28, 14, 0, 111, 112, 5, 46, 0,
		0, 112, 113, 6, 5, -1, 0, 113, 11, 1, 0, 0, 0, 114, 115, 5, 8, 0, 0, 115,
		116, 5, 38, 0, 0, 116, 117, 5, 42, 0, 0, 117, 118, 3, 26, 13, 0, 118, 119,
		5, 41, 0, 0, 119, 120, 3, 28, 14, 0, 120, 121, 6, 6, -1, 0, 121, 136, 1,
		0, 0, 0, 122, 123, 5, 8, 0, 0, 123, 124, 5, 38, 0, 0, 124, 125, 5, 41,
		0, 0, 125, 126, 3, 28, 14, 0, 126, 127, 6, 6, -1, 0, 127, 136, 1, 0, 0,
		0, 128, 129, 5, 8, 0, 0, 129, 130, 5, 38, 0, 0, 130, 131, 5, 42, 0, 0,
		131, 132, 3, 26, 13, 0, 132, 133, 5, 44, 0, 0, 133, 134, 6, 6, -1, 0, 134,
		136, 1, 0, 0, 0, 135, 114, 1, 0, 0, 0, 135, 122, 1, 0, 0, 0, 135, 128,
		1, 0, 0, 0, 136, 13, 1, 0, 0, 0, 137, 138, 5, 9, 0, 0, 138, 139, 5, 38,
		0, 0, 139, 140, 5, 42, 0, 0, 140, 141, 3, 26, 13, 0, 141, 142, 5, 41, 0,
		0, 142, 143, 3, 28, 14, 0, 143, 144, 6, 7, -1, 0, 144, 152, 1, 0, 0, 0,
		145, 146, 5, 9, 0, 0, 146, 147, 5, 38, 0, 0, 147, 148, 5, 41, 0, 0, 148,
		149, 3, 28, 14, 0, 149, 150, 6, 7, -1, 0, 150, 152, 1, 0, 0, 0, 151, 137,
		1, 0, 0, 0, 151, 145, 1, 0, 0, 0, 152, 15, 1, 0, 0, 0, 153, 154, 5, 38,
		0, 0, 154, 155, 5, 41, 0, 0, 155, 156, 3, 28, 14, 0, 156, 157, 6, 8, -1,
		0, 157, 169, 1, 0, 0, 0, 158, 159, 5, 38, 0, 0, 159, 160, 5, 61, 0, 0,
		160, 161, 3, 28, 14, 0, 161, 162, 6, 8, -1, 0, 162, 169, 1, 0, 0, 0, 163,
		164, 5, 38, 0, 0, 164, 165, 5, 62, 0, 0, 165, 166, 3, 28, 14, 0, 166, 167,
		6, 8, -1, 0, 167, 169, 1, 0, 0, 0, 168, 153, 1, 0, 0, 0, 168, 158, 1, 0,
		0, 0, 168, 163, 1, 0, 0, 0, 169, 17, 1, 0, 0, 0, 170, 171, 5, 25, 0, 0,
		171, 172, 5, 45, 0, 0, 172, 173, 3, 28, 14, 0, 173, 174, 5, 46, 0, 0, 174,
		175, 6, 9, -1, 0, 175, 19, 1, 0, 0, 0, 176, 177, 5, 8, 0, 0, 177, 178,
		5, 38, 0, 0, 178, 179, 5, 42, 0, 0, 179, 180, 3, 26, 13, 0, 180, 181, 5,
		41, 0, 0, 181, 182, 3, 28, 14, 0, 182, 183, 6, 10, -1, 0, 183, 198, 1,
		0, 0, 0, 184, 185, 5, 8, 0, 0, 185, 186, 5, 38, 0, 0, 186, 187, 5, 41,
		0, 0, 187, 188, 3, 28, 14, 0, 188, 189, 6, 10, -1, 0, 189, 198, 1, 0, 0,
		0, 190, 191, 5, 8, 0, 0, 191, 192, 5, 38, 0, 0, 192, 193, 5, 42, 0, 0,
		193, 194, 3, 26, 13, 0, 194, 195, 5, 44, 0, 0, 195, 196, 6, 10, -1, 0,
		196, 198, 1, 0, 0, 0, 197, 176, 1, 0, 0, 0, 197, 184, 1, 0, 0, 0, 197,
		190, 1, 0, 0, 0, 198, 21, 1, 0, 0, 0, 199, 200, 5, 9, 0, 0, 200, 201, 5,
		38, 0, 0, 201, 202, 5, 42, 0, 0, 202, 203, 3, 26, 13, 0, 203, 204, 5, 41,
		0, 0, 204, 205, 3, 28, 14, 0, 205, 206, 6, 11, -1, 0, 206, 214, 1, 0, 0,
		0, 207, 208, 5, 9, 0, 0, 208, 209, 5, 38, 0, 0, 209, 210, 5, 41, 0, 0,
		210, 211, 3, 28, 14, 0, 211, 212, 6, 11, -1, 0, 212, 214, 1, 0, 0, 0, 213,
		199, 1, 0, 0, 0, 213, 207, 1, 0, 0, 0, 214, 23, 1, 0, 0, 0, 215, 216, 5,
		38, 0, 0, 216, 217, 5, 41, 0, 0, 217, 218, 3, 28, 14, 0, 218, 219, 6, 12,
		-1, 0, 219, 231, 1, 0, 0, 0, 220, 221, 5, 38, 0, 0, 221, 222, 5, 61, 0,
		0, 222, 223, 3, 28, 14, 0, 223, 224, 6, 12, -1, 0, 224, 231, 1, 0, 0, 0,
		225, 226, 5, 38, 0, 0, 226, 227, 5, 62, 0, 0, 227, 228, 3, 28, 14, 0, 228,
		229, 6, 12, -1, 0, 229, 231, 1, 0, 0, 0, 230, 215, 1, 0, 0, 0, 230, 220,
		1, 0, 0, 0, 230, 225, 1, 0, 0, 0, 231, 25, 1, 0, 0, 0, 232, 233, 5, 1,
		0, 0, 233, 243, 6, 13, -1, 0, 234, 235, 5, 2, 0, 0, 235, 243, 6, 13, -1,
		0, 236, 237, 5, 3, 0, 0, 237, 243, 6, 13, -1, 0, 238, 239, 5, 4, 0, 0,
		239, 243, 6, 13, -1, 0, 240, 241, 5, 5, 0, 0, 241, 243, 6, 13, -1, 0, 242,
		232, 1, 0, 0, 0, 242, 234, 1, 0, 0, 0, 242, 236, 1, 0, 0, 0, 242, 238,
		1, 0, 0, 0, 242, 240, 1, 0, 0, 0, 243, 27, 1, 0, 0, 0, 244, 245, 6, 14,
		-1, 0, 245, 246, 5, 49, 0, 0, 246, 247, 3, 28, 14, 17, 247, 248, 6, 14,
		-1, 0, 248, 269, 1, 0, 0, 0, 249, 250, 5, 45, 0, 0, 250, 251, 3, 28, 14,
		0, 251, 252, 5, 46, 0, 0, 252, 253, 6, 14, -1, 0, 253, 269, 1, 0, 0, 0,
		254, 255, 5, 36, 0, 0, 255, 269, 6, 14, -1, 0, 256, 257, 5, 37, 0, 0, 257,
		269, 6, 14, -1, 0, 258, 259, 5, 6, 0, 0, 259, 269, 6, 14, -1, 0, 260, 261,
		5, 7, 0, 0, 261, 269, 6, 14, -1, 0, 262, 263, 5, 39, 0, 0, 263, 269, 6,
		14, -1, 0, 264, 265, 5, 38, 0, 0, 265, 269, 6, 14, -1, 0, 266, 267, 5,
		10, 0, 0, 267, 269, 6, 14, -1, 0, 268, 244, 1, 0, 0, 0, 268, 249, 1, 0,
		0, 0, 268, 254, 1, 0, 0, 0, 268, 256, 1, 0, 0, 0, 268, 258, 1, 0, 0, 0,
		268, 260, 1, 0, 0, 0, 268, 262, 1, 0, 0, 0, 268, 264, 1, 0, 0, 0, 268,
		266, 1, 0, 0, 0, 269, 312, 1, 0, 0, 0, 270, 271, 10, 16, 0, 0, 271, 272,
		7, 0, 0, 0, 272, 273, 3, 28, 14, 17, 273, 274, 6, 14, -1, 0, 274, 311,
		1, 0, 0, 0, 275, 276, 10, 15, 0, 0, 276, 277, 7, 1, 0, 0, 277, 278, 3,
		28, 14, 16, 278, 279, 6, 14, -1, 0, 279, 311, 1, 0, 0, 0, 280, 281, 10,
		14, 0, 0, 281, 282, 7, 2, 0, 0, 282, 283, 3, 28, 14, 15, 283, 284, 6, 14,
		-1, 0, 284, 311, 1, 0, 0, 0, 285, 286, 10, 13, 0, 0, 286, 287, 7, 3, 0,
		0, 287, 288, 3, 28, 14, 14, 288, 289, 6, 14, -1, 0, 289, 311, 1, 0, 0,
		0, 290, 291, 10, 12, 0, 0, 291, 292, 7, 4, 0, 0, 292, 293, 3, 28, 14, 13,
		293, 294, 6, 14, -1, 0, 294, 311, 1, 0, 0, 0, 295, 296, 10, 11, 0, 0, 296,
		297, 5, 51, 0, 0, 297, 298, 3, 28, 14, 12, 298, 299, 6, 14, -1, 0, 299,
		311, 1, 0, 0, 0, 300, 301, 10, 10, 0, 0, 301, 302, 5, 50, 0, 0, 302, 303,
		3, 28, 14, 11, 303, 304, 6, 14, -1, 0, 304, 311, 1, 0, 0, 0, 305, 306,
		10, 9, 0, 0, 306, 307, 5, 56, 0, 0, 307, 308, 3, 28, 14, 10, 308, 309,
		6, 14, -1, 0, 309, 311, 1, 0, 0, 0, 310, 270, 1, 0, 0, 0, 310, 275, 1,
		0, 0, 0, 310, 280, 1, 0, 0, 0, 310, 285, 1, 0, 0, 0, 310, 290, 1, 0, 0,
		0, 310, 295, 1, 0, 0, 0, 310, 300, 1, 0, 0, 0, 310, 305, 1, 0, 0, 0, 311,
		314, 1, 0, 0, 0, 312, 310, 1, 0, 0, 0, 312, 313, 1, 0, 0, 0, 313, 29, 1,
		0, 0, 0, 314, 312, 1, 0, 0, 0, 315, 316, 5, 11, 0, 0, 316, 317, 3, 28,
		14, 0, 317, 318, 5, 63, 0, 0, 318, 319, 3, 6, 3, 0, 319, 320, 5, 64, 0,
		0, 320, 321, 6, 15, -1, 0, 321, 343, 1, 0, 0, 0, 322, 323, 5, 11, 0, 0,
		323, 324, 3, 28, 14, 0, 324, 325, 5, 63, 0, 0, 325, 326, 3, 6, 3, 0, 326,
		327, 5, 64, 0, 0, 327, 328, 5, 12, 0, 0, 328, 329, 5, 63, 0, 0, 329, 330,
		3, 6, 3, 0, 330, 331, 5, 64, 0, 0, 331, 332, 6, 15, -1, 0, 332, 343, 1,
		0, 0, 0, 333, 334, 5, 11, 0, 0, 334, 335, 3, 28, 14, 0, 335, 336, 5, 63,
		0, 0, 336, 337, 3, 6, 3, 0, 337, 338, 5, 64, 0, 0, 338, 339, 5, 12, 0,
		0, 339, 340, 3, 30, 15, 0, 340, 341, 6, 15, -1, 0, 341, 343, 1, 0, 0, 0,
		342, 315, 1, 0, 0, 0, 342, 322, 1, 0, 0, 0, 342, 333, 1, 0, 0, 0, 343,
		31, 1, 0, 0, 0, 23, 39, 45, 51, 57, 63, 70, 75, 81, 87, 93, 99, 106, 135,
		151, 168, 197, 213, 230, 242, 268, 310, 312, 342,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// SwiftGrammarParserInit initializes any static state used to implement SwiftGrammarParser. By default the
// static state used to implement the parser is lazily initialized during the first call to
// NewSwiftGrammarParser(). You can call this function if you wish to initialize the static state ahead
// of time.
func SwiftGrammarParserInit() {
	staticData := &SwiftGrammarParserStaticData
	staticData.once.Do(swiftgrammarParserInit)
}

// NewSwiftGrammarParser produces a new parser instance for the optional input antlr.TokenStream.
func NewSwiftGrammarParser(input antlr.TokenStream) *SwiftGrammarParser {
	SwiftGrammarParserInit()
	this := new(SwiftGrammarParser)
	this.BaseParser = antlr.NewBaseParser(input)
	staticData := &SwiftGrammarParserStaticData
	this.Interpreter = antlr.NewParserATNSimulator(this, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	this.RuleNames = staticData.RuleNames
	this.LiteralNames = staticData.LiteralNames
	this.SymbolicNames = staticData.SymbolicNames
	this.GrammarFileName = "SwiftGrammar.g4"

	return this
}

// SwiftGrammarParser tokens.
const (
	SwiftGrammarParserEOF          = antlr.TokenEOF
	SwiftGrammarParserINT          = 1
	SwiftGrammarParserFLOAT        = 2
	SwiftGrammarParserSTRING       = 3
	SwiftGrammarParserBOOL         = 4
	SwiftGrammarParserCHARACT      = 5
	SwiftGrammarParserTRU          = 6
	SwiftGrammarParserFAL          = 7
	SwiftGrammarParserVAR          = 8
	SwiftGrammarParserLET          = 9
	SwiftGrammarParserNULO         = 10
	SwiftGrammarParserIF           = 11
	SwiftGrammarParserELSE         = 12
	SwiftGrammarParserSWITCH       = 13
	SwiftGrammarParserCASE         = 14
	SwiftGrammarParserDEFAULT      = 15
	SwiftGrammarParserBREAK        = 16
	SwiftGrammarParserCONTINUE     = 17
	SwiftGrammarParserFOR          = 18
	SwiftGrammarParserIN           = 19
	SwiftGrammarParserRANGO        = 20
	SwiftGrammarParserWHILE        = 21
	SwiftGrammarParserGUARD        = 22
	SwiftGrammarParserRETURN       = 23
	SwiftGrammarParserFUNCION      = 24
	SwiftGrammarParserPRINT        = 25
	SwiftGrammarParserINOUT        = 26
	SwiftGrammarParserAPPEND       = 27
	SwiftGrammarParserREMOVE       = 28
	SwiftGrammarParserREMOVELAST   = 29
	SwiftGrammarParserCOUNT        = 30
	SwiftGrammarParserISEMPTY      = 31
	SwiftGrammarParserAT           = 32
	SwiftGrammarParserREPEATING    = 33
	SwiftGrammarParserSTRUCT       = 34
	SwiftGrammarParserMUTATING     = 35
	SwiftGrammarParserNUMBER       = 36
	SwiftGrammarParserCADENA       = 37
	SwiftGrammarParserID_VALIDO    = 38
	SwiftGrammarParserCHARACTER    = 39
	SwiftGrammarParserWS           = 40
	SwiftGrammarParserIG           = 41
	SwiftGrammarParserDOS_PUNTOS   = 42
	SwiftGrammarParserPUNTOCOMA    = 43
	SwiftGrammarParserCIERRE_INTE  = 44
	SwiftGrammarParserPARIZQ       = 45
	SwiftGrammarParserPARDER       = 46
	SwiftGrammarParserDIF          = 47
	SwiftGrammarParserIG_IG        = 48
	SwiftGrammarParserNOT          = 49
	SwiftGrammarParserOR           = 50
	SwiftGrammarParserAND          = 51
	SwiftGrammarParserMAY_IG       = 52
	SwiftGrammarParserMEN_IG       = 53
	SwiftGrammarParserMAYOR        = 54
	SwiftGrammarParserMENOR        = 55
	SwiftGrammarParserMODULO       = 56
	SwiftGrammarParserMUL          = 57
	SwiftGrammarParserDIV          = 58
	SwiftGrammarParserADD          = 59
	SwiftGrammarParserSUB          = 60
	SwiftGrammarParserSUMA         = 61
	SwiftGrammarParserRESTA        = 62
	SwiftGrammarParserLLAVEIZQ     = 63
	SwiftGrammarParserLLAVEDER     = 64
	SwiftGrammarParserRETORNO      = 65
	SwiftGrammarParserCOMA         = 66
	SwiftGrammarParserPUNTO        = 67
	SwiftGrammarParserGUIONBAJO    = 68
	SwiftGrammarParserCORCHIZQ     = 69
	SwiftGrammarParserCORCHDER     = 70
	SwiftGrammarParserWHITESPACE   = 71
	SwiftGrammarParserCOMMENT      = 72
	SwiftGrammarParserLINE_COMMENT = 73
)

// SwiftGrammarParser rules.
const (
	SwiftGrammarParserRULE_s                     = 0
	SwiftGrammarParserRULE_block                 = 1
	SwiftGrammarParserRULE_instruction           = 2
	SwiftGrammarParserRULE_blockinterno          = 3
	SwiftGrammarParserRULE_instructionint        = 4
	SwiftGrammarParserRULE_printstmt             = 5
	SwiftGrammarParserRULE_declavarible          = 6
	SwiftGrammarParserRULE_declaconstante        = 7
	SwiftGrammarParserRULE_asignacionvariable    = 8
	SwiftGrammarParserRULE_printstmtint          = 9
	SwiftGrammarParserRULE_declavaribleint       = 10
	SwiftGrammarParserRULE_declaconstanteint     = 11
	SwiftGrammarParserRULE_asignacionvariableint = 12
	SwiftGrammarParserRULE_tipodato              = 13
	SwiftGrammarParserRULE_expr                  = 14
	SwiftGrammarParserRULE_sentenciaifelse       = 15
)

// ISContext is an interface to support dynamic dispatch.
type ISContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_block returns the _block rule contexts.
	Get_block() IBlockContext

	// Set_block sets the _block rule contexts.
	Set_block(IBlockContext)

	// GetCode returns the code attribute.
	GetCode() []interface{}

	// SetCode sets the code attribute.
	SetCode([]interface{})

	// Getter signatures
	Block() IBlockContext
	EOF() antlr.TerminalNode

	// IsSContext differentiates from other interfaces.
	IsSContext()
}

type SContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	code   []interface{}
	_block IBlockContext
}

func NewEmptySContext() *SContext {
	var p = new(SContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_s
	return p
}

func InitEmptySContext(p *SContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_s
}

func (*SContext) IsSContext() {}

func NewSContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SContext {
	var p = new(SContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_s

	return p
}

func (s *SContext) GetParser() antlr.Parser { return s.parser }

func (s *SContext) Get_block() IBlockContext { return s._block }

func (s *SContext) Set_block(v IBlockContext) { s._block = v }

func (s *SContext) GetCode() []interface{} { return s.code }

func (s *SContext) SetCode(v []interface{}) { s.code = v }

func (s *SContext) Block() IBlockContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockContext)
}

func (s *SContext) EOF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserEOF, 0)
}

func (s *SContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterS(s)
	}
}

func (s *SContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitS(s)
	}
}

func (p *SwiftGrammarParser) S() (localctx ISContext) {
	localctx = NewSContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, SwiftGrammarParserRULE_s)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(32)

		var _x = p.Block()

		localctx.(*SContext)._block = _x
	}
	{
		p.SetState(33)
		p.Match(SwiftGrammarParserEOF)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

	localctx.(*SContext).code = localctx.(*SContext).Get_block().GetBlk()

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IBlockContext is an interface to support dynamic dispatch.
type IBlockContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruction returns the _instruction rule contexts.
	Get_instruction() IInstructionContext

	// Set_instruction sets the _instruction rule contexts.
	Set_instruction(IInstructionContext)

	// GetIns returns the ins rule context list.
	GetIns() []IInstructionContext

	// SetIns sets the ins rule context list.
	SetIns([]IInstructionContext)

	// GetBlk returns the blk attribute.
	GetBlk() []interface{}

	// SetBlk sets the blk attribute.
	SetBlk([]interface{})

	// Getter signatures
	AllInstruction() []IInstructionContext
	Instruction(i int) IInstructionContext

	// IsBlockContext differentiates from other interfaces.
	IsBlockContext()
}

type BlockContext struct {
	antlr.BaseParserRuleContext
	parser       antlr.Parser
	blk          []interface{}
	_instruction IInstructionContext
	ins          []IInstructionContext
}

func NewEmptyBlockContext() *BlockContext {
	var p = new(BlockContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_block
	return p
}

func InitEmptyBlockContext(p *BlockContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_block
}

func (*BlockContext) IsBlockContext() {}

func NewBlockContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BlockContext {
	var p = new(BlockContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_block

	return p
}

func (s *BlockContext) GetParser() antlr.Parser { return s.parser }

func (s *BlockContext) Get_instruction() IInstructionContext { return s._instruction }

func (s *BlockContext) Set_instruction(v IInstructionContext) { s._instruction = v }

func (s *BlockContext) GetIns() []IInstructionContext { return s.ins }

func (s *BlockContext) SetIns(v []IInstructionContext) { s.ins = v }

func (s *BlockContext) GetBlk() []interface{} { return s.blk }

func (s *BlockContext) SetBlk(v []interface{}) { s.blk = v }

func (s *BlockContext) AllInstruction() []IInstructionContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IInstructionContext); ok {
			len++
		}
	}

	tst := make([]IInstructionContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IInstructionContext); ok {
			tst[i] = t.(IInstructionContext)
			i++
		}
	}

	return tst
}

func (s *BlockContext) Instruction(i int) IInstructionContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IInstructionContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IInstructionContext)
}

func (s *BlockContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BlockContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BlockContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBlock(s)
	}
}

func (s *BlockContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBlock(s)
	}
}

func (p *SwiftGrammarParser) Block() (localctx IBlockContext) {
	localctx = NewBlockContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, SwiftGrammarParserRULE_block)

	localctx.(*BlockContext).blk = []interface{}{}
	var listInt []IInstructionContext

	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(37)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&274911464192) != 0) {
		{
			p.SetState(36)

			var _x = p.Instruction()

			localctx.(*BlockContext)._instruction = _x
		}
		localctx.(*BlockContext).ins = append(localctx.(*BlockContext).ins, localctx.(*BlockContext)._instruction)

		p.SetState(39)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}

	listInt = localctx.(*BlockContext).GetIns()
	for _, e := range listInt {
		localctx.(*BlockContext).blk = append(localctx.(*BlockContext).blk, e.GetInst())
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IInstructionContext is an interface to support dynamic dispatch.
type IInstructionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printstmt returns the _printstmt rule contexts.
	Get_printstmt() IPrintstmtContext

	// Get_declavarible returns the _declavarible rule contexts.
	Get_declavarible() IDeclavaribleContext

	// Get_declaconstante returns the _declaconstante rule contexts.
	Get_declaconstante() IDeclaconstanteContext

	// Get_asignacionvariable returns the _asignacionvariable rule contexts.
	Get_asignacionvariable() IAsignacionvariableContext

	// Get_sentenciaifelse returns the _sentenciaifelse rule contexts.
	Get_sentenciaifelse() ISentenciaifelseContext

	// Set_printstmt sets the _printstmt rule contexts.
	Set_printstmt(IPrintstmtContext)

	// Set_declavarible sets the _declavarible rule contexts.
	Set_declavarible(IDeclavaribleContext)

	// Set_declaconstante sets the _declaconstante rule contexts.
	Set_declaconstante(IDeclaconstanteContext)

	// Set_asignacionvariable sets the _asignacionvariable rule contexts.
	Set_asignacionvariable(IAsignacionvariableContext)

	// Set_sentenciaifelse sets the _sentenciaifelse rule contexts.
	Set_sentenciaifelse(ISentenciaifelseContext)

	// GetInst returns the inst attribute.
	GetInst() interfaces.Instruction

	// SetInst sets the inst attribute.
	SetInst(interfaces.Instruction)

	// Getter signatures
	Printstmt() IPrintstmtContext
	PUNTOCOMA() antlr.TerminalNode
	Declavarible() IDeclavaribleContext
	Declaconstante() IDeclaconstanteContext
	Asignacionvariable() IAsignacionvariableContext
	Sentenciaifelse() ISentenciaifelseContext

	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	antlr.BaseParserRuleContext
	parser              antlr.Parser
	inst                interfaces.Instruction
	_printstmt          IPrintstmtContext
	_declavarible       IDeclavaribleContext
	_declaconstante     IDeclaconstanteContext
	_asignacionvariable IAsignacionvariableContext
	_sentenciaifelse    ISentenciaifelseContext
}

func NewEmptyInstructionContext() *InstructionContext {
	var p = new(InstructionContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_instruction
	return p
}

func InitEmptyInstructionContext(p *InstructionContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_instruction
}

func (*InstructionContext) IsInstructionContext() {}

func NewInstructionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionContext {
	var p = new(InstructionContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_instruction

	return p
}

func (s *InstructionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionContext) Get_printstmt() IPrintstmtContext { return s._printstmt }

func (s *InstructionContext) Get_declavarible() IDeclavaribleContext { return s._declavarible }

func (s *InstructionContext) Get_declaconstante() IDeclaconstanteContext { return s._declaconstante }

func (s *InstructionContext) Get_asignacionvariable() IAsignacionvariableContext {
	return s._asignacionvariable
}

func (s *InstructionContext) Get_sentenciaifelse() ISentenciaifelseContext { return s._sentenciaifelse }

func (s *InstructionContext) Set_printstmt(v IPrintstmtContext) { s._printstmt = v }

func (s *InstructionContext) Set_declavarible(v IDeclavaribleContext) { s._declavarible = v }

func (s *InstructionContext) Set_declaconstante(v IDeclaconstanteContext) { s._declaconstante = v }

func (s *InstructionContext) Set_asignacionvariable(v IAsignacionvariableContext) {
	s._asignacionvariable = v
}

func (s *InstructionContext) Set_sentenciaifelse(v ISentenciaifelseContext) { s._sentenciaifelse = v }

func (s *InstructionContext) GetInst() interfaces.Instruction { return s.inst }

func (s *InstructionContext) SetInst(v interfaces.Instruction) { s.inst = v }

func (s *InstructionContext) Printstmt() IPrintstmtContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IPrintstmtContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IPrintstmtContext)
}

func (s *InstructionContext) PUNTOCOMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTOCOMA, 0)
}

func (s *InstructionContext) Declavarible() IDeclavaribleContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IDeclavaribleContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IDeclavaribleContext)
}

func (s *InstructionContext) Declaconstante() IDeclaconstanteContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IDeclaconstanteContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IDeclaconstanteContext)
}

func (s *InstructionContext) Asignacionvariable() IAsignacionvariableContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IAsignacionvariableContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IAsignacionvariableContext)
}

func (s *InstructionContext) Sentenciaifelse() ISentenciaifelseContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISentenciaifelseContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISentenciaifelseContext)
}

func (s *InstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterInstruction(s)
	}
}

func (s *InstructionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitInstruction(s)
	}
}

func (p *SwiftGrammarParser) Instruction() (localctx IInstructionContext) {
	localctx = NewInstructionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, SwiftGrammarParserRULE_instruction)
	var _la int

	p.SetState(70)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserPRINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(43)

			var _x = p.Printstmt()

			localctx.(*InstructionContext)._printstmt = _x
		}
		p.SetState(45)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(44)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_printstmt().GetPrnt()

	case SwiftGrammarParserVAR:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(49)

			var _x = p.Declavarible()

			localctx.(*InstructionContext)._declavarible = _x
		}
		p.SetState(51)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(50)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_declavarible().GetDecvbl()

	case SwiftGrammarParserLET:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(55)

			var _x = p.Declaconstante()

			localctx.(*InstructionContext)._declaconstante = _x
		}
		p.SetState(57)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(56)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_declaconstante().GetDeccon()

	case SwiftGrammarParserID_VALIDO:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(61)

			var _x = p.Asignacionvariable()

			localctx.(*InstructionContext)._asignacionvariable = _x
		}
		p.SetState(63)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(62)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_asignacionvariable().GetAsgvbl()

	case SwiftGrammarParserIF:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(67)

			var _x = p.Sentenciaifelse()

			localctx.(*InstructionContext)._sentenciaifelse = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_sentenciaifelse().GetMyIfElse()

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IBlockinternoContext is an interface to support dynamic dispatch.
type IBlockinternoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instructionint returns the _instructionint rule contexts.
	Get_instructionint() IInstructionintContext

	// Set_instructionint sets the _instructionint rule contexts.
	Set_instructionint(IInstructionintContext)

	// GetInsint returns the insint rule context list.
	GetInsint() []IInstructionintContext

	// SetInsint sets the insint rule context list.
	SetInsint([]IInstructionintContext)

	// GetBlkint returns the blkint attribute.
	GetBlkint() []interface{}

	// SetBlkint sets the blkint attribute.
	SetBlkint([]interface{})

	// Getter signatures
	AllInstructionint() []IInstructionintContext
	Instructionint(i int) IInstructionintContext

	// IsBlockinternoContext differentiates from other interfaces.
	IsBlockinternoContext()
}

type BlockinternoContext struct {
	antlr.BaseParserRuleContext
	parser          antlr.Parser
	blkint          []interface{}
	_instructionint IInstructionintContext
	insint          []IInstructionintContext
}

func NewEmptyBlockinternoContext() *BlockinternoContext {
	var p = new(BlockinternoContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_blockinterno
	return p
}

func InitEmptyBlockinternoContext(p *BlockinternoContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_blockinterno
}

func (*BlockinternoContext) IsBlockinternoContext() {}

func NewBlockinternoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BlockinternoContext {
	var p = new(BlockinternoContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_blockinterno

	return p
}

func (s *BlockinternoContext) GetParser() antlr.Parser { return s.parser }

func (s *BlockinternoContext) Get_instructionint() IInstructionintContext { return s._instructionint }

func (s *BlockinternoContext) Set_instructionint(v IInstructionintContext) { s._instructionint = v }

func (s *BlockinternoContext) GetInsint() []IInstructionintContext { return s.insint }

func (s *BlockinternoContext) SetInsint(v []IInstructionintContext) { s.insint = v }

func (s *BlockinternoContext) GetBlkint() []interface{} { return s.blkint }

func (s *BlockinternoContext) SetBlkint(v []interface{}) { s.blkint = v }

func (s *BlockinternoContext) AllInstructionint() []IInstructionintContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IInstructionintContext); ok {
			len++
		}
	}

	tst := make([]IInstructionintContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IInstructionintContext); ok {
			tst[i] = t.(IInstructionintContext)
			i++
		}
	}

	return tst
}

func (s *BlockinternoContext) Instructionint(i int) IInstructionintContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IInstructionintContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IInstructionintContext)
}

func (s *BlockinternoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BlockinternoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BlockinternoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBlockinterno(s)
	}
}

func (s *BlockinternoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBlockinterno(s)
	}
}

func (p *SwiftGrammarParser) Blockinterno() (localctx IBlockinternoContext) {
	localctx = NewBlockinternoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, SwiftGrammarParserRULE_blockinterno)

	localctx.(*BlockinternoContext).blkint = []interface{}{}
	var listInt []IInstructionintContext

	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(73)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&274911464192) != 0) {
		{
			p.SetState(72)

			var _x = p.Instructionint()

			localctx.(*BlockinternoContext)._instructionint = _x
		}
		localctx.(*BlockinternoContext).insint = append(localctx.(*BlockinternoContext).insint, localctx.(*BlockinternoContext)._instructionint)

		p.SetState(75)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}

	listInt = localctx.(*BlockinternoContext).GetInsint()
	for _, e := range listInt {
		localctx.(*BlockinternoContext).blkint = append(localctx.(*BlockinternoContext).blkint, e.GetInsint())
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IInstructionintContext is an interface to support dynamic dispatch.
type IInstructionintContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printstmtint returns the _printstmtint rule contexts.
	Get_printstmtint() IPrintstmtintContext

	// Get_declavaribleint returns the _declavaribleint rule contexts.
	Get_declavaribleint() IDeclavaribleintContext

	// Get_declaconstanteint returns the _declaconstanteint rule contexts.
	Get_declaconstanteint() IDeclaconstanteintContext

	// Get_asignacionvariableint returns the _asignacionvariableint rule contexts.
	Get_asignacionvariableint() IAsignacionvariableintContext

	// Get_sentenciaifelse returns the _sentenciaifelse rule contexts.
	Get_sentenciaifelse() ISentenciaifelseContext

	// Set_printstmtint sets the _printstmtint rule contexts.
	Set_printstmtint(IPrintstmtintContext)

	// Set_declavaribleint sets the _declavaribleint rule contexts.
	Set_declavaribleint(IDeclavaribleintContext)

	// Set_declaconstanteint sets the _declaconstanteint rule contexts.
	Set_declaconstanteint(IDeclaconstanteintContext)

	// Set_asignacionvariableint sets the _asignacionvariableint rule contexts.
	Set_asignacionvariableint(IAsignacionvariableintContext)

	// Set_sentenciaifelse sets the _sentenciaifelse rule contexts.
	Set_sentenciaifelse(ISentenciaifelseContext)

	// GetInsint returns the insint attribute.
	GetInsint() interfaces.Instruction

	// SetInsint sets the insint attribute.
	SetInsint(interfaces.Instruction)

	// Getter signatures
	Printstmtint() IPrintstmtintContext
	PUNTOCOMA() antlr.TerminalNode
	Declavaribleint() IDeclavaribleintContext
	Declaconstanteint() IDeclaconstanteintContext
	Asignacionvariableint() IAsignacionvariableintContext
	Sentenciaifelse() ISentenciaifelseContext

	// IsInstructionintContext differentiates from other interfaces.
	IsInstructionintContext()
}

type InstructionintContext struct {
	antlr.BaseParserRuleContext
	parser                 antlr.Parser
	insint                 interfaces.Instruction
	_printstmtint          IPrintstmtintContext
	_declavaribleint       IDeclavaribleintContext
	_declaconstanteint     IDeclaconstanteintContext
	_asignacionvariableint IAsignacionvariableintContext
	_sentenciaifelse       ISentenciaifelseContext
}

func NewEmptyInstructionintContext() *InstructionintContext {
	var p = new(InstructionintContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_instructionint
	return p
}

func InitEmptyInstructionintContext(p *InstructionintContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_instructionint
}

func (*InstructionintContext) IsInstructionintContext() {}

func NewInstructionintContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionintContext {
	var p = new(InstructionintContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_instructionint

	return p
}

func (s *InstructionintContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionintContext) Get_printstmtint() IPrintstmtintContext { return s._printstmtint }

func (s *InstructionintContext) Get_declavaribleint() IDeclavaribleintContext {
	return s._declavaribleint
}

func (s *InstructionintContext) Get_declaconstanteint() IDeclaconstanteintContext {
	return s._declaconstanteint
}

func (s *InstructionintContext) Get_asignacionvariableint() IAsignacionvariableintContext {
	return s._asignacionvariableint
}

func (s *InstructionintContext) Get_sentenciaifelse() ISentenciaifelseContext {
	return s._sentenciaifelse
}

func (s *InstructionintContext) Set_printstmtint(v IPrintstmtintContext) { s._printstmtint = v }

func (s *InstructionintContext) Set_declavaribleint(v IDeclavaribleintContext) {
	s._declavaribleint = v
}

func (s *InstructionintContext) Set_declaconstanteint(v IDeclaconstanteintContext) {
	s._declaconstanteint = v
}

func (s *InstructionintContext) Set_asignacionvariableint(v IAsignacionvariableintContext) {
	s._asignacionvariableint = v
}

func (s *InstructionintContext) Set_sentenciaifelse(v ISentenciaifelseContext) {
	s._sentenciaifelse = v
}

func (s *InstructionintContext) GetInsint() interfaces.Instruction { return s.insint }

func (s *InstructionintContext) SetInsint(v interfaces.Instruction) { s.insint = v }

func (s *InstructionintContext) Printstmtint() IPrintstmtintContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IPrintstmtintContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IPrintstmtintContext)
}

func (s *InstructionintContext) PUNTOCOMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTOCOMA, 0)
}

func (s *InstructionintContext) Declavaribleint() IDeclavaribleintContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IDeclavaribleintContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IDeclavaribleintContext)
}

func (s *InstructionintContext) Declaconstanteint() IDeclaconstanteintContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IDeclaconstanteintContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IDeclaconstanteintContext)
}

func (s *InstructionintContext) Asignacionvariableint() IAsignacionvariableintContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IAsignacionvariableintContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IAsignacionvariableintContext)
}

func (s *InstructionintContext) Sentenciaifelse() ISentenciaifelseContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISentenciaifelseContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISentenciaifelseContext)
}

func (s *InstructionintContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionintContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstructionintContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterInstructionint(s)
	}
}

func (s *InstructionintContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitInstructionint(s)
	}
}

func (p *SwiftGrammarParser) Instructionint() (localctx IInstructionintContext) {
	localctx = NewInstructionintContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, SwiftGrammarParserRULE_instructionint)
	var _la int

	p.SetState(106)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserPRINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(79)

			var _x = p.Printstmtint()

			localctx.(*InstructionintContext)._printstmtint = _x
		}
		p.SetState(81)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(80)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_printstmtint().GetPrnt()

	case SwiftGrammarParserVAR:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(85)

			var _x = p.Declavaribleint()

			localctx.(*InstructionintContext)._declavaribleint = _x
		}
		p.SetState(87)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(86)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_declavaribleint().GetDecvbl()

	case SwiftGrammarParserLET:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(91)

			var _x = p.Declaconstanteint()

			localctx.(*InstructionintContext)._declaconstanteint = _x
		}
		p.SetState(93)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(92)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_declaconstanteint().GetDeccon()

	case SwiftGrammarParserID_VALIDO:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(97)

			var _x = p.Asignacionvariableint()

			localctx.(*InstructionintContext)._asignacionvariableint = _x
		}
		p.SetState(99)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(98)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_asignacionvariableint().GetAsgvbl()

	case SwiftGrammarParserIF:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(103)

			var _x = p.Sentenciaifelse()

			localctx.(*InstructionintContext)._sentenciaifelse = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_sentenciaifelse().GetMyIfElse()

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IPrintstmtContext is an interface to support dynamic dispatch.
type IPrintstmtContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PRINT returns the _PRINT token.
	Get_PRINT() antlr.Token

	// Set_PRINT sets the _PRINT token.
	Set_PRINT(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetPrnt returns the prnt attribute.
	GetPrnt() interfaces.Instruction

	// SetPrnt sets the prnt attribute.
	SetPrnt(interfaces.Instruction)

	// Getter signatures
	PRINT() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode

	// IsPrintstmtContext differentiates from other interfaces.
	IsPrintstmtContext()
}

type PrintstmtContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	prnt   interfaces.Instruction
	_PRINT antlr.Token
	_expr  IExprContext
}

func NewEmptyPrintstmtContext() *PrintstmtContext {
	var p = new(PrintstmtContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_printstmt
	return p
}

func InitEmptyPrintstmtContext(p *PrintstmtContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_printstmt
}

func (*PrintstmtContext) IsPrintstmtContext() {}

func NewPrintstmtContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintstmtContext {
	var p = new(PrintstmtContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_printstmt

	return p
}

func (s *PrintstmtContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintstmtContext) Get_PRINT() antlr.Token { return s._PRINT }

func (s *PrintstmtContext) Set_PRINT(v antlr.Token) { s._PRINT = v }

func (s *PrintstmtContext) Get_expr() IExprContext { return s._expr }

func (s *PrintstmtContext) Set_expr(v IExprContext) { s._expr = v }

func (s *PrintstmtContext) GetPrnt() interfaces.Instruction { return s.prnt }

func (s *PrintstmtContext) SetPrnt(v interfaces.Instruction) { s.prnt = v }

func (s *PrintstmtContext) PRINT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPRINT, 0)
}

func (s *PrintstmtContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *PrintstmtContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *PrintstmtContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *PrintstmtContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintstmtContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintstmtContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterPrintstmt(s)
	}
}

func (s *PrintstmtContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitPrintstmt(s)
	}
}

func (p *SwiftGrammarParser) Printstmt() (localctx IPrintstmtContext) {
	localctx = NewPrintstmtContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, SwiftGrammarParserRULE_printstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(108)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(109)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(110)

		var _x = p.expr(0)

		localctx.(*PrintstmtContext)._expr = _x
	}
	{
		p.SetState(111)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*PrintstmtContext).prnt = instructions.NewPrint((func() int {
		if localctx.(*PrintstmtContext).Get_PRINT() == nil {
			return 0
		} else {
			return localctx.(*PrintstmtContext).Get_PRINT().GetLine()
		}
	}()), (func() int {
		if localctx.(*PrintstmtContext).Get_PRINT() == nil {
			return 0
		} else {
			return localctx.(*PrintstmtContext).Get_PRINT().GetColumn()
		}
	}()), localctx.(*PrintstmtContext).Get_expr().GetE())

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IDeclavaribleContext is an interface to support dynamic dispatch.
type IDeclavaribleContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_VAR returns the _VAR token.
	Get_VAR() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_VAR sets the _VAR token.
	Set_VAR(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Get_tipodato returns the _tipodato rule contexts.
	Get_tipodato() ITipodatoContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_tipodato sets the _tipodato rule contexts.
	Set_tipodato(ITipodatoContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetDecvbl returns the decvbl attribute.
	GetDecvbl() interfaces.Instruction

	// SetDecvbl sets the decvbl attribute.
	SetDecvbl(interfaces.Instruction)

	// Getter signatures
	VAR() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Tipodato() ITipodatoContext
	IG() antlr.TerminalNode
	Expr() IExprContext
	CIERRE_INTE() antlr.TerminalNode

	// IsDeclavaribleContext differentiates from other interfaces.
	IsDeclavaribleContext()
}

type DeclavaribleContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	decvbl     interfaces.Instruction
	_VAR       antlr.Token
	_ID_VALIDO antlr.Token
	_tipodato  ITipodatoContext
	_expr      IExprContext
}

func NewEmptyDeclavaribleContext() *DeclavaribleContext {
	var p = new(DeclavaribleContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declavarible
	return p
}

func InitEmptyDeclavaribleContext(p *DeclavaribleContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declavarible
}

func (*DeclavaribleContext) IsDeclavaribleContext() {}

func NewDeclavaribleContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclavaribleContext {
	var p = new(DeclavaribleContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_declavarible

	return p
}

func (s *DeclavaribleContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclavaribleContext) Get_VAR() antlr.Token { return s._VAR }

func (s *DeclavaribleContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *DeclavaribleContext) Set_VAR(v antlr.Token) { s._VAR = v }

func (s *DeclavaribleContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *DeclavaribleContext) Get_tipodato() ITipodatoContext { return s._tipodato }

func (s *DeclavaribleContext) Get_expr() IExprContext { return s._expr }

func (s *DeclavaribleContext) Set_tipodato(v ITipodatoContext) { s._tipodato = v }

func (s *DeclavaribleContext) Set_expr(v IExprContext) { s._expr = v }

func (s *DeclavaribleContext) GetDecvbl() interfaces.Instruction { return s.decvbl }

func (s *DeclavaribleContext) SetDecvbl(v interfaces.Instruction) { s.decvbl = v }

func (s *DeclavaribleContext) VAR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserVAR, 0)
}

func (s *DeclavaribleContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *DeclavaribleContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *DeclavaribleContext) Tipodato() ITipodatoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ITipodatoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ITipodatoContext)
}

func (s *DeclavaribleContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *DeclavaribleContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *DeclavaribleContext) CIERRE_INTE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCIERRE_INTE, 0)
}

func (s *DeclavaribleContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclavaribleContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclavaribleContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterDeclavarible(s)
	}
}

func (s *DeclavaribleContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitDeclavarible(s)
	}
}

func (p *SwiftGrammarParser) Declavarible() (localctx IDeclavaribleContext) {
	localctx = NewDeclavaribleContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, SwiftGrammarParserRULE_declavarible)
	p.SetState(135)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 12, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(114)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(115)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(116)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(117)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleContext)._tipodato = _x
		}
		{
			p.SetState(118)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(119)

			var _x = p.expr(0)

			localctx.(*DeclavaribleContext)._expr = _x
		}
		localctx.(*DeclavaribleContext).decvbl = instructions.NewVariableDeclaration((func() int {
			if localctx.(*DeclavaribleContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclavaribleContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclavaribleContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclavaribleContext).Get_ID_VALIDO().GetText()
			}
		}()), "Global", localctx.(*DeclavaribleContext).Get_tipodato().GetTipo(), localctx.(*DeclavaribleContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(122)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(123)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(124)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(125)

			var _x = p.expr(0)

			localctx.(*DeclavaribleContext)._expr = _x
		}
		localctx.(*DeclavaribleContext).decvbl = instructions.NewVariableDeclaracionSinTipo((func() int {
			if localctx.(*DeclavaribleContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclavaribleContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclavaribleContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclavaribleContext).Get_ID_VALIDO().GetText()
			}
		}()), "Global", localctx.(*DeclavaribleContext).Get_expr().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(128)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(129)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(130)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(131)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleContext)._tipodato = _x
		}
		{
			p.SetState(132)
			p.Match(SwiftGrammarParserCIERRE_INTE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*DeclavaribleContext).decvbl = instructions.NewVariableDeclaracionSinExp((func() int {
			if localctx.(*DeclavaribleContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclavaribleContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclavaribleContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclavaribleContext).Get_ID_VALIDO().GetText()
			}
		}()), "Global", localctx.(*DeclavaribleContext).Get_tipodato().GetTipo())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IDeclaconstanteContext is an interface to support dynamic dispatch.
type IDeclaconstanteContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_LET returns the _LET token.
	Get_LET() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_LET sets the _LET token.
	Set_LET(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Get_tipodato returns the _tipodato rule contexts.
	Get_tipodato() ITipodatoContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_tipodato sets the _tipodato rule contexts.
	Set_tipodato(ITipodatoContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetDeccon returns the deccon attribute.
	GetDeccon() interfaces.Instruction

	// SetDeccon sets the deccon attribute.
	SetDeccon(interfaces.Instruction)

	// Getter signatures
	LET() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Tipodato() ITipodatoContext
	IG() antlr.TerminalNode
	Expr() IExprContext

	// IsDeclaconstanteContext differentiates from other interfaces.
	IsDeclaconstanteContext()
}

type DeclaconstanteContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	deccon     interfaces.Instruction
	_LET       antlr.Token
	_ID_VALIDO antlr.Token
	_tipodato  ITipodatoContext
	_expr      IExprContext
}

func NewEmptyDeclaconstanteContext() *DeclaconstanteContext {
	var p = new(DeclaconstanteContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declaconstante
	return p
}

func InitEmptyDeclaconstanteContext(p *DeclaconstanteContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declaconstante
}

func (*DeclaconstanteContext) IsDeclaconstanteContext() {}

func NewDeclaconstanteContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclaconstanteContext {
	var p = new(DeclaconstanteContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_declaconstante

	return p
}

func (s *DeclaconstanteContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclaconstanteContext) Get_LET() antlr.Token { return s._LET }

func (s *DeclaconstanteContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *DeclaconstanteContext) Set_LET(v antlr.Token) { s._LET = v }

func (s *DeclaconstanteContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *DeclaconstanteContext) Get_tipodato() ITipodatoContext { return s._tipodato }

func (s *DeclaconstanteContext) Get_expr() IExprContext { return s._expr }

func (s *DeclaconstanteContext) Set_tipodato(v ITipodatoContext) { s._tipodato = v }

func (s *DeclaconstanteContext) Set_expr(v IExprContext) { s._expr = v }

func (s *DeclaconstanteContext) GetDeccon() interfaces.Instruction { return s.deccon }

func (s *DeclaconstanteContext) SetDeccon(v interfaces.Instruction) { s.deccon = v }

func (s *DeclaconstanteContext) LET() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLET, 0)
}

func (s *DeclaconstanteContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *DeclaconstanteContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *DeclaconstanteContext) Tipodato() ITipodatoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ITipodatoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ITipodatoContext)
}

func (s *DeclaconstanteContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *DeclaconstanteContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *DeclaconstanteContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclaconstanteContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclaconstanteContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterDeclaconstante(s)
	}
}

func (s *DeclaconstanteContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitDeclaconstante(s)
	}
}

func (p *SwiftGrammarParser) Declaconstante() (localctx IDeclaconstanteContext) {
	localctx = NewDeclaconstanteContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, SwiftGrammarParserRULE_declaconstante)
	p.SetState(151)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 13, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(137)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(138)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(139)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(140)

			var _x = p.Tipodato()

			localctx.(*DeclaconstanteContext)._tipodato = _x
		}
		{
			p.SetState(141)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(142)

			var _x = p.expr(0)

			localctx.(*DeclaconstanteContext)._expr = _x
		}
		localctx.(*DeclaconstanteContext).deccon = instructions.NewConstanteDeclaration((func() int {
			if localctx.(*DeclaconstanteContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteContext).Get_LET().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclaconstanteContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteContext).Get_LET().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclaconstanteContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclaconstanteContext).Get_ID_VALIDO().GetText()
			}
		}()), "Global", localctx.(*DeclaconstanteContext).Get_tipodato().GetTipo(), localctx.(*DeclaconstanteContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(145)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(146)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(147)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(148)

			var _x = p.expr(0)

			localctx.(*DeclaconstanteContext)._expr = _x
		}
		localctx.(*DeclaconstanteContext).deccon = instructions.NewConstanteDeclaracionSinTipo((func() int {
			if localctx.(*DeclaconstanteContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteContext).Get_LET().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclaconstanteContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteContext).Get_LET().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclaconstanteContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclaconstanteContext).Get_ID_VALIDO().GetText()
			}
		}()), "Global", localctx.(*DeclaconstanteContext).Get_expr().GetE())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IAsignacionvariableContext is an interface to support dynamic dispatch.
type IAsignacionvariableContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetAsgvbl returns the asgvbl attribute.
	GetAsgvbl() interfaces.Instruction

	// SetAsgvbl sets the asgvbl attribute.
	SetAsgvbl(interfaces.Instruction)

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	IG() antlr.TerminalNode
	Expr() IExprContext
	SUMA() antlr.TerminalNode
	RESTA() antlr.TerminalNode

	// IsAsignacionvariableContext differentiates from other interfaces.
	IsAsignacionvariableContext()
}

type AsignacionvariableContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	asgvbl     interfaces.Instruction
	_ID_VALIDO antlr.Token
	_expr      IExprContext
}

func NewEmptyAsignacionvariableContext() *AsignacionvariableContext {
	var p = new(AsignacionvariableContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_asignacionvariable
	return p
}

func InitEmptyAsignacionvariableContext(p *AsignacionvariableContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_asignacionvariable
}

func (*AsignacionvariableContext) IsAsignacionvariableContext() {}

func NewAsignacionvariableContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AsignacionvariableContext {
	var p = new(AsignacionvariableContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_asignacionvariable

	return p
}

func (s *AsignacionvariableContext) GetParser() antlr.Parser { return s.parser }

func (s *AsignacionvariableContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *AsignacionvariableContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *AsignacionvariableContext) Get_expr() IExprContext { return s._expr }

func (s *AsignacionvariableContext) Set_expr(v IExprContext) { s._expr = v }

func (s *AsignacionvariableContext) GetAsgvbl() interfaces.Instruction { return s.asgvbl }

func (s *AsignacionvariableContext) SetAsgvbl(v interfaces.Instruction) { s.asgvbl = v }

func (s *AsignacionvariableContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *AsignacionvariableContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *AsignacionvariableContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *AsignacionvariableContext) SUMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUMA, 0)
}

func (s *AsignacionvariableContext) RESTA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserRESTA, 0)
}

func (s *AsignacionvariableContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AsignacionvariableContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AsignacionvariableContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterAsignacionvariable(s)
	}
}

func (s *AsignacionvariableContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitAsignacionvariable(s)
	}
}

func (p *SwiftGrammarParser) Asignacionvariable() (localctx IAsignacionvariableContext) {
	localctx = NewAsignacionvariableContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, SwiftGrammarParserRULE_asignacionvariable)
	p.SetState(168)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 14, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(153)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(154)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(155)

			var _x = p.expr(0)

			localctx.(*AsignacionvariableContext)._expr = _x
		}
		localctx.(*AsignacionvariableContext).asgvbl = instructions.NewAsignacionVariable((func() int {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*AsignacionvariableContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(158)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(159)
			p.Match(SwiftGrammarParserSUMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(160)

			var _x = p.expr(0)

			localctx.(*AsignacionvariableContext)._expr = _x
		}
		localctx.(*AsignacionvariableContext).asgvbl = instructions.NewAsignacionSuma((func() int {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*AsignacionvariableContext).Get_expr().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(163)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(164)
			p.Match(SwiftGrammarParserRESTA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(165)

			var _x = p.expr(0)

			localctx.(*AsignacionvariableContext)._expr = _x
		}
		localctx.(*AsignacionvariableContext).asgvbl = instructions.NewAsignacionResta((func() int {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*AsignacionvariableContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*AsignacionvariableContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*AsignacionvariableContext).Get_expr().GetE())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IPrintstmtintContext is an interface to support dynamic dispatch.
type IPrintstmtintContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PRINT returns the _PRINT token.
	Get_PRINT() antlr.Token

	// Set_PRINT sets the _PRINT token.
	Set_PRINT(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetPrnt returns the prnt attribute.
	GetPrnt() interfaces.Instruction

	// SetPrnt sets the prnt attribute.
	SetPrnt(interfaces.Instruction)

	// Getter signatures
	PRINT() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode

	// IsPrintstmtintContext differentiates from other interfaces.
	IsPrintstmtintContext()
}

type PrintstmtintContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	prnt   interfaces.Instruction
	_PRINT antlr.Token
	_expr  IExprContext
}

func NewEmptyPrintstmtintContext() *PrintstmtintContext {
	var p = new(PrintstmtintContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_printstmtint
	return p
}

func InitEmptyPrintstmtintContext(p *PrintstmtintContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_printstmtint
}

func (*PrintstmtintContext) IsPrintstmtintContext() {}

func NewPrintstmtintContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintstmtintContext {
	var p = new(PrintstmtintContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_printstmtint

	return p
}

func (s *PrintstmtintContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintstmtintContext) Get_PRINT() antlr.Token { return s._PRINT }

func (s *PrintstmtintContext) Set_PRINT(v antlr.Token) { s._PRINT = v }

func (s *PrintstmtintContext) Get_expr() IExprContext { return s._expr }

func (s *PrintstmtintContext) Set_expr(v IExprContext) { s._expr = v }

func (s *PrintstmtintContext) GetPrnt() interfaces.Instruction { return s.prnt }

func (s *PrintstmtintContext) SetPrnt(v interfaces.Instruction) { s.prnt = v }

func (s *PrintstmtintContext) PRINT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPRINT, 0)
}

func (s *PrintstmtintContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *PrintstmtintContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *PrintstmtintContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *PrintstmtintContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintstmtintContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintstmtintContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterPrintstmtint(s)
	}
}

func (s *PrintstmtintContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitPrintstmtint(s)
	}
}

func (p *SwiftGrammarParser) Printstmtint() (localctx IPrintstmtintContext) {
	localctx = NewPrintstmtintContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, SwiftGrammarParserRULE_printstmtint)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(170)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtintContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(171)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(172)

		var _x = p.expr(0)

		localctx.(*PrintstmtintContext)._expr = _x
	}
	{
		p.SetState(173)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*PrintstmtintContext).prnt = instructions.NewPrint((func() int {
		if localctx.(*PrintstmtintContext).Get_PRINT() == nil {
			return 0
		} else {
			return localctx.(*PrintstmtintContext).Get_PRINT().GetLine()
		}
	}()), (func() int {
		if localctx.(*PrintstmtintContext).Get_PRINT() == nil {
			return 0
		} else {
			return localctx.(*PrintstmtintContext).Get_PRINT().GetColumn()
		}
	}()), localctx.(*PrintstmtintContext).Get_expr().GetE())

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IDeclavaribleintContext is an interface to support dynamic dispatch.
type IDeclavaribleintContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_VAR returns the _VAR token.
	Get_VAR() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_VAR sets the _VAR token.
	Set_VAR(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Get_tipodato returns the _tipodato rule contexts.
	Get_tipodato() ITipodatoContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_tipodato sets the _tipodato rule contexts.
	Set_tipodato(ITipodatoContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetDecvbl returns the decvbl attribute.
	GetDecvbl() interfaces.Instruction

	// SetDecvbl sets the decvbl attribute.
	SetDecvbl(interfaces.Instruction)

	// Getter signatures
	VAR() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Tipodato() ITipodatoContext
	IG() antlr.TerminalNode
	Expr() IExprContext
	CIERRE_INTE() antlr.TerminalNode

	// IsDeclavaribleintContext differentiates from other interfaces.
	IsDeclavaribleintContext()
}

type DeclavaribleintContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	decvbl     interfaces.Instruction
	_VAR       antlr.Token
	_ID_VALIDO antlr.Token
	_tipodato  ITipodatoContext
	_expr      IExprContext
}

func NewEmptyDeclavaribleintContext() *DeclavaribleintContext {
	var p = new(DeclavaribleintContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declavaribleint
	return p
}

func InitEmptyDeclavaribleintContext(p *DeclavaribleintContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declavaribleint
}

func (*DeclavaribleintContext) IsDeclavaribleintContext() {}

func NewDeclavaribleintContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclavaribleintContext {
	var p = new(DeclavaribleintContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_declavaribleint

	return p
}

func (s *DeclavaribleintContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclavaribleintContext) Get_VAR() antlr.Token { return s._VAR }

func (s *DeclavaribleintContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *DeclavaribleintContext) Set_VAR(v antlr.Token) { s._VAR = v }

func (s *DeclavaribleintContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *DeclavaribleintContext) Get_tipodato() ITipodatoContext { return s._tipodato }

func (s *DeclavaribleintContext) Get_expr() IExprContext { return s._expr }

func (s *DeclavaribleintContext) Set_tipodato(v ITipodatoContext) { s._tipodato = v }

func (s *DeclavaribleintContext) Set_expr(v IExprContext) { s._expr = v }

func (s *DeclavaribleintContext) GetDecvbl() interfaces.Instruction { return s.decvbl }

func (s *DeclavaribleintContext) SetDecvbl(v interfaces.Instruction) { s.decvbl = v }

func (s *DeclavaribleintContext) VAR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserVAR, 0)
}

func (s *DeclavaribleintContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *DeclavaribleintContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *DeclavaribleintContext) Tipodato() ITipodatoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ITipodatoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ITipodatoContext)
}

func (s *DeclavaribleintContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *DeclavaribleintContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *DeclavaribleintContext) CIERRE_INTE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCIERRE_INTE, 0)
}

func (s *DeclavaribleintContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclavaribleintContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclavaribleintContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterDeclavaribleint(s)
	}
}

func (s *DeclavaribleintContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitDeclavaribleint(s)
	}
}

func (p *SwiftGrammarParser) Declavaribleint() (localctx IDeclavaribleintContext) {
	localctx = NewDeclavaribleintContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, SwiftGrammarParserRULE_declavaribleint)
	p.SetState(197)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 15, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(176)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(177)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(178)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(179)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleintContext)._tipodato = _x
		}
		{
			p.SetState(180)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(181)

			var _x = p.expr(0)

			localctx.(*DeclavaribleintContext)._expr = _x
		}
		localctx.(*DeclavaribleintContext).decvbl = instructions.NewVariableDeclaration((func() int {
			if localctx.(*DeclavaribleintContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleintContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclavaribleintContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleintContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclavaribleintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclavaribleintContext).Get_ID_VALIDO().GetText()
			}
		}()), "Local", localctx.(*DeclavaribleintContext).Get_tipodato().GetTipo(), localctx.(*DeclavaribleintContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(184)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(185)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(186)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(187)

			var _x = p.expr(0)

			localctx.(*DeclavaribleintContext)._expr = _x
		}
		localctx.(*DeclavaribleintContext).decvbl = instructions.NewVariableDeclaracionSinTipo((func() int {
			if localctx.(*DeclavaribleintContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleintContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclavaribleintContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleintContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclavaribleintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclavaribleintContext).Get_ID_VALIDO().GetText()
			}
		}()), "Local", localctx.(*DeclavaribleintContext).Get_expr().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(190)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(191)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(192)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(193)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleintContext)._tipodato = _x
		}
		{
			p.SetState(194)
			p.Match(SwiftGrammarParserCIERRE_INTE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*DeclavaribleintContext).decvbl = instructions.NewVariableDeclaracionSinExp((func() int {
			if localctx.(*DeclavaribleintContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleintContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclavaribleintContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*DeclavaribleintContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclavaribleintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclavaribleintContext).Get_ID_VALIDO().GetText()
			}
		}()), "Local", localctx.(*DeclavaribleintContext).Get_tipodato().GetTipo())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IDeclaconstanteintContext is an interface to support dynamic dispatch.
type IDeclaconstanteintContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_LET returns the _LET token.
	Get_LET() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_LET sets the _LET token.
	Set_LET(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Get_tipodato returns the _tipodato rule contexts.
	Get_tipodato() ITipodatoContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_tipodato sets the _tipodato rule contexts.
	Set_tipodato(ITipodatoContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetDeccon returns the deccon attribute.
	GetDeccon() interfaces.Instruction

	// SetDeccon sets the deccon attribute.
	SetDeccon(interfaces.Instruction)

	// Getter signatures
	LET() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Tipodato() ITipodatoContext
	IG() antlr.TerminalNode
	Expr() IExprContext

	// IsDeclaconstanteintContext differentiates from other interfaces.
	IsDeclaconstanteintContext()
}

type DeclaconstanteintContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	deccon     interfaces.Instruction
	_LET       antlr.Token
	_ID_VALIDO antlr.Token
	_tipodato  ITipodatoContext
	_expr      IExprContext
}

func NewEmptyDeclaconstanteintContext() *DeclaconstanteintContext {
	var p = new(DeclaconstanteintContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declaconstanteint
	return p
}

func InitEmptyDeclaconstanteintContext(p *DeclaconstanteintContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_declaconstanteint
}

func (*DeclaconstanteintContext) IsDeclaconstanteintContext() {}

func NewDeclaconstanteintContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclaconstanteintContext {
	var p = new(DeclaconstanteintContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_declaconstanteint

	return p
}

func (s *DeclaconstanteintContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclaconstanteintContext) Get_LET() antlr.Token { return s._LET }

func (s *DeclaconstanteintContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *DeclaconstanteintContext) Set_LET(v antlr.Token) { s._LET = v }

func (s *DeclaconstanteintContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *DeclaconstanteintContext) Get_tipodato() ITipodatoContext { return s._tipodato }

func (s *DeclaconstanteintContext) Get_expr() IExprContext { return s._expr }

func (s *DeclaconstanteintContext) Set_tipodato(v ITipodatoContext) { s._tipodato = v }

func (s *DeclaconstanteintContext) Set_expr(v IExprContext) { s._expr = v }

func (s *DeclaconstanteintContext) GetDeccon() interfaces.Instruction { return s.deccon }

func (s *DeclaconstanteintContext) SetDeccon(v interfaces.Instruction) { s.deccon = v }

func (s *DeclaconstanteintContext) LET() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLET, 0)
}

func (s *DeclaconstanteintContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *DeclaconstanteintContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *DeclaconstanteintContext) Tipodato() ITipodatoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ITipodatoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ITipodatoContext)
}

func (s *DeclaconstanteintContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *DeclaconstanteintContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *DeclaconstanteintContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclaconstanteintContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclaconstanteintContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterDeclaconstanteint(s)
	}
}

func (s *DeclaconstanteintContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitDeclaconstanteint(s)
	}
}

func (p *SwiftGrammarParser) Declaconstanteint() (localctx IDeclaconstanteintContext) {
	localctx = NewDeclaconstanteintContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, SwiftGrammarParserRULE_declaconstanteint)
	p.SetState(213)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 16, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(199)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteintContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(200)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(201)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(202)

			var _x = p.Tipodato()

			localctx.(*DeclaconstanteintContext)._tipodato = _x
		}
		{
			p.SetState(203)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(204)

			var _x = p.expr(0)

			localctx.(*DeclaconstanteintContext)._expr = _x
		}
		localctx.(*DeclaconstanteintContext).deccon = instructions.NewConstanteDeclaration((func() int {
			if localctx.(*DeclaconstanteintContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteintContext).Get_LET().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclaconstanteintContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteintContext).Get_LET().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclaconstanteintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclaconstanteintContext).Get_ID_VALIDO().GetText()
			}
		}()), "Local", localctx.(*DeclaconstanteintContext).Get_tipodato().GetTipo(), localctx.(*DeclaconstanteintContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(207)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteintContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(208)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(209)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(210)

			var _x = p.expr(0)

			localctx.(*DeclaconstanteintContext)._expr = _x
		}
		localctx.(*DeclaconstanteintContext).deccon = instructions.NewConstanteDeclaracionSinTipo((func() int {
			if localctx.(*DeclaconstanteintContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteintContext).Get_LET().GetLine()
			}
		}()), (func() int {
			if localctx.(*DeclaconstanteintContext).Get_LET() == nil {
				return 0
			} else {
				return localctx.(*DeclaconstanteintContext).Get_LET().GetColumn()
			}
		}()), (func() string {
			if localctx.(*DeclaconstanteintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*DeclaconstanteintContext).Get_ID_VALIDO().GetText()
			}
		}()), "Local", localctx.(*DeclaconstanteintContext).Get_expr().GetE())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IAsignacionvariableintContext is an interface to support dynamic dispatch.
type IAsignacionvariableintContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetAsgvbl returns the asgvbl attribute.
	GetAsgvbl() interfaces.Instruction

	// SetAsgvbl sets the asgvbl attribute.
	SetAsgvbl(interfaces.Instruction)

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	IG() antlr.TerminalNode
	Expr() IExprContext
	SUMA() antlr.TerminalNode
	RESTA() antlr.TerminalNode

	// IsAsignacionvariableintContext differentiates from other interfaces.
	IsAsignacionvariableintContext()
}

type AsignacionvariableintContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	asgvbl     interfaces.Instruction
	_ID_VALIDO antlr.Token
	_expr      IExprContext
}

func NewEmptyAsignacionvariableintContext() *AsignacionvariableintContext {
	var p = new(AsignacionvariableintContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_asignacionvariableint
	return p
}

func InitEmptyAsignacionvariableintContext(p *AsignacionvariableintContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_asignacionvariableint
}

func (*AsignacionvariableintContext) IsAsignacionvariableintContext() {}

func NewAsignacionvariableintContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AsignacionvariableintContext {
	var p = new(AsignacionvariableintContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_asignacionvariableint

	return p
}

func (s *AsignacionvariableintContext) GetParser() antlr.Parser { return s.parser }

func (s *AsignacionvariableintContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *AsignacionvariableintContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *AsignacionvariableintContext) Get_expr() IExprContext { return s._expr }

func (s *AsignacionvariableintContext) Set_expr(v IExprContext) { s._expr = v }

func (s *AsignacionvariableintContext) GetAsgvbl() interfaces.Instruction { return s.asgvbl }

func (s *AsignacionvariableintContext) SetAsgvbl(v interfaces.Instruction) { s.asgvbl = v }

func (s *AsignacionvariableintContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *AsignacionvariableintContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *AsignacionvariableintContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *AsignacionvariableintContext) SUMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUMA, 0)
}

func (s *AsignacionvariableintContext) RESTA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserRESTA, 0)
}

func (s *AsignacionvariableintContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AsignacionvariableintContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AsignacionvariableintContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterAsignacionvariableint(s)
	}
}

func (s *AsignacionvariableintContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitAsignacionvariableint(s)
	}
}

func (p *SwiftGrammarParser) Asignacionvariableint() (localctx IAsignacionvariableintContext) {
	localctx = NewAsignacionvariableintContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, SwiftGrammarParserRULE_asignacionvariableint)
	p.SetState(230)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 17, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(215)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(216)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(217)

			var _x = p.expr(0)

			localctx.(*AsignacionvariableintContext)._expr = _x
		}
		localctx.(*AsignacionvariableintContext).asgvbl = instructions.NewAsignacionVariable((func() int {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*AsignacionvariableintContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(220)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(221)
			p.Match(SwiftGrammarParserSUMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(222)

			var _x = p.expr(0)

			localctx.(*AsignacionvariableintContext)._expr = _x
		}
		localctx.(*AsignacionvariableintContext).asgvbl = instructions.NewAsignacionSuma((func() int {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*AsignacionvariableintContext).Get_expr().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(225)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(226)
			p.Match(SwiftGrammarParserRESTA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(227)

			var _x = p.expr(0)

			localctx.(*AsignacionvariableintContext)._expr = _x
		}
		localctx.(*AsignacionvariableintContext).asgvbl = instructions.NewAsignacionResta((func() int {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*AsignacionvariableintContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*AsignacionvariableintContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*AsignacionvariableintContext).Get_expr().GetE())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ITipodatoContext is an interface to support dynamic dispatch.
type ITipodatoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTipo returns the tipo attribute.
	GetTipo() environment.TipoExpresion

	// SetTipo sets the tipo attribute.
	SetTipo(environment.TipoExpresion)

	// Getter signatures
	INT() antlr.TerminalNode
	FLOAT() antlr.TerminalNode
	STRING() antlr.TerminalNode
	BOOL() antlr.TerminalNode
	CHARACT() antlr.TerminalNode

	// IsTipodatoContext differentiates from other interfaces.
	IsTipodatoContext()
}

type TipodatoContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	tipo   environment.TipoExpresion
}

func NewEmptyTipodatoContext() *TipodatoContext {
	var p = new(TipodatoContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_tipodato
	return p
}

func InitEmptyTipodatoContext(p *TipodatoContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_tipodato
}

func (*TipodatoContext) IsTipodatoContext() {}

func NewTipodatoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TipodatoContext {
	var p = new(TipodatoContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_tipodato

	return p
}

func (s *TipodatoContext) GetParser() antlr.Parser { return s.parser }

func (s *TipodatoContext) GetTipo() environment.TipoExpresion { return s.tipo }

func (s *TipodatoContext) SetTipo(v environment.TipoExpresion) { s.tipo = v }

func (s *TipodatoContext) INT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINT, 0)
}

func (s *TipodatoContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFLOAT, 0)
}

func (s *TipodatoContext) STRING() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSTRING, 0)
}

func (s *TipodatoContext) BOOL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserBOOL, 0)
}

func (s *TipodatoContext) CHARACT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCHARACT, 0)
}

func (s *TipodatoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TipodatoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TipodatoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterTipodato(s)
	}
}

func (s *TipodatoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitTipodato(s)
	}
}

func (p *SwiftGrammarParser) Tipodato() (localctx ITipodatoContext) {
	localctx = NewTipodatoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, SwiftGrammarParserRULE_tipodato)
	p.SetState(242)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(232)
			p.Match(SwiftGrammarParserINT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TipodatoContext).tipo = environment.INTEGER

	case SwiftGrammarParserFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(234)
			p.Match(SwiftGrammarParserFLOAT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TipodatoContext).tipo = environment.FLOAT

	case SwiftGrammarParserSTRING:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(236)
			p.Match(SwiftGrammarParserSTRING)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TipodatoContext).tipo = environment.STRING

	case SwiftGrammarParserBOOL:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(238)
			p.Match(SwiftGrammarParserBOOL)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TipodatoContext).tipo = environment.BOOLEAN

	case SwiftGrammarParserCHARACT:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(240)
			p.Match(SwiftGrammarParserCHARACT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TipodatoContext).tipo = environment.CHARACTER

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IExprContext is an interface to support dynamic dispatch.
type IExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_CADENA returns the _CADENA token.
	Get_CADENA() antlr.Token

	// Get_TRU returns the _TRU token.
	Get_TRU() antlr.Token

	// Get_FAL returns the _FAL token.
	Get_FAL() antlr.Token

	// Get_CHARACTER returns the _CHARACTER token.
	Get_CHARACTER() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Get_NULO returns the _NULO token.
	Get_NULO() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_CADENA sets the _CADENA token.
	Set_CADENA(antlr.Token)

	// Set_TRU sets the _TRU token.
	Set_TRU(antlr.Token)

	// Set_FAL sets the _FAL token.
	Set_FAL(antlr.Token)

	// Set_CHARACTER sets the _CHARACTER token.
	Set_CHARACTER(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Set_NULO sets the _NULO token.
	Set_NULO(antlr.Token)

	// GetLeft returns the left rule contexts.
	GetLeft() IExprContext

	// GetRight returns the right rule contexts.
	GetRight() IExprContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// SetLeft sets the left rule contexts.
	SetLeft(IExprContext)

	// SetRight sets the right rule contexts.
	SetRight(IExprContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetE returns the e attribute.
	GetE() interfaces.Expression

	// SetE sets the e attribute.
	SetE(interfaces.Expression)

	// Getter signatures
	NOT() antlr.TerminalNode
	AllExpr() []IExprContext
	Expr(i int) IExprContext
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode
	NUMBER() antlr.TerminalNode
	CADENA() antlr.TerminalNode
	TRU() antlr.TerminalNode
	FAL() antlr.TerminalNode
	CHARACTER() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	NULO() antlr.TerminalNode
	MUL() antlr.TerminalNode
	DIV() antlr.TerminalNode
	ADD() antlr.TerminalNode
	SUB() antlr.TerminalNode
	MAY_IG() antlr.TerminalNode
	MAYOR() antlr.TerminalNode
	MEN_IG() antlr.TerminalNode
	MENOR() antlr.TerminalNode
	IG_IG() antlr.TerminalNode
	DIF() antlr.TerminalNode
	AND() antlr.TerminalNode
	OR() antlr.TerminalNode
	MODULO() antlr.TerminalNode

	// IsExprContext differentiates from other interfaces.
	IsExprContext()
}

type ExprContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	e          interfaces.Expression
	left       IExprContext
	op         antlr.Token
	right      IExprContext
	_expr      IExprContext
	_NUMBER    antlr.Token
	_CADENA    antlr.Token
	_TRU       antlr.Token
	_FAL       antlr.Token
	_CHARACTER antlr.Token
	_ID_VALIDO antlr.Token
	_NULO      antlr.Token
}

func NewEmptyExprContext() *ExprContext {
	var p = new(ExprContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_expr
	return p
}

func InitEmptyExprContext(p *ExprContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_expr
}

func (*ExprContext) IsExprContext() {}

func NewExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExprContext {
	var p = new(ExprContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_expr

	return p
}

func (s *ExprContext) GetParser() antlr.Parser { return s.parser }

func (s *ExprContext) GetOp() antlr.Token { return s.op }

func (s *ExprContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *ExprContext) Get_CADENA() antlr.Token { return s._CADENA }

func (s *ExprContext) Get_TRU() antlr.Token { return s._TRU }

func (s *ExprContext) Get_FAL() antlr.Token { return s._FAL }

func (s *ExprContext) Get_CHARACTER() antlr.Token { return s._CHARACTER }

func (s *ExprContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *ExprContext) Get_NULO() antlr.Token { return s._NULO }

func (s *ExprContext) SetOp(v antlr.Token) { s.op = v }

func (s *ExprContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *ExprContext) Set_CADENA(v antlr.Token) { s._CADENA = v }

func (s *ExprContext) Set_TRU(v antlr.Token) { s._TRU = v }

func (s *ExprContext) Set_FAL(v antlr.Token) { s._FAL = v }

func (s *ExprContext) Set_CHARACTER(v antlr.Token) { s._CHARACTER = v }

func (s *ExprContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *ExprContext) Set_NULO(v antlr.Token) { s._NULO = v }

func (s *ExprContext) GetLeft() IExprContext { return s.left }

func (s *ExprContext) GetRight() IExprContext { return s.right }

func (s *ExprContext) Get_expr() IExprContext { return s._expr }

func (s *ExprContext) SetLeft(v IExprContext) { s.left = v }

func (s *ExprContext) SetRight(v IExprContext) { s.right = v }

func (s *ExprContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ExprContext) GetE() interfaces.Expression { return s.e }

func (s *ExprContext) SetE(v interfaces.Expression) { s.e = v }

func (s *ExprContext) NOT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserNOT, 0)
}

func (s *ExprContext) AllExpr() []IExprContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IExprContext); ok {
			len++
		}
	}

	tst := make([]IExprContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IExprContext); ok {
			tst[i] = t.(IExprContext)
			i++
		}
	}

	return tst
}

func (s *ExprContext) Expr(i int) IExprContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *ExprContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *ExprContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *ExprContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserNUMBER, 0)
}

func (s *ExprContext) CADENA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCADENA, 0)
}

func (s *ExprContext) TRU() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserTRU, 0)
}

func (s *ExprContext) FAL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFAL, 0)
}

func (s *ExprContext) CHARACTER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCHARACTER, 0)
}

func (s *ExprContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *ExprContext) NULO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserNULO, 0)
}

func (s *ExprContext) MUL() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMUL, 0)
}

func (s *ExprContext) DIV() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDIV, 0)
}

func (s *ExprContext) ADD() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserADD, 0)
}

func (s *ExprContext) SUB() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUB, 0)
}

func (s *ExprContext) MAY_IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMAY_IG, 0)
}

func (s *ExprContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMAYOR, 0)
}

func (s *ExprContext) MEN_IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMEN_IG, 0)
}

func (s *ExprContext) MENOR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMENOR, 0)
}

func (s *ExprContext) IG_IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG_IG, 0)
}

func (s *ExprContext) DIF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDIF, 0)
}

func (s *ExprContext) AND() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserAND, 0)
}

func (s *ExprContext) OR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserOR, 0)
}

func (s *ExprContext) MODULO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMODULO, 0)
}

func (s *ExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterExpr(s)
	}
}

func (s *ExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitExpr(s)
	}
}

func (p *SwiftGrammarParser) Expr() (localctx IExprContext) {
	return p.expr(0)
}

func (p *SwiftGrammarParser) expr(_p int) (localctx IExprContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewExprContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExprContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 28
	p.EnterRecursionRule(localctx, 28, SwiftGrammarParserRULE_expr, _p)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(268)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserNOT:
		{
			p.SetState(245)

			var _m = p.Match(SwiftGrammarParserNOT)

			localctx.(*ExprContext).op = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(246)

			var _x = p.expr(17)

			localctx.(*ExprContext).right = _x
			localctx.(*ExprContext)._expr = _x
		}
		localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
			if localctx.(*ExprContext).GetRight() == nil {
				return nil
			} else {
				return localctx.(*ExprContext).GetRight().GetStart()
			}
		}()).GetLine(), (func() antlr.Token {
			if localctx.(*ExprContext).GetRight() == nil {
				return nil
			} else {
				return localctx.(*ExprContext).GetRight().GetStart()
			}
		}()).GetColumn(), localctx.(*ExprContext).GetRight().GetE(), (func() string {
			if localctx.(*ExprContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).GetOp().GetText()
			}
		}()), localctx.(*ExprContext).GetRight().GetE())

	case SwiftGrammarParserPARIZQ:
		{
			p.SetState(249)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(250)

			var _x = p.expr(0)

			localctx.(*ExprContext)._expr = _x
		}
		{
			p.SetState(251)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_expr().GetE()

	case SwiftGrammarParserNUMBER:
		{
			p.SetState(254)

			var _m = p.Match(SwiftGrammarParserNUMBER)

			localctx.(*ExprContext)._NUMBER = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		if strings.Contains((func() string {
			if localctx.(*ExprContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_NUMBER().GetText()
			}
		}()), ".") {
			num, err := strconv.ParseFloat((func() string {
				if localctx.(*ExprContext).Get_NUMBER() == nil {
					return ""
				} else {
					return localctx.(*ExprContext).Get_NUMBER().GetText()
				}
			}()), 64)
			if err != nil {
				fmt.Println(err)
			}
			num2 := fmt.Sprintf("%.6f", num)
			num3, err := strconv.ParseFloat(num2, 64)
			if err != nil {
				fmt.Println(err)
			}
			localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
				if localctx.(*ExprContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*ExprContext).Get_NUMBER().GetLine()
				}
			}()), (func() int {
				if localctx.(*ExprContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*ExprContext).Get_NUMBER().GetColumn()
				}
			}()), num3, environment.FLOAT)
		} else {
			num, err := strconv.Atoi((func() string {
				if localctx.(*ExprContext).Get_NUMBER() == nil {
					return ""
				} else {
					return localctx.(*ExprContext).Get_NUMBER().GetText()
				}
			}()))
			if err != nil {
				fmt.Println(err)
			}
			localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
				if localctx.(*ExprContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*ExprContext).Get_NUMBER().GetLine()
				}
			}()), (func() int {
				if localctx.(*ExprContext).Get_NUMBER() == nil {
					return 0
				} else {
					return localctx.(*ExprContext).Get_NUMBER().GetColumn()
				}
			}()), num, environment.INTEGER)
		}

	case SwiftGrammarParserCADENA:
		{
			p.SetState(256)

			var _m = p.Match(SwiftGrammarParserCADENA)

			localctx.(*ExprContext)._CADENA = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		str := (func() string {
			if localctx.(*ExprContext).Get_CADENA() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_CADENA().GetText()
			}
		}())
		localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
			if localctx.(*ExprContext).Get_CADENA() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CADENA().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_CADENA() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CADENA().GetColumn()
			}
		}()), str[1:len(str)-1], environment.STRING)

	case SwiftGrammarParserTRU:
		{
			p.SetState(258)

			var _m = p.Match(SwiftGrammarParserTRU)

			localctx.(*ExprContext)._TRU = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
			if localctx.(*ExprContext).Get_TRU() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_TRU().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_TRU() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_TRU().GetColumn()
			}
		}()), true, environment.BOOLEAN)

	case SwiftGrammarParserFAL:
		{
			p.SetState(260)

			var _m = p.Match(SwiftGrammarParserFAL)

			localctx.(*ExprContext)._FAL = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
			if localctx.(*ExprContext).Get_FAL() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_FAL().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_FAL() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_FAL().GetColumn()
			}
		}()), false, environment.BOOLEAN)

	case SwiftGrammarParserCHARACTER:
		{
			p.SetState(262)

			var _m = p.Match(SwiftGrammarParserCHARACTER)

			localctx.(*ExprContext)._CHARACTER = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		str := (func() string {
			if localctx.(*ExprContext).Get_CHARACTER() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_CHARACTER().GetText()
			}
		}())
		localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
			if localctx.(*ExprContext).Get_CHARACTER() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CHARACTER().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_CHARACTER() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_CHARACTER().GetColumn()
			}
		}()), str[1:len(str)-1], environment.CHARACTER)

	case SwiftGrammarParserID_VALIDO:
		{
			p.SetState(264)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*ExprContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		id := (func() string {
			if localctx.(*ExprContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_ID_VALIDO().GetText()
			}
		}())
		localctx.(*ExprContext).e = instructions.NewCallid((func() int {
			if localctx.(*ExprContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID_VALIDO().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_ID_VALIDO() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_ID_VALIDO().GetColumn()
			}
		}()), id)

	case SwiftGrammarParserNULO:
		{
			p.SetState(266)

			var _m = p.Match(SwiftGrammarParserNULO)

			localctx.(*ExprContext)._NULO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = expressions.NewPrimitive((func() int {
			if localctx.(*ExprContext).Get_NULO() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_NULO().GetLine()
			}
		}()), (func() int {
			if localctx.(*ExprContext).Get_NULO() == nil {
				return 0
			} else {
				return localctx.(*ExprContext).Get_NULO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*ExprContext).Get_NULO() == nil {
				return ""
			} else {
				return localctx.(*ExprContext).Get_NULO().GetText()
			}
		}()), environment.NULL)

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(312)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 21, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(310)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}

			switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 20, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(270)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
					goto errorExit
				}
				{
					p.SetState(271)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserMUL || _la == SwiftGrammarParserDIV) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(272)

					var _x = p.expr(17)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 2:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(275)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
					goto errorExit
				}
				{
					p.SetState(276)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserADD || _la == SwiftGrammarParserSUB) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(277)

					var _x = p.expr(16)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 3:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(280)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
					goto errorExit
				}
				{
					p.SetState(281)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserMAY_IG || _la == SwiftGrammarParserMAYOR) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(282)

					var _x = p.expr(15)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 4:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(285)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
					goto errorExit
				}
				{
					p.SetState(286)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserMEN_IG || _la == SwiftGrammarParserMENOR) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(287)

					var _x = p.expr(14)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 5:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(290)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
					goto errorExit
				}
				{
					p.SetState(291)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ExprContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == SwiftGrammarParserDIF || _la == SwiftGrammarParserIG_IG) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ExprContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(292)

					var _x = p.expr(13)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 6:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(295)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
					goto errorExit
				}
				{
					p.SetState(296)

					var _m = p.Match(SwiftGrammarParserAND)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(297)

					var _x = p.expr(12)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 7:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(300)

				if !(p.Precpred(p.GetParserRuleContext(), 10)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 10)", ""))
					goto errorExit
				}
				{
					p.SetState(301)

					var _m = p.Match(SwiftGrammarParserOR)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(302)

					var _x = p.expr(11)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case 8:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(305)

				if !(p.Precpred(p.GetParserRuleContext(), 9)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 9)", ""))
					goto errorExit
				}
				{
					p.SetState(306)

					var _m = p.Match(SwiftGrammarParserMODULO)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(307)

					var _x = p.expr(10)

					localctx.(*ExprContext).right = _x
					localctx.(*ExprContext)._expr = _x
				}
				localctx.(*ExprContext).e = expressions.NewOperation((func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetLine(), (func() antlr.Token {
					if localctx.(*ExprContext).GetLeft() == nil {
						return nil
					} else {
						return localctx.(*ExprContext).GetLeft().GetStart()
					}
				}()).GetColumn(), localctx.(*ExprContext).GetLeft().GetE(), (func() string {
					if localctx.(*ExprContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*ExprContext).GetOp().GetText()
					}
				}()), localctx.(*ExprContext).GetRight().GetE())

			case antlr.ATNInvalidAltNumber:
				goto errorExit
			}

		}
		p.SetState(314)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 21, p.GetParserRuleContext())
		if p.HasError() {
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.UnrollRecursionContexts(_parentctx)
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ISentenciaifelseContext is an interface to support dynamic dispatch.
type ISentenciaifelseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_blockinterno returns the _blockinterno rule contexts.
	Get_blockinterno() IBlockinternoContext

	// GetIfop returns the ifop rule contexts.
	GetIfop() IBlockinternoContext

	// GetElseop returns the elseop rule contexts.
	GetElseop() IBlockinternoContext

	// Get_sentenciaifelse returns the _sentenciaifelse rule contexts.
	Get_sentenciaifelse() ISentenciaifelseContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

	// SetIfop sets the ifop rule contexts.
	SetIfop(IBlockinternoContext)

	// SetElseop sets the elseop rule contexts.
	SetElseop(IBlockinternoContext)

	// Set_sentenciaifelse sets the _sentenciaifelse rule contexts.
	Set_sentenciaifelse(ISentenciaifelseContext)

	// GetMyIfElse returns the myIfElse attribute.
	GetMyIfElse() interfaces.Instruction

	// SetMyIfElse sets the myIfElse attribute.
	SetMyIfElse(interfaces.Instruction)

	// Getter signatures
	IF() antlr.TerminalNode
	Expr() IExprContext
	AllLLAVEIZQ() []antlr.TerminalNode
	LLAVEIZQ(i int) antlr.TerminalNode
	AllBlockinterno() []IBlockinternoContext
	Blockinterno(i int) IBlockinternoContext
	AllLLAVEDER() []antlr.TerminalNode
	LLAVEDER(i int) antlr.TerminalNode
	ELSE() antlr.TerminalNode
	Sentenciaifelse() ISentenciaifelseContext

	// IsSentenciaifelseContext differentiates from other interfaces.
	IsSentenciaifelseContext()
}

type SentenciaifelseContext struct {
	antlr.BaseParserRuleContext
	parser           antlr.Parser
	myIfElse         interfaces.Instruction
	_IF              antlr.Token
	_expr            IExprContext
	_blockinterno    IBlockinternoContext
	ifop             IBlockinternoContext
	elseop           IBlockinternoContext
	_sentenciaifelse ISentenciaifelseContext
}

func NewEmptySentenciaifelseContext() *SentenciaifelseContext {
	var p = new(SentenciaifelseContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_sentenciaifelse
	return p
}

func InitEmptySentenciaifelseContext(p *SentenciaifelseContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_sentenciaifelse
}

func (*SentenciaifelseContext) IsSentenciaifelseContext() {}

func NewSentenciaifelseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SentenciaifelseContext {
	var p = new(SentenciaifelseContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_sentenciaifelse

	return p
}

func (s *SentenciaifelseContext) GetParser() antlr.Parser { return s.parser }

func (s *SentenciaifelseContext) Get_IF() antlr.Token { return s._IF }

func (s *SentenciaifelseContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *SentenciaifelseContext) Get_expr() IExprContext { return s._expr }

func (s *SentenciaifelseContext) Get_blockinterno() IBlockinternoContext { return s._blockinterno }

func (s *SentenciaifelseContext) GetIfop() IBlockinternoContext { return s.ifop }

func (s *SentenciaifelseContext) GetElseop() IBlockinternoContext { return s.elseop }

func (s *SentenciaifelseContext) Get_sentenciaifelse() ISentenciaifelseContext {
	return s._sentenciaifelse
}

func (s *SentenciaifelseContext) Set_expr(v IExprContext) { s._expr = v }

func (s *SentenciaifelseContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

func (s *SentenciaifelseContext) SetIfop(v IBlockinternoContext) { s.ifop = v }

func (s *SentenciaifelseContext) SetElseop(v IBlockinternoContext) { s.elseop = v }

func (s *SentenciaifelseContext) Set_sentenciaifelse(v ISentenciaifelseContext) {
	s._sentenciaifelse = v
}

func (s *SentenciaifelseContext) GetMyIfElse() interfaces.Instruction { return s.myIfElse }

func (s *SentenciaifelseContext) SetMyIfElse(v interfaces.Instruction) { s.myIfElse = v }

func (s *SentenciaifelseContext) IF() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIF, 0)
}

func (s *SentenciaifelseContext) Expr() IExprContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IExprContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IExprContext)
}

func (s *SentenciaifelseContext) AllLLAVEIZQ() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserLLAVEIZQ)
}

func (s *SentenciaifelseContext) LLAVEIZQ(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, i)
}

func (s *SentenciaifelseContext) AllBlockinterno() []IBlockinternoContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IBlockinternoContext); ok {
			len++
		}
	}

	tst := make([]IBlockinternoContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IBlockinternoContext); ok {
			tst[i] = t.(IBlockinternoContext)
			i++
		}
	}

	return tst
}

func (s *SentenciaifelseContext) Blockinterno(i int) IBlockinternoContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			if j == i {
				t = ctx.(antlr.RuleContext)
				break
			}
			j++
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *SentenciaifelseContext) AllLLAVEDER() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserLLAVEDER)
}

func (s *SentenciaifelseContext) LLAVEDER(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, i)
}

func (s *SentenciaifelseContext) ELSE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserELSE, 0)
}

func (s *SentenciaifelseContext) Sentenciaifelse() ISentenciaifelseContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISentenciaifelseContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISentenciaifelseContext)
}

func (s *SentenciaifelseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SentenciaifelseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SentenciaifelseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterSentenciaifelse(s)
	}
}

func (s *SentenciaifelseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitSentenciaifelse(s)
	}
}

func (p *SwiftGrammarParser) Sentenciaifelse() (localctx ISentenciaifelseContext) {
	localctx = NewSentenciaifelseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, SwiftGrammarParserRULE_sentenciaifelse)
	p.SetState(342)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 22, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(315)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(316)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(317)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(318)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext)._blockinterno = _x
		}
		{
			p.SetState(319)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*SentenciaifelseContext).myIfElse = instructions.NewSentenciaIf((func() int {
			if localctx.(*SentenciaifelseContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*SentenciaifelseContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*SentenciaifelseContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*SentenciaifelseContext).Get_IF().GetColumn()
			}
		}()), localctx.(*SentenciaifelseContext).Get_expr().GetE(), localctx.(*SentenciaifelseContext).Get_blockinterno().GetBlkint())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(322)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(323)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(324)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(325)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext).ifop = _x
		}
		{
			p.SetState(326)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(327)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(328)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(329)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext).elseop = _x
		}
		{
			p.SetState(330)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*SentenciaifelseContext).myIfElse = instructions.NewSentenciaIfElse((func() int {
			if localctx.(*SentenciaifelseContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*SentenciaifelseContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*SentenciaifelseContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*SentenciaifelseContext).Get_IF().GetColumn()
			}
		}()), localctx.(*SentenciaifelseContext).Get_expr().GetE(), localctx.(*SentenciaifelseContext).GetIfop().GetBlkint(), localctx.(*SentenciaifelseContext).GetElseop().GetBlkint())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(333)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(334)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(335)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(336)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext)._blockinterno = _x
		}
		{
			p.SetState(337)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(338)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(339)

			var _x = p.Sentenciaifelse()

			localctx.(*SentenciaifelseContext)._sentenciaifelse = _x
		}
		localctx.(*SentenciaifelseContext).myIfElse = instructions.NewSentenciaIfElseIf((func() int {
			if localctx.(*SentenciaifelseContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*SentenciaifelseContext).Get_IF().GetLine()
			}
		}()), (func() int {
			if localctx.(*SentenciaifelseContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*SentenciaifelseContext).Get_IF().GetColumn()
			}
		}()), localctx.(*SentenciaifelseContext).Get_expr().GetE(), localctx.(*SentenciaifelseContext).Get_blockinterno().GetBlkint(), localctx.(*SentenciaifelseContext).Get_sentenciaifelse().GetMyIfElse())

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

func (p *SwiftGrammarParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 14:
		var t *ExprContext = nil
		if localctx != nil {
			t = localctx.(*ExprContext)
		}
		return p.Expr_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *SwiftGrammarParser) Expr_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 16)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 15)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 14)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 13)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 12)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 10)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 9)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
