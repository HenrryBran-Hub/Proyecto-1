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
		"'false'", "'var'", "'let'", "'nil'", "'if'", "'else'", "'switch'",
		"'case'", "'default'", "'break'", "'continue'", "'for'", "'in'", "'...'",
		"'while'", "'guard'", "'return'", "'func'", "'print'", "'inout'", "'append'",
		"'remove'", "'removeLast'", "'count'", "'isEmpty'", "'at'", "'repeating'",
		"'struct'", "'mutating'", "", "", "", "", "", "'='", "':'", "';'", "'?'",
		"'('", "')'", "'!='", "'=='", "'!'", "'||'", "'&&'", "'>='", "'<='",
		"'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'+='", "'-='", "'{'",
		"'}'", "'->'", "','", "'.'", "'_'", "'['", "']'",
	}
	staticData.SymbolicNames = []string{
		"", "", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR", "LET",
		"NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE",
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
		"s", "block", "instruction", "blockinterno", "instructionint", "declavarible",
		"declaconstante", "asignacionvariable", "printstmtint", "declavaribleint",
		"declaconstanteint", "asignacionvariableint", "tipodato", "expr", "sentenciaifelse",
		"switchcontrol", "blockcase", "bloquecase", "whilecontrol", "forcontrol",
		"guardcontrol", "continuee", "breakk", "retornos", "vectorcontrol",
		"blockparams", "bloqueparams", "vectoragregar", "vectorremover", "vectorvacio",
		"vectorcount", "vectoraccess", "funciondeclaracioncontrol", "listaparametros",
		"funcionllamadacontrol", "listaparametrosllamada", "printstmt", "intembebida",
		"floatembebida", "stringembebida",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 73, 780, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2, 10, 7,
		10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15, 7, 15,
		2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 2, 20, 7, 20, 2,
		21, 7, 21, 2, 22, 7, 22, 2, 23, 7, 23, 2, 24, 7, 24, 2, 25, 7, 25, 2, 26,
		7, 26, 2, 27, 7, 27, 2, 28, 7, 28, 2, 29, 7, 29, 2, 30, 7, 30, 2, 31, 7,
		31, 2, 32, 7, 32, 2, 33, 7, 33, 2, 34, 7, 34, 2, 35, 7, 35, 2, 36, 7, 36,
		2, 37, 7, 37, 2, 38, 7, 38, 2, 39, 7, 39, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1,
		4, 1, 86, 8, 1, 11, 1, 12, 1, 87, 1, 1, 1, 1, 1, 2, 1, 2, 3, 2, 94, 8,
		2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 100, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3,
		2, 106, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
		2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 127, 8,
		2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 139,
		8, 2, 1, 2, 1, 2, 3, 2, 143, 8, 2, 1, 3, 4, 3, 146, 8, 3, 11, 3, 12, 3,
		147, 1, 3, 1, 3, 1, 4, 1, 4, 3, 4, 154, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3,
		4, 160, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 166, 8, 4, 1, 4, 1, 4, 1, 4,
		1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4,
		1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 187, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4,
		193, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 199, 8, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 3, 4, 205, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 211, 8, 4, 1, 4, 1, 4,
		1, 4, 1, 4, 3, 4, 217, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 223, 8, 4, 1,
		4, 1, 4, 3, 4, 227, 8, 4, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1,
		5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1,
		5, 1, 5, 3, 5, 250, 8, 5, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 3, 6, 266, 8, 6, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1,
		7, 3, 7, 283, 8, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 9, 1, 9, 1,
		9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1,
		9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 3, 9, 312, 8, 9, 1, 10, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10,
		1, 10, 3, 10, 328, 8, 10, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1,
		11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 3, 11, 345,
		8, 11, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1,
		12, 3, 12, 357, 8, 12, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1,
		13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1,
		13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 3, 13, 404, 8, 13, 1, 13,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1,
		13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1,
		13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 5, 13, 446, 8, 13,
		10, 13, 12, 13, 449, 9, 13, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 3,
		14, 478, 8, 14, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 3, 15,
		487, 8, 15, 1, 15, 1, 15, 1, 15, 1, 16, 4, 16, 493, 8, 16, 11, 16, 12,
		16, 494, 1, 16, 1, 16, 1, 17, 1, 17, 1, 17, 1, 17, 1, 17, 1, 17, 1, 18,
		1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 19, 1, 19, 1, 19, 1, 19, 1,
		19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19,
		1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 3, 19, 532, 8, 19, 1, 20, 1, 20, 1,
		20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 21, 1, 21, 1, 21, 1, 22, 1, 22,
		1, 22, 1, 23, 1, 23, 1, 23, 1, 23, 1, 23, 1, 23, 3, 23, 554, 8, 23, 1,
		24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24,
		1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1,
		24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24, 1, 24,
		1, 24, 3, 24, 589, 8, 24, 1, 25, 4, 25, 592, 8, 25, 11, 25, 12, 25, 593,
		1, 25, 1, 25, 1, 26, 1, 26, 1, 26, 1, 26, 1, 26, 1, 26, 1, 26, 3, 26, 605,
		8, 26, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1,
		27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27,
		1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 3, 27, 634, 8, 27, 1,
		28, 1, 28, 1, 28, 1, 28, 1, 28, 1, 28, 1, 28, 1, 28, 1, 28, 1, 28, 1, 28,
		1, 28, 1, 28, 1, 28, 1, 28, 1, 28, 3, 28, 652, 8, 28, 1, 29, 1, 29, 1,
		29, 1, 29, 1, 29, 1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1, 31, 1, 31, 1, 31,
		1, 31, 1, 31, 1, 31, 1, 32, 1, 32, 1, 32, 1, 32, 3, 32, 674, 8, 32, 1,
		32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32,
		1, 32, 3, 32, 688, 8, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 1, 32, 3,
		32, 696, 8, 32, 1, 33, 1, 33, 3, 33, 700, 8, 33, 1, 33, 1, 33, 1, 33, 3,
		33, 705, 8, 33, 1, 33, 1, 33, 1, 33, 1, 33, 1, 33, 3, 33, 712, 8, 33, 1,
		33, 1, 33, 1, 33, 3, 33, 717, 8, 33, 1, 33, 1, 33, 1, 33, 3, 33, 722, 8,
		33, 1, 34, 1, 34, 1, 34, 3, 34, 727, 8, 34, 1, 34, 1, 34, 1, 34, 1, 35,
		1, 35, 1, 35, 3, 35, 735, 8, 35, 1, 35, 3, 35, 738, 8, 35, 1, 35, 1, 35,
		1, 35, 1, 35, 1, 35, 1, 35, 3, 35, 746, 8, 35, 1, 35, 3, 35, 749, 8, 35,
		1, 35, 1, 35, 1, 35, 3, 35, 754, 8, 35, 1, 36, 1, 36, 1, 36, 1, 36, 1,
		36, 1, 36, 1, 37, 1, 37, 1, 37, 1, 37, 1, 37, 1, 37, 1, 38, 1, 38, 1, 38,
		1, 38, 1, 38, 1, 38, 1, 39, 1, 39, 1, 39, 1, 39, 1, 39, 1, 39, 1, 39, 0,
		1, 26, 40, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32,
		34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68,
		70, 72, 74, 76, 78, 0, 6, 1, 0, 57, 58, 1, 0, 59, 60, 2, 0, 52, 52, 54,
		54, 2, 0, 53, 53, 55, 55, 1, 0, 47, 48, 2, 0, 38, 38, 68, 68, 845, 0, 80,
		1, 0, 0, 0, 2, 85, 1, 0, 0, 0, 4, 142, 1, 0, 0, 0, 6, 145, 1, 0, 0, 0,
		8, 226, 1, 0, 0, 0, 10, 249, 1, 0, 0, 0, 12, 265, 1, 0, 0, 0, 14, 282,
		1, 0, 0, 0, 16, 284, 1, 0, 0, 0, 18, 311, 1, 0, 0, 0, 20, 327, 1, 0, 0,
		0, 22, 344, 1, 0, 0, 0, 24, 356, 1, 0, 0, 0, 26, 403, 1, 0, 0, 0, 28, 477,
		1, 0, 0, 0, 30, 479, 1, 0, 0, 0, 32, 492, 1, 0, 0, 0, 34, 498, 1, 0, 0,
		0, 36, 504, 1, 0, 0, 0, 38, 531, 1, 0, 0, 0, 40, 533, 1, 0, 0, 0, 42, 541,
		1, 0, 0, 0, 44, 544, 1, 0, 0, 0, 46, 553, 1, 0, 0, 0, 48, 588, 1, 0, 0,
		0, 50, 591, 1, 0, 0, 0, 52, 604, 1, 0, 0, 0, 54, 633, 1, 0, 0, 0, 56, 651,
		1, 0, 0, 0, 58, 653, 1, 0, 0, 0, 60, 658, 1, 0, 0, 0, 62, 663, 1, 0, 0,
		0, 64, 695, 1, 0, 0, 0, 66, 721, 1, 0, 0, 0, 68, 723, 1, 0, 0, 0, 70, 753,
		1, 0, 0, 0, 72, 755, 1, 0, 0, 0, 74, 761, 1, 0, 0, 0, 76, 767, 1, 0, 0,
		0, 78, 773, 1, 0, 0, 0, 80, 81, 3, 2, 1, 0, 81, 82, 5, 0, 0, 1, 82, 83,
		6, 0, -1, 0, 83, 1, 1, 0, 0, 0, 84, 86, 3, 4, 2, 0, 85, 84, 1, 0, 0, 0,
		86, 87, 1, 0, 0, 0, 87, 85, 1, 0, 0, 0, 87, 88, 1, 0, 0, 0, 88, 89, 1,
		0, 0, 0, 89, 90, 6, 1, -1, 0, 90, 3, 1, 0, 0, 0, 91, 93, 3, 10, 5, 0, 92,
		94, 5, 43, 0, 0, 93, 92, 1, 0, 0, 0, 93, 94, 1, 0, 0, 0, 94, 95, 1, 0,
		0, 0, 95, 96, 6, 2, -1, 0, 96, 143, 1, 0, 0, 0, 97, 99, 3, 12, 6, 0, 98,
		100, 5, 43, 0, 0, 99, 98, 1, 0, 0, 0, 99, 100, 1, 0, 0, 0, 100, 101, 1,
		0, 0, 0, 101, 102, 6, 2, -1, 0, 102, 143, 1, 0, 0, 0, 103, 105, 3, 14,
		7, 0, 104, 106, 5, 43, 0, 0, 105, 104, 1, 0, 0, 0, 105, 106, 1, 0, 0, 0,
		106, 107, 1, 0, 0, 0, 107, 108, 6, 2, -1, 0, 108, 143, 1, 0, 0, 0, 109,
		110, 3, 28, 14, 0, 110, 111, 6, 2, -1, 0, 111, 143, 1, 0, 0, 0, 112, 113,
		3, 30, 15, 0, 113, 114, 6, 2, -1, 0, 114, 143, 1, 0, 0, 0, 115, 116, 3,
		36, 18, 0, 116, 117, 6, 2, -1, 0, 117, 143, 1, 0, 0, 0, 118, 119, 3, 38,
		19, 0, 119, 120, 6, 2, -1, 0, 120, 143, 1, 0, 0, 0, 121, 122, 3, 40, 20,
		0, 122, 123, 6, 2, -1, 0, 123, 143, 1, 0, 0, 0, 124, 126, 3, 48, 24, 0,
		125, 127, 5, 43, 0, 0, 126, 125, 1, 0, 0, 0, 126, 127, 1, 0, 0, 0, 127,
		128, 1, 0, 0, 0, 128, 129, 6, 2, -1, 0, 129, 143, 1, 0, 0, 0, 130, 131,
		3, 54, 27, 0, 131, 132, 6, 2, -1, 0, 132, 143, 1, 0, 0, 0, 133, 134, 3,
		56, 28, 0, 134, 135, 6, 2, -1, 0, 135, 143, 1, 0, 0, 0, 136, 138, 3, 72,
		36, 0, 137, 139, 5, 43, 0, 0, 138, 137, 1, 0, 0, 0, 138, 139, 1, 0, 0,
		0, 139, 140, 1, 0, 0, 0, 140, 141, 6, 2, -1, 0, 141, 143, 1, 0, 0, 0, 142,
		91, 1, 0, 0, 0, 142, 97, 1, 0, 0, 0, 142, 103, 1, 0, 0, 0, 142, 109, 1,
		0, 0, 0, 142, 112, 1, 0, 0, 0, 142, 115, 1, 0, 0, 0, 142, 118, 1, 0, 0,
		0, 142, 121, 1, 0, 0, 0, 142, 124, 1, 0, 0, 0, 142, 130, 1, 0, 0, 0, 142,
		133, 1, 0, 0, 0, 142, 136, 1, 0, 0, 0, 143, 5, 1, 0, 0, 0, 144, 146, 3,
		8, 4, 0, 145, 144, 1, 0, 0, 0, 146, 147, 1, 0, 0, 0, 147, 145, 1, 0, 0,
		0, 147, 148, 1, 0, 0, 0, 148, 149, 1, 0, 0, 0, 149, 150, 6, 3, -1, 0, 150,
		7, 1, 0, 0, 0, 151, 153, 3, 18, 9, 0, 152, 154, 5, 43, 0, 0, 153, 152,
		1, 0, 0, 0, 153, 154, 1, 0, 0, 0, 154, 155, 1, 0, 0, 0, 155, 156, 6, 4,
		-1, 0, 156, 227, 1, 0, 0, 0, 157, 159, 3, 20, 10, 0, 158, 160, 5, 43, 0,
		0, 159, 158, 1, 0, 0, 0, 159, 160, 1, 0, 0, 0, 160, 161, 1, 0, 0, 0, 161,
		162, 6, 4, -1, 0, 162, 227, 1, 0, 0, 0, 163, 165, 3, 22, 11, 0, 164, 166,
		5, 43, 0, 0, 165, 164, 1, 0, 0, 0, 165, 166, 1, 0, 0, 0, 166, 167, 1, 0,
		0, 0, 167, 168, 6, 4, -1, 0, 168, 227, 1, 0, 0, 0, 169, 170, 3, 28, 14,
		0, 170, 171, 6, 4, -1, 0, 171, 227, 1, 0, 0, 0, 172, 173, 3, 30, 15, 0,
		173, 174, 6, 4, -1, 0, 174, 227, 1, 0, 0, 0, 175, 176, 3, 36, 18, 0, 176,
		177, 6, 4, -1, 0, 177, 227, 1, 0, 0, 0, 178, 179, 3, 38, 19, 0, 179, 180,
		6, 4, -1, 0, 180, 227, 1, 0, 0, 0, 181, 182, 3, 40, 20, 0, 182, 183, 6,
		4, -1, 0, 183, 227, 1, 0, 0, 0, 184, 186, 3, 42, 21, 0, 185, 187, 5, 43,
		0, 0, 186, 185, 1, 0, 0, 0, 186, 187, 1, 0, 0, 0, 187, 188, 1, 0, 0, 0,
		188, 189, 6, 4, -1, 0, 189, 227, 1, 0, 0, 0, 190, 192, 3, 44, 22, 0, 191,
		193, 5, 43, 0, 0, 192, 191, 1, 0, 0, 0, 192, 193, 1, 0, 0, 0, 193, 194,
		1, 0, 0, 0, 194, 195, 6, 4, -1, 0, 195, 227, 1, 0, 0, 0, 196, 198, 3, 46,
		23, 0, 197, 199, 5, 43, 0, 0, 198, 197, 1, 0, 0, 0, 198, 199, 1, 0, 0,
		0, 199, 200, 1, 0, 0, 0, 200, 201, 6, 4, -1, 0, 201, 227, 1, 0, 0, 0, 202,
		204, 3, 48, 24, 0, 203, 205, 5, 43, 0, 0, 204, 203, 1, 0, 0, 0, 204, 205,
		1, 0, 0, 0, 205, 206, 1, 0, 0, 0, 206, 207, 6, 4, -1, 0, 207, 227, 1, 0,
		0, 0, 208, 210, 3, 54, 27, 0, 209, 211, 5, 43, 0, 0, 210, 209, 1, 0, 0,
		0, 210, 211, 1, 0, 0, 0, 211, 212, 1, 0, 0, 0, 212, 213, 6, 4, -1, 0, 213,
		227, 1, 0, 0, 0, 214, 216, 3, 56, 28, 0, 215, 217, 5, 43, 0, 0, 216, 215,
		1, 0, 0, 0, 216, 217, 1, 0, 0, 0, 217, 218, 1, 0, 0, 0, 218, 219, 6, 4,
		-1, 0, 219, 227, 1, 0, 0, 0, 220, 222, 3, 16, 8, 0, 221, 223, 5, 43, 0,
		0, 222, 221, 1, 0, 0, 0, 222, 223, 1, 0, 0, 0, 223, 224, 1, 0, 0, 0, 224,
		225, 6, 4, -1, 0, 225, 227, 1, 0, 0, 0, 226, 151, 1, 0, 0, 0, 226, 157,
		1, 0, 0, 0, 226, 163, 1, 0, 0, 0, 226, 169, 1, 0, 0, 0, 226, 172, 1, 0,
		0, 0, 226, 175, 1, 0, 0, 0, 226, 178, 1, 0, 0, 0, 226, 181, 1, 0, 0, 0,
		226, 184, 1, 0, 0, 0, 226, 190, 1, 0, 0, 0, 226, 196, 1, 0, 0, 0, 226,
		202, 1, 0, 0, 0, 226, 208, 1, 0, 0, 0, 226, 214, 1, 0, 0, 0, 226, 220,
		1, 0, 0, 0, 227, 9, 1, 0, 0, 0, 228, 229, 5, 8, 0, 0, 229, 230, 5, 38,
		0, 0, 230, 231, 5, 42, 0, 0, 231, 232, 3, 24, 12, 0, 232, 233, 5, 41, 0,
		0, 233, 234, 3, 26, 13, 0, 234, 235, 6, 5, -1, 0, 235, 250, 1, 0, 0, 0,
		236, 237, 5, 8, 0, 0, 237, 238, 5, 38, 0, 0, 238, 239, 5, 41, 0, 0, 239,
		240, 3, 26, 13, 0, 240, 241, 6, 5, -1, 0, 241, 250, 1, 0, 0, 0, 242, 243,
		5, 8, 0, 0, 243, 244, 5, 38, 0, 0, 244, 245, 5, 42, 0, 0, 245, 246, 3,
		24, 12, 0, 246, 247, 5, 44, 0, 0, 247, 248, 6, 5, -1, 0, 248, 250, 1, 0,
		0, 0, 249, 228, 1, 0, 0, 0, 249, 236, 1, 0, 0, 0, 249, 242, 1, 0, 0, 0,
		250, 11, 1, 0, 0, 0, 251, 252, 5, 9, 0, 0, 252, 253, 5, 38, 0, 0, 253,
		254, 5, 42, 0, 0, 254, 255, 3, 24, 12, 0, 255, 256, 5, 41, 0, 0, 256, 257,
		3, 26, 13, 0, 257, 258, 6, 6, -1, 0, 258, 266, 1, 0, 0, 0, 259, 260, 5,
		9, 0, 0, 260, 261, 5, 38, 0, 0, 261, 262, 5, 41, 0, 0, 262, 263, 3, 26,
		13, 0, 263, 264, 6, 6, -1, 0, 264, 266, 1, 0, 0, 0, 265, 251, 1, 0, 0,
		0, 265, 259, 1, 0, 0, 0, 266, 13, 1, 0, 0, 0, 267, 268, 5, 38, 0, 0, 268,
		269, 5, 41, 0, 0, 269, 270, 3, 26, 13, 0, 270, 271, 6, 7, -1, 0, 271, 283,
		1, 0, 0, 0, 272, 273, 5, 38, 0, 0, 273, 274, 5, 61, 0, 0, 274, 275, 3,
		26, 13, 0, 275, 276, 6, 7, -1, 0, 276, 283, 1, 0, 0, 0, 277, 278, 5, 38,
		0, 0, 278, 279, 5, 62, 0, 0, 279, 280, 3, 26, 13, 0, 280, 281, 6, 7, -1,
		0, 281, 283, 1, 0, 0, 0, 282, 267, 1, 0, 0, 0, 282, 272, 1, 0, 0, 0, 282,
		277, 1, 0, 0, 0, 283, 15, 1, 0, 0, 0, 284, 285, 5, 25, 0, 0, 285, 286,
		5, 45, 0, 0, 286, 287, 3, 26, 13, 0, 287, 288, 5, 46, 0, 0, 288, 289, 6,
		8, -1, 0, 289, 17, 1, 0, 0, 0, 290, 291, 5, 8, 0, 0, 291, 292, 5, 38, 0,
		0, 292, 293, 5, 42, 0, 0, 293, 294, 3, 24, 12, 0, 294, 295, 5, 41, 0, 0,
		295, 296, 3, 26, 13, 0, 296, 297, 6, 9, -1, 0, 297, 312, 1, 0, 0, 0, 298,
		299, 5, 8, 0, 0, 299, 300, 5, 38, 0, 0, 300, 301, 5, 41, 0, 0, 301, 302,
		3, 26, 13, 0, 302, 303, 6, 9, -1, 0, 303, 312, 1, 0, 0, 0, 304, 305, 5,
		8, 0, 0, 305, 306, 5, 38, 0, 0, 306, 307, 5, 42, 0, 0, 307, 308, 3, 24,
		12, 0, 308, 309, 5, 44, 0, 0, 309, 310, 6, 9, -1, 0, 310, 312, 1, 0, 0,
		0, 311, 290, 1, 0, 0, 0, 311, 298, 1, 0, 0, 0, 311, 304, 1, 0, 0, 0, 312,
		19, 1, 0, 0, 0, 313, 314, 5, 9, 0, 0, 314, 315, 5, 38, 0, 0, 315, 316,
		5, 42, 0, 0, 316, 317, 3, 24, 12, 0, 317, 318, 5, 41, 0, 0, 318, 319, 3,
		26, 13, 0, 319, 320, 6, 10, -1, 0, 320, 328, 1, 0, 0, 0, 321, 322, 5, 9,
		0, 0, 322, 323, 5, 38, 0, 0, 323, 324, 5, 41, 0, 0, 324, 325, 3, 26, 13,
		0, 325, 326, 6, 10, -1, 0, 326, 328, 1, 0, 0, 0, 327, 313, 1, 0, 0, 0,
		327, 321, 1, 0, 0, 0, 328, 21, 1, 0, 0, 0, 329, 330, 5, 38, 0, 0, 330,
		331, 5, 41, 0, 0, 331, 332, 3, 26, 13, 0, 332, 333, 6, 11, -1, 0, 333,
		345, 1, 0, 0, 0, 334, 335, 5, 38, 0, 0, 335, 336, 5, 61, 0, 0, 336, 337,
		3, 26, 13, 0, 337, 338, 6, 11, -1, 0, 338, 345, 1, 0, 0, 0, 339, 340, 5,
		38, 0, 0, 340, 341, 5, 62, 0, 0, 341, 342, 3, 26, 13, 0, 342, 343, 6, 11,
		-1, 0, 343, 345, 1, 0, 0, 0, 344, 329, 1, 0, 0, 0, 344, 334, 1, 0, 0, 0,
		344, 339, 1, 0, 0, 0, 345, 23, 1, 0, 0, 0, 346, 347, 5, 1, 0, 0, 347, 357,
		6, 12, -1, 0, 348, 349, 5, 2, 0, 0, 349, 357, 6, 12, -1, 0, 350, 351, 5,
		3, 0, 0, 351, 357, 6, 12, -1, 0, 352, 353, 5, 4, 0, 0, 353, 357, 6, 12,
		-1, 0, 354, 355, 5, 5, 0, 0, 355, 357, 6, 12, -1, 0, 356, 346, 1, 0, 0,
		0, 356, 348, 1, 0, 0, 0, 356, 350, 1, 0, 0, 0, 356, 352, 1, 0, 0, 0, 356,
		354, 1, 0, 0, 0, 357, 25, 1, 0, 0, 0, 358, 359, 6, 13, -1, 0, 359, 360,
		5, 49, 0, 0, 360, 361, 3, 26, 13, 24, 361, 362, 6, 13, -1, 0, 362, 404,
		1, 0, 0, 0, 363, 364, 5, 45, 0, 0, 364, 365, 3, 26, 13, 0, 365, 366, 5,
		46, 0, 0, 366, 367, 6, 13, -1, 0, 367, 404, 1, 0, 0, 0, 368, 369, 5, 60,
		0, 0, 369, 370, 5, 36, 0, 0, 370, 404, 6, 13, -1, 0, 371, 372, 5, 36, 0,
		0, 372, 404, 6, 13, -1, 0, 373, 374, 5, 37, 0, 0, 374, 404, 6, 13, -1,
		0, 375, 376, 5, 6, 0, 0, 376, 404, 6, 13, -1, 0, 377, 378, 5, 7, 0, 0,
		378, 404, 6, 13, -1, 0, 379, 380, 5, 39, 0, 0, 380, 404, 6, 13, -1, 0,
		381, 382, 5, 38, 0, 0, 382, 404, 6, 13, -1, 0, 383, 384, 5, 10, 0, 0, 384,
		404, 6, 13, -1, 0, 385, 386, 3, 58, 29, 0, 386, 387, 6, 13, -1, 0, 387,
		404, 1, 0, 0, 0, 388, 389, 3, 60, 30, 0, 389, 390, 6, 13, -1, 0, 390, 404,
		1, 0, 0, 0, 391, 392, 3, 62, 31, 0, 392, 393, 6, 13, -1, 0, 393, 404, 1,
		0, 0, 0, 394, 395, 3, 74, 37, 0, 395, 396, 6, 13, -1, 0, 396, 404, 1, 0,
		0, 0, 397, 398, 3, 76, 38, 0, 398, 399, 6, 13, -1, 0, 399, 404, 1, 0, 0,
		0, 400, 401, 3, 78, 39, 0, 401, 402, 6, 13, -1, 0, 402, 404, 1, 0, 0, 0,
		403, 358, 1, 0, 0, 0, 403, 363, 1, 0, 0, 0, 403, 368, 1, 0, 0, 0, 403,
		371, 1, 0, 0, 0, 403, 373, 1, 0, 0, 0, 403, 375, 1, 0, 0, 0, 403, 377,
		1, 0, 0, 0, 403, 379, 1, 0, 0, 0, 403, 381, 1, 0, 0, 0, 403, 383, 1, 0,
		0, 0, 403, 385, 1, 0, 0, 0, 403, 388, 1, 0, 0, 0, 403, 391, 1, 0, 0, 0,
		403, 394, 1, 0, 0, 0, 403, 397, 1, 0, 0, 0, 403, 400, 1, 0, 0, 0, 404,
		447, 1, 0, 0, 0, 405, 406, 10, 23, 0, 0, 406, 407, 5, 56, 0, 0, 407, 408,
		3, 26, 13, 24, 408, 409, 6, 13, -1, 0, 409, 446, 1, 0, 0, 0, 410, 411,
		10, 22, 0, 0, 411, 412, 7, 0, 0, 0, 412, 413, 3, 26, 13, 23, 413, 414,
		6, 13, -1, 0, 414, 446, 1, 0, 0, 0, 415, 416, 10, 21, 0, 0, 416, 417, 7,
		1, 0, 0, 417, 418, 3, 26, 13, 22, 418, 419, 6, 13, -1, 0, 419, 446, 1,
		0, 0, 0, 420, 421, 10, 20, 0, 0, 421, 422, 7, 2, 0, 0, 422, 423, 3, 26,
		13, 21, 423, 424, 6, 13, -1, 0, 424, 446, 1, 0, 0, 0, 425, 426, 10, 19,
		0, 0, 426, 427, 7, 3, 0, 0, 427, 428, 3, 26, 13, 20, 428, 429, 6, 13, -1,
		0, 429, 446, 1, 0, 0, 0, 430, 431, 10, 18, 0, 0, 431, 432, 7, 4, 0, 0,
		432, 433, 3, 26, 13, 19, 433, 434, 6, 13, -1, 0, 434, 446, 1, 0, 0, 0,
		435, 436, 10, 17, 0, 0, 436, 437, 5, 51, 0, 0, 437, 438, 3, 26, 13, 18,
		438, 439, 6, 13, -1, 0, 439, 446, 1, 0, 0, 0, 440, 441, 10, 16, 0, 0, 441,
		442, 5, 50, 0, 0, 442, 443, 3, 26, 13, 17, 443, 444, 6, 13, -1, 0, 444,
		446, 1, 0, 0, 0, 445, 405, 1, 0, 0, 0, 445, 410, 1, 0, 0, 0, 445, 415,
		1, 0, 0, 0, 445, 420, 1, 0, 0, 0, 445, 425, 1, 0, 0, 0, 445, 430, 1, 0,
		0, 0, 445, 435, 1, 0, 0, 0, 445, 440, 1, 0, 0, 0, 446, 449, 1, 0, 0, 0,
		447, 445, 1, 0, 0, 0, 447, 448, 1, 0, 0, 0, 448, 27, 1, 0, 0, 0, 449, 447,
		1, 0, 0, 0, 450, 451, 5, 11, 0, 0, 451, 452, 3, 26, 13, 0, 452, 453, 5,
		63, 0, 0, 453, 454, 3, 6, 3, 0, 454, 455, 5, 64, 0, 0, 455, 456, 6, 14,
		-1, 0, 456, 478, 1, 0, 0, 0, 457, 458, 5, 11, 0, 0, 458, 459, 3, 26, 13,
		0, 459, 460, 5, 63, 0, 0, 460, 461, 3, 6, 3, 0, 461, 462, 5, 64, 0, 0,
		462, 463, 5, 12, 0, 0, 463, 464, 5, 63, 0, 0, 464, 465, 3, 6, 3, 0, 465,
		466, 5, 64, 0, 0, 466, 467, 6, 14, -1, 0, 467, 478, 1, 0, 0, 0, 468, 469,
		5, 11, 0, 0, 469, 470, 3, 26, 13, 0, 470, 471, 5, 63, 0, 0, 471, 472, 3,
		6, 3, 0, 472, 473, 5, 64, 0, 0, 473, 474, 5, 12, 0, 0, 474, 475, 3, 28,
		14, 0, 475, 476, 6, 14, -1, 0, 476, 478, 1, 0, 0, 0, 477, 450, 1, 0, 0,
		0, 477, 457, 1, 0, 0, 0, 477, 468, 1, 0, 0, 0, 478, 29, 1, 0, 0, 0, 479,
		480, 5, 13, 0, 0, 480, 481, 3, 26, 13, 0, 481, 482, 5, 63, 0, 0, 482, 486,
		3, 32, 16, 0, 483, 484, 5, 15, 0, 0, 484, 485, 5, 42, 0, 0, 485, 487, 3,
		6, 3, 0, 486, 483, 1, 0, 0, 0, 486, 487, 1, 0, 0, 0, 487, 488, 1, 0, 0,
		0, 488, 489, 5, 64, 0, 0, 489, 490, 6, 15, -1, 0, 490, 31, 1, 0, 0, 0,
		491, 493, 3, 34, 17, 0, 492, 491, 1, 0, 0, 0, 493, 494, 1, 0, 0, 0, 494,
		492, 1, 0, 0, 0, 494, 495, 1, 0, 0, 0, 495, 496, 1, 0, 0, 0, 496, 497,
		6, 16, -1, 0, 497, 33, 1, 0, 0, 0, 498, 499, 5, 14, 0, 0, 499, 500, 3,
		26, 13, 0, 500, 501, 5, 42, 0, 0, 501, 502, 3, 6, 3, 0, 502, 503, 6, 17,
		-1, 0, 503, 35, 1, 0, 0, 0, 504, 505, 5, 21, 0, 0, 505, 506, 3, 26, 13,
		0, 506, 507, 5, 63, 0, 0, 507, 508, 3, 6, 3, 0, 508, 509, 5, 64, 0, 0,
		509, 510, 6, 18, -1, 0, 510, 37, 1, 0, 0, 0, 511, 512, 5, 18, 0, 0, 512,
		513, 5, 38, 0, 0, 513, 514, 5, 19, 0, 0, 514, 515, 3, 26, 13, 0, 515, 516,
		5, 20, 0, 0, 516, 517, 3, 26, 13, 0, 517, 518, 5, 63, 0, 0, 518, 519, 3,
		6, 3, 0, 519, 520, 5, 64, 0, 0, 520, 521, 6, 19, -1, 0, 521, 532, 1, 0,
		0, 0, 522, 523, 5, 18, 0, 0, 523, 524, 5, 38, 0, 0, 524, 525, 5, 19, 0,
		0, 525, 526, 3, 26, 13, 0, 526, 527, 5, 63, 0, 0, 527, 528, 3, 6, 3, 0,
		528, 529, 5, 64, 0, 0, 529, 530, 6, 19, -1, 0, 530, 532, 1, 0, 0, 0, 531,
		511, 1, 0, 0, 0, 531, 522, 1, 0, 0, 0, 532, 39, 1, 0, 0, 0, 533, 534, 5,
		22, 0, 0, 534, 535, 3, 26, 13, 0, 535, 536, 5, 12, 0, 0, 536, 537, 5, 63,
		0, 0, 537, 538, 3, 6, 3, 0, 538, 539, 5, 64, 0, 0, 539, 540, 6, 20, -1,
		0, 540, 41, 1, 0, 0, 0, 541, 542, 5, 17, 0, 0, 542, 543, 6, 21, -1, 0,
		543, 43, 1, 0, 0, 0, 544, 545, 5, 16, 0, 0, 545, 546, 6, 22, -1, 0, 546,
		45, 1, 0, 0, 0, 547, 548, 5, 23, 0, 0, 548, 554, 6, 23, -1, 0, 549, 550,
		5, 23, 0, 0, 550, 551, 3, 26, 13, 0, 551, 552, 6, 23, -1, 0, 552, 554,
		1, 0, 0, 0, 553, 547, 1, 0, 0, 0, 553, 549, 1, 0, 0, 0, 554, 47, 1, 0,
		0, 0, 555, 556, 5, 8, 0, 0, 556, 557, 5, 38, 0, 0, 557, 558, 5, 42, 0,
		0, 558, 559, 5, 69, 0, 0, 559, 560, 3, 24, 12, 0, 560, 561, 5, 70, 0, 0,
		561, 562, 5, 41, 0, 0, 562, 563, 5, 69, 0, 0, 563, 564, 3, 50, 25, 0, 564,
		565, 5, 70, 0, 0, 565, 566, 6, 24, -1, 0, 566, 589, 1, 0, 0, 0, 567, 568,
		5, 8, 0, 0, 568, 569, 5, 38, 0, 0, 569, 570, 5, 42, 0, 0, 570, 571, 5,
		69, 0, 0, 571, 572, 3, 24, 12, 0, 572, 573, 5, 70, 0, 0, 573, 574, 5, 41,
		0, 0, 574, 575, 5, 69, 0, 0, 575, 576, 5, 70, 0, 0, 576, 577, 6, 24, -1,
		0, 577, 589, 1, 0, 0, 0, 578, 579, 5, 8, 0, 0, 579, 580, 5, 38, 0, 0, 580,
		581, 5, 42, 0, 0, 581, 582, 5, 69, 0, 0, 582, 583, 3, 24, 12, 0, 583, 584,
		5, 70, 0, 0, 584, 585, 5, 41, 0, 0, 585, 586, 5, 38, 0, 0, 586, 587, 6,
		24, -1, 0, 587, 589, 1, 0, 0, 0, 588, 555, 1, 0, 0, 0, 588, 567, 1, 0,
		0, 0, 588, 578, 1, 0, 0, 0, 589, 49, 1, 0, 0, 0, 590, 592, 3, 52, 26, 0,
		591, 590, 1, 0, 0, 0, 592, 593, 1, 0, 0, 0, 593, 591, 1, 0, 0, 0, 593,
		594, 1, 0, 0, 0, 594, 595, 1, 0, 0, 0, 595, 596, 6, 25, -1, 0, 596, 51,
		1, 0, 0, 0, 597, 598, 5, 66, 0, 0, 598, 599, 3, 26, 13, 0, 599, 600, 6,
		26, -1, 0, 600, 605, 1, 0, 0, 0, 601, 602, 3, 26, 13, 0, 602, 603, 6, 26,
		-1, 0, 603, 605, 1, 0, 0, 0, 604, 597, 1, 0, 0, 0, 604, 601, 1, 0, 0, 0,
		605, 53, 1, 0, 0, 0, 606, 607, 5, 38, 0, 0, 607, 608, 5, 67, 0, 0, 608,
		609, 5, 27, 0, 0, 609, 610, 5, 45, 0, 0, 610, 611, 3, 26, 13, 0, 611, 612,
		5, 46, 0, 0, 612, 613, 6, 27, -1, 0, 613, 634, 1, 0, 0, 0, 614, 615, 5,
		38, 0, 0, 615, 616, 5, 69, 0, 0, 616, 617, 3, 26, 13, 0, 617, 618, 5, 70,
		0, 0, 618, 619, 5, 41, 0, 0, 619, 620, 5, 38, 0, 0, 620, 621, 5, 69, 0,
		0, 621, 622, 3, 26, 13, 0, 622, 623, 5, 70, 0, 0, 623, 624, 6, 27, -1,
		0, 624, 634, 1, 0, 0, 0, 625, 626, 5, 38, 0, 0, 626, 627, 5, 69, 0, 0,
		627, 628, 3, 26, 13, 0, 628, 629, 5, 70, 0, 0, 629, 630, 5, 41, 0, 0, 630,
		631, 3, 26, 13, 0, 631, 632, 6, 27, -1, 0, 632, 634, 1, 0, 0, 0, 633, 606,
		1, 0, 0, 0, 633, 614, 1, 0, 0, 0, 633, 625, 1, 0, 0, 0, 634, 55, 1, 0,
		0, 0, 635, 636, 5, 38, 0, 0, 636, 637, 5, 67, 0, 0, 637, 638, 5, 29, 0,
		0, 638, 639, 5, 45, 0, 0, 639, 640, 5, 46, 0, 0, 640, 652, 6, 28, -1, 0,
		641, 642, 5, 38, 0, 0, 642, 643, 5, 67, 0, 0, 643, 644, 5, 28, 0, 0, 644,
		645, 5, 45, 0, 0, 645, 646, 5, 32, 0, 0, 646, 647, 5, 42, 0, 0, 647, 648,
		3, 26, 13, 0, 648, 649, 5, 46, 0, 0, 649, 650, 6, 28, -1, 0, 650, 652,
		1, 0, 0, 0, 651, 635, 1, 0, 0, 0, 651, 641, 1, 0, 0, 0, 652, 57, 1, 0,
		0, 0, 653, 654, 5, 38, 0, 0, 654, 655, 5, 67, 0, 0, 655, 656, 5, 31, 0,
		0, 656, 657, 6, 29, -1, 0, 657, 59, 1, 0, 0, 0, 658, 659, 5, 38, 0, 0,
		659, 660, 5, 67, 0, 0, 660, 661, 5, 30, 0, 0, 661, 662, 6, 30, -1, 0, 662,
		61, 1, 0, 0, 0, 663, 664, 5, 38, 0, 0, 664, 665, 5, 69, 0, 0, 665, 666,
		3, 26, 13, 0, 666, 667, 5, 70, 0, 0, 667, 668, 6, 31, -1, 0, 668, 63, 1,
		0, 0, 0, 669, 670, 5, 24, 0, 0, 670, 671, 5, 38, 0, 0, 671, 673, 5, 45,
		0, 0, 672, 674, 3, 66, 33, 0, 673, 672, 1, 0, 0, 0, 673, 674, 1, 0, 0,
		0, 674, 675, 1, 0, 0, 0, 675, 676, 5, 46, 0, 0, 676, 677, 5, 65, 0, 0,
		677, 678, 3, 24, 12, 0, 678, 679, 5, 63, 0, 0, 679, 680, 3, 6, 3, 0, 680,
		681, 5, 64, 0, 0, 681, 682, 6, 32, -1, 0, 682, 696, 1, 0, 0, 0, 683, 684,
		5, 24, 0, 0, 684, 685, 5, 38, 0, 0, 685, 687, 5, 45, 0, 0, 686, 688, 3,
		66, 33, 0, 687, 686, 1, 0, 0, 0, 687, 688, 1, 0, 0, 0, 688, 689, 1, 0,
		0, 0, 689, 690, 5, 46, 0, 0, 690, 691, 5, 63, 0, 0, 691, 692, 3, 6, 3,
		0, 692, 693, 5, 64, 0, 0, 693, 694, 6, 32, -1, 0, 694, 696, 1, 0, 0, 0,
		695, 669, 1, 0, 0, 0, 695, 683, 1, 0, 0, 0, 696, 65, 1, 0, 0, 0, 697, 699,
		5, 66, 0, 0, 698, 700, 7, 5, 0, 0, 699, 698, 1, 0, 0, 0, 699, 700, 1, 0,
		0, 0, 700, 701, 1, 0, 0, 0, 701, 702, 5, 38, 0, 0, 702, 704, 5, 42, 0,
		0, 703, 705, 5, 26, 0, 0, 704, 703, 1, 0, 0, 0, 704, 705, 1, 0, 0, 0, 705,
		706, 1, 0, 0, 0, 706, 707, 3, 24, 12, 0, 707, 708, 3, 66, 33, 0, 708, 709,
		6, 33, -1, 0, 709, 722, 1, 0, 0, 0, 710, 712, 7, 5, 0, 0, 711, 710, 1,
		0, 0, 0, 711, 712, 1, 0, 0, 0, 712, 713, 1, 0, 0, 0, 713, 714, 5, 38, 0,
		0, 714, 716, 5, 42, 0, 0, 715, 717, 5, 26, 0, 0, 716, 715, 1, 0, 0, 0,
		716, 717, 1, 0, 0, 0, 717, 718, 1, 0, 0, 0, 718, 719, 3, 24, 12, 0, 719,
		720, 6, 33, -1, 0, 720, 722, 1, 0, 0, 0, 721, 697, 1, 0, 0, 0, 721, 711,
		1, 0, 0, 0, 722, 67, 1, 0, 0, 0, 723, 724, 5, 38, 0, 0, 724, 726, 5, 45,
		0, 0, 725, 727, 3, 70, 35, 0, 726, 725, 1, 0, 0, 0, 726, 727, 1, 0, 0,
		0, 727, 728, 1, 0, 0, 0, 728, 729, 5, 45, 0, 0, 729, 730, 6, 34, -1, 0,
		730, 69, 1, 0, 0, 0, 731, 734, 5, 66, 0, 0, 732, 733, 5, 38, 0, 0, 733,
		735, 5, 42, 0, 0, 734, 732, 1, 0, 0, 0, 734, 735, 1, 0, 0, 0, 735, 737,
		1, 0, 0, 0, 736, 738, 5, 1, 0, 0, 737, 736, 1, 0, 0, 0, 737, 738, 1, 0,
		0, 0, 738, 739, 1, 0, 0, 0, 739, 740, 3, 26, 13, 0, 740, 741, 3, 70, 35,
		0, 741, 742, 6, 35, -1, 0, 742, 754, 1, 0, 0, 0, 743, 744, 5, 38, 0, 0,
		744, 746, 5, 42, 0, 0, 745, 743, 1, 0, 0, 0, 745, 746, 1, 0, 0, 0, 746,
		748, 1, 0, 0, 0, 747, 749, 5, 1, 0, 0, 748, 747, 1, 0, 0, 0, 748, 749,
		1, 0, 0, 0, 749, 750, 1, 0, 0, 0, 750, 751, 3, 26, 13, 0, 751, 752, 6,
		35, -1, 0, 752, 754, 1, 0, 0, 0, 753, 731, 1, 0, 0, 0, 753, 745, 1, 0,
		0, 0, 754, 71, 1, 0, 0, 0, 755, 756, 5, 25, 0, 0, 756, 757, 5, 45, 0, 0,
		757, 758, 3, 26, 13, 0, 758, 759, 5, 46, 0, 0, 759, 760, 6, 36, -1, 0,
		760, 73, 1, 0, 0, 0, 761, 762, 5, 1, 0, 0, 762, 763, 5, 45, 0, 0, 763,
		764, 3, 26, 13, 0, 764, 765, 5, 46, 0, 0, 765, 766, 6, 37, -1, 0, 766,
		75, 1, 0, 0, 0, 767, 768, 5, 2, 0, 0, 768, 769, 5, 45, 0, 0, 769, 770,
		3, 26, 13, 0, 770, 771, 5, 46, 0, 0, 771, 772, 6, 38, -1, 0, 772, 77, 1,
		0, 0, 0, 773, 774, 5, 3, 0, 0, 774, 775, 5, 45, 0, 0, 775, 776, 3, 26,
		13, 0, 776, 777, 5, 46, 0, 0, 777, 778, 6, 39, -1, 0, 778, 79, 1, 0, 0,
		0, 53, 87, 93, 99, 105, 126, 138, 142, 147, 153, 159, 165, 186, 192, 198,
		204, 210, 216, 222, 226, 249, 265, 282, 311, 327, 344, 356, 403, 445, 447,
		477, 486, 494, 531, 553, 588, 593, 604, 633, 651, 673, 687, 695, 699, 704,
		711, 716, 721, 726, 734, 737, 745, 748, 753,
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
	SwiftGrammarParserT__0         = 1
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
	SwiftGrammarParserRULE_s                         = 0
	SwiftGrammarParserRULE_block                     = 1
	SwiftGrammarParserRULE_instruction               = 2
	SwiftGrammarParserRULE_blockinterno              = 3
	SwiftGrammarParserRULE_instructionint            = 4
	SwiftGrammarParserRULE_declavarible              = 5
	SwiftGrammarParserRULE_declaconstante            = 6
	SwiftGrammarParserRULE_asignacionvariable        = 7
	SwiftGrammarParserRULE_printstmtint              = 8
	SwiftGrammarParserRULE_declavaribleint           = 9
	SwiftGrammarParserRULE_declaconstanteint         = 10
	SwiftGrammarParserRULE_asignacionvariableint     = 11
	SwiftGrammarParserRULE_tipodato                  = 12
	SwiftGrammarParserRULE_expr                      = 13
	SwiftGrammarParserRULE_sentenciaifelse           = 14
	SwiftGrammarParserRULE_switchcontrol             = 15
	SwiftGrammarParserRULE_blockcase                 = 16
	SwiftGrammarParserRULE_bloquecase                = 17
	SwiftGrammarParserRULE_whilecontrol              = 18
	SwiftGrammarParserRULE_forcontrol                = 19
	SwiftGrammarParserRULE_guardcontrol              = 20
	SwiftGrammarParserRULE_continuee                 = 21
	SwiftGrammarParserRULE_breakk                    = 22
	SwiftGrammarParserRULE_retornos                  = 23
	SwiftGrammarParserRULE_vectorcontrol             = 24
	SwiftGrammarParserRULE_blockparams               = 25
	SwiftGrammarParserRULE_bloqueparams              = 26
	SwiftGrammarParserRULE_vectoragregar             = 27
	SwiftGrammarParserRULE_vectorremover             = 28
	SwiftGrammarParserRULE_vectorvacio               = 29
	SwiftGrammarParserRULE_vectorcount               = 30
	SwiftGrammarParserRULE_vectoraccess              = 31
	SwiftGrammarParserRULE_funciondeclaracioncontrol = 32
	SwiftGrammarParserRULE_listaparametros           = 33
	SwiftGrammarParserRULE_funcionllamadacontrol     = 34
	SwiftGrammarParserRULE_listaparametrosllamada    = 35
	SwiftGrammarParserRULE_printstmt                 = 36
	SwiftGrammarParserRULE_intembebida               = 37
	SwiftGrammarParserRULE_floatembebida             = 38
	SwiftGrammarParserRULE_stringembebida            = 39
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
		p.SetState(80)

		var _x = p.Block()

		localctx.(*SContext)._block = _x
	}
	{
		p.SetState(81)
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
	p.SetState(85)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&274918025984) != 0) {
		{
			p.SetState(84)

			var _x = p.Instruction()

			localctx.(*BlockContext)._instruction = _x
		}
		localctx.(*BlockContext).ins = append(localctx.(*BlockContext).ins, localctx.(*BlockContext)._instruction)

		p.SetState(87)
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

	// Get_declavarible returns the _declavarible rule contexts.
	Get_declavarible() IDeclavaribleContext

	// Get_declaconstante returns the _declaconstante rule contexts.
	Get_declaconstante() IDeclaconstanteContext

	// Get_asignacionvariable returns the _asignacionvariable rule contexts.
	Get_asignacionvariable() IAsignacionvariableContext

	// Get_sentenciaifelse returns the _sentenciaifelse rule contexts.
	Get_sentenciaifelse() ISentenciaifelseContext

	// Get_switchcontrol returns the _switchcontrol rule contexts.
	Get_switchcontrol() ISwitchcontrolContext

	// Get_whilecontrol returns the _whilecontrol rule contexts.
	Get_whilecontrol() IWhilecontrolContext

	// Get_forcontrol returns the _forcontrol rule contexts.
	Get_forcontrol() IForcontrolContext

	// Get_guardcontrol returns the _guardcontrol rule contexts.
	Get_guardcontrol() IGuardcontrolContext

	// Get_vectorcontrol returns the _vectorcontrol rule contexts.
	Get_vectorcontrol() IVectorcontrolContext

	// Get_vectoragregar returns the _vectoragregar rule contexts.
	Get_vectoragregar() IVectoragregarContext

	// Get_vectorremover returns the _vectorremover rule contexts.
	Get_vectorremover() IVectorremoverContext

	// Get_printstmt returns the _printstmt rule contexts.
	Get_printstmt() IPrintstmtContext

	// Set_declavarible sets the _declavarible rule contexts.
	Set_declavarible(IDeclavaribleContext)

	// Set_declaconstante sets the _declaconstante rule contexts.
	Set_declaconstante(IDeclaconstanteContext)

	// Set_asignacionvariable sets the _asignacionvariable rule contexts.
	Set_asignacionvariable(IAsignacionvariableContext)

	// Set_sentenciaifelse sets the _sentenciaifelse rule contexts.
	Set_sentenciaifelse(ISentenciaifelseContext)

	// Set_switchcontrol sets the _switchcontrol rule contexts.
	Set_switchcontrol(ISwitchcontrolContext)

	// Set_whilecontrol sets the _whilecontrol rule contexts.
	Set_whilecontrol(IWhilecontrolContext)

	// Set_forcontrol sets the _forcontrol rule contexts.
	Set_forcontrol(IForcontrolContext)

	// Set_guardcontrol sets the _guardcontrol rule contexts.
	Set_guardcontrol(IGuardcontrolContext)

	// Set_vectorcontrol sets the _vectorcontrol rule contexts.
	Set_vectorcontrol(IVectorcontrolContext)

	// Set_vectoragregar sets the _vectoragregar rule contexts.
	Set_vectoragregar(IVectoragregarContext)

	// Set_vectorremover sets the _vectorremover rule contexts.
	Set_vectorremover(IVectorremoverContext)

	// Set_printstmt sets the _printstmt rule contexts.
	Set_printstmt(IPrintstmtContext)

	// GetInst returns the inst attribute.
	GetInst() interfaces.Instruction

	// SetInst sets the inst attribute.
	SetInst(interfaces.Instruction)

	// Getter signatures
	Declavarible() IDeclavaribleContext
	PUNTOCOMA() antlr.TerminalNode
	Declaconstante() IDeclaconstanteContext
	Asignacionvariable() IAsignacionvariableContext
	Sentenciaifelse() ISentenciaifelseContext
	Switchcontrol() ISwitchcontrolContext
	Whilecontrol() IWhilecontrolContext
	Forcontrol() IForcontrolContext
	Guardcontrol() IGuardcontrolContext
	Vectorcontrol() IVectorcontrolContext
	Vectoragregar() IVectoragregarContext
	Vectorremover() IVectorremoverContext
	Printstmt() IPrintstmtContext

	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	antlr.BaseParserRuleContext
	parser              antlr.Parser
	inst                interfaces.Instruction
	_declavarible       IDeclavaribleContext
	_declaconstante     IDeclaconstanteContext
	_asignacionvariable IAsignacionvariableContext
	_sentenciaifelse    ISentenciaifelseContext
	_switchcontrol      ISwitchcontrolContext
	_whilecontrol       IWhilecontrolContext
	_forcontrol         IForcontrolContext
	_guardcontrol       IGuardcontrolContext
	_vectorcontrol      IVectorcontrolContext
	_vectoragregar      IVectoragregarContext
	_vectorremover      IVectorremoverContext
	_printstmt          IPrintstmtContext
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

func (s *InstructionContext) Get_declavarible() IDeclavaribleContext { return s._declavarible }

func (s *InstructionContext) Get_declaconstante() IDeclaconstanteContext { return s._declaconstante }

func (s *InstructionContext) Get_asignacionvariable() IAsignacionvariableContext {
	return s._asignacionvariable
}

func (s *InstructionContext) Get_sentenciaifelse() ISentenciaifelseContext { return s._sentenciaifelse }

func (s *InstructionContext) Get_switchcontrol() ISwitchcontrolContext { return s._switchcontrol }

func (s *InstructionContext) Get_whilecontrol() IWhilecontrolContext { return s._whilecontrol }

func (s *InstructionContext) Get_forcontrol() IForcontrolContext { return s._forcontrol }

func (s *InstructionContext) Get_guardcontrol() IGuardcontrolContext { return s._guardcontrol }

func (s *InstructionContext) Get_vectorcontrol() IVectorcontrolContext { return s._vectorcontrol }

func (s *InstructionContext) Get_vectoragregar() IVectoragregarContext { return s._vectoragregar }

func (s *InstructionContext) Get_vectorremover() IVectorremoverContext { return s._vectorremover }

func (s *InstructionContext) Get_printstmt() IPrintstmtContext { return s._printstmt }

func (s *InstructionContext) Set_declavarible(v IDeclavaribleContext) { s._declavarible = v }

func (s *InstructionContext) Set_declaconstante(v IDeclaconstanteContext) { s._declaconstante = v }

func (s *InstructionContext) Set_asignacionvariable(v IAsignacionvariableContext) {
	s._asignacionvariable = v
}

func (s *InstructionContext) Set_sentenciaifelse(v ISentenciaifelseContext) { s._sentenciaifelse = v }

func (s *InstructionContext) Set_switchcontrol(v ISwitchcontrolContext) { s._switchcontrol = v }

func (s *InstructionContext) Set_whilecontrol(v IWhilecontrolContext) { s._whilecontrol = v }

func (s *InstructionContext) Set_forcontrol(v IForcontrolContext) { s._forcontrol = v }

func (s *InstructionContext) Set_guardcontrol(v IGuardcontrolContext) { s._guardcontrol = v }

func (s *InstructionContext) Set_vectorcontrol(v IVectorcontrolContext) { s._vectorcontrol = v }

func (s *InstructionContext) Set_vectoragregar(v IVectoragregarContext) { s._vectoragregar = v }

func (s *InstructionContext) Set_vectorremover(v IVectorremoverContext) { s._vectorremover = v }

func (s *InstructionContext) Set_printstmt(v IPrintstmtContext) { s._printstmt = v }

func (s *InstructionContext) GetInst() interfaces.Instruction { return s.inst }

func (s *InstructionContext) SetInst(v interfaces.Instruction) { s.inst = v }

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

func (s *InstructionContext) PUNTOCOMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTOCOMA, 0)
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

