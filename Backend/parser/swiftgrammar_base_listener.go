// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// BaseSwiftGrammarListener is a complete listener for a parse tree produced by SwiftGrammarParser.
type BaseSwiftGrammarListener struct{}

var _ SwiftGrammarListener = &BaseSwiftGrammarListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseSwiftGrammarListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseSwiftGrammarListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseSwiftGrammarListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseSwiftGrammarListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterS is called when production s is entered.
func (s *BaseSwiftGrammarListener) EnterS(ctx *SContext) {}

// ExitS is called when production s is exited.
func (s *BaseSwiftGrammarListener) ExitS(ctx *SContext) {}

// EnterBlock is called when production block is entered.
func (s *BaseSwiftGrammarListener) EnterBlock(ctx *BlockContext) {}

// ExitBlock is called when production block is exited.
func (s *BaseSwiftGrammarListener) ExitBlock(ctx *BlockContext) {}

// EnterInstruction is called when production instruction is entered.
func (s *BaseSwiftGrammarListener) EnterInstruction(ctx *InstructionContext) {}

// ExitInstruction is called when production instruction is exited.
func (s *BaseSwiftGrammarListener) ExitInstruction(ctx *InstructionContext) {}

// EnterPrintstmt is called when production printstmt is entered.
func (s *BaseSwiftGrammarListener) EnterPrintstmt(ctx *PrintstmtContext) {}

// ExitPrintstmt is called when production printstmt is exited.
func (s *BaseSwiftGrammarListener) ExitPrintstmt(ctx *PrintstmtContext) {}

// EnterDeclavarible is called when production declavarible is entered.
func (s *BaseSwiftGrammarListener) EnterDeclavarible(ctx *DeclavaribleContext) {}

// ExitDeclavarible is called when production declavarible is exited.
func (s *BaseSwiftGrammarListener) ExitDeclavarible(ctx *DeclavaribleContext) {}

// EnterDeclaconstante is called when production declaconstante is entered.
func (s *BaseSwiftGrammarListener) EnterDeclaconstante(ctx *DeclaconstanteContext) {}

// ExitDeclaconstante is called when production declaconstante is exited.
func (s *BaseSwiftGrammarListener) ExitDeclaconstante(ctx *DeclaconstanteContext) {}

// EnterAsignacionvariable is called when production asignacionvariable is entered.
func (s *BaseSwiftGrammarListener) EnterAsignacionvariable(ctx *AsignacionvariableContext) {}

// ExitAsignacionvariable is called when production asignacionvariable is exited.
func (s *BaseSwiftGrammarListener) ExitAsignacionvariable(ctx *AsignacionvariableContext) {}

// EnterTipodato is called when production tipodato is entered.
func (s *BaseSwiftGrammarListener) EnterTipodato(ctx *TipodatoContext) {}

// ExitTipodato is called when production tipodato is exited.
func (s *BaseSwiftGrammarListener) ExitTipodato(ctx *TipodatoContext) {}

// EnterExpr is called when production expr is entered.
func (s *BaseSwiftGrammarListener) EnterExpr(ctx *ExprContext) {}

// ExitExpr is called when production expr is exited.
func (s *BaseSwiftGrammarListener) ExitExpr(ctx *ExprContext) {}
