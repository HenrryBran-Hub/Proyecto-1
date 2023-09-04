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
		T__0=1, INT=1, FLOAT=2, STRING=3, BOOL=4, CHARACT=5, TRU=6, FAL=7, VAR=8, 
		LET=9, NULO=10, IF=11, ELSE=12, SWITCH=13, CASE=14, DEFAULT=15, BREAK=16, 
		CONTINUE=17, FOR=18, IN=19, RANGO=20, WHILE=21, GUARD=22, RETURN=23, FUNCION=24, 
		PRINT=25, INOUT=26, APPEND=27, REMOVE=28, REMOVELAST=29, COUNT=30, ISEMPTY=31, 
		AT=32, REPEATING=33, STRUCT=34, MUTATING=35, SELF=36, NUMBER=37, CADENA=38, 
		ID_VALIDO=39, CHARACTER=40, WS=41, IG=42, DOS_PUNTOS=43, PUNTOCOMA=44, 
		CIERRE_INTE=45, PARIZQ=46, PARDER=47, DIF=48, IG_IG=49, NOT=50, OR=51, 
		AND=52, MAY_IG=53, MEN_IG=54, MAYOR=55, MENOR=56, MODULO=57, MUL=58, DIV=59, 
		ADD=60, SUB=61, SUMA=62, RESTA=63, LLAVEIZQ=64, LLAVEDER=65, RETORNO=66, 
		COMA=67, PUNTO=68, GUIONBAJO=69, CORCHIZQ=70, CORCHDER=71, WHITESPACE=72, 
		COMMENT=73, LINE_COMMENT=74;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_blockinterno = 3, 
		RULE_instructionint = 4, RULE_declavarible = 5, RULE_declaconstante = 6, 
		RULE_asignacionvariable = 7, RULE_tipodato = 8, RULE_expr = 9, RULE_sentenciaifelse = 10, 
		RULE_switchcontrol = 11, RULE_blockcase = 12, RULE_bloquecase = 13, RULE_whilecontrol = 14, 
		RULE_forcontrol = 15, RULE_guardcontrol = 16, RULE_continuee = 17, RULE_breakk = 18, 
		RULE_retornos = 19, RULE_vectorcontrol = 20, RULE_blockparams = 21, RULE_bloqueparams = 22, 
		RULE_vectoragregar = 23, RULE_vectorremover = 24, RULE_vectorvacio = 25, 
		RULE_vectorcount = 26, RULE_vectoraccess = 27, RULE_matrizcontrol = 28, 
		RULE_tipomatriz = 29, RULE_defmatriz = 30, RULE_listavaloresmat = 31, 
		RULE_listavaloresmat2 = 32, RULE_listaexpresions = 33, RULE_listaexpresion = 34, 
		RULE_simplematriz = 35, RULE_listamatrizaddsubs = 36, RULE_listamatrizaddsub = 37, 
		RULE_structcontrol = 38, RULE_listaatributos = 39, RULE_listaatributo = 40, 
		RULE_structexpr = 41, RULE_l_dupla = 42, RULE_llamadastruct = 43, RULE_asignacionparametrostruct = 44, 
		RULE_llamadafuncionstruct = 45, RULE_funciondeclaracioncontrol = 46, RULE_listaparametro = 47, 
		RULE_funcionllamadacontrol = 48, RULE_listaparametrosllamada = 49, RULE_printstmt = 50, 
		RULE_intembebida = 51, RULE_floatembebida = 52, RULE_stringembebida = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "blockinterno", "instructionint", "declavarible", 
			"declaconstante", "asignacionvariable", "tipodato", "expr", "sentenciaifelse", 
			"switchcontrol", "blockcase", "bloquecase", "whilecontrol", "forcontrol", 
			"guardcontrol", "continuee", "breakk", "retornos", "vectorcontrol", "blockparams", 
			"bloqueparams", "vectoragregar", "vectorremover", "vectorvacio", "vectorcount", 
			"vectoraccess", "matrizcontrol", "tipomatriz", "defmatriz", "listavaloresmat", 
			"listavaloresmat2", "listaexpresions", "listaexpresion", "simplematriz", 
			"listamatrizaddsubs", "listamatrizaddsub", "structcontrol", "listaatributos", 
			"listaatributo", "structexpr", "l_dupla", "llamadastruct", "asignacionparametrostruct", 
			"llamadafuncionstruct", "funciondeclaracioncontrol", "listaparametro", 
			"funcionllamadacontrol", "listaparametrosllamada", "printstmt", "intembebida", 
			"floatembebida", "stringembebida"
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
			"'mutating'", "'self'", null, null, null, null, null, "'='", "':'", "';'", 
			"'?'", "'('", "')'", "'!='", "'=='", "'!'", "'||'", "'&&'", "'>='", "'<='", 
			"'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'+='", "'-='", "'{'", 
			"'}'", "'->'", "','", "'.'", "'_'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR", 
			"LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", "PRINT", 
			"INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "ISEMPTY", "AT", 
			"REPEATING", "STRUCT", "MUTATING", "SELF", "NUMBER", "CADENA", "ID_VALIDO", 
			"CHARACTER", "WS", "IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ", 
			"PARDER", "DIF", "IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", 
			"MENOR", "MODULO", "MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", 
			"LLAVEDER", "RETORNO", "COMA", "PUNTO", "GUIONBAJO", "CORCHIZQ", "CORCHDER", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT"
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
			setState(108);
			((SContext)_localctx).block = block();
			setState(109);
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
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << FUNCION) | (1L << PRINT) | (1L << STRUCT) | (1L << ID_VALIDO))) != 0) );

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
		public DeclavaribleContext declavarible;
		public DeclaconstanteContext declaconstante;
		public AsignacionvariableContext asignacionvariable;
		public SentenciaifelseContext sentenciaifelse;
		public SwitchcontrolContext switchcontrol;
		public WhilecontrolContext whilecontrol;
		public ForcontrolContext forcontrol;
		public GuardcontrolContext guardcontrol;
		public VectorcontrolContext vectorcontrol;
		public VectoragregarContext vectoragregar;
		public VectorremoverContext vectorremover;
		public PrintstmtContext printstmt;
		public MatrizcontrolContext matrizcontrol;
		public StructcontrolContext structcontrol;
		public FunciondeclaracioncontrolContext funciondeclaracioncontrol;
		public DeclavaribleContext declavarible() {
			return getRuleContext(DeclavaribleContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
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
		public VectoragregarContext vectoragregar() {
			return getRuleContext(VectoragregarContext.class,0);
		}
		public VectorremoverContext vectorremover() {
			return getRuleContext(VectorremoverContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public MatrizcontrolContext matrizcontrol() {
			return getRuleContext(MatrizcontrolContext.class,0);
		}
		public StructcontrolContext structcontrol() {
			return getRuleContext(StructcontrolContext.class,0);
		}
		public FunciondeclaracioncontrolContext funciondeclaracioncontrol() {
			return getRuleContext(FunciondeclaracioncontrolContext.class,0);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((InstructionContext)_localctx).declavarible = declavarible();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(120);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declavarible.decvbl
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((InstructionContext)_localctx).declaconstante = declaconstante();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(126);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declaconstante.deccon
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((InstructionContext)_localctx).asignacionvariable = asignacionvariable();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(132);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				((InstructionContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.inst = ((InstructionContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				((InstructionContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				((InstructionContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.inst = ((InstructionContext)_localctx).whilecontrol.whict
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				((InstructionContext)_localctx).forcontrol = forcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).forcontrol.forct
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				((InstructionContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).guardcontrol.guct
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				((InstructionContext)_localctx).vectorcontrol = vectorcontrol();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(153);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).vectorcontrol.vect 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				((InstructionContext)_localctx).vectoragregar = vectoragregar();
				 _localctx.inst = ((InstructionContext)_localctx).vectoragregar.veadct 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				((InstructionContext)_localctx).vectorremover = vectorremover();
				 _localctx.inst = ((InstructionContext)_localctx).vectorremover.vermct 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(165);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
				((InstructionContext)_localctx).matrizcontrol = matrizcontrol();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(171);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).matrizcontrol.matct
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(176);
				((InstructionContext)_localctx).structcontrol = structcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).structcontrol.struck
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(179);
				((InstructionContext)_localctx).funciondeclaracioncontrol = funciondeclaracioncontrol();
				 _localctx.inst = ((InstructionContext)_localctx).funciondeclaracioncontrol.fdc
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
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				((BlockinternoContext)_localctx).instructionint = instructionint();
				((BlockinternoContext)_localctx).insint.add(((BlockinternoContext)_localctx).instructionint);
				}
				}
				setState(187); 
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
		public DeclavaribleContext declavarible;
		public DeclaconstanteContext declaconstante;
		public AsignacionvariableContext asignacionvariable;
		public SentenciaifelseContext sentenciaifelse;
		public SwitchcontrolContext switchcontrol;
		public WhilecontrolContext whilecontrol;
		public ForcontrolContext forcontrol;
		public GuardcontrolContext guardcontrol;
		public ContinueeContext continuee;
		public BreakkContext breakk;
		public RetornosContext retornos;
		public VectorcontrolContext vectorcontrol;
		public VectoragregarContext vectoragregar;
		public VectorremoverContext vectorremover;
		public PrintstmtContext printstmt;
		public DeclavaribleContext declavarible() {
			return getRuleContext(DeclavaribleContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
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
		public VectoragregarContext vectoragregar() {
			return getRuleContext(VectoragregarContext.class,0);
		}
		public VectorremoverContext vectorremover() {
			return getRuleContext(VectorremoverContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				((InstructionintContext)_localctx).declavarible = declavarible();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(192);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declavarible.decvbl
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((InstructionintContext)_localctx).declaconstante = declaconstante();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(198);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declaconstante.deccon
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				((InstructionintContext)_localctx).asignacionvariable = asignacionvariable();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(204);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				((InstructionintContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.insint = ((InstructionintContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				((InstructionintContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				((InstructionintContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).whilecontrol.whict
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				((InstructionintContext)_localctx).forcontrol = forcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).forcontrol.forct
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				((InstructionintContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).guardcontrol.guct
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				((InstructionintContext)_localctx).continuee = continuee();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(225);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).continuee.coct
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(230);
				((InstructionintContext)_localctx).breakk = breakk();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(231);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).breakk.brkct
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				((InstructionintContext)_localctx).retornos = retornos();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(237);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).retornos.rect 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(242);
				((InstructionintContext)_localctx).vectorcontrol = vectorcontrol();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(243);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectorcontrol.vect 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				((InstructionintContext)_localctx).vectoragregar = vectoragregar();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(249);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectoragregar.veadct 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(254);
				((InstructionintContext)_localctx).vectorremover = vectorremover();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(255);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectorremover.vermct 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(260);
				((InstructionintContext)_localctx).printstmt = printstmt();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(261);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).printstmt.prnt
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
		enterRule(_localctx, 10, RULE_declavarible);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(269);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(270);
				match(DOS_PUNTOS);
				setState(271);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(272);
				match(IG);
				setState(273);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).tipodato.tipo, ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(277);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(278);
				match(IG);
				setState(279);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(283);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(284);
				match(DOS_PUNTOS);
				setState(285);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(286);
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
		enterRule(_localctx, 12, RULE_declaconstante);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(292);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(293);
				match(DOS_PUNTOS);
				setState(294);
				((DeclaconstanteContext)_localctx).tipodato = tipodato();
				setState(295);
				match(IG);
				setState(296);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), ((DeclaconstanteContext)_localctx).tipodato.tipo, ((DeclaconstanteContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(300);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(301);
				match(IG);
				setState(302);
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
		enterRule(_localctx, 14, RULE_asignacionvariable);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(308);
				match(IG);
				setState(309);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(313);
				match(SUMA);
				setState(314);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(318);
				match(RESTA);
				setState(319);
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
		enterRule(_localctx, 16, RULE_tipodato);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(T__0);
				 _localctx.tipo = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(FLOAT);
				 _localctx.tipo = environment.FLOAT 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(STRING);
				 _localctx.tipo = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(BOOL);
				 _localctx.tipo = environment.BOOLEAN 
				}
				break;
			case CHARACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
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
		public VectorvacioContext vectorvacio;
		public VectorcountContext vectorcount;
		public VectoraccessContext vectoraccess;
		public IntembebidaContext intembebida;
		public FloatembebidaContext floatembebida;
		public StringembebidaContext stringembebida;
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
		public VectorvacioContext vectorvacio() {
			return getRuleContext(VectorvacioContext.class,0);
		}
		public VectorcountContext vectorcount() {
			return getRuleContext(VectorcountContext.class,0);
		}
		public VectoraccessContext vectoraccess() {
			return getRuleContext(VectoraccessContext.class,0);
		}
		public IntembebidaContext intembebida() {
			return getRuleContext(IntembebidaContext.class,0);
		}
		public FloatembebidaContext floatembebida() {
			return getRuleContext(FloatembebidaContext.class,0);
		}
		public StringembebidaContext stringembebida() {
			return getRuleContext(StringembebidaContext.class,0);
		}
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(337);
				((ExprContext)_localctx).op = match(NOT);
				setState(338);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(24);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetLine(), (((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetColumn(), ((ExprContext)_localctx).right.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
				}
				break;
			case 2:
				{
				setState(341);
				match(PARIZQ);
				setState(342);
				((ExprContext)_localctx).expr = expr(0);
				setState(343);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 3:
				{
				setState(346);
				match(SUB);
				setState(347);
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
			case 4:
				{
				setState(349);
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
			case 5:
				{
				setState(351);
				((ExprContext)_localctx).CADENA = match(CADENA);

				        str := (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getLine():0), (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 6:
				{
				setState(353);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 7:
				{
				setState(355);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 8:
				{
				setState(357);
				((ExprContext)_localctx).CHARACTER = match(CHARACTER);
				 
				        str := (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getLine():0), (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1], environment.CHARACTER) 
				    
				}
				break;
			case 9:
				{
				setState(359);
				((ExprContext)_localctx).ID_VALIDO = match(ID_VALIDO);

				        id := (((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getText():null)
				        _localctx.e = instructions.NewCallid((((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getLine():0),(((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getCharPositionInLine():0),id)
				    
				}
				break;
			case 10:
				{
				setState(361);
				((ExprContext)_localctx).NULO = match(NULO);
				_localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getCharPositionInLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getText():null),environment.NULL)
				}
				break;
			case 11:
				{
				setState(363);
				((ExprContext)_localctx).vectorvacio = vectorvacio();
				 _localctx.e = ((ExprContext)_localctx).vectorvacio.veemct
				}
				break;
			case 12:
				{
				setState(366);
				((ExprContext)_localctx).vectorcount = vectorcount();
				 _localctx.e = ((ExprContext)_localctx).vectorcount.vecnct
				}
				break;
			case 13:
				{
				setState(369);
				((ExprContext)_localctx).vectoraccess = vectoraccess();
				 _localctx.e = ((ExprContext)_localctx).vectoraccess.vepposct
				}
				break;
			case 14:
				{
				setState(372);
				((ExprContext)_localctx).intembebida = intembebida();
				 _localctx.e = ((ExprContext)_localctx).intembebida.intemb
				}
				break;
			case 15:
				{
				setState(375);
				((ExprContext)_localctx).floatembebida = floatembebida();
				 _localctx.e = ((ExprContext)_localctx).floatembebida.floemb
				}
				break;
			case 16:
				{
				setState(378);
				((ExprContext)_localctx).stringembebida = stringembebida();
				 _localctx.e = ((ExprContext)_localctx).stringembebida.stremb
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(384);
						((ExprContext)_localctx).op = match(MODULO);
						setState(385);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(24);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(389);
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
						setState(390);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(23);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(393);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(394);
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
						setState(395);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(22);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(398);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(399);
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
						setState(400);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(403);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(404);
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
						setState(405);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(408);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(409);
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
						setState(410);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(413);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(414);
						((ExprContext)_localctx).op = match(AND);
						setState(415);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(418);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(419);
						((ExprContext)_localctx).op = match(OR);
						setState(420);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(427);
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
		enterRule(_localctx, 20, RULE_sentenciaifelse);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(429);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(430);
				match(LLAVEIZQ);
				setState(431);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(432);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIf((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(436);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(437);
				match(LLAVEIZQ);
				setState(438);
				((SentenciaifelseContext)_localctx).ifop = blockinterno();
				setState(439);
				match(LLAVEDER);
				setState(440);
				match(ELSE);
				setState(441);
				match(LLAVEIZQ);
				setState(442);
				((SentenciaifelseContext)_localctx).elseop = blockinterno();
				setState(443);
				match(LLAVEDER);
				 _localctx.myIfElse = instructions.NewSentenciaIfElse((((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getLine():0), (((SentenciaifelseContext)_localctx).IF!=null?((SentenciaifelseContext)_localctx).IF.getCharPositionInLine():0), ((SentenciaifelseContext)_localctx).expr.e, ((SentenciaifelseContext)_localctx).ifop.blkint , ((SentenciaifelseContext)_localctx).elseop.blkint)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				((SentenciaifelseContext)_localctx).IF = match(IF);
				setState(447);
				((SentenciaifelseContext)_localctx).expr = expr(0);
				setState(448);
				match(LLAVEIZQ);
				setState(449);
				((SentenciaifelseContext)_localctx).blockinterno = blockinterno();
				setState(450);
				match(LLAVEDER);
				setState(451);
				match(ELSE);
				setState(452);
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
		enterRule(_localctx, 22, RULE_switchcontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((SwitchcontrolContext)_localctx).SWITCH = match(SWITCH);
			setState(458);
			((SwitchcontrolContext)_localctx).expr = expr(0);
			setState(459);
			match(LLAVEIZQ);
			setState(460);
			((SwitchcontrolContext)_localctx).blockcase = blockcase();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(461);
				((SwitchcontrolContext)_localctx).DEFAULT = match(DEFAULT);
				setState(462);
				match(DOS_PUNTOS);
				setState(463);
				((SwitchcontrolContext)_localctx).blockinterno = blockinterno();
				}
			}

			setState(466);
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
		enterRule(_localctx, 24, RULE_blockcase);

		    _localctx.blkcase = []interface{}{}
		    var listInt []IBloquecaseContext

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469);
				((BlockcaseContext)_localctx).bloquecase = bloquecase();
				((BlockcaseContext)_localctx).blocas.add(((BlockcaseContext)_localctx).bloquecase);
				}
				}
				setState(472); 
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
		enterRule(_localctx, 26, RULE_bloquecase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((BloquecaseContext)_localctx).CASE = match(CASE);
			setState(477);
			((BloquecaseContext)_localctx).expr = expr(0);
			setState(478);
			match(DOS_PUNTOS);
			setState(479);
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
		enterRule(_localctx, 28, RULE_whilecontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			((WhilecontrolContext)_localctx).WHILE = match(WHILE);
			setState(483);
			((WhilecontrolContext)_localctx).expr = expr(0);
			setState(484);
			match(LLAVEIZQ);
			setState(485);
			((WhilecontrolContext)_localctx).blockinterno = blockinterno();
			setState(486);
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
		enterRule(_localctx, 30, RULE_forcontrol);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				((ForcontrolContext)_localctx).FOR = match(FOR);
				setState(490);
				((ForcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(491);
				match(IN);
				setState(492);
				((ForcontrolContext)_localctx).left = expr(0);
				setState(493);
				match(RANGO);
				setState(494);
				((ForcontrolContext)_localctx).right = expr(0);
				setState(495);
				match(LLAVEIZQ);
				setState(496);
				((ForcontrolContext)_localctx).blockinterno = blockinterno();
				setState(497);
				match(LLAVEDER);
				 _localctx.forct = instructions.NewSentenciaForRango((((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getLine():0), (((ForcontrolContext)_localctx).FOR!=null?((ForcontrolContext)_localctx).FOR.getCharPositionInLine():0), (((ForcontrolContext)_localctx).ID_VALIDO!=null?((ForcontrolContext)_localctx).ID_VALIDO.getText():null), ((ForcontrolContext)_localctx).left.e, ((ForcontrolContext)_localctx).right.e,((ForcontrolContext)_localctx).blockinterno.blkint)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				((ForcontrolContext)_localctx).FOR = match(FOR);
				setState(501);
				((ForcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(502);
				match(IN);
				setState(503);
				((ForcontrolContext)_localctx).expr = expr(0);
				setState(504);
				match(LLAVEIZQ);
				setState(505);
				((ForcontrolContext)_localctx).blockinterno = blockinterno();
				setState(506);
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
		enterRule(_localctx, 32, RULE_guardcontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			((GuardcontrolContext)_localctx).GUARD = match(GUARD);
			setState(512);
			((GuardcontrolContext)_localctx).expr = expr(0);
			setState(513);
			match(ELSE);
			setState(514);
			match(LLAVEIZQ);
			setState(515);
			((GuardcontrolContext)_localctx).blockinterno = blockinterno();
			setState(516);
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
		enterRule(_localctx, 34, RULE_continuee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 36, RULE_breakk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		enterRule(_localctx, 38, RULE_retornos);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				((RetornosContext)_localctx).RETURN = match(RETURN);

				    ((RetornosContext)_localctx).rect =  instructions.NewTransferenciaReturn((((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getLine():0), (((RetornosContext)_localctx).RETURN!=null?((RetornosContext)_localctx).RETURN.getCharPositionInLine():0));

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				((RetornosContext)_localctx).RETURN = match(RETURN);
				setState(528);
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
		public BlockparamsContext blockparams;
		public Token prin;
		public Token secu;
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
		enterRule(_localctx, 40, RULE_vectorcontrol);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				((VectorcontrolContext)_localctx).VAR = match(VAR);
				setState(534);
				((VectorcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(535);
				match(DOS_PUNTOS);
				setState(536);
				match(CORCHIZQ);
				setState(537);
				((VectorcontrolContext)_localctx).tipodato = tipodato();
				setState(538);
				match(CORCHDER);
				setState(539);
				match(IG);
				setState(540);
				match(CORCHIZQ);
				setState(541);
				((VectorcontrolContext)_localctx).blockparams = blockparams();
				setState(542);
				match(CORCHDER);
				 _localctx.vect = instructions.NewArregloDeclaracionLista((((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getLine():0) ,(((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((VectorcontrolContext)_localctx).ID_VALIDO!=null?((VectorcontrolContext)_localctx).ID_VALIDO.getText():null) , ((VectorcontrolContext)_localctx).tipodato.tipo, ((VectorcontrolContext)_localctx).blockparams.blkpar)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				((VectorcontrolContext)_localctx).VAR = match(VAR);
				setState(546);
				((VectorcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(547);
				match(DOS_PUNTOS);
				setState(548);
				match(CORCHIZQ);
				setState(549);
				((VectorcontrolContext)_localctx).tipodato = tipodato();
				setState(550);
				match(CORCHDER);
				setState(551);
				match(IG);
				setState(552);
				match(CORCHIZQ);
				setState(553);
				match(CORCHDER);
				 _localctx.vect = instructions.NewArregloDeclaracionSinLista((((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getLine():0) ,(((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((VectorcontrolContext)_localctx).ID_VALIDO!=null?((VectorcontrolContext)_localctx).ID_VALIDO.getText():null) , ((VectorcontrolContext)_localctx).tipodato.tipo)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				((VectorcontrolContext)_localctx).VAR = match(VAR);
				setState(557);
				((VectorcontrolContext)_localctx).prin = match(ID_VALIDO);
				setState(558);
				match(DOS_PUNTOS);
				setState(559);
				match(CORCHIZQ);
				setState(560);
				((VectorcontrolContext)_localctx).tipodato = tipodato();
				setState(561);
				match(CORCHDER);
				setState(562);
				match(IG);
				setState(563);
				((VectorcontrolContext)_localctx).secu = match(ID_VALIDO);
				 _localctx.vect = instructions.NewArregloDeclaracionId((((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getLine():0) ,(((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((VectorcontrolContext)_localctx).prin!=null?((VectorcontrolContext)_localctx).prin.getText():null) , ((VectorcontrolContext)_localctx).tipodato.tipo, (((VectorcontrolContext)_localctx).secu!=null?((VectorcontrolContext)_localctx).secu.getText():null))
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
		enterRule(_localctx, 42, RULE_blockparams);

		    _localctx.blkpar = []interface{}{}
		    var listInt []IBloqueparamsContext

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(568);
				((BlockparamsContext)_localctx).bloqueparams = bloqueparams();
				((BlockparamsContext)_localctx).blopas.add(((BlockparamsContext)_localctx).bloqueparams);
				}
				}
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FLOAT) | (1L << STRING) | (1L << TRU) | (1L << FAL) | (1L << NULO) | (1L << NUMBER) | (1L << CADENA) | (1L << ID_VALIDO) | (1L << CHARACTER) | (1L << PARIZQ) | (1L << NOT) | (1L << SUB))) != 0) || _la==COMA );

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
		enterRule(_localctx, 44, RULE_bloqueparams);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				((BloqueparamsContext)_localctx).COMA = match(COMA);
				setState(576);
				((BloqueparamsContext)_localctx).expr = expr(0);

				    _localctx.blopas = instructions.NewArregloParametros((((BloqueparamsContext)_localctx).COMA!=null?((BloqueparamsContext)_localctx).COMA.getLine():0) ,(((BloqueparamsContext)_localctx).COMA!=null?((BloqueparamsContext)_localctx).COMA.getCharPositionInLine():0), ((BloqueparamsContext)_localctx).expr.e)

				}
				break;
			case T__0:
			case FLOAT:
			case STRING:
			case TRU:
			case FAL:
			case NULO:
			case NUMBER:
			case CADENA:
			case ID_VALIDO:
			case CHARACTER:
			case PARIZQ:
			case NOT:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				((BloqueparamsContext)_localctx).expr = expr(0);

				    _localctx.blopas = instructions.NewArregloParametro(((BloqueparamsContext)_localctx).expr.e)

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

	public static class VectoragregarContext extends ParserRuleContext {
		public interfaces.Instruction veadct;
		public Token ID_VALIDO;
		public ExprContext expr;
		public Token prin;
		public ExprContext pop;
		public Token secu;
		public ExprContext sop;
		public ExprContext op1;
		public ExprContext op2;
		public ListamatrizaddsubsContext listamatrizaddsubs;
		public ExprContext op3;
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
		public ListamatrizaddsubsContext listamatrizaddsubs() {
			return getRuleContext(ListamatrizaddsubsContext.class,0);
		}
		public VectoragregarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectoragregar; }
	}

	public final VectoragregarContext vectoragregar() throws RecognitionException {
		VectoragregarContext _localctx = new VectoragregarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vectoragregar);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((VectoragregarContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(585);
				match(PUNTO);
				setState(586);
				match(APPEND);
				setState(587);
				match(PARIZQ);
				setState(588);
				((VectoragregarContext)_localctx).expr = expr(0);
				setState(589);
				match(PARDER);
				 _localctx.veadct = instructions.NewArregloAppend((((VectoragregarContext)_localctx).ID_VALIDO!=null?((VectoragregarContext)_localctx).ID_VALIDO.getText():null) , ((VectoragregarContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((VectoragregarContext)_localctx).prin = match(ID_VALIDO);
				setState(593);
				match(CORCHIZQ);
				setState(594);
				((VectoragregarContext)_localctx).pop = expr(0);
				setState(595);
				match(CORCHDER);
				setState(596);
				match(IG);
				setState(597);
				((VectoragregarContext)_localctx).secu = match(ID_VALIDO);
				setState(598);
				match(CORCHIZQ);
				setState(599);
				((VectoragregarContext)_localctx).sop = expr(0);
				setState(600);
				match(CORCHDER);
				 _localctx.veadct = instructions.NewArregloAppendArreglo((((VectoragregarContext)_localctx).prin!=null?((VectoragregarContext)_localctx).prin.getText():null) , ((VectoragregarContext)_localctx).pop.e, (((VectoragregarContext)_localctx).secu!=null?((VectoragregarContext)_localctx).secu.getText():null), ((VectoragregarContext)_localctx).sop.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				((VectoragregarContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(604);
				match(CORCHIZQ);
				setState(605);
				((VectoragregarContext)_localctx).op1 = expr(0);
				setState(606);
				match(CORCHDER);
				setState(607);
				match(CORCHIZQ);
				setState(608);
				((VectoragregarContext)_localctx).op2 = expr(0);
				setState(609);
				match(CORCHDER);
				setState(610);
				((VectoragregarContext)_localctx).listamatrizaddsubs = listamatrizaddsubs();
				setState(611);
				match(IG);
				setState(612);
				((VectoragregarContext)_localctx).op3 = expr(0);
				 _localctx.veadct = instructions.NewMatrizAsignacionList((((VectoragregarContext)_localctx).ID_VALIDO!=null?((VectoragregarContext)_localctx).ID_VALIDO.getText():null), ((VectoragregarContext)_localctx).op1.e, ((VectoragregarContext)_localctx).op2.e, ((VectoragregarContext)_localctx).listamatrizaddsubs.blklimatas, ((VectoragregarContext)_localctx).op3.e) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				((VectoragregarContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(616);
				match(CORCHIZQ);
				setState(617);
				((VectoragregarContext)_localctx).op1 = expr(0);
				setState(618);
				match(CORCHDER);
				setState(619);
				match(CORCHIZQ);
				setState(620);
				((VectoragregarContext)_localctx).op2 = expr(0);
				setState(621);
				match(CORCHDER);
				setState(622);
				match(IG);
				setState(623);
				((VectoragregarContext)_localctx).op3 = expr(0);
				 _localctx.veadct = instructions.NewMatrizAsignacion((((VectoragregarContext)_localctx).ID_VALIDO!=null?((VectoragregarContext)_localctx).ID_VALIDO.getText():null), ((VectoragregarContext)_localctx).op1.e, ((VectoragregarContext)_localctx).op2.e, ((VectoragregarContext)_localctx).op3.e) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(626);
				((VectoragregarContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(627);
				match(CORCHIZQ);
				setState(628);
				((VectoragregarContext)_localctx).pop = expr(0);
				setState(629);
				match(CORCHDER);
				setState(630);
				match(IG);
				setState(631);
				((VectoragregarContext)_localctx).sop = expr(0);
				 _localctx.veadct = instructions.NewArregloAppendExp((((VectoragregarContext)_localctx).ID_VALIDO!=null?((VectoragregarContext)_localctx).ID_VALIDO.getText():null) , ((VectoragregarContext)_localctx).pop.e, ((VectoragregarContext)_localctx).sop.e)
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
		public interfaces.Instruction vermct;
		public Token ID_VALIDO;
		public Token PUNTO;
		public ExprContext expr;
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
		enterRule(_localctx, 48, RULE_vectorremover);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				((VectorremoverContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(637);
				((VectorremoverContext)_localctx).PUNTO = match(PUNTO);
				setState(638);
				match(REMOVELAST);
				setState(639);
				match(PARIZQ);
				setState(640);
				match(PARDER);
				 _localctx.vermct = instructions.NewArregloRemoveLast((((VectorremoverContext)_localctx).PUNTO!=null?((VectorremoverContext)_localctx).PUNTO.getLine():0), (((VectorremoverContext)_localctx).PUNTO!=null?((VectorremoverContext)_localctx).PUNTO.getCharPositionInLine():0), (((VectorremoverContext)_localctx).ID_VALIDO!=null?((VectorremoverContext)_localctx).ID_VALIDO.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				((VectorremoverContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(643);
				((VectorremoverContext)_localctx).PUNTO = match(PUNTO);
				setState(644);
				match(REMOVE);
				setState(645);
				match(PARIZQ);
				setState(646);
				match(AT);
				setState(647);
				match(DOS_PUNTOS);
				setState(648);
				((VectorremoverContext)_localctx).expr = expr(0);
				setState(649);
				match(PARDER);
				 _localctx.vermct = instructions.NewArregloRemovePos((((VectorremoverContext)_localctx).PUNTO!=null?((VectorremoverContext)_localctx).PUNTO.getLine():0), (((VectorremoverContext)_localctx).PUNTO!=null?((VectorremoverContext)_localctx).PUNTO.getCharPositionInLine():0), (((VectorremoverContext)_localctx).ID_VALIDO!=null?((VectorremoverContext)_localctx).ID_VALIDO.getText():null), ((VectorremoverContext)_localctx).expr.e)
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
		public interfaces.Expression veemct;
		public Token ID_VALIDO;
		public Token PUNTO;
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
		enterRule(_localctx, 50, RULE_vectorvacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			((VectorvacioContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(655);
			((VectorvacioContext)_localctx).PUNTO = match(PUNTO);
			setState(656);
			match(ISEMPTY);
			 _localctx.veemct = instructions.NewArregloIsEmpty((((VectorvacioContext)_localctx).PUNTO!=null?((VectorvacioContext)_localctx).PUNTO.getLine():0), (((VectorvacioContext)_localctx).PUNTO!=null?((VectorvacioContext)_localctx).PUNTO.getCharPositionInLine():0), (((VectorvacioContext)_localctx).ID_VALIDO!=null?((VectorvacioContext)_localctx).ID_VALIDO.getText():null))
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
		public interfaces.Expression vecnct;
		public Token ID_VALIDO;
		public Token PUNTO;
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
		enterRule(_localctx, 52, RULE_vectorcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			((VectorcountContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(660);
			((VectorcountContext)_localctx).PUNTO = match(PUNTO);
			setState(661);
			match(COUNT);
			 _localctx.vecnct = instructions.NewArregloCount((((VectorcountContext)_localctx).PUNTO!=null?((VectorcountContext)_localctx).PUNTO.getLine():0), (((VectorcountContext)_localctx).PUNTO!=null?((VectorcountContext)_localctx).PUNTO.getCharPositionInLine():0), (((VectorcountContext)_localctx).ID_VALIDO!=null?((VectorcountContext)_localctx).ID_VALIDO.getText():null))
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
		public interfaces.Expression vepposct;
		public Token ID_VALIDO;
		public ExprContext op1;
		public ExprContext op2;
		public ListamatrizaddsubsContext listamatrizaddsubs;
		public ExprContext expr;
		public Token CORCHDER;
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public List<TerminalNode> CORCHIZQ() { return getTokens(SwiftGrammarParser.CORCHIZQ); }
		public TerminalNode CORCHIZQ(int i) {
			return getToken(SwiftGrammarParser.CORCHIZQ, i);
		}
		public List<TerminalNode> CORCHDER() { return getTokens(SwiftGrammarParser.CORCHDER); }
		public TerminalNode CORCHDER(int i) {
			return getToken(SwiftGrammarParser.CORCHDER, i);
		}
		public ListamatrizaddsubsContext listamatrizaddsubs() {
			return getRuleContext(ListamatrizaddsubsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VectoraccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectoraccess; }
	}

	public final VectoraccessContext vectoraccess() throws RecognitionException {
		VectoraccessContext _localctx = new VectoraccessContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_vectoraccess);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				((VectoraccessContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(665);
				match(CORCHIZQ);
				setState(666);
				((VectoraccessContext)_localctx).op1 = expr(0);
				setState(667);
				match(CORCHDER);
				setState(668);
				match(CORCHIZQ);
				setState(669);
				((VectoraccessContext)_localctx).op2 = expr(0);
				setState(670);
				match(CORCHDER);
				setState(671);
				((VectoraccessContext)_localctx).listamatrizaddsubs = listamatrizaddsubs();
				 _localctx.vepposct = instructions.NewMatrizObtencionList((((VectoraccessContext)_localctx).ID_VALIDO!=null?((VectoraccessContext)_localctx).ID_VALIDO.getText():null), ((VectoraccessContext)_localctx).op1.e, ((VectoraccessContext)_localctx).op2.e, ((VectoraccessContext)_localctx).listamatrizaddsubs.blklimatas) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				((VectoraccessContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(675);
				match(CORCHIZQ);
				setState(676);
				((VectoraccessContext)_localctx).op1 = expr(0);
				setState(677);
				match(CORCHDER);
				setState(678);
				match(CORCHIZQ);
				setState(679);
				((VectoraccessContext)_localctx).op2 = expr(0);
				setState(680);
				match(CORCHDER);
				 _localctx.vepposct = instructions.NewMatrizObtencion((((VectoraccessContext)_localctx).ID_VALIDO!=null?((VectoraccessContext)_localctx).ID_VALIDO.getText():null), ((VectoraccessContext)_localctx).op1.e, ((VectoraccessContext)_localctx).op2.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				((VectoraccessContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(684);
				match(CORCHIZQ);
				setState(685);
				((VectoraccessContext)_localctx).expr = expr(0);
				setState(686);
				((VectoraccessContext)_localctx).CORCHDER = match(CORCHDER);
				 _localctx.vepposct = instructions.NewArregloAccess((((VectoraccessContext)_localctx).CORCHDER!=null?((VectoraccessContext)_localctx).CORCHDER.getLine():0), (((VectoraccessContext)_localctx).CORCHDER!=null?((VectoraccessContext)_localctx).CORCHDER.getCharPositionInLine():0), (((VectoraccessContext)_localctx).ID_VALIDO!=null?((VectoraccessContext)_localctx).ID_VALIDO.getText():null), ((VectoraccessContext)_localctx).expr.e)
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

	public static class MatrizcontrolContext extends ParserRuleContext {
		public interfaces.Instruction matct;
		public Token VAR;
		public Token ID_VALIDO;
		public Token DOS_PUNTOS;
		public TipomatrizContext tipomatriz;
		public DefmatrizContext defmatriz;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public DefmatrizContext defmatriz() {
			return getRuleContext(DefmatrizContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipomatrizContext tipomatriz() {
			return getRuleContext(TipomatrizContext.class,0);
		}
		public MatrizcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrizcontrol; }
	}

	public final MatrizcontrolContext matrizcontrol() throws RecognitionException {
		MatrizcontrolContext _localctx = new MatrizcontrolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_matrizcontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			((MatrizcontrolContext)_localctx).VAR = match(VAR);
			setState(692);
			((MatrizcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(693);
				((MatrizcontrolContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(694);
				((MatrizcontrolContext)_localctx).tipomatriz = tipomatriz();
				}
			}

			setState(697);
			match(IG);
			setState(698);
			((MatrizcontrolContext)_localctx).defmatriz = defmatriz();

			    if (((MatrizcontrolContext)_localctx).DOS_PUNTOS != nil) {
			        _localctx.matct = instructions.NewMatrizDeclaracion((((MatrizcontrolContext)_localctx).VAR!=null?((MatrizcontrolContext)_localctx).VAR.getLine():0), (((MatrizcontrolContext)_localctx).VAR!=null?((MatrizcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((MatrizcontrolContext)_localctx).ID_VALIDO!=null?((MatrizcontrolContext)_localctx).ID_VALIDO.getText():null) ,((MatrizcontrolContext)_localctx).tipomatriz.tipomat, ((MatrizcontrolContext)_localctx).defmatriz.defmat)
			    } else {
			        _localctx.matct = instructions.NewMatrizDeclaracionSinTipo((((MatrizcontrolContext)_localctx).VAR!=null?((MatrizcontrolContext)_localctx).VAR.getLine():0), (((MatrizcontrolContext)_localctx).VAR!=null?((MatrizcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((MatrizcontrolContext)_localctx).ID_VALIDO!=null?((MatrizcontrolContext)_localctx).ID_VALIDO.getText():null) , ((MatrizcontrolContext)_localctx).defmatriz.defmat)
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

	public static class TipomatrizContext extends ParserRuleContext {
		public interfaces.Expression tipomat;
		public Token CORCHIZQ;
		public TipomatrizContext tipomatriz;
		public TipodatoContext tipodato;
		public TerminalNode CORCHIZQ() { return getToken(SwiftGrammarParser.CORCHIZQ, 0); }
		public TipomatrizContext tipomatriz() {
			return getRuleContext(TipomatrizContext.class,0);
		}
		public TerminalNode CORCHDER() { return getToken(SwiftGrammarParser.CORCHDER, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TipomatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipomatriz; }
	}

	public final TipomatrizContext tipomatriz() throws RecognitionException {
		TipomatrizContext _localctx = new TipomatrizContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipomatriz);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				((TipomatrizContext)_localctx).CORCHIZQ = match(CORCHIZQ);
				setState(702);
				((TipomatrizContext)_localctx).tipomatriz = tipomatriz();
				setState(703);
				match(CORCHDER);
				 
				    _localctx.tipomat = instructions.NewMatrizDimension((((TipomatrizContext)_localctx).CORCHIZQ!=null?((TipomatrizContext)_localctx).CORCHIZQ.getLine():0), (((TipomatrizContext)_localctx).CORCHIZQ!=null?((TipomatrizContext)_localctx).CORCHIZQ.getCharPositionInLine():0), ((TipomatrizContext)_localctx).tipomatriz.tipomat)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				((TipomatrizContext)_localctx).CORCHIZQ = match(CORCHIZQ);
				setState(707);
				((TipomatrizContext)_localctx).tipodato = tipodato();
				setState(708);
				match(CORCHDER);
				 
				    _localctx.tipomat = instructions.NewMatrizTipo((((TipomatrizContext)_localctx).CORCHIZQ!=null?((TipomatrizContext)_localctx).CORCHIZQ.getLine():0), (((TipomatrizContext)_localctx).CORCHIZQ!=null?((TipomatrizContext)_localctx).CORCHIZQ.getCharPositionInLine():0), ((TipomatrizContext)_localctx).tipodato.tipo)

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

	public static class DefmatrizContext extends ParserRuleContext {
		public interfaces.Instruction defmat;
		public ListavaloresmatContext listavaloresmat;
		public ListavaloresmatContext listavaloresmat() {
			return getRuleContext(ListavaloresmatContext.class,0);
		}
		public DefmatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defmatriz; }
	}

	public final DefmatrizContext defmatriz() throws RecognitionException {
		DefmatrizContext _localctx = new DefmatrizContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defmatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			((DefmatrizContext)_localctx).listavaloresmat = listavaloresmat();
			 _localctx.defmat = ((DefmatrizContext)_localctx).listavaloresmat.listvlamat
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

	public static class ListavaloresmatContext extends ParserRuleContext {
		public interfaces.Instruction listvlamat;
		public Listavaloresmat2Context listavaloresmat2;
		public SimplematrizContext simplematriz;
		public TerminalNode CORCHIZQ() { return getToken(SwiftGrammarParser.CORCHIZQ, 0); }
		public Listavaloresmat2Context listavaloresmat2() {
			return getRuleContext(Listavaloresmat2Context.class,0);
		}
		public TerminalNode CORCHDER() { return getToken(SwiftGrammarParser.CORCHDER, 0); }
		public SimplematrizContext simplematriz() {
			return getRuleContext(SimplematrizContext.class,0);
		}
		public ListavaloresmatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavaloresmat; }
	}

	public final ListavaloresmatContext listavaloresmat() throws RecognitionException {
		ListavaloresmatContext _localctx = new ListavaloresmatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_listavaloresmat);
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(CORCHIZQ);
				setState(717);
				((ListavaloresmatContext)_localctx).listavaloresmat2 = listavaloresmat2(0);
				setState(718);
				match(CORCHDER);
				 _localctx.listvlamat = ((ListavaloresmatContext)_localctx).listavaloresmat2.mylisttmatt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				((ListavaloresmatContext)_localctx).simplematriz = simplematriz();
				 _localctx.listvlamat = ((ListavaloresmatContext)_localctx).simplematriz.simmat
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

	public static class Listavaloresmat2Context extends ParserRuleContext {
		public interfaces.Instruction mylisttmatt;
		public Listavaloresmat2Context op;
		public ListavaloresmatContext listavaloresmat;
		public ListaexpresionsContext listaexpresions;
		public ListavaloresmatContext listavaloresmat() {
			return getRuleContext(ListavaloresmatContext.class,0);
		}
		public ListaexpresionsContext listaexpresions() {
			return getRuleContext(ListaexpresionsContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public Listavaloresmat2Context listavaloresmat2() {
			return getRuleContext(Listavaloresmat2Context.class,0);
		}
		public Listavaloresmat2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavaloresmat2; }
	}

	public final Listavaloresmat2Context listavaloresmat2() throws RecognitionException {
		return listavaloresmat2(0);
	}

	private Listavaloresmat2Context listavaloresmat2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Listavaloresmat2Context _localctx = new Listavaloresmat2Context(_ctx, _parentState);
		Listavaloresmat2Context _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_listavaloresmat2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORCHIZQ:
				{
				setState(727);
				((Listavaloresmat2Context)_localctx).listavaloresmat = listavaloresmat();
				 _localctx.mylisttmatt = instructions.NewMatrizListaNivel(((Listavaloresmat2Context)_localctx).listavaloresmat.listvlamat)
				}
				break;
			case T__0:
			case FLOAT:
			case STRING:
			case TRU:
			case FAL:
			case NULO:
			case NUMBER:
			case CADENA:
			case ID_VALIDO:
			case CHARACTER:
			case PARIZQ:
			case NOT:
			case SUB:
			case COMA:
				{
				setState(730);
				((Listavaloresmat2Context)_localctx).listaexpresions = listaexpresions();
				 _localctx.mylisttmatt = instructions.NewMatrizListaExpresion(((Listavaloresmat2Context)_localctx).listaexpresions.blkparf)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Listavaloresmat2Context(_parentctx, _parentState);
					_localctx.op = _prevctx;
					_localctx.op = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listavaloresmat2);
					setState(735);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(736);
					match(COMA);
					setState(737);
					((Listavaloresmat2Context)_localctx).listavaloresmat = listavaloresmat();
					 _localctx.mylisttmatt = instructions.NewMatrizListaExpresionList(((Listavaloresmat2Context)_localctx).op.mylisttmatt, ((Listavaloresmat2Context)_localctx).listavaloresmat.listvlamat)
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class ListaexpresionsContext extends ParserRuleContext {
		public []interface{} blkparf;
		public ListaexpresionContext listaexpresion;
		public List<ListaexpresionContext> funpar = new ArrayList<ListaexpresionContext>();
		public List<ListaexpresionContext> listaexpresion() {
			return getRuleContexts(ListaexpresionContext.class);
		}
		public ListaexpresionContext listaexpresion(int i) {
			return getRuleContext(ListaexpresionContext.class,i);
		}
		public ListaexpresionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexpresions; }
	}

	public final ListaexpresionsContext listaexpresions() throws RecognitionException {
		ListaexpresionsContext _localctx = new ListaexpresionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listaexpresions);

		    _localctx.blkparf = []interface{}{}
		    var listInt []IListaexpresionContext

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(745);
					((ListaexpresionsContext)_localctx).listaexpresion = listaexpresion();
					((ListaexpresionsContext)_localctx).funpar.add(((ListaexpresionsContext)_localctx).listaexpresion);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(748); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			    listInt = localctx.(*ListaexpresionsContext).GetFunpar()
			    for _, e := range listInt {
			        _localctx.blkparf = append(_localctx.blkparf, e.GetFunpar())
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

	public static class ListaexpresionContext extends ParserRuleContext {
		public interfaces.Expression funpar;
		public Token COMA;
		public ExprContext expr;
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListaexpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexpresion; }
	}

	public final ListaexpresionContext listaexpresion() throws RecognitionException {
		ListaexpresionContext _localctx = new ListaexpresionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listaexpresion);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				((ListaexpresionContext)_localctx).COMA = match(COMA);
				setState(753);
				((ListaexpresionContext)_localctx).expr = expr(0);

				    _localctx.funpar = instructions.NewArregloParametros((((ListaexpresionContext)_localctx).COMA!=null?((ListaexpresionContext)_localctx).COMA.getLine():0) ,(((ListaexpresionContext)_localctx).COMA!=null?((ListaexpresionContext)_localctx).COMA.getCharPositionInLine():0), ((ListaexpresionContext)_localctx).expr.e)

				}
				break;
			case T__0:
			case FLOAT:
			case STRING:
			case TRU:
			case FAL:
			case NULO:
			case NUMBER:
			case CADENA:
			case ID_VALIDO:
			case CHARACTER:
			case PARIZQ:
			case NOT:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				((ListaexpresionContext)_localctx).expr = expr(0);

				    _localctx.funpar = instructions.NewArregloParametro(((ListaexpresionContext)_localctx).expr.e)

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

	public static class SimplematrizContext extends ParserRuleContext {
		public interfaces.Instruction simmat;
		public TipomatrizContext tipomatriz;
		public SimplematrizContext op;
		public Token NUMBER;
		public ExprContext expr;
		public TipomatrizContext tipomatriz() {
			return getRuleContext(TipomatrizContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode REPEATING() { return getToken(SwiftGrammarParser.REPEATING, 0); }
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(SwiftGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(SwiftGrammarParser.DOS_PUNTOS, i);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public TerminalNode COUNT() { return getToken(SwiftGrammarParser.COUNT, 0); }
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public SimplematrizContext simplematriz() {
			return getRuleContext(SimplematrizContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimplematrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplematriz; }
	}

	public final SimplematrizContext simplematriz() throws RecognitionException {
		SimplematrizContext _localctx = new SimplematrizContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simplematriz);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				((SimplematrizContext)_localctx).tipomatriz = tipomatriz();
				setState(762);
				match(PARIZQ);
				setState(763);
				match(REPEATING);
				setState(764);
				match(DOS_PUNTOS);
				setState(765);
				((SimplematrizContext)_localctx).op = simplematriz();
				setState(766);
				match(COMA);
				setState(767);
				match(COUNT);
				setState(768);
				match(DOS_PUNTOS);
				setState(769);
				((SimplematrizContext)_localctx).NUMBER = match(NUMBER);
				setState(770);
				match(PARDER);
				 _localctx.simmat = instructions.NewMatrizSimpleUno(((SimplematrizContext)_localctx).tipomatriz.tipomat, ((SimplematrizContext)_localctx).op.simmat, (((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getText():null), (((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getLine():0),(((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getCharPositionInLine():0))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				((SimplematrizContext)_localctx).tipomatriz = tipomatriz();
				setState(774);
				match(PARIZQ);
				setState(775);
				match(REPEATING);
				setState(776);
				match(DOS_PUNTOS);
				setState(777);
				((SimplematrizContext)_localctx).expr = expr(0);
				setState(778);
				match(COMA);
				setState(779);
				match(COUNT);
				setState(780);
				match(DOS_PUNTOS);
				setState(781);
				((SimplematrizContext)_localctx).NUMBER = match(NUMBER);
				setState(782);
				match(PARDER);
				 _localctx.simmat = instructions.NewMatrizSimpleDos(((SimplematrizContext)_localctx).tipomatriz.tipomat, ((SimplematrizContext)_localctx).expr.e, (((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getText():null), (((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getLine():0),(((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getCharPositionInLine():0))
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

	public static class ListamatrizaddsubsContext extends ParserRuleContext {
		public []interface{} blklimatas;
		public ListamatrizaddsubContext listamatrizaddsub;
		public List<ListamatrizaddsubContext> lmas = new ArrayList<ListamatrizaddsubContext>();
		public List<ListamatrizaddsubContext> listamatrizaddsub() {
			return getRuleContexts(ListamatrizaddsubContext.class);
		}
		public ListamatrizaddsubContext listamatrizaddsub(int i) {
			return getRuleContext(ListamatrizaddsubContext.class,i);
		}
		public ListamatrizaddsubsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listamatrizaddsubs; }
	}

	public final ListamatrizaddsubsContext listamatrizaddsubs() throws RecognitionException {
		ListamatrizaddsubsContext _localctx = new ListamatrizaddsubsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listamatrizaddsubs);

		    _localctx.blklimatas = []interface{}{}
		    var listInt []IListamatrizaddsubContext

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(787);
					((ListamatrizaddsubsContext)_localctx).listamatrizaddsub = listamatrizaddsub();
					((ListamatrizaddsubsContext)_localctx).lmas.add(((ListamatrizaddsubsContext)_localctx).listamatrizaddsub);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(790); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			    listInt = localctx.(*ListamatrizaddsubsContext).GetLmas()
			    for _, e := range listInt {
			        _localctx.blklimatas = append(_localctx.blklimatas, e.GetLmas())
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

	public static class ListamatrizaddsubContext extends ParserRuleContext {
		public interfaces.Expression lmas;
		public Token CORCHIZQ;
		public ExprContext expr;
		public TerminalNode CORCHIZQ() { return getToken(SwiftGrammarParser.CORCHIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORCHDER() { return getToken(SwiftGrammarParser.CORCHDER, 0); }
		public ListamatrizaddsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listamatrizaddsub; }
	}

	public final ListamatrizaddsubContext listamatrizaddsub() throws RecognitionException {
		ListamatrizaddsubContext _localctx = new ListamatrizaddsubContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listamatrizaddsub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			((ListamatrizaddsubContext)_localctx).CORCHIZQ = match(CORCHIZQ);
			setState(795);
			((ListamatrizaddsubContext)_localctx).expr = expr(0);
			setState(796);
			match(CORCHDER);

			    _localctx.lmas = instructions.NewArregloParametros((((ListamatrizaddsubContext)_localctx).CORCHIZQ!=null?((ListamatrizaddsubContext)_localctx).CORCHIZQ.getLine():0) ,(((ListamatrizaddsubContext)_localctx).CORCHIZQ!=null?((ListamatrizaddsubContext)_localctx).CORCHIZQ.getCharPositionInLine():0), ((ListamatrizaddsubContext)_localctx).expr.e)

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

	public static class StructcontrolContext extends ParserRuleContext {
		public interfaces.Instruction struck;
		public Token STRUCT;
		public Token ID_VALIDO;
		public ListaatributosContext listaatributos;
		public TerminalNode STRUCT() { return getToken(SwiftGrammarParser.STRUCT, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListaatributosContext listaatributos() {
			return getRuleContext(ListaatributosContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public StructcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structcontrol; }
	}

	public final StructcontrolContext structcontrol() throws RecognitionException {
		StructcontrolContext _localctx = new StructcontrolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structcontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			((StructcontrolContext)_localctx).STRUCT = match(STRUCT);
			setState(800);
			((StructcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(801);
			match(LLAVEIZQ);
			setState(802);
			((StructcontrolContext)_localctx).listaatributos = listaatributos();
			setState(803);
			match(LLAVEDER);

			    ((StructcontrolContext)_localctx).struck =  instructions.NewStruck((((StructcontrolContext)_localctx).STRUCT!=null?((StructcontrolContext)_localctx).STRUCT.getLine():0), (((StructcontrolContext)_localctx).STRUCT!=null?((StructcontrolContext)_localctx).STRUCT.getCharPositionInLine():0), (((StructcontrolContext)_localctx).ID_VALIDO!=null?((StructcontrolContext)_localctx).ID_VALIDO.getText():null), ((StructcontrolContext)_localctx).listaatributos.blkstlt);

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

	public static class ListaatributosContext extends ParserRuleContext {
		public []interface{} blkstlt;
		public ListaatributoContext listaatributo;
		public List<ListaatributoContext> listatstr = new ArrayList<ListaatributoContext>();
		public List<ListaatributoContext> listaatributo() {
			return getRuleContexts(ListaatributoContext.class);
		}
		public ListaatributoContext listaatributo(int i) {
			return getRuleContext(ListaatributoContext.class,i);
		}
		public ListaatributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaatributos; }
	}

	public final ListaatributosContext listaatributos() throws RecognitionException {
		ListaatributosContext _localctx = new ListaatributosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listaatributos);

		    _localctx.blkstlt = []interface{}{}
		    var listInt []IListaatributoContext

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(806);
				((ListaatributosContext)_localctx).listaatributo = listaatributo();
				((ListaatributosContext)_localctx).listatstr.add(((ListaatributosContext)_localctx).listaatributo);
				}
				}
				setState(809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << FUNCION) | (1L << MUTATING))) != 0) );

			    listInt = localctx.(*ListaatributosContext).GetListatstr()
			    for _, e := range listInt {
			        _localctx.blkstlt = append(_localctx.blkstlt, e.GetListatstr())
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

	public static class ListaatributoContext extends ParserRuleContext {
		public interfaces.Instruction listatstr;
		public Token tip1;
		public Token tip4;
		public TipodatoContext tip2;
		public Token tip3;
		public Token IG;
		public ExprContext expr;
		public Token tipo;
		public Token ID_VALIDO;
		public Token MUTATING;
		public FunciondeclaracioncontrolContext funciondeclaracioncontrol;
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public FunciondeclaracioncontrolContext funciondeclaracioncontrol() {
			return getRuleContext(FunciondeclaracioncontrolContext.class,0);
		}
		public TerminalNode MUTATING() { return getToken(SwiftGrammarParser.MUTATING, 0); }
		public ListaatributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaatributo; }
	}

	public final ListaatributoContext listaatributo() throws RecognitionException {
		ListaatributoContext _localctx = new ListaatributoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_listaatributo);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				((ListaatributoContext)_localctx).tip1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==LET) ) {
					((ListaatributoContext)_localctx).tip1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(814);
				((ListaatributoContext)_localctx).tip4 = match(ID_VALIDO);
				setState(815);
				match(DOS_PUNTOS);
				setState(818);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case FLOAT:
				case STRING:
				case BOOL:
				case CHARACT:
					{
					setState(816);
					((ListaatributoContext)_localctx).tip2 = tipodato();
					}
					break;
				case ID_VALIDO:
					{
					setState(817);
					((ListaatributoContext)_localctx).tip3 = match(ID_VALIDO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IG) {
					{
					setState(820);
					((ListaatributoContext)_localctx).IG = match(IG);
					setState(821);
					((ListaatributoContext)_localctx).expr = expr(0);
					}
				}

				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(824);
					match(PUNTOCOMA);
					}
				}


				    if ((ListaatributoContext)_localctx).IG != nil{
				        if (((ListaatributoContext)_localctx).tip3!=null?((ListaatributoContext)_localctx).tip3.getText():null) != "" {
				            _localctx.listatstr = instructions.NewStructAtributosConTE2((((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getCharPositionInLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getText():null), (((ListaatributoContext)_localctx).tip4!=null?((ListaatributoContext)_localctx).tip4.getText():null), (((ListaatributoContext)_localctx).tip3!=null?((ListaatributoContext)_localctx).tip3.getText():null), ((ListaatributoContext)_localctx).expr.e)
				        }else{                        
				            _localctx.listatstr = instructions.NewStructAtributosConTE((((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getCharPositionInLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getText():null), (((ListaatributoContext)_localctx).tip4!=null?((ListaatributoContext)_localctx).tip4.getText():null), ((ListaatributoContext)_localctx).tip2.tipo, ((ListaatributoContext)_localctx).expr.e)
				        }        
				    }else{ 
				        if (((ListaatributoContext)_localctx).tip3!=null?((ListaatributoContext)_localctx).tip3.getText():null) != "" {                        
				            _localctx.listatstr = instructions.NewStructAtributosConT2((((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getCharPositionInLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getText():null), (((ListaatributoContext)_localctx).tip4!=null?((ListaatributoContext)_localctx).tip4.getText():null), (((ListaatributoContext)_localctx).tip3!=null?((ListaatributoContext)_localctx).tip3.getText():null)) 
				        }else{            
				            _localctx.listatstr = instructions.NewStructAtributosConT((((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getCharPositionInLine():0), (((ListaatributoContext)_localctx).tip1!=null?((ListaatributoContext)_localctx).tip1.getText():null), (((ListaatributoContext)_localctx).tip4!=null?((ListaatributoContext)_localctx).tip4.getText():null), ((ListaatributoContext)_localctx).tip2.tipo) 
				        }
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				((ListaatributoContext)_localctx).tipo = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==LET) ) {
					((ListaatributoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(829);
				((ListaatributoContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IG) {
					{
					setState(830);
					((ListaatributoContext)_localctx).IG = match(IG);
					setState(831);
					((ListaatributoContext)_localctx).expr = expr(0);
					}
				}

				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(834);
					match(PUNTOCOMA);
					}
				}


				    if ((ListaatributoContext)_localctx).IG != nil{
				        _localctx.listatstr = instructions.NewStructAtributosConE((((ListaatributoContext)_localctx).tipo!=null?((ListaatributoContext)_localctx).tipo.getLine():0), (((ListaatributoContext)_localctx).tipo!=null?((ListaatributoContext)_localctx).tipo.getCharPositionInLine():0), (((ListaatributoContext)_localctx).tipo!=null?((ListaatributoContext)_localctx).tipo.getText():null), (((ListaatributoContext)_localctx).ID_VALIDO!=null?((ListaatributoContext)_localctx).ID_VALIDO.getText():null), ((ListaatributoContext)_localctx).expr.e)
				    }else{
				        _localctx.listatstr = instructions.NewStructAtributos((((ListaatributoContext)_localctx).tipo!=null?((ListaatributoContext)_localctx).tipo.getLine():0), (((ListaatributoContext)_localctx).tipo!=null?((ListaatributoContext)_localctx).tipo.getCharPositionInLine():0), (((ListaatributoContext)_localctx).tipo!=null?((ListaatributoContext)_localctx).tipo.getText():null), (((ListaatributoContext)_localctx).ID_VALIDO!=null?((ListaatributoContext)_localctx).ID_VALIDO.getText():null))
				    }

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTATING) {
					{
					setState(838);
					((ListaatributoContext)_localctx).MUTATING = match(MUTATING);
					}
				}

				setState(841);
				((ListaatributoContext)_localctx).funciondeclaracioncontrol = funciondeclaracioncontrol();

				    if ((ListaatributoContext)_localctx).MUTATING != nil{
				        //_localctx.listatstr = instructions.NewStruckMutatingFunction(((ListaatributoContext)_localctx).funciondeclaracioncontrol.fdc)
				    } else {
				        //_localctx.listatstr = instructions.NewStruckFunction(((ListaatributoContext)_localctx).funciondeclaracioncontrol.fdc)
				    }

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

	public static class StructexprContext extends ParserRuleContext {
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public L_duplaContext l_dupla() {
			return getRuleContext(L_duplaContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structexpr; }
	}

	public final StructexprContext structexpr() throws RecognitionException {
		StructexprContext _localctx = new StructexprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structexpr);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(847);
				match(ID_VALIDO);
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(848);
					match(DOS_PUNTOS);
					setState(849);
					match(ID_VALIDO);
					}
				}

				setState(852);
				match(IG);
				setState(853);
				match(ID_VALIDO);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_VALIDO) {
					{
					setState(854);
					l_dupla();
					}
				}


				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(859);
				match(ID_VALIDO);
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(860);
					match(DOS_PUNTOS);
					setState(861);
					match(ID_VALIDO);
					}
				}

				setState(864);
				match(IG);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_VALIDO) {
					{
					setState(865);
					match(ID_VALIDO);
					}
				}


				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(869);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(870);
				match(ID_VALIDO);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOS_PUNTOS) {
					{
					setState(871);
					match(DOS_PUNTOS);
					setState(872);
					match(ID_VALIDO);
					}
				}

				setState(875);
				match(IG);
				setState(876);
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

	public static class L_duplaContext extends ParserRuleContext {
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(SwiftGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(SwiftGrammarParser.DOS_PUNTOS, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public L_duplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_dupla; }
	}

	public final L_duplaContext l_dupla() throws RecognitionException {
		L_duplaContext _localctx = new L_duplaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_l_dupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(881);
				match(ID_VALIDO);
				setState(882);
				match(DOS_PUNTOS);
				setState(883);
				expr(0);
				}
				}
				setState(886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_VALIDO );

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

	public static class LlamadastructContext extends ParserRuleContext {
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public LlamadastructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadastruct; }
	}

	public final LlamadastructContext llamadastruct() throws RecognitionException {
		LlamadastructContext _localctx = new LlamadastructContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_llamadastruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(ID_VALIDO);
			setState(891);
			match(PUNTO);
			setState(892);
			match(ID_VALIDO);

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

	public static class AsignacionparametrostructContext extends ParserRuleContext {
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionparametrostructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionparametrostruct; }
	}

	public final AsignacionparametrostructContext asignacionparametrostruct() throws RecognitionException {
		AsignacionparametrostructContext _localctx = new AsignacionparametrostructContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_asignacionparametrostruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(ID_VALIDO);
			setState(896);
			match(PUNTO);
			setState(897);
			match(ID_VALIDO);
			setState(898);
			match(IG);
			setState(899);
			expr(0);

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

	public static class LlamadafuncionstructContext extends ParserRuleContext {
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public LlamadafuncionstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadafuncionstruct; }
	}

	public final LlamadafuncionstructContext llamadafuncionstruct() throws RecognitionException {
		LlamadafuncionstructContext _localctx = new LlamadafuncionstructContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_llamadafuncionstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(ID_VALIDO);
			setState(903);
			match(PUNTO);
			setState(904);
			match(ID_VALIDO);
			setState(905);
			match(PARIZQ);
			setState(906);
			match(PARDER);

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

	public static class FunciondeclaracioncontrolContext extends ParserRuleContext {
		public interfaces.Instruction fdc;
		public Token ID_VALIDO;
		public ListaparametroContext listaparametro;
		public TipodatoContext tipodato;
		public BlockinternoContext blockinterno;
		public TerminalNode FUNCION() { return getToken(SwiftGrammarParser.FUNCION, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ListaparametroContext listaparametro() {
			return getRuleContext(ListaparametroContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode RETORNO() { return getToken(SwiftGrammarParser.RETORNO, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockinternoContext blockinterno() {
			return getRuleContext(BlockinternoContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public FunciondeclaracioncontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciondeclaracioncontrol; }
	}

	public final FunciondeclaracioncontrolContext funciondeclaracioncontrol() throws RecognitionException {
		FunciondeclaracioncontrolContext _localctx = new FunciondeclaracioncontrolContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_funciondeclaracioncontrol);
		try {
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(FUNCION);
				setState(910);
				((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(911);
				match(PARIZQ);
				setState(912);
				((FunciondeclaracioncontrolContext)_localctx).listaparametro = listaparametro();
				setState(913);
				match(PARDER);
				setState(914);
				match(RETORNO);
				setState(915);
				((FunciondeclaracioncontrolContext)_localctx).tipodato = tipodato();
				setState(916);
				match(LLAVEIZQ);
				setState(917);
				((FunciondeclaracioncontrolContext)_localctx).blockinterno = blockinterno();
				setState(918);
				match(LLAVEDER);

				    _localctx.fdc = instructions.NewFuncionesDeclaracionRP((((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getText():null), ((FunciondeclaracioncontrolContext)_localctx).listaparametro.listparfun, ((FunciondeclaracioncontrolContext)_localctx).tipodato.tipo, ((FunciondeclaracioncontrolContext)_localctx).blockinterno.blkint)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(FUNCION);
				setState(922);
				((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(923);
				match(PARIZQ);
				setState(924);
				match(PARDER);
				setState(925);
				match(RETORNO);
				setState(926);
				((FunciondeclaracioncontrolContext)_localctx).tipodato = tipodato();
				setState(927);
				match(LLAVEIZQ);
				setState(928);
				((FunciondeclaracioncontrolContext)_localctx).blockinterno = blockinterno();
				setState(929);
				match(LLAVEDER);

				    _localctx.fdc = instructions.NewFuncionesDeclaracionR((((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getText():null), ((FunciondeclaracioncontrolContext)_localctx).tipodato.tipo, ((FunciondeclaracioncontrolContext)_localctx).blockinterno.blkint)

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				match(FUNCION);
				setState(933);
				((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(934);
				match(PARIZQ);
				setState(935);
				((FunciondeclaracioncontrolContext)_localctx).listaparametro = listaparametro();
				setState(936);
				match(PARDER);
				setState(937);
				match(LLAVEIZQ);
				setState(938);
				((FunciondeclaracioncontrolContext)_localctx).blockinterno = blockinterno();
				setState(939);
				match(LLAVEDER);

				   _localctx.fdc = instructions.NewFuncionesDeclaracionP((((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getText():null), ((FunciondeclaracioncontrolContext)_localctx).listaparametro.listparfun, ((FunciondeclaracioncontrolContext)_localctx).blockinterno.blkint)

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(942);
				match(FUNCION);
				setState(943);
				((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(944);
				match(PARIZQ);
				setState(945);
				match(PARDER);
				setState(946);
				match(LLAVEIZQ);
				setState(947);
				((FunciondeclaracioncontrolContext)_localctx).blockinterno = blockinterno();
				setState(948);
				match(LLAVEDER);

				    _localctx.fdc = instructions.NewFuncionesDeclaracion((((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO!=null?((FunciondeclaracioncontrolContext)_localctx).ID_VALIDO.getText():null), ((FunciondeclaracioncontrolContext)_localctx).blockinterno.blkint)

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

	public static class ListaparametroContext extends ParserRuleContext {
		public interfaces.Instruction listparfun;
		public Token op;
		public Token op2;
		public Token INOUT;
		public TipodatoContext tipodato;
		public ListaparametroContext op3;
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public ListaparametroContext listaparametro() {
			return getRuleContext(ListaparametroContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(SwiftGrammarParser.INOUT, 0); }
		public TerminalNode GUIONBAJO() { return getToken(SwiftGrammarParser.GUIONBAJO, 0); }
		public ListaparametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaparametro; }
	}

	public final ListaparametroContext listaparametro() throws RecognitionException {
		ListaparametroContext _localctx = new ListaparametroContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_listaparametro);
		int _la;
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(953);
					((ListaparametroContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID_VALIDO || _la==GUIONBAJO) ) {
						((ListaparametroContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(956);
				((ListaparametroContext)_localctx).op2 = match(ID_VALIDO);
				setState(957);
				match(DOS_PUNTOS);
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(958);
					((ListaparametroContext)_localctx).INOUT = match(INOUT);
					}
				}

				setState(961);
				((ListaparametroContext)_localctx).tipodato = tipodato();
				setState(962);
				match(COMA);
				setState(963);
				((ListaparametroContext)_localctx).op3 = listaparametro();

				    if ((ListaparametroContext)_localctx).op != nil{
				        if ((ListaparametroContext)_localctx).INOUT != nil{
				            _localctx.listparfun = instructions.NewFuncionesListaParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), (((ListaparametroContext)_localctx).op!=null?((ListaparametroContext)_localctx).op.getText():null), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, true, true, ((ListaparametroContext)_localctx).op3.listparfun )
				        }else {
				            _localctx.listparfun = instructions.NewFuncionesListaParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), (((ListaparametroContext)_localctx).op!=null?((ListaparametroContext)_localctx).op.getText():null), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, false, true, ((ListaparametroContext)_localctx).op3.listparfun )
				        } 
				    }else{
				        if ((ListaparametroContext)_localctx).INOUT != nil{
				            _localctx.listparfun = instructions.NewFuncionesListaParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), "", (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, true, false, ((ListaparametroContext)_localctx).op3.listparfun )
				        }else {
				            _localctx.listparfun = instructions.NewFuncionesListaParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), "", (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, false, false,((ListaparametroContext)_localctx).op3.listparfun )
				        } 
				    }      

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(966);
					((ListaparametroContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID_VALIDO || _la==GUIONBAJO) ) {
						((ListaparametroContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(969);
				((ListaparametroContext)_localctx).op2 = match(ID_VALIDO);
				setState(970);
				match(DOS_PUNTOS);
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(971);
					((ListaparametroContext)_localctx).INOUT = match(INOUT);
					}
				}

				setState(974);
				((ListaparametroContext)_localctx).tipodato = tipodato();

				    if ((ListaparametroContext)_localctx).op != nil{
				        if ((ListaparametroContext)_localctx).INOUT != nil{
				            _localctx.listparfun = instructions.NewFuncionesParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), (((ListaparametroContext)_localctx).op!=null?((ListaparametroContext)_localctx).op.getText():null), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, true , true)
				        }else {
				            _localctx.listparfun = instructions.NewFuncionesParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), (((ListaparametroContext)_localctx).op!=null?((ListaparametroContext)_localctx).op.getText():null), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, false, true)
				        } 
				    }else{
				        if ((ListaparametroContext)_localctx).INOUT != nil{
				            _localctx.listparfun = instructions.NewFuncionesParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), "", (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, true, false)
				        }else {
				            _localctx.listparfun = instructions.NewFuncionesParametro((((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getLine():0), (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getCharPositionInLine():0), "", (((ListaparametroContext)_localctx).op2!=null?((ListaparametroContext)_localctx).op2.getText():null), ((ListaparametroContext)_localctx).tipodato.tipo, false, false)
				    } 
				    }
				    

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

	public static class FuncionllamadacontrolContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public List<TerminalNode> PARIZQ() { return getTokens(SwiftGrammarParser.PARIZQ); }
		public TerminalNode PARIZQ(int i) {
			return getToken(SwiftGrammarParser.PARIZQ, i);
		}
		public ListaparametrosllamadaContext listaparametrosllamada() {
			return getRuleContext(ListaparametrosllamadaContext.class,0);
		}
		public FuncionllamadacontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionllamadacontrol; }
	}

	public final FuncionllamadacontrolContext funcionllamadacontrol() throws RecognitionException {
		FuncionllamadacontrolContext _localctx = new FuncionllamadacontrolContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_funcionllamadacontrol);
		try {
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(ID_VALIDO);
				setState(980);
				match(PARIZQ);
				setState(981);
				listaparametrosllamada();
				setState(982);
				match(PARIZQ);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				match(ID_VALIDO);
				setState(986);
				match(PARIZQ);
				setState(987);
				match(PARIZQ);

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

	public static class ListaparametrosllamadaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListaparametrosllamadaContext listaparametrosllamada() {
			return getRuleContext(ListaparametrosllamadaContext.class,0);
		}
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public ListaparametrosllamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaparametrosllamada; }
	}

	public final ListaparametrosllamadaContext listaparametrosllamada() throws RecognitionException {
		ListaparametrosllamadaContext _localctx = new ListaparametrosllamadaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_listaparametrosllamada);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(COMA);
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(992);
					match(ID_VALIDO);
					setState(993);
					match(DOS_PUNTOS);
					}
					break;
				}
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(996);
					match(T__0);
					}
					break;
				}
				setState(999);
				expr(0);
				setState(1000);
				listaparametrosllamada();

				}
				break;
			case T__0:
			case FLOAT:
			case STRING:
			case TRU:
			case FAL:
			case NULO:
			case NUMBER:
			case CADENA:
			case ID_VALIDO:
			case CHARACTER:
			case PARIZQ:
			case NOT:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(1003);
					match(ID_VALIDO);
					setState(1004);
					match(DOS_PUNTOS);
					}
					break;
				}
				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(1007);
					match(T__0);
					}
					break;
				}
				setState(1010);
				expr(0);

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
		enterRule(_localctx, 100, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(1016);
			match(PARIZQ);
			setState(1017);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(1018);
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

	public static class IntembebidaContext extends ParserRuleContext {
		public interfaces.Expression intemb;
		public ExprContext expr;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public IntembebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intembebida; }
	}

	public final IntembebidaContext intembebida() throws RecognitionException {
		IntembebidaContext _localctx = new IntembebidaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_intembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(T__0);
			setState(1022);
			match(PARIZQ);
			setState(1023);
			((IntembebidaContext)_localctx).expr = expr(0);
			setState(1024);
			match(PARDER);
			 _localctx.intemb = instructions.NewFuncionIntEmbebida(((IntembebidaContext)_localctx).expr.e)
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

	public static class FloatembebidaContext extends ParserRuleContext {
		public interfaces.Expression floemb;
		public ExprContext expr;
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public FloatembebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatembebida; }
	}

	public final FloatembebidaContext floatembebida() throws RecognitionException {
		FloatembebidaContext _localctx = new FloatembebidaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_floatembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(FLOAT);
			setState(1028);
			match(PARIZQ);
			setState(1029);
			((FloatembebidaContext)_localctx).expr = expr(0);
			setState(1030);
			match(PARDER);
			 _localctx.floemb = instructions.NewFuncionFloatEmbebida(((FloatembebidaContext)_localctx).expr.e)
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

	public static class StringembebidaContext extends ParserRuleContext {
		public interfaces.Expression stremb;
		public ExprContext expr;
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public StringembebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringembebida; }
	}

	public final StringembebidaContext stringembebida() throws RecognitionException {
		StringembebidaContext _localctx = new StringembebidaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_stringembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(STRING);
			setState(1034);
			match(PARIZQ);
			setState(1035);
			((StringembebidaContext)_localctx).expr = expr(0);
			setState(1036);
			match(PARDER);
			 _localctx.stremb = instructions.NewFuncionStringEmbebida(((StringembebidaContext)_localctx).expr.e)
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 32:
			return listavaloresmat2_sempred((Listavaloresmat2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		}
		return true;
	}
	private boolean listavaloresmat2_sempred(Listavaloresmat2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u0412\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\6\3t\n\3\r\3\16"+
		"\3u\3\3\3\3\3\4\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u00a9\n\4\3\4\3\4\3\4\3\4\5\4\u00af\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00b9\n\4\3\5\6\5\u00bc\n\5\r\5\16\5\u00bd\3\5\3\5"+
		"\3\6\3\6\5\6\u00c4\n\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00d0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00e5\n\6\3\6\3\6\3\6\3\6\5\6\u00eb\n\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00f1\n\6\3\6\3\6\3\6\3\6\5\6\u00f7\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00fd\n\6\3\6\3\6\3\6\3\6\5\6\u0103\n\6\3\6\3\6\3\6\3\6\5\6\u0109\n"+
		"\6\3\6\3\6\5\6\u010d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0124\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0134\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0145\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0151\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0180\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u01aa"+
		"\n\13\f\13\16\13\u01ad\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u01ca\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d3\n\r\3\r\3\r\3\r\3\16"+
		"\6\16\u01d9\n\16\r\16\16\16\u01da\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0200\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0216\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0239\n\26\3\27\6\27\u023c\n\27\r\27\16\27\u023d"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0249\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u027d\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u028f\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02b4\n\35\3\36\3\36\3\36\3\36"+
		"\5\36\u02ba\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u02ca\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u02d7"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02e0\n\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u02e7\n\"\f\"\16\"\u02ea\13\"\3#\6#\u02ed\n#\r#\16#\u02ee\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u02fa\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0314\n%\3&\6&\u0317\n&\r&\16&\u0318"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\6)\u032a\n)\r)\16)"+
		"\u032b\3)\3)\3*\3*\3*\3*\3*\5*\u0335\n*\3*\3*\5*\u0339\n*\3*\5*\u033c"+
		"\n*\3*\3*\3*\3*\3*\5*\u0343\n*\3*\5*\u0346\n*\3*\3*\5*\u034a\n*\3*\3*"+
		"\3*\5*\u034f\n*\3+\3+\3+\3+\5+\u0355\n+\3+\3+\3+\5+\u035a\n+\3+\3+\3+"+
		"\3+\3+\5+\u0361\n+\3+\3+\5+\u0365\n+\3+\3+\3+\3+\3+\5+\u036c\n+\3+\3+"+
		"\3+\3+\5+\u0372\n+\3,\3,\3,\6,\u0377\n,\r,\16,\u0378\3,\3,\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03ba\n\60\3\61\5\61"+
		"\u03bd\n\61\3\61\3\61\3\61\5\61\u03c2\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u03ca\n\61\3\61\3\61\3\61\5\61\u03cf\n\61\3\61\3\61\3\61\5\61"+
		"\u03d4\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03e0"+
		"\n\62\3\63\3\63\3\63\5\63\u03e5\n\63\3\63\5\63\u03e8\n\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u03f0\n\63\3\63\5\63\u03f3\n\63\3\63\3\63\3\63"+
		"\5\63\u03f8\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\2\4\24B8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\t\3\2<=\3\2>?\4\2\67\6799\4\288::\3\2\62"+
		"\63\3\2\n\13\4\2))GG\2\u0462\2n\3\2\2\2\4s\3\2\2\2\6\u00b8\3\2\2\2\b\u00bb"+
		"\3\2\2\2\n\u010c\3\2\2\2\f\u0123\3\2\2\2\16\u0133\3\2\2\2\20\u0144\3\2"+
		"\2\2\22\u0150\3\2\2\2\24\u017f\3\2\2\2\26\u01c9\3\2\2\2\30\u01cb\3\2\2"+
		"\2\32\u01d8\3\2\2\2\34\u01de\3\2\2\2\36\u01e4\3\2\2\2 \u01ff\3\2\2\2\""+
		"\u0201\3\2\2\2$\u0209\3\2\2\2&\u020c\3\2\2\2(\u0215\3\2\2\2*\u0238\3\2"+
		"\2\2,\u023b\3\2\2\2.\u0248\3\2\2\2\60\u027c\3\2\2\2\62\u028e\3\2\2\2\64"+
		"\u0290\3\2\2\2\66\u0295\3\2\2\28\u02b3\3\2\2\2:\u02b5\3\2\2\2<\u02c9\3"+
		"\2\2\2>\u02cb\3\2\2\2@\u02d6\3\2\2\2B\u02df\3\2\2\2D\u02ec\3\2\2\2F\u02f9"+
		"\3\2\2\2H\u0313\3\2\2\2J\u0316\3\2\2\2L\u031c\3\2\2\2N\u0321\3\2\2\2P"+
		"\u0329\3\2\2\2R\u034e\3\2\2\2T\u0371\3\2\2\2V\u0376\3\2\2\2X\u037c\3\2"+
		"\2\2Z\u0381\3\2\2\2\\\u0388\3\2\2\2^\u03b9\3\2\2\2`\u03d3\3\2\2\2b\u03df"+
		"\3\2\2\2d\u03f7\3\2\2\2f\u03f9\3\2\2\2h\u03ff\3\2\2\2j\u0405\3\2\2\2l"+
		"\u040b\3\2\2\2no\5\4\3\2op\7\2\2\3pq\b\2\1\2q\3\3\2\2\2rt\5\6\4\2sr\3"+
		"\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\3\1\2x\5\3\2\2\2y{"+
		"\5\f\7\2z|\7.\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\4\1\2~\u00b9\3\2\2"+
		"\2\177\u0081\5\16\b\2\u0080\u0082\7.\2\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\4\1\2\u0084\u00b9\3\2\2\2\u0085"+
		"\u0087\5\20\t\2\u0086\u0088\7.\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\4\1\2\u008a\u00b9\3\2\2\2\u008b"+
		"\u008c\5\26\f\2\u008c\u008d\b\4\1\2\u008d\u00b9\3\2\2\2\u008e\u008f\5"+
		"\30\r\2\u008f\u0090\b\4\1\2\u0090\u00b9\3\2\2\2\u0091\u0092\5\36\20\2"+
		"\u0092\u0093\b\4\1\2\u0093\u00b9\3\2\2\2\u0094\u0095\5 \21\2\u0095\u0096"+
		"\b\4\1\2\u0096\u00b9\3\2\2\2\u0097\u0098\5\"\22\2\u0098\u0099\b\4\1\2"+
		"\u0099\u00b9\3\2\2\2\u009a\u009c\5*\26\2\u009b\u009d\7.\2\2\u009c\u009b"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\4\1\2\u009f"+
		"\u00b9\3\2\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00a2\b\4\1\2\u00a2\u00b9\3"+
		"\2\2\2\u00a3\u00a4\5\62\32\2\u00a4\u00a5\b\4\1\2\u00a5\u00b9\3\2\2\2\u00a6"+
		"\u00a8\5f\64\2\u00a7\u00a9\7.\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\4\1\2\u00ab\u00b9\3\2\2\2\u00ac"+
		"\u00ae\5:\36\2\u00ad\u00af\7.\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\4\1\2\u00b1\u00b9\3\2\2\2\u00b2"+
		"\u00b3\5N(\2\u00b3\u00b4\b\4\1\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6\5^\60"+
		"\2\u00b6\u00b7\b\4\1\2\u00b7\u00b9\3\2\2\2\u00b8y\3\2\2\2\u00b8\177\3"+
		"\2\2\2\u00b8\u0085\3\2\2\2\u00b8\u008b\3\2\2\2\u00b8\u008e\3\2\2\2\u00b8"+
		"\u0091\3\2\2\2\u00b8\u0094\3\2\2\2\u00b8\u0097\3\2\2\2\u00b8\u009a\3\2"+
		"\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a3\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8"+
		"\u00ac\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\7\3\2\2\2"+
		"\u00ba\u00bc\5\n\6\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\5\1\2\u00c0"+
		"\t\3\2\2\2\u00c1\u00c3\5\f\7\2\u00c2\u00c4\7.\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\6\1\2\u00c6\u010d"+
		"\3\2\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00ca\7.\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\6\1\2\u00cc\u010d\3\2"+
		"\2\2\u00cd\u00cf\5\20\t\2\u00ce\u00d0\7.\2\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\6\1\2\u00d2\u010d\3\2"+
		"\2\2\u00d3\u00d4\5\26\f\2\u00d4\u00d5\b\6\1\2\u00d5\u010d\3\2\2\2\u00d6"+
		"\u00d7\5\30\r\2\u00d7\u00d8\b\6\1\2\u00d8\u010d\3\2\2\2\u00d9\u00da\5"+
		"\36\20\2\u00da\u00db\b\6\1\2\u00db\u010d\3\2\2\2\u00dc\u00dd\5 \21\2\u00dd"+
		"\u00de\b\6\1\2\u00de\u010d\3\2\2\2\u00df\u00e0\5\"\22\2\u00e0\u00e1\b"+
		"\6\1\2\u00e1\u010d\3\2\2\2\u00e2\u00e4\5$\23\2\u00e3\u00e5\7.\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\6"+
		"\1\2\u00e7\u010d\3\2\2\2\u00e8\u00ea\5&\24\2\u00e9\u00eb\7.\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\6"+
		"\1\2\u00ed\u010d\3\2\2\2\u00ee\u00f0\5(\25\2\u00ef\u00f1\7.\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\6"+
		"\1\2\u00f3\u010d\3\2\2\2\u00f4\u00f6\5*\26\2\u00f5\u00f7\7.\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b\6"+
		"\1\2\u00f9\u010d\3\2\2\2\u00fa\u00fc\5\60\31\2\u00fb\u00fd\7.\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\6"+
		"\1\2\u00ff\u010d\3\2\2\2\u0100\u0102\5\62\32\2\u0101\u0103\7.\2\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\6"+
		"\1\2\u0105\u010d\3\2\2\2\u0106\u0108\5f\64\2\u0107\u0109\7.\2\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b\6"+
		"\1\2\u010b\u010d\3\2\2\2\u010c\u00c1\3\2\2\2\u010c\u00c7\3\2\2\2\u010c"+
		"\u00cd\3\2\2\2\u010c\u00d3\3\2\2\2\u010c\u00d6\3\2\2\2\u010c\u00d9\3\2"+
		"\2\2\u010c\u00dc\3\2\2\2\u010c\u00df\3\2\2\2\u010c\u00e2\3\2\2\2\u010c"+
		"\u00e8\3\2\2\2\u010c\u00ee\3\2\2\2\u010c\u00f4\3\2\2\2\u010c\u00fa\3\2"+
		"\2\2\u010c\u0100\3\2\2\2\u010c\u0106\3\2\2\2\u010d\13\3\2\2\2\u010e\u010f"+
		"\7\n\2\2\u010f\u0110\7)\2\2\u0110\u0111\7-\2\2\u0111\u0112\5\22\n\2\u0112"+
		"\u0113\7,\2\2\u0113\u0114\5\24\13\2\u0114\u0115\b\7\1\2\u0115\u0124\3"+
		"\2\2\2\u0116\u0117\7\n\2\2\u0117\u0118\7)\2\2\u0118\u0119\7,\2\2\u0119"+
		"\u011a\5\24\13\2\u011a\u011b\b\7\1\2\u011b\u0124\3\2\2\2\u011c\u011d\7"+
		"\n\2\2\u011d\u011e\7)\2\2\u011e\u011f\7-\2\2\u011f\u0120\5\22\n\2\u0120"+
		"\u0121\7/\2\2\u0121\u0122\b\7\1\2\u0122\u0124\3\2\2\2\u0123\u010e\3\2"+
		"\2\2\u0123\u0116\3\2\2\2\u0123\u011c\3\2\2\2\u0124\r\3\2\2\2\u0125\u0126"+
		"\7\13\2\2\u0126\u0127\7)\2\2\u0127\u0128\7-\2\2\u0128\u0129\5\22\n\2\u0129"+
		"\u012a\7,\2\2\u012a\u012b\5\24\13\2\u012b\u012c\b\b\1\2\u012c\u0134\3"+
		"\2\2\2\u012d\u012e\7\13\2\2\u012e\u012f\7)\2\2\u012f\u0130\7,\2\2\u0130"+
		"\u0131\5\24\13\2\u0131\u0132\b\b\1\2\u0132\u0134\3\2\2\2\u0133\u0125\3"+
		"\2\2\2\u0133\u012d\3\2\2\2\u0134\17\3\2\2\2\u0135\u0136\7)\2\2\u0136\u0137"+
		"\7,\2\2\u0137\u0138\5\24\13\2\u0138\u0139\b\t\1\2\u0139\u0145\3\2\2\2"+
		"\u013a\u013b\7)\2\2\u013b\u013c\7@\2\2\u013c\u013d\5\24\13\2\u013d\u013e"+
		"\b\t\1\2\u013e\u0145\3\2\2\2\u013f\u0140\7)\2\2\u0140\u0141\7A\2\2\u0141"+
		"\u0142\5\24\13\2\u0142\u0143\b\t\1\2\u0143\u0145\3\2\2\2\u0144\u0135\3"+
		"\2\2\2\u0144\u013a\3\2\2\2\u0144\u013f\3\2\2\2\u0145\21\3\2\2\2\u0146"+
		"\u0147\7\3\2\2\u0147\u0151\b\n\1\2\u0148\u0149\7\4\2\2\u0149\u0151\b\n"+
		"\1\2\u014a\u014b\7\5\2\2\u014b\u0151\b\n\1\2\u014c\u014d\7\6\2\2\u014d"+
		"\u0151\b\n\1\2\u014e\u014f\7\7\2\2\u014f\u0151\b\n\1\2\u0150\u0146\3\2"+
		"\2\2\u0150\u0148\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014c\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\23\3\2\2\2\u0152\u0153\b\13\1\2\u0153\u0154\7\64"+
		"\2\2\u0154\u0155\5\24\13\32\u0155\u0156\b\13\1\2\u0156\u0180\3\2\2\2\u0157"+
		"\u0158\7\60\2\2\u0158\u0159\5\24\13\2\u0159\u015a\7\61\2\2\u015a\u015b"+
		"\b\13\1\2\u015b\u0180\3\2\2\2\u015c\u015d\7?\2\2\u015d\u015e\7\'\2\2\u015e"+
		"\u0180\b\13\1\2\u015f\u0160\7\'\2\2\u0160\u0180\b\13\1\2\u0161\u0162\7"+
		"(\2\2\u0162\u0180\b\13\1\2\u0163\u0164\7\b\2\2\u0164\u0180\b\13\1\2\u0165"+
		"\u0166\7\t\2\2\u0166\u0180\b\13\1\2\u0167\u0168\7*\2\2\u0168\u0180\b\13"+
		"\1\2\u0169\u016a\7)\2\2\u016a\u0180\b\13\1\2\u016b\u016c\7\f\2\2\u016c"+
		"\u0180\b\13\1\2\u016d\u016e\5\64\33\2\u016e\u016f\b\13\1\2\u016f\u0180"+
		"\3\2\2\2\u0170\u0171\5\66\34\2\u0171\u0172\b\13\1\2\u0172\u0180\3\2\2"+
		"\2\u0173\u0174\58\35\2\u0174\u0175\b\13\1\2\u0175\u0180\3\2\2\2\u0176"+
		"\u0177\5h\65\2\u0177\u0178\b\13\1\2\u0178\u0180\3\2\2\2\u0179\u017a\5"+
		"j\66\2\u017a\u017b\b\13\1\2\u017b\u0180\3\2\2\2\u017c\u017d\5l\67\2\u017d"+
		"\u017e\b\13\1\2\u017e\u0180\3\2\2\2\u017f\u0152\3\2\2\2\u017f\u0157\3"+
		"\2\2\2\u017f\u015c\3\2\2\2\u017f\u015f\3\2\2\2\u017f\u0161\3\2\2\2\u017f"+
		"\u0163\3\2\2\2\u017f\u0165\3\2\2\2\u017f\u0167\3\2\2\2\u017f\u0169\3\2"+
		"\2\2\u017f\u016b\3\2\2\2\u017f\u016d\3\2\2\2\u017f\u0170\3\2\2\2\u017f"+
		"\u0173\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u0179\3\2\2\2\u017f\u017c\3\2"+
		"\2\2\u0180\u01ab\3\2\2\2\u0181\u0182\f\31\2\2\u0182\u0183\7;\2\2\u0183"+
		"\u0184\5\24\13\32\u0184\u0185\b\13\1\2\u0185\u01aa\3\2\2\2\u0186\u0187"+
		"\f\30\2\2\u0187\u0188\t\2\2\2\u0188\u0189\5\24\13\31\u0189\u018a\b\13"+
		"\1\2\u018a\u01aa\3\2\2\2\u018b\u018c\f\27\2\2\u018c\u018d\t\3\2\2\u018d"+
		"\u018e\5\24\13\30\u018e\u018f\b\13\1\2\u018f\u01aa\3\2\2\2\u0190\u0191"+
		"\f\26\2\2\u0191\u0192\t\4\2\2\u0192\u0193\5\24\13\27\u0193\u0194\b\13"+
		"\1\2\u0194\u01aa\3\2\2\2\u0195\u0196\f\25\2\2\u0196\u0197\t\5\2\2\u0197"+
		"\u0198\5\24\13\26\u0198\u0199\b\13\1\2\u0199\u01aa\3\2\2\2\u019a\u019b"+
		"\f\24\2\2\u019b\u019c\t\6\2\2\u019c\u019d\5\24\13\25\u019d\u019e\b\13"+
		"\1\2\u019e\u01aa\3\2\2\2\u019f\u01a0\f\23\2\2\u01a0\u01a1\7\66\2\2\u01a1"+
		"\u01a2\5\24\13\24\u01a2\u01a3\b\13\1\2\u01a3\u01aa\3\2\2\2\u01a4\u01a5"+
		"\f\22\2\2\u01a5\u01a6\7\65\2\2\u01a6\u01a7\5\24\13\23\u01a7\u01a8\b\13"+
		"\1\2\u01a8\u01aa\3\2\2\2\u01a9\u0181\3\2\2\2\u01a9\u0186\3\2\2\2\u01a9"+
		"\u018b\3\2\2\2\u01a9\u0190\3\2\2\2\u01a9\u0195\3\2\2\2\u01a9\u019a\3\2"+
		"\2\2\u01a9\u019f\3\2\2\2\u01a9\u01a4\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\25\3\2\2\2\u01ad\u01ab\3\2\2"+
		"\2\u01ae\u01af\7\r\2\2\u01af\u01b0\5\24\13\2\u01b0\u01b1\7B\2\2\u01b1"+
		"\u01b2\5\b\5\2\u01b2\u01b3\7C\2\2\u01b3\u01b4\b\f\1\2\u01b4\u01ca\3\2"+
		"\2\2\u01b5\u01b6\7\r\2\2\u01b6\u01b7\5\24\13\2\u01b7\u01b8\7B\2\2\u01b8"+
		"\u01b9\5\b\5\2\u01b9\u01ba\7C\2\2\u01ba\u01bb\7\16\2\2\u01bb\u01bc\7B"+
		"\2\2\u01bc\u01bd\5\b\5\2\u01bd\u01be\7C\2\2\u01be\u01bf\b\f\1\2\u01bf"+
		"\u01ca\3\2\2\2\u01c0\u01c1\7\r\2\2\u01c1\u01c2\5\24\13\2\u01c2\u01c3\7"+
		"B\2\2\u01c3\u01c4\5\b\5\2\u01c4\u01c5\7C\2\2\u01c5\u01c6\7\16\2\2\u01c6"+
		"\u01c7\5\26\f\2\u01c7\u01c8\b\f\1\2\u01c8\u01ca\3\2\2\2\u01c9\u01ae\3"+
		"\2\2\2\u01c9\u01b5\3\2\2\2\u01c9\u01c0\3\2\2\2\u01ca\27\3\2\2\2\u01cb"+
		"\u01cc\7\17\2\2\u01cc\u01cd\5\24\13\2\u01cd\u01ce\7B\2\2\u01ce\u01d2\5"+
		"\32\16\2\u01cf\u01d0\7\21\2\2\u01d0\u01d1\7-\2\2\u01d1\u01d3\5\b\5\2\u01d2"+
		"\u01cf\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7C"+
		"\2\2\u01d5\u01d6\b\r\1\2\u01d6\31\3\2\2\2\u01d7\u01d9\5\34\17\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\b\16\1\2\u01dd\33\3\2\2\2\u01de\u01df"+
		"\7\20\2\2\u01df\u01e0\5\24\13\2\u01e0\u01e1\7-\2\2\u01e1\u01e2\5\b\5\2"+
		"\u01e2\u01e3\b\17\1\2\u01e3\35\3\2\2\2\u01e4\u01e5\7\27\2\2\u01e5\u01e6"+
		"\5\24\13\2\u01e6\u01e7\7B\2\2\u01e7\u01e8\5\b\5\2\u01e8\u01e9\7C\2\2\u01e9"+
		"\u01ea\b\20\1\2\u01ea\37\3\2\2\2\u01eb\u01ec\7\24\2\2\u01ec\u01ed\7)\2"+
		"\2\u01ed\u01ee\7\25\2\2\u01ee\u01ef\5\24\13\2\u01ef\u01f0\7\26\2\2\u01f0"+
		"\u01f1\5\24\13\2\u01f1\u01f2\7B\2\2\u01f2\u01f3\5\b\5\2\u01f3\u01f4\7"+
		"C\2\2\u01f4\u01f5\b\21\1\2\u01f5\u0200\3\2\2\2\u01f6\u01f7\7\24\2\2\u01f7"+
		"\u01f8\7)\2\2\u01f8\u01f9\7\25\2\2\u01f9\u01fa\5\24\13\2\u01fa\u01fb\7"+
		"B\2\2\u01fb\u01fc\5\b\5\2\u01fc\u01fd\7C\2\2\u01fd\u01fe\b\21\1\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01eb\3\2\2\2\u01ff\u01f6\3\2\2\2\u0200!\3\2\2\2"+
		"\u0201\u0202\7\30\2\2\u0202\u0203\5\24\13\2\u0203\u0204\7\16\2\2\u0204"+
		"\u0205\7B\2\2\u0205\u0206\5\b\5\2\u0206\u0207\7C\2\2\u0207\u0208\b\22"+
		"\1\2\u0208#\3\2\2\2\u0209\u020a\7\23\2\2\u020a\u020b\b\23\1\2\u020b%\3"+
		"\2\2\2\u020c\u020d\7\22\2\2\u020d\u020e\b\24\1\2\u020e\'\3\2\2\2\u020f"+
		"\u0210\7\31\2\2\u0210\u0216\b\25\1\2\u0211\u0212\7\31\2\2\u0212\u0213"+
		"\5\24\13\2\u0213\u0214\b\25\1\2\u0214\u0216\3\2\2\2\u0215\u020f\3\2\2"+
		"\2\u0215\u0211\3\2\2\2\u0216)\3\2\2\2\u0217\u0218\7\n\2\2\u0218\u0219"+
		"\7)\2\2\u0219\u021a\7-\2\2\u021a\u021b\7H\2\2\u021b\u021c\5\22\n\2\u021c"+
		"\u021d\7I\2\2\u021d\u021e\7,\2\2\u021e\u021f\7H\2\2\u021f\u0220\5,\27"+
		"\2\u0220\u0221\7I\2\2\u0221\u0222\b\26\1\2\u0222\u0239\3\2\2\2\u0223\u0224"+
		"\7\n\2\2\u0224\u0225\7)\2\2\u0225\u0226\7-\2\2\u0226\u0227\7H\2\2\u0227"+
		"\u0228\5\22\n\2\u0228\u0229\7I\2\2\u0229\u022a\7,\2\2\u022a\u022b\7H\2"+
		"\2\u022b\u022c\7I\2\2\u022c\u022d\b\26\1\2\u022d\u0239\3\2\2\2\u022e\u022f"+
		"\7\n\2\2\u022f\u0230\7)\2\2\u0230\u0231\7-\2\2\u0231\u0232\7H\2\2\u0232"+
		"\u0233\5\22\n\2\u0233\u0234\7I\2\2\u0234\u0235\7,\2\2\u0235\u0236\7)\2"+
		"\2\u0236\u0237\b\26\1\2\u0237\u0239\3\2\2\2\u0238\u0217\3\2\2\2\u0238"+
		"\u0223\3\2\2\2\u0238\u022e\3\2\2\2\u0239+\3\2\2\2\u023a\u023c\5.\30\2"+
		"\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\b\27\1\2\u0240-\3\2\2\2\u0241"+
		"\u0242\7E\2\2\u0242\u0243\5\24\13\2\u0243\u0244\b\30\1\2\u0244\u0249\3"+
		"\2\2\2\u0245\u0246\5\24\13\2\u0246\u0247\b\30\1\2\u0247\u0249\3\2\2\2"+
		"\u0248\u0241\3\2\2\2\u0248\u0245\3\2\2\2\u0249/\3\2\2\2\u024a\u024b\7"+
		")\2\2\u024b\u024c\7F\2\2\u024c\u024d\7\35\2\2\u024d\u024e\7\60\2\2\u024e"+
		"\u024f\5\24\13\2\u024f\u0250\7\61\2\2\u0250\u0251\b\31\1\2\u0251\u027d"+
		"\3\2\2\2\u0252\u0253\7)\2\2\u0253\u0254\7H\2\2\u0254\u0255\5\24\13\2\u0255"+
		"\u0256\7I\2\2\u0256\u0257\7,\2\2\u0257\u0258\7)\2\2\u0258\u0259\7H\2\2"+
		"\u0259\u025a\5\24\13\2\u025a\u025b\7I\2\2\u025b\u025c\b\31\1\2\u025c\u027d"+
		"\3\2\2\2\u025d\u025e\7)\2\2\u025e\u025f\7H\2\2\u025f\u0260\5\24\13\2\u0260"+
		"\u0261\7I\2\2\u0261\u0262\7H\2\2\u0262\u0263\5\24\13\2\u0263\u0264\7I"+
		"\2\2\u0264\u0265\5J&\2\u0265\u0266\7,\2\2\u0266\u0267\5\24\13\2\u0267"+
		"\u0268\b\31\1\2\u0268\u027d\3\2\2\2\u0269\u026a\7)\2\2\u026a\u026b\7H"+
		"\2\2\u026b\u026c\5\24\13\2\u026c\u026d\7I\2\2\u026d\u026e\7H\2\2\u026e"+
		"\u026f\5\24\13\2\u026f\u0270\7I\2\2\u0270\u0271\7,\2\2\u0271\u0272\5\24"+
		"\13\2\u0272\u0273\b\31\1\2\u0273\u027d\3\2\2\2\u0274\u0275\7)\2\2\u0275"+
		"\u0276\7H\2\2\u0276\u0277\5\24\13\2\u0277\u0278\7I\2\2\u0278\u0279\7,"+
		"\2\2\u0279\u027a\5\24\13\2\u027a\u027b\b\31\1\2\u027b\u027d\3\2\2\2\u027c"+
		"\u024a\3\2\2\2\u027c\u0252\3\2\2\2\u027c\u025d\3\2\2\2\u027c\u0269\3\2"+
		"\2\2\u027c\u0274\3\2\2\2\u027d\61\3\2\2\2\u027e\u027f\7)\2\2\u027f\u0280"+
		"\7F\2\2\u0280\u0281\7\37\2\2\u0281\u0282\7\60\2\2\u0282\u0283\7\61\2\2"+
		"\u0283\u028f\b\32\1\2\u0284\u0285\7)\2\2\u0285\u0286\7F\2\2\u0286\u0287"+
		"\7\36\2\2\u0287\u0288\7\60\2\2\u0288\u0289\7\"\2\2\u0289\u028a\7-\2\2"+
		"\u028a\u028b\5\24\13\2\u028b\u028c\7\61\2\2\u028c\u028d\b\32\1\2\u028d"+
		"\u028f\3\2\2\2\u028e\u027e\3\2\2\2\u028e\u0284\3\2\2\2\u028f\63\3\2\2"+
		"\2\u0290\u0291\7)\2\2\u0291\u0292\7F\2\2\u0292\u0293\7!\2\2\u0293\u0294"+
		"\b\33\1\2\u0294\65\3\2\2\2\u0295\u0296\7)\2\2\u0296\u0297\7F\2\2\u0297"+
		"\u0298\7 \2\2\u0298\u0299\b\34\1\2\u0299\67\3\2\2\2\u029a\u029b\7)\2\2"+
		"\u029b\u029c\7H\2\2\u029c\u029d\5\24\13\2\u029d\u029e\7I\2\2\u029e\u029f"+
		"\7H\2\2\u029f\u02a0\5\24\13\2\u02a0\u02a1\7I\2\2\u02a1\u02a2\5J&\2\u02a2"+
		"\u02a3\b\35\1\2\u02a3\u02b4\3\2\2\2\u02a4\u02a5\7)\2\2\u02a5\u02a6\7H"+
		"\2\2\u02a6\u02a7\5\24\13\2\u02a7\u02a8\7I\2\2\u02a8\u02a9\7H\2\2\u02a9"+
		"\u02aa\5\24\13\2\u02aa\u02ab\7I\2\2\u02ab\u02ac\b\35\1\2\u02ac\u02b4\3"+
		"\2\2\2\u02ad\u02ae\7)\2\2\u02ae\u02af\7H\2\2\u02af\u02b0\5\24\13\2\u02b0"+
		"\u02b1\7I\2\2\u02b1\u02b2\b\35\1\2\u02b2\u02b4\3\2\2\2\u02b3\u029a\3\2"+
		"\2\2\u02b3\u02a4\3\2\2\2\u02b3\u02ad\3\2\2\2\u02b49\3\2\2\2\u02b5\u02b6"+
		"\7\n\2\2\u02b6\u02b9\7)\2\2\u02b7\u02b8\7-\2\2\u02b8\u02ba\5<\37\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7,"+
		"\2\2\u02bc\u02bd\5> \2\u02bd\u02be\b\36\1\2\u02be;\3\2\2\2\u02bf\u02c0"+
		"\7H\2\2\u02c0\u02c1\5<\37\2\u02c1\u02c2\7I\2\2\u02c2\u02c3\b\37\1\2\u02c3"+
		"\u02ca\3\2\2\2\u02c4\u02c5\7H\2\2\u02c5\u02c6\5\22\n\2\u02c6\u02c7\7I"+
		"\2\2\u02c7\u02c8\b\37\1\2\u02c8\u02ca\3\2\2\2\u02c9\u02bf\3\2\2\2\u02c9"+
		"\u02c4\3\2\2\2\u02ca=\3\2\2\2\u02cb\u02cc\5@!\2\u02cc\u02cd\b \1\2\u02cd"+
		"?\3\2\2\2\u02ce\u02cf\7H\2\2\u02cf\u02d0\5B\"\2\u02d0\u02d1\7I\2\2\u02d1"+
		"\u02d2\b!\1\2\u02d2\u02d7\3\2\2\2\u02d3\u02d4\5H%\2\u02d4\u02d5\b!\1\2"+
		"\u02d5\u02d7\3\2\2\2\u02d6\u02ce\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d7A\3"+
		"\2\2\2\u02d8\u02d9\b\"\1\2\u02d9\u02da\5@!\2\u02da\u02db\b\"\1\2\u02db"+
		"\u02e0\3\2\2\2\u02dc\u02dd\5D#\2\u02dd\u02de\b\"\1\2\u02de\u02e0\3\2\2"+
		"\2\u02df\u02d8\3\2\2\2\u02df\u02dc\3\2\2\2\u02e0\u02e8\3\2\2\2\u02e1\u02e2"+
		"\f\5\2\2\u02e2\u02e3\7E\2\2\u02e3\u02e4\5@!\2\u02e4\u02e5\b\"\1\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02e1\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9C\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed"+
		"\5F$\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\b#\1\2\u02f1E\3\2\2\2\u02f2"+
		"\u02f3\7E\2\2\u02f3\u02f4\5\24\13\2\u02f4\u02f5\b$\1\2\u02f5\u02fa\3\2"+
		"\2\2\u02f6\u02f7\5\24\13\2\u02f7\u02f8\b$\1\2\u02f8\u02fa\3\2\2\2\u02f9"+
		"\u02f2\3\2\2\2\u02f9\u02f6\3\2\2\2\u02faG\3\2\2\2\u02fb\u02fc\5<\37\2"+
		"\u02fc\u02fd\7\60\2\2\u02fd\u02fe\7#\2\2\u02fe\u02ff\7-\2\2\u02ff\u0300"+
		"\5H%\2\u0300\u0301\7E\2\2\u0301\u0302\7 \2\2\u0302\u0303\7-\2\2\u0303"+
		"\u0304\7\'\2\2\u0304\u0305\7\61\2\2\u0305\u0306\b%\1\2\u0306\u0314\3\2"+
		"\2\2\u0307\u0308\5<\37\2\u0308\u0309\7\60\2\2\u0309\u030a\7#\2\2\u030a"+
		"\u030b\7-\2\2\u030b\u030c\5\24\13\2\u030c\u030d\7E\2\2\u030d\u030e\7 "+
		"\2\2\u030e\u030f\7-\2\2\u030f\u0310\7\'\2\2\u0310\u0311\7\61\2\2\u0311"+
		"\u0312\b%\1\2\u0312\u0314\3\2\2\2\u0313\u02fb\3\2\2\2\u0313\u0307\3\2"+
		"\2\2\u0314I\3\2\2\2\u0315\u0317\5L\'\2\u0316\u0315\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\b&\1\2\u031bK\3\2\2\2\u031c\u031d\7H\2\2\u031d\u031e\5\24\13\2"+
		"\u031e\u031f\7I\2\2\u031f\u0320\b\'\1\2\u0320M\3\2\2\2\u0321\u0322\7$"+
		"\2\2\u0322\u0323\7)\2\2\u0323\u0324\7B\2\2\u0324\u0325\5P)\2\u0325\u0326"+
		"\7C\2\2\u0326\u0327\b(\1\2\u0327O\3\2\2\2\u0328\u032a\5R*\2\u0329\u0328"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032e\b)\1\2\u032eQ\3\2\2\2\u032f\u0330\t\7\2\2\u0330"+
		"\u0331\7)\2\2\u0331\u0334\7-\2\2\u0332\u0335\5\22\n\2\u0333\u0335\7)\2"+
		"\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0337"+
		"\7,\2\2\u0337\u0339\5\24\13\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2"+
		"\u0339\u033b\3\2\2\2\u033a\u033c\7.\2\2\u033b\u033a\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u034f\b*\1\2\u033e\u033f\t\7\2\2\u033f"+
		"\u0342\7)\2\2\u0340\u0341\7,\2\2\u0341\u0343\5\24\13\2\u0342\u0340\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0346\7.\2\2\u0345"+
		"\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034f\b*"+
		"\1\2\u0348\u034a\7%\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034c\5^\60\2\u034c\u034d\b*\1\2\u034d\u034f\3\2"+
		"\2\2\u034e\u032f\3\2\2\2\u034e\u033e\3\2\2\2\u034e\u0349\3\2\2\2\u034f"+
		"S\3\2\2\2\u0350\u0351\t\7\2\2\u0351\u0354\7)\2\2\u0352\u0353\7-\2\2\u0353"+
		"\u0355\7)\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u0357\7,\2\2\u0357\u0359\7)\2\2\u0358\u035a\5V,\2\u0359\u0358"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0372\b+\1\2\u035c"+
		"\u035d\t\7\2\2\u035d\u0360\7)\2\2\u035e\u035f\7-\2\2\u035f\u0361\7)\2"+
		"\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364"+
		"\7,\2\2\u0363\u0365\7)\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u0372\b+\1\2\u0367\u0368\t\7\2\2\u0368\u036b\7)\2"+
		"\2\u0369\u036a\7-\2\2\u036a\u036c\7)\2\2\u036b\u0369\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7,\2\2\u036e\u036f\5\24\13\2"+
		"\u036f\u0370\b+\1\2\u0370\u0372\3\2\2\2\u0371\u0350\3\2\2\2\u0371\u035c"+
		"\3\2\2\2\u0371\u0367\3\2\2\2\u0372U\3\2\2\2\u0373\u0374\7)\2\2\u0374\u0375"+
		"\7-\2\2\u0375\u0377\5\24\13\2\u0376\u0373\3\2\2\2\u0377\u0378\3\2\2\2"+
		"\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b"+
		"\b,\1\2\u037bW\3\2\2\2\u037c\u037d\7)\2\2\u037d\u037e\7F\2\2\u037e\u037f"+
		"\7)\2\2\u037f\u0380\b-\1\2\u0380Y\3\2\2\2\u0381\u0382\7)\2\2\u0382\u0383"+
		"\7F\2\2\u0383\u0384\7)\2\2\u0384\u0385\7,\2\2\u0385\u0386\5\24\13\2\u0386"+
		"\u0387\b.\1\2\u0387[\3\2\2\2\u0388\u0389\7)\2\2\u0389\u038a\7F\2\2\u038a"+
		"\u038b\7)\2\2\u038b\u038c\7\60\2\2\u038c\u038d\7\61\2\2\u038d\u038e\b"+
		"/\1\2\u038e]\3\2\2\2\u038f\u0390\7\32\2\2\u0390\u0391\7)\2\2\u0391\u0392"+
		"\7\60\2\2\u0392\u0393\5`\61\2\u0393\u0394\7\61\2\2\u0394\u0395\7D\2\2"+
		"\u0395\u0396\5\22\n\2\u0396\u0397\7B\2\2\u0397\u0398\5\b\5\2\u0398\u0399"+
		"\7C\2\2\u0399\u039a\b\60\1\2\u039a\u03ba\3\2\2\2\u039b\u039c\7\32\2\2"+
		"\u039c\u039d\7)\2\2\u039d\u039e\7\60\2\2\u039e\u039f\7\61\2\2\u039f\u03a0"+
		"\7D\2\2\u03a0\u03a1\5\22\n\2\u03a1\u03a2\7B\2\2\u03a2\u03a3\5\b\5\2\u03a3"+
		"\u03a4\7C\2\2\u03a4\u03a5\b\60\1\2\u03a5\u03ba\3\2\2\2\u03a6\u03a7\7\32"+
		"\2\2\u03a7\u03a8\7)\2\2\u03a8\u03a9\7\60\2\2\u03a9\u03aa\5`\61\2\u03aa"+
		"\u03ab\7\61\2\2\u03ab\u03ac\7B\2\2\u03ac\u03ad\5\b\5\2\u03ad\u03ae\7C"+
		"\2\2\u03ae\u03af\b\60\1\2\u03af\u03ba\3\2\2\2\u03b0\u03b1\7\32\2\2\u03b1"+
		"\u03b2\7)\2\2\u03b2\u03b3\7\60\2\2\u03b3\u03b4\7\61\2\2\u03b4\u03b5\7"+
		"B\2\2\u03b5\u03b6\5\b\5\2\u03b6\u03b7\7C\2\2\u03b7\u03b8\b\60\1\2\u03b8"+
		"\u03ba\3\2\2\2\u03b9\u038f\3\2\2\2\u03b9\u039b\3\2\2\2\u03b9\u03a6\3\2"+
		"\2\2\u03b9\u03b0\3\2\2\2\u03ba_\3\2\2\2\u03bb\u03bd\t\b\2\2\u03bc\u03bb"+
		"\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\7)\2\2\u03bf"+
		"\u03c1\7-\2\2\u03c0\u03c2\7\34\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\5\22\n\2\u03c4\u03c5\7E\2\2\u03c5"+
		"\u03c6\5`\61\2\u03c6\u03c7\b\61\1\2\u03c7\u03d4\3\2\2\2\u03c8\u03ca\t"+
		"\b\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cc\7)\2\2\u03cc\u03ce\7-\2\2\u03cd\u03cf\7\34\2\2\u03ce\u03cd\3\2"+
		"\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\5\22\n\2\u03d1"+
		"\u03d2\b\61\1\2\u03d2\u03d4\3\2\2\2\u03d3\u03bc\3\2\2\2\u03d3\u03c9\3"+
		"\2\2\2\u03d4a\3\2\2\2\u03d5\u03d6\7)\2\2\u03d6\u03d7\7\60\2\2\u03d7\u03d8"+
		"\5d\63\2\u03d8\u03d9\7\60\2\2\u03d9\u03da\b\62\1\2\u03da\u03e0\3\2\2\2"+
		"\u03db\u03dc\7)\2\2\u03dc\u03dd\7\60\2\2\u03dd\u03de\7\60\2\2\u03de\u03e0"+
		"\b\62\1\2\u03df\u03d5\3\2\2\2\u03df\u03db\3\2\2\2\u03e0c\3\2\2\2\u03e1"+
		"\u03e4\7E\2\2\u03e2\u03e3\7)\2\2\u03e3\u03e5\7-\2\2\u03e4\u03e2\3\2\2"+
		"\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e8\7\3\2\2\u03e7\u03e6"+
		"\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\5\24\13\2"+
		"\u03ea\u03eb\5d\63\2\u03eb\u03ec\b\63\1\2\u03ec\u03f8\3\2\2\2\u03ed\u03ee"+
		"\7)\2\2\u03ee\u03f0\7-\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0"+
		"\u03f2\3\2\2\2\u03f1\u03f3\7\3\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2"+
		"\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\5\24\13\2\u03f5\u03f6\b\63\1\2\u03f6"+
		"\u03f8\3\2\2\2\u03f7\u03e1\3\2\2\2\u03f7\u03ef\3\2\2\2\u03f8e\3\2\2\2"+
		"\u03f9\u03fa\7\33\2\2\u03fa\u03fb\7\60\2\2\u03fb\u03fc\5\24\13\2\u03fc"+
		"\u03fd\7\61\2\2\u03fd\u03fe\b\64\1\2\u03feg\3\2\2\2\u03ff\u0400\7\3\2"+
		"\2\u0400\u0401\7\60\2\2\u0401\u0402\5\24\13\2\u0402\u0403\7\61\2\2\u0403"+
		"\u0404\b\65\1\2\u0404i\3\2\2\2\u0405\u0406\7\4\2\2\u0406\u0407\7\60\2"+
		"\2\u0407\u0408\5\24\13\2\u0408\u0409\7\61\2\2\u0409\u040a\b\66\1\2\u040a"+
		"k\3\2\2\2\u040b\u040c\7\5\2\2\u040c\u040d\7\60\2\2\u040d\u040e\5\24\13"+
		"\2\u040e\u040f\7\61\2\2\u040f\u0410\b\67\1\2\u0410m\3\2\2\2Lu{\u0081\u0087"+
		"\u009c\u00a8\u00ae\u00b8\u00bd\u00c3\u00c9\u00cf\u00e4\u00ea\u00f0\u00f6"+
		"\u00fc\u0102\u0108\u010c\u0123\u0133\u0144\u0150\u017f\u01a9\u01ab\u01c9"+
		"\u01d2\u01da\u01ff\u0215\u0238\u023d\u0248\u027c\u028e\u02b3\u02b9\u02c9"+
		"\u02d6\u02df\u02e8\u02ee\u02f9\u0313\u0318\u032b\u0334\u0338\u033b\u0342"+
		"\u0345\u0349\u034e\u0354\u0359\u0360\u0364\u036b\u0371\u0378\u03b9\u03bc"+
		"\u03c1\u03c9\u03ce\u03d3\u03df\u03e4\u03e7\u03ef\u03f2\u03f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}