func (s *InstructionContext) Switchcontrol() ISwitchcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISwitchcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISwitchcontrolContext)
}

func (s *InstructionContext) Whilecontrol() IWhilecontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IWhilecontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IWhilecontrolContext)
}

func (s *InstructionContext) Forcontrol() IForcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IForcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IForcontrolContext)
}

func (s *InstructionContext) Guardcontrol() IGuardcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IGuardcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IGuardcontrolContext)
}

func (s *InstructionContext) Vectorcontrol() IVectorcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectorcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectorcontrolContext)
}

func (s *InstructionContext) Vectoragregar() IVectoragregarContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectoragregarContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectoragregarContext)
}

func (s *InstructionContext) Vectorremover() IVectorremoverContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectorremoverContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectorremoverContext)
}

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

	p.SetState(142)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 6, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(91)

			var _x = p.Declavarible()

			localctx.(*InstructionContext)._declavarible = _x
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
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_declavarible().GetDecvbl()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(97)

			var _x = p.Declaconstante()

			localctx.(*InstructionContext)._declaconstante = _x
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
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_declaconstante().GetDeccon()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(103)

			var _x = p.Asignacionvariable()

			localctx.(*InstructionContext)._asignacionvariable = _x
		}
		p.SetState(105)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(104)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_asignacionvariable().GetAsgvbl()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(109)

			var _x = p.Sentenciaifelse()

			localctx.(*InstructionContext)._sentenciaifelse = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_sentenciaifelse().GetMyIfElse()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(112)

			var _x = p.Switchcontrol()

			localctx.(*InstructionContext)._switchcontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_switchcontrol().GetMySwitch()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(115)

			var _x = p.Whilecontrol()

			localctx.(*InstructionContext)._whilecontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_whilecontrol().GetWhict()

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(118)

			var _x = p.Forcontrol()

			localctx.(*InstructionContext)._forcontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_forcontrol().GetForct()

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(121)

			var _x = p.Guardcontrol()

			localctx.(*InstructionContext)._guardcontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_guardcontrol().GetGuct()

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(124)

			var _x = p.Vectorcontrol()

			localctx.(*InstructionContext)._vectorcontrol = _x
		}
		p.SetState(126)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(125)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_vectorcontrol().GetVect()

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(130)

			var _x = p.Vectoragregar()

			localctx.(*InstructionContext)._vectoragregar = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_vectoragregar().GetVeadct()

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(133)

			var _x = p.Vectorremover()

			localctx.(*InstructionContext)._vectorremover = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_vectorremover().GetVermct()

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(136)

			var _x = p.Printstmt()

			localctx.(*InstructionContext)._printstmt = _x
		}
		p.SetState(138)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(137)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_printstmt().GetPrnt()

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
	p.SetState(145)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&274926611200) != 0) {
		{
			p.SetState(144)

			var _x = p.Instructionint()

			localctx.(*BlockinternoContext)._instructionint = _x
		}
		localctx.(*BlockinternoContext).insint = append(localctx.(*BlockinternoContext).insint, localctx.(*BlockinternoContext)._instructionint)

		p.SetState(147)
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

	// Get_declavaribleint returns the _declavaribleint rule contexts.
	Get_declavaribleint() IDeclavaribleintContext

	// Get_declaconstanteint returns the _declaconstanteint rule contexts.
	Get_declaconstanteint() IDeclaconstanteintContext

	// Get_asignacionvariableint returns the _asignacionvariableint rule contexts.
	Get_asignacionvariableint() IAsignacionvariableintContext

	// Get_sentenciaifelse returns the _sentenciaifelse rule contexts.
	Get_sentenciaifelse() ISentenciaifelseContext

	// Get_switchcontrol returns the _switchcontrol rule contexts.
	Get_switchcontrol() ISwitchcontrolContext

	// Get_whilecontrol returns the _whilecontrol rule contexts.
	Get_whilecontrol() IWhilecontrolContext

	// Get_forcontrol returns the _forcontrol rule contexts.
	Get_forcontrol() IForcontrolContext

	// Get_guardcontrol returns the _guardcontrol rule contexts.
	Get_guardcontrol() IGuardcontrolContext

	// Get_continuee returns the _continuee rule contexts.
	Get_continuee() IContinueeContext

	// Get_breakk returns the _breakk rule contexts.
	Get_breakk() IBreakkContext

	// Get_retornos returns the _retornos rule contexts.
	Get_retornos() IRetornosContext

	// Get_vectorcontrol returns the _vectorcontrol rule contexts.
	Get_vectorcontrol() IVectorcontrolContext

	// Get_vectoragregar returns the _vectoragregar rule contexts.
	Get_vectoragregar() IVectoragregarContext

	// Get_vectorremover returns the _vectorremover rule contexts.
	Get_vectorremover() IVectorremoverContext

	// Get_printstmtint returns the _printstmtint rule contexts.
	Get_printstmtint() IPrintstmtintContext

	// Set_declavaribleint sets the _declavaribleint rule contexts.
	Set_declavaribleint(IDeclavaribleintContext)

	// Set_declaconstanteint sets the _declaconstanteint rule contexts.
	Set_declaconstanteint(IDeclaconstanteintContext)

	// Set_asignacionvariableint sets the _asignacionvariableint rule contexts.
	Set_asignacionvariableint(IAsignacionvariableintContext)

	// Set_sentenciaifelse sets the _sentenciaifelse rule contexts.
	Set_sentenciaifelse(ISentenciaifelseContext)

	// Set_switchcontrol sets the _switchcontrol rule contexts.
	Set_switchcontrol(ISwitchcontrolContext)

	// Set_whilecontrol sets the _whilecontrol rule contexts.
	Set_whilecontrol(IWhilecontrolContext)

	// Set_forcontrol sets the _forcontrol rule contexts.
	Set_forcontrol(IForcontrolContext)

	// Set_guardcontrol sets the _guardcontrol rule contexts.
	Set_guardcontrol(IGuardcontrolContext)

	// Set_continuee sets the _continuee rule contexts.
	Set_continuee(IContinueeContext)

	// Set_breakk sets the _breakk rule contexts.
	Set_breakk(IBreakkContext)

	// Set_retornos sets the _retornos rule contexts.
	Set_retornos(IRetornosContext)

	// Set_vectorcontrol sets the _vectorcontrol rule contexts.
	Set_vectorcontrol(IVectorcontrolContext)

	// Set_vectoragregar sets the _vectoragregar rule contexts.
	Set_vectoragregar(IVectoragregarContext)

	// Set_vectorremover sets the _vectorremover rule contexts.
	Set_vectorremover(IVectorremoverContext)

	// Set_printstmtint sets the _printstmtint rule contexts.
	Set_printstmtint(IPrintstmtintContext)

	// GetInsint returns the insint attribute.
	GetInsint() interfaces.Instruction

	// SetInsint sets the insint attribute.
	SetInsint(interfaces.Instruction)

	// Getter signatures
	Declavaribleint() IDeclavaribleintContext
	PUNTOCOMA() antlr.TerminalNode
	Declaconstanteint() IDeclaconstanteintContext
	Asignacionvariableint() IAsignacionvariableintContext
	Sentenciaifelse() ISentenciaifelseContext
	Switchcontrol() ISwitchcontrolContext
	Whilecontrol() IWhilecontrolContext
	Forcontrol() IForcontrolContext
	Guardcontrol() IGuardcontrolContext
	Continuee() IContinueeContext
	Breakk() IBreakkContext
	Retornos() IRetornosContext
	Vectorcontrol() IVectorcontrolContext
	Vectoragregar() IVectoragregarContext
	Vectorremover() IVectorremoverContext
	Printstmtint() IPrintstmtintContext

	// IsInstructionintContext differentiates from other interfaces.
	IsInstructionintContext()
}

