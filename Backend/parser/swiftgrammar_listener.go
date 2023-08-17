// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// SwiftGrammarListener is a complete listener for a parse tree produced by SwiftGrammarParser.
type SwiftGrammarListener interface {
	antlr.ParseTreeListener

	// EnterS is called when entering the s production.
	EnterS(c *SContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterPrintstmt is called when entering the printstmt production.
	EnterPrintstmt(c *PrintstmtContext)

	// EnterDeclavarible is called when entering the declavarible production.
	EnterDeclavarible(c *DeclavaribleContext)

	// EnterDeclaconstante is called when entering the declaconstante production.
	EnterDeclaconstante(c *DeclaconstanteContext)

	// EnterAsignacionvariable is called when entering the asignacionvariable production.
	EnterAsignacionvariable(c *AsignacionvariableContext)

	// EnterTipodato is called when entering the tipodato production.
	EnterTipodato(c *TipodatoContext)

	// EnterExpr is called when entering the expr production.
	EnterExpr(c *ExprContext)

	// ExitS is called when exiting the s production.
	ExitS(c *SContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitPrintstmt is called when exiting the printstmt production.
	ExitPrintstmt(c *PrintstmtContext)

	// ExitDeclavarible is called when exiting the declavarible production.
	ExitDeclavarible(c *DeclavaribleContext)

	// ExitDeclaconstante is called when exiting the declaconstante production.
	ExitDeclaconstante(c *DeclaconstanteContext)

	// ExitAsignacionvariable is called when exiting the asignacionvariable production.
	ExitAsignacionvariable(c *AsignacionvariableContext)

	// ExitTipodato is called when exiting the tipodato production.
	ExitTipodato(c *TipodatoContext)

	// ExitExpr is called when exiting the expr production.
	ExitExpr(c *ExprContext)
}
