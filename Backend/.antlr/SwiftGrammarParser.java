// Generated from c:\Users\Henrr\OneDrive\Escritorio\Compiladores\Proyecto No. 1\Proyecto No. 1\Proyecto 1\Backend\SwiftGrammar.g4 by ANTLR 4.9.2

    import "Backend/interfaces"
    import "Backend/environment"
    import "Backend/expressions"
    import "Backend/instructions"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, STRING=3, BOOL=4, CHARACT=5, TRU=6, FAL=7, VAR=8, LET=9, 
		NULO=10, IF=11, ELSE=12, SWITCH=13, CASE=14, DEFAULT=15, BREAK=16, CONTINUE=17, 
		FOR=18, IN=19, RANGO=20, WHILE=21, GUARD=22, RETURN=23, FUNCION=24, PRINT=25, 
		INOUT=26, APPEND=27, REMOVE=28, REMOVELAST=29, COUNT=30, ISEMPTY=31, AT=32, 
		REPEATING=33, STRUCT=34, MUTATING=35, NUMBER=36, CADENA=37, ID_VALIDO=38, 
		CHARACTER=39, WS=40, IG=41, DOS_PUNTOS=42, PUNTOCOMA=43, CIERRE_INTE=44, 
		PARIZQ=45, PARDER=46, DIF=47, IG_IG=48, NOT=49, OR=50, AND=51, MAY_IG=52, 
		MEN_IG=53, MAYOR=54, MENOR=55, MODULO=56, MUL=57, DIV=58, ADD=59, SUB=60, 
		SUMA=61, RESTA=62, LLAVEIZQ=63, LLAVEDER=64, RETORNO=65, COMA=66, PUNTO=67, 
		GUIONBAJO=68, CORCHIZQ=69, CORCHDER=70, WHITESPACE=71, COMMENT=72, LINE_COMMENT=73;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_blockinterno = 3, 
		RULE_instructionint = 4, RULE_printstmt = 5, RULE_declavarible = 6, RULE_declaconstante = 7, 
		RULE_asignacionvariable = 8, RULE_printstmtint = 9, RULE_declavaribleint = 10, 
		RULE_declaconstanteint = 11, RULE_asignacionvariableint = 12, RULE_tipodato = 13, 
		RULE_expr = 14, RULE_sentenciaifelse = 15, RULE_switchcontrol = 16, RULE_blockcase = 17, 
		RULE_bloquecase = 18, RULE_whilecontrol = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "blockinterno", "instructionint", "printstmt", 
			"declavarible", "declaconstante", "asignacionvariable", "printstmtint", 
			"declavaribleint", "declaconstanteint", "asignacionvariableint", "tipodato", 
			"expr", "sentenciaifelse", "switchcontrol", "blockcase", "bloquecase", 
			"whilecontrol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", "'true'", 
			"'false'", "'var'", "'let'", "'nil'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'breack'", "'continue'", "'for'", "'in'", "'...'", "'while'", 
			"'guard'", "'return'", "'func'", "'print'", "'inout'", "'append'", "'remove'", 
			"'removeLast'", "'count'", "'isEmpty'", "'at'", "'repeating'", "'struct'", 
			"'mutating'", null, null, null, null, null, "'='", "':'", "';'", "'?'", 
			"'('", "')'", "'!='", "'=='", "'!'", "'||'", "'&&'", "'>='", "'<='", 
			"'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'+='", "'-='", "'{'", 
			"'}'", "'->'", "','", "'.'", "'_'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR", 
			"LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", "PRINT", 
			"INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "ISEMPTY", "AT", 
			"REPEATING", "STRUCT", "MUTATING", "NUMBER", "CADENA", "ID_VALIDO", "CHARACTER", 
			"WS", "IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ", "PARDER", 
			"DIF", "IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", 
			"MODULO", "MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", "LLAVEDER", 
			"RETORNO", "COMA", "PUNTO", "GUIONBAJO", "CORCHIZQ", "CORCHDER", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((SContext)_localctx).block = block();
			setState(41);
			match(EOF);
			   
			        _localctx.code = ((SContext)_localctx).block.blk
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		    _localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINT) | (1L << ID_VALIDO))) != 0) );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public DeclavaribleContext declavarible;
		public DeclaconstanteContext declaconstante;
		public AsignacionvariableContext asignacionvariable;
		public SentenciaifelseContext sentenciaifelse;
		public SwitchcontrolContext switchcontrol;
		public WhilecontrolContext whilecontrol;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public DeclavaribleContext declavarible() {
			return getRuleContext(DeclavaribleContext.class,0);
		}
		public DeclaconstanteContext declaconstante() {
			return getRuleContext(DeclaconstanteContext.class,0);
		}
		public AsignacionvariableContext asignacionvariable() {
			return getRuleContext(AsignacionvariableContext.class,0);
		}
		public SentenciaifelseContext sentenciaifelse() {
			return getRuleContext(SentenciaifelseContext.class,0);
		}
		public SwitchcontrolContext switchcontrol() {
			return getRuleContext(SwitchcontrolContext.class,0);
		}
		public WhilecontrolContext whilecontrol() {
			return getRuleContext(WhilecontrolContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(52);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((InstructionContext)_localctx).declavarible = declavarible();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(58);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declavarible.decvbl
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				((InstructionContext)_localctx).declaconstante = declaconstante();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(64);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declaconstante.deccon
				}
				break;
			case ID_VALIDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				((InstructionContext)_localctx).asignacionvariable = asignacionvariable();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(70);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				((InstructionContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.inst = ((InstructionContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				((InstructionContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				((InstructionContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.inst = ((InstructionContext)_localctx).whilecontrol.whict
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockinternoContext extends ParserRuleContext {
		public []interface{} blkint;
		public InstructionintContext instructionint;
		public List<InstructionintContext> insint = new ArrayList<InstructionintContext>();
		public List<InstructionintContext> instructionint() {
			return getRuleContexts(InstructionintContext.class);
		}
		public InstructionintContext instructionint(int i) {
			return getRuleContext(InstructionintContext.class,i);
		}
		public BlockinternoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockinterno; }
	}

	public final BlockinternoContext blockinterno() throws RecognitionException {
		BlockinternoContext _localctx = new BlockinternoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockinterno);

		    _localctx.blkint = []interface{}{}
		    var listInt []IInstructionintContext
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				((BlockinternoContext)_localctx).instructionint = instructionint();
				((BlockinternoContext)_localctx).insint.add(((BlockinternoContext)_localctx).instructionint);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << PRINT) | (1L << ID_VALIDO))) != 0) );

			        listInt = localctx.(*BlockinternoContext).GetInsint()
			        for _, e := range listInt {
			            _localctx.blkint = append(_localctx.blkint, e.GetInsint())
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionintContext extends ParserRuleContext {
		public interfaces.Instruction insint;
		public PrintstmtintContext printstmtint;
		public DeclavaribleintContext declavaribleint;
		public DeclaconstanteintContext declaconstanteint;
		public AsignacionvariableintContext asignacionvariableint;
		public SentenciaifelseContext sentenciaifelse;
		public SwitchcontrolContext switchcontrol;
		public WhilecontrolContext whilecontrol;
		public PrintstmtintContext printstmtint() {
			return getRuleContext(PrintstmtintContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public DeclavaribleintContext declavaribleint() {
			return getRuleContext(DeclavaribleintContext.class,0);
		}
		public DeclaconstanteintContext declaconstanteint() {
			return getRuleContext(DeclaconstanteintContext.class,0);
		}
		public AsignacionvariableintContext asignacionvariableint() {
			return getRuleContext(AsignacionvariableintContext.class,0);
		}
		public SentenciaifelseContext sentenciaifelse() {
			return getRuleContext(SentenciaifelseContext.class,0);
		}
		public SwitchcontrolContext switchcontrol() {
			return getRuleContext(SwitchcontrolContext.class,0);
		}
		public WhilecontrolContext whilecontrol() {
			return getRuleContext(WhilecontrolContext.class,0);
		}
		public InstructionintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionint; }
	}

	public final InstructionintContext instructionint() throws RecognitionException {
		InstructionintContext _localctx = new InstructionintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructionint);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((InstructionintContext)_localctx).printstmtint = printstmtint();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(94);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).printstmtint.prnt
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((InstructionintContext)_localctx).declavaribleint = declavaribleint();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(100);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declavaribleint.decvbl
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				((InstructionintContext)_localctx).declaconstanteint = declaconstanteint();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(106);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declaconstanteint.deccon
				}
				break;
			case ID_VALIDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				((InstructionintContext)_localctx).asignacionvariableint = asignacionvariableint();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(112);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).asignacionvariableint.asgvbl
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				((InstructionintContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.insint = ((InstructionintContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				((InstructionintContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				((InstructionintContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).whilecontrol.whict
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(129);
			match(PARIZQ);
			setState(130);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(131);
			match(PARDER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclavaribleContext extends ParserRuleContext {
		public interfaces.Instruction decvbl;
		public Token VAR;
		public Token ID_VALIDO;
		public TipodatoContext tipodato;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CIERRE_INTE() { return getToken(SwiftGrammarParser.CIERRE_INTE, 0); }
		public DeclavaribleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declavarible; }
	}

	public final DeclavaribleContext declavarible() throws RecognitionException {
		DeclavaribleContext _localctx = new DeclavaribleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declavarible);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(135);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(136);
				match(DOS_PUNTOS);
				setState(137);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(138);
				match(IG);
				setState(139);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), "Global",((DeclavaribleContext)_localctx).tipodato.tipo, ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(143);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(144);
				match(IG);
				setState(145);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), "Global", ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(149);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(150);
				match(DOS_PUNTOS);
				setState(151);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(152);
				match(CIERRE_INTE);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinExp((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), "Global", ((DeclavaribleContext)_localctx).tipodato.tipo)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaconstanteContext extends ParserRuleContext {
		public interfaces.Instruction deccon;
		public Token LET;
		public Token ID_VALIDO;
		public TipodatoContext tipodato;
		public ExprContext expr;
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaconstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaconstante; }
	}

	public final DeclaconstanteContext declaconstante() throws RecognitionException {
		DeclaconstanteContext _localctx = new DeclaconstanteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaconstante);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(158);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(159);
				match(DOS_PUNTOS);
				setState(160);
				((DeclaconstanteContext)_localctx).tipodato = tipodato();
				setState(161);
				match(IG);
				setState(162);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), "Global", ((DeclaconstanteContext)_localctx).tipodato.tipo, ((DeclaconstanteContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(166);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(167);
				match(IG);
				setState(168);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaracionSinTipo((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), "Global", ((DeclaconstanteContext)_localctx).expr.e)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionvariableContext extends ParserRuleContext {
		public interfaces.Instruction asgvbl;
		public Token ID_VALIDO;
		public ExprContext expr;
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(SwiftGrammarParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(SwiftGrammarParser.RESTA, 0); }
		public AsignacionvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionvariable; }
	}

	public final AsignacionvariableContext asignacionvariable() throws RecognitionException {
		AsignacionvariableContext _localctx = new AsignacionvariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacionvariable);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(174);
				match(IG);
				setState(175);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(179);
				match(SUMA);
				setState(180);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(184);
				match(RESTA);
				setState(185);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionResta((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintstmtintContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrintstmtintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmtint; }
	}

	public final PrintstmtintContext printstmtint() throws RecognitionException {
		PrintstmtintContext _localctx = new PrintstmtintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printstmtint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((PrintstmtintContext)_localctx).PRINT = match(PRINT);
			setState(191);
			match(PARIZQ);
			setState(192);
			((PrintstmtintContext)_localctx).expr = expr(0);
			setState(193);
			match(PARDER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtintContext)_localctx).PRINT!=null?((PrintstmtintContext)_localctx).PRINT.getLine():0),(((PrintstmtintContext)_localctx).PRINT!=null?((PrintstmtintContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtintContext)_localctx).expr.e)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclavaribleintContext extends ParserRuleContext {
		public interfaces.Instruction decvbl;
		public Token VAR;
		public Token ID_VALIDO;
		public TipodatoContext tipodato;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CIERRE_INTE() { return getToken(SwiftGrammarParser.CIERRE_INTE, 0); }
		public DeclavaribleintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declavaribleint; }
	}

	public final DeclavaribleintContext declavaribleint() throws RecognitionException {
		DeclavaribleintContext _localctx = new DeclavaribleintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declavaribleint);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(197);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(198);
				match(DOS_PUNTOS);
				setState(199);
				((DeclavaribleintContext)_localctx).tipodato = tipodato();
				setState(200);
				match(IG);
				setState(201);
				((DeclavaribleintContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), "Local",((DeclavaribleintContext)_localctx).tipodato.tipo, ((DeclavaribleintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(205);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(206);
				match(IG);
				setState(207);
				((DeclavaribleintContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), "Local", ((DeclavaribleintContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(211);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(212);
				match(DOS_PUNTOS);
				setState(213);
				((DeclavaribleintContext)_localctx).tipodato = tipodato();
				setState(214);
				match(CIERRE_INTE);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinExp((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), "Local", ((DeclavaribleintContext)_localctx).tipodato.tipo)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaconstanteintContext extends ParserRuleContext {
		public interfaces.Instruction deccon;
		public Token LET;
		public Token ID_VALIDO;
		public TipodatoContext tipodato;
		public ExprContext expr;
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaconstanteintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaconstanteint; }
	}

	public final DeclaconstanteintContext declaconstanteint() throws RecognitionException {
		DeclaconstanteintContext _localctx = new DeclaconstanteintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaconstanteint);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((DeclaconstanteintContext)_localctx).LET = match(LET);
				setState(220);
				((DeclaconstanteintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(221);
				match(DOS_PUNTOS);
				setState(222);
				((DeclaconstanteintContext)_localctx).tipodato = tipodato();
				setState(223);
				match(IG);
				setState(224);
				((DeclaconstanteintContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getLine():0), (((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteintContext)_localctx).ID_VALIDO!=null?((DeclaconstanteintContext)_localctx).ID_VALIDO.getText():null), "Local", ((DeclaconstanteintContext)_localctx).tipodato.tipo, ((DeclaconstanteintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((DeclaconstanteintContext)_localctx).LET = match(LET);
				setState(228);
				((DeclaconstanteintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(229);
				match(IG);
				setState(230);
				((DeclaconstanteintContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaracionSinTipo((((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getLine():0), (((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteintContext)_localctx).ID_VALIDO!=null?((DeclaconstanteintContext)_localctx).ID_VALIDO.getText():null), "Local", ((DeclaconstanteintContext)_localctx).expr.e)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionvariableintContext extends ParserRuleContext {
		public interfaces.Instruction asgvbl;
		public Token ID_VALIDO;
		public ExprContext expr;
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(SwiftGrammarParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(SwiftGrammarParser.RESTA, 0); }
		public AsignacionvariableintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionvariableint; }
	}

	public final AsignacionvariableintContext asignacionvariableint() throws RecognitionException {
		AsignacionvariableintContext _localctx = new AsignacionvariableintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacionvariableint);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(236);
				match(IG);
				setState(237);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(241);
				match(SUMA);
				setState(242);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(246);
				match(RESTA);
				setState(247);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionResta((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipodatoContext extends ParserRuleContext {
		public environment.TipoExpresion tipo;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CHARACT() { return getToken(SwiftGrammarParser.CHARACT, 0); }
		public TipodatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipodato; }
	}

	public final TipodatoContext tipodato() throws RecognitionException {
		TipodatoContext _localctx = new TipodatoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipodato);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(INT);
				 _localctx.tipo = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(FLOAT);
				 _localctx.tipo = environment.FLOAT 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(STRING);
				 _localctx.tipo = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(BOOL);
				 _localctx.tipo = environment.BOOLEAN 
				}
				break;
			case CHARACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(CHARACT);
				 _localctx.tipo = environment.CHARACTER 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public ExprContext expr;
		public Token NUMBER;
		public Token CADENA;
		public Token TRU;
		public Token FAL;
		public Token CHARACTER;
		public Token ID_VALIDO;
		public Token NULO;
		public TerminalNode NOT() { return getToken(SwiftGrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode CADENA() { return getToken(SwiftGrammarParser.CADENA, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode CHARACTER() { return getToken(SwiftGrammarParser.CHARACTER, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode NULO() { return getToken(SwiftGrammarParser.NULO, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public TerminalNode MODULO() { return getToken(SwiftGrammarParser.MODULO, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(265);
				((ExprContext)_localctx).op = match(NOT);
				setState(266);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetLine(), (((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetColumn(), ((ExprContext)_localctx).right.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
				}
				break;
			case PARIZQ:
				{
				setState(269);
				match(PARIZQ);
				setState(270);
				((ExprContext)_localctx).expr = expr(0);
				setState(271);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case NUMBER:
				{
				setState(274);
				((ExprContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
					        num2 := fmt.Sprintf("%.6f", num)
				            num3,err := strconv.ParseFloat(num2, 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num3,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case CADENA:
				{
				setState(276);
				((ExprContext)_localctx).CADENA = match(CADENA);

				        str := (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getLine():0), (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				{
				setState(278);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				{
				setState(280);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case CHARACTER:
				{
				setState(282);
				((ExprContext)_localctx).CHARACTER = match(CHARACTER);
				 
				        str := (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getLine():0), (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1], environment.CHARACTER) 
				    
				}
				break;
			case ID_VALIDO:
				{
				setState(284);
				((ExprContext)_localctx).ID_VALIDO = match(ID_VALIDO);

				        id := (((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getText():null)
				        _localctx.e = instructions.NewCallid((((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getLine():0),(((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getCharPositionInLine():0),id)
				    
				}
				break;
			case NULO:
				{
				setState(286);
				((ExprContext)_localctx).NULO = match(NULO);
				_localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getCharPositionInLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getText():null),environment.NULL)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(291);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(296);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(301);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAY_IG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(306);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MEN_IG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(311);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(316);
						((ExprContext)_localctx).op = match(AND);
						setState(317);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(321);
						((ExprContext)_localctx).op = match(OR);
						setState(322);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(326);
						((ExprContext)_localctx).op = match(MODULO);
						setState(327);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(10);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SentenciaifelseContext extends ParserRuleContext {
		public interfaces.Instruction myIfElse;
		public Token IF;
		public ExprContext expr;
		public BlockinternoContext blockinterno;
		public BlockinternoContext ifop;
		public BlockinternoContext elseop;
		public SentenciaifelseContext sentenciaifelse;
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVEIZQ() { return getTokens(SwiftGrammarParser.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(SwiftGrammarParser.LLAVEIZQ, i);
		}
		public List<BlockinternoContext> blockinterno() {
			return getRuleContexts(BlockinternoContext.class);
		}
		public BlockinternoContext blockinterno(int i) {
			return getRuleContext(BlockinternoContext.class,i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(SwiftGrammarParser.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(SwiftGrammarParser.LLAVEDER, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public SentenciaifelseContext sentenciaifelse() {
			return getRuleContext(SentenciaifelseContext.class,0);
		}
		public SentenciaifelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaifelse; }
	}

	public final SentenciaifelseContext sentenciaifelse() throws RecognitionException {
		SentenciaifelseContext _localctx = new SentenciaifelseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentenciaifelse);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(336);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(337);
				match(LLAVEIZQ);
				setState(338);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(339);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIf((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(343);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(344);
				match(LLAVEIZQ);
				setState(345);
				((SentenciaifelseContext)_localctx).ifop = blockinterno();
				setState(346);
				match(LLAVEDER);
				setState(347);
				match(ELSE);
				setState(348);
				match(LLAVEIZQ);
				setState(349);
				((SentenciaifelseContext)_localctx).elseop = blockinterno();
				setState(350);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIfElse((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).ifop.blkint , ((SentenciaifelseContext)_localctx).elseop.blkint)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(354);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(355);
				match(LLAVEIZQ);
				setState(356);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(357);
				match(LLAVEDER);
				setState(358);
				match(ELSE);
				setState(359);
				((SentenciaifelseContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.myIfElse = instructions.NewSentenciaIfElseIf((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).blockinterno.blkint, ((SentenciaifelseContext)_localctx).sentenciaifelse.myIfElse)
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchcontrolContext extends ParserRuleContext {
		public interfaces.Instruction mySwitch;
		public Token SWITCH;
		public ExprContext expr;
		public BlockcaseContext blockcase;
		public Token DEFAULT;
		public BlockinternoContext blockinterno;
		public TerminalNode SWITCH() { return getToken(SwiftGrammarParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockcaseContext blockcase() {
			return getRuleContext(BlockcaseContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TerminalNode DEFAULT() { return getToken(SwiftGrammarParser.DEFAULT, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public BlockinternoContext blockinterno() {
			return getRuleContext(BlockinternoContext.class,0);
		}
		public SwitchcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchcontrol; }
	}

	public final SwitchcontrolContext switchcontrol() throws RecognitionException {
		SwitchcontrolContext _localctx = new SwitchcontrolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchcontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((SwitchcontrolContext)_localctx).SWITCH = match(SWITCH);
			setState(365);
			((SwitchcontrolContext)_localctx).expr = expr(0);
			setState(366);
			match(LLAVEIZQ);
			setState(367);
			((SwitchcontrolContext)_localctx).blockcase = blockcase();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(368);
				((SwitchcontrolContext)_localctx).DEFAULT = match(DEFAULT);
				setState(369);
				match(DOS_PUNTOS);
				setState(370);
				((SwitchcontrolContext)_localctx).blockinterno = blockinterno();
				}
			}

			setState(373);
			match(LLAVEDER);

			    if (((SwitchcontrolContext)_localctx).DEFAULT != nil) {
			        _localctx.mySwitch = instructions.NewSentenciaSwitchDefault((((SwitchcontrolContext)_localctx).SWITCH!=null?((SwitchcontrolContext)_localctx).SWITCH.getLine():0), (((SwitchcontrolContext)_localctx).SWITCH!=null?((SwitchcontrolContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchcontrolContext)_localctx).expr.e, ((SwitchcontrolContext)_localctx).blockcase.blkcase, ((SwitchcontrolContext)_localctx).blockinterno.blkint)
			    } else {
			        _localctx.mySwitch = instructions.NewSentenciaSwitch((((SwitchcontrolContext)_localctx).SWITCH!=null?((SwitchcontrolContext)_localctx).SWITCH.getLine():0), (((SwitchcontrolContext)_localctx).SWITCH!=null?((SwitchcontrolContext)_localctx).SWITCH.getCharPositionInLine():0), ((SwitchcontrolContext)_localctx).expr.e, ((SwitchcontrolContext)_localctx).blockcase.blkcase)
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockcaseContext extends ParserRuleContext {
		public []interface{} blkcase;
		public BloquecaseContext bloquecase;
		public List<BloquecaseContext> blocas = new ArrayList<BloquecaseContext>();
		public List<BloquecaseContext> bloquecase() {
			return getRuleContexts(BloquecaseContext.class);
		}
		public BloquecaseContext bloquecase(int i) {
			return getRuleContext(BloquecaseContext.class,i);
		}
		public BlockcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockcase; }
	}

	public final BlockcaseContext blockcase() throws RecognitionException {
		BlockcaseContext _localctx = new BlockcaseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockcase);

		    _localctx.blkcase = []interface{}{}
		    var listInt []IBloquecaseContext

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(376);
				((BlockcaseContext)_localctx).bloquecase = bloquecase();
				((BlockcaseContext)_localctx).blocas.add(((BlockcaseContext)_localctx).bloquecase);
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );

			    listInt = localctx.(*BlockcaseContext).GetBlocas()
			    for _, e := range listInt {
			        _localctx.blkcase = append(_localctx.blkcase, e.GetBlocas())
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloquecaseContext extends ParserRuleContext {
		public interfaces.Instruction blocas;
		public Token CASE;
		public ExprContext expr;
		public BlockinternoContext blockinterno;
		public TerminalNode CASE() { return getToken(SwiftGrammarParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public BlockinternoContext blockinterno() {
			return getRuleContext(BlockinternoContext.class,0);
		}
		public BloquecaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquecase; }
	}

	public final BloquecaseContext bloquecase() throws RecognitionException {
		BloquecaseContext _localctx = new BloquecaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloquecase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((BloquecaseContext)_localctx).CASE = match(CASE);
			setState(384);
			((BloquecaseContext)_localctx).expr = expr(0);
			setState(385);
			match(DOS_PUNTOS);
			setState(386);
			((BloquecaseContext)_localctx).blockinterno = blockinterno();

			    _localctx.blocas=instructions.NewSentenciaSwitchCase((((BloquecaseContext)_localctx).CASE!=null?((BloquecaseContext)_localctx).CASE.getLine():0) ,(((BloquecaseContext)_localctx).CASE!=null?((BloquecaseContext)_localctx).CASE.getCharPositionInLine():0), ((BloquecaseContext)_localctx).expr.e, ((BloquecaseContext)_localctx).blockinterno.blkint)

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilecontrolContext extends ParserRuleContext {
		public interfaces.Instruction whict;
		public Token WHILE;
		public ExprContext expr;
		public BlockinternoContext blockinterno;
		public TerminalNode WHILE() { return getToken(SwiftGrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockinternoContext blockinterno() {
			return getRuleContext(BlockinternoContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public WhilecontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilecontrol; }
	}

	public final WhilecontrolContext whilecontrol() throws RecognitionException {
		WhilecontrolContext _localctx = new WhilecontrolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whilecontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((WhilecontrolContext)_localctx).WHILE = match(WHILE);
			setState(390);
			((WhilecontrolContext)_localctx).expr = expr(0);
			setState(391);
			match(LLAVEIZQ);
			setState(392);
			((WhilecontrolContext)_localctx).blockinterno = blockinterno();
			setState(393);
			match(LLAVEDER);
			 _localctx.whict = instructions.NewSentenciaWhile((((WhilecontrolContext)_localctx).WHILE!=null?((WhilecontrolContext)_localctx).WHILE.getLine():0), (((WhilecontrolContext)_localctx).WHILE!=null?((WhilecontrolContext)_localctx).WHILE.getCharPositionInLine():0), ((WhilecontrolContext)_localctx).expr.e, ((WhilecontrolContext)_localctx).blockinterno.blkint)
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\6\3\60\n\3\r\3\16\3"+
		"\61\3\3\3\3\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4"+
		"\5\4D\n\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4W\n\4\3\5\6\5Z\n\5\r\5\16\5[\3\5\3\5\3\6\3\6\5\6b\n\6\3\6"+
		"\3\6\3\6\3\6\5\6h\n\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6\3\6\5\6t\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00dc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fd\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0109\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0123\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u014d\n\20\f\20\16\20\u0150\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u016d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0176\n\22\3\22"+
		"\3\22\3\22\3\23\6\23\u017c\n\23\r\23\16\23\u017d\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\3\36\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2;<\3\2=>\4\2\66\66"+
		"88\4\2\67\6799\3\2\61\62\2\u01b2\2*\3\2\2\2\4/\3\2\2\2\6V\3\2\2\2\bY\3"+
		"\2\2\2\n\u0080\3\2\2\2\f\u0082\3\2\2\2\16\u009d\3\2\2\2\20\u00ad\3\2\2"+
		"\2\22\u00be\3\2\2\2\24\u00c0\3\2\2\2\26\u00db\3\2\2\2\30\u00eb\3\2\2\2"+
		"\32\u00fc\3\2\2\2\34\u0108\3\2\2\2\36\u0122\3\2\2\2 \u016c\3\2\2\2\"\u016e"+
		"\3\2\2\2$\u017b\3\2\2\2&\u0181\3\2\2\2(\u0187\3\2\2\2*+\5\4\3\2+,\7\2"+
		"\2\3,-\b\2\1\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\b\3\1\2\64\5\3\2\2\2\65\67\5\f"+
		"\7\2\668\7-\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\4\1\2:W\3\2\2"+
		"\2;=\5\16\b\2<>\7-\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\4\1\2@W\3\2\2"+
		"\2AC\5\20\t\2BD\7-\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\4\1\2FW\3\2\2"+
		"\2GI\5\22\n\2HJ\7-\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\4\1\2LW\3\2\2"+
		"\2MN\5 \21\2NO\b\4\1\2OW\3\2\2\2PQ\5\"\22\2QR\b\4\1\2RW\3\2\2\2ST\5(\25"+
		"\2TU\b\4\1\2UW\3\2\2\2V\65\3\2\2\2V;\3\2\2\2VA\3\2\2\2VG\3\2\2\2VM\3\2"+
		"\2\2VP\3\2\2\2VS\3\2\2\2W\7\3\2\2\2XZ\5\n\6\2YX\3\2\2\2Z[\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\5\1\2^\t\3\2\2\2_a\5\24\13\2`b\7-\2\2"+
		"a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\6\1\2d\u0081\3\2\2\2eg\5\26\f\2fh\7"+
		"-\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\6\1\2j\u0081\3\2\2\2km\5\30\r"+
		"\2ln\7-\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\6\1\2p\u0081\3\2\2\2qs\5"+
		"\32\16\2rt\7-\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\6\1\2v\u0081\3\2\2"+
		"\2wx\5 \21\2xy\b\6\1\2y\u0081\3\2\2\2z{\5\"\22\2{|\b\6\1\2|\u0081\3\2"+
		"\2\2}~\5(\25\2~\177\b\6\1\2\177\u0081\3\2\2\2\u0080_\3\2\2\2\u0080e\3"+
		"\2\2\2\u0080k\3\2\2\2\u0080q\3\2\2\2\u0080w\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\7/\2\2\u0084"+
		"\u0085\5\36\20\2\u0085\u0086\7\60\2\2\u0086\u0087\b\7\1\2\u0087\r\3\2"+
		"\2\2\u0088\u0089\7\n\2\2\u0089\u008a\7(\2\2\u008a\u008b\7,\2\2\u008b\u008c"+
		"\5\34\17\2\u008c\u008d\7+\2\2\u008d\u008e\5\36\20\2\u008e\u008f\b\b\1"+
		"\2\u008f\u009e\3\2\2\2\u0090\u0091\7\n\2\2\u0091\u0092\7(\2\2\u0092\u0093"+
		"\7+\2\2\u0093\u0094\5\36\20\2\u0094\u0095\b\b\1\2\u0095\u009e\3\2\2\2"+
		"\u0096\u0097\7\n\2\2\u0097\u0098\7(\2\2\u0098\u0099\7,\2\2\u0099\u009a"+
		"\5\34\17\2\u009a\u009b\7.\2\2\u009b\u009c\b\b\1\2\u009c\u009e\3\2\2\2"+
		"\u009d\u0088\3\2\2\2\u009d\u0090\3\2\2\2\u009d\u0096\3\2\2\2\u009e\17"+
		"\3\2\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2\7,\2\2\u00a2"+
		"\u00a3\5\34\17\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6"+
		"\b\t\1\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\7(\2\2\u00a9"+
		"\u00aa\7+\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\b\t\1\2\u00ac\u00ae\3"+
		"\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ae\21\3\2\2\2\u00af"+
		"\u00b0\7(\2\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\b\n"+
		"\1\2\u00b3\u00bf\3\2\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b6\7?\2\2\u00b6\u00b7"+
		"\5\36\20\2\u00b7\u00b8\b\n\1\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\7(\2\2"+
		"\u00ba\u00bb\7@\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\b\n\1\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00af\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf"+
		"\23\3\2\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2\7/\2\2\u00c2\u00c3\5\36\20"+
		"\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\b\13\1\2\u00c5\25\3\2\2\2\u00c6\u00c7"+
		"\7\n\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\5\34\17\2\u00ca"+
		"\u00cb\7+\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\b\f\1\2\u00cd\u00dc\3"+
		"\2\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1\7+\2\2\u00d1"+
		"\u00d2\5\36\20\2\u00d2\u00d3\b\f\1\2\u00d3\u00dc\3\2\2\2\u00d4\u00d5\7"+
		"\n\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\5\34\17\2\u00d8"+
		"\u00d9\7.\2\2\u00d9\u00da\b\f\1\2\u00da\u00dc\3\2\2\2\u00db\u00c6\3\2"+
		"\2\2\u00db\u00ce\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc\27\3\2\2\2\u00dd\u00de"+
		"\7\13\2\2\u00de\u00df\7(\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\5\34\17\2"+
		"\u00e1\u00e2\7+\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\b\r\1\2\u00e4\u00ec"+
		"\3\2\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\7(\2\2\u00e7\u00e8\7+\2\2\u00e8"+
		"\u00e9\5\36\20\2\u00e9\u00ea\b\r\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00dd\3"+
		"\2\2\2\u00eb\u00e5\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef"+
		"\7+\2\2\u00ef\u00f0\5\36\20\2\u00f0\u00f1\b\16\1\2\u00f1\u00fd\3\2\2\2"+
		"\u00f2\u00f3\7(\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6"+
		"\b\16\1\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7@\2\2\u00f9"+
		"\u00fa\5\36\20\2\u00fa\u00fb\b\16\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00ed"+
		"\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\33\3\2\2\2\u00fe"+
		"\u00ff\7\3\2\2\u00ff\u0109\b\17\1\2\u0100\u0101\7\4\2\2\u0101\u0109\b"+
		"\17\1\2\u0102\u0103\7\5\2\2\u0103\u0109\b\17\1\2\u0104\u0105\7\6\2\2\u0105"+
		"\u0109\b\17\1\2\u0106\u0107\7\7\2\2\u0107\u0109\b\17\1\2\u0108\u00fe\3"+
		"\2\2\2\u0108\u0100\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\35\3\2\2\2\u010a\u010b\b\20\1\2\u010b\u010c\7\63"+
		"\2\2\u010c\u010d\5\36\20\23\u010d\u010e\b\20\1\2\u010e\u0123\3\2\2\2\u010f"+
		"\u0110\7/\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7\60\2\2\u0112\u0113\b"+
		"\20\1\2\u0113\u0123\3\2\2\2\u0114\u0115\7&\2\2\u0115\u0123\b\20\1\2\u0116"+
		"\u0117\7\'\2\2\u0117\u0123\b\20\1\2\u0118\u0119\7\b\2\2\u0119\u0123\b"+
		"\20\1\2\u011a\u011b\7\t\2\2\u011b\u0123\b\20\1\2\u011c\u011d\7)\2\2\u011d"+
		"\u0123\b\20\1\2\u011e\u011f\7(\2\2\u011f\u0123\b\20\1\2\u0120\u0121\7"+
		"\f\2\2\u0121\u0123\b\20\1\2\u0122\u010a\3\2\2\2\u0122\u010f\3\2\2\2\u0122"+
		"\u0114\3\2\2\2\u0122\u0116\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0122\u011c\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u014e\3\2\2\2\u0124\u0125\f\22\2\2\u0125\u0126\t\2\2\2\u0126\u0127\5"+
		"\36\20\23\u0127\u0128\b\20\1\2\u0128\u014d\3\2\2\2\u0129\u012a\f\21\2"+
		"\2\u012a\u012b\t\3\2\2\u012b\u012c\5\36\20\22\u012c\u012d\b\20\1\2\u012d"+
		"\u014d\3\2\2\2\u012e\u012f\f\20\2\2\u012f\u0130\t\4\2\2\u0130\u0131\5"+
		"\36\20\21\u0131\u0132\b\20\1\2\u0132\u014d\3\2\2\2\u0133\u0134\f\17\2"+
		"\2\u0134\u0135\t\5\2\2\u0135\u0136\5\36\20\20\u0136\u0137\b\20\1\2\u0137"+
		"\u014d\3\2\2\2\u0138\u0139\f\16\2\2\u0139\u013a\t\6\2\2\u013a\u013b\5"+
		"\36\20\17\u013b\u013c\b\20\1\2\u013c\u014d\3\2\2\2\u013d\u013e\f\r\2\2"+
		"\u013e\u013f\7\65\2\2\u013f\u0140\5\36\20\16\u0140\u0141\b\20\1\2\u0141"+
		"\u014d\3\2\2\2\u0142\u0143\f\f\2\2\u0143\u0144\7\64\2\2\u0144\u0145\5"+
		"\36\20\r\u0145\u0146\b\20\1\2\u0146\u014d\3\2\2\2\u0147\u0148\f\13\2\2"+
		"\u0148\u0149\7:\2\2\u0149\u014a\5\36\20\f\u014a\u014b\b\20\1\2\u014b\u014d"+
		"\3\2\2\2\u014c\u0124\3\2\2\2\u014c\u0129\3\2\2\2\u014c\u012e\3\2\2\2\u014c"+
		"\u0133\3\2\2\2\u014c\u0138\3\2\2\2\u014c\u013d\3\2\2\2\u014c\u0142\3\2"+
		"\2\2\u014c\u0147\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\37\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\r\2"+
		"\2\u0152\u0153\5\36\20\2\u0153\u0154\7A\2\2\u0154\u0155\5\b\5\2\u0155"+
		"\u0156\7B\2\2\u0156\u0157\b\21\1\2\u0157\u016d\3\2\2\2\u0158\u0159\7\r"+
		"\2\2\u0159\u015a\5\36\20\2\u015a\u015b\7A\2\2\u015b\u015c\5\b\5\2\u015c"+
		"\u015d\7B\2\2\u015d\u015e\7\16\2\2\u015e\u015f\7A\2\2\u015f\u0160\5\b"+
		"\5\2\u0160\u0161\7B\2\2\u0161\u0162\b\21\1\2\u0162\u016d\3\2\2\2\u0163"+
		"\u0164\7\r\2\2\u0164\u0165\5\36\20\2\u0165\u0166\7A\2\2\u0166\u0167\5"+
		"\b\5\2\u0167\u0168\7B\2\2\u0168\u0169\7\16\2\2\u0169\u016a\5 \21\2\u016a"+
		"\u016b\b\21\1\2\u016b\u016d\3\2\2\2\u016c\u0151\3\2\2\2\u016c\u0158\3"+
		"\2\2\2\u016c\u0163\3\2\2\2\u016d!\3\2\2\2\u016e\u016f\7\17\2\2\u016f\u0170"+
		"\5\36\20\2\u0170\u0171\7A\2\2\u0171\u0175\5$\23\2\u0172\u0173\7\21\2\2"+
		"\u0173\u0174\7,\2\2\u0174\u0176\5\b\5\2\u0175\u0172\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7B\2\2\u0178\u0179\b\22\1\2\u0179"+
		"#\3\2\2\2\u017a\u017c\5&\24\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\b\23\1\2\u0180%\3\2\2\2\u0181\u0182\7\20\2\2\u0182\u0183\5\36\20\2\u0183"+
		"\u0184\7,\2\2\u0184\u0185\5\b\5\2\u0185\u0186\b\24\1\2\u0186\'\3\2\2\2"+
		"\u0187\u0188\7\27\2\2\u0188\u0189\5\36\20\2\u0189\u018a\7A\2\2\u018a\u018b"+
		"\5\b\5\2\u018b\u018c\7B\2\2\u018c\u018d\b\25\1\2\u018d)\3\2\2\2\33\61"+
		"\67=CIV[agms\u0080\u009d\u00ad\u00be\u00db\u00eb\u00fc\u0108\u0122\u014c"+
		"\u014e\u016c\u0175\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}