type InstructionintContext struct {
	antlr.BaseParserRuleContext
	parser                 antlr.Parser
	insint                 interfaces.Instruction
	_declavaribleint       IDeclavaribleintContext
	_declaconstanteint     IDeclaconstanteintContext
	_asignacionvariableint IAsignacionvariableintContext
	_sentenciaifelse       ISentenciaifelseContext
	_switchcontrol         ISwitchcontrolContext
	_whilecontrol          IWhilecontrolContext
	_forcontrol            IForcontrolContext
	_guardcontrol          IGuardcontrolContext
	_continuee             IContinueeContext
	_breakk                IBreakkContext
	_retornos              IRetornosContext
	_vectorcontrol         IVectorcontrolContext
	_vectoragregar         IVectoragregarContext
	_vectorremover         IVectorremoverContext
	_printstmtint          IPrintstmtintContext
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

func (s *InstructionintContext) Get_switchcontrol() ISwitchcontrolContext { return s._switchcontrol }

func (s *InstructionintContext) Get_whilecontrol() IWhilecontrolContext { return s._whilecontrol }

func (s *InstructionintContext) Get_forcontrol() IForcontrolContext { return s._forcontrol }

func (s *InstructionintContext) Get_guardcontrol() IGuardcontrolContext { return s._guardcontrol }

func (s *InstructionintContext) Get_continuee() IContinueeContext { return s._continuee }

func (s *InstructionintContext) Get_breakk() IBreakkContext { return s._breakk }

func (s *InstructionintContext) Get_retornos() IRetornosContext { return s._retornos }

func (s *InstructionintContext) Get_vectorcontrol() IVectorcontrolContext { return s._vectorcontrol }

func (s *InstructionintContext) Get_vectoragregar() IVectoragregarContext { return s._vectoragregar }

func (s *InstructionintContext) Get_vectorremover() IVectorremoverContext { return s._vectorremover }

func (s *InstructionintContext) Get_printstmtint() IPrintstmtintContext { return s._printstmtint }

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

func (s *InstructionintContext) Set_switchcontrol(v ISwitchcontrolContext) { s._switchcontrol = v }

func (s *InstructionintContext) Set_whilecontrol(v IWhilecontrolContext) { s._whilecontrol = v }

func (s *InstructionintContext) Set_forcontrol(v IForcontrolContext) { s._forcontrol = v }

func (s *InstructionintContext) Set_guardcontrol(v IGuardcontrolContext) { s._guardcontrol = v }

func (s *InstructionintContext) Set_continuee(v IContinueeContext) { s._continuee = v }

func (s *InstructionintContext) Set_breakk(v IBreakkContext) { s._breakk = v }

func (s *InstructionintContext) Set_retornos(v IRetornosContext) { s._retornos = v }

func (s *InstructionintContext) Set_vectorcontrol(v IVectorcontrolContext) { s._vectorcontrol = v }

func (s *InstructionintContext) Set_vectoragregar(v IVectoragregarContext) { s._vectoragregar = v }

func (s *InstructionintContext) Set_vectorremover(v IVectorremoverContext) { s._vectorremover = v }

func (s *InstructionintContext) Set_printstmtint(v IPrintstmtintContext) { s._printstmtint = v }

func (s *InstructionintContext) GetInsint() interfaces.Instruction { return s.insint }

func (s *InstructionintContext) SetInsint(v interfaces.Instruction) { s.insint = v }

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

func (s *InstructionintContext) PUNTOCOMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTOCOMA, 0)
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

func (s *InstructionintContext) Switchcontrol() ISwitchcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ISwitchcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ISwitchcontrolContext)
}

func (s *InstructionintContext) Whilecontrol() IWhilecontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IWhilecontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IWhilecontrolContext)
}

func (s *InstructionintContext) Forcontrol() IForcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IForcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IForcontrolContext)
}

func (s *InstructionintContext) Guardcontrol() IGuardcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IGuardcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IGuardcontrolContext)
}

func (s *InstructionintContext) Continuee() IContinueeContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IContinueeContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IContinueeContext)
}

func (s *InstructionintContext) Breakk() IBreakkContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBreakkContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBreakkContext)
}

