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
		AT=32, REPEATING=33, STRUCT=34, MUTATING=35, NUMBER=36, CADENA=37, ID_VALIDO=38, 
		CHARACTER=39, WS=40, IG=41, DOS_PUNTOS=42, PUNTOCOMA=43, CIERRE_INTE=44, 
		PARIZQ=45, PARDER=46, DIF=47, IG_IG=48, NOT=49, OR=50, AND=51, MAY_IG=52, 
		MEN_IG=53, MAYOR=54, MENOR=55, MODULO=56, MUL=57, DIV=58, ADD=59, SUB=60, 
		SUMA=61, RESTA=62, LLAVEIZQ=63, LLAVEDER=64, RETORNO=65, COMA=66, PUNTO=67, 
		GUIONBAJO=68, CORCHIZQ=69, CORCHDER=70, WHITESPACE=71, COMMENT=72, LINE_COMMENT=73;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_blockinterno = 3, 
		RULE_instructionint = 4, RULE_declavarible = 5, RULE_declaconstante = 6, 
		RULE_asignacionvariable = 7, RULE_tipodato = 8, RULE_expr = 9, RULE_sentenciaifelse = 10, 
		RULE_switchcontrol = 11, RULE_blockcase = 12, RULE_bloquecase = 13, RULE_whilecontrol = 14, 
		RULE_forcontrol = 15, RULE_guardcontrol = 16, RULE_continuee = 17, RULE_breakk = 18, 
		RULE_retornos = 19, RULE_vectorcontrol = 20, RULE_blockparams = 21, RULE_bloqueparams = 22, 
		RULE_vectoragregar = 23, RULE_vectorremover = 24, RULE_vectorvacio = 25, 
		RULE_vectorcount = 26, RULE_vectoraccess = 27, RULE_funciondeclaracioncontrol = 28, 
		RULE_listaparametros = 29, RULE_funcionllamadacontrol = 30, RULE_listaparametrosllamada = 31, 
		RULE_printstmt = 32, RULE_intembebida = 33, RULE_floatembebida = 34, RULE_stringembebida = 35, 
		RULE_matrizcontrol = 36, RULE_tipomatriz = 37, RULE_defmatriz = 38, RULE_listavaloresmat = 39, 
		RULE_listavaloresmat2 = 40, RULE_listaexpresions = 41, RULE_listaexpresion = 42, 
		RULE_simplematriz = 43, RULE_matrizasignacion = 44, RULE_matrizobtener = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "blockinterno", "instructionint", "declavarible", 
			"declaconstante", "asignacionvariable", "tipodato", "expr", "sentenciaifelse", 
			"switchcontrol", "blockcase", "bloquecase", "whilecontrol", "forcontrol", 
			"guardcontrol", "continuee", "breakk", "retornos", "vectorcontrol", "blockparams", 
			"bloqueparams", "vectoragregar", "vectorremover", "vectorvacio", "vectorcount", 
			"vectoraccess", "funciondeclaracioncontrol", "listaparametros", "funcionllamadacontrol", 
			"listaparametrosllamada", "printstmt", "intembebida", "floatembebida", 
			"stringembebida", "matrizcontrol", "tipomatriz", "defmatriz", "listavaloresmat", 
			"listavaloresmat2", "listaexpresions", "listaexpresion", "simplematriz", 
			"matrizasignacion", "matrizobtener"
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
			null, null, "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR", 
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
			setState(92);
			((SContext)_localctx).block = block();
			setState(93);
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
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(99); 
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((InstructionContext)_localctx).declavarible = declavarible();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(104);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declavarible.decvbl
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((InstructionContext)_localctx).declaconstante = declaconstante();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(110);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).declaconstante.deccon
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				((InstructionContext)_localctx).asignacionvariable = asignacionvariable();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(116);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				((InstructionContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.inst = ((InstructionContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				((InstructionContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				((InstructionContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.inst = ((InstructionContext)_localctx).whilecontrol.whict
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				((InstructionContext)_localctx).forcontrol = forcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).forcontrol.forct
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				((InstructionContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.inst = ((InstructionContext)_localctx).guardcontrol.guct
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				((InstructionContext)_localctx).vectorcontrol = vectorcontrol();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(137);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).vectorcontrol.vect 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				((InstructionContext)_localctx).vectoragregar = vectoragregar();
				 _localctx.inst = ((InstructionContext)_localctx).vectoragregar.veadct 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				((InstructionContext)_localctx).vectorremover = vectorremover();
				 _localctx.inst = ((InstructionContext)_localctx).vectorremover.vermct 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(148);
				((InstructionContext)_localctx).printstmt = printstmt();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(149);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(154);
				((InstructionContext)_localctx).matrizcontrol = matrizcontrol();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(155);
					match(PUNTOCOMA);
					}
				}

				 _localctx.inst = ((InstructionContext)_localctx).matrizcontrol.matct
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
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				((BlockinternoContext)_localctx).instructionint = instructionint();
				((BlockinternoContext)_localctx).insint.add(((BlockinternoContext)_localctx).instructionint);
				}
				}
				setState(165); 
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((InstructionintContext)_localctx).declavarible = declavarible();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(170);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declavarible.decvbl
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((InstructionintContext)_localctx).declaconstante = declaconstante();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(176);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).declaconstante.deccon
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				((InstructionintContext)_localctx).asignacionvariable = asignacionvariable();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(182);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).asignacionvariable.asgvbl
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				((InstructionintContext)_localctx).sentenciaifelse = sentenciaifelse();
				 _localctx.insint = ((InstructionintContext)_localctx).sentenciaifelse.myIfElse
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				((InstructionintContext)_localctx).switchcontrol = switchcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).switchcontrol.mySwitch
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				((InstructionintContext)_localctx).whilecontrol = whilecontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).whilecontrol.whict
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				((InstructionintContext)_localctx).forcontrol = forcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).forcontrol.forct
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				((InstructionintContext)_localctx).guardcontrol = guardcontrol();
				 _localctx.insint = ((InstructionintContext)_localctx).guardcontrol.guct
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				((InstructionintContext)_localctx).continuee = continuee();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(203);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).continuee.coct
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(208);
				((InstructionintContext)_localctx).breakk = breakk();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(209);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).breakk.brkct
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(214);
				((InstructionintContext)_localctx).retornos = retornos();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(215);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).retornos.rect 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(220);
				((InstructionintContext)_localctx).vectorcontrol = vectorcontrol();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(221);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectorcontrol.vect 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(226);
				((InstructionintContext)_localctx).vectoragregar = vectoragregar();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(227);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectoragregar.veadct 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(232);
				((InstructionintContext)_localctx).vectorremover = vectorremover();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(233);
					match(PUNTOCOMA);
					}
				}

				 _localctx.insint = ((InstructionintContext)_localctx).vectorremover.vermct 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(238);
				((InstructionintContext)_localctx).printstmt = printstmt();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(239);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(247);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(248);
				match(DOS_PUNTOS);
				setState(249);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(250);
				match(IG);
				setState(251);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaration((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).tipodato.tipo, ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(255);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(256);
				match(IG);
				setState(257);
				((DeclavaribleContext)_localctx).expr = expr(0);
				_localctx.decvbl = instructions.NewVariableDeclaracionSinTipo((((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getLine():0), (((DeclavaribleContext)_localctx).VAR!=null?((DeclavaribleContext)_localctx).VAR.getCharPositionInLine():0), (((DeclavaribleContext)_localctx).ID_VALIDO!=null?((DeclavaribleContext)_localctx).ID_VALIDO.getText():null), ((DeclavaribleContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				((DeclavaribleContext)_localctx).VAR = match(VAR);
				setState(261);
				((DeclavaribleContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(262);
				match(DOS_PUNTOS);
				setState(263);
				((DeclavaribleContext)_localctx).tipodato = tipodato();
				setState(264);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(270);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(271);
				match(DOS_PUNTOS);
				setState(272);
				((DeclaconstanteContext)_localctx).tipodato = tipodato();
				setState(273);
				match(IG);
				setState(274);
				((DeclaconstanteContext)_localctx).expr = expr(0);
				_localctx.deccon = instructions.NewConstanteDeclaration((((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getLine():0), (((DeclaconstanteContext)_localctx).LET!=null?((DeclaconstanteContext)_localctx).LET.getCharPositionInLine():0), (((DeclaconstanteContext)_localctx).ID_VALIDO!=null?((DeclaconstanteContext)_localctx).ID_VALIDO.getText():null), ((DeclaconstanteContext)_localctx).tipodato.tipo, ((DeclaconstanteContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((DeclaconstanteContext)_localctx).LET = match(LET);
				setState(278);
				((DeclaconstanteContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(279);
				match(IG);
				setState(280);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(286);
				match(IG);
				setState(287);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionVariable((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(291);
				match(SUMA);
				setState(292);
				((AsignacionvariableContext)_localctx).expr = expr(0);
				 _localctx.asgvbl = instructions.NewAsignacionSuma((((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getCharPositionInLine():0), (((AsignacionvariableContext)_localctx).ID_VALIDO!=null?((AsignacionvariableContext)_localctx).ID_VALIDO.getText():null), ((AsignacionvariableContext)_localctx).expr.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				((AsignacionvariableContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(296);
				match(RESTA);
				setState(297);
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
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__0);
				 _localctx.tipo = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(FLOAT);
				 _localctx.tipo = environment.FLOAT 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(STRING);
				 _localctx.tipo = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(BOOL);
				 _localctx.tipo = environment.BOOLEAN 
				}
				break;
			case CHARACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(315);
				((ExprContext)_localctx).op = match(NOT);
				setState(316);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(24);
				 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetLine(), (((ExprContext)_localctx).right!=null?(((ExprContext)_localctx).right.start):null).GetColumn(), ((ExprContext)_localctx).right.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
				}
				break;
			case 2:
				{
				setState(319);
				match(PARIZQ);
				setState(320);
				((ExprContext)_localctx).expr = expr(0);
				setState(321);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 3:
				{
				setState(324);
				match(SUB);
				setState(325);
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
				setState(327);
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
				setState(329);
				((ExprContext)_localctx).CADENA = match(CADENA);

				        str := (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getLine():0), (((ExprContext)_localctx).CADENA!=null?((ExprContext)_localctx).CADENA.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 6:
				{
				setState(331);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 7:
				{
				setState(333);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 8:
				{
				setState(335);
				((ExprContext)_localctx).CHARACTER = match(CHARACTER);
				 
				        str := (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getLine():0), (((ExprContext)_localctx).CHARACTER!=null?((ExprContext)_localctx).CHARACTER.getCharPositionInLine():0), str[1:len(str)-1], environment.CHARACTER) 
				    
				}
				break;
			case 9:
				{
				setState(337);
				((ExprContext)_localctx).ID_VALIDO = match(ID_VALIDO);

				        id := (((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getText():null)
				        _localctx.e = instructions.NewCallid((((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getLine():0),(((ExprContext)_localctx).ID_VALIDO!=null?((ExprContext)_localctx).ID_VALIDO.getCharPositionInLine():0),id)
				    
				}
				break;
			case 10:
				{
				setState(339);
				((ExprContext)_localctx).NULO = match(NULO);
				_localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getCharPositionInLine():0), (((ExprContext)_localctx).NULO!=null?((ExprContext)_localctx).NULO.getText():null),environment.NULL)
				}
				break;
			case 11:
				{
				setState(341);
				((ExprContext)_localctx).vectorvacio = vectorvacio();
				 _localctx.e = ((ExprContext)_localctx).vectorvacio.veemct
				}
				break;
			case 12:
				{
				setState(344);
				((ExprContext)_localctx).vectorcount = vectorcount();
				 _localctx.e = ((ExprContext)_localctx).vectorcount.vecnct
				}
				break;
			case 13:
				{
				setState(347);
				((ExprContext)_localctx).vectoraccess = vectoraccess();
				 _localctx.e = ((ExprContext)_localctx).vectoraccess.vepposct
				}
				break;
			case 14:
				{
				setState(350);
				((ExprContext)_localctx).intembebida = intembebida();
				 _localctx.e = ((ExprContext)_localctx).intembebida.intemb
				}
				break;
			case 15:
				{
				setState(353);
				((ExprContext)_localctx).floatembebida = floatembebida();
				 _localctx.e = ((ExprContext)_localctx).floatembebida.floemb
				}
				break;
			case 16:
				{
				setState(356);
				((ExprContext)_localctx).stringembebida = stringembebida();
				 _localctx.e = ((ExprContext)_localctx).stringembebida.stremb
				}
				break;
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
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(362);
						((ExprContext)_localctx).op = match(MODULO);
						setState(363);
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
						setState(366);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
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
						setState(371);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
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
						setState(376);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
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
						setState(381);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
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
						setState(386);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
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
						setState(391);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(392);
						((ExprContext)_localctx).op = match(AND);
						setState(393);
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
						setState(396);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(397);
						((ExprContext)_localctx).op = match(OR);
						setState(398);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
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
		enterRule(_localctx, 20, RULE_sentenciaifelse);
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
		enterRule(_localctx, 22, RULE_switchcontrol);
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
		enterRule(_localctx, 24, RULE_blockcase);

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
		enterRule(_localctx, 26, RULE_bloquecase);
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
		enterRule(_localctx, 28, RULE_whilecontrol);
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
		enterRule(_localctx, 30, RULE_forcontrol);
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
		enterRule(_localctx, 32, RULE_guardcontrol);
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
		enterRule(_localctx, 34, RULE_continuee);
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
		enterRule(_localctx, 36, RULE_breakk);
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
		enterRule(_localctx, 38, RULE_retornos);
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
				((VectorcontrolContext)_localctx).blockparams = blockparams();
				setState(520);
				match(CORCHDER);
				 _localctx.vect = instructions.NewArregloDeclaracionLista((((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getLine():0) ,(((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((VectorcontrolContext)_localctx).ID_VALIDO!=null?((VectorcontrolContext)_localctx).ID_VALIDO.getText():null) , ((VectorcontrolContext)_localctx).tipodato.tipo, ((VectorcontrolContext)_localctx).blockparams.blkpar)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				((VectorcontrolContext)_localctx).VAR = match(VAR);
				setState(524);
				((VectorcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(525);
				match(DOS_PUNTOS);
				setState(526);
				match(CORCHIZQ);
				setState(527);
				((VectorcontrolContext)_localctx).tipodato = tipodato();
				setState(528);
				match(CORCHDER);
				setState(529);
				match(IG);
				setState(530);
				match(CORCHIZQ);
				setState(531);
				match(CORCHDER);
				 _localctx.vect = instructions.NewArregloDeclaracionSinLista((((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getLine():0) ,(((VectorcontrolContext)_localctx).VAR!=null?((VectorcontrolContext)_localctx).VAR.getCharPositionInLine():0), (((VectorcontrolContext)_localctx).ID_VALIDO!=null?((VectorcontrolContext)_localctx).ID_VALIDO.getText():null) , ((VectorcontrolContext)_localctx).tipodato.tipo)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				((VectorcontrolContext)_localctx).VAR = match(VAR);
				setState(535);
				((VectorcontrolContext)_localctx).prin = match(ID_VALIDO);
				setState(536);
				match(DOS_PUNTOS);
				setState(537);
				match(CORCHIZQ);
				setState(538);
				((VectorcontrolContext)_localctx).tipodato = tipodato();
				setState(539);
				match(CORCHDER);
				setState(540);
				match(IG);
				setState(541);
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
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				((BloqueparamsContext)_localctx).COMA = match(COMA);
				setState(554);
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
				setState(557);
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
		enterRule(_localctx, 46, RULE_vectoragregar);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				((VectoragregarContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(563);
				match(PUNTO);
				setState(564);
				match(APPEND);
				setState(565);
				match(PARIZQ);
				setState(566);
				((VectoragregarContext)_localctx).expr = expr(0);
				setState(567);
				match(PARDER);
				 _localctx.veadct = instructions.NewArregloAppend((((VectoragregarContext)_localctx).ID_VALIDO!=null?((VectoragregarContext)_localctx).ID_VALIDO.getText():null) , ((VectoragregarContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				((VectoragregarContext)_localctx).prin = match(ID_VALIDO);
				setState(571);
				match(CORCHIZQ);
				setState(572);
				((VectoragregarContext)_localctx).pop = expr(0);
				setState(573);
				match(CORCHDER);
				setState(574);
				match(IG);
				setState(575);
				((VectoragregarContext)_localctx).secu = match(ID_VALIDO);
				setState(576);
				match(CORCHIZQ);
				setState(577);
				((VectoragregarContext)_localctx).sop = expr(0);
				setState(578);
				match(CORCHDER);
				 _localctx.veadct = instructions.NewArregloAppendArreglo((((VectoragregarContext)_localctx).prin!=null?((VectoragregarContext)_localctx).prin.getText():null) , ((VectoragregarContext)_localctx).pop.e, (((VectoragregarContext)_localctx).secu!=null?((VectoragregarContext)_localctx).secu.getText():null), ((VectoragregarContext)_localctx).sop.e)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				((VectoragregarContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(582);
				match(CORCHIZQ);
				setState(583);
				((VectoragregarContext)_localctx).pop = expr(0);
				setState(584);
				match(CORCHDER);
				setState(585);
				match(IG);
				setState(586);
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
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				((VectorremoverContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(592);
				((VectorremoverContext)_localctx).PUNTO = match(PUNTO);
				setState(593);
				match(REMOVELAST);
				setState(594);
				match(PARIZQ);
				setState(595);
				match(PARDER);
				 _localctx.vermct = instructions.NewArregloRemoveLast((((VectorremoverContext)_localctx).PUNTO!=null?((VectorremoverContext)_localctx).PUNTO.getLine():0), (((VectorremoverContext)_localctx).PUNTO!=null?((VectorremoverContext)_localctx).PUNTO.getCharPositionInLine():0), (((VectorremoverContext)_localctx).ID_VALIDO!=null?((VectorremoverContext)_localctx).ID_VALIDO.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				((VectorremoverContext)_localctx).ID_VALIDO = match(ID_VALIDO);
				setState(598);
				((VectorremoverContext)_localctx).PUNTO = match(PUNTO);
				setState(599);
				match(REMOVE);
				setState(600);
				match(PARIZQ);
				setState(601);
				match(AT);
				setState(602);
				match(DOS_PUNTOS);
				setState(603);
				((VectorremoverContext)_localctx).expr = expr(0);
				setState(604);
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
			setState(609);
			((VectorvacioContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(610);
			((VectorvacioContext)_localctx).PUNTO = match(PUNTO);
			setState(611);
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
			setState(614);
			((VectorcountContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(615);
			((VectorcountContext)_localctx).PUNTO = match(PUNTO);
			setState(616);
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
		public ExprContext expr;
		public Token CORCHDER;
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
		enterRule(_localctx, 54, RULE_vectoraccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			((VectoraccessContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(620);
			match(CORCHIZQ);
			setState(621);
			((VectoraccessContext)_localctx).expr = expr(0);
			setState(622);
			((VectoraccessContext)_localctx).CORCHDER = match(CORCHDER);
			 _localctx.vepposct = instructions.NewArregloAccess((((VectoraccessContext)_localctx).CORCHDER!=null?((VectoraccessContext)_localctx).CORCHDER.getLine():0), (((VectoraccessContext)_localctx).CORCHDER!=null?((VectoraccessContext)_localctx).CORCHDER.getCharPositionInLine():0), (((VectoraccessContext)_localctx).ID_VALIDO!=null?((VectoraccessContext)_localctx).ID_VALIDO.getText():null), ((VectoraccessContext)_localctx).expr.e)
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
		public TerminalNode FUNCION() { return getToken(SwiftGrammarParser.FUNCION, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
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
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public FunciondeclaracioncontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciondeclaracioncontrol; }
	}

	public final FunciondeclaracioncontrolContext funciondeclaracioncontrol() throws RecognitionException {
		FunciondeclaracioncontrolContext _localctx = new FunciondeclaracioncontrolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funciondeclaracioncontrol);
		int _la;
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(FUNCION);
				setState(626);
				match(ID_VALIDO);
				setState(627);
				match(PARIZQ);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (ID_VALIDO - 38)) | (1L << (COMA - 38)) | (1L << (GUIONBAJO - 38)))) != 0)) {
					{
					setState(628);
					listaparametros();
					}
				}

				setState(631);
				match(PARDER);
				setState(632);
				match(RETORNO);
				setState(633);
				tipodato();
				setState(634);
				match(LLAVEIZQ);
				setState(635);
				blockinterno();
				setState(636);
				match(LLAVEDER);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(FUNCION);
				setState(640);
				match(ID_VALIDO);
				setState(641);
				match(PARIZQ);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (ID_VALIDO - 38)) | (1L << (COMA - 38)) | (1L << (GUIONBAJO - 38)))) != 0)) {
					{
					setState(642);
					listaparametros();
					}
				}

				setState(645);
				match(PARDER);
				setState(646);
				match(LLAVEIZQ);
				setState(647);
				blockinterno();
				setState(648);
				match(LLAVEDER);

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

	public static class ListaparametrosContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public List<TerminalNode> ID_VALIDO() { return getTokens(SwiftGrammarParser.ID_VALIDO); }
		public TerminalNode ID_VALIDO(int i) {
			return getToken(SwiftGrammarParser.ID_VALIDO, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(SwiftGrammarParser.INOUT, 0); }
		public TerminalNode GUIONBAJO() { return getToken(SwiftGrammarParser.GUIONBAJO, 0); }
		public ListaparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaparametros; }
	}

	public final ListaparametrosContext listaparametros() throws RecognitionException {
		ListaparametrosContext _localctx = new ListaparametrosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listaparametros);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(COMA);
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(654);
					_la = _input.LA(1);
					if ( !(_la==ID_VALIDO || _la==GUIONBAJO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(657);
				match(ID_VALIDO);
				setState(658);
				match(DOS_PUNTOS);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(659);
					match(INOUT);
					}
				}

				setState(662);
				tipodato();
				setState(663);
				listaparametros();

				}
				break;
			case ID_VALIDO:
			case GUIONBAJO:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(666);
					_la = _input.LA(1);
					if ( !(_la==ID_VALIDO || _la==GUIONBAJO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(669);
				match(ID_VALIDO);
				setState(670);
				match(DOS_PUNTOS);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(671);
					match(INOUT);
					}
				}

				setState(674);
				tipodato();

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
		enterRule(_localctx, 60, RULE_funcionllamadacontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(ID_VALIDO);
			setState(680);
			match(PARIZQ);
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(681);
				listaparametrosllamada();
				}
				break;
			}
			setState(684);
			match(PARIZQ);

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
		enterRule(_localctx, 62, RULE_listaparametrosllamada);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				match(COMA);
				setState(690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(688);
					match(ID_VALIDO);
					setState(689);
					match(DOS_PUNTOS);
					}
					break;
				}
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(692);
					match(T__0);
					}
					break;
				}
				setState(695);
				expr(0);
				setState(696);
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
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(699);
					match(ID_VALIDO);
					setState(700);
					match(DOS_PUNTOS);
					}
					break;
				}
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(703);
					match(T__0);
					}
					break;
				}
				setState(706);
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
		enterRule(_localctx, 64, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(712);
			match(PARIZQ);
			setState(713);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(714);
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
		enterRule(_localctx, 66, RULE_intembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__0);
			setState(718);
			match(PARIZQ);
			setState(719);
			((IntembebidaContext)_localctx).expr = expr(0);
			setState(720);
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
		enterRule(_localctx, 68, RULE_floatembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(FLOAT);
			setState(724);
			match(PARIZQ);
			setState(725);
			((FloatembebidaContext)_localctx).expr = expr(0);
			setState(726);
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
		enterRule(_localctx, 70, RULE_stringembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(STRING);
			setState(730);
			match(PARIZQ);
			setState(731);
			((StringembebidaContext)_localctx).expr = expr(0);
			setState(732);
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
		enterRule(_localctx, 72, RULE_matrizcontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			((MatrizcontrolContext)_localctx).VAR = match(VAR);
			setState(736);
			((MatrizcontrolContext)_localctx).ID_VALIDO = match(ID_VALIDO);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(737);
				((MatrizcontrolContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(738);
				((MatrizcontrolContext)_localctx).tipomatriz = tipomatriz();
				}
			}

			setState(741);
			match(IG);
			setState(742);
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
		enterRule(_localctx, 74, RULE_tipomatriz);
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				((TipomatrizContext)_localctx).CORCHIZQ = match(CORCHIZQ);
				setState(746);
				((TipomatrizContext)_localctx).tipomatriz = tipomatriz();
				setState(747);
				match(CORCHDER);
				 
				    _localctx.tipomat = instructions.NewMatrizDimension((((TipomatrizContext)_localctx).CORCHIZQ!=null?((TipomatrizContext)_localctx).CORCHIZQ.getLine():0), (((TipomatrizContext)_localctx).CORCHIZQ!=null?((TipomatrizContext)_localctx).CORCHIZQ.getCharPositionInLine():0), ((TipomatrizContext)_localctx).tipomatriz.tipomat)

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				((TipomatrizContext)_localctx).CORCHIZQ = match(CORCHIZQ);
				setState(751);
				((TipomatrizContext)_localctx).tipodato = tipodato();
				setState(752);
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
		enterRule(_localctx, 76, RULE_defmatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
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
		enterRule(_localctx, 78, RULE_listavaloresmat);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				match(CORCHIZQ);
				setState(761);
				((ListavaloresmatContext)_localctx).listavaloresmat2 = listavaloresmat2(0);
				setState(762);
				match(CORCHDER);
				 _localctx.listvlamat = ((ListavaloresmatContext)_localctx).listavaloresmat2.mylisttmatt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_listavaloresmat2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORCHIZQ:
				{
				setState(771);
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
				setState(774);
				((Listavaloresmat2Context)_localctx).listaexpresions = listaexpresions();
				 _localctx.mylisttmatt = instructions.NewMatrizListaExpresion(((Listavaloresmat2Context)_localctx).listaexpresions.blkparf)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
					setState(779);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(780);
					match(COMA);
					setState(781);
					((Listavaloresmat2Context)_localctx).listavaloresmat = listavaloresmat();
					 _localctx.mylisttmatt = instructions.NewMatrizListaExpresionList(((Listavaloresmat2Context)_localctx).op.mylisttmatt, ((Listavaloresmat2Context)_localctx).listavaloresmat.listvlamat)
					}
					} 
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		enterRule(_localctx, 82, RULE_listaexpresions);

		    _localctx.blkparf = []interface{}{}
		    var listInt []IListaexpresionContext

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(789);
					((ListaexpresionsContext)_localctx).listaexpresion = listaexpresion();
					((ListaexpresionsContext)_localctx).funpar.add(((ListaexpresionsContext)_localctx).listaexpresion);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(792); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		enterRule(_localctx, 84, RULE_listaexpresion);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				((ListaexpresionContext)_localctx).COMA = match(COMA);
				setState(797);
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
				setState(800);
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
		enterRule(_localctx, 86, RULE_simplematriz);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				((SimplematrizContext)_localctx).tipomatriz = tipomatriz();
				setState(806);
				match(PARIZQ);
				setState(807);
				match(REPEATING);
				setState(808);
				match(DOS_PUNTOS);
				setState(809);
				((SimplematrizContext)_localctx).op = simplematriz();
				setState(810);
				match(COMA);
				setState(811);
				match(COUNT);
				setState(812);
				match(DOS_PUNTOS);
				setState(813);
				((SimplematrizContext)_localctx).NUMBER = match(NUMBER);
				setState(814);
				match(PARDER);
				 _localctx.simmat = instructions.NewMatrizSimpleUno(((SimplematrizContext)_localctx).tipomatriz.tipomat, ((SimplematrizContext)_localctx).op.simmat, (((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getText():null), (((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getLine():0),(((SimplematrizContext)_localctx).NUMBER!=null?((SimplematrizContext)_localctx).NUMBER.getCharPositionInLine():0))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				((SimplematrizContext)_localctx).tipomatriz = tipomatriz();
				setState(818);
				match(PARIZQ);
				setState(819);
				match(REPEATING);
				setState(820);
				match(DOS_PUNTOS);
				setState(821);
				((SimplematrizContext)_localctx).expr = expr(0);
				setState(822);
				match(COMA);
				setState(823);
				match(COUNT);
				setState(824);
				match(DOS_PUNTOS);
				setState(825);
				((SimplematrizContext)_localctx).NUMBER = match(NUMBER);
				setState(826);
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

	public static class MatrizasignacionContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public List<TerminalNode> CORCHIZQ() { return getTokens(SwiftGrammarParser.CORCHIZQ); }
		public TerminalNode CORCHIZQ(int i) {
			return getToken(SwiftGrammarParser.CORCHIZQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CORCHDER() { return getTokens(SwiftGrammarParser.CORCHDER); }
		public TerminalNode CORCHDER(int i) {
			return getToken(SwiftGrammarParser.CORCHDER, i);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public MatrizasignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrizasignacion; }
	}

	public final MatrizasignacionContext matrizasignacion() throws RecognitionException {
		MatrizasignacionContext _localctx = new MatrizasignacionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_matrizasignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(ID_VALIDO);
			setState(832);
			match(CORCHIZQ);
			setState(833);
			expr(0);
			setState(834);
			match(CORCHDER);
			setState(835);
			match(CORCHIZQ);
			setState(836);
			expr(0);
			setState(837);
			match(CORCHDER);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CORCHIZQ) {
				{
				{
				setState(838);
				match(CORCHIZQ);
				setState(839);
				expr(0);
				setState(840);
				match(CORCHDER);
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(847);
			match(IG);
			setState(848);
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

	public static class MatrizobtenerContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public List<TerminalNode> CORCHIZQ() { return getTokens(SwiftGrammarParser.CORCHIZQ); }
		public TerminalNode CORCHIZQ(int i) {
			return getToken(SwiftGrammarParser.CORCHIZQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CORCHDER() { return getTokens(SwiftGrammarParser.CORCHDER); }
		public TerminalNode CORCHDER(int i) {
			return getToken(SwiftGrammarParser.CORCHDER, i);
		}
		public MatrizobtenerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrizobtener; }
	}

	public final MatrizobtenerContext matrizobtener() throws RecognitionException {
		MatrizobtenerContext _localctx = new MatrizobtenerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_matrizobtener);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(ID_VALIDO);
			setState(852);
			match(CORCHIZQ);
			setState(853);
			expr(0);
			setState(854);
			match(CORCHDER);
			setState(855);
			match(CORCHIZQ);
			setState(856);
			expr(0);
			setState(857);
			match(CORCHDER);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CORCHIZQ) {
				{
				{
				setState(858);
				match(CORCHIZQ);
				setState(859);
				expr(0);
				setState(860);
				match(CORCHDER);
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 40:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0368\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\6\3d\n\3\r\3\16\3e\3\3\3\3"+
		"\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\4\3\4\3\4\3\4\5\4x\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0099\n"+
		"\4\3\4\3\4\3\4\3\4\5\4\u009f\n\4\3\4\3\4\5\4\u00a3\n\4\3\5\6\5\u00a6\n"+
		"\5\r\5\16\5\u00a7\3\5\3\5\3\6\3\6\5\6\u00ae\n\6\3\6\3\6\3\6\3\6\5\6\u00b4"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u00ba\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cf\n\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00d5\n\6\3\6\3\6\3\6\3\6\5\6\u00db\n\6\3\6\3\6\3\6\3\6\5\6\u00e1"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u00e7\n\6\3\6\3\6\3\6\3\6\5\6\u00ed\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00f3\n\6\3\6\3\6\5\6\u00f7\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010e"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u011e"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u012f"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u013b\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u016a\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0194\n\13\f\13\16\13\u0197\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u01b4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01bd"+
		"\n\r\3\r\3\r\3\r\3\16\6\16\u01c3\n\16\r\16\16\16\u01c4\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u01ea\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0200\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0223\n\26\3\27\6\27\u0226\n"+
		"\27\r\27\16\27\u0227\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0233\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0250\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0262\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\5\36\u0278\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0286\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u028e\n"+
		"\36\3\37\3\37\5\37\u0292\n\37\3\37\3\37\3\37\5\37\u0297\n\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u029e\n\37\3\37\3\37\3\37\5\37\u02a3\n\37\3\37\3"+
		"\37\3\37\5\37\u02a8\n\37\3 \3 \3 \5 \u02ad\n \3 \3 \3 \3!\3!\3!\5!\u02b5"+
		"\n!\3!\5!\u02b8\n!\3!\3!\3!\3!\3!\3!\5!\u02c0\n!\3!\5!\u02c3\n!\3!\3!"+
		"\3!\5!\u02c8\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\5&\u02e6\n&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02f6\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u0303\n)\3*\3*\3*\3*\3*\3*\3*\5*\u030c\n*\3*\3*\3*\3*\3*\7"+
		"*\u0313\n*\f*\16*\u0316\13*\3+\6+\u0319\n+\r+\16+\u031a\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\5,\u0326\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0340\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\7.\u034d\n.\f.\16.\u0350\13.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\7/\u0361\n/\f/\16/\u0364\13/\3/\3/\3/\2\4\24R\60\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2"+
		"\b\3\2;<\3\2=>\4\2\66\6688\4\2\67\6799\3\2\61\62\4\2((FF\2\u03aa\2^\3"+
		"\2\2\2\4c\3\2\2\2\6\u00a2\3\2\2\2\b\u00a5\3\2\2\2\n\u00f6\3\2\2\2\f\u010d"+
		"\3\2\2\2\16\u011d\3\2\2\2\20\u012e\3\2\2\2\22\u013a\3\2\2\2\24\u0169\3"+
		"\2\2\2\26\u01b3\3\2\2\2\30\u01b5\3\2\2\2\32\u01c2\3\2\2\2\34\u01c8\3\2"+
		"\2\2\36\u01ce\3\2\2\2 \u01e9\3\2\2\2\"\u01eb\3\2\2\2$\u01f3\3\2\2\2&\u01f6"+
		"\3\2\2\2(\u01ff\3\2\2\2*\u0222\3\2\2\2,\u0225\3\2\2\2.\u0232\3\2\2\2\60"+
		"\u024f\3\2\2\2\62\u0261\3\2\2\2\64\u0263\3\2\2\2\66\u0268\3\2\2\28\u026d"+
		"\3\2\2\2:\u028d\3\2\2\2<\u02a7\3\2\2\2>\u02a9\3\2\2\2@\u02c7\3\2\2\2B"+
		"\u02c9\3\2\2\2D\u02cf\3\2\2\2F\u02d5\3\2\2\2H\u02db\3\2\2\2J\u02e1\3\2"+
		"\2\2L\u02f5\3\2\2\2N\u02f7\3\2\2\2P\u0302\3\2\2\2R\u030b\3\2\2\2T\u0318"+
		"\3\2\2\2V\u0325\3\2\2\2X\u033f\3\2\2\2Z\u0341\3\2\2\2\\\u0355\3\2\2\2"+
		"^_\5\4\3\2_`\7\2\2\3`a\b\2\1\2a\3\3\2\2\2bd\5\6\4\2cb\3\2\2\2de\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\3\1\2h\5\3\2\2\2ik\5\f\7\2jl\7-\2"+
		"\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\4\1\2n\u00a3\3\2\2\2oq\5\16\b\2p"+
		"r\7-\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\4\1\2t\u00a3\3\2\2\2uw\5\20"+
		"\t\2vx\7-\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\4\1\2z\u00a3\3\2\2\2{"+
		"|\5\26\f\2|}\b\4\1\2}\u00a3\3\2\2\2~\177\5\30\r\2\177\u0080\b\4\1\2\u0080"+
		"\u00a3\3\2\2\2\u0081\u0082\5\36\20\2\u0082\u0083\b\4\1\2\u0083\u00a3\3"+
		"\2\2\2\u0084\u0085\5 \21\2\u0085\u0086\b\4\1\2\u0086\u00a3\3\2\2\2\u0087"+
		"\u0088\5\"\22\2\u0088\u0089\b\4\1\2\u0089\u00a3\3\2\2\2\u008a\u008c\5"+
		"*\26\2\u008b\u008d\7-\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\4\1\2\u008f\u00a3\3\2\2\2\u0090\u0091\5\60"+
		"\31\2\u0091\u0092\b\4\1\2\u0092\u00a3\3\2\2\2\u0093\u0094\5\62\32\2\u0094"+
		"\u0095\b\4\1\2\u0095\u00a3\3\2\2\2\u0096\u0098\5B\"\2\u0097\u0099\7-\2"+
		"\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\b\4\1\2\u009b\u00a3\3\2\2\2\u009c\u009e\5J&\2\u009d\u009f\7-\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\4"+
		"\1\2\u00a1\u00a3\3\2\2\2\u00a2i\3\2\2\2\u00a2o\3\2\2\2\u00a2u\3\2\2\2"+
		"\u00a2{\3\2\2\2\u00a2~\3\2\2\2\u00a2\u0081\3\2\2\2\u00a2\u0084\3\2\2\2"+
		"\u00a2\u0087\3\2\2\2\u00a2\u008a\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0093"+
		"\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\7\3\2\2\2\u00a4"+
		"\u00a6\5\n\6\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\5\1\2\u00aa"+
		"\t\3\2\2\2\u00ab\u00ad\5\f\7\2\u00ac\u00ae\7-\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\6\1\2\u00b0\u00f7"+
		"\3\2\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b4\7-\2\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\6\1\2\u00b6\u00f7\3\2"+
		"\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00ba\7-\2\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\6\1\2\u00bc\u00f7\3\2"+
		"\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\b\6\1\2\u00bf\u00f7\3\2\2\2\u00c0"+
		"\u00c1\5\30\r\2\u00c1\u00c2\b\6\1\2\u00c2\u00f7\3\2\2\2\u00c3\u00c4\5"+
		"\36\20\2\u00c4\u00c5\b\6\1\2\u00c5\u00f7\3\2\2\2\u00c6\u00c7\5 \21\2\u00c7"+
		"\u00c8\b\6\1\2\u00c8\u00f7\3\2\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb\b"+
		"\6\1\2\u00cb\u00f7\3\2\2\2\u00cc\u00ce\5$\23\2\u00cd\u00cf\7-\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\6"+
		"\1\2\u00d1\u00f7\3\2\2\2\u00d2\u00d4\5&\24\2\u00d3\u00d5\7-\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\6"+
		"\1\2\u00d7\u00f7\3\2\2\2\u00d8\u00da\5(\25\2\u00d9\u00db\7-\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\6"+
		"\1\2\u00dd\u00f7\3\2\2\2\u00de\u00e0\5*\26\2\u00df\u00e1\7-\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\6"+
		"\1\2\u00e3\u00f7\3\2\2\2\u00e4\u00e6\5\60\31\2\u00e5\u00e7\7-\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\6"+
		"\1\2\u00e9\u00f7\3\2\2\2\u00ea\u00ec\5\62\32\2\u00eb\u00ed\7-\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\6"+
		"\1\2\u00ef\u00f7\3\2\2\2\u00f0\u00f2\5B\"\2\u00f1\u00f3\7-\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\6\1\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00ab\3\2\2\2\u00f6\u00b1\3\2\2\2\u00f6\u00b7\3\2"+
		"\2\2\u00f6\u00bd\3\2\2\2\u00f6\u00c0\3\2\2\2\u00f6\u00c3\3\2\2\2\u00f6"+
		"\u00c6\3\2\2\2\u00f6\u00c9\3\2\2\2\u00f6\u00cc\3\2\2\2\u00f6\u00d2\3\2"+
		"\2\2\u00f6\u00d8\3\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6"+
		"\u00ea\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7\13\3\2\2\2\u00f8\u00f9\7\n\2"+
		"\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\5\22\n\2\u00fc\u00fd"+
		"\7+\2\2\u00fd\u00fe\5\24\13\2\u00fe\u00ff\b\7\1\2\u00ff\u010e\3\2\2\2"+
		"\u0100\u0101\7\n\2\2\u0101\u0102\7(\2\2\u0102\u0103\7+\2\2\u0103\u0104"+
		"\5\24\13\2\u0104\u0105\b\7\1\2\u0105\u010e\3\2\2\2\u0106\u0107\7\n\2\2"+
		"\u0107\u0108\7(\2\2\u0108\u0109\7,\2\2\u0109\u010a\5\22\n\2\u010a\u010b"+
		"\7.\2\2\u010b\u010c\b\7\1\2\u010c\u010e\3\2\2\2\u010d\u00f8\3\2\2\2\u010d"+
		"\u0100\3\2\2\2\u010d\u0106\3\2\2\2\u010e\r\3\2\2\2\u010f\u0110\7\13\2"+
		"\2\u0110\u0111\7(\2\2\u0111\u0112\7,\2\2\u0112\u0113\5\22\n\2\u0113\u0114"+
		"\7+\2\2\u0114\u0115\5\24\13\2\u0115\u0116\b\b\1\2\u0116\u011e\3\2\2\2"+
		"\u0117\u0118\7\13\2\2\u0118\u0119\7(\2\2\u0119\u011a\7+\2\2\u011a\u011b"+
		"\5\24\13\2\u011b\u011c\b\b\1\2\u011c\u011e\3\2\2\2\u011d\u010f\3\2\2\2"+
		"\u011d\u0117\3\2\2\2\u011e\17\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0121\7"+
		"+\2\2\u0121\u0122\5\24\13\2\u0122\u0123\b\t\1\2\u0123\u012f\3\2\2\2\u0124"+
		"\u0125\7(\2\2\u0125\u0126\7?\2\2\u0126\u0127\5\24\13\2\u0127\u0128\b\t"+
		"\1\2\u0128\u012f\3\2\2\2\u0129\u012a\7(\2\2\u012a\u012b\7@\2\2\u012b\u012c"+
		"\5\24\13\2\u012c\u012d\b\t\1\2\u012d\u012f\3\2\2\2\u012e\u011f\3\2\2\2"+
		"\u012e\u0124\3\2\2\2\u012e\u0129\3\2\2\2\u012f\21\3\2\2\2\u0130\u0131"+
		"\7\3\2\2\u0131\u013b\b\n\1\2\u0132\u0133\7\4\2\2\u0133\u013b\b\n\1\2\u0134"+
		"\u0135\7\5\2\2\u0135\u013b\b\n\1\2\u0136\u0137\7\6\2\2\u0137\u013b\b\n"+
		"\1\2\u0138\u0139\7\7\2\2\u0139\u013b\b\n\1\2\u013a\u0130\3\2\2\2\u013a"+
		"\u0132\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\23\3\2\2\2\u013c\u013d\b\13\1\2\u013d\u013e\7\63\2\2\u013e"+
		"\u013f\5\24\13\32\u013f\u0140\b\13\1\2\u0140\u016a\3\2\2\2\u0141\u0142"+
		"\7/\2\2\u0142\u0143\5\24\13\2\u0143\u0144\7\60\2\2\u0144\u0145\b\13\1"+
		"\2\u0145\u016a\3\2\2\2\u0146\u0147\7>\2\2\u0147\u0148\7&\2\2\u0148\u016a"+
		"\b\13\1\2\u0149\u014a\7&\2\2\u014a\u016a\b\13\1\2\u014b\u014c\7\'\2\2"+
		"\u014c\u016a\b\13\1\2\u014d\u014e\7\b\2\2\u014e\u016a\b\13\1\2\u014f\u0150"+
		"\7\t\2\2\u0150\u016a\b\13\1\2\u0151\u0152\7)\2\2\u0152\u016a\b\13\1\2"+
		"\u0153\u0154\7(\2\2\u0154\u016a\b\13\1\2\u0155\u0156\7\f\2\2\u0156\u016a"+
		"\b\13\1\2\u0157\u0158\5\64\33\2\u0158\u0159\b\13\1\2\u0159\u016a\3\2\2"+
		"\2\u015a\u015b\5\66\34\2\u015b\u015c\b\13\1\2\u015c\u016a\3\2\2\2\u015d"+
		"\u015e\58\35\2\u015e\u015f\b\13\1\2\u015f\u016a\3\2\2\2\u0160\u0161\5"+
		"D#\2\u0161\u0162\b\13\1\2\u0162\u016a\3\2\2\2\u0163\u0164\5F$\2\u0164"+
		"\u0165\b\13\1\2\u0165\u016a\3\2\2\2\u0166\u0167\5H%\2\u0167\u0168\b\13"+
		"\1\2\u0168\u016a\3\2\2\2\u0169\u013c\3\2\2\2\u0169\u0141\3\2\2\2\u0169"+
		"\u0146\3\2\2\2\u0169\u0149\3\2\2\2\u0169\u014b\3\2\2\2\u0169\u014d\3\2"+
		"\2\2\u0169\u014f\3\2\2\2\u0169\u0151\3\2\2\2\u0169\u0153\3\2\2\2\u0169"+
		"\u0155\3\2\2\2\u0169\u0157\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u015d\3\2"+
		"\2\2\u0169\u0160\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0166\3\2\2\2\u016a"+
		"\u0195\3\2\2\2\u016b\u016c\f\31\2\2\u016c\u016d\7:\2\2\u016d\u016e\5\24"+
		"\13\32\u016e\u016f\b\13\1\2\u016f\u0194\3\2\2\2\u0170\u0171\f\30\2\2\u0171"+
		"\u0172\t\2\2\2\u0172\u0173\5\24\13\31\u0173\u0174\b\13\1\2\u0174\u0194"+
		"\3\2\2\2\u0175\u0176\f\27\2\2\u0176\u0177\t\3\2\2\u0177\u0178\5\24\13"+
		"\30\u0178\u0179\b\13\1\2\u0179\u0194\3\2\2\2\u017a\u017b\f\26\2\2\u017b"+
		"\u017c\t\4\2\2\u017c\u017d\5\24\13\27\u017d\u017e\b\13\1\2\u017e\u0194"+
		"\3\2\2\2\u017f\u0180\f\25\2\2\u0180\u0181\t\5\2\2\u0181\u0182\5\24\13"+
		"\26\u0182\u0183\b\13\1\2\u0183\u0194\3\2\2\2\u0184\u0185\f\24\2\2\u0185"+
		"\u0186\t\6\2\2\u0186\u0187\5\24\13\25\u0187\u0188\b\13\1\2\u0188\u0194"+
		"\3\2\2\2\u0189\u018a\f\23\2\2\u018a\u018b\7\65\2\2\u018b\u018c\5\24\13"+
		"\24\u018c\u018d\b\13\1\2\u018d\u0194\3\2\2\2\u018e\u018f\f\22\2\2\u018f"+
		"\u0190\7\64\2\2\u0190\u0191\5\24\13\23\u0191\u0192\b\13\1\2\u0192\u0194"+
		"\3\2\2\2\u0193\u016b\3\2\2\2\u0193\u0170\3\2\2\2\u0193\u0175\3\2\2\2\u0193"+
		"\u017a\3\2\2\2\u0193\u017f\3\2\2\2\u0193\u0184\3\2\2\2\u0193\u0189\3\2"+
		"\2\2\u0193\u018e\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\25\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\r\2"+
		"\2\u0199\u019a\5\24\13\2\u019a\u019b\7A\2\2\u019b\u019c\5\b\5\2\u019c"+
		"\u019d\7B\2\2\u019d\u019e\b\f\1\2\u019e\u01b4\3\2\2\2\u019f\u01a0\7\r"+
		"\2\2\u01a0\u01a1\5\24\13\2\u01a1\u01a2\7A\2\2\u01a2\u01a3\5\b\5\2\u01a3"+
		"\u01a4\7B\2\2\u01a4\u01a5\7\16\2\2\u01a5\u01a6\7A\2\2\u01a6\u01a7\5\b"+
		"\5\2\u01a7\u01a8\7B\2\2\u01a8\u01a9\b\f\1\2\u01a9\u01b4\3\2\2\2\u01aa"+
		"\u01ab\7\r\2\2\u01ab\u01ac\5\24\13\2\u01ac\u01ad\7A\2\2\u01ad\u01ae\5"+
		"\b\5\2\u01ae\u01af\7B\2\2\u01af\u01b0\7\16\2\2\u01b0\u01b1\5\26\f\2\u01b1"+
		"\u01b2\b\f\1\2\u01b2\u01b4\3\2\2\2\u01b3\u0198\3\2\2\2\u01b3\u019f\3\2"+
		"\2\2\u01b3\u01aa\3\2\2\2\u01b4\27\3\2\2\2\u01b5\u01b6\7\17\2\2\u01b6\u01b7"+
		"\5\24\13\2\u01b7\u01b8\7A\2\2\u01b8\u01bc\5\32\16\2\u01b9\u01ba\7\21\2"+
		"\2\u01ba\u01bb\7,\2\2\u01bb\u01bd\5\b\5\2\u01bc\u01b9\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7B\2\2\u01bf\u01c0\b\r\1\2\u01c0"+
		"\31\3\2\2\2\u01c1\u01c3\5\34\17\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\b\16\1\2\u01c7\33\3\2\2\2\u01c8\u01c9\7\20\2\2\u01c9\u01ca\5\24"+
		"\13\2\u01ca\u01cb\7,\2\2\u01cb\u01cc\5\b\5\2\u01cc\u01cd\b\17\1\2\u01cd"+
		"\35\3\2\2\2\u01ce\u01cf\7\27\2\2\u01cf\u01d0\5\24\13\2\u01d0\u01d1\7A"+
		"\2\2\u01d1\u01d2\5\b\5\2\u01d2\u01d3\7B\2\2\u01d3\u01d4\b\20\1\2\u01d4"+
		"\37\3\2\2\2\u01d5\u01d6\7\24\2\2\u01d6\u01d7\7(\2\2\u01d7\u01d8\7\25\2"+
		"\2\u01d8\u01d9\5\24\13\2\u01d9\u01da\7\26\2\2\u01da\u01db\5\24\13\2\u01db"+
		"\u01dc\7A\2\2\u01dc\u01dd\5\b\5\2\u01dd\u01de\7B\2\2\u01de\u01df\b\21"+
		"\1\2\u01df\u01ea\3\2\2\2\u01e0\u01e1\7\24\2\2\u01e1\u01e2\7(\2\2\u01e2"+
		"\u01e3\7\25\2\2\u01e3\u01e4\5\24\13\2\u01e4\u01e5\7A\2\2\u01e5\u01e6\5"+
		"\b\5\2\u01e6\u01e7\7B\2\2\u01e7\u01e8\b\21\1\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01d5\3\2\2\2\u01e9\u01e0\3\2\2\2\u01ea!\3\2\2\2\u01eb\u01ec\7\30\2\2"+
		"\u01ec\u01ed\5\24\13\2\u01ed\u01ee\7\16\2\2\u01ee\u01ef\7A\2\2\u01ef\u01f0"+
		"\5\b\5\2\u01f0\u01f1\7B\2\2\u01f1\u01f2\b\22\1\2\u01f2#\3\2\2\2\u01f3"+
		"\u01f4\7\23\2\2\u01f4\u01f5\b\23\1\2\u01f5%\3\2\2\2\u01f6\u01f7\7\22\2"+
		"\2\u01f7\u01f8\b\24\1\2\u01f8\'\3\2\2\2\u01f9\u01fa\7\31\2\2\u01fa\u0200"+
		"\b\25\1\2\u01fb\u01fc\7\31\2\2\u01fc\u01fd\5\24\13\2\u01fd\u01fe\b\25"+
		"\1\2\u01fe\u0200\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200"+
		")\3\2\2\2\u0201\u0202\7\n\2\2\u0202\u0203\7(\2\2\u0203\u0204\7,\2\2\u0204"+
		"\u0205\7G\2\2\u0205\u0206\5\22\n\2\u0206\u0207\7H\2\2\u0207\u0208\7+\2"+
		"\2\u0208\u0209\7G\2\2\u0209\u020a\5,\27\2\u020a\u020b\7H\2\2\u020b\u020c"+
		"\b\26\1\2\u020c\u0223\3\2\2\2\u020d\u020e\7\n\2\2\u020e\u020f\7(\2\2\u020f"+
		"\u0210\7,\2\2\u0210\u0211\7G\2\2\u0211\u0212\5\22\n\2\u0212\u0213\7H\2"+
		"\2\u0213\u0214\7+\2\2\u0214\u0215\7G\2\2\u0215\u0216\7H\2\2\u0216\u0217"+
		"\b\26\1\2\u0217\u0223\3\2\2\2\u0218\u0219\7\n\2\2\u0219\u021a\7(\2\2\u021a"+
		"\u021b\7,\2\2\u021b\u021c\7G\2\2\u021c\u021d\5\22\n\2\u021d\u021e\7H\2"+
		"\2\u021e\u021f\7+\2\2\u021f\u0220\7(\2\2\u0220\u0221\b\26\1\2\u0221\u0223"+
		"\3\2\2\2\u0222\u0201\3\2\2\2\u0222\u020d\3\2\2\2\u0222\u0218\3\2\2\2\u0223"+
		"+\3\2\2\2\u0224\u0226\5.\30\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2"+
		"\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a"+
		"\b\27\1\2\u022a-\3\2\2\2\u022b\u022c\7D\2\2\u022c\u022d\5\24\13\2\u022d"+
		"\u022e\b\30\1\2\u022e\u0233\3\2\2\2\u022f\u0230\5\24\13\2\u0230\u0231"+
		"\b\30\1\2\u0231\u0233\3\2\2\2\u0232\u022b\3\2\2\2\u0232\u022f\3\2\2\2"+
		"\u0233/\3\2\2\2\u0234\u0235\7(\2\2\u0235\u0236\7E\2\2\u0236\u0237\7\35"+
		"\2\2\u0237\u0238\7/\2\2\u0238\u0239\5\24\13\2\u0239\u023a\7\60\2\2\u023a"+
		"\u023b\b\31\1\2\u023b\u0250\3\2\2\2\u023c\u023d\7(\2\2\u023d\u023e\7G"+
		"\2\2\u023e\u023f\5\24\13\2\u023f\u0240\7H\2\2\u0240\u0241\7+\2\2\u0241"+
		"\u0242\7(\2\2\u0242\u0243\7G\2\2\u0243\u0244\5\24\13\2\u0244\u0245\7H"+
		"\2\2\u0245\u0246\b\31\1\2\u0246\u0250\3\2\2\2\u0247\u0248\7(\2\2\u0248"+
		"\u0249\7G\2\2\u0249\u024a\5\24\13\2\u024a\u024b\7H\2\2\u024b\u024c\7+"+
		"\2\2\u024c\u024d\5\24\13\2\u024d\u024e\b\31\1\2\u024e\u0250\3\2\2\2\u024f"+
		"\u0234\3\2\2\2\u024f\u023c\3\2\2\2\u024f\u0247\3\2\2\2\u0250\61\3\2\2"+
		"\2\u0251\u0252\7(\2\2\u0252\u0253\7E\2\2\u0253\u0254\7\37\2\2\u0254\u0255"+
		"\7/\2\2\u0255\u0256\7\60\2\2\u0256\u0262\b\32\1\2\u0257\u0258\7(\2\2\u0258"+
		"\u0259\7E\2\2\u0259\u025a\7\36\2\2\u025a\u025b\7/\2\2\u025b\u025c\7\""+
		"\2\2\u025c\u025d\7,\2\2\u025d\u025e\5\24\13\2\u025e\u025f\7\60\2\2\u025f"+
		"\u0260\b\32\1\2\u0260\u0262\3\2\2\2\u0261\u0251\3\2\2\2\u0261\u0257\3"+
		"\2\2\2\u0262\63\3\2\2\2\u0263\u0264\7(\2\2\u0264\u0265\7E\2\2\u0265\u0266"+
		"\7!\2\2\u0266\u0267\b\33\1\2\u0267\65\3\2\2\2\u0268\u0269\7(\2\2\u0269"+
		"\u026a\7E\2\2\u026a\u026b\7 \2\2\u026b\u026c\b\34\1\2\u026c\67\3\2\2\2"+
		"\u026d\u026e\7(\2\2\u026e\u026f\7G\2\2\u026f\u0270\5\24\13\2\u0270\u0271"+
		"\7H\2\2\u0271\u0272\b\35\1\2\u02729\3\2\2\2\u0273\u0274\7\32\2\2\u0274"+
		"\u0275\7(\2\2\u0275\u0277\7/\2\2\u0276\u0278\5<\37\2\u0277\u0276\3\2\2"+
		"\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7\60\2\2\u027a"+
		"\u027b\7C\2\2\u027b\u027c\5\22\n\2\u027c\u027d\7A\2\2\u027d\u027e\5\b"+
		"\5\2\u027e\u027f\7B\2\2\u027f\u0280\b\36\1\2\u0280\u028e\3\2\2\2\u0281"+
		"\u0282\7\32\2\2\u0282\u0283\7(\2\2\u0283\u0285\7/\2\2\u0284\u0286\5<\37"+
		"\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\7\60\2\2\u0288\u0289\7A\2\2\u0289\u028a\5\b\5\2\u028a\u028b\7B\2\2\u028b"+
		"\u028c\b\36\1\2\u028c\u028e\3\2\2\2\u028d\u0273\3\2\2\2\u028d\u0281\3"+
		"\2\2\2\u028e;\3\2\2\2\u028f\u0291\7D\2\2\u0290\u0292\t\7\2\2\u0291\u0290"+
		"\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\7(\2\2\u0294"+
		"\u0296\7,\2\2\u0295\u0297\7\34\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\22\n\2\u0299\u029a\5<\37\2\u029a"+
		"\u029b\b\37\1\2\u029b\u02a8\3\2\2\2\u029c\u029e\t\7\2\2\u029d\u029c\3"+
		"\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7(\2\2\u02a0"+
		"\u02a2\7,\2\2\u02a1\u02a3\7\34\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\5\22\n\2\u02a5\u02a6\b\37\1\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u028f\3\2\2\2\u02a7\u029d\3\2\2\2\u02a8=\3\2\2\2"+
		"\u02a9\u02aa\7(\2\2\u02aa\u02ac\7/\2\2\u02ab\u02ad\5@!\2\u02ac\u02ab\3"+
		"\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7/\2\2\u02af"+
		"\u02b0\b \1\2\u02b0?\3\2\2\2\u02b1\u02b4\7D\2\2\u02b2\u02b3\7(\2\2\u02b3"+
		"\u02b5\7,\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2"+
		"\2\2\u02b6\u02b8\7\3\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02ba\5\24\13\2\u02ba\u02bb\5@!\2\u02bb\u02bc\b!"+
		"\1\2\u02bc\u02c8\3\2\2\2\u02bd\u02be\7(\2\2\u02be\u02c0\7,\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02c3\7\3\2\2\u02c2"+
		"\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\5\24"+
		"\13\2\u02c5\u02c6\b!\1\2\u02c6\u02c8\3\2\2\2\u02c7\u02b1\3\2\2\2\u02c7"+
		"\u02bf\3\2\2\2\u02c8A\3\2\2\2\u02c9\u02ca\7\33\2\2\u02ca\u02cb\7/\2\2"+
		"\u02cb\u02cc\5\24\13\2\u02cc\u02cd\7\60\2\2\u02cd\u02ce\b\"\1\2\u02ce"+
		"C\3\2\2\2\u02cf\u02d0\7\3\2\2\u02d0\u02d1\7/\2\2\u02d1\u02d2\5\24\13\2"+
		"\u02d2\u02d3\7\60\2\2\u02d3\u02d4\b#\1\2\u02d4E\3\2\2\2\u02d5\u02d6\7"+
		"\4\2\2\u02d6\u02d7\7/\2\2\u02d7\u02d8\5\24\13\2\u02d8\u02d9\7\60\2\2\u02d9"+
		"\u02da\b$\1\2\u02daG\3\2\2\2\u02db\u02dc\7\5\2\2\u02dc\u02dd\7/\2\2\u02dd"+
		"\u02de\5\24\13\2\u02de\u02df\7\60\2\2\u02df\u02e0\b%\1\2\u02e0I\3\2\2"+
		"\2\u02e1\u02e2\7\n\2\2\u02e2\u02e5\7(\2\2\u02e3\u02e4\7,\2\2\u02e4\u02e6"+
		"\5L\'\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\7+\2\2\u02e8\u02e9\5N(\2\u02e9\u02ea\b&\1\2\u02eaK\3\2\2\2\u02eb"+
		"\u02ec\7G\2\2\u02ec\u02ed\5L\'\2\u02ed\u02ee\7H\2\2\u02ee\u02ef\b\'\1"+
		"\2\u02ef\u02f6\3\2\2\2\u02f0\u02f1\7G\2\2\u02f1\u02f2\5\22\n\2\u02f2\u02f3"+
		"\7H\2\2\u02f3\u02f4\b\'\1\2\u02f4\u02f6\3\2\2\2\u02f5\u02eb\3\2\2\2\u02f5"+
		"\u02f0\3\2\2\2\u02f6M\3\2\2\2\u02f7\u02f8\5P)\2\u02f8\u02f9\b(\1\2\u02f9"+
		"O\3\2\2\2\u02fa\u02fb\7G\2\2\u02fb\u02fc\5R*\2\u02fc\u02fd\7H\2\2\u02fd"+
		"\u02fe\b)\1\2\u02fe\u0303\3\2\2\2\u02ff\u0300\5X-\2\u0300\u0301\b)\1\2"+
		"\u0301\u0303\3\2\2\2\u0302\u02fa\3\2\2\2\u0302\u02ff\3\2\2\2\u0303Q\3"+
		"\2\2\2\u0304\u0305\b*\1\2\u0305\u0306\5P)\2\u0306\u0307\b*\1\2\u0307\u030c"+
		"\3\2\2\2\u0308\u0309\5T+\2\u0309\u030a\b*\1\2\u030a\u030c\3\2\2\2\u030b"+
		"\u0304\3\2\2\2\u030b\u0308\3\2\2\2\u030c\u0314\3\2\2\2\u030d\u030e\f\5"+
		"\2\2\u030e\u030f\7D\2\2\u030f\u0310\5P)\2\u0310\u0311\b*\1\2\u0311\u0313"+
		"\3\2\2\2\u0312\u030d\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315S\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0319\5V,\2\u0318"+
		"\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2"+
		"\2\2\u031b\u031c\3\2\2\2\u031c\u031d\b+\1\2\u031dU\3\2\2\2\u031e\u031f"+
		"\7D\2\2\u031f\u0320\5\24\13\2\u0320\u0321\b,\1\2\u0321\u0326\3\2\2\2\u0322"+
		"\u0323\5\24\13\2\u0323\u0324\b,\1\2\u0324\u0326\3\2\2\2\u0325\u031e\3"+
		"\2\2\2\u0325\u0322\3\2\2\2\u0326W\3\2\2\2\u0327\u0328\5L\'\2\u0328\u0329"+
		"\7/\2\2\u0329\u032a\7#\2\2\u032a\u032b\7,\2\2\u032b\u032c\5X-\2\u032c"+
		"\u032d\7D\2\2\u032d\u032e\7 \2\2\u032e\u032f\7,\2\2\u032f\u0330\7&\2\2"+
		"\u0330\u0331\7\60\2\2\u0331\u0332\b-\1\2\u0332\u0340\3\2\2\2\u0333\u0334"+
		"\5L\'\2\u0334\u0335\7/\2\2\u0335\u0336\7#\2\2\u0336\u0337\7,\2\2\u0337"+
		"\u0338\5\24\13\2\u0338\u0339\7D\2\2\u0339\u033a\7 \2\2\u033a\u033b\7,"+
		"\2\2\u033b\u033c\7&\2\2\u033c\u033d\7\60\2\2\u033d\u033e\b-\1\2\u033e"+
		"\u0340\3\2\2\2\u033f\u0327\3\2\2\2\u033f\u0333\3\2\2\2\u0340Y\3\2\2\2"+
		"\u0341\u0342\7(\2\2\u0342\u0343\7G\2\2\u0343\u0344\5\24\13\2\u0344\u0345"+
		"\7H\2\2\u0345\u0346\7G\2\2\u0346\u0347\5\24\13\2\u0347\u034e\7H\2\2\u0348"+
		"\u0349\7G\2\2\u0349\u034a\5\24\13\2\u034a\u034b\7H\2\2\u034b\u034d\3\2"+
		"\2\2\u034c\u0348\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\7+"+
		"\2\2\u0352\u0353\5\24\13\2\u0353\u0354\b.\1\2\u0354[\3\2\2\2\u0355\u0356"+
		"\7(\2\2\u0356\u0357\7G\2\2\u0357\u0358\5\24\13\2\u0358\u0359\7H\2\2\u0359"+
		"\u035a\7G\2\2\u035a\u035b\5\24\13\2\u035b\u0362\7H\2\2\u035c\u035d\7G"+
		"\2\2\u035d\u035e\5\24\13\2\u035e\u035f\7H\2\2\u035f\u0361\3\2\2\2\u0360"+
		"\u035c\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0366\b/\1\2\u0366"+
		"]\3\2\2\2?ekqw\u008c\u0098\u009e\u00a2\u00a7\u00ad\u00b3\u00b9\u00ce\u00d4"+
		"\u00da\u00e0\u00e6\u00ec\u00f2\u00f6\u010d\u011d\u012e\u013a\u0169\u0193"+
		"\u0195\u01b3\u01bc\u01c4\u01e9\u01ff\u0222\u0227\u0232\u024f\u0261\u0277"+
		"\u0285\u028d\u0291\u0296\u029d\u02a2\u02a7\u02ac\u02b4\u02b7\u02bf\u02c2"+
		"\u02c7\u02e5\u02f5\u0302\u030b\u0314\u031a\u0325\u033f\u034e\u0362";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}