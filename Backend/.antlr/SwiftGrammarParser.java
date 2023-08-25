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
		RULE_continuee = 22, RULE_breakk = 23, RULE_retornos = 24, RULE_vectorcontrol = 25, 
		RULE_blockparams = 26, RULE_bloqueparams = 27, RULE_vectoragregar = 28, 
		RULE_vectorremover = 29, RULE_vectorvacio = 30, RULE_vectorcount = 31, 
		RULE_vectoraccess = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "blockinterno", "instructionint", "printstmt", 
			"declavarible", "declaconstante", "asignacionvariable", "printstmtint", 
			"declavaribleint", "declaconstanteint", "asignacionvariableint", "tipodato", 
			"expr", "sentenciaifelse", "switchcontrol", "blockcase", "bloquecase", 
			"whilecontrol", "forcontrol", "guardcontrol", "continuee", "breakk", 
			"retornos", "vectorcontrol", "blockparams", "bloqueparams", "vectoragregar", 
			"vectorremover", "vectorvacio", "vectorcount", "vectoraccess"
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
			setState(66);
			((SContext)_localctx).block = block();
			setState(67);
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(73); 
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
		public VectorcontrolContext vectorcontrol;
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
		public VectorcontrolContext vectorcontrol() {
			return getRuleContext(VectorcontrolContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(78);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				((InstructionContext)_localctx).declavarible = declavarible();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(84);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declavarible.decvbl
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((InstructionContext)_localctx).declaconstante = declaconstante();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(90);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declaconstante.deccon
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				((InstructionContext)_localctx).asignacionvariable = asignacionvariable();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(96);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				((InstructionContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.inst = ((InstructionContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				((InstructionContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				((InstructionContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.inst = ((InstructionContext)_localctx).whilecontrol.whict
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				((InstructionContext)_localctx).forcontrol = forcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).forcontrol.forct
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				((InstructionContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).guardcontrol.guct
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				((InstructionContext)_localctx).vectorcontrol = vectorcontrol();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(117);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).vectorcontrol.vect 
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
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				((BlockinternoContext)_localctx).instructionint = instructionint();
				((BlockinternoContext)_localctx).insint.add(((BlockinternoContext)_localctx).instructionint);
				}
				}
				setState(127); 
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
		public VectorcontrolContext vectorcontrol;
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
		public VectorcontrolContext vectorcontrol() {
			return getRuleContext(VectorcontrolContext.class,0);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((InstructionintContext)_localctx).printstmtint = printstmtint();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(132);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).printstmtint.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((InstructionintContext)_localctx).declavaribleint = declavaribleint();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(138);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declavaribleint.decvbl
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((InstructionintContext)_localctx).declaconstanteint = declaconstanteint();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(144);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declaconstanteint.deccon
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				((InstructionintContext)_localctx).asignacionvariableint = asignacionvariableint();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(150);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).asignacionvariableint.asgvbl
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((InstructionintContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.insint = ((InstructionintContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				((InstructionintContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				((InstructionintContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).whilecontrol.whict
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				((InstructionintContext)_localctx).forcontrol = forcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).forcontrol.forct
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				((InstructionintContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).guardcontrol.guct
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				((InstructionintContext)_localctx).continuee = continuee();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(171);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).continuee.coct
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(176);
				((InstructionintContext)_localctx).breakk = breakk();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(177);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).breakk.brkct
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(182);
				((InstructionintContext)_localctx).retornos = retornos();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(183);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).retornos.rect 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(188);
				((InstructionintContext)_localctx).vectorcontrol = vectorcontrol();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(189);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectorcontrol.vect 
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
			setState(196);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(197);
			match(PARIZQ);
			setState(198);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(199);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(203);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(204);
				match(DOS_PUNTOS);
				setState(205);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(206);
				match(IG);
				setState(207);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).tipodato.tipo, ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(211);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(212);
				match(IG);
				setState(213);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(217);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(218);
				match(DOS_PUNTOS);
				setState(219);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(220);
				match(CIERRE_INTE);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinExp((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).tipodato.tipo)
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(226);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(227);
				match(DOS_PUNTOS);
				setState(228);
				((DeclaconstanteContext)_localctx).tipodato = tipodato();
				setState(229);
				match(IG);
				setState(230);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), ((DeclaconstanteContext)_localctx).tipodato.tipo, ((DeclaconstanteContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(234);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(235);
				match(IG);
				setState(236);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaracionSinTipo((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), ((DeclaconstanteContext)_localctx).expr.e)
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(242);
				match(IG);
				setState(243);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(247);
				match(SUMA);
				setState(248);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(252);
				match(RESTA);
				setState(253);
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
			setState(258);
			((PrintstmtintContext)_localctx).PRINT = match(PRINT);
			setState(259);
			match(PARIZQ);
			setState(260);
			((PrintstmtintContext)_localctx).expr = expr(0);
			setState(261);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(265);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(266);
				match(DOS_PUNTOS);
				setState(267);
				((DeclavaribleintContext)_localctx).tipodato = tipodato();
				setState(268);
				match(IG);
				setState(269);
				((DeclavaribleintContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleintContext)_localctx).tipodato.tipo, ((DeclavaribleintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(273);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(274);
				match(IG);
				setState(275);
				((DeclavaribleintContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleintContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				((DeclavaribleintContext)_localctx).VAR = match(VAR);
				setState(279);
				((DeclavaribleintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(280);
				match(DOS_PUNTOS);
				setState(281);
				((DeclavaribleintContext)_localctx).tipodato = tipodato();
				setState(282);
				match(CIERRE_INTE);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinExp((((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getLine():0), (((DeclavaribleintContext)_localctx).VAR!=null?((DeclavaribleintContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleintContext)_localctx).ID_VALIDO!=null?((DeclavaribleintContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleintContext)_localctx).tipodato.tipo)
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((DeclaconstanteintContext)_localctx).LET = match(LET);
				setState(288);
				((DeclaconstanteintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(289);
				match(DOS_PUNTOS);
				setState(290);
				((DeclaconstanteintContext)_localctx).tipodato = tipodato();
				setState(291);
				match(IG);
				setState(292);
				((DeclaconstanteintContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getLine():0), (((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteintContext)_localctx).ID_VALIDO!=null?((DeclaconstanteintContext)_localctx).ID_VALIDO.getText():null), ((DeclaconstanteintContext)_localctx).tipodato.tipo, ((DeclaconstanteintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((DeclaconstanteintContext)_localctx).LET = match(LET);
				setState(296);
				((DeclaconstanteintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(297);
				match(IG);
				setState(298);
				((DeclaconstanteintContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaracionSinTipo((((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getLine():0), (((DeclaconstanteintContext)_localctx).LET!=null?((DeclaconstanteintContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteintContext)_localctx).ID_VALIDO!=null?((DeclaconstanteintContext)_localctx).ID_VALIDO.getText():null), ((DeclaconstanteintContext)_localctx).expr.e)
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
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(304);
				match(IG);
				setState(305);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(309);
				match(SUMA);
				setState(310);
				((AsignacionvariableintContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableintContext)_localctx).ID_VALIDO!=null?((AsignacionvariableintContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableintContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				((AsignacionvariableintContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(314);
				match(RESTA);
				setState(315);
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
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(INT);
				 _localctx.tipo = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(FLOAT);
				 _localctx.tipo = environment.FLOAT 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(STRING);
				 _localctx.tipo = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(BOOL);
				 _localctx.tipo = environment.BOOLEAN 
				}
				break;
			case CHARACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(333);
				((ExprContext)_localctx).op = match(NOT);
				setState(334);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetLine(), (((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetColumn(), ((ExprContext)_localctx).right.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
				}
				break;
			case PARIZQ:
				{
				setState(337);
				match(PARIZQ);
				setState(338);
				((ExprContext)_localctx).expr = expr(0);
				setState(339);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case SUB:
				{
				setState(342);
				match(SUB);
				setState(343);
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
				setState(345);
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
				setState(347);
				((ExprContext)_localctx).CADENA = match(CADENA);

				        str := (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getLine():0), (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case TRU:
				{
				setState(349);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case FAL:
				{
				setState(351);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case CHARACTER:
				{
				setState(353);
				((ExprContext)_localctx).CHARACTER = match(CHARACTER);
				 
				        str := (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getLine():0), (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1], environment.CHARACTER) 
				    
				}
				break;
			case ID_VALIDO:
				{
				setState(355);
				((ExprContext)_localctx).ID_VALIDO = match(ID_VALIDO);

				        id := (((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getText():null)
				        _localctx.e = instructions.NewCallid((((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getLine():0),(((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getCharPositionInLine():0),id)
				    
				}
				break;
			case NULO:
				{
				setState(357);
				((ExprContext)_localctx).NULO = match(NULO);
				_localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getCharPositionInLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getText():null),environment.NULL)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(401);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(361);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(362);
						((ExprContext)_localctx).op = match(MODULO);
						setState(363);
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
						setState(366);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(367);
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
						setState(368);
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
						setState(371);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(372);
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
						setState(373);
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
						setState(376);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(377);
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
						setState(378);
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
						setState(381);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(382);
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
						setState(383);
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
						setState(386);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(387);
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
						setState(388);
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
						setState(391);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(392);
						((ExprContext)_localctx).op = match(AND);
						setState(393);
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
						setState(396);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(397);
						((ExprContext)_localctx).op = match(OR);
						setState(398);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(11);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(407);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(408);
				match(LLAVEIZQ);
				setState(409);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(410);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIf((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(414);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(415);
				match(LLAVEIZQ);
				setState(416);
				((SentenciaifelseContext)_localctx).ifop = blockinterno();
				setState(417);
				match(LLAVEDER);
				setState(418);
				match(ELSE);
				setState(419);
				match(LLAVEIZQ);
				setState(420);
				((SentenciaifelseContext)_localctx).elseop = blockinterno();
				setState(421);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIfElse((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).ifop.blkint , ((SentenciaifelseContext)_localctx).elseop.blkint)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(425);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(426);
				match(LLAVEIZQ);
				setState(427);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(428);
				match(LLAVEDER);
				setState(429);
				match(ELSE);
				setState(430);
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
			setState(435);
			((SwitchcontrolContext)_localctx).SWITCH = match(SWITCH);
			setState(436);
			((SwitchcontrolContext)_localctx).expr = expr(0);
			setState(437);
			match(LLAVEIZQ);
			setState(438);
			((SwitchcontrolContext)_localctx).blockcase = blockcase();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(439);
				((SwitchcontrolContext)_localctx).DEFAULT = match(DEFAULT);
				setState(440);
				match(DOS_PUNTOS);
				setState(441);
				((SwitchcontrolContext)_localctx).blockinterno = blockinterno();
				}
			}

			setState(444);
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
			setState(448); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(447);
				((BlockcaseContext)_localctx).bloquecase = bloquecase();
				((BlockcaseContext)_localctx).blocas.add(((BlockcaseContext)_localctx).bloquecase);
				}
				}
				setState(450); 
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
			setState(454);
			((BloquecaseContext)_localctx).CASE = match(CASE);
			setState(455);
			((BloquecaseContext)_localctx).expr = expr(0);
			setState(456);
			match(DOS_PUNTOS);
			setState(457);
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
			setState(460);
			((WhilecontrolContext)_localctx).WHILE = match(WHILE);
			setState(461);
			((WhilecontrolContext)_localctx).expr = expr(0);
			setState(462);
			match(LLAVEIZQ);
			setState(463);
			((WhilecontrolContext)_localctx).blockinterno = blockinterno();
			setState(464);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				((ForcontrolContext)_localctx).FOR = match(FOR);
				setState(468);
				((ForcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(469);
				match(IN);
				setState(470);
				((ForcontrolContext)_localctx).left = expr(0);
				setState(471);
				match(RANGO);
				setState(472);
				((ForcontrolContext)_localctx).right = expr(0);
				setState(473);
				match(LLAVEIZQ);
				setState(474);
				((ForcontrolContext)_localctx).blockinterno = blockinterno();
				setState(475);
				match(LLAVEDER);
				 _localctx.forct = instructions.NewSentenciaForRango((((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getLine():0), (((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getCharPositionInLine():0), (((ForcontrolContext)_localctx).ID_VALIDO!=null?((ForcontrolContext)_localctx).ID_VALIDO.getText():null), ((ForcontrolContext)_localctx).left.e, ((ForcontrolContext)_localctx).right.e,((ForcontrolContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				((ForcontrolContext)_localctx).FOR = match(FOR);
				setState(479);
				((ForcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(480);
				match(IN);
				setState(481);
				((ForcontrolContext)_localctx).expr = expr(0);
				setState(482);
				match(LLAVEIZQ);
				setState(483);
				((ForcontrolContext)_localctx).blockinterno = blockinterno();
				setState(484);
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
			setState(489);
			((GuardcontrolContext)_localctx).GUARD = match(GUARD);
			setState(490);
			((GuardcontrolContext)_localctx).expr = expr(0);
			setState(491);
			match(ELSE);
			setState(492);
			match(LLAVEIZQ);
			setState(493);
			((GuardcontrolContext)_localctx).blockinterno = blockinterno();
			setState(494);
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
			setState(497);
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
			setState(500);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				((RetornosContext)_localctx).RETURN = match(RETURN);

				    ((RetornosContext)_localctx).rect =  instructions.NewTransferenciaReturn((((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getLine():0), (((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getCharPositionInLine():0));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				((RetornosContext)_localctx).RETURN = match(RETURN);
				setState(506);
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

	public static class VectorcontrolContext extends ParserRuleContext {
		public interfaces.Instruction vect;
		public Token VAR;
		public Token ID_VALIDO;
		public TipodatoContext tipodato;
		public ExprContext expr;
		public BlockparamsContext blockparams;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> CORCHIZQ() { return getTokens(SwiftGrammarParser.CORCHIZQ); }
		public TerminalNode CORCHIZQ(int i) {
			return getToken(SwiftGrammarParser.CORCHIZQ, i);
		}
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public List<TerminalNode> CORCHDER() { return getTokens(SwiftGrammarParser.CORCHDER); }
		public TerminalNode CORCHDER(int i) {
			return getToken(SwiftGrammarParser.CORCHDER, i);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockparamsContext blockparams() {
			return getRuleContext(BlockparamsContext.class,0);
		}
		public VectorcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorcontrol; }
	}

	public final VectorcontrolContext vectorcontrol() throws RecognitionException {
		VectorcontrolContext _localctx = new VectorcontrolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_vectorcontrol);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((VectorcontrolContext)_localctx).VAR = match(VAR);
				setState(512);
				((VectorcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(513);
				match(DOS_PUNTOS);
				setState(514);
				match(CORCHIZQ);
				setState(515);
				((VectorcontrolContext)_localctx).tipodato = tipodato();
				setState(516);
				match(CORCHDER);
				setState(517);
				match(IG);
				setState(518);
				match(CORCHIZQ);
				setState(519);
				((VectorcontrolContext)_localctx).expr = expr(0);
				setState(520);
				((VectorcontrolContext)_localctx).blockparams = blockparams();
				setState(521);
				match(CORCHDER);
				 _localctx.vect = instructions.NewArregloDeclaracionLista((((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getLine():0) ,(((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((VectorcontrolContext)_localctx).ID_VALIDO!=null?((VectorcontrolContext)_localctx).ID_VALIDO.getText():null) , ((VectorcontrolContext)_localctx).tipodato.tipo,((VectorcontrolContext)_localctx).expr.e, ((VectorcontrolContext)_localctx).blockparams.blkpar)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(VAR);
				setState(525);
				match(ID_VALIDO);
				setState(526);
				match(DOS_PUNTOS);
				setState(527);
				match(CORCHIZQ);
				setState(528);
				tipodato();
				setState(529);
				match(CORCHDER);
				setState(530);
				match(IG);
				setState(531);
				match(CORCHIZQ);
				setState(532);
				match(CORCHDER);

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				match(VAR);
				setState(536);
				match(ID_VALIDO);
				setState(537);
				match(DOS_PUNTOS);
				setState(538);
				match(CORCHIZQ);
				setState(539);
				tipodato();
				setState(540);
				match(CORCHDER);
				setState(541);
				match(ID_VALIDO);

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

	public static class BlockparamsContext extends ParserRuleContext {
		public []interface{} blkpar;
		public BloqueparamsContext bloqueparams;
		public List<BloqueparamsContext> blopas = new ArrayList<BloqueparamsContext>();
		public List<BloqueparamsContext> bloqueparams() {
			return getRuleContexts(BloqueparamsContext.class);
		}
		public BloqueparamsContext bloqueparams(int i) {
			return getRuleContext(BloqueparamsContext.class,i);
		}
		public BlockparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockparams; }
	}

	public final BlockparamsContext blockparams() throws RecognitionException {
		BlockparamsContext _localctx = new BlockparamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_blockparams);

		    _localctx.blkpar = []interface{}{}
		    var listInt []IBloqueparamsContext

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(546);
				((BlockparamsContext)_localctx).bloqueparams = bloqueparams();
				((BlockparamsContext)_localctx).blopas.add(((BlockparamsContext)_localctx).bloqueparams);
				}
				}
				setState(549); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );

			    listInt = localctx.(*BlockparamsContext).GetBlopas()
			    for _, e := range listInt {
			        _localctx.blkpar = append(_localctx.blkpar, e.GetBlopas())
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

	public static class BloqueparamsContext extends ParserRuleContext {
		public interfaces.Expression blopas;
		public Token COMA;
		public ExprContext expr;
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BloqueparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueparams; }
	}

	public final BloqueparamsContext bloqueparams() throws RecognitionException {
		BloqueparamsContext _localctx = new BloqueparamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bloqueparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			((BloqueparamsContext)_localctx).COMA = match(COMA);
			setState(554);
			((BloqueparamsContext)_localctx).expr = expr(0);

			    _localctx.blopas = instructions.NewArregloParametros((((BloqueparamsContext)_localctx).COMA!=null?((BloqueparamsContext)_localctx).COMA.getLine():0) ,(((BloqueparamsContext)_localctx).COMA!=null?((BloqueparamsContext)_localctx).COMA.getCharPositionInLine():0), ((BloqueparamsContext)_localctx).expr.e)

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

	public static class VectoragregarContext extends ParserRuleContext {
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode APPEND() { return getToken(SwiftGrammarParser.APPEND, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public List<TerminalNode> CORCHIZQ() { return getTokens(SwiftGrammarParser.CORCHIZQ); }
		public TerminalNode CORCHIZQ(int i) {
			return getToken(SwiftGrammarParser.CORCHIZQ, i);
		}
		public List<TerminalNode> CORCHDER() { return getTokens(SwiftGrammarParser.CORCHDER); }
		public TerminalNode CORCHDER(int i) {
			return getToken(SwiftGrammarParser.CORCHDER, i);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public VectoragregarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectoragregar; }
	}

	public final VectoragregarContext vectoragregar() throws RecognitionException {
		VectoragregarContext _localctx = new VectoragregarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_vectoragregar);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(ID_VALIDO);
				setState(558);
				match(PUNTO);
				setState(559);
				match(APPEND);
				setState(560);
				match(PARIZQ);
				setState(561);
				expr(0);
				setState(562);
				match(PARDER);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(ID_VALIDO);
				setState(566);
				match(CORCHIZQ);
				setState(567);
				expr(0);
				setState(568);
				match(CORCHDER);
				setState(569);
				match(IG);
				setState(570);
				match(ID_VALIDO);
				setState(571);
				match(CORCHIZQ);
				setState(572);
				expr(0);
				setState(573);
				match(CORCHDER);

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(ID_VALIDO);
				setState(577);
				match(CORCHIZQ);
				setState(578);
				expr(0);
				setState(579);
				match(CORCHDER);
				setState(580);
				match(IG);
				setState(581);
				expr(0);

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

	public static class VectorremoverContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode REMOVELAST() { return getToken(SwiftGrammarParser.REMOVELAST, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode REMOVE() { return getToken(SwiftGrammarParser.REMOVE, 0); }
		public TerminalNode AT() { return getToken(SwiftGrammarParser.AT, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VectorremoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorremover; }
	}

	public final VectorremoverContext vectorremover() throws RecognitionException {
		VectorremoverContext _localctx = new VectorremoverContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_vectorremover);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(ID_VALIDO);
				setState(587);
				match(PUNTO);
				setState(588);
				match(REMOVELAST);
				setState(589);
				match(PARIZQ);
				setState(590);
				match(PARDER);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(ID_VALIDO);
				setState(593);
				match(PUNTO);
				setState(594);
				match(REMOVE);
				setState(595);
				match(PARIZQ);
				setState(596);
				match(AT);
				setState(597);
				match(DOS_PUNTOS);
				setState(598);
				expr(0);
				setState(599);
				match(PARDER);

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

	public static class VectorvacioContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode ISEMPTY() { return getToken(SwiftGrammarParser.ISEMPTY, 0); }
		public VectorvacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorvacio; }
	}

	public final VectorvacioContext vectorvacio() throws RecognitionException {
		VectorvacioContext _localctx = new VectorvacioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vectorvacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ID_VALIDO);
			setState(605);
			match(PUNTO);
			setState(606);
			match(ISEMPTY);

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

	public static class VectorcountContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode COUNT() { return getToken(SwiftGrammarParser.COUNT, 0); }
		public VectorcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorcount; }
	}

	public final VectorcountContext vectorcount() throws RecognitionException {
		VectorcountContext _localctx = new VectorcountContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_vectorcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(ID_VALIDO);
			setState(610);
			match(PUNTO);
			setState(611);
			match(COUNT);

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

	public static class VectoraccessContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode CORCHIZQ() { return getToken(SwiftGrammarParser.CORCHIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORCHDER() { return getToken(SwiftGrammarParser.CORCHDER, 0); }
		public VectoraccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectoraccess; }
	}

	public final VectoraccessContext vectoraccess() throws RecognitionException {
		VectoraccessContext _localctx = new VectoraccessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_vectoraccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(ID_VALIDO);
			setState(615);
			match(CORCHIZQ);
			setState(616);
			expr(0);
			setState(617);
			match(CORCHDER);

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u026f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\4\3\4\5\4"+
		"R\n\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3"+
		"\4\5\4d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4y\n\4\3\4\3\4\5\4}\n\4\3\5\6\5\u0080\n\5\r\5\16"+
		"\5\u0081\3\5\3\5\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0094\n\6\3\6\3\6\3\6\3\6\5\6\u009a\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00af"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u00b5\n\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00c1\n\6\3\6\3\6\5\6\u00c5\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00e2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00f2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0103\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0120\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0130\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0141\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u014d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u016a\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0194\n\20\f\20\16\20\u0197\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u01b4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01bd\n\22\3\22"+
		"\3\22\3\22\3\23\6\23\u01c3\n\23\r\23\16\23\u01c4\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u01ea\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0200"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0223\n\33\3\34\6\34\u0226\n\34\r"+
		"\34\16\34\u0227\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u024b\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u025d\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\2\3\36#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@B\2\7\3\2;<\3\2=>\4\2\66\6688\4\2\67\6799\3\2\61\62\2\u029c\2D\3\2"+
		"\2\2\4I\3\2\2\2\6|\3\2\2\2\b\177\3\2\2\2\n\u00c4\3\2\2\2\f\u00c6\3\2\2"+
		"\2\16\u00e1\3\2\2\2\20\u00f1\3\2\2\2\22\u0102\3\2\2\2\24\u0104\3\2\2\2"+
		"\26\u011f\3\2\2\2\30\u012f\3\2\2\2\32\u0140\3\2\2\2\34\u014c\3\2\2\2\36"+
		"\u0169\3\2\2\2 \u01b3\3\2\2\2\"\u01b5\3\2\2\2$\u01c2\3\2\2\2&\u01c8\3"+
		"\2\2\2(\u01ce\3\2\2\2*\u01e9\3\2\2\2,\u01eb\3\2\2\2.\u01f3\3\2\2\2\60"+
		"\u01f6\3\2\2\2\62\u01ff\3\2\2\2\64\u0222\3\2\2\2\66\u0225\3\2\2\28\u022b"+
		"\3\2\2\2:\u024a\3\2\2\2<\u025c\3\2\2\2>\u025e\3\2\2\2@\u0263\3\2\2\2B"+
		"\u0268\3\2\2\2DE\5\4\3\2EF\7\2\2\3FG\b\2\1\2G\3\3\2\2\2HJ\5\6\4\2IH\3"+
		"\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\3\1\2N\5\3\2\2\2OQ"+
		"\5\f\7\2PR\7-\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\4\1\2T}\3\2\2\2UW"+
		"\5\16\b\2VX\7-\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\4\1\2Z}\3\2\2\2["+
		"]\5\20\t\2\\^\7-\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\4\1\2`}\3\2\2"+
		"\2ac\5\22\n\2bd\7-\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\4\1\2f}\3\2\2"+
		"\2gh\5 \21\2hi\b\4\1\2i}\3\2\2\2jk\5\"\22\2kl\b\4\1\2l}\3\2\2\2mn\5(\25"+
		"\2no\b\4\1\2o}\3\2\2\2pq\5*\26\2qr\b\4\1\2r}\3\2\2\2st\5,\27\2tu\b\4\1"+
		"\2u}\3\2\2\2vx\5\64\33\2wy\7-\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\4"+
		"\1\2{}\3\2\2\2|O\3\2\2\2|U\3\2\2\2|[\3\2\2\2|a\3\2\2\2|g\3\2\2\2|j\3\2"+
		"\2\2|m\3\2\2\2|p\3\2\2\2|s\3\2\2\2|v\3\2\2\2}\7\3\2\2\2~\u0080\5\n\6\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\b\5\1\2\u0084\t\3\2\2\2\u0085\u0087"+
		"\5\24\13\2\u0086\u0088\7-\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\b\6\1\2\u008a\u00c5\3\2\2\2\u008b\u008d"+
		"\5\26\f\2\u008c\u008e\7-\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\b\6\1\2\u0090\u00c5\3\2\2\2\u0091\u0093\5\30"+
		"\r\2\u0092\u0094\7-\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\b\6\1\2\u0096\u00c5\3\2\2\2\u0097\u0099\5\32"+
		"\16\2\u0098\u009a\7-\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\b\6\1\2\u009c\u00c5\3\2\2\2\u009d\u009e\5 "+
		"\21\2\u009e\u009f\b\6\1\2\u009f\u00c5\3\2\2\2\u00a0\u00a1\5\"\22\2\u00a1"+
		"\u00a2\b\6\1\2\u00a2\u00c5\3\2\2\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\b\6"+
		"\1\2\u00a5\u00c5\3\2\2\2\u00a6\u00a7\5*\26\2\u00a7\u00a8\b\6\1\2\u00a8"+
		"\u00c5\3\2\2\2\u00a9\u00aa\5,\27\2\u00aa\u00ab\b\6\1\2\u00ab\u00c5\3\2"+
		"\2\2\u00ac\u00ae\5.\30\2\u00ad\u00af\7-\2\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\6\1\2\u00b1\u00c5\3\2"+
		"\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00b5\7-\2\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\6\1\2\u00b7\u00c5\3\2"+
		"\2\2\u00b8\u00ba\5\62\32\2\u00b9\u00bb\7-\2\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\6\1\2\u00bd\u00c5\3\2"+
		"\2\2\u00be\u00c0\5\64\33\2\u00bf\u00c1\7-\2\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\6\1\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u0085\3\2\2\2\u00c4\u008b\3\2\2\2\u00c4\u0091\3\2\2\2\u00c4"+
		"\u0097\3\2\2\2\u00c4\u009d\3\2\2\2\u00c4\u00a0\3\2\2\2\u00c4\u00a3\3\2"+
		"\2\2\u00c4\u00a6\3\2\2\2\u00c4\u00a9\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4"+
		"\u00b2\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\13\3\2\2"+
		"\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\7/\2\2\u00c8\u00c9\5\36\20\2\u00c9"+
		"\u00ca\7\60\2\2\u00ca\u00cb\b\7\1\2\u00cb\r\3\2\2\2\u00cc\u00cd\7\n\2"+
		"\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1"+
		"\7+\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\b\b\1\2\u00d3\u00e2\3\2\2\2"+
		"\u00d4\u00d5\7\n\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7+\2\2\u00d7\u00d8"+
		"\5\36\20\2\u00d8\u00d9\b\b\1\2\u00d9\u00e2\3\2\2\2\u00da\u00db\7\n\2\2"+
		"\u00db\u00dc\7(\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\5\34\17\2\u00de\u00df"+
		"\7.\2\2\u00df\u00e0\b\b\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00cc\3\2\2\2\u00e1"+
		"\u00d4\3\2\2\2\u00e1\u00da\3\2\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\7\13\2"+
		"\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8"+
		"\7+\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\b\t\1\2\u00ea\u00f2\3\2\2\2"+
		"\u00eb\u00ec\7\13\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee\7+\2\2\u00ee\u00ef"+
		"\5\36\20\2\u00ef\u00f0\b\t\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e3\3\2\2\2"+
		"\u00f1\u00eb\3\2\2\2\u00f2\21\3\2\2\2\u00f3\u00f4\7(\2\2\u00f4\u00f5\7"+
		"+\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f7\b\n\1\2\u00f7\u0103\3\2\2\2\u00f8"+
		"\u00f9\7(\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\5\36\20\2\u00fb\u00fc\b\n"+
		"\1\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100"+
		"\5\36\20\2\u0100\u0101\b\n\1\2\u0101\u0103\3\2\2\2\u0102\u00f3\3\2\2\2"+
		"\u0102\u00f8\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\23\3\2\2\2\u0104\u0105"+
		"\7\33\2\2\u0105\u0106\7/\2\2\u0106\u0107\5\36\20\2\u0107\u0108\7\60\2"+
		"\2\u0108\u0109\b\13\1\2\u0109\25\3\2\2\2\u010a\u010b\7\n\2\2\u010b\u010c"+
		"\7(\2\2\u010c\u010d\7,\2\2\u010d\u010e\5\34\17\2\u010e\u010f\7+\2\2\u010f"+
		"\u0110\5\36\20\2\u0110\u0111\b\f\1\2\u0111\u0120\3\2\2\2\u0112\u0113\7"+
		"\n\2\2\u0113\u0114\7(\2\2\u0114\u0115\7+\2\2\u0115\u0116\5\36\20\2\u0116"+
		"\u0117\b\f\1\2\u0117\u0120\3\2\2\2\u0118\u0119\7\n\2\2\u0119\u011a\7("+
		"\2\2\u011a\u011b\7,\2\2\u011b\u011c\5\34\17\2\u011c\u011d\7.\2\2\u011d"+
		"\u011e\b\f\1\2\u011e\u0120\3\2\2\2\u011f\u010a\3\2\2\2\u011f\u0112\3\2"+
		"\2\2\u011f\u0118\3\2\2\2\u0120\27\3\2\2\2\u0121\u0122\7\13\2\2\u0122\u0123"+
		"\7(\2\2\u0123\u0124\7,\2\2\u0124\u0125\5\34\17\2\u0125\u0126\7+\2\2\u0126"+
		"\u0127\5\36\20\2\u0127\u0128\b\r\1\2\u0128\u0130\3\2\2\2\u0129\u012a\7"+
		"\13\2\2\u012a\u012b\7(\2\2\u012b\u012c\7+\2\2\u012c\u012d\5\36\20\2\u012d"+
		"\u012e\b\r\1\2\u012e\u0130\3\2\2\2\u012f\u0121\3\2\2\2\u012f\u0129\3\2"+
		"\2\2\u0130\31\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133\7+\2\2\u0133\u0134"+
		"\5\36\20\2\u0134\u0135\b\16\1\2\u0135\u0141\3\2\2\2\u0136\u0137\7(\2\2"+
		"\u0137\u0138\7?\2\2\u0138\u0139\5\36\20\2\u0139\u013a\b\16\1\2\u013a\u0141"+
		"\3\2\2\2\u013b\u013c\7(\2\2\u013c\u013d\7@\2\2\u013d\u013e\5\36\20\2\u013e"+
		"\u013f\b\16\1\2\u013f\u0141\3\2\2\2\u0140\u0131\3\2\2\2\u0140\u0136\3"+
		"\2\2\2\u0140\u013b\3\2\2\2\u0141\33\3\2\2\2\u0142\u0143\7\3\2\2\u0143"+
		"\u014d\b\17\1\2\u0144\u0145\7\4\2\2\u0145\u014d\b\17\1\2\u0146\u0147\7"+
		"\5\2\2\u0147\u014d\b\17\1\2\u0148\u0149\7\6\2\2\u0149\u014d\b\17\1\2\u014a"+
		"\u014b\7\7\2\2\u014b\u014d\b\17\1\2\u014c\u0142\3\2\2\2\u014c\u0144\3"+
		"\2\2\2\u014c\u0146\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\35\3\2\2\2\u014e\u014f\b\20\1\2\u014f\u0150\7\63\2\2\u0150\u0151\5\36"+
		"\20\24\u0151\u0152\b\20\1\2\u0152\u016a\3\2\2\2\u0153\u0154\7/\2\2\u0154"+
		"\u0155\5\36\20\2\u0155\u0156\7\60\2\2\u0156\u0157\b\20\1\2\u0157\u016a"+
		"\3\2\2\2\u0158\u0159\7>\2\2\u0159\u015a\7&\2\2\u015a\u016a\b\20\1\2\u015b"+
		"\u015c\7&\2\2\u015c\u016a\b\20\1\2\u015d\u015e\7\'\2\2\u015e\u016a\b\20"+
		"\1\2\u015f\u0160\7\b\2\2\u0160\u016a\b\20\1\2\u0161\u0162\7\t\2\2\u0162"+
		"\u016a\b\20\1\2\u0163\u0164\7)\2\2\u0164\u016a\b\20\1\2\u0165\u0166\7"+
		"(\2\2\u0166\u016a\b\20\1\2\u0167\u0168\7\f\2\2\u0168\u016a\b\20\1\2\u0169"+
		"\u014e\3\2\2\2\u0169\u0153\3\2\2\2\u0169\u0158\3\2\2\2\u0169\u015b\3\2"+
		"\2\2\u0169\u015d\3\2\2\2\u0169\u015f\3\2\2\2\u0169\u0161\3\2\2\2\u0169"+
		"\u0163\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0195\3\2"+
		"\2\2\u016b\u016c\f\23\2\2\u016c\u016d\7:\2\2\u016d\u016e\5\36\20\24\u016e"+
		"\u016f\b\20\1\2\u016f\u0194\3\2\2\2\u0170\u0171\f\22\2\2\u0171\u0172\t"+
		"\2\2\2\u0172\u0173\5\36\20\23\u0173\u0174\b\20\1\2\u0174\u0194\3\2\2\2"+
		"\u0175\u0176\f\21\2\2\u0176\u0177\t\3\2\2\u0177\u0178\5\36\20\22\u0178"+
		"\u0179\b\20\1\2\u0179\u0194\3\2\2\2\u017a\u017b\f\20\2\2\u017b\u017c\t"+
		"\4\2\2\u017c\u017d\5\36\20\21\u017d\u017e\b\20\1\2\u017e\u0194\3\2\2\2"+
		"\u017f\u0180\f\17\2\2\u0180\u0181\t\5\2\2\u0181\u0182\5\36\20\20\u0182"+
		"\u0183\b\20\1\2\u0183\u0194\3\2\2\2\u0184\u0185\f\16\2\2\u0185\u0186\t"+
		"\6\2\2\u0186\u0187\5\36\20\17\u0187\u0188\b\20\1\2\u0188\u0194\3\2\2\2"+
		"\u0189\u018a\f\r\2\2\u018a\u018b\7\65\2\2\u018b\u018c\5\36\20\16\u018c"+
		"\u018d\b\20\1\2\u018d\u0194\3\2\2\2\u018e\u018f\f\f\2\2\u018f\u0190\7"+
		"\64\2\2\u0190\u0191\5\36\20\r\u0191\u0192\b\20\1\2\u0192\u0194\3\2\2\2"+
		"\u0193\u016b\3\2\2\2\u0193\u0170\3\2\2\2\u0193\u0175\3\2\2\2\u0193\u017a"+
		"\3\2\2\2\u0193\u017f\3\2\2\2\u0193\u0184\3\2\2\2\u0193\u0189\3\2\2\2\u0193"+
		"\u018e\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\37\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\r\2\2\u0199\u019a"+
		"\5\36\20\2\u019a\u019b\7A\2\2\u019b\u019c\5\b\5\2\u019c\u019d\7B\2\2\u019d"+
		"\u019e\b\21\1\2\u019e\u01b4\3\2\2\2\u019f\u01a0\7\r\2\2\u01a0\u01a1\5"+
		"\36\20\2\u01a1\u01a2\7A\2\2\u01a2\u01a3\5\b\5\2\u01a3\u01a4\7B\2\2\u01a4"+
		"\u01a5\7\16\2\2\u01a5\u01a6\7A\2\2\u01a6\u01a7\5\b\5\2\u01a7\u01a8\7B"+
		"\2\2\u01a8\u01a9\b\21\1\2\u01a9\u01b4\3\2\2\2\u01aa\u01ab\7\r\2\2\u01ab"+
		"\u01ac\5\36\20\2\u01ac\u01ad\7A\2\2\u01ad\u01ae\5\b\5\2\u01ae\u01af\7"+
		"B\2\2\u01af\u01b0\7\16\2\2\u01b0\u01b1\5 \21\2\u01b1\u01b2\b\21\1\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u0198\3\2\2\2\u01b3\u019f\3\2\2\2\u01b3\u01aa\3\2"+
		"\2\2\u01b4!\3\2\2\2\u01b5\u01b6\7\17\2\2\u01b6\u01b7\5\36\20\2\u01b7\u01b8"+
		"\7A\2\2\u01b8\u01bc\5$\23\2\u01b9\u01ba\7\21\2\2\u01ba\u01bb\7,\2\2\u01bb"+
		"\u01bd\5\b\5\2\u01bc\u01b9\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\7B\2\2\u01bf\u01c0\b\22\1\2\u01c0#\3\2\2\2\u01c1\u01c3"+
		"\5&\24\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\b\23\1\2\u01c7%\3\2\2\2"+
		"\u01c8\u01c9\7\20\2\2\u01c9\u01ca\5\36\20\2\u01ca\u01cb\7,\2\2\u01cb\u01cc"+
		"\5\b\5\2\u01cc\u01cd\b\24\1\2\u01cd\'\3\2\2\2\u01ce\u01cf\7\27\2\2\u01cf"+
		"\u01d0\5\36\20\2\u01d0\u01d1\7A\2\2\u01d1\u01d2\5\b\5\2\u01d2\u01d3\7"+
		"B\2\2\u01d3\u01d4\b\25\1\2\u01d4)\3\2\2\2\u01d5\u01d6\7\24\2\2\u01d6\u01d7"+
		"\7(\2\2\u01d7\u01d8\7\25\2\2\u01d8\u01d9\5\36\20\2\u01d9\u01da\7\26\2"+
		"\2\u01da\u01db\5\36\20\2\u01db\u01dc\7A\2\2\u01dc\u01dd\5\b\5\2\u01dd"+
		"\u01de\7B\2\2\u01de\u01df\b\26\1\2\u01df\u01ea\3\2\2\2\u01e0\u01e1\7\24"+
		"\2\2\u01e1\u01e2\7(\2\2\u01e2\u01e3\7\25\2\2\u01e3\u01e4\5\36\20\2\u01e4"+
		"\u01e5\7A\2\2\u01e5\u01e6\5\b\5\2\u01e6\u01e7\7B\2\2\u01e7\u01e8\b\26"+
		"\1\2\u01e8\u01ea\3\2\2\2\u01e9\u01d5\3\2\2\2\u01e9\u01e0\3\2\2\2\u01ea"+
		"+\3\2\2\2\u01eb\u01ec\7\30\2\2\u01ec\u01ed\5\36\20\2\u01ed\u01ee\7\16"+
		"\2\2\u01ee\u01ef\7A\2\2\u01ef\u01f0\5\b\5\2\u01f0\u01f1\7B\2\2\u01f1\u01f2"+
		"\b\27\1\2\u01f2-\3\2\2\2\u01f3\u01f4\7\23\2\2\u01f4\u01f5\b\30\1\2\u01f5"+
		"/\3\2\2\2\u01f6\u01f7\7\22\2\2\u01f7\u01f8\b\31\1\2\u01f8\61\3\2\2\2\u01f9"+
		"\u01fa\7\31\2\2\u01fa\u0200\b\32\1\2\u01fb\u01fc\7\31\2\2\u01fc\u01fd"+
		"\5\36\20\2\u01fd\u01fe\b\32\1\2\u01fe\u0200\3\2\2\2\u01ff\u01f9\3\2\2"+
		"\2\u01ff\u01fb\3\2\2\2\u0200\63\3\2\2\2\u0201\u0202\7\n\2\2\u0202\u0203"+
		"\7(\2\2\u0203\u0204\7,\2\2\u0204\u0205\7G\2\2\u0205\u0206\5\34\17\2\u0206"+
		"\u0207\7H\2\2\u0207\u0208\7+\2\2\u0208\u0209\7G\2\2\u0209\u020a\5\36\20"+
		"\2\u020a\u020b\5\66\34\2\u020b\u020c\7H\2\2\u020c\u020d\b\33\1\2\u020d"+
		"\u0223\3\2\2\2\u020e\u020f\7\n\2\2\u020f\u0210\7(\2\2\u0210\u0211\7,\2"+
		"\2\u0211\u0212\7G\2\2\u0212\u0213\5\34\17\2\u0213\u0214\7H\2\2\u0214\u0215"+
		"\7+\2\2\u0215\u0216\7G\2\2\u0216\u0217\7H\2\2\u0217\u0218\b\33\1\2\u0218"+
		"\u0223\3\2\2\2\u0219\u021a\7\n\2\2\u021a\u021b\7(\2\2\u021b\u021c\7,\2"+
		"\2\u021c\u021d\7G\2\2\u021d\u021e\5\34\17\2\u021e\u021f\7H\2\2\u021f\u0220"+
		"\7(\2\2\u0220\u0221\b\33\1\2\u0221\u0223\3\2\2\2\u0222\u0201\3\2\2\2\u0222"+
		"\u020e\3\2\2\2\u0222\u0219\3\2\2\2\u0223\65\3\2\2\2\u0224\u0226\58\35"+
		"\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\b\34\1\2\u022a\67\3\2\2\2\u022b"+
		"\u022c\7D\2\2\u022c\u022d\5\36\20\2\u022d\u022e\b\35\1\2\u022e9\3\2\2"+
		"\2\u022f\u0230\7(\2\2\u0230\u0231\7E\2\2\u0231\u0232\7\35\2\2\u0232\u0233"+
		"\7/\2\2\u0233\u0234\5\36\20\2\u0234\u0235\7\60\2\2\u0235\u0236\b\36\1"+
		"\2\u0236\u024b\3\2\2\2\u0237\u0238\7(\2\2\u0238\u0239\7G\2\2\u0239\u023a"+
		"\5\36\20\2\u023a\u023b\7H\2\2\u023b\u023c\7+\2\2\u023c\u023d\7(\2\2\u023d"+
		"\u023e\7G\2\2\u023e\u023f\5\36\20\2\u023f\u0240\7H\2\2\u0240\u0241\b\36"+
		"\1\2\u0241\u024b\3\2\2\2\u0242\u0243\7(\2\2\u0243\u0244\7G\2\2\u0244\u0245"+
		"\5\36\20\2\u0245\u0246\7H\2\2\u0246\u0247\7+\2\2\u0247\u0248\5\36\20\2"+
		"\u0248\u0249\b\36\1\2\u0249\u024b\3\2\2\2\u024a\u022f\3\2\2\2\u024a\u0237"+
		"\3\2\2\2\u024a\u0242\3\2\2\2\u024b;\3\2\2\2\u024c\u024d\7(\2\2\u024d\u024e"+
		"\7E\2\2\u024e\u024f\7\37\2\2\u024f\u0250\7/\2\2\u0250\u0251\7\60\2\2\u0251"+
		"\u025d\b\37\1\2\u0252\u0253\7(\2\2\u0253\u0254\7E\2\2\u0254\u0255\7\36"+
		"\2\2\u0255\u0256\7/\2\2\u0256\u0257\7\"\2\2\u0257\u0258\7,\2\2\u0258\u0259"+
		"\5\36\20\2\u0259\u025a\7\60\2\2\u025a\u025b\b\37\1\2\u025b\u025d\3\2\2"+
		"\2\u025c\u024c\3\2\2\2\u025c\u0252\3\2\2\2\u025d=\3\2\2\2\u025e\u025f"+
		"\7(\2\2\u025f\u0260\7E\2\2\u0260\u0261\7!\2\2\u0261\u0262\b \1\2\u0262"+
		"?\3\2\2\2\u0263\u0264\7(\2\2\u0264\u0265\7E\2\2\u0265\u0266\7 \2\2\u0266"+
		"\u0267\b!\1\2\u0267A\3\2\2\2\u0268\u0269\7(\2\2\u0269\u026a\7G\2\2\u026a"+
		"\u026b\5\36\20\2\u026b\u026c\7H\2\2\u026c\u026d\b\"\1\2\u026dC\3\2\2\2"+
		"&KQW]cx|\u0081\u0087\u008d\u0093\u0099\u00ae\u00b4\u00ba\u00c0\u00c4\u00e1"+
		"\u00f1\u0102\u011f\u012f\u0140\u014c\u0169\u0193\u0195\u01b3\u01bc\u01c4"+
		"\u01e9\u01ff\u0222\u0227\u024a\u025c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}