func (s *InstructionintContext) Retornos() IRetornosContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IRetornosContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IRetornosContext)
}

func (s *InstructionintContext) Vectorcontrol() IVectorcontrolContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectorcontrolContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectorcontrolContext)
}

func (s *InstructionintContext) Vectoragregar() IVectoragregarContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectoragregarContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectoragregarContext)
}

func (s *InstructionintContext) Vectorremover() IVectorremoverContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectorremoverContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectorremoverContext)
}

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

	p.SetState(226)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 18, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(151)

			var _x = p.Declavaribleint()

			localctx.(*InstructionintContext)._declavaribleint = _x
		}
		p.SetState(153)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(152)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_declavaribleint().GetDecvbl()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(157)

			var _x = p.Declaconstanteint()

			localctx.(*InstructionintContext)._declaconstanteint = _x
		}
		p.SetState(159)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(158)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_declaconstanteint().GetDeccon()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(163)

			var _x = p.Asignacionvariableint()

			localctx.(*InstructionintContext)._asignacionvariableint = _x
		}
		p.SetState(165)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(164)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_asignacionvariableint().GetAsgvbl()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(169)

			var _x = p.Sentenciaifelse()

			localctx.(*InstructionintContext)._sentenciaifelse = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_sentenciaifelse().GetMyIfElse()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(172)

			var _x = p.Switchcontrol()

			localctx.(*InstructionintContext)._switchcontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_switchcontrol().GetMySwitch()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(175)

			var _x = p.Whilecontrol()

			localctx.(*InstructionintContext)._whilecontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_whilecontrol().GetWhict()

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(178)

			var _x = p.Forcontrol()

			localctx.(*InstructionintContext)._forcontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_forcontrol().GetForct()

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(181)

			var _x = p.Guardcontrol()

			localctx.(*InstructionintContext)._guardcontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_guardcontrol().GetGuct()

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(184)

			var _x = p.Continuee()

			localctx.(*InstructionintContext)._continuee = _x
		}
		p.SetState(186)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(185)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_continuee().GetCoct()

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(190)

			var _x = p.Breakk()

			localctx.(*InstructionintContext)._breakk = _x
		}
		p.SetState(192)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(191)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_breakk().GetBrkct()

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(196)

			var _x = p.Retornos()

			localctx.(*InstructionintContext)._retornos = _x
		}
		p.SetState(198)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(197)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_retornos().GetRect()

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(202)

			var _x = p.Vectorcontrol()

			localctx.(*InstructionintContext)._vectorcontrol = _x
		}
		p.SetState(204)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(203)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_vectorcontrol().GetVect()

	case 13:
		p.EnterOuterAlt(localctx, 13)
		{
			p.SetState(208)

			var _x = p.Vectoragregar()

			localctx.(*InstructionintContext)._vectoragregar = _x
		}
		p.SetState(210)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(209)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_vectoragregar().GetVeadct()

	case 14:
		p.EnterOuterAlt(localctx, 14)
		{
			p.SetState(214)

			var _x = p.Vectorremover()

			localctx.(*InstructionintContext)._vectorremover = _x
		}
		p.SetState(216)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(215)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_vectorremover().GetVermct()

	case 15:
		p.EnterOuterAlt(localctx, 15)
		{
			p.SetState(220)

			var _x = p.Printstmtint()

			localctx.(*InstructionintContext)._printstmtint = _x
		}
		p.SetState(222)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(221)
				p.Match(SwiftGrammarParserPUNTOCOMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_printstmtint().GetPrnt()

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
	p.EnterRule(localctx, 10, SwiftGrammarParserRULE_declavarible)
	p.SetState(249)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 19, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(228)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(229)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(230)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(231)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleContext)._tipodato = _x
		}
		{
			p.SetState(232)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(233)

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
		}()), localctx.(*DeclavaribleContext).Get_tipodato().GetTipo(), localctx.(*DeclavaribleContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(236)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(237)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(238)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(239)

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
		}()), localctx.(*DeclavaribleContext).Get_expr().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(242)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(243)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(244)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(245)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleContext)._tipodato = _x
		}
		{
			p.SetState(246)
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
		}()), localctx.(*DeclavaribleContext).Get_tipodato().GetTipo())

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
	p.EnterRule(localctx, 12, SwiftGrammarParserRULE_declaconstante)
	p.SetState(265)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 20, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(251)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(252)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(253)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(254)

			var _x = p.Tipodato()

			localctx.(*DeclaconstanteContext)._tipodato = _x
		}
		{
			p.SetState(255)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(256)

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
		}()), localctx.(*DeclaconstanteContext).Get_tipodato().GetTipo(), localctx.(*DeclaconstanteContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(259)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(260)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(261)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(262)

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
		}()), localctx.(*DeclaconstanteContext).Get_expr().GetE())

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
	p.EnterRule(localctx, 14, SwiftGrammarParserRULE_asignacionvariable)
	p.SetState(282)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 21, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(267)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(268)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(269)

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
			p.SetState(272)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(273)
			p.Match(SwiftGrammarParserSUMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(274)

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
			p.SetState(277)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(278)
			p.Match(SwiftGrammarParserRESTA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(279)

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
	p.EnterRule(localctx, 16, SwiftGrammarParserRULE_printstmtint)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(284)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtintContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(285)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(286)

		var _x = p.expr(0)

		localctx.(*PrintstmtintContext)._expr = _x
	}
	{
		p.SetState(287)
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
	p.EnterRule(localctx, 18, SwiftGrammarParserRULE_declavaribleint)
	p.SetState(311)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 22, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(290)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(291)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(292)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(293)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleintContext)._tipodato = _x
		}
		{
			p.SetState(294)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(295)

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
		}()), localctx.(*DeclavaribleintContext).Get_tipodato().GetTipo(), localctx.(*DeclavaribleintContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(298)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(299)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(300)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(301)

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
		}()), localctx.(*DeclavaribleintContext).Get_expr().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(304)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(305)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(306)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(307)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleintContext)._tipodato = _x
		}
		{
			p.SetState(308)
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
		}()), localctx.(*DeclavaribleintContext).Get_tipodato().GetTipo())

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
	p.EnterRule(localctx, 20, SwiftGrammarParserRULE_declaconstanteint)
	p.SetState(327)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 23, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(313)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteintContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(314)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(315)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(316)

			var _x = p.Tipodato()

			localctx.(*DeclaconstanteintContext)._tipodato = _x
		}
		{
			p.SetState(317)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(318)

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
		}()), localctx.(*DeclaconstanteintContext).Get_tipodato().GetTipo(), localctx.(*DeclaconstanteintContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(321)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteintContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(322)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(323)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(324)

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
		}()), localctx.(*DeclaconstanteintContext).Get_expr().GetE())

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
	p.EnterRule(localctx, 22, SwiftGrammarParserRULE_asignacionvariableint)
	p.SetState(344)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 24, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(329)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(330)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(331)

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
			p.SetState(334)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(335)
			p.Match(SwiftGrammarParserSUMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(336)

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
			p.SetState(339)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(340)
			p.Match(SwiftGrammarParserRESTA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(341)

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
	p.EnterRule(localctx, 24, SwiftGrammarParserRULE_tipodato)
	p.SetState(356)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserT__0:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(346)
			p.Match(SwiftGrammarParserT__0)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*TipodatoContext).tipo = environment.INTEGER

	case SwiftGrammarParserFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(348)
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
			p.SetState(350)
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
			p.SetState(352)
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
			p.SetState(354)
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

	// Get_vectorvacio returns the _vectorvacio rule contexts.
	Get_vectorvacio() IVectorvacioContext

	// Get_vectorcount returns the _vectorcount rule contexts.
	Get_vectorcount() IVectorcountContext

	// Get_vectoraccess returns the _vectoraccess rule contexts.
	Get_vectoraccess() IVectoraccessContext

	// Get_intembebida returns the _intembebida rule contexts.
	Get_intembebida() IIntembebidaContext

	// Get_floatembebida returns the _floatembebida rule contexts.
	Get_floatembebida() IFloatembebidaContext

	// Get_stringembebida returns the _stringembebida rule contexts.
	Get_stringembebida() IStringembebidaContext

	// SetLeft sets the left rule contexts.
	SetLeft(IExprContext)

	// SetRight sets the right rule contexts.
	SetRight(IExprContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_vectorvacio sets the _vectorvacio rule contexts.
	Set_vectorvacio(IVectorvacioContext)

	// Set_vectorcount sets the _vectorcount rule contexts.
	Set_vectorcount(IVectorcountContext)

	// Set_vectoraccess sets the _vectoraccess rule contexts.
	Set_vectoraccess(IVectoraccessContext)

	// Set_intembebida sets the _intembebida rule contexts.
	Set_intembebida(IIntembebidaContext)

	// Set_floatembebida sets the _floatembebida rule contexts.
	Set_floatembebida(IFloatembebidaContext)

	// Set_stringembebida sets the _stringembebida rule contexts.
	Set_stringembebida(IStringembebidaContext)

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
	SUB() antlr.TerminalNode
	NUMBER() antlr.TerminalNode
	CADENA() antlr.TerminalNode
	TRU() antlr.TerminalNode
	FAL() antlr.TerminalNode
	CHARACTER() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	NULO() antlr.TerminalNode
	Vectorvacio() IVectorvacioContext
	Vectorcount() IVectorcountContext
	Vectoraccess() IVectoraccessContext
	Intembebida() IIntembebidaContext
	Floatembebida() IFloatembebidaContext
	Stringembebida() IStringembebidaContext
	MODULO() antlr.TerminalNode
	MUL() antlr.TerminalNode
	DIV() antlr.TerminalNode
	ADD() antlr.TerminalNode
	MAY_IG() antlr.TerminalNode
	MAYOR() antlr.TerminalNode
	MEN_IG() antlr.TerminalNode
	MENOR() antlr.TerminalNode
	IG_IG() antlr.TerminalNode
	DIF() antlr.TerminalNode
	AND() antlr.TerminalNode
	OR() antlr.TerminalNode

	// IsExprContext differentiates from other interfaces.
	IsExprContext()
}

type ExprContext struct {
	antlr.BaseParserRuleContext
	parser          antlr.Parser
	e               interfaces.Expression
	left            IExprContext
	op              antlr.Token
	right           IExprContext
	_expr           IExprContext
	_NUMBER         antlr.Token
	_CADENA         antlr.Token
	_TRU            antlr.Token
	_FAL            antlr.Token
	_CHARACTER      antlr.Token
	_ID_VALIDO      antlr.Token
	_NULO           antlr.Token
	_vectorvacio    IVectorvacioContext
	_vectorcount    IVectorcountContext
	_vectoraccess   IVectoraccessContext
	_intembebida    IIntembebidaContext
	_floatembebida  IFloatembebidaContext
	_stringembebida IStringembebidaContext
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

func (s *ExprContext) Get_vectorvacio() IVectorvacioContext { return s._vectorvacio }

func (s *ExprContext) Get_vectorcount() IVectorcountContext { return s._vectorcount }

func (s *ExprContext) Get_vectoraccess() IVectoraccessContext { return s._vectoraccess }

func (s *ExprContext) Get_intembebida() IIntembebidaContext { return s._intembebida }

func (s *ExprContext) Get_floatembebida() IFloatembebidaContext { return s._floatembebida }

func (s *ExprContext) Get_stringembebida() IStringembebidaContext { return s._stringembebida }

func (s *ExprContext) SetLeft(v IExprContext) { s.left = v }

func (s *ExprContext) SetRight(v IExprContext) { s.right = v }

func (s *ExprContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ExprContext) Set_vectorvacio(v IVectorvacioContext) { s._vectorvacio = v }

func (s *ExprContext) Set_vectorcount(v IVectorcountContext) { s._vectorcount = v }

func (s *ExprContext) Set_vectoraccess(v IVectoraccessContext) { s._vectoraccess = v }

func (s *ExprContext) Set_intembebida(v IIntembebidaContext) { s._intembebida = v }

func (s *ExprContext) Set_floatembebida(v IFloatembebidaContext) { s._floatembebida = v }

func (s *ExprContext) Set_stringembebida(v IStringembebidaContext) { s._stringembebida = v }

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

func (s *ExprContext) SUB() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSUB, 0)
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

func (s *ExprContext) Vectorvacio() IVectorvacioContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectorvacioContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectorvacioContext)
}

func (s *ExprContext) Vectorcount() IVectorcountContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectorcountContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectorcountContext)
}

func (s *ExprContext) Vectoraccess() IVectoraccessContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IVectoraccessContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IVectoraccessContext)
}

func (s *ExprContext) Intembebida() IIntembebidaContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IIntembebidaContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IIntembebidaContext)
}

func (s *ExprContext) Floatembebida() IFloatembebidaContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IFloatembebidaContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IFloatembebidaContext)
}

func (s *ExprContext) Stringembebida() IStringembebidaContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IStringembebidaContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IStringembebidaContext)
}

func (s *ExprContext) MODULO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserMODULO, 0)
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
	_startState := 26
	p.EnterRecursionRule(localctx, 26, SwiftGrammarParserRULE_expr, _p)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(403)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 26, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(359)

			var _m = p.Match(SwiftGrammarParserNOT)

			localctx.(*ExprContext).op = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(360)

			var _x = p.expr(24)

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

	case 2:
		{
			p.SetState(363)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(364)

			var _x = p.expr(0)

			localctx.(*ExprContext)._expr = _x
		}
		{
			p.SetState(365)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_expr().GetE()

	case 3:
		{
			p.SetState(368)
			p.Match(SwiftGrammarParserSUB)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(369)

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
			}()), -num3, environment.FLOAT)
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
			}()), -num, environment.INTEGER)
		}

	case 4:
		{
			p.SetState(371)

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

	case 5:
		{
			p.SetState(373)

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

	case 6:
		{
			p.SetState(375)

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

	case 7:
		{
			p.SetState(377)

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

	case 8:
		{
			p.SetState(379)

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

	case 9:
		{
			p.SetState(381)

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

	case 10:
		{
			p.SetState(383)

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

	case 11:
		{
			p.SetState(385)

			var _x = p.Vectorvacio()

			localctx.(*ExprContext)._vectorvacio = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_vectorvacio().GetVeemct()

	case 12:
		{
			p.SetState(388)

			var _x = p.Vectorcount()

			localctx.(*ExprContext)._vectorcount = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_vectorcount().GetVecnct()

	case 13:
		{
			p.SetState(391)

			var _x = p.Vectoraccess()

			localctx.(*ExprContext)._vectoraccess = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_vectoraccess().GetVepposct()

	case 14:
		{
			p.SetState(394)

			var _x = p.Intembebida()

			localctx.(*ExprContext)._intembebida = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_intembebida().GetIntemb()

	case 15:
		{
			p.SetState(397)

			var _x = p.Floatembebida()

			localctx.(*ExprContext)._floatembebida = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_floatembebida().GetFloemb()

	case 16:
		{
			p.SetState(400)

			var _x = p.Stringembebida()

			localctx.(*ExprContext)._stringembebida = _x
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_stringembebida().GetStremb()

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(447)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 28, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(445)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}

			switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 27, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(405)

				if !(p.Precpred(p.GetParserRuleContext(), 23)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 23)", ""))
					goto errorExit
				}
				{
					p.SetState(406)

					var _m = p.Match(SwiftGrammarParserMODULO)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(407)

					var _x = p.expr(24)

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
				p.SetState(410)

				if !(p.Precpred(p.GetParserRuleContext(), 22)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 22)", ""))
					goto errorExit
				}
				{
					p.SetState(411)

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
					p.SetState(412)

					var _x = p.expr(23)

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
				p.SetState(415)

				if !(p.Precpred(p.GetParserRuleContext(), 21)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 21)", ""))
					goto errorExit
				}
				{
					p.SetState(416)

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
					p.SetState(417)

					var _x = p.expr(22)

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
				p.SetState(420)

				if !(p.Precpred(p.GetParserRuleContext(), 20)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 20)", ""))
					goto errorExit
				}
				{
					p.SetState(421)

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
					p.SetState(422)

					var _x = p.expr(21)

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
				p.SetState(425)

				if !(p.Precpred(p.GetParserRuleContext(), 19)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 19)", ""))
					goto errorExit
				}
				{
					p.SetState(426)

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
					p.SetState(427)

					var _x = p.expr(20)

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
				p.SetState(430)

				if !(p.Precpred(p.GetParserRuleContext(), 18)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 18)", ""))
					goto errorExit
				}
				{
					p.SetState(431)

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
					p.SetState(432)

					var _x = p.expr(19)

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
				p.SetState(435)

				if !(p.Precpred(p.GetParserRuleContext(), 17)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 17)", ""))
					goto errorExit
				}
				{
					p.SetState(436)

					var _m = p.Match(SwiftGrammarParserAND)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(437)

					var _x = p.expr(18)

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
				p.SetState(440)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
					goto errorExit
				}
				{
					p.SetState(441)

					var _m = p.Match(SwiftGrammarParserOR)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(442)

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

			case antlr.ATNInvalidAltNumber:
				goto errorExit
			}

		}
		p.SetState(449)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 28, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 28, SwiftGrammarParserRULE_sentenciaifelse)
	p.SetState(477)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 29, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(450)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(451)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(452)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(453)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext)._blockinterno = _x
		}
		{
			p.SetState(454)
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
			p.SetState(457)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(458)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(459)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(460)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext).ifop = _x
		}
		{
			p.SetState(461)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(462)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(463)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(464)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext).elseop = _x
		}
		{
			p.SetState(465)
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
			p.SetState(468)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(469)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(470)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(471)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext)._blockinterno = _x
		}
		{
			p.SetState(472)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(473)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(474)

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

// ISwitchcontrolContext is an interface to support dynamic dispatch.
type ISwitchcontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_SWITCH returns the _SWITCH token.
	Get_SWITCH() antlr.Token

	// Get_DEFAULT returns the _DEFAULT token.
	Get_DEFAULT() antlr.Token

	// Set_SWITCH sets the _SWITCH token.
	Set_SWITCH(antlr.Token)

	// Set_DEFAULT sets the _DEFAULT token.
	Set_DEFAULT(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_blockcase returns the _blockcase rule contexts.
	Get_blockcase() IBlockcaseContext

	// Get_blockinterno returns the _blockinterno rule contexts.
	Get_blockinterno() IBlockinternoContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_blockcase sets the _blockcase rule contexts.
	Set_blockcase(IBlockcaseContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

	// GetMySwitch returns the mySwitch attribute.
	GetMySwitch() interfaces.Instruction

	// SetMySwitch sets the mySwitch attribute.
	SetMySwitch(interfaces.Instruction)

	// Getter signatures
	SWITCH() antlr.TerminalNode
	Expr() IExprContext
	LLAVEIZQ() antlr.TerminalNode
	Blockcase() IBlockcaseContext
	LLAVEDER() antlr.TerminalNode
	DEFAULT() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Blockinterno() IBlockinternoContext

	// IsSwitchcontrolContext differentiates from other interfaces.
	IsSwitchcontrolContext()
}

type SwitchcontrolContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	mySwitch      interfaces.Instruction
	_SWITCH       antlr.Token
	_expr         IExprContext
	_blockcase    IBlockcaseContext
	_DEFAULT      antlr.Token
	_blockinterno IBlockinternoContext
}

func NewEmptySwitchcontrolContext() *SwitchcontrolContext {
	var p = new(SwitchcontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_switchcontrol
	return p
}

func InitEmptySwitchcontrolContext(p *SwitchcontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_switchcontrol
}

func (*SwitchcontrolContext) IsSwitchcontrolContext() {}

func NewSwitchcontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SwitchcontrolContext {
	var p = new(SwitchcontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_switchcontrol

	return p
}

func (s *SwitchcontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *SwitchcontrolContext) Get_SWITCH() antlr.Token { return s._SWITCH }

func (s *SwitchcontrolContext) Get_DEFAULT() antlr.Token { return s._DEFAULT }

func (s *SwitchcontrolContext) Set_SWITCH(v antlr.Token) { s._SWITCH = v }

func (s *SwitchcontrolContext) Set_DEFAULT(v antlr.Token) { s._DEFAULT = v }

func (s *SwitchcontrolContext) Get_expr() IExprContext { return s._expr }

func (s *SwitchcontrolContext) Get_blockcase() IBlockcaseContext { return s._blockcase }

func (s *SwitchcontrolContext) Get_blockinterno() IBlockinternoContext { return s._blockinterno }

func (s *SwitchcontrolContext) Set_expr(v IExprContext) { s._expr = v }

func (s *SwitchcontrolContext) Set_blockcase(v IBlockcaseContext) { s._blockcase = v }

func (s *SwitchcontrolContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

func (s *SwitchcontrolContext) GetMySwitch() interfaces.Instruction { return s.mySwitch }

func (s *SwitchcontrolContext) SetMySwitch(v interfaces.Instruction) { s.mySwitch = v }

func (s *SwitchcontrolContext) SWITCH() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSWITCH, 0)
}

func (s *SwitchcontrolContext) Expr() IExprContext {
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

func (s *SwitchcontrolContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *SwitchcontrolContext) Blockcase() IBlockcaseContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockcaseContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockcaseContext)
}

func (s *SwitchcontrolContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *SwitchcontrolContext) DEFAULT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDEFAULT, 0)
}

func (s *SwitchcontrolContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *SwitchcontrolContext) Blockinterno() IBlockinternoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *SwitchcontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SwitchcontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SwitchcontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterSwitchcontrol(s)
	}
}

func (s *SwitchcontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitSwitchcontrol(s)
	}
}

