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

// EnterBlockinterno is called when production blockinterno is entered.
func (s *BaseSwiftGrammarListener) EnterBlockinterno(ctx *BlockinternoContext) {}

// ExitBlockinterno is called when production blockinterno is exited.
func (s *BaseSwiftGrammarListener) ExitBlockinterno(ctx *BlockinternoContext) {}

// EnterInstructionint is called when production instructionint is entered.
func (s *BaseSwiftGrammarListener) EnterInstructionint(ctx *InstructionintContext) {}

// ExitInstructionint is called when production instructionint is exited.
func (s *BaseSwiftGrammarListener) ExitInstructionint(ctx *InstructionintContext) {}

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

// EnterPrintstmtint is called when production printstmtint is entered.
func (s *BaseSwiftGrammarListener) EnterPrintstmtint(ctx *PrintstmtintContext) {}

// ExitPrintstmtint is called when production printstmtint is exited.
func (s *BaseSwiftGrammarListener) ExitPrintstmtint(ctx *PrintstmtintContext) {}

// EnterDeclavaribleint is called when production declavaribleint is entered.
func (s *BaseSwiftGrammarListener) EnterDeclavaribleint(ctx *DeclavaribleintContext) {}

// ExitDeclavaribleint is called when production declavaribleint is exited.
func (s *BaseSwiftGrammarListener) ExitDeclavaribleint(ctx *DeclavaribleintContext) {}

// EnterDeclaconstanteint is called when production declaconstanteint is entered.
func (s *BaseSwiftGrammarListener) EnterDeclaconstanteint(ctx *DeclaconstanteintContext) {}

// ExitDeclaconstanteint is called when production declaconstanteint is exited.
func (s *BaseSwiftGrammarListener) ExitDeclaconstanteint(ctx *DeclaconstanteintContext) {}

// EnterAsignacionvariableint is called when production asignacionvariableint is entered.
func (s *BaseSwiftGrammarListener) EnterAsignacionvariableint(ctx *AsignacionvariableintContext) {}

// ExitAsignacionvariableint is called when production asignacionvariableint is exited.
func (s *BaseSwiftGrammarListener) ExitAsignacionvariableint(ctx *AsignacionvariableintContext) {}

// EnterTipodato is called when production tipodato is entered.
func (s *BaseSwiftGrammarListener) EnterTipodato(ctx *TipodatoContext) {}

// ExitTipodato is called when production tipodato is exited.
func (s *BaseSwiftGrammarListener) ExitTipodato(ctx *TipodatoContext) {}

// EnterExpr is called when production expr is entered.
func (s *BaseSwiftGrammarListener) EnterExpr(ctx *ExprContext) {}

// ExitExpr is called when production expr is exited.
func (s *BaseSwiftGrammarListener) ExitExpr(ctx *ExprContext) {}

// EnterSentenciaifelse is called when production sentenciaifelse is entered.
func (s *BaseSwiftGrammarListener) EnterSentenciaifelse(ctx *SentenciaifelseContext) {}

// ExitSentenciaifelse is called when production sentenciaifelse is exited.
func (s *BaseSwiftGrammarListener) ExitSentenciaifelse(ctx *SentenciaifelseContext) {}

// EnterSwitchcontrol is called when production switchcontrol is entered.
func (s *BaseSwiftGrammarListener) EnterSwitchcontrol(ctx *SwitchcontrolContext) {}

// ExitSwitchcontrol is called when production switchcontrol is exited.
func (s *BaseSwiftGrammarListener) ExitSwitchcontrol(ctx *SwitchcontrolContext) {}

// EnterBlockcase is called when production blockcase is entered.
func (s *BaseSwiftGrammarListener) EnterBlockcase(ctx *BlockcaseContext) {}

// ExitBlockcase is called when production blockcase is exited.
func (s *BaseSwiftGrammarListener) ExitBlockcase(ctx *BlockcaseContext) {}

// EnterBloquecase is called when production bloquecase is entered.
func (s *BaseSwiftGrammarListener) EnterBloquecase(ctx *BloquecaseContext) {}

// ExitBloquecase is called when production bloquecase is exited.
func (s *BaseSwiftGrammarListener) ExitBloquecase(ctx *BloquecaseContext) {}

// EnterWhilecontrol is called when production whilecontrol is entered.
func (s *BaseSwiftGrammarListener) EnterWhilecontrol(ctx *WhilecontrolContext) {}

// ExitWhilecontrol is called when production whilecontrol is exited.
func (s *BaseSwiftGrammarListener) ExitWhilecontrol(ctx *WhilecontrolContext) {}

// EnterForcontrol is called when production forcontrol is entered.
func (s *BaseSwiftGrammarListener) EnterForcontrol(ctx *ForcontrolContext) {}

// ExitForcontrol is called when production forcontrol is exited.
func (s *BaseSwiftGrammarListener) ExitForcontrol(ctx *ForcontrolContext) {}
