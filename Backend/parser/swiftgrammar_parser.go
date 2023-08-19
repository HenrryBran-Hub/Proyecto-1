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
		"expr", "sentenciaifelse", "switchcontrol", "blockcase", "bloquecase",
		"whilecontrol", "forcontrol",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 73, 419, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2, 10, 7,
		10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15, 7, 15,
		2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 2, 20, 7, 20, 1,
		0, 1, 0, 1, 0, 1, 0, 1, 1, 4, 1, 48, 8, 1, 11, 1, 12, 1, 49, 1, 1, 1, 1,
		1, 2, 1, 2, 3, 2, 56, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 62, 8, 2, 1,
		2, 1, 2, 1, 2, 1, 2, 3, 2, 68, 8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3, 2, 74,
		8, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2,
		1, 2, 1, 2, 1, 2, 3, 2, 90, 8, 2, 1, 3, 4, 3, 93, 8, 3, 11, 3, 12, 3, 94,
		1, 3, 1, 3, 1, 4, 1, 4, 3, 4, 101, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4,
		107, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 113, 8, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 3, 4, 119, 8, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1,
		4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 135, 8, 4, 1, 5, 1, 5, 1, 5, 1,
		5, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1,
		6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 3,
		6, 164, 8, 6, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 7, 1, 7, 3, 7, 180, 8, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1,
		8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 3, 8, 197,
		8, 8, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 10, 1, 10, 1, 10, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10,
		1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 1, 10, 3, 10, 226, 8, 10, 1, 11, 1,
		11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11,
		1, 11, 1, 11, 3, 11, 242, 8, 11, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1,
		12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12, 3, 12,
		259, 8, 12, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1,
		13, 1, 13, 3, 13, 271, 8, 13, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		3, 14, 300, 8, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14, 1, 14,
		1, 14, 5, 14, 342, 8, 14, 10, 14, 12, 14, 345, 9, 14, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15,
		1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1, 15, 1,
		15, 1, 15, 1, 15, 1, 15, 3, 15, 374, 8, 15, 1, 16, 1, 16, 1, 16, 1, 16,
		1, 16, 1, 16, 1, 16, 3, 16, 383, 8, 16, 1, 16, 1, 16, 1, 16, 1, 17, 4,
		17, 389, 8, 17, 11, 17, 12, 17, 390, 1, 17, 1, 17, 1, 18, 1, 18, 1, 18,
		1, 18, 1, 18, 1, 18, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1,
		20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20, 1, 20,
		1, 20, 0, 1, 28, 21, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26,
		28, 30, 32, 34, 36, 38, 40, 0, 5, 1, 0, 57, 58, 1, 0, 59, 60, 2, 0, 52,
		52, 54, 54, 2, 0, 53, 53, 55, 55, 1, 0, 47, 48, 456, 0, 42, 1, 0, 0, 0,
		2, 47, 1, 0, 0, 0, 4, 89, 1, 0, 0, 0, 6, 92, 1, 0, 0, 0, 8, 134, 1, 0,
		0, 0, 10, 136, 1, 0, 0, 0, 12, 163, 1, 0, 0, 0, 14, 179, 1, 0, 0, 0, 16,
		196, 1, 0, 0, 0, 18, 198, 1, 0, 0, 0, 20, 225, 1, 0, 0, 0, 22, 241, 1,
		0, 0, 0, 24, 258, 1, 0, 0, 0, 26, 270, 1, 0, 0, 0, 28, 299, 1, 0, 0, 0,
		30, 373, 1, 0, 0, 0, 32, 375, 1, 0, 0, 0, 34, 388, 1, 0, 0, 0, 36, 394,
		1, 0, 0, 0, 38, 400, 1, 0, 0, 0, 40, 407, 1, 0, 0, 0, 42, 43, 3, 2, 1,
		0, 43, 44, 5, 0, 0, 1, 44, 45, 6, 0, -1, 0, 45, 1, 1, 0, 0, 0, 46, 48,
		3, 4, 2, 0, 47, 46, 1, 0, 0, 0, 48, 49, 1, 0, 0, 0, 49, 47, 1, 0, 0, 0,
		49, 50, 1, 0, 0, 0, 50, 51, 1, 0, 0, 0, 51, 52, 6, 1, -1, 0, 52, 3, 1,
		0, 0, 0, 53, 55, 3, 10, 5, 0, 54, 56, 5, 43, 0, 0, 55, 54, 1, 0, 0, 0,
		55, 56, 1, 0, 0, 0, 56, 57, 1, 0, 0, 0, 57, 58, 6, 2, -1, 0, 58, 90, 1,
		0, 0, 0, 59, 61, 3, 12, 6, 0, 60, 62, 5, 43, 0, 0, 61, 60, 1, 0, 0, 0,
		61, 62, 1, 0, 0, 0, 62, 63, 1, 0, 0, 0, 63, 64, 6, 2, -1, 0, 64, 90, 1,
		0, 0, 0, 65, 67, 3, 14, 7, 0, 66, 68, 5, 43, 0, 0, 67, 66, 1, 0, 0, 0,
		67, 68, 1, 0, 0, 0, 68, 69, 1, 0, 0, 0, 69, 70, 6, 2, -1, 0, 70, 90, 1,
		0, 0, 0, 71, 73, 3, 16, 8, 0, 72, 74, 5, 43, 0, 0, 73, 72, 1, 0, 0, 0,
		73, 74, 1, 0, 0, 0, 74, 75, 1, 0, 0, 0, 75, 76, 6, 2, -1, 0, 76, 90, 1,
		0, 0, 0, 77, 78, 3, 30, 15, 0, 78, 79, 6, 2, -1, 0, 79, 90, 1, 0, 0, 0,
		80, 81, 3, 32, 16, 0, 81, 82, 6, 2, -1, 0, 82, 90, 1, 0, 0, 0, 83, 84,
		3, 38, 19, 0, 84, 85, 6, 2, -1, 0, 85, 90, 1, 0, 0, 0, 86, 87, 3, 40, 20,
		0, 87, 88, 6, 2, -1, 0, 88, 90, 1, 0, 0, 0, 89, 53, 1, 0, 0, 0, 89, 59,
		1, 0, 0, 0, 89, 65, 1, 0, 0, 0, 89, 71, 1, 0, 0, 0, 89, 77, 1, 0, 0, 0,
		89, 80, 1, 0, 0, 0, 89, 83, 1, 0, 0, 0, 89, 86, 1, 0, 0, 0, 90, 5, 1, 0,
		0, 0, 91, 93, 3, 8, 4, 0, 92, 91, 1, 0, 0, 0, 93, 94, 1, 0, 0, 0, 94, 92,
		1, 0, 0, 0, 94, 95, 1, 0, 0, 0, 95, 96, 1, 0, 0, 0, 96, 97, 6, 3, -1, 0,
		97, 7, 1, 0, 0, 0, 98, 100, 3, 18, 9, 0, 99, 101, 5, 43, 0, 0, 100, 99,
		1, 0, 0, 0, 100, 101, 1, 0, 0, 0, 101, 102, 1, 0, 0, 0, 102, 103, 6, 4,
		-1, 0, 103, 135, 1, 0, 0, 0, 104, 106, 3, 20, 10, 0, 105, 107, 5, 43, 0,
		0, 106, 105, 1, 0, 0, 0, 106, 107, 1, 0, 0, 0, 107, 108, 1, 0, 0, 0, 108,
		109, 6, 4, -1, 0, 109, 135, 1, 0, 0, 0, 110, 112, 3, 22, 11, 0, 111, 113,
		5, 43, 0, 0, 112, 111, 1, 0, 0, 0, 112, 113, 1, 0, 0, 0, 113, 114, 1, 0,
		0, 0, 114, 115, 6, 4, -1, 0, 115, 135, 1, 0, 0, 0, 116, 118, 3, 24, 12,
		0, 117, 119, 5, 43, 0, 0, 118, 117, 1, 0, 0, 0, 118, 119, 1, 0, 0, 0, 119,
		120, 1, 0, 0, 0, 120, 121, 6, 4, -1, 0, 121, 135, 1, 0, 0, 0, 122, 123,
		3, 30, 15, 0, 123, 124, 6, 4, -1, 0, 124, 135, 1, 0, 0, 0, 125, 126, 3,
		32, 16, 0, 126, 127, 6, 4, -1, 0, 127, 135, 1, 0, 0, 0, 128, 129, 3, 38,
		19, 0, 129, 130, 6, 4, -1, 0, 130, 135, 1, 0, 0, 0, 131, 132, 3, 40, 20,
		0, 132, 133, 6, 4, -1, 0, 133, 135, 1, 0, 0, 0, 134, 98, 1, 0, 0, 0, 134,
		104, 1, 0, 0, 0, 134, 110, 1, 0, 0, 0, 134, 116, 1, 0, 0, 0, 134, 122,
		1, 0, 0, 0, 134, 125, 1, 0, 0, 0, 134, 128, 1, 0, 0, 0, 134, 131, 1, 0,
		0, 0, 135, 9, 1, 0, 0, 0, 136, 137, 5, 25, 0, 0, 137, 138, 5, 45, 0, 0,
		138, 139, 3, 28, 14, 0, 139, 140, 5, 46, 0, 0, 140, 141, 6, 5, -1, 0, 141,
		11, 1, 0, 0, 0, 142, 143, 5, 8, 0, 0, 143, 144, 5, 38, 0, 0, 144, 145,
		5, 42, 0, 0, 145, 146, 3, 26, 13, 0, 146, 147, 5, 41, 0, 0, 147, 148, 3,
		28, 14, 0, 148, 149, 6, 6, -1, 0, 149, 164, 1, 0, 0, 0, 150, 151, 5, 8,
		0, 0, 151, 152, 5, 38, 0, 0, 152, 153, 5, 41, 0, 0, 153, 154, 3, 28, 14,
		0, 154, 155, 6, 6, -1, 0, 155, 164, 1, 0, 0, 0, 156, 157, 5, 8, 0, 0, 157,
		158, 5, 38, 0, 0, 158, 159, 5, 42, 0, 0, 159, 160, 3, 26, 13, 0, 160, 161,
		5, 44, 0, 0, 161, 162, 6, 6, -1, 0, 162, 164, 1, 0, 0, 0, 163, 142, 1,
		0, 0, 0, 163, 150, 1, 0, 0, 0, 163, 156, 1, 0, 0, 0, 164, 13, 1, 0, 0,
		0, 165, 166, 5, 9, 0, 0, 166, 167, 5, 38, 0, 0, 167, 168, 5, 42, 0, 0,
		168, 169, 3, 26, 13, 0, 169, 170, 5, 41, 0, 0, 170, 171, 3, 28, 14, 0,
		171, 172, 6, 7, -1, 0, 172, 180, 1, 0, 0, 0, 173, 174, 5, 9, 0, 0, 174,
		175, 5, 38, 0, 0, 175, 176, 5, 41, 0, 0, 176, 177, 3, 28, 14, 0, 177, 178,
		6, 7, -1, 0, 178, 180, 1, 0, 0, 0, 179, 165, 1, 0, 0, 0, 179, 173, 1, 0,
		0, 0, 180, 15, 1, 0, 0, 0, 181, 182, 5, 38, 0, 0, 182, 183, 5, 41, 0, 0,
		183, 184, 3, 28, 14, 0, 184, 185, 6, 8, -1, 0, 185, 197, 1, 0, 0, 0, 186,
		187, 5, 38, 0, 0, 187, 188, 5, 61, 0, 0, 188, 189, 3, 28, 14, 0, 189, 190,
		6, 8, -1, 0, 190, 197, 1, 0, 0, 0, 191, 192, 5, 38, 0, 0, 192, 193, 5,
		62, 0, 0, 193, 194, 3, 28, 14, 0, 194, 195, 6, 8, -1, 0, 195, 197, 1, 0,
		0, 0, 196, 181, 1, 0, 0, 0, 196, 186, 1, 0, 0, 0, 196, 191, 1, 0, 0, 0,
		197, 17, 1, 0, 0, 0, 198, 199, 5, 25, 0, 0, 199, 200, 5, 45, 0, 0, 200,
		201, 3, 28, 14, 0, 201, 202, 5, 46, 0, 0, 202, 203, 6, 9, -1, 0, 203, 19,
		1, 0, 0, 0, 204, 205, 5, 8, 0, 0, 205, 206, 5, 38, 0, 0, 206, 207, 5, 42,
		0, 0, 207, 208, 3, 26, 13, 0, 208, 209, 5, 41, 0, 0, 209, 210, 3, 28, 14,
		0, 210, 211, 6, 10, -1, 0, 211, 226, 1, 0, 0, 0, 212, 213, 5, 8, 0, 0,
		213, 214, 5, 38, 0, 0, 214, 215, 5, 41, 0, 0, 215, 216, 3, 28, 14, 0, 216,
		217, 6, 10, -1, 0, 217, 226, 1, 0, 0, 0, 218, 219, 5, 8, 0, 0, 219, 220,
		5, 38, 0, 0, 220, 221, 5, 42, 0, 0, 221, 222, 3, 26, 13, 0, 222, 223, 5,
		44, 0, 0, 223, 224, 6, 10, -1, 0, 224, 226, 1, 0, 0, 0, 225, 204, 1, 0,
		0, 0, 225, 212, 1, 0, 0, 0, 225, 218, 1, 0, 0, 0, 226, 21, 1, 0, 0, 0,
		227, 228, 5, 9, 0, 0, 228, 229, 5, 38, 0, 0, 229, 230, 5, 42, 0, 0, 230,
		231, 3, 26, 13, 0, 231, 232, 5, 41, 0, 0, 232, 233, 3, 28, 14, 0, 233,
		234, 6, 11, -1, 0, 234, 242, 1, 0, 0, 0, 235, 236, 5, 9, 0, 0, 236, 237,
		5, 38, 0, 0, 237, 238, 5, 41, 0, 0, 238, 239, 3, 28, 14, 0, 239, 240, 6,
		11, -1, 0, 240, 242, 1, 0, 0, 0, 241, 227, 1, 0, 0, 0, 241, 235, 1, 0,
		0, 0, 242, 23, 1, 0, 0, 0, 243, 244, 5, 38, 0, 0, 244, 245, 5, 41, 0, 0,
		245, 246, 3, 28, 14, 0, 246, 247, 6, 12, -1, 0, 247, 259, 1, 0, 0, 0, 248,
		249, 5, 38, 0, 0, 249, 250, 5, 61, 0, 0, 250, 251, 3, 28, 14, 0, 251, 252,
		6, 12, -1, 0, 252, 259, 1, 0, 0, 0, 253, 254, 5, 38, 0, 0, 254, 255, 5,
		62, 0, 0, 255, 256, 3, 28, 14, 0, 256, 257, 6, 12, -1, 0, 257, 259, 1,
		0, 0, 0, 258, 243, 1, 0, 0, 0, 258, 248, 1, 0, 0, 0, 258, 253, 1, 0, 0,
		0, 259, 25, 1, 0, 0, 0, 260, 261, 5, 1, 0, 0, 261, 271, 6, 13, -1, 0, 262,
		263, 5, 2, 0, 0, 263, 271, 6, 13, -1, 0, 264, 265, 5, 3, 0, 0, 265, 271,
		6, 13, -1, 0, 266, 267, 5, 4, 0, 0, 267, 271, 6, 13, -1, 0, 268, 269, 5,
		5, 0, 0, 269, 271, 6, 13, -1, 0, 270, 260, 1, 0, 0, 0, 270, 262, 1, 0,
		0, 0, 270, 264, 1, 0, 0, 0, 270, 266, 1, 0, 0, 0, 270, 268, 1, 0, 0, 0,
		271, 27, 1, 0, 0, 0, 272, 273, 6, 14, -1, 0, 273, 274, 5, 49, 0, 0, 274,
		275, 3, 28, 14, 18, 275, 276, 6, 14, -1, 0, 276, 300, 1, 0, 0, 0, 277,
		278, 5, 45, 0, 0, 278, 279, 3, 28, 14, 0, 279, 280, 5, 46, 0, 0, 280, 281,
		6, 14, -1, 0, 281, 300, 1, 0, 0, 0, 282, 283, 5, 60, 0, 0, 283, 284, 5,
		36, 0, 0, 284, 300, 6, 14, -1, 0, 285, 286, 5, 36, 0, 0, 286, 300, 6, 14,
		-1, 0, 287, 288, 5, 37, 0, 0, 288, 300, 6, 14, -1, 0, 289, 290, 5, 6, 0,
		0, 290, 300, 6, 14, -1, 0, 291, 292, 5, 7, 0, 0, 292, 300, 6, 14, -1, 0,
		293, 294, 5, 39, 0, 0, 294, 300, 6, 14, -1, 0, 295, 296, 5, 38, 0, 0, 296,
		300, 6, 14, -1, 0, 297, 298, 5, 10, 0, 0, 298, 300, 6, 14, -1, 0, 299,
		272, 1, 0, 0, 0, 299, 277, 1, 0, 0, 0, 299, 282, 1, 0, 0, 0, 299, 285,
		1, 0, 0, 0, 299, 287, 1, 0, 0, 0, 299, 289, 1, 0, 0, 0, 299, 291, 1, 0,
		0, 0, 299, 293, 1, 0, 0, 0, 299, 295, 1, 0, 0, 0, 299, 297, 1, 0, 0, 0,
		300, 343, 1, 0, 0, 0, 301, 302, 10, 17, 0, 0, 302, 303, 7, 0, 0, 0, 303,
		304, 3, 28, 14, 18, 304, 305, 6, 14, -1, 0, 305, 342, 1, 0, 0, 0, 306,
		307, 10, 16, 0, 0, 307, 308, 7, 1, 0, 0, 308, 309, 3, 28, 14, 17, 309,
		310, 6, 14, -1, 0, 310, 342, 1, 0, 0, 0, 311, 312, 10, 15, 0, 0, 312, 313,
		7, 2, 0, 0, 313, 314, 3, 28, 14, 16, 314, 315, 6, 14, -1, 0, 315, 342,
		1, 0, 0, 0, 316, 317, 10, 14, 0, 0, 317, 318, 7, 3, 0, 0, 318, 319, 3,
		28, 14, 15, 319, 320, 6, 14, -1, 0, 320, 342, 1, 0, 0, 0, 321, 322, 10,
		13, 0, 0, 322, 323, 7, 4, 0, 0, 323, 324, 3, 28, 14, 14, 324, 325, 6, 14,
		-1, 0, 325, 342, 1, 0, 0, 0, 326, 327, 10, 12, 0, 0, 327, 328, 5, 51, 0,
		0, 328, 329, 3, 28, 14, 13, 329, 330, 6, 14, -1, 0, 330, 342, 1, 0, 0,
		0, 331, 332, 10, 11, 0, 0, 332, 333, 5, 50, 0, 0, 333, 334, 3, 28, 14,
		12, 334, 335, 6, 14, -1, 0, 335, 342, 1, 0, 0, 0, 336, 337, 10, 10, 0,
		0, 337, 338, 5, 56, 0, 0, 338, 339, 3, 28, 14, 11, 339, 340, 6, 14, -1,
		0, 340, 342, 1, 0, 0, 0, 341, 301, 1, 0, 0, 0, 341, 306, 1, 0, 0, 0, 341,
		311, 1, 0, 0, 0, 341, 316, 1, 0, 0, 0, 341, 321, 1, 0, 0, 0, 341, 326,
		1, 0, 0, 0, 341, 331, 1, 0, 0, 0, 341, 336, 1, 0, 0, 0, 342, 345, 1, 0,
		0, 0, 343, 341, 1, 0, 0, 0, 343, 344, 1, 0, 0, 0, 344, 29, 1, 0, 0, 0,
		345, 343, 1, 0, 0, 0, 346, 347, 5, 11, 0, 0, 347, 348, 3, 28, 14, 0, 348,
		349, 5, 63, 0, 0, 349, 350, 3, 6, 3, 0, 350, 351, 5, 64, 0, 0, 351, 352,
		6, 15, -1, 0, 352, 374, 1, 0, 0, 0, 353, 354, 5, 11, 0, 0, 354, 355, 3,
		28, 14, 0, 355, 356, 5, 63, 0, 0, 356, 357, 3, 6, 3, 0, 357, 358, 5, 64,
		0, 0, 358, 359, 5, 12, 0, 0, 359, 360, 5, 63, 0, 0, 360, 361, 3, 6, 3,
		0, 361, 362, 5, 64, 0, 0, 362, 363, 6, 15, -1, 0, 363, 374, 1, 0, 0, 0,
		364, 365, 5, 11, 0, 0, 365, 366, 3, 28, 14, 0, 366, 367, 5, 63, 0, 0, 367,
		368, 3, 6, 3, 0, 368, 369, 5, 64, 0, 0, 369, 370, 5, 12, 0, 0, 370, 371,
		3, 30, 15, 0, 371, 372, 6, 15, -1, 0, 372, 374, 1, 0, 0, 0, 373, 346, 1,
		0, 0, 0, 373, 353, 1, 0, 0, 0, 373, 364, 1, 0, 0, 0, 374, 31, 1, 0, 0,
		0, 375, 376, 5, 13, 0, 0, 376, 377, 3, 28, 14, 0, 377, 378, 5, 63, 0, 0,
		378, 382, 3, 34, 17, 0, 379, 380, 5, 15, 0, 0, 380, 381, 5, 42, 0, 0, 381,
		383, 3, 6, 3, 0, 382, 379, 1, 0, 0, 0, 382, 383, 1, 0, 0, 0, 383, 384,
		1, 0, 0, 0, 384, 385, 5, 64, 0, 0, 385, 386, 6, 16, -1, 0, 386, 33, 1,
		0, 0, 0, 387, 389, 3, 36, 18, 0, 388, 387, 1, 0, 0, 0, 389, 390, 1, 0,
		0, 0, 390, 388, 1, 0, 0, 0, 390, 391, 1, 0, 0, 0, 391, 392, 1, 0, 0, 0,
		392, 393, 6, 17, -1, 0, 393, 35, 1, 0, 0, 0, 394, 395, 5, 14, 0, 0, 395,
		396, 3, 28, 14, 0, 396, 397, 5, 42, 0, 0, 397, 398, 3, 6, 3, 0, 398, 399,
		6, 18, -1, 0, 399, 37, 1, 0, 0, 0, 400, 401, 5, 21, 0, 0, 401, 402, 3,
		28, 14, 0, 402, 403, 5, 63, 0, 0, 403, 404, 3, 6, 3, 0, 404, 405, 5, 64,
		0, 0, 405, 406, 6, 19, -1, 0, 406, 39, 1, 0, 0, 0, 407, 408, 5, 18, 0,
		0, 408, 409, 5, 38, 0, 0, 409, 410, 5, 19, 0, 0, 410, 411, 3, 28, 14, 0,
		411, 412, 5, 20, 0, 0, 412, 413, 3, 28, 14, 0, 413, 414, 5, 63, 0, 0, 414,
		415, 3, 6, 3, 0, 415, 416, 5, 64, 0, 0, 416, 417, 6, 20, -1, 0, 417, 41,
		1, 0, 0, 0, 25, 49, 55, 61, 67, 73, 89, 94, 100, 106, 112, 118, 134, 163,
		179, 196, 225, 241, 258, 270, 299, 341, 343, 373, 382, 390,
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
	SwiftGrammarParserRULE_switchcontrol         = 16
	SwiftGrammarParserRULE_blockcase             = 17
	SwiftGrammarParserRULE_bloquecase            = 18
	SwiftGrammarParserRULE_whilecontrol          = 19
	SwiftGrammarParserRULE_forcontrol            = 20
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
		p.SetState(42)

		var _x = p.Block()

		localctx.(*SContext)._block = _x
	}
	{
		p.SetState(43)
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
	p.SetState(47)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&274913831680) != 0) {
		{
			p.SetState(46)

			var _x = p.Instruction()

			localctx.(*BlockContext)._instruction = _x
		}
		localctx.(*BlockContext).ins = append(localctx.(*BlockContext).ins, localctx.(*BlockContext)._instruction)

		p.SetState(49)
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

	// Get_switchcontrol returns the _switchcontrol rule contexts.
	Get_switchcontrol() ISwitchcontrolContext

	// Get_whilecontrol returns the _whilecontrol rule contexts.
	Get_whilecontrol() IWhilecontrolContext

	// Get_forcontrol returns the _forcontrol rule contexts.
	Get_forcontrol() IForcontrolContext

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

	// Set_switchcontrol sets the _switchcontrol rule contexts.
	Set_switchcontrol(ISwitchcontrolContext)

	// Set_whilecontrol sets the _whilecontrol rule contexts.
	Set_whilecontrol(IWhilecontrolContext)

	// Set_forcontrol sets the _forcontrol rule contexts.
	Set_forcontrol(IForcontrolContext)

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
	Switchcontrol() ISwitchcontrolContext
	Whilecontrol() IWhilecontrolContext
	Forcontrol() IForcontrolContext

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
	_switchcontrol      ISwitchcontrolContext
	_whilecontrol       IWhilecontrolContext
	_forcontrol         IForcontrolContext
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

func (s *InstructionContext) Get_switchcontrol() ISwitchcontrolContext { return s._switchcontrol }

func (s *InstructionContext) Get_whilecontrol() IWhilecontrolContext { return s._whilecontrol }

func (s *InstructionContext) Get_forcontrol() IForcontrolContext { return s._forcontrol }

func (s *InstructionContext) Set_printstmt(v IPrintstmtContext) { s._printstmt = v }

func (s *InstructionContext) Set_declavarible(v IDeclavaribleContext) { s._declavarible = v }

func (s *InstructionContext) Set_declaconstante(v IDeclaconstanteContext) { s._declaconstante = v }

func (s *InstructionContext) Set_asignacionvariable(v IAsignacionvariableContext) {
	s._asignacionvariable = v
}

func (s *InstructionContext) Set_sentenciaifelse(v ISentenciaifelseContext) { s._sentenciaifelse = v }

func (s *InstructionContext) Set_switchcontrol(v ISwitchcontrolContext) { s._switchcontrol = v }

func (s *InstructionContext) Set_whilecontrol(v IWhilecontrolContext) { s._whilecontrol = v }

func (s *InstructionContext) Set_forcontrol(v IForcontrolContext) { s._forcontrol = v }

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

	p.SetState(89)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserPRINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(53)

			var _x = p.Printstmt()

			localctx.(*InstructionContext)._printstmt = _x
		}
		p.SetState(55)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(54)
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
			p.SetState(59)

			var _x = p.Declavarible()

			localctx.(*InstructionContext)._declavarible = _x
		}
		p.SetState(61)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(60)
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
			p.SetState(65)

			var _x = p.Declaconstante()

			localctx.(*InstructionContext)._declaconstante = _x
		}
		p.SetState(67)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(66)
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
			p.SetState(71)

			var _x = p.Asignacionvariable()

			localctx.(*InstructionContext)._asignacionvariable = _x
		}
		p.SetState(73)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(72)
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
			p.SetState(77)

			var _x = p.Sentenciaifelse()

			localctx.(*InstructionContext)._sentenciaifelse = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_sentenciaifelse().GetMyIfElse()

	case SwiftGrammarParserSWITCH:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(80)

			var _x = p.Switchcontrol()

			localctx.(*InstructionContext)._switchcontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_switchcontrol().GetMySwitch()

	case SwiftGrammarParserWHILE:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(83)

			var _x = p.Whilecontrol()

			localctx.(*InstructionContext)._whilecontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_whilecontrol().GetWhict()

	case SwiftGrammarParserFOR:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(86)

			var _x = p.Forcontrol()

			localctx.(*InstructionContext)._forcontrol = _x
		}
		localctx.(*InstructionContext).inst = localctx.(*InstructionContext).Get_forcontrol().GetForct()

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
	p.SetState(92)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = ((int64(_la) & ^0x3f) == 0 && ((int64(1)<<_la)&274913831680) != 0) {
		{
			p.SetState(91)

			var _x = p.Instructionint()

			localctx.(*BlockinternoContext)._instructionint = _x
		}
		localctx.(*BlockinternoContext).insint = append(localctx.(*BlockinternoContext).insint, localctx.(*BlockinternoContext)._instructionint)

		p.SetState(94)
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

	// Get_switchcontrol returns the _switchcontrol rule contexts.
	Get_switchcontrol() ISwitchcontrolContext

	// Get_whilecontrol returns the _whilecontrol rule contexts.
	Get_whilecontrol() IWhilecontrolContext

	// Get_forcontrol returns the _forcontrol rule contexts.
	Get_forcontrol() IForcontrolContext

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

	// Set_switchcontrol sets the _switchcontrol rule contexts.
	Set_switchcontrol(ISwitchcontrolContext)

	// Set_whilecontrol sets the _whilecontrol rule contexts.
	Set_whilecontrol(IWhilecontrolContext)

	// Set_forcontrol sets the _forcontrol rule contexts.
	Set_forcontrol(IForcontrolContext)

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
	Switchcontrol() ISwitchcontrolContext
	Whilecontrol() IWhilecontrolContext
	Forcontrol() IForcontrolContext

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
	_switchcontrol         ISwitchcontrolContext
	_whilecontrol          IWhilecontrolContext
	_forcontrol            IForcontrolContext
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

func (s *InstructionintContext) Get_switchcontrol() ISwitchcontrolContext { return s._switchcontrol }

func (s *InstructionintContext) Get_whilecontrol() IWhilecontrolContext { return s._whilecontrol }

func (s *InstructionintContext) Get_forcontrol() IForcontrolContext { return s._forcontrol }

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

func (s *InstructionintContext) Set_switchcontrol(v ISwitchcontrolContext) { s._switchcontrol = v }

func (s *InstructionintContext) Set_whilecontrol(v IWhilecontrolContext) { s._whilecontrol = v }

func (s *InstructionintContext) Set_forcontrol(v IForcontrolContext) { s._forcontrol = v }

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

	p.SetState(134)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserPRINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(98)

			var _x = p.Printstmtint()

			localctx.(*InstructionintContext)._printstmtint = _x
		}
		p.SetState(100)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(99)
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
			p.SetState(104)

			var _x = p.Declavaribleint()

			localctx.(*InstructionintContext)._declavaribleint = _x
		}
		p.SetState(106)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(105)
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
			p.SetState(110)

			var _x = p.Declaconstanteint()

			localctx.(*InstructionintContext)._declaconstanteint = _x
		}
		p.SetState(112)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(111)
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
			p.SetState(116)

			var _x = p.Asignacionvariableint()

			localctx.(*InstructionintContext)._asignacionvariableint = _x
		}
		p.SetState(118)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		if _la == SwiftGrammarParserPUNTOCOMA {
			{
				p.SetState(117)
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
			p.SetState(122)

			var _x = p.Sentenciaifelse()

			localctx.(*InstructionintContext)._sentenciaifelse = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_sentenciaifelse().GetMyIfElse()

	case SwiftGrammarParserSWITCH:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(125)

			var _x = p.Switchcontrol()

			localctx.(*InstructionintContext)._switchcontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_switchcontrol().GetMySwitch()

	case SwiftGrammarParserWHILE:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(128)

			var _x = p.Whilecontrol()

			localctx.(*InstructionintContext)._whilecontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_whilecontrol().GetWhict()

	case SwiftGrammarParserFOR:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(131)

			var _x = p.Forcontrol()

			localctx.(*InstructionintContext)._forcontrol = _x
		}
		localctx.(*InstructionintContext).insint = localctx.(*InstructionintContext).Get_forcontrol().GetForct()

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
		p.SetState(136)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(137)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(138)

		var _x = p.expr(0)

		localctx.(*PrintstmtContext)._expr = _x
	}
	{
		p.SetState(139)
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
	p.SetState(163)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 12, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(142)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(143)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(144)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(145)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleContext)._tipodato = _x
		}
		{
			p.SetState(146)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(147)

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
			p.SetState(150)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(151)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(152)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(153)

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
			p.SetState(156)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(157)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(158)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(159)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleContext)._tipodato = _x
		}
		{
			p.SetState(160)
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
	p.SetState(179)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 13, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(165)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(166)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(167)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(168)

			var _x = p.Tipodato()

			localctx.(*DeclaconstanteContext)._tipodato = _x
		}
		{
			p.SetState(169)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(170)

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
			p.SetState(173)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(174)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(175)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(176)

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
	p.SetState(196)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 14, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(181)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(182)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(183)

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
			p.SetState(186)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(187)
			p.Match(SwiftGrammarParserSUMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(188)

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
			p.SetState(191)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(192)
			p.Match(SwiftGrammarParserRESTA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(193)

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
		p.SetState(198)

		var _m = p.Match(SwiftGrammarParserPRINT)

		localctx.(*PrintstmtintContext)._PRINT = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(199)
		p.Match(SwiftGrammarParserPARIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(200)

		var _x = p.expr(0)

		localctx.(*PrintstmtintContext)._expr = _x
	}
	{
		p.SetState(201)
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
	p.SetState(225)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 15, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(204)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(205)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(206)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(207)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleintContext)._tipodato = _x
		}
		{
			p.SetState(208)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(209)

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
			p.SetState(212)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(213)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(214)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(215)

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
			p.SetState(218)

			var _m = p.Match(SwiftGrammarParserVAR)

			localctx.(*DeclavaribleintContext)._VAR = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(219)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclavaribleintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(220)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(221)

			var _x = p.Tipodato()

			localctx.(*DeclavaribleintContext)._tipodato = _x
		}
		{
			p.SetState(222)
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
	p.SetState(241)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 16, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(227)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteintContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(228)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(229)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(230)

			var _x = p.Tipodato()

			localctx.(*DeclaconstanteintContext)._tipodato = _x
		}
		{
			p.SetState(231)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(232)

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
			p.SetState(235)

			var _m = p.Match(SwiftGrammarParserLET)

			localctx.(*DeclaconstanteintContext)._LET = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(236)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*DeclaconstanteintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(237)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(238)

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
	p.SetState(258)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 17, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(243)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(244)
			p.Match(SwiftGrammarParserIG)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(245)

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
			p.SetState(248)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(249)
			p.Match(SwiftGrammarParserSUMA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(250)

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
			p.SetState(253)

			var _m = p.Match(SwiftGrammarParserID_VALIDO)

			localctx.(*AsignacionvariableintContext)._ID_VALIDO = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(254)
			p.Match(SwiftGrammarParserRESTA)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(255)

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
	p.SetState(270)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserINT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(260)
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
			p.SetState(262)
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
			p.SetState(264)
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
			p.SetState(266)
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
			p.SetState(268)
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
	SUB() antlr.TerminalNode
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
	p.SetState(299)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case SwiftGrammarParserNOT:
		{
			p.SetState(273)

			var _m = p.Match(SwiftGrammarParserNOT)

			localctx.(*ExprContext).op = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(274)

			var _x = p.expr(18)

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
			p.SetState(277)
			p.Match(SwiftGrammarParserPARIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(278)

			var _x = p.expr(0)

			localctx.(*ExprContext)._expr = _x
		}
		{
			p.SetState(279)
			p.Match(SwiftGrammarParserPARDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		localctx.(*ExprContext).e = localctx.(*ExprContext).Get_expr().GetE()

	case SwiftGrammarParserSUB:
		{
			p.SetState(282)
			p.Match(SwiftGrammarParserSUB)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(283)

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

	case SwiftGrammarParserNUMBER:
		{
			p.SetState(285)

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
			p.SetState(287)

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
			p.SetState(289)

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
			p.SetState(291)

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
			p.SetState(293)

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
			p.SetState(295)

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
			p.SetState(297)

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
	p.SetState(343)
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
			p.SetState(341)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}

			switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 20, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(301)

				if !(p.Precpred(p.GetParserRuleContext(), 17)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 17)", ""))
					goto errorExit
				}
				{
					p.SetState(302)

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
					p.SetState(303)

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

			case 2:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(306)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
					goto errorExit
				}
				{
					p.SetState(307)

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
					p.SetState(308)

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

			case 3:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(311)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
					goto errorExit
				}
				{
					p.SetState(312)

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
					p.SetState(313)

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

			case 4:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(316)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
					goto errorExit
				}
				{
					p.SetState(317)

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
					p.SetState(318)

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

			case 5:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(321)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
					goto errorExit
				}
				{
					p.SetState(322)

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
					p.SetState(323)

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

			case 6:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(326)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
					goto errorExit
				}
				{
					p.SetState(327)

					var _m = p.Match(SwiftGrammarParserAND)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(328)

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

			case 7:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(331)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
					goto errorExit
				}
				{
					p.SetState(332)

					var _m = p.Match(SwiftGrammarParserOR)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(333)

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

			case 8:
				localctx = NewExprContext(p, _parentctx, _parentState)
				localctx.(*ExprContext).left = _prevctx
				p.PushNewRecursionContext(localctx, _startState, SwiftGrammarParserRULE_expr)
				p.SetState(336)

				if !(p.Precpred(p.GetParserRuleContext(), 10)) {
					p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 10)", ""))
					goto errorExit
				}
				{
					p.SetState(337)

					var _m = p.Match(SwiftGrammarParserMODULO)

					localctx.(*ExprContext).op = _m
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}
				{
					p.SetState(338)

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

			case antlr.ATNInvalidAltNumber:
				goto errorExit
			}

		}
		p.SetState(345)
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
	p.SetState(373)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 22, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(346)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(347)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(348)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(349)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext)._blockinterno = _x
		}
		{
			p.SetState(350)
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
			p.SetState(353)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(354)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(355)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(356)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext).ifop = _x
		}
		{
			p.SetState(357)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(358)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(359)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(360)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext).elseop = _x
		}
		{
			p.SetState(361)
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
			p.SetState(364)

			var _m = p.Match(SwiftGrammarParserIF)

			localctx.(*SentenciaifelseContext)._IF = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(365)

			var _x = p.expr(0)

			localctx.(*SentenciaifelseContext)._expr = _x
		}
		{
			p.SetState(366)
			p.Match(SwiftGrammarParserLLAVEIZQ)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(367)

			var _x = p.Blockinterno()

			localctx.(*SentenciaifelseContext)._blockinterno = _x
		}
		{
			p.SetState(368)
			p.Match(SwiftGrammarParserLLAVEDER)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(369)
			p.Match(SwiftGrammarParserELSE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(370)

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
	p.EnterRule(localctx, 32, SwiftGrammarParserRULE_switchcontrol)
	var _la int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(375)

		var _m = p.Match(SwiftGrammarParserSWITCH)

		localctx.(*SwitchcontrolContext)._SWITCH = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(376)

		var _x = p.expr(0)

		localctx.(*SwitchcontrolContext)._expr = _x
	}
	{
		p.SetState(377)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(378)

		var _x = p.Blockcase()

		localctx.(*SwitchcontrolContext)._blockcase = _x
	}
	p.SetState(382)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	if _la == SwiftGrammarParserDEFAULT {
		{
			p.SetState(379)

			var _m = p.Match(SwiftGrammarParserDEFAULT)

			localctx.(*SwitchcontrolContext)._DEFAULT = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(380)
			p.Match(SwiftGrammarParserDOS_PUNTOS)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(381)

			var _x = p.Blockinterno()

			localctx.(*SwitchcontrolContext)._blockinterno = _x
		}

	}
	{
		p.SetState(384)
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
	p.EnterRule(localctx, 34, SwiftGrammarParserRULE_blockcase)

	localctx.(*BlockcaseContext).blkcase = []interface{}{}
	var listInt []IBloquecaseContext

	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(388)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = _la == SwiftGrammarParserCASE {
		{
			p.SetState(387)

			var _x = p.Bloquecase()

			localctx.(*BlockcaseContext)._bloquecase = _x
		}
		localctx.(*BlockcaseContext).blocas = append(localctx.(*BlockcaseContext).blocas, localctx.(*BlockcaseContext)._bloquecase)

		p.SetState(390)
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
	p.EnterRule(localctx, 36, SwiftGrammarParserRULE_bloquecase)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(394)

		var _m = p.Match(SwiftGrammarParserCASE)

		localctx.(*BloquecaseContext)._CASE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(395)

		var _x = p.expr(0)

		localctx.(*BloquecaseContext)._expr = _x
	}
	{
		p.SetState(396)
		p.Match(SwiftGrammarParserDOS_PUNTOS)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(397)

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
	p.EnterRule(localctx, 38, SwiftGrammarParserRULE_whilecontrol)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(400)

		var _m = p.Match(SwiftGrammarParserWHILE)

		localctx.(*WhilecontrolContext)._WHILE = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(401)

		var _x = p.expr(0)

		localctx.(*WhilecontrolContext)._expr = _x
	}
	{
		p.SetState(402)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(403)

		var _x = p.Blockinterno()

		localctx.(*WhilecontrolContext)._blockinterno = _x
	}
	{
		p.SetState(404)
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

	// SetLeft sets the left rule contexts.
	SetLeft(IExprContext)

	// SetRight sets the right rule contexts.
	SetRight(IExprContext)

	// Set_blockinterno sets the _blockinterno rule contexts.
	Set_blockinterno(IBlockinternoContext)

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

func (s *ForcontrolContext) SetLeft(v IExprContext) { s.left = v }

func (s *ForcontrolContext) SetRight(v IExprContext) { s.right = v }

func (s *ForcontrolContext) Set_blockinterno(v IBlockinternoContext) { s._blockinterno = v }

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
	p.EnterRule(localctx, 40, SwiftGrammarParserRULE_forcontrol)
	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(407)

		var _m = p.Match(SwiftGrammarParserFOR)

		localctx.(*ForcontrolContext)._FOR = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(408)

		var _m = p.Match(SwiftGrammarParserID_VALIDO)

		localctx.(*ForcontrolContext)._ID_VALIDO = _m
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(409)
		p.Match(SwiftGrammarParserIN)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(410)

		var _x = p.expr(0)

		localctx.(*ForcontrolContext).left = _x
	}
	{
		p.SetState(411)
		p.Match(SwiftGrammarParserRANGO)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(412)

		var _x = p.expr(0)

		localctx.(*ForcontrolContext).right = _x
	}
	{
		p.SetState(413)
		p.Match(SwiftGrammarParserLLAVEIZQ)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}
	{
		p.SetState(414)

		var _x = p.Blockinterno()

		localctx.(*ForcontrolContext)._blockinterno = _x
	}
	{
		p.SetState(415)
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
		return p.Precpred(p.GetParserRuleContext(), 17)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 16)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 15)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 14)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 13)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 12)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 10)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