func (p *SwiftGrammarParser) Switchcontrol() (localctx ISwitchcontrolContext) {
	localctx = NewSwitchcontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, SwiftGrammarParserRULE_switchcontrol)
	var _la int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(479)

		var _m = p.Match(SwiftGrammarParserSWITCH)

		localctx.(*SwitchcontrolContext)._SWITCH = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(480)

		var _x = p.expr(0)

		localctx.(*SwitchcontrolContext)._expr = _x
	}
	{
		p.SetState(481)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(482)

		var _x = p.Blockcase()

		localctx.(*SwitchcontrolContext)._blockcase = _x
	}
	p.SetState(486)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	if _la == SwiftGrammarParserDEFAULT {
		{
			p.SetState(483)

			var _m = p.Match(SwiftGrammarParserDEFAULT)

			localctx.(*SwitchcontrolContext)._DEFAULT = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(484)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(485)

			var _x = p.Blockinterno()

			localctx.(*SwitchcontrolContext)._blockinterno = _x
		}

	}
	{
		p.SetState(488)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

	if localctx.(*SwitchcontrolContext).Get_DEFAULT() != nil {
		localctx.(*SwitchcontrolContext).mySwitch = instructions.NewSentenciaSwitchDefault((func() int {
			if localctx.(*SwitchcontrolContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchcontrolContext).Get_SWITCH().GetLine()
			}
		}()), (func() int {
			if localctx.(*SwitchcontrolContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchcontrolContext).Get_SWITCH().GetColumn()
			}
		}()), localctx.(*SwitchcontrolContext).Get_expr().GetE(), localctx.(*SwitchcontrolContext).Get_blockcase().GetBlkcase(), localctx.(*SwitchcontrolContext).Get_blockinterno().GetBlkint())
	} else {
		localctx.(*SwitchcontrolContext).mySwitch = instructions.NewSentenciaSwitch((func() int {
			if localctx.(*SwitchcontrolContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchcontrolContext).Get_SWITCH().GetLine()
			}
		}()), (func() int {
			if localctx.(*SwitchcontrolContext).Get_SWITCH() == nil {
				return 0
			} else {
				return localctx.(*SwitchcontrolContext).Get_SWITCH().GetColumn()
			}
		}()), localctx.(*SwitchcontrolContext).Get_expr().GetE(), localctx.(*SwitchcontrolContext).Get_blockcase().GetBlkcase())
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

// IBlockcaseContext is an interface to support dynamic dispatch.
type IBlockcaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_bloquecase returns the _bloquecase rule contexts.
	Get_bloquecase() IBloquecaseContext

	// Set_bloquecase sets the _bloquecase rule contexts.
	Set_bloquecase(IBloquecaseContext)

	// GetBlocas returns the blocas rule context list.
	GetBlocas() []IBloquecaseContext

	// SetBlocas sets the blocas rule context list.
	SetBlocas([]IBloquecaseContext)

	// GetBlkcase returns the blkcase attribute.
	GetBlkcase() []interface{}

	// SetBlkcase sets the blkcase attribute.
	SetBlkcase([]interface{})

	// Getter signatures
	AllBloquecase() []IBloquecaseContext
	Bloquecase(i int) IBloquecaseContext

	// IsBlockcaseContext differentiates from other interfaces.
	IsBlockcaseContext()
}

type BlockcaseContext struct {
	antlr.BaseParserRuleContext
	parser      antlr.Parser
	blkcase     []interface{}
	_bloquecase IBloquecaseContext
	blocas      []IBloquecaseContext
}

func NewEmptyBlockcaseContext() *BlockcaseContext {
	var p = new(BlockcaseContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_blockcase
	return p
}

func InitEmptyBlockcaseContext(p *BlockcaseContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_blockcase
}

func (*BlockcaseContext) IsBlockcaseContext() {}

func NewBlockcaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BlockcaseContext {
	var p = new(BlockcaseContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_blockcase

	return p
}

func (s *BlockcaseContext) GetParser() antlr.Parser { return s.parser }

func (s *BlockcaseContext) Get_bloquecase() IBloquecaseContext { return s._bloquecase }

func (s *BlockcaseContext) Set_bloquecase(v IBloquecaseContext) { s._bloquecase = v }

func (s *BlockcaseContext) GetBlocas() []IBloquecaseContext { return s.blocas }

func (s *BlockcaseContext) SetBlocas(v []IBloquecaseContext) { s.blocas = v }

func (s *BlockcaseContext) GetBlkcase() []interface{} { return s.blkcase }

func (s *BlockcaseContext) SetBlkcase(v []interface{}) { s.blkcase = v }

func (s *BlockcaseContext) AllBloquecase() []IBloquecaseContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IBloquecaseContext); ok {
			len++
		}
	}

	tst := make([]IBloquecaseContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IBloquecaseContext); ok {
			tst[i] = t.(IBloquecaseContext)
			i++
		}
	}

	return tst
}

func (s *BlockcaseContext) Bloquecase(i int) IBloquecaseContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBloquecaseContext); ok {
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

	return t.(IBloquecaseContext)
}

func (s *BlockcaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BlockcaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BlockcaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBlockcase(s)
	}
}

func (s *BlockcaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBlockcase(s)
	}
}

func (p *SwiftGrammarParser) Blockcase() (localctx IBlockcaseContext) {
	localctx = NewBlockcaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 32, SwiftGrammarParserRULE_blockcase)

	localctx.(*BlockcaseContext).blkcase = []interface{}{}
	var listInt []IBloquecaseContext

	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(492)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = _la == SwiftGrammarParserCASE {
		{
			p.SetState(491)

			var _x = p.Bloquecase()

			localctx.(*BlockcaseContext)._bloquecase = _x
		}
		localctx.(*BlockcaseContext).blocas = append(localctx.(*BlockcaseContext).blocas, localctx.(*BlockcaseContext)._bloquecase)

		p.SetState(494)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}

	listInt = localctx.(*BlockcaseContext).GetBlocas()
	for _, e := range listInt {
		localctx.(*BlockcaseContext).blkcase = append(localctx.(*BlockcaseContext).blkcase, e.GetBlocas())
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

// IBloquecaseContext is an interface to support dynamic dispatch.
type IBloquecaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_CASE returns the _CASE token.
	Get_CASE() antlr.Token

	// Set_CASE sets the _CASE token.
	Set_CASE(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_blockinterno returns the _blockinterno rule contexts.
	Get_blockinterno() IBlockinternoContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

	// GetBlocas returns the blocas attribute.
	GetBlocas() interfaces.Instruction

	// SetBlocas sets the blocas attribute.
	SetBlocas(interfaces.Instruction)

	// Getter signatures
	CASE() antlr.TerminalNode
	Expr() IExprContext
	DOS_PUNTOS() antlr.TerminalNode
	Blockinterno() IBlockinternoContext

	// IsBloquecaseContext differentiates from other interfaces.
	IsBloquecaseContext()
}

type BloquecaseContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	blocas        interfaces.Instruction
	_CASE         antlr.Token
	_expr         IExprContext
	_blockinterno IBlockinternoContext
}

func NewEmptyBloquecaseContext() *BloquecaseContext {
	var p = new(BloquecaseContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_bloquecase
	return p
}

func InitEmptyBloquecaseContext(p *BloquecaseContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_bloquecase
}

func (*BloquecaseContext) IsBloquecaseContext() {}

func NewBloquecaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BloquecaseContext {
	var p = new(BloquecaseContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_bloquecase

	return p
}

func (s *BloquecaseContext) GetParser() antlr.Parser { return s.parser }

func (s *BloquecaseContext) Get_CASE() antlr.Token { return s._CASE }

func (s *BloquecaseContext) Set_CASE(v antlr.Token) { s._CASE = v }

func (s *BloquecaseContext) Get_expr() IExprContext { return s._expr }

func (s *BloquecaseContext) Get_blockinterno() IBlockinternoContext { return s._blockinterno }

func (s *BloquecaseContext) Set_expr(v IExprContext) { s._expr = v }

func (s *BloquecaseContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

func (s *BloquecaseContext) GetBlocas() interfaces.Instruction { return s.blocas }

func (s *BloquecaseContext) SetBlocas(v interfaces.Instruction) { s.blocas = v }

func (s *BloquecaseContext) CASE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCASE, 0)
}

func (s *BloquecaseContext) Expr() IExprContext {
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

func (s *BloquecaseContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *BloquecaseContext) Blockinterno() IBlockinternoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *BloquecaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BloquecaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BloquecaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBloquecase(s)
	}
}

func (s *BloquecaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBloquecase(s)
	}
}

func (p *SwiftGrammarParser) Bloquecase() (localctx IBloquecaseContext) {
	localctx = NewBloquecaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 34, SwiftGrammarParserRULE_bloquecase)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(498)

		var _m = p.Match(SwiftGrammarParserCASE)

		localctx.(*BloquecaseContext)._CASE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(499)

		var _x = p.expr(0)

		localctx.(*BloquecaseContext)._expr = _x
	}
	{
		p.SetState(500)
		p.Match(SwiftGrammarParserDOS_PUNTOS)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(501)

		var _x = p.Blockinterno()

		localctx.(*BloquecaseContext)._blockinterno = _x
	}

	localctx.(*BloquecaseContext).blocas = instructions.NewSentenciaSwitchCase((func() int {
		if localctx.(*BloquecaseContext).Get_CASE() == nil {
			return 0
		} else {
			return localctx.(*BloquecaseContext).Get_CASE().GetLine()
		}
	}()), (func() int {
		if localctx.(*BloquecaseContext).Get_CASE() == nil {
			return 0
		} else {
			return localctx.(*BloquecaseContext).Get_CASE().GetColumn()
		}
	}()), localctx.(*BloquecaseContext).Get_expr().GetE(), localctx.(*BloquecaseContext).Get_blockinterno().GetBlkint())

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

// IWhilecontrolContext is an interface to support dynamic dispatch.
type IWhilecontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_WHILE returns the _WHILE token.
	Get_WHILE() antlr.Token

	// Set_WHILE sets the _WHILE token.
	Set_WHILE(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_blockinterno returns the _blockinterno rule contexts.
	Get_blockinterno() IBlockinternoContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

	// GetWhict returns the whict attribute.
	GetWhict() interfaces.Instruction

	// SetWhict sets the whict attribute.
	SetWhict(interfaces.Instruction)

	// Getter signatures
	WHILE() antlr.TerminalNode
	Expr() IExprContext
	LLAVEIZQ() antlr.TerminalNode
	Blockinterno() IBlockinternoContext
	LLAVEDER() antlr.TerminalNode

	// IsWhilecontrolContext differentiates from other interfaces.
	IsWhilecontrolContext()
}

type WhilecontrolContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	whict         interfaces.Instruction
	_WHILE        antlr.Token
	_expr         IExprContext
	_blockinterno IBlockinternoContext
}

func NewEmptyWhilecontrolContext() *WhilecontrolContext {
	var p = new(WhilecontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_whilecontrol
	return p
}

func InitEmptyWhilecontrolContext(p *WhilecontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_whilecontrol
}

func (*WhilecontrolContext) IsWhilecontrolContext() {}

func NewWhilecontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *WhilecontrolContext {
	var p = new(WhilecontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_whilecontrol

	return p
}

func (s *WhilecontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *WhilecontrolContext) Get_WHILE() antlr.Token { return s._WHILE }

func (s *WhilecontrolContext) Set_WHILE(v antlr.Token) { s._WHILE = v }

func (s *WhilecontrolContext) Get_expr() IExprContext { return s._expr }

func (s *WhilecontrolContext) Get_blockinterno() IBlockinternoContext { return s._blockinterno }

func (s *WhilecontrolContext) Set_expr(v IExprContext) { s._expr = v }

func (s *WhilecontrolContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

func (s *WhilecontrolContext) GetWhict() interfaces.Instruction { return s.whict }

func (s *WhilecontrolContext) SetWhict(v interfaces.Instruction) { s.whict = v }

func (s *WhilecontrolContext) WHILE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserWHILE, 0)
}

func (s *WhilecontrolContext) Expr() IExprContext {
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

func (s *WhilecontrolContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *WhilecontrolContext) Blockinterno() IBlockinternoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *WhilecontrolContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *WhilecontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *WhilecontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *WhilecontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterWhilecontrol(s)
	}
}

func (s *WhilecontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitWhilecontrol(s)
	}
}

func (p *SwiftGrammarParser) Whilecontrol() (localctx IWhilecontrolContext) {
	localctx = NewWhilecontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 36, SwiftGrammarParserRULE_whilecontrol)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(504)

		var _m = p.Match(SwiftGrammarParserWHILE)

		localctx.(*WhilecontrolContext)._WHILE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(505)

		var _x = p.expr(0)

		localctx.(*WhilecontrolContext)._expr = _x
	}
	{
		p.SetState(506)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(507)

		var _x = p.Blockinterno()

		localctx.(*WhilecontrolContext)._blockinterno = _x
	}
	{
		p.SetState(508)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*WhilecontrolContext).whict = instructions.NewSentenciaWhile((func() int {
		if localctx.(*WhilecontrolContext).Get_WHILE() == nil {
			return 0
		} else {
			return localctx.(*WhilecontrolContext).Get_WHILE().GetLine()
		}
	}()), (func() int {
		if localctx.(*WhilecontrolContext).Get_WHILE() == nil {
			return 0
		} else {
			return localctx.(*WhilecontrolContext).Get_WHILE().GetColumn()
		}
	}()), localctx.(*WhilecontrolContext).Get_expr().GetE(), localctx.(*WhilecontrolContext).Get_blockinterno().GetBlkint())

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

// IForcontrolContext is an interface to support dynamic dispatch.
type IForcontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_FOR returns the _FOR token.
	Get_FOR() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Set_FOR sets the _FOR token.
	Set_FOR(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// GetLeft returns the left rule contexts.
	GetLeft() IExprContext

	// GetRight returns the right rule contexts.
	GetRight() IExprContext

	// Get_blockinterno returns the _blockinterno rule contexts.
	Get_blockinterno() IBlockinternoContext

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// SetLeft sets the left rule contexts.
	SetLeft(IExprContext)

	// SetRight sets the right rule contexts.
	SetRight(IExprContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetForct returns the forct attribute.
	GetForct() interfaces.Instruction

	// SetForct sets the forct attribute.
	SetForct(interfaces.Instruction)

	// Getter signatures
	FOR() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	IN() antlr.TerminalNode
	RANGO() antlr.TerminalNode
	LLAVEIZQ() antlr.TerminalNode
	Blockinterno() IBlockinternoContext
	LLAVEDER() antlr.TerminalNode
	AllExpr() []IExprContext
	Expr(i int) IExprContext

	// IsForcontrolContext differentiates from other interfaces.
	IsForcontrolContext()
}

type ForcontrolContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	forct         interfaces.Instruction
	_FOR          antlr.Token
	_ID_VALIDO    antlr.Token
	left          IExprContext
	right         IExprContext
	_blockinterno IBlockinternoContext
	_expr         IExprContext
}

func NewEmptyForcontrolContext() *ForcontrolContext {
	var p = new(ForcontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_forcontrol
	return p
}

func InitEmptyForcontrolContext(p *ForcontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_forcontrol
}

func (*ForcontrolContext) IsForcontrolContext() {}

func NewForcontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ForcontrolContext {
	var p = new(ForcontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_forcontrol

	return p
}

func (s *ForcontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *ForcontrolContext) Get_FOR() antlr.Token { return s._FOR }

func (s *ForcontrolContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *ForcontrolContext) Set_FOR(v antlr.Token) { s._FOR = v }

func (s *ForcontrolContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *ForcontrolContext) GetLeft() IExprContext { return s.left }

func (s *ForcontrolContext) GetRight() IExprContext { return s.right }

func (s *ForcontrolContext) Get_blockinterno() IBlockinternoContext { return s._blockinterno }

func (s *ForcontrolContext) Get_expr() IExprContext { return s._expr }

func (s *ForcontrolContext) SetLeft(v IExprContext) { s.left = v }

func (s *ForcontrolContext) SetRight(v IExprContext) { s.right = v }

func (s *ForcontrolContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

func (s *ForcontrolContext) Set_expr(v IExprContext) { s._expr = v }

func (s *ForcontrolContext) GetForct() interfaces.Instruction { return s.forct }

func (s *ForcontrolContext) SetForct(v interfaces.Instruction) { s.forct = v }

func (s *ForcontrolContext) FOR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFOR, 0)
}

func (s *ForcontrolContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *ForcontrolContext) IN() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIN, 0)
}

func (s *ForcontrolContext) RANGO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserRANGO, 0)
}

func (s *ForcontrolContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *ForcontrolContext) Blockinterno() IBlockinternoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *ForcontrolContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *ForcontrolContext) AllExpr() []IExprContext {
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

func (s *ForcontrolContext) Expr(i int) IExprContext {
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

func (s *ForcontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ForcontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ForcontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterForcontrol(s)
	}
}

func (s *ForcontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitForcontrol(s)
	}
}

func (p *SwiftGrammarParser) Forcontrol() (localctx IForcontrolContext) {
	localctx = NewForcontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 38, SwiftGrammarParserRULE_forcontrol)
	p.SetState(531)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 32, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(511)

			var _m = p.Match(SwiftGrammarParserFOR)

			localctx.(*ForcontrolContext)._FOR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(512)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*ForcontrolContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(513)
			p.Match(SwiftGrammarParserIN)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(514)

			var _x = p.expr(0)

			localctx.(*ForcontrolContext).left = _x
		}
		{
			p.SetState(515)
			p.Match(SwiftGrammarParserRANGO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(516)

			var _x = p.expr(0)

			localctx.(*ForcontrolContext).right = _x
		}
		{
			p.SetState(517)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(518)

			var _x = p.Blockinterno()

			localctx.(*ForcontrolContext)._blockinterno = _x
		}
		{
			p.SetState(519)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ForcontrolContext).forct = instructions.NewSentenciaForRango((func() int {
			if localctx.(*ForcontrolContext).Get_FOR() == nil {
				return 0
			} else {
				return localctx.(*ForcontrolContext).Get_FOR().GetLine()
			}
		}()), (func() int {
			if localctx.(*ForcontrolContext).Get_FOR() == nil {
				return 0
			} else {
				return localctx.(*ForcontrolContext).Get_FOR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*ForcontrolContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*ForcontrolContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*ForcontrolContext).GetLeft().GetE(), localctx.(*ForcontrolContext).GetRight().GetE(), localctx.(*ForcontrolContext).Get_blockinterno().GetBlkint())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(522)

			var _m = p.Match(SwiftGrammarParserFOR)

			localctx.(*ForcontrolContext)._FOR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(523)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*ForcontrolContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(524)
			p.Match(SwiftGrammarParserIN)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(525)

			var _x = p.expr(0)

			localctx.(*ForcontrolContext)._expr = _x
		}
		{
			p.SetState(526)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(527)

			var _x = p.Blockinterno()

			localctx.(*ForcontrolContext)._blockinterno = _x
		}
		{
			p.SetState(528)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ForcontrolContext).forct = instructions.NewSentenciaForCadena((func() int {
			if localctx.(*ForcontrolContext).Get_FOR() == nil {
				return 0
			} else {
				return localctx.(*ForcontrolContext).Get_FOR().GetLine()
			}
		}()), (func() int {
			if localctx.(*ForcontrolContext).Get_FOR() == nil {
				return 0
			} else {
				return localctx.(*ForcontrolContext).Get_FOR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*ForcontrolContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*ForcontrolContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*ForcontrolContext).Get_expr().GetE(), localctx.(*ForcontrolContext).Get_blockinterno().GetBlkint())

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

// IGuardcontrolContext is an interface to support dynamic dispatch.
type IGuardcontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_GUARD returns the _GUARD token.
	Get_GUARD() antlr.Token

	// Set_GUARD sets the _GUARD token.
	Set_GUARD(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Get_blockinterno returns the _blockinterno rule contexts.
	Get_blockinterno() IBlockinternoContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

	// GetGuct returns the guct attribute.
	GetGuct() interfaces.Instruction

	// SetGuct sets the guct attribute.
	SetGuct(interfaces.Instruction)

	// Getter signatures
	GUARD() antlr.TerminalNode
	Expr() IExprContext
	ELSE() antlr.TerminalNode
	LLAVEIZQ() antlr.TerminalNode
	Blockinterno() IBlockinternoContext
	LLAVEDER() antlr.TerminalNode

	// IsGuardcontrolContext differentiates from other interfaces.
	IsGuardcontrolContext()
}

type GuardcontrolContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	guct          interfaces.Instruction
	_GUARD        antlr.Token
	_expr         IExprContext
	_blockinterno IBlockinternoContext
}

func NewEmptyGuardcontrolContext() *GuardcontrolContext {
	var p = new(GuardcontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_guardcontrol
	return p
}

func InitEmptyGuardcontrolContext(p *GuardcontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_guardcontrol
}

func (*GuardcontrolContext) IsGuardcontrolContext() {}

func NewGuardcontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *GuardcontrolContext {
	var p = new(GuardcontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_guardcontrol

	return p
}

func (s *GuardcontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *GuardcontrolContext) Get_GUARD() antlr.Token { return s._GUARD }

func (s *GuardcontrolContext) Set_GUARD(v antlr.Token) { s._GUARD = v }

func (s *GuardcontrolContext) Get_expr() IExprContext { return s._expr }

func (s *GuardcontrolContext) Get_blockinterno() IBlockinternoContext { return s._blockinterno }

func (s *GuardcontrolContext) Set_expr(v IExprContext) { s._expr = v }

func (s *GuardcontrolContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

func (s *GuardcontrolContext) GetGuct() interfaces.Instruction { return s.guct }

func (s *GuardcontrolContext) SetGuct(v interfaces.Instruction) { s.guct = v }

func (s *GuardcontrolContext) GUARD() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserGUARD, 0)
}

func (s *GuardcontrolContext) Expr() IExprContext {
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

func (s *GuardcontrolContext) ELSE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserELSE, 0)
}

func (s *GuardcontrolContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *GuardcontrolContext) Blockinterno() IBlockinternoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *GuardcontrolContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *GuardcontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *GuardcontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *GuardcontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterGuardcontrol(s)
	}
}

func (s *GuardcontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitGuardcontrol(s)
	}
}

