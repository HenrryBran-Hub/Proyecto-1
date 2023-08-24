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
		RULE_bloquecase = 18, RULE_whilecontrol = 19, RULE_forcontrol = 20, RULE_guardcontrol = 21, 
		RULE_continuee = 22, RULE_breakk = 23, RULE_retornos = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "blockinterno", "instructionint", "printstmt", 
			"declavarible", "declaconstante", "asignacionvariable", "printstmtint", 
			"declavaribleint", "declaconstanteint", "asignacionvariableint", "tipodato", 
			"expr", "sentenciaifelse", "switchcontrol", "blockcase", "bloquecase", 
			"whilecontrol", "forcontrol", "guardcontrol", "continuee", "breakk", 
			"retornos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", "'true'", 
			"'false'", "'var'", "'let'", "'nil'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'break'", "'continue'", "'for'", "'in'", "'...'", "'while'", 
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
			setState(50);
			((SContext)_localctx).block = block();
			setState(51);
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << PRINT) | (1L << ID_VALIDO))) != 0) );

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
		public ForcontrolContext forcontrol;
		public GuardcontrolContext guardcontrol;
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
		public ForcontrolContext forcontrol() {
			return getRuleContext(ForcontrolContext.class,0);
		}
		public GuardcontrolContext guardcontrol() {
			return getRuleContext(GuardcontrolContext.class,0);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(62);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((InstructionContext)_localctx).declavarible = declavarible();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(68);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declavarible.decvbl
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((InstructionContext)_localctx).declaconstante = declaconstante();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(74);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declaconstante.deccon
				}
				break;
			case ID_VALIDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				((InstructionContext)_localctx).asignacionvariable = asignacionvariable();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(80);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				((InstructionContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.inst = ((InstructionContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				((InstructionContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				((InstructionContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.inst = ((InstructionContext)_localctx).whilecontrol.whict
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				((InstructionContext)_localctx).forcontrol = forcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).forcontrol.forct
				}
				break;
			case GUARD:
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				((InstructionContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).guardcontrol.guct
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
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				((BlockinternoContext)_localctx).instructionint = instructionint();
				((BlockinternoContext)_localctx).insint.add(((BlockinternoContext)_localctx).instructionint);
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0) );

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
		public ForcontrolContext forcontrol;
		public GuardcontrolContext guardcontrol;
		public ContinueeContext continuee;
		public BreakkContext breakk;
		public RetornosContext retornos;
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
		public ForcontrolContext forcontrol() {
			return getRuleContext(ForcontrolContext.class,0);
		}
		public GuardcontrolContext guardcontrol() {
			return getRuleContext(GuardcontrolContext.class,0);
		}
		public ContinueeContext continuee() {
			return getRuleContext(ContinueeContext.class,0);
		}
		public BreakkContext breakk() {
			return getRuleContext(BreakkContext.class,0);
		}
		public RetornosContext retornos() {
			return getRuleContext(RetornosContext.class,0);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((InstructionintContext)_localctx).printstmtint = printstmtint();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(110);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).printstmtint.prnt
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((InstructionintContext)_localctx).declavaribleint = declavaribleint();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(116);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declavaribleint.decvbl
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				((InstructionintContext)_localctx).declaconstanteint = declaconstanteint();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(122);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declaconstanteint.deccon
				}
				break;
			case ID_VALIDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				((InstructionintContext)_localctx).asignacionvariableint = asignacionvariableint();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(128);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).asignacionvariableint.asgvbl
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				((InstructionintContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.insint = ((InstructionintContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				((InstructionintContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				((InstructionintContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).whilecontrol.whict
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				((InstructionintContext)_localctx).forcontrol = forcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).forcontrol.forct
				}
				break;
			case GUARD:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				((InstructionintContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).guardcontrol.guct
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				((InstructionintContext)_localctx).continuee = continuee();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(149);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).continuee.coct
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 11);
				{
				setState(154);
				((InstructionintContext)_localctx).breakk = breakk();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(155);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).breakk.brkct
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 12);
				{
				setState(160);
				((InstructionintContext)_localctx).retornos = retornos();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(161);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).retornos.rect 
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
			setState(168);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(169);
			match(PARIZQ);
			setState(170);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(171);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(175);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(176);
				match(DOS_PUNTOS);
				setState(177);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(178);
				match(IG);
				setState(179);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), "Global",((DeclavaribleContext)_localctx).tipodato.tipo, ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(183);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(184);
				match(IG);
				setState(185);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), "Global", ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(189);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(190);
				match(DOS_PUNTOS);
				setState(191);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(192);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(198);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(199);
				match(DOS_PUNTOS);
				setState(200);
				((DeclaconstanteContext)_localctx).tipodato = tipodato();
				setState(201);
				match(IG);
				setState(202);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), "Global", ((DeclaconstanteContext)_localctx).tipodato.tipo, ((DeclaconstanteContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(206);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(207);
				match(IG);
				setState(208);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(214);
				match(IG);
				setState(215);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(219);
				match(SUMA);
				setState(220);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(224);
				match(RESTA);
				setState(225);
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
			setState(230);
			((PrintstmtintContext)_localctx).PRINT = match(PRINT);
			setState(231);
			match(PARIZQ);
			setState(232);
			((PrintstmtintContext)_localctx).expr = expr(0);
			setState(233);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(237);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(238);
				match(DOS_PUNTOS);
				setState(239);
				((DeclavaribleintContext)_localctx).tipodato = tipodato();
				setState(240);
				match(IG);
				setState(241);
				((DeclavaribleintContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), "Local",((DeclavaribleintContext)_localctx).tipodato.tipo, ((DeclavaribleintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(245);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(246);
				match(IG);
				setState(247);
				((DeclavaribleintContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), "Local", ((DeclavaribleintContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(251);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(252);
				match(DOS_PUNTOS);
				setState(253);
				((DeclavaribleintContext)_localctx).tipodato = tipodato();
				setState(254);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((DeclaconstanteintContext)_localctx).LET = match(LET);
				setState(260);
				((DeclaconstanteintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(261);
				match(DOS_PUNTOS);
				setState(262);
				((DeclaconstanteintContext)_localctx).tipodato = tipodato();
				setState(263);
				match(IG);
				setState(264);
				((DeclaconstanteintContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getLine():0), (((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteintContext)_localctx).ID_VALIDO!=null?((DeclaconstanteintContext)_localctx).ID_VALIDO.getText():null), "Local", ((DeclaconstanteintContext)_localctx).tipodato.tipo, ((DeclaconstanteintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((DeclaconstanteintContext)_localctx).LET = match(LET);
				setState(268);
				((DeclaconstanteintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(269);
				match(IG);
				setState(270);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(276);
				match(IG);
				setState(277);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(281);
				match(SUMA);
				setState(282);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(286);
				match(RESTA);
				setState(287);
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
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(INT);
				 _localctx.tipo = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(FLOAT);
				 _localctx.tipo = environment.FLOAT 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(STRING);
				 _localctx.tipo = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(BOOL);
				 _localctx.tipo = environment.BOOLEAN 
				}
				break;
			case CHARACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
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
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode CADENA() { return getToken(SwiftGrammarParser.CADENA, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode CHARACTER() { return getToken(SwiftGrammarParser.CHARACTER, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode NULO() { return getToken(SwiftGrammarParser.NULO, 0); }
		public TerminalNode MODULO() { return getToken(SwiftGrammarParser.MODULO, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
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
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(305);
				((ExprContext)_localctx).op = match(NOT);
				setState(306);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetLine(), (((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetColumn(), ((ExprContext)_localctx).right.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
				}
				break;
			case PARIZQ:
				{
				setState(309);
				match(PARIZQ);
				setState(310);
				((ExprContext)_localctx).expr = expr(0);
				setState(311);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case SUB:
				{
				setState(314);
				match(SUB);
				setState(315);
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
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),-num3,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),-num,environment.INTEGER)
				        }
				    
				}
				break;
			case NUMBER:
				{
				setState(317);
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
				setState(319);
				((ExprContext)_localctx).CADENA = match(CADENA);

				        str := (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getLine():0), (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				{
				setState(321);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				{
				setState(323);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case CHARACTER:
				{
				setState(325);
				((ExprContext)_localctx).CHARACTER = match(CHARACTER);
				 
				        str := (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getLine():0), (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1], environment.CHARACTER) 
				    
				}
				break;
			case ID_VALIDO:
				{
				setState(327);
				((ExprContext)_localctx).ID_VALIDO = match(ID_VALIDO);

				        id := (((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getText():null)
				        _localctx.e = instructions.NewCallid((((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getLine():0),(((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getCharPositionInLine():0),id)
				    
				}
				break;
			case NULO:
				{
				setState(329);
				((ExprContext)_localctx).NULO = match(NULO);
				_localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getCharPositionInLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getText():null),environment.NULL)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(334);
						((ExprContext)_localctx).op = match(MODULO);
						setState(335);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(339);
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
						setState(340);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(344);
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
						setState(345);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(349);
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
						setState(350);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(354);
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
						setState(355);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(358);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(359);
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
						setState(360);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(364);
						((ExprContext)_localctx).op = match(AND);
						setState(365);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(368);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(369);
						((ExprContext)_localctx).op = match(OR);
						setState(370);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(379);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(380);
				match(LLAVEIZQ);
				setState(381);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(382);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIf((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(386);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(387);
				match(LLAVEIZQ);
				setState(388);
				((SentenciaifelseContext)_localctx).ifop = blockinterno();
				setState(389);
				match(LLAVEDER);
				setState(390);
				match(ELSE);
				setState(391);
				match(LLAVEIZQ);
				setState(392);
				((SentenciaifelseContext)_localctx).elseop = blockinterno();
				setState(393);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIfElse((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).ifop.blkint , ((SentenciaifelseContext)_localctx).elseop.blkint)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(397);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(398);
				match(LLAVEIZQ);
				setState(399);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(400);
				match(LLAVEDER);
				setState(401);
				match(ELSE);
				setState(402);
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
			setState(407);
			((SwitchcontrolContext)_localctx).SWITCH = match(SWITCH);
			setState(408);
			((SwitchcontrolContext)_localctx).expr = expr(0);
			setState(409);
			match(LLAVEIZQ);
			setState(410);
			((SwitchcontrolContext)_localctx).blockcase = blockcase();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(411);
				((SwitchcontrolContext)_localctx).DEFAULT = match(DEFAULT);
				setState(412);
				match(DOS_PUNTOS);
				setState(413);
				((SwitchcontrolContext)_localctx).blockinterno = blockinterno();
				}
			}

			setState(416);
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
			setState(420); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(419);
				((BlockcaseContext)_localctx).bloquecase = bloquecase();
				((BlockcaseContext)_localctx).blocas.add(((BlockcaseContext)_localctx).bloquecase);
				}
				}
				setState(422); 
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
			setState(426);
			((BloquecaseContext)_localctx).CASE = match(CASE);
			setState(427);
			((BloquecaseContext)_localctx).expr = expr(0);
			setState(428);
			match(DOS_PUNTOS);
			setState(429);
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
			setState(432);
			((WhilecontrolContext)_localctx).WHILE = match(WHILE);
			setState(433);
			((WhilecontrolContext)_localctx).expr = expr(0);
			setState(434);
			match(LLAVEIZQ);
			setState(435);
			((WhilecontrolContext)_localctx).blockinterno = blockinterno();
			setState(436);
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

	public static class ForcontrolContext extends ParserRuleContext {
		public interfaces.Instruction forct;
		public Token FOR;
		public Token ID_VALIDO;
		public ExprContext left;
		public ExprContext right;
		public BlockinternoContext blockinterno;
		public ExprContext expr;
		public TerminalNode FOR() { return getToken(SwiftGrammarParser.FOR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode IN() { return getToken(SwiftGrammarParser.IN, 0); }
		public TerminalNode RANGO() { return getToken(SwiftGrammarParser.RANGO, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockinternoContext blockinterno() {
			return getRuleContext(BlockinternoContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcontrol; }
	}

	public final ForcontrolContext forcontrol() throws RecognitionException {
		ForcontrolContext _localctx = new ForcontrolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forcontrol);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				((ForcontrolContext)_localctx).FOR = match(FOR);
				setState(440);
				((ForcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(441);
				match(IN);
				setState(442);
				((ForcontrolContext)_localctx).left = expr(0);
				setState(443);
				match(RANGO);
				setState(444);
				((ForcontrolContext)_localctx).right = expr(0);
				setState(445);
				match(LLAVEIZQ);
				setState(446);
				((ForcontrolContext)_localctx).blockinterno = blockinterno();
				setState(447);
				match(LLAVEDER);
				 _localctx.forct = instructions.NewSentenciaForRango((((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getLine():0), (((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getCharPositionInLine():0), (((ForcontrolContext)_localctx).ID_VALIDO!=null?((ForcontrolContext)_localctx).ID_VALIDO.getText():null), ((ForcontrolContext)_localctx).left.e, ((ForcontrolContext)_localctx).right.e,((ForcontrolContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				((ForcontrolContext)_localctx).FOR = match(FOR);
				setState(451);
				((ForcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(452);
				match(IN);
				setState(453);
				((ForcontrolContext)_localctx).expr = expr(0);
				setState(454);
				match(LLAVEIZQ);
				setState(455);
				((ForcontrolContext)_localctx).blockinterno = blockinterno();
				setState(456);
				match(LLAVEDER);
				 _localctx.forct = instructions.NewSentenciaForCadena((((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getLine():0), (((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getCharPositionInLine():0), (((ForcontrolContext)_localctx).ID_VALIDO!=null?((ForcontrolContext)_localctx).ID_VALIDO.getText():null), ((ForcontrolContext)_localctx).expr.e, ((ForcontrolContext)_localctx).blockinterno.blkint)
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

	public static class GuardcontrolContext extends ParserRuleContext {
		public interfaces.Instruction guct;
		public Token GUARD;
		public ExprContext expr;
		public BlockinternoContext blockinterno;
		public TerminalNode GUARD() { return getToken(SwiftGrammarParser.GUARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockinternoContext blockinterno() {
			return getRuleContext(BlockinternoContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public GuardcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardcontrol; }
	}

	public final GuardcontrolContext guardcontrol() throws RecognitionException {
		GuardcontrolContext _localctx = new GuardcontrolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_guardcontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			((GuardcontrolContext)_localctx).GUARD = match(GUARD);
			setState(462);
			((GuardcontrolContext)_localctx).expr = expr(0);
			setState(463);
			match(ELSE);
			setState(464);
			match(LLAVEIZQ);
			setState(465);
			((GuardcontrolContext)_localctx).blockinterno = blockinterno();
			setState(466);
			match(LLAVEDER);
			 
			    _localctx.guct = instructions.NewSentenciaGuard((((GuardcontrolContext)_localctx).GUARD!=null?((GuardcontrolContext)_localctx).GUARD.getLine():0), (((GuardcontrolContext)_localctx).GUARD!=null?((GuardcontrolContext)_localctx).GUARD.getCharPositionInLine():0), ((GuardcontrolContext)_localctx).expr.e, ((GuardcontrolContext)_localctx).blockinterno.blkint)

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

	public static class ContinueeContext extends ParserRuleContext {
		public interfaces.Instruction coct;
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public ContinueeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuee; }
	}

	public final ContinueeContext continuee() throws RecognitionException {
		ContinueeContext _localctx = new ContinueeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_continuee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			((ContinueeContext)_localctx).CONTINUE = match(CONTINUE);
			_localctx.coct = instructions.NewTransferenciaContinue((((ContinueeContext)_localctx).CONTINUE!=null?((ContinueeContext)_localctx).CONTINUE.getLine():0), (((ContinueeContext)_localctx).CONTINUE!=null?((ContinueeContext)_localctx).CONTINUE.getCharPositionInLine():0))
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

	public static class BreakkContext extends ParserRuleContext {
		public interfaces.Instruction brkct;
		public Token BREAK;
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public BreakkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakk; }
	}

	public final BreakkContext breakk() throws RecognitionException {
		BreakkContext _localctx = new BreakkContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_breakk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			((BreakkContext)_localctx).BREAK = match(BREAK);
			 _localctx.brkct = instructions.NewTransferenciaBreak((((BreakkContext)_localctx).BREAK!=null?((BreakkContext)_localctx).BREAK.getLine():0), (((BreakkContext)_localctx).BREAK!=null?((BreakkContext)_localctx).BREAK.getCharPositionInLine():0))
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

	public static class RetornosContext extends ParserRuleContext {
		public interfaces.Instruction rect;
		public Token RETURN;
		public ExprContext op;
		public TerminalNode RETURN() { return getToken(SwiftGrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornos; }
	}

	public final RetornosContext retornos() throws RecognitionException {
		RetornosContext _localctx = new RetornosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_retornos);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				((RetornosContext)_localctx).RETURN = match(RETURN);

				    ((RetornosContext)_localctx).rect =  instructions.NewTransferenciaReturn((((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getLine():0), (((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getCharPositionInLine():0));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				((RetornosContext)_localctx).RETURN = match(RETURN);
				setState(478);
				((RetornosContext)_localctx).op = expr(0);

				    ((RetornosContext)_localctx).rect =  instructions.NewTransferenciaReturnExp((((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getLine():0), (((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getCharPositionInLine():0), ((RetornosContext)_localctx).op.e);

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
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\4\3\4\5\4"+
		"B\n\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\3"+
		"\4\5\4T\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4g\n\4\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\3\6\3\6\5\6r\n\6\3"+
		"\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\6\5\6\u0084"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00a5\n\6\3\6\3\6\5\6\u00a9\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00c6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00d6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00e7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0104\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0114\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0125\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0131\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u014e\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0178\n\20\f\20\16\20\u017b\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0198"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01a1\n\22\3\22\3\22\3\22"+
		"\3\23\6\23\u01a7\n\23\r\23\16\23\u01a8\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u01ce\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01e4\n\32\3\32"+
		"\2\3\36\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3"+
		"\2;<\3\2=>\4\2\66\6688\4\2\67\6799\3\2\61\62\2\u0211\2\64\3\2\2\2\49\3"+
		"\2\2\2\6f\3\2\2\2\bi\3\2\2\2\n\u00a8\3\2\2\2\f\u00aa\3\2\2\2\16\u00c5"+
		"\3\2\2\2\20\u00d5\3\2\2\2\22\u00e6\3\2\2\2\24\u00e8\3\2\2\2\26\u0103\3"+
		"\2\2\2\30\u0113\3\2\2\2\32\u0124\3\2\2\2\34\u0130\3\2\2\2\36\u014d\3\2"+
		"\2\2 \u0197\3\2\2\2\"\u0199\3\2\2\2$\u01a6\3\2\2\2&\u01ac\3\2\2\2(\u01b2"+
		"\3\2\2\2*\u01cd\3\2\2\2,\u01cf\3\2\2\2.\u01d7\3\2\2\2\60\u01da\3\2\2\2"+
		"\62\u01e3\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3\66\67\b\2\1\2\67\3\3\2\2"+
		"\28:\5\6\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\3\1"+
		"\2>\5\3\2\2\2?A\5\f\7\2@B\7-\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\4\1"+
		"\2Dg\3\2\2\2EG\5\16\b\2FH\7-\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\4\1"+
		"\2Jg\3\2\2\2KM\5\20\t\2LN\7-\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\4\1"+
		"\2Pg\3\2\2\2QS\5\22\n\2RT\7-\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\4\1"+
		"\2Vg\3\2\2\2WX\5 \21\2XY\b\4\1\2Yg\3\2\2\2Z[\5\"\22\2[\\\b\4\1\2\\g\3"+
		"\2\2\2]^\5(\25\2^_\b\4\1\2_g\3\2\2\2`a\5*\26\2ab\b\4\1\2bg\3\2\2\2cd\5"+
		",\27\2de\b\4\1\2eg\3\2\2\2f?\3\2\2\2fE\3\2\2\2fK\3\2\2\2fQ\3\2\2\2fW\3"+
		"\2\2\2fZ\3\2\2\2f]\3\2\2\2f`\3\2\2\2fc\3\2\2\2g\7\3\2\2\2hj\5\n\6\2ih"+
		"\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\5\1\2n\t\3\2\2\2"+
		"oq\5\24\13\2pr\7-\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\6\1\2t\u00a9\3"+
		"\2\2\2uw\5\26\f\2vx\7-\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\6\1\2z\u00a9"+
		"\3\2\2\2{}\5\30\r\2|~\7-\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\b\6\1\2\u0080\u00a9\3\2\2\2\u0081\u0083\5\32\16\2\u0082\u0084\7-\2\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\6\1\2\u0086\u00a9\3\2\2\2\u0087\u0088\5 \21\2\u0088\u0089\b\6\1\2\u0089"+
		"\u00a9\3\2\2\2\u008a\u008b\5\"\22\2\u008b\u008c\b\6\1\2\u008c\u00a9\3"+
		"\2\2\2\u008d\u008e\5(\25\2\u008e\u008f\b\6\1\2\u008f\u00a9\3\2\2\2\u0090"+
		"\u0091\5*\26\2\u0091\u0092\b\6\1\2\u0092\u00a9\3\2\2\2\u0093\u0094\5,"+
		"\27\2\u0094\u0095\b\6\1\2\u0095\u00a9\3\2\2\2\u0096\u0098\5.\30\2\u0097"+
		"\u0099\7-\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\b\6\1\2\u009b\u00a9\3\2\2\2\u009c\u009e\5\60\31\2\u009d"+
		"\u009f\7-\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\b\6\1\2\u00a1\u00a9\3\2\2\2\u00a2\u00a4\5\62\32\2\u00a3"+
		"\u00a5\7-\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\b\6\1\2\u00a7\u00a9\3\2\2\2\u00a8o\3\2\2\2\u00a8u\3\2"+
		"\2\2\u00a8{\3\2\2\2\u00a8\u0081\3\2\2\2\u00a8\u0087\3\2\2\2\u00a8\u008a"+
		"\3\2\2\2\u00a8\u008d\3\2\2\2\u00a8\u0090\3\2\2\2\u00a8\u0093\3\2\2\2\u00a8"+
		"\u0096\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a9\13\3\2\2"+
		"\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\5\36\20\2\u00ad"+
		"\u00ae\7\60\2\2\u00ae\u00af\b\7\1\2\u00af\r\3\2\2\2\u00b0\u00b1\7\n\2"+
		"\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b5"+
		"\7+\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\b\b\1\2\u00b7\u00c6\3\2\2\2"+
		"\u00b8\u00b9\7\n\2\2\u00b9\u00ba\7(\2\2\u00ba\u00bb\7+\2\2\u00bb\u00bc"+
		"\5\36\20\2\u00bc\u00bd\b\b\1\2\u00bd\u00c6\3\2\2\2\u00be\u00bf\7\n\2\2"+
		"\u00bf\u00c0\7(\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c3"+
		"\7.\2\2\u00c3\u00c4\b\b\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00b0\3\2\2\2\u00c5"+
		"\u00b8\3\2\2\2\u00c5\u00be\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00c8\7\13\2"+
		"\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\5\34\17\2\u00cb\u00cc"+
		"\7+\2\2\u00cc\u00cd\5\36\20\2\u00cd\u00ce\b\t\1\2\u00ce\u00d6\3\2\2\2"+
		"\u00cf\u00d0\7\13\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7+\2\2\u00d2\u00d3"+
		"\5\36\20\2\u00d3\u00d4\b\t\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00c7\3\2\2\2"+
		"\u00d5\u00cf\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8\u00d9\7"+
		"+\2\2\u00d9\u00da\5\36\20\2\u00da\u00db\b\n\1\2\u00db\u00e7\3\2\2\2\u00dc"+
		"\u00dd\7(\2\2\u00dd\u00de\7?\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\b\n"+
		"\1\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4"+
		"\5\36\20\2\u00e4\u00e5\b\n\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00d7\3\2\2\2"+
		"\u00e6\u00dc\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\23\3\2\2\2\u00e8\u00e9"+
		"\7\33\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\5\36\20\2\u00eb\u00ec\7\60\2"+
		"\2\u00ec\u00ed\b\13\1\2\u00ed\25\3\2\2\2\u00ee\u00ef\7\n\2\2\u00ef\u00f0"+
		"\7(\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7+\2\2\u00f3"+
		"\u00f4\5\36\20\2\u00f4\u00f5\b\f\1\2\u00f5\u0104\3\2\2\2\u00f6\u00f7\7"+
		"\n\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7+\2\2\u00f9\u00fa\5\36\20\2\u00fa"+
		"\u00fb\b\f\1\2\u00fb\u0104\3\2\2\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\7("+
		"\2\2\u00fe\u00ff\7,\2\2\u00ff\u0100\5\34\17\2\u0100\u0101\7.\2\2\u0101"+
		"\u0102\b\f\1\2\u0102\u0104\3\2\2\2\u0103\u00ee\3\2\2\2\u0103\u00f6\3\2"+
		"\2\2\u0103\u00fc\3\2\2\2\u0104\27\3\2\2\2\u0105\u0106\7\13\2\2\u0106\u0107"+
		"\7(\2\2\u0107\u0108\7,\2\2\u0108\u0109\5\34\17\2\u0109\u010a\7+\2\2\u010a"+
		"\u010b\5\36\20\2\u010b\u010c\b\r\1\2\u010c\u0114\3\2\2\2\u010d\u010e\7"+
		"\13\2\2\u010e\u010f\7(\2\2\u010f\u0110\7+\2\2\u0110\u0111\5\36\20\2\u0111"+
		"\u0112\b\r\1\2\u0112\u0114\3\2\2\2\u0113\u0105\3\2\2\2\u0113\u010d\3\2"+
		"\2\2\u0114\31\3\2\2\2\u0115\u0116\7(\2\2\u0116\u0117\7+\2\2\u0117\u0118"+
		"\5\36\20\2\u0118\u0119\b\16\1\2\u0119\u0125\3\2\2\2\u011a\u011b\7(\2\2"+
		"\u011b\u011c\7?\2\2\u011c\u011d\5\36\20\2\u011d\u011e\b\16\1\2\u011e\u0125"+
		"\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0121\7@\2\2\u0121\u0122\5\36\20\2\u0122"+
		"\u0123\b\16\1\2\u0123\u0125\3\2\2\2\u0124\u0115\3\2\2\2\u0124\u011a\3"+
		"\2\2\2\u0124\u011f\3\2\2\2\u0125\33\3\2\2\2\u0126\u0127\7\3\2\2\u0127"+
		"\u0131\b\17\1\2\u0128\u0129\7\4\2\2\u0129\u0131\b\17\1\2\u012a\u012b\7"+
		"\5\2\2\u012b\u0131\b\17\1\2\u012c\u012d\7\6\2\2\u012d\u0131\b\17\1\2\u012e"+
		"\u012f\7\7\2\2\u012f\u0131\b\17\1\2\u0130\u0126\3\2\2\2\u0130\u0128\3"+
		"\2\2\2\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\35\3\2\2\2\u0132\u0133\b\20\1\2\u0133\u0134\7\63\2\2\u0134\u0135\5\36"+
		"\20\24\u0135\u0136\b\20\1\2\u0136\u014e\3\2\2\2\u0137\u0138\7/\2\2\u0138"+
		"\u0139\5\36\20\2\u0139\u013a\7\60\2\2\u013a\u013b\b\20\1\2\u013b\u014e"+
		"\3\2\2\2\u013c\u013d\7>\2\2\u013d\u013e\7&\2\2\u013e\u014e\b\20\1\2\u013f"+
		"\u0140\7&\2\2\u0140\u014e\b\20\1\2\u0141\u0142\7\'\2\2\u0142\u014e\b\20"+
		"\1\2\u0143\u0144\7\b\2\2\u0144\u014e\b\20\1\2\u0145\u0146\7\t\2\2\u0146"+
		"\u014e\b\20\1\2\u0147\u0148\7)\2\2\u0148\u014e\b\20\1\2\u0149\u014a\7"+
		"(\2\2\u014a\u014e\b\20\1\2\u014b\u014c\7\f\2\2\u014c\u014e\b\20\1\2\u014d"+
		"\u0132\3\2\2\2\u014d\u0137\3\2\2\2\u014d\u013c\3\2\2\2\u014d\u013f\3\2"+
		"\2\2\u014d\u0141\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0145\3\2\2\2\u014d"+
		"\u0147\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0179\3\2"+
		"\2\2\u014f\u0150\f\23\2\2\u0150\u0151\7:\2\2\u0151\u0152\5\36\20\24\u0152"+
		"\u0153\b\20\1\2\u0153\u0178\3\2\2\2\u0154\u0155\f\22\2\2\u0155\u0156\t"+
		"\2\2\2\u0156\u0157\5\36\20\23\u0157\u0158\b\20\1\2\u0158\u0178\3\2\2\2"+
		"\u0159\u015a\f\21\2\2\u015a\u015b\t\3\2\2\u015b\u015c\5\36\20\22\u015c"+
		"\u015d\b\20\1\2\u015d\u0178\3\2\2\2\u015e\u015f\f\20\2\2\u015f\u0160\t"+
		"\4\2\2\u0160\u0161\5\36\20\21\u0161\u0162\b\20\1\2\u0162\u0178\3\2\2\2"+
		"\u0163\u0164\f\17\2\2\u0164\u0165\t\5\2\2\u0165\u0166\5\36\20\20\u0166"+
		"\u0167\b\20\1\2\u0167\u0178\3\2\2\2\u0168\u0169\f\16\2\2\u0169\u016a\t"+
		"\6\2\2\u016a\u016b\5\36\20\17\u016b\u016c\b\20\1\2\u016c\u0178\3\2\2\2"+
		"\u016d\u016e\f\r\2\2\u016e\u016f\7\65\2\2\u016f\u0170\5\36\20\16\u0170"+
		"\u0171\b\20\1\2\u0171\u0178\3\2\2\2\u0172\u0173\f\f\2\2\u0173\u0174\7"+
		"\64\2\2\u0174\u0175\5\36\20\r\u0175\u0176\b\20\1\2\u0176\u0178\3\2\2\2"+
		"\u0177\u014f\3\2\2\2\u0177\u0154\3\2\2\2\u0177\u0159\3\2\2\2\u0177\u015e"+
		"\3\2\2\2\u0177\u0163\3\2\2\2\u0177\u0168\3\2\2\2\u0177\u016d\3\2\2\2\u0177"+
		"\u0172\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\37\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\r\2\2\u017d\u017e"+
		"\5\36\20\2\u017e\u017f\7A\2\2\u017f\u0180\5\b\5\2\u0180\u0181\7B\2\2\u0181"+
		"\u0182\b\21\1\2\u0182\u0198\3\2\2\2\u0183\u0184\7\r\2\2\u0184\u0185\5"+
		"\36\20\2\u0185\u0186\7A\2\2\u0186\u0187\5\b\5\2\u0187\u0188\7B\2\2\u0188"+
		"\u0189\7\16\2\2\u0189\u018a\7A\2\2\u018a\u018b\5\b\5\2\u018b\u018c\7B"+
		"\2\2\u018c\u018d\b\21\1\2\u018d\u0198\3\2\2\2\u018e\u018f\7\r\2\2\u018f"+
		"\u0190\5\36\20\2\u0190\u0191\7A\2\2\u0191\u0192\5\b\5\2\u0192\u0193\7"+
		"B\2\2\u0193\u0194\7\16\2\2\u0194\u0195\5 \21\2\u0195\u0196\b\21\1\2\u0196"+
		"\u0198\3\2\2\2\u0197\u017c\3\2\2\2\u0197\u0183\3\2\2\2\u0197\u018e\3\2"+
		"\2\2\u0198!\3\2\2\2\u0199\u019a\7\17\2\2\u019a\u019b\5\36\20\2\u019b\u019c"+
		"\7A\2\2\u019c\u01a0\5$\23\2\u019d\u019e\7\21\2\2\u019e\u019f\7,\2\2\u019f"+
		"\u01a1\5\b\5\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a3\7B\2\2\u01a3\u01a4\b\22\1\2\u01a4#\3\2\2\2\u01a5\u01a7"+
		"\5&\24\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b\23\1\2\u01ab%\3\2\2\2"+
		"\u01ac\u01ad\7\20\2\2\u01ad\u01ae\5\36\20\2\u01ae\u01af\7,\2\2\u01af\u01b0"+
		"\5\b\5\2\u01b0\u01b1\b\24\1\2\u01b1\'\3\2\2\2\u01b2\u01b3\7\27\2\2\u01b3"+
		"\u01b4\5\36\20\2\u01b4\u01b5\7A\2\2\u01b5\u01b6\5\b\5\2\u01b6\u01b7\7"+
		"B\2\2\u01b7\u01b8\b\25\1\2\u01b8)\3\2\2\2\u01b9\u01ba\7\24\2\2\u01ba\u01bb"+
		"\7(\2\2\u01bb\u01bc\7\25\2\2\u01bc\u01bd\5\36\20\2\u01bd\u01be\7\26\2"+
		"\2\u01be\u01bf\5\36\20\2\u01bf\u01c0\7A\2\2\u01c0\u01c1\5\b\5\2\u01c1"+
		"\u01c2\7B\2\2\u01c2\u01c3\b\26\1\2\u01c3\u01ce\3\2\2\2\u01c4\u01c5\7\24"+
		"\2\2\u01c5\u01c6\7(\2\2\u01c6\u01c7\7\25\2\2\u01c7\u01c8\5\36\20\2\u01c8"+
		"\u01c9\7A\2\2\u01c9\u01ca\5\b\5\2\u01ca\u01cb\7B\2\2\u01cb\u01cc\b\26"+
		"\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01b9\3\2\2\2\u01cd\u01c4\3\2\2\2\u01ce"+
		"+\3\2\2\2\u01cf\u01d0\7\30\2\2\u01d0\u01d1\5\36\20\2\u01d1\u01d2\7\16"+
		"\2\2\u01d2\u01d3\7A\2\2\u01d3\u01d4\5\b\5\2\u01d4\u01d5\7B\2\2\u01d5\u01d6"+
		"\b\27\1\2\u01d6-\3\2\2\2\u01d7\u01d8\7\23\2\2\u01d8\u01d9\b\30\1\2\u01d9"+
		"/\3\2\2\2\u01da\u01db\7\22\2\2\u01db\u01dc\b\31\1\2\u01dc\61\3\2\2\2\u01dd"+
		"\u01de\7\31\2\2\u01de\u01e4\b\32\1\2\u01df\u01e0\7\31\2\2\u01e0\u01e1"+
		"\5\36\20\2\u01e1\u01e2\b\32\1\2\u01e2\u01e4\3\2\2\2\u01e3\u01dd\3\2\2"+
		"\2\u01e3\u01df\3\2\2\2\u01e4\63\3\2\2\2 ;AGMSfkqw}\u0083\u0098\u009e\u00a4"+
		"\u00a8\u00c5\u00d5\u00e6\u0103\u0113\u0124\u0130\u014d\u0177\u0179\u0197"+
		"\u01a0\u01a8\u01cd\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}