func (p *SwiftGrammarParser) Guardcontrol() (localctx IGuardcontrolContext) {
	localctx = NewGuardcontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, SwiftGrammarParserRULE_guardcontrol)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(533)

		var _m = p.Match(SwiftGrammarParserGUARD)

		localctx.(*GuardcontrolContext)._GUARD = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(534)

		var _x = p.expr(0)

		localctx.(*GuardcontrolContext)._expr = _x
	}
	{
		p.SetState(535)
		p.Match(SwiftGrammarParserELSE)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(536)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(537)

		var _x = p.Blockinterno()

		localctx.(*GuardcontrolContext)._blockinterno = _x
	}
	{
		p.SetState(538)
		p.Match(SwiftGrammarParserLLAVEDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

	localctx.(*GuardcontrolContext).guct = instructions.NewSentenciaGuard((func() int {
		if localctx.(*GuardcontrolContext).Get_GUARD() == nil {
			return 0
		} else {
			return localctx.(*GuardcontrolContext).Get_GUARD().GetLine()
		}
	}()), (func() int {
		if localctx.(*GuardcontrolContext).Get_GUARD() == nil {
			return 0
		} else {
			return localctx.(*GuardcontrolContext).Get_GUARD().GetColumn()
		}
	}()), localctx.(*GuardcontrolContext).Get_expr().GetE(), localctx.(*GuardcontrolContext).Get_blockinterno().GetBlkint())

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

// IContinueeContext is an interface to support dynamic dispatch.
type IContinueeContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_CONTINUE returns the _CONTINUE token.
	Get_CONTINUE() antlr.Token

	// Set_CONTINUE sets the _CONTINUE token.
	Set_CONTINUE(antlr.Token)

	// GetCoct returns the coct attribute.
	GetCoct() interfaces.Instruction

	// SetCoct sets the coct attribute.
	SetCoct(interfaces.Instruction)

	// Getter signatures
	CONTINUE() antlr.TerminalNode

	// IsContinueeContext differentiates from other interfaces.
	IsContinueeContext()
}

type ContinueeContext struct {
	antlr.BaseParserRuleContext
	parser    antlr.Parser
	coct      interfaces.Instruction
	_CONTINUE antlr.Token
}

func NewEmptyContinueeContext() *ContinueeContext {
	var p = new(ContinueeContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_continuee
	return p
}

func InitEmptyContinueeContext(p *ContinueeContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_continuee
}

func (*ContinueeContext) IsContinueeContext() {}

func NewContinueeContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ContinueeContext {
	var p = new(ContinueeContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_continuee

	return p
}

func (s *ContinueeContext) GetParser() antlr.Parser { return s.parser }

func (s *ContinueeContext) Get_CONTINUE() antlr.Token { return s._CONTINUE }

func (s *ContinueeContext) Set_CONTINUE(v antlr.Token) { s._CONTINUE = v }

func (s *ContinueeContext) GetCoct() interfaces.Instruction { return s.coct }

func (s *ContinueeContext) SetCoct(v interfaces.Instruction) { s.coct = v }

func (s *ContinueeContext) CONTINUE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCONTINUE, 0)
}

func (s *ContinueeContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ContinueeContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ContinueeContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterContinuee(s)
	}
}

func (s *ContinueeContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitContinuee(s)
	}
}

func (p *SwiftGrammarParser) Continuee() (localctx IContinueeContext) {
	localctx = NewContinueeContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, SwiftGrammarParserRULE_continuee)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(541)

		var _m = p.Match(SwiftGrammarParserCONTINUE)

		localctx.(*ContinueeContext)._CONTINUE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*ContinueeContext).coct = instructions.NewTransferenciaContinue((func() int {
		if localctx.(*ContinueeContext).Get_CONTINUE() == nil {
			return 0
		} else {
			return localctx.(*ContinueeContext).Get_CONTINUE().GetLine()
		}
	}()), (func() int {
		if localctx.(*ContinueeContext).Get_CONTINUE() == nil {
			return 0
		} else {
			return localctx.(*ContinueeContext).Get_CONTINUE().GetColumn()
		}
	}()))

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

// IBreakkContext is an interface to support dynamic dispatch.
type IBreakkContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_BREAK returns the _BREAK token.
	Get_BREAK() antlr.Token

	// Set_BREAK sets the _BREAK token.
	Set_BREAK(antlr.Token)

	// GetBrkct returns the brkct attribute.
	GetBrkct() interfaces.Instruction

	// SetBrkct sets the brkct attribute.
	SetBrkct(interfaces.Instruction)

	// Getter signatures
	BREAK() antlr.TerminalNode

	// IsBreakkContext differentiates from other interfaces.
	IsBreakkContext()
}

type BreakkContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	brkct  interfaces.Instruction
	_BREAK antlr.Token
}

func NewEmptyBreakkContext() *BreakkContext {
	var p = new(BreakkContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_breakk
	return p
}

func InitEmptyBreakkContext(p *BreakkContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_breakk
}

func (*BreakkContext) IsBreakkContext() {}

func NewBreakkContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BreakkContext {
	var p = new(BreakkContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_breakk

	return p
}

func (s *BreakkContext) GetParser() antlr.Parser { return s.parser }

func (s *BreakkContext) Get_BREAK() antlr.Token { return s._BREAK }

func (s *BreakkContext) Set_BREAK(v antlr.Token) { s._BREAK = v }

func (s *BreakkContext) GetBrkct() interfaces.Instruction { return s.brkct }

func (s *BreakkContext) SetBrkct(v interfaces.Instruction) { s.brkct = v }

func (s *BreakkContext) BREAK() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserBREAK, 0)
}

func (s *BreakkContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BreakkContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BreakkContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBreakk(s)
	}
}

func (s *BreakkContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBreakk(s)
	}
}

func (p *SwiftGrammarParser) Breakk() (localctx IBreakkContext) {
	localctx = NewBreakkContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 44, SwiftGrammarParserRULE_breakk)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(544)

		var _m = p.Match(SwiftGrammarParserBREAK)

		localctx.(*BreakkContext)._BREAK = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*BreakkContext).brkct = instructions.NewTransferenciaBreak((func() int {
		if localctx.(*BreakkContext).Get_BREAK() == nil {
			return 0
		} else {
			return localctx.(*BreakkContext).Get_BREAK().GetLine()
		}
	}()), (func() int {
		if localctx.(*BreakkContext).Get_BREAK() == nil {
			return 0
		} else {
			return localctx.(*BreakkContext).Get_BREAK().GetColumn()
		}
	}()))

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

// IRetornosContext is an interface to support dynamic dispatch.
type IRetornosContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_RETURN returns the _RETURN token.
	Get_RETURN() antlr.Token

	// Set_RETURN sets the _RETURN token.
	Set_RETURN(antlr.Token)

	// GetOp returns the op rule contexts.
	GetOp() IExprContext

	// SetOp sets the op rule contexts.
	SetOp(IExprContext)

	// GetRect returns the rect attribute.
	GetRect() interfaces.Instruction

	// SetRect sets the rect attribute.
	SetRect(interfaces.Instruction)

	// Getter signatures
	RETURN() antlr.TerminalNode
	Expr() IExprContext

	// IsRetornosContext differentiates from other interfaces.
	IsRetornosContext()
}

type RetornosContext struct {
	antlr.BaseParserRuleContext
	parser  antlr.Parser
	rect    interfaces.Instruction
	_RETURN antlr.Token
	op      IExprContext
}

func NewEmptyRetornosContext() *RetornosContext {
	var p = new(RetornosContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_retornos
	return p
}

func InitEmptyRetornosContext(p *RetornosContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_retornos
}

func (*RetornosContext) IsRetornosContext() {}

func NewRetornosContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *RetornosContext {
	var p = new(RetornosContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_retornos

	return p
}

func (s *RetornosContext) GetParser() antlr.Parser { return s.parser }

func (s *RetornosContext) Get_RETURN() antlr.Token { return s._RETURN }

func (s *RetornosContext) Set_RETURN(v antlr.Token) { s._RETURN = v }

func (s *RetornosContext) GetOp() IExprContext { return s.op }

func (s *RetornosContext) SetOp(v IExprContext) { s.op = v }

func (s *RetornosContext) GetRect() interfaces.Instruction { return s.rect }

func (s *RetornosContext) SetRect(v interfaces.Instruction) { s.rect = v }

func (s *RetornosContext) RETURN() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserRETURN, 0)
}

func (s *RetornosContext) Expr() IExprContext {
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

func (s *RetornosContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RetornosContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *RetornosContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterRetornos(s)
	}
}

func (s *RetornosContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitRetornos(s)
	}
}

func (p *SwiftGrammarParser) Retornos() (localctx IRetornosContext) {
	localctx = NewRetornosContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 46, SwiftGrammarParserRULE_retornos)
	p.SetState(553)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 33, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(547)

			var _m = p.Match(SwiftGrammarParserRETURN)

			localctx.(*RetornosContext)._RETURN = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		localctx.(*RetornosContext).SetRect(instructions.NewTransferenciaReturn((func() int {
			if localctx.(*RetornosContext).Get_RETURN() == nil {
				return 0
			} else {
				return localctx.(*RetornosContext).Get_RETURN().GetLine()
			}
		}()), (func() int {
			if localctx.(*RetornosContext).Get_RETURN() == nil {
				return 0
			} else {
				return localctx.(*RetornosContext).Get_RETURN().GetColumn()
			}
		}())))

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(549)

			var _m = p.Match(SwiftGrammarParserRETURN)

			localctx.(*RetornosContext)._RETURN = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(550)

			var _x = p.expr(0)

			localctx.(*RetornosContext).op = _x
		}

		localctx.(*RetornosContext).SetRect(instructions.NewTransferenciaReturnExp((func() int {
			if localctx.(*RetornosContext).Get_RETURN() == nil {
				return 0
			} else {
				return localctx.(*RetornosContext).Get_RETURN().GetLine()
			}
		}()), (func() int {
			if localctx.(*RetornosContext).Get_RETURN() == nil {
				return 0
			} else {
				return localctx.(*RetornosContext).Get_RETURN().GetColumn()
			}
		}()), localctx.(*RetornosContext).GetOp().GetE()))

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

// IVectorcontrolContext is an interface to support dynamic dispatch.
type IVectorcontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_VAR returns the _VAR token.
	Get_VAR() antlr.Token

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// GetPrin returns the prin token.
	GetPrin() antlr.Token

	// GetSecu returns the secu token.
	GetSecu() antlr.Token

	// Set_VAR sets the _VAR token.
	Set_VAR(antlr.Token)

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// SetPrin sets the prin token.
	SetPrin(antlr.Token)

	// SetSecu sets the secu token.
	SetSecu(antlr.Token)

	// Get_tipodato returns the _tipodato rule contexts.
	Get_tipodato() ITipodatoContext

	// Get_blockparams returns the _blockparams rule contexts.
	Get_blockparams() IBlockparamsContext

	// Set_tipodato sets the _tipodato rule contexts.
	Set_tipodato(ITipodatoContext)

	// Set_blockparams sets the _blockparams rule contexts.
	Set_blockparams(IBlockparamsContext)

	// GetVect returns the vect attribute.
	GetVect() interfaces.Instruction

	// SetVect sets the vect attribute.
	SetVect(interfaces.Instruction)

	// Getter signatures
	VAR() antlr.TerminalNode
	AllID_VALIDO() []antlr.TerminalNode
	ID_VALIDO(i int) antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	AllCORCHIZQ() []antlr.TerminalNode
	CORCHIZQ(i int) antlr.TerminalNode
	Tipodato() ITipodatoContext
	AllCORCHDER() []antlr.TerminalNode
	CORCHDER(i int) antlr.TerminalNode
	IG() antlr.TerminalNode
	Blockparams() IBlockparamsContext

	// IsVectorcontrolContext differentiates from other interfaces.
	IsVectorcontrolContext()
}

type VectorcontrolContext struct {
	antlr.BaseParserRuleContext
	parser       antlr.Parser
	vect         interfaces.Instruction
	_VAR         antlr.Token
	_ID_VALIDO   antlr.Token
	_tipodato    ITipodatoContext
	_blockparams IBlockparamsContext
	prin         antlr.Token
	secu         antlr.Token
}

func NewEmptyVectorcontrolContext() *VectorcontrolContext {
	var p = new(VectorcontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorcontrol
	return p
}

func InitEmptyVectorcontrolContext(p *VectorcontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorcontrol
}

func (*VectorcontrolContext) IsVectorcontrolContext() {}

func NewVectorcontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VectorcontrolContext {
	var p = new(VectorcontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_vectorcontrol

	return p
}

func (s *VectorcontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *VectorcontrolContext) Get_VAR() antlr.Token { return s._VAR }

func (s *VectorcontrolContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *VectorcontrolContext) GetPrin() antlr.Token { return s.prin }

func (s *VectorcontrolContext) GetSecu() antlr.Token { return s.secu }

func (s *VectorcontrolContext) Set_VAR(v antlr.Token) { s._VAR = v }

func (s *VectorcontrolContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *VectorcontrolContext) SetPrin(v antlr.Token) { s.prin = v }

func (s *VectorcontrolContext) SetSecu(v antlr.Token) { s.secu = v }

func (s *VectorcontrolContext) Get_tipodato() ITipodatoContext { return s._tipodato }

func (s *VectorcontrolContext) Get_blockparams() IBlockparamsContext { return s._blockparams }

func (s *VectorcontrolContext) Set_tipodato(v ITipodatoContext) { s._tipodato = v }

func (s *VectorcontrolContext) Set_blockparams(v IBlockparamsContext) { s._blockparams = v }

func (s *VectorcontrolContext) GetVect() interfaces.Instruction { return s.vect }

func (s *VectorcontrolContext) SetVect(v interfaces.Instruction) { s.vect = v }

func (s *VectorcontrolContext) VAR() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserVAR, 0)
}

func (s *VectorcontrolContext) AllID_VALIDO() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserID_VALIDO)
}

func (s *VectorcontrolContext) ID_VALIDO(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, i)
}

func (s *VectorcontrolContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *VectorcontrolContext) AllCORCHIZQ() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserCORCHIZQ)
}

func (s *VectorcontrolContext) CORCHIZQ(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORCHIZQ, i)
}

func (s *VectorcontrolContext) Tipodato() ITipodatoContext {
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

func (s *VectorcontrolContext) AllCORCHDER() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserCORCHDER)
}

func (s *VectorcontrolContext) CORCHDER(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORCHDER, i)
}

func (s *VectorcontrolContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *VectorcontrolContext) Blockparams() IBlockparamsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockparamsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockparamsContext)
}

func (s *VectorcontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VectorcontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VectorcontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVectorcontrol(s)
	}
}

func (s *VectorcontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVectorcontrol(s)
	}
}

func (p *SwiftGrammarParser) Vectorcontrol() (localctx IVectorcontrolContext) {
	localctx = NewVectorcontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 48, SwiftGrammarParserRULE_vectorcontrol)
	p.SetState(588)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 34, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(555)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VectorcontrolContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(556)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectorcontrolContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(557)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(558)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(559)

			var _x = p.Tipodato()

			localctx.(*VectorcontrolContext)._tipodato = _x
		}
		{
			p.SetState(560)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(561)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(562)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(563)

			var _x = p.Blockparams()

			localctx.(*VectorcontrolContext)._blockparams = _x
		}
		{
			p.SetState(564)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectorcontrolContext).vect = instructions.NewArregloDeclaracionLista((func() int {
			if localctx.(*VectorcontrolContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VectorcontrolContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*VectorcontrolContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VectorcontrolContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VectorcontrolContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*VectorcontrolContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*VectorcontrolContext).Get_tipodato().GetTipo(), localctx.(*VectorcontrolContext).Get_blockparams().GetBlkpar())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(567)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VectorcontrolContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(568)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectorcontrolContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(569)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(570)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(571)

			var _x = p.Tipodato()

			localctx.(*VectorcontrolContext)._tipodato = _x
		}
		{
			p.SetState(572)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(573)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(574)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(575)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectorcontrolContext).vect = instructions.NewArregloDeclaracionSinLista((func() int {
			if localctx.(*VectorcontrolContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VectorcontrolContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*VectorcontrolContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VectorcontrolContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VectorcontrolContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*VectorcontrolContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*VectorcontrolContext).Get_tipodato().GetTipo())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(578)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*VectorcontrolContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(579)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectorcontrolContext).prin = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(580)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(581)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(582)

			var _x = p.Tipodato()

			localctx.(*VectorcontrolContext)._tipodato = _x
		}
		{
			p.SetState(583)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(584)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(585)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectorcontrolContext).secu = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectorcontrolContext).vect = instructions.NewArregloDeclaracionId((func() int {
			if localctx.(*VectorcontrolContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VectorcontrolContext).Get_VAR().GetLine()
			}
		}()), (func() int {
			if localctx.(*VectorcontrolContext).Get_VAR() == nil {
				return 0
			} else {
				return localctx.(*VectorcontrolContext).Get_VAR().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VectorcontrolContext).GetPrin() == nil {
				return ""
			} else {
				return localctx.(*VectorcontrolContext).GetPrin().GetText()
			}
		}()), localctx.(*VectorcontrolContext).Get_tipodato().GetTipo(), (func() string {
			if localctx.(*VectorcontrolContext).GetSecu() == nil {
				return ""
			} else {
				return localctx.(*VectorcontrolContext).GetSecu().GetText()
			}
		}()))

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

// IBlockparamsContext is an interface to support dynamic dispatch.
type IBlockparamsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_bloqueparams returns the _bloqueparams rule contexts.
	Get_bloqueparams() IBloqueparamsContext

	// Set_bloqueparams sets the _bloqueparams rule contexts.
	Set_bloqueparams(IBloqueparamsContext)

	// GetBlopas returns the blopas rule context list.
	GetBlopas() []IBloqueparamsContext

	// SetBlopas sets the blopas rule context list.
	SetBlopas([]IBloqueparamsContext)

	// GetBlkpar returns the blkpar attribute.
	GetBlkpar() []interface{}

	// SetBlkpar sets the blkpar attribute.
	SetBlkpar([]interface{})

	// Getter signatures
	AllBloqueparams() []IBloqueparamsContext
	Bloqueparams(i int) IBloqueparamsContext

	// IsBlockparamsContext differentiates from other interfaces.
	IsBlockparamsContext()
}

type BlockparamsContext struct {
	antlr.BaseParserRuleContext
	parser        antlr.Parser
	blkpar        []interface{}
	_bloqueparams IBloqueparamsContext
	blopas        []IBloqueparamsContext
}

func NewEmptyBlockparamsContext() *BlockparamsContext {
	var p = new(BlockparamsContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_blockparams
	return p
}

func InitEmptyBlockparamsContext(p *BlockparamsContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_blockparams
}

func (*BlockparamsContext) IsBlockparamsContext() {}

func NewBlockparamsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BlockparamsContext {
	var p = new(BlockparamsContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_blockparams

	return p
}

func (s *BlockparamsContext) GetParser() antlr.Parser { return s.parser }

func (s *BlockparamsContext) Get_bloqueparams() IBloqueparamsContext { return s._bloqueparams }

func (s *BlockparamsContext) Set_bloqueparams(v IBloqueparamsContext) { s._bloqueparams = v }

func (s *BlockparamsContext) GetBlopas() []IBloqueparamsContext { return s.blopas }

func (s *BlockparamsContext) SetBlopas(v []IBloqueparamsContext) { s.blopas = v }

func (s *BlockparamsContext) GetBlkpar() []interface{} { return s.blkpar }

func (s *BlockparamsContext) SetBlkpar(v []interface{}) { s.blkpar = v }

func (s *BlockparamsContext) AllBloqueparams() []IBloqueparamsContext {
	children := s.GetChildren()
	len := 0
	for _, ctx := range children {
		if _, ok := ctx.(IBloqueparamsContext); ok {
			len++
		}
	}

	tst := make([]IBloqueparamsContext, len)
	i := 0
	for _, ctx := range children {
		if t, ok := ctx.(IBloqueparamsContext); ok {
			tst[i] = t.(IBloqueparamsContext)
			i++
		}
	}

	return tst
}

func (s *BlockparamsContext) Bloqueparams(i int) IBloqueparamsContext {
	var t antlr.RuleContext
	j := 0
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBloqueparamsContext); ok {
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

	return t.(IBloqueparamsContext)
}

func (s *BlockparamsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BlockparamsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BlockparamsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBlockparams(s)
	}
}

func (s *BlockparamsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBlockparams(s)
	}
}

func (p *SwiftGrammarParser) Blockparams() (localctx IBlockparamsContext) {
	localctx = NewBlockparamsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, SwiftGrammarParserRULE_blockparams)

	localctx.(*BlockparamsContext).blkpar = []interface{}{}
	var listInt []IBloqueparamsContext

	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(591)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&1153520669724509390) != 0) || _la == SwiftGrammarParserCOMA {
		{
			p.SetState(590)

			var _x = p.Bloqueparams()

			localctx.(*BlockparamsContext)._bloqueparams = _x
		}
		localctx.(*BlockparamsContext).blopas = append(localctx.(*BlockparamsContext).blopas, localctx.(*BlockparamsContext)._bloqueparams)

		p.SetState(593)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}

	listInt = localctx.(*BlockparamsContext).GetBlopas()
	for _, e := range listInt {
		localctx.(*BlockparamsContext).blkpar = append(localctx.(*BlockparamsContext).blkpar, e.GetBlopas())
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

// IBloqueparamsContext is an interface to support dynamic dispatch.
type IBloqueparamsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_COMA returns the _COMA token.
	Get_COMA() antlr.Token

	// Set_COMA sets the _COMA token.
	Set_COMA(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetBlopas returns the blopas attribute.
	GetBlopas() interfaces.Expression

	// SetBlopas sets the blopas attribute.
	SetBlopas(interfaces.Expression)

	// Getter signatures
	COMA() antlr.TerminalNode
	Expr() IExprContext

	// IsBloqueparamsContext differentiates from other interfaces.
	IsBloqueparamsContext()
}

type BloqueparamsContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	blopas interfaces.Expression
	_COMA  antlr.Token
	_expr  IExprContext
}

func NewEmptyBloqueparamsContext() *BloqueparamsContext {
	var p = new(BloqueparamsContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_bloqueparams
	return p
}

func InitEmptyBloqueparamsContext(p *BloqueparamsContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_bloqueparams
}

func (*BloqueparamsContext) IsBloqueparamsContext() {}

func NewBloqueparamsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BloqueparamsContext {
	var p = new(BloqueparamsContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_bloqueparams

	return p
}

func (s *BloqueparamsContext) GetParser() antlr.Parser { return s.parser }

func (s *BloqueparamsContext) Get_COMA() antlr.Token { return s._COMA }

func (s *BloqueparamsContext) Set_COMA(v antlr.Token) { s._COMA = v }

func (s *BloqueparamsContext) Get_expr() IExprContext { return s._expr }

func (s *BloqueparamsContext) Set_expr(v IExprContext) { s._expr = v }

func (s *BloqueparamsContext) GetBlopas() interfaces.Expression { return s.blopas }

func (s *BloqueparamsContext) SetBlopas(v interfaces.Expression) { s.blopas = v }

func (s *BloqueparamsContext) COMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCOMA, 0)
}

func (s *BloqueparamsContext) Expr() IExprContext {
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

func (s *BloqueparamsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BloqueparamsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BloqueparamsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterBloqueparams(s)
	}
}

func (s *BloqueparamsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitBloqueparams(s)
	}
}

func (p *SwiftGrammarParser) Bloqueparams() (localctx IBloqueparamsContext) {
	localctx = NewBloqueparamsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, SwiftGrammarParserRULE_bloqueparams)
	p.SetState(604)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserCOMA:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(597)

			var _m = p.Match(SwiftGrammarParserCOMA)

			localctx.(*BloqueparamsContext)._COMA = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(598)

			var _x = p.expr(0)

			localctx.(*BloqueparamsContext)._expr = _x
		}

		localctx.(*BloqueparamsContext).blopas = instructions.NewArregloParametros((func() int {
			if localctx.(*BloqueparamsContext).Get_COMA() == nil {
				return 0
			} else {
				return localctx.(*BloqueparamsContext).Get_COMA().GetLine()
			}
		}()), (func() int {
			if localctx.(*BloqueparamsContext).Get_COMA() == nil {
				return 0
			} else {
				return localctx.(*BloqueparamsContext).Get_COMA().GetColumn()
			}
		}()), localctx.(*BloqueparamsContext).Get_expr().GetE())

	case SwiftGrammarParserT__0, SwiftGrammarParserFLOAT, SwiftGrammarParserSTRING, SwiftGrammarParserTRU, SwiftGrammarParserFAL, SwiftGrammarParserNULO, SwiftGrammarParserNUMBER, SwiftGrammarParserCADENA, SwiftGrammarParserID_VALIDO, SwiftGrammarParserCHARACTER, SwiftGrammarParserPARIZQ, SwiftGrammarParserNOT, SwiftGrammarParserSUB:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(601)

			var _x = p.expr(0)

			localctx.(*BloqueparamsContext)._expr = _x
		}

		localctx.(*BloqueparamsContext).blopas = instructions.NewArregloParametro(localctx.(*BloqueparamsContext).Get_expr().GetE())

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

// IVectoragregarContext is an interface to support dynamic dispatch.
type IVectoragregarContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// GetPrin returns the prin token.
	GetPrin() antlr.Token

	// GetSecu returns the secu token.
	GetSecu() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// SetPrin sets the prin token.
	SetPrin(antlr.Token)

	// SetSecu sets the secu token.
	SetSecu(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// GetPop returns the pop rule contexts.
	GetPop() IExprContext

	// GetSop returns the sop rule contexts.
	GetSop() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// SetPop sets the pop rule contexts.
	SetPop(IExprContext)

	// SetSop sets the sop rule contexts.
	SetSop(IExprContext)

	// GetVeadct returns the veadct attribute.
	GetVeadct() interfaces.Instruction

	// SetVeadct sets the veadct attribute.
	SetVeadct(interfaces.Instruction)

	// Getter signatures
	AllID_VALIDO() []antlr.TerminalNode
	ID_VALIDO(i int) antlr.TerminalNode
	PUNTO() antlr.TerminalNode
	APPEND() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	AllExpr() []IExprContext
	Expr(i int) IExprContext
	PARDER() antlr.TerminalNode
	AllCORCHIZQ() []antlr.TerminalNode
	CORCHIZQ(i int) antlr.TerminalNode
	AllCORCHDER() []antlr.TerminalNode
	CORCHDER(i int) antlr.TerminalNode
	IG() antlr.TerminalNode

	// IsVectoragregarContext differentiates from other interfaces.
	IsVectoragregarContext()
}

type VectoragregarContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	veadct     interfaces.Instruction
	_ID_VALIDO antlr.Token
	_expr      IExprContext
	prin       antlr.Token
	pop        IExprContext
	secu       antlr.Token
	sop        IExprContext
}

func NewEmptyVectoragregarContext() *VectoragregarContext {
	var p = new(VectoragregarContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectoragregar
	return p
}

func InitEmptyVectoragregarContext(p *VectoragregarContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectoragregar
}

func (*VectoragregarContext) IsVectoragregarContext() {}

func NewVectoragregarContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VectoragregarContext {
	var p = new(VectoragregarContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_vectoragregar

	return p
}

func (s *VectoragregarContext) GetParser() antlr.Parser { return s.parser }

func (s *VectoragregarContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *VectoragregarContext) GetPrin() antlr.Token { return s.prin }

func (s *VectoragregarContext) GetSecu() antlr.Token { return s.secu }

func (s *VectoragregarContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *VectoragregarContext) SetPrin(v antlr.Token) { s.prin = v }

func (s *VectoragregarContext) SetSecu(v antlr.Token) { s.secu = v }

func (s *VectoragregarContext) Get_expr() IExprContext { return s._expr }

func (s *VectoragregarContext) GetPop() IExprContext { return s.pop }

func (s *VectoragregarContext) GetSop() IExprContext { return s.sop }

func (s *VectoragregarContext) Set_expr(v IExprContext) { s._expr = v }

func (s *VectoragregarContext) SetPop(v IExprContext) { s.pop = v }

func (s *VectoragregarContext) SetSop(v IExprContext) { s.sop = v }

func (s *VectoragregarContext) GetVeadct() interfaces.Instruction { return s.veadct }

func (s *VectoragregarContext) SetVeadct(v interfaces.Instruction) { s.veadct = v }

func (s *VectoragregarContext) AllID_VALIDO() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserID_VALIDO)
}

func (s *VectoragregarContext) ID_VALIDO(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, i)
}

func (s *VectoragregarContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTO, 0)
}

func (s *VectoragregarContext) APPEND() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserAPPEND, 0)
}

func (s *VectoragregarContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *VectoragregarContext) AllExpr() []IExprContext {
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

func (s *VectoragregarContext) Expr(i int) IExprContext {
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

func (s *VectoragregarContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *VectoragregarContext) AllCORCHIZQ() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserCORCHIZQ)
}

func (s *VectoragregarContext) CORCHIZQ(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORCHIZQ, i)
}

func (s *VectoragregarContext) AllCORCHDER() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserCORCHDER)
}

func (s *VectoragregarContext) CORCHDER(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORCHDER, i)
}

func (s *VectoragregarContext) IG() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserIG, 0)
}

func (s *VectoragregarContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VectoragregarContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VectoragregarContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVectoragregar(s)
	}
}

func (s *VectoragregarContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVectoragregar(s)
	}
}

func (p *SwiftGrammarParser) Vectoragregar() (localctx IVectoragregarContext) {
	localctx = NewVectoragregarContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 54, SwiftGrammarParserRULE_vectoragregar)
	p.SetState(633)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 37, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(606)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectoragregarContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(607)
			p.Match(SwiftGrammarParserPUNTO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(608)
			p.Match(SwiftGrammarParserAPPEND)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(609)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(610)

			var _x = p.expr(0)

			localctx.(*VectoragregarContext)._expr = _x
		}
		{
			p.SetState(611)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectoragregarContext).veadct = instructions.NewArregloAppend((func() string {
			if localctx.(*VectoragregarContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*VectoragregarContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*VectoragregarContext).Get_expr().GetE())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(614)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectoragregarContext).prin = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(615)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(616)

			var _x = p.expr(0)

			localctx.(*VectoragregarContext).pop = _x
		}
		{
			p.SetState(617)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(618)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(619)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectoragregarContext).secu = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(620)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(621)

			var _x = p.expr(0)

			localctx.(*VectoragregarContext).sop = _x
		}
		{
			p.SetState(622)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectoragregarContext).veadct = instructions.NewArregloAppendArreglo((func() string {
			if localctx.(*VectoragregarContext).GetPrin() == nil {
				return ""
			} else {
				return localctx.(*VectoragregarContext).GetPrin().GetText()
			}
		}()), localctx.(*VectoragregarContext).GetPop().GetE(), (func() string {
			if localctx.(*VectoragregarContext).GetSecu() == nil {
				return ""
			} else {
				return localctx.(*VectoragregarContext).GetSecu().GetText()
			}
		}()), localctx.(*VectoragregarContext).GetSop().GetE())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(625)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectoragregarContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(626)
			p.Match(SwiftGrammarParserCORCHIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(627)

			var _x = p.expr(0)

			localctx.(*VectoragregarContext).pop = _x
		}
		{
			p.SetState(628)
			p.Match(SwiftGrammarParserCORCHDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(629)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(630)

			var _x = p.expr(0)

			localctx.(*VectoragregarContext).sop = _x
		}
		localctx.(*VectoragregarContext).veadct = instructions.NewArregloAppendExp((func() string {
			if localctx.(*VectoragregarContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*VectoragregarContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*VectoragregarContext).GetPop().GetE(), localctx.(*VectoragregarContext).GetSop().GetE())

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

// IVectorremoverContext is an interface to support dynamic dispatch.
type IVectorremoverContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Get_PUNTO returns the _PUNTO token.
	Get_PUNTO() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Set_PUNTO sets the _PUNTO token.
	Set_PUNTO(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetVermct returns the vermct attribute.
	GetVermct() interfaces.Instruction

	// SetVermct sets the vermct attribute.
	SetVermct(interfaces.Instruction)

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	PUNTO() antlr.TerminalNode
	REMOVELAST() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode
	REMOVE() antlr.TerminalNode
	AT() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Expr() IExprContext

	// IsVectorremoverContext differentiates from other interfaces.
	IsVectorremoverContext()
}

type VectorremoverContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	vermct     interfaces.Instruction
	_ID_VALIDO antlr.Token
	_PUNTO     antlr.Token
	_expr      IExprContext
}

func NewEmptyVectorremoverContext() *VectorremoverContext {
	var p = new(VectorremoverContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorremover
	return p
}

func InitEmptyVectorremoverContext(p *VectorremoverContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorremover
}

func (*VectorremoverContext) IsVectorremoverContext() {}

func NewVectorremoverContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VectorremoverContext {
	var p = new(VectorremoverContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_vectorremover

	return p
}

func (s *VectorremoverContext) GetParser() antlr.Parser { return s.parser }

func (s *VectorremoverContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *VectorremoverContext) Get_PUNTO() antlr.Token { return s._PUNTO }

func (s *VectorremoverContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *VectorremoverContext) Set_PUNTO(v antlr.Token) { s._PUNTO = v }

func (s *VectorremoverContext) Get_expr() IExprContext { return s._expr }

func (s *VectorremoverContext) Set_expr(v IExprContext) { s._expr = v }

func (s *VectorremoverContext) GetVermct() interfaces.Instruction { return s.vermct }

func (s *VectorremoverContext) SetVermct(v interfaces.Instruction) { s.vermct = v }

func (s *VectorremoverContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *VectorremoverContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTO, 0)
}

func (s *VectorremoverContext) REMOVELAST() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserREMOVELAST, 0)
}

func (s *VectorremoverContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *VectorremoverContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *VectorremoverContext) REMOVE() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserREMOVE, 0)
}

func (s *VectorremoverContext) AT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserAT, 0)
}

func (s *VectorremoverContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *VectorremoverContext) Expr() IExprContext {
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

func (s *VectorremoverContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VectorremoverContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VectorremoverContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVectorremover(s)
	}
}

func (s *VectorremoverContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVectorremover(s)
	}
}

func (p *SwiftGrammarParser) Vectorremover() (localctx IVectorremoverContext) {
	localctx = NewVectorremoverContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 56, SwiftGrammarParserRULE_vectorremover)
	p.SetState(651)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 38, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(635)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectorremoverContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(636)

			var _m = p.Match(SwiftGrammarParserPUNTO)

			localctx.(*VectorremoverContext)._PUNTO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(637)
			p.Match(SwiftGrammarParserREMOVELAST)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(638)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(639)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectorremoverContext).vermct = instructions.NewArregloRemoveLast((func() int {
			if localctx.(*VectorremoverContext).Get_PUNTO() == nil {
				return 0
			} else {
				return localctx.(*VectorremoverContext).Get_PUNTO().GetLine()
			}
		}()), (func() int {
			if localctx.(*VectorremoverContext).Get_PUNTO() == nil {
				return 0
			} else {
				return localctx.(*VectorremoverContext).Get_PUNTO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VectorremoverContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*VectorremoverContext).Get_ID_VALIDO().GetText()
			}
		}()))

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(641)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*VectorremoverContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(642)

			var _m = p.Match(SwiftGrammarParserPUNTO)

			localctx.(*VectorremoverContext)._PUNTO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(643)
			p.Match(SwiftGrammarParserREMOVE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(644)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(645)
			p.Match(SwiftGrammarParserAT)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(646)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(647)

			var _x = p.expr(0)

			localctx.(*VectorremoverContext)._expr = _x
		}
		{
			p.SetState(648)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*VectorremoverContext).vermct = instructions.NewArregloRemovePos((func() int {
			if localctx.(*VectorremoverContext).Get_PUNTO() == nil {
				return 0
			} else {
				return localctx.(*VectorremoverContext).Get_PUNTO().GetLine()
			}
		}()), (func() int {
			if localctx.(*VectorremoverContext).Get_PUNTO() == nil {
				return 0
			} else {
				return localctx.(*VectorremoverContext).Get_PUNTO().GetColumn()
			}
		}()), (func() string {
			if localctx.(*VectorremoverContext).Get_ID_VALIDO() == nil {
				return ""
			} else {
				return localctx.(*VectorremoverContext).Get_ID_VALIDO().GetText()
			}
		}()), localctx.(*VectorremoverContext).Get_expr().GetE())

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

// IVectorvacioContext is an interface to support dynamic dispatch.
type IVectorvacioContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Get_PUNTO returns the _PUNTO token.
	Get_PUNTO() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Set_PUNTO sets the _PUNTO token.
	Set_PUNTO(antlr.Token)

	// GetVeemct returns the veemct attribute.
	GetVeemct() interfaces.Expression

	// SetVeemct sets the veemct attribute.
	SetVeemct(interfaces.Expression)

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	PUNTO() antlr.TerminalNode
	ISEMPTY() antlr.TerminalNode

	// IsVectorvacioContext differentiates from other interfaces.
	IsVectorvacioContext()
}

type VectorvacioContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	veemct     interfaces.Expression
	_ID_VALIDO antlr.Token
	_PUNTO     antlr.Token
}

func NewEmptyVectorvacioContext() *VectorvacioContext {
	var p = new(VectorvacioContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorvacio
	return p
}

func InitEmptyVectorvacioContext(p *VectorvacioContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorvacio
}

func (*VectorvacioContext) IsVectorvacioContext() {}

func NewVectorvacioContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VectorvacioContext {
	var p = new(VectorvacioContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_vectorvacio

	return p
}

func (s *VectorvacioContext) GetParser() antlr.Parser { return s.parser }

func (s *VectorvacioContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *VectorvacioContext) Get_PUNTO() antlr.Token { return s._PUNTO }

func (s *VectorvacioContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *VectorvacioContext) Set_PUNTO(v antlr.Token) { s._PUNTO = v }

func (s *VectorvacioContext) GetVeemct() interfaces.Expression { return s.veemct }

func (s *VectorvacioContext) SetVeemct(v interfaces.Expression) { s.veemct = v }

func (s *VectorvacioContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *VectorvacioContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTO, 0)
}

func (s *VectorvacioContext) ISEMPTY() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserISEMPTY, 0)
}

func (s *VectorvacioContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VectorvacioContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VectorvacioContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVectorvacio(s)
	}
}

func (s *VectorvacioContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVectorvacio(s)
	}
}

func (p *SwiftGrammarParser) Vectorvacio() (localctx IVectorvacioContext) {
	localctx = NewVectorvacioContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 58, SwiftGrammarParserRULE_vectorvacio)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(653)

		var _m = p.Match(SwiftGrammarParserID_VALIDO)

		localctx.(*VectorvacioContext)._ID_VALIDO = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(654)

		var _m = p.Match(SwiftGrammarParserPUNTO)

		localctx.(*VectorvacioContext)._PUNTO = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(655)
		p.Match(SwiftGrammarParserISEMPTY)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*VectorvacioContext).veemct = instructions.NewArregloIsEmpty((func() int {
		if localctx.(*VectorvacioContext).Get_PUNTO() == nil {
			return 0
		} else {
			return localctx.(*VectorvacioContext).Get_PUNTO().GetLine()
		}
	}()), (func() int {
		if localctx.(*VectorvacioContext).Get_PUNTO() == nil {
			return 0
		} else {
			return localctx.(*VectorvacioContext).Get_PUNTO().GetColumn()
		}
	}()), (func() string {
		if localctx.(*VectorvacioContext).Get_ID_VALIDO() == nil {
			return ""
		} else {
			return localctx.(*VectorvacioContext).Get_ID_VALIDO().GetText()
		}
	}()))

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

// IVectorcountContext is an interface to support dynamic dispatch.
type IVectorcountContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Get_PUNTO returns the _PUNTO token.
	Get_PUNTO() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Set_PUNTO sets the _PUNTO token.
	Set_PUNTO(antlr.Token)

	// GetVecnct returns the vecnct attribute.
	GetVecnct() interfaces.Expression

	// SetVecnct sets the vecnct attribute.
	SetVecnct(interfaces.Expression)

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	PUNTO() antlr.TerminalNode
	COUNT() antlr.TerminalNode

	// IsVectorcountContext differentiates from other interfaces.
	IsVectorcountContext()
}

type VectorcountContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	vecnct     interfaces.Expression
	_ID_VALIDO antlr.Token
	_PUNTO     antlr.Token
}

func NewEmptyVectorcountContext() *VectorcountContext {
	var p = new(VectorcountContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorcount
	return p
}

func InitEmptyVectorcountContext(p *VectorcountContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectorcount
}

func (*VectorcountContext) IsVectorcountContext() {}

func NewVectorcountContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VectorcountContext {
	var p = new(VectorcountContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_vectorcount

	return p
}

func (s *VectorcountContext) GetParser() antlr.Parser { return s.parser }

func (s *VectorcountContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *VectorcountContext) Get_PUNTO() antlr.Token { return s._PUNTO }

func (s *VectorcountContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *VectorcountContext) Set_PUNTO(v antlr.Token) { s._PUNTO = v }

func (s *VectorcountContext) GetVecnct() interfaces.Expression { return s.vecnct }

func (s *VectorcountContext) SetVecnct(v interfaces.Expression) { s.vecnct = v }

func (s *VectorcountContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *VectorcountContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPUNTO, 0)
}

func (s *VectorcountContext) COUNT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCOUNT, 0)
}

func (s *VectorcountContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VectorcountContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VectorcountContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVectorcount(s)
	}
}

func (s *VectorcountContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVectorcount(s)
	}
}

func (p *SwiftGrammarParser) Vectorcount() (localctx IVectorcountContext) {
	localctx = NewVectorcountContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 60, SwiftGrammarParserRULE_vectorcount)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(658)

		var _m = p.Match(SwiftGrammarParserID_VALIDO)

		localctx.(*VectorcountContext)._ID_VALIDO = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(659)

		var _m = p.Match(SwiftGrammarParserPUNTO)

		localctx.(*VectorcountContext)._PUNTO = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(660)
		p.Match(SwiftGrammarParserCOUNT)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*VectorcountContext).vecnct = instructions.NewArregloCount((func() int {
		if localctx.(*VectorcountContext).Get_PUNTO() == nil {
			return 0
		} else {
			return localctx.(*VectorcountContext).Get_PUNTO().GetLine()
		}
	}()), (func() int {
		if localctx.(*VectorcountContext).Get_PUNTO() == nil {
			return 0
		} else {
			return localctx.(*VectorcountContext).Get_PUNTO().GetColumn()
		}
	}()), (func() string {
		if localctx.(*VectorcountContext).Get_ID_VALIDO() == nil {
			return ""
		} else {
			return localctx.(*VectorcountContext).Get_ID_VALIDO().GetText()
		}
	}()))

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

// IVectoraccessContext is an interface to support dynamic dispatch.
type IVectoraccessContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID_VALIDO returns the _ID_VALIDO token.
	Get_ID_VALIDO() antlr.Token

	// Get_CORCHDER returns the _CORCHDER token.
	Get_CORCHDER() antlr.Token

	// Set_ID_VALIDO sets the _ID_VALIDO token.
	Set_ID_VALIDO(antlr.Token)

	// Set_CORCHDER sets the _CORCHDER token.
	Set_CORCHDER(antlr.Token)

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetVepposct returns the vepposct attribute.
	GetVepposct() interfaces.Expression

	// SetVepposct sets the vepposct attribute.
	SetVepposct(interfaces.Expression)

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	CORCHIZQ() antlr.TerminalNode
	Expr() IExprContext
	CORCHDER() antlr.TerminalNode

	// IsVectoraccessContext differentiates from other interfaces.
	IsVectoraccessContext()
}

type VectoraccessContext struct {
	antlr.BaseParserRuleContext
	parser     antlr.Parser
	vepposct   interfaces.Expression
	_ID_VALIDO antlr.Token
	_expr      IExprContext
	_CORCHDER  antlr.Token
}

func NewEmptyVectoraccessContext() *VectoraccessContext {
	var p = new(VectoraccessContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectoraccess
	return p
}

func InitEmptyVectoraccessContext(p *VectoraccessContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_vectoraccess
}

func (*VectoraccessContext) IsVectoraccessContext() {}

func NewVectoraccessContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VectoraccessContext {
	var p = new(VectoraccessContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_vectoraccess

	return p
}

func (s *VectoraccessContext) GetParser() antlr.Parser { return s.parser }

func (s *VectoraccessContext) Get_ID_VALIDO() antlr.Token { return s._ID_VALIDO }

func (s *VectoraccessContext) Get_CORCHDER() antlr.Token { return s._CORCHDER }

func (s *VectoraccessContext) Set_ID_VALIDO(v antlr.Token) { s._ID_VALIDO = v }

func (s *VectoraccessContext) Set_CORCHDER(v antlr.Token) { s._CORCHDER = v }

func (s *VectoraccessContext) Get_expr() IExprContext { return s._expr }

func (s *VectoraccessContext) Set_expr(v IExprContext) { s._expr = v }

func (s *VectoraccessContext) GetVepposct() interfaces.Expression { return s.vepposct }

func (s *VectoraccessContext) SetVepposct(v interfaces.Expression) { s.vepposct = v }

func (s *VectoraccessContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *VectoraccessContext) CORCHIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORCHIZQ, 0)
}

func (s *VectoraccessContext) Expr() IExprContext {
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

func (s *VectoraccessContext) CORCHDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCORCHDER, 0)
}

func (s *VectoraccessContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VectoraccessContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VectoraccessContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterVectoraccess(s)
	}
}

func (s *VectoraccessContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitVectoraccess(s)
	}
}

func (p *SwiftGrammarParser) Vectoraccess() (localctx IVectoraccessContext) {
	localctx = NewVectoraccessContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 62, SwiftGrammarParserRULE_vectoraccess)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(663)

		var _m = p.Match(SwiftGrammarParserID_VALIDO)

		localctx.(*VectoraccessContext)._ID_VALIDO = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(664)
		p.Match(SwiftGrammarParserCORCHIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(665)

		var _x = p.expr(0)

		localctx.(*VectoraccessContext)._expr = _x
	}
	{
		p.SetState(666)

		var _m = p.Match(SwiftGrammarParserCORCHDER)

		localctx.(*VectoraccessContext)._CORCHDER = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*VectoraccessContext).vepposct = instructions.NewArregloAccess((func() int {
		if localctx.(*VectoraccessContext).Get_CORCHDER() == nil {
			return 0
		} else {
			return localctx.(*VectoraccessContext).Get_CORCHDER().GetLine()
		}
	}()), (func() int {
		if localctx.(*VectoraccessContext).Get_CORCHDER() == nil {
			return 0
		} else {
			return localctx.(*VectoraccessContext).Get_CORCHDER().GetColumn()
		}
	}()), (func() string {
		if localctx.(*VectoraccessContext).Get_ID_VALIDO() == nil {
			return ""
		} else {
			return localctx.(*VectoraccessContext).Get_ID_VALIDO().GetText()
		}
	}()), localctx.(*VectoraccessContext).Get_expr().GetE())

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

// IFunciondeclaracioncontrolContext is an interface to support dynamic dispatch.
type IFunciondeclaracioncontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	FUNCION() antlr.TerminalNode
	ID_VALIDO() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	PARDER() antlr.TerminalNode
	RETORNO() antlr.TerminalNode
	Tipodato() ITipodatoContext
	LLAVEIZQ() antlr.TerminalNode
	Blockinterno() IBlockinternoContext
	LLAVEDER() antlr.TerminalNode
	Listaparametros() IListaparametrosContext

	// IsFunciondeclaracioncontrolContext differentiates from other interfaces.
	IsFunciondeclaracioncontrolContext()
}

type FunciondeclaracioncontrolContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunciondeclaracioncontrolContext() *FunciondeclaracioncontrolContext {
	var p = new(FunciondeclaracioncontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funciondeclaracioncontrol
	return p
}

func InitEmptyFunciondeclaracioncontrolContext(p *FunciondeclaracioncontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funciondeclaracioncontrol
}

func (*FunciondeclaracioncontrolContext) IsFunciondeclaracioncontrolContext() {}

func NewFunciondeclaracioncontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunciondeclaracioncontrolContext {
	var p = new(FunciondeclaracioncontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_funciondeclaracioncontrol

	return p
}

func (s *FunciondeclaracioncontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *FunciondeclaracioncontrolContext) FUNCION() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFUNCION, 0)
}

func (s *FunciondeclaracioncontrolContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *FunciondeclaracioncontrolContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *FunciondeclaracioncontrolContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *FunciondeclaracioncontrolContext) RETORNO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserRETORNO, 0)
}

func (s *FunciondeclaracioncontrolContext) Tipodato() ITipodatoContext {
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

func (s *FunciondeclaracioncontrolContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEIZQ, 0)
}

func (s *FunciondeclaracioncontrolContext) Blockinterno() IBlockinternoContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IBlockinternoContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IBlockinternoContext)
}

func (s *FunciondeclaracioncontrolContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserLLAVEDER, 0)
}

func (s *FunciondeclaracioncontrolContext) Listaparametros() IListaparametrosContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListaparametrosContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListaparametrosContext)
}

func (s *FunciondeclaracioncontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunciondeclaracioncontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunciondeclaracioncontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterFunciondeclaracioncontrol(s)
	}
}

func (s *FunciondeclaracioncontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitFunciondeclaracioncontrol(s)
	}
}

func (p *SwiftGrammarParser) Funciondeclaracioncontrol() (localctx IFunciondeclaracioncontrolContext) {
	localctx = NewFunciondeclaracioncontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 64, SwiftGrammarParserRULE_funciondeclaracioncontrol)
	var _la int

	p.SetState(695)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 41, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(669)
			p.Match(SwiftGrammarParserFUNCION)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(670)
			p.Match(SwiftGrammarParserID_VALIDO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(671)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(673)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if (int64((_la-38)) & ^0x3f) == 0 && ((int64(1)<<(_la-38))&1342177281) != 0 {
			{
				p.SetState(672)
				p.Listaparametros()
			}

		}
		{
			p.SetState(675)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(676)
			p.Match(SwiftGrammarParserRETORNO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(677)
			p.Tipodato()
		}
		{
			p.SetState(678)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(679)
			p.Blockinterno()
		}
		{
			p.SetState(680)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(683)
			p.Match(SwiftGrammarParserFUNCION)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(684)
			p.Match(SwiftGrammarParserID_VALIDO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(685)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(687)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if (int64((_la-38)) & ^0x3f) == 0 && ((int64(1)<<(_la-38))&1342177281) != 0 {
			{
				p.SetState(686)
				p.Listaparametros()
			}

		}
		{
			p.SetState(689)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(690)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(691)
			p.Blockinterno()
		}
		{
			p.SetState(692)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

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

// IListaparametrosContext is an interface to support dynamic dispatch.
type IListaparametrosContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	COMA() antlr.TerminalNode
	AllID_VALIDO() []antlr.TerminalNode
	ID_VALIDO(i int) antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode
	Tipodato() ITipodatoContext
	Listaparametros() IListaparametrosContext
	INOUT() antlr.TerminalNode
	GUIONBAJO() antlr.TerminalNode

	// IsListaparametrosContext differentiates from other interfaces.
	IsListaparametrosContext()
}

type ListaparametrosContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyListaparametrosContext() *ListaparametrosContext {
	var p = new(ListaparametrosContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listaparametros
	return p
}

func InitEmptyListaparametrosContext(p *ListaparametrosContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listaparametros
}

func (*ListaparametrosContext) IsListaparametrosContext() {}

func NewListaparametrosContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaparametrosContext {
	var p = new(ListaparametrosContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_listaparametros

	return p
}

func (s *ListaparametrosContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaparametrosContext) COMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCOMA, 0)
}

func (s *ListaparametrosContext) AllID_VALIDO() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserID_VALIDO)
}

func (s *ListaparametrosContext) ID_VALIDO(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, i)
}

func (s *ListaparametrosContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *ListaparametrosContext) Tipodato() ITipodatoContext {
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

func (s *ListaparametrosContext) Listaparametros() IListaparametrosContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListaparametrosContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListaparametrosContext)
}

func (s *ListaparametrosContext) INOUT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINOUT, 0)
}

func (s *ListaparametrosContext) GUIONBAJO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserGUIONBAJO, 0)
}

func (s *ListaparametrosContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaparametrosContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaparametrosContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterListaparametros(s)
	}
}

func (s *ListaparametrosContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitListaparametros(s)
	}
}

func (p *SwiftGrammarParser) Listaparametros() (localctx IListaparametrosContext) {
	localctx = NewListaparametrosContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 66, SwiftGrammarParserRULE_listaparametros)
	var _la int

	p.SetState(721)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserCOMA:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(697)
			p.Match(SwiftGrammarParserCOMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(699)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 42, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(698)
				_la = p.GetTokenStream().LA(1)

				if !(_la == SwiftGrammarParserID_VALIDO || _la == SwiftGrammarParserGUIONBAJO) {
					p.GetErrorHandler().RecoverInline(p)
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		{
			p.SetState(701)
			p.Match(SwiftGrammarParserID_VALIDO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(702)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(704)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserINOUT {
			{
				p.SetState(703)
				p.Match(SwiftGrammarParserINOUT)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		{
			p.SetState(706)
			p.Tipodato()
		}
		{
			p.SetState(707)
			p.Listaparametros()
		}

	case SwiftGrammarParserID_VALIDO, SwiftGrammarParserGUIONBAJO:
		p.EnterOuterAlt(localctx, 2)
		p.SetState(711)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 44, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(710)
				_la = p.GetTokenStream().LA(1)

				if !(_la == SwiftGrammarParserID_VALIDO || _la == SwiftGrammarParserGUIONBAJO) {
					p.GetErrorHandler().RecoverInline(p)
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		{
			p.SetState(713)
			p.Match(SwiftGrammarParserID_VALIDO)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(714)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(716)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserINOUT {
			{
				p.SetState(715)
				p.Match(SwiftGrammarParserINOUT)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		}
		{
			p.SetState(718)
			p.Tipodato()
		}

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

// IFuncionllamadacontrolContext is an interface to support dynamic dispatch.
type IFuncionllamadacontrolContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	ID_VALIDO() antlr.TerminalNode
	AllPARIZQ() []antlr.TerminalNode
	PARIZQ(i int) antlr.TerminalNode
	Listaparametrosllamada() IListaparametrosllamadaContext

	// IsFuncionllamadacontrolContext differentiates from other interfaces.
	IsFuncionllamadacontrolContext()
}

type FuncionllamadacontrolContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFuncionllamadacontrolContext() *FuncionllamadacontrolContext {
	var p = new(FuncionllamadacontrolContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funcionllamadacontrol
	return p
}

func InitEmptyFuncionllamadacontrolContext(p *FuncionllamadacontrolContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_funcionllamadacontrol
}

func (*FuncionllamadacontrolContext) IsFuncionllamadacontrolContext() {}

func NewFuncionllamadacontrolContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FuncionllamadacontrolContext {
	var p = new(FuncionllamadacontrolContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_funcionllamadacontrol

	return p
}

func (s *FuncionllamadacontrolContext) GetParser() antlr.Parser { return s.parser }

func (s *FuncionllamadacontrolContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *FuncionllamadacontrolContext) AllPARIZQ() []antlr.TerminalNode {
	return s.GetTokens(SwiftGrammarParserPARIZQ)
}

func (s *FuncionllamadacontrolContext) PARIZQ(i int) antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, i)
}

func (s *FuncionllamadacontrolContext) Listaparametrosllamada() IListaparametrosllamadaContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListaparametrosllamadaContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListaparametrosllamadaContext)
}

func (s *FuncionllamadacontrolContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FuncionllamadacontrolContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FuncionllamadacontrolContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterFuncionllamadacontrol(s)
	}
}

func (s *FuncionllamadacontrolContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitFuncionllamadacontrol(s)
	}
}

func (p *SwiftGrammarParser) Funcionllamadacontrol() (localctx IFuncionllamadacontrolContext) {
	localctx = NewFuncionllamadacontrolContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 68, SwiftGrammarParserRULE_funcionllamadacontrol)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(723)
		p.Match(SwiftGrammarParserID_VALIDO)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(724)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	p.SetState(726)
	p.GetErrorHandler().Sync(p)

	if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 47, p.GetParserRuleContext()) == 1 {
		{
			p.SetState(725)
			p.Listaparametrosllamada()
		}

	} else if p.HasError() { // JIM
		goto errorExit
	}
	{
		p.SetState(728)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
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
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IListaparametrosllamadaContext is an interface to support dynamic dispatch.
type IListaparametrosllamadaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	COMA() antlr.TerminalNode
	Expr() IExprContext
	Listaparametrosllamada() IListaparametrosllamadaContext
	ID_VALIDO() antlr.TerminalNode
	DOS_PUNTOS() antlr.TerminalNode

	// IsListaparametrosllamadaContext differentiates from other interfaces.
	IsListaparametrosllamadaContext()
}

type ListaparametrosllamadaContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyListaparametrosllamadaContext() *ListaparametrosllamadaContext {
	var p = new(ListaparametrosllamadaContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listaparametrosllamada
	return p
}

func InitEmptyListaparametrosllamadaContext(p *ListaparametrosllamadaContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_listaparametrosllamada
}

func (*ListaparametrosllamadaContext) IsListaparametrosllamadaContext() {}

func NewListaparametrosllamadaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaparametrosllamadaContext {
	var p = new(ListaparametrosllamadaContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_listaparametrosllamada

	return p
}

func (s *ListaparametrosllamadaContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaparametrosllamadaContext) COMA() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserCOMA, 0)
}

func (s *ListaparametrosllamadaContext) Expr() IExprContext {
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

func (s *ListaparametrosllamadaContext) Listaparametrosllamada() IListaparametrosllamadaContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IListaparametrosllamadaContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IListaparametrosllamadaContext)
}

func (s *ListaparametrosllamadaContext) ID_VALIDO() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserID_VALIDO, 0)
}

func (s *ListaparametrosllamadaContext) DOS_PUNTOS() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserDOS_PUNTOS, 0)
}

func (s *ListaparametrosllamadaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaparametrosllamadaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaparametrosllamadaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterListaparametrosllamada(s)
	}
}

func (s *ListaparametrosllamadaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitListaparametrosllamada(s)
	}
}

func (p *SwiftGrammarParser) Listaparametrosllamada() (localctx IListaparametrosllamadaContext) {
	localctx = NewListaparametrosllamadaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 70, SwiftGrammarParserRULE_listaparametrosllamada)
	p.SetState(753)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserCOMA:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(731)
			p.Match(SwiftGrammarParserCOMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(734)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 48, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(732)
				p.Match(SwiftGrammarParserID_VALIDO)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(733)
				p.Match(SwiftGrammarParserDOS_PUNTOS)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		p.SetState(737)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 49, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(736)
				p.Match(SwiftGrammarParserT__0)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		{
			p.SetState(739)
			p.expr(0)
		}
		{
			p.SetState(740)
			p.Listaparametrosllamada()
		}

	case SwiftGrammarParserT__0, SwiftGrammarParserFLOAT, SwiftGrammarParserSTRING, SwiftGrammarParserTRU, SwiftGrammarParserFAL, SwiftGrammarParserNULO, SwiftGrammarParserNUMBER, SwiftGrammarParserCADENA, SwiftGrammarParserID_VALIDO, SwiftGrammarParserCHARACTER, SwiftGrammarParserPARIZQ, SwiftGrammarParserNOT, SwiftGrammarParserSUB:
		p.EnterOuterAlt(localctx, 2)
		p.SetState(745)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 50, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(743)
				p.Match(SwiftGrammarParserID_VALIDO)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			{
				p.SetState(744)
				p.Match(SwiftGrammarParserDOS_PUNTOS)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		p.SetState(748)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 51, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(747)
				p.Match(SwiftGrammarParserT__0)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}

		} else if p.HasError() { // JIM
			goto errorExit
		}
		{
			p.SetState(750)
			p.expr(0)
		}

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
	p.EnterRule(localctx, 72, SwiftGrammarParserRULE_printstmt)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(755)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(756)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(757)

		var _x = p.expr(0)

		localctx.(*PrintstmtContext)._expr = _x
	}
	{
		p.SetState(758)
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

// IIntembebidaContext is an interface to support dynamic dispatch.
type IIntembebidaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetIntemb returns the intemb attribute.
	GetIntemb() interfaces.Expression

	// SetIntemb sets the intemb attribute.
	SetIntemb(interfaces.Expression)

	// Getter signatures
	INT() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode

	// IsIntembebidaContext differentiates from other interfaces.
	IsIntembebidaContext()
}

type IntembebidaContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	intemb interfaces.Expression
	_expr  IExprContext
}

func NewEmptyIntembebidaContext() *IntembebidaContext {
	var p = new(IntembebidaContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_intembebida
	return p
}

func InitEmptyIntembebidaContext(p *IntembebidaContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_intembebida
}

func (*IntembebidaContext) IsIntembebidaContext() {}

func NewIntembebidaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *IntembebidaContext {
	var p = new(IntembebidaContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_intembebida

	return p
}

func (s *IntembebidaContext) GetParser() antlr.Parser { return s.parser }

func (s *IntembebidaContext) Get_expr() IExprContext { return s._expr }

func (s *IntembebidaContext) Set_expr(v IExprContext) { s._expr = v }

func (s *IntembebidaContext) GetIntemb() interfaces.Expression { return s.intemb }

func (s *IntembebidaContext) SetIntemb(v interfaces.Expression) { s.intemb = v }

func (s *IntembebidaContext) INT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserINT, 0)
}

func (s *IntembebidaContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *IntembebidaContext) Expr() IExprContext {
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

func (s *IntembebidaContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *IntembebidaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *IntembebidaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *IntembebidaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterIntembebida(s)
	}
}

func (s *IntembebidaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitIntembebida(s)
	}
}

func (p *SwiftGrammarParser) Intembebida() (localctx IIntembebidaContext) {
	localctx = NewIntembebidaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 74, SwiftGrammarParserRULE_intembebida)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(761)
		p.Match(SwiftGrammarParserT__0)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(762)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(763)

		var _x = p.expr(0)

		localctx.(*IntembebidaContext)._expr = _x
	}
	{
		p.SetState(764)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*IntembebidaContext).intemb = instructions.NewFuncionIntEmbebida(localctx.(*IntembebidaContext).Get_expr().GetE())

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

// IFloatembebidaContext is an interface to support dynamic dispatch.
type IFloatembebidaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetFloemb returns the floemb attribute.
	GetFloemb() interfaces.Expression

	// SetFloemb sets the floemb attribute.
	SetFloemb(interfaces.Expression)

	// Getter signatures
	FLOAT() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode

	// IsFloatembebidaContext differentiates from other interfaces.
	IsFloatembebidaContext()
}

type FloatembebidaContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	floemb interfaces.Expression
	_expr  IExprContext
}

func NewEmptyFloatembebidaContext() *FloatembebidaContext {
	var p = new(FloatembebidaContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_floatembebida
	return p
}

func InitEmptyFloatembebidaContext(p *FloatembebidaContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_floatembebida
}

func (*FloatembebidaContext) IsFloatembebidaContext() {}

func NewFloatembebidaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FloatembebidaContext {
	var p = new(FloatembebidaContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_floatembebida

	return p
}

func (s *FloatembebidaContext) GetParser() antlr.Parser { return s.parser }

func (s *FloatembebidaContext) Get_expr() IExprContext { return s._expr }

func (s *FloatembebidaContext) Set_expr(v IExprContext) { s._expr = v }

func (s *FloatembebidaContext) GetFloemb() interfaces.Expression { return s.floemb }

func (s *FloatembebidaContext) SetFloemb(v interfaces.Expression) { s.floemb = v }

func (s *FloatembebidaContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserFLOAT, 0)
}

func (s *FloatembebidaContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *FloatembebidaContext) Expr() IExprContext {
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

func (s *FloatembebidaContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *FloatembebidaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FloatembebidaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FloatembebidaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterFloatembebida(s)
	}
}

func (s *FloatembebidaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitFloatembebida(s)
	}
}

func (p *SwiftGrammarParser) Floatembebida() (localctx IFloatembebidaContext) {
	localctx = NewFloatembebidaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 76, SwiftGrammarParserRULE_floatembebida)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(767)
		p.Match(SwiftGrammarParserFLOAT)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(768)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(769)

		var _x = p.expr(0)

		localctx.(*FloatembebidaContext)._expr = _x
	}
	{
		p.SetState(770)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*FloatembebidaContext).floemb = instructions.NewFuncionFloatEmbebida(localctx.(*FloatembebidaContext).Get_expr().GetE())

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

// IStringembebidaContext is an interface to support dynamic dispatch.
type IStringembebidaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expr returns the _expr rule contexts.
	Get_expr() IExprContext

	// Set_expr sets the _expr rule contexts.
	Set_expr(IExprContext)

	// GetStremb returns the stremb attribute.
	GetStremb() interfaces.Expression

	// SetStremb sets the stremb attribute.
	SetStremb(interfaces.Expression)

	// Getter signatures
	STRING() antlr.TerminalNode
	PARIZQ() antlr.TerminalNode
	Expr() IExprContext
	PARDER() antlr.TerminalNode

	// IsStringembebidaContext differentiates from other interfaces.
	IsStringembebidaContext()
}

type StringembebidaContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
	stremb interfaces.Expression
	_expr  IExprContext
}

func NewEmptyStringembebidaContext() *StringembebidaContext {
	var p = new(StringembebidaContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_stringembebida
	return p
}

func InitEmptyStringembebidaContext(p *StringembebidaContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = SwiftGrammarParserRULE_stringembebida
}

func (*StringembebidaContext) IsStringembebidaContext() {}

func NewStringembebidaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StringembebidaContext {
	var p = new(StringembebidaContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = SwiftGrammarParserRULE_stringembebida

	return p
}

func (s *StringembebidaContext) GetParser() antlr.Parser { return s.parser }

func (s *StringembebidaContext) Get_expr() IExprContext { return s._expr }

func (s *StringembebidaContext) Set_expr(v IExprContext) { s._expr = v }

func (s *StringembebidaContext) GetStremb() interfaces.Expression { return s.stremb }

func (s *StringembebidaContext) SetStremb(v interfaces.Expression) { s.stremb = v }

func (s *StringembebidaContext) STRING() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserSTRING, 0)
}

func (s *StringembebidaContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARIZQ, 0)
}

func (s *StringembebidaContext) Expr() IExprContext {
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

func (s *StringembebidaContext) PARDER() antlr.TerminalNode {
	return s.GetToken(SwiftGrammarParserPARDER, 0)
}

func (s *StringembebidaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StringembebidaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StringembebidaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.EnterStringembebida(s)
	}
}

func (s *StringembebidaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(SwiftGrammarListener); ok {
		listenerT.ExitStringembebida(s)
	}
}

func (p *SwiftGrammarParser) Stringembebida() (localctx IStringembebidaContext) {
	localctx = NewStringembebidaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 78, SwiftGrammarParserRULE_stringembebida)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(773)
		p.Match(SwiftGrammarParserSTRING)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(774)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(775)

		var _x = p.expr(0)

		localctx.(*StringembebidaContext)._expr = _x
	}
	{
		p.SetState(776)
		p.Match(SwiftGrammarParserPARDER)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	localctx.(*StringembebidaContext).stremb = instructions.NewFuncionStringEmbebida(localctx.(*StringembebidaContext).Get_expr().GetE())

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
	case 13:
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
		return p.Precpred(p.GetParserRuleContext(), 23)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 22)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 21)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 20)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 19)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 18)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 17)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 16)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
