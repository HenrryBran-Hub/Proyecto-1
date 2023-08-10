// Generated from c:\Users\Henrr\OneDrive\Escritorio\Compiladores\Proyecto No. 1\Proyecto No. 1\Proyecto 1\Backend\SwiftGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, INT=2, FLOAT=3, STRING=4, BOOL=5, CHARACT=6, TRU=7, FAL=8, VAR=9, 
		LET=10, NULO=11, IF=12, ELSE=13, SWITCH=14, CASE=15, DEFAULT=16, BREAK=17, 
		CONTINUE=18, FOR=19, IN=20, RANGO=21, WHILE=22, GUARD=23, RETURN=24, FUNCION=25, 
		PRINT=26, INOUT=27, APPEND=28, REMOVE=29, REMOVELAST=30, COUNT=31, EMPTY=32, 
		AT=33, NUMBER=34, CADENA=35, ID_VALIDO=36, CHARACTER=37, WS=38, IG=39, 
		DOS_PUNTOS=40, PUNTOCOMA=41, CIERRE_INTE=42, PARIZQ=43, PARDER=44, DIF=45, 
		IG_IG=46, NOT=47, OR=48, AND=49, MAY_IG=50, MEN_IG=51, MAYOR=52, MENOR=53, 
		MODULO=54, MUL=55, DIV=56, ADD=57, SUB=58, SUMA=59, RESTA=60, LLAVEIZQ=61, 
		LLAVEDER=62, RETORNO=63, COMA=64, PUNTO=65, GUIONBAJO=66, WHITESPACE=67, 
		COMMENT=68, LINE_COMMENT=69;
	public static final int
		RULE_inicio = 0, RULE_sentenciascontrol = 1, RULE_listainstrucciones = 2, 
		RULE_declavariable = 3, RULE_declaconstante = 4, RULE_asignacionvariable = 5, 
		RULE_tipodato = 6, RULE_expresion = 7, RULE_ifelsecontrol = 8, RULE_swtichcontrol = 9, 
		RULE_casecontrol = 10, RULE_defecto = 11, RULE_whilecontrol = 12, RULE_forcontrol = 13, 
		RULE_guardcontrol = 14, RULE_retorno = 15, RULE_vectorcontrol = 16, RULE_definicionvector = 17, 
		RULE_listaexpresion = 18, RULE_vectoragregar = 19, RULE_vectorremover = 20, 
		RULE_vectorvacio = 21, RULE_vectorcount = 22, RULE_vectoraccess = 23, 
		RULE_printcontrol = 24, RULE_intembebida = 25, RULE_floatembebida = 26, 
		RULE_stringembebida = 27, RULE_funciondeclaracioncontrol = 28, RULE_listaparametros = 29, 
		RULE_funcionllamadacontrol = 30, RULE_listaparametrosllamada = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentenciascontrol", "listainstrucciones", "declavariable", 
			"declaconstante", "asignacionvariable", "tipodato", "expresion", "ifelsecontrol", 
			"swtichcontrol", "casecontrol", "defecto", "whilecontrol", "forcontrol", 
			"guardcontrol", "retorno", "vectorcontrol", "definicionvector", "listaexpresion", 
			"vectoragregar", "vectorremover", "vectorvacio", "vectorcount", "vectoraccess", 
			"printcontrol", "intembebida", "floatembebida", "stringembebida", "funciondeclaracioncontrol", 
			"listaparametros", "funcionllamadacontrol", "listaparametrosllamada"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", 
			"'true'", "'false'", "'var'", "'let'", "'nil'", "'if'", "'else'", "'switch'", 
			"'case'", "'default'", "'breack'", "'continue'", "'for'", "'in'", "'...'", 
			"'while'", "'guard'", "'return'", "'func'", "'print'", "'inout'", "'append'", 
			"'remove'", "'removeLast'", "'count'", "'isEmpty'", "'at'", null, null, 
			null, null, null, "'='", "':'", "';'", "'?'", "'('", "')'", "'!='", "'=='", 
			"'!'", "'||'", "'&&'", "'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'/'", 
			"'+'", "'-'", "'+='", "'-='", "'{'", "'}'", "'->'", "','", "'.'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", 
			"VAR", "LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", 
			"CONTINUE", "FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", 
			"PRINT", "INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "EMPTY", 
			"AT", "NUMBER", "CADENA", "ID_VALIDO", "CHARACTER", "WS", "IG", "DOS_PUNTOS", 
			"PUNTOCOMA", "CIERRE_INTE", "PARIZQ", "PARDER", "DIF", "IG_IG", "NOT", 
			"OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MODULO", "MUL", "DIV", 
			"ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", "LLAVEDER", "RETORNO", "COMA", 
			"PUNTO", "GUIONBAJO", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public List<SentenciascontrolContext> sentenciascontrol() {
			return getRuleContexts(SentenciascontrolContext.class);
		}
		public SentenciascontrolContext sentenciascontrol(int i) {
			return getRuleContext(SentenciascontrolContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << FUNCION) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
				{
				{
				setState(64);
				sentenciascontrol();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(EOF);
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

	public static class SentenciascontrolContext extends ParserRuleContext {
		public DeclavariableContext declavariable() {
			return getRuleContext(DeclavariableContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public DeclaconstanteContext declaconstante() {
			return getRuleContext(DeclaconstanteContext.class,0);
		}
		public AsignacionvariableContext asignacionvariable() {
			return getRuleContext(AsignacionvariableContext.class,0);
		}
		public IfelsecontrolContext ifelsecontrol() {
			return getRuleContext(IfelsecontrolContext.class,0);
		}
		public SwtichcontrolContext swtichcontrol() {
			return getRuleContext(SwtichcontrolContext.class,0);
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
		public PrintcontrolContext printcontrol() {
			return getRuleContext(PrintcontrolContext.class,0);
		}
		public FunciondeclaracioncontrolContext funciondeclaracioncontrol() {
			return getRuleContext(FunciondeclaracioncontrolContext.class,0);
		}
		public SentenciascontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciascontrol; }
	}

	public final SentenciascontrolContext sentenciascontrol() throws RecognitionException {
		SentenciascontrolContext _localctx = new SentenciascontrolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentenciascontrol);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				declavariable();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(73);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				declaconstante();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(77);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				asignacionvariable();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(81);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				ifelsecontrol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				swtichcontrol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				whilecontrol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				forcontrol();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				guardcontrol();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				vectorcontrol();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				printcontrol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				funciondeclaracioncontrol();
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

	public static class ListainstruccionesContext extends ParserRuleContext {
		public DeclavariableContext declavariable() {
			return getRuleContext(DeclavariableContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public DeclaconstanteContext declaconstante() {
			return getRuleContext(DeclaconstanteContext.class,0);
		}
		public AsignacionvariableContext asignacionvariable() {
			return getRuleContext(AsignacionvariableContext.class,0);
		}
		public IfelsecontrolContext ifelsecontrol() {
			return getRuleContext(IfelsecontrolContext.class,0);
		}
		public SwtichcontrolContext swtichcontrol() {
			return getRuleContext(SwtichcontrolContext.class,0);
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
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public PrintcontrolContext printcontrol() {
			return getRuleContext(PrintcontrolContext.class,0);
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
		public FuncionllamadacontrolContext funcionllamadacontrol() {
			return getRuleContext(FuncionllamadacontrolContext.class,0);
		}
		public ListainstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listainstrucciones; }
	}

	public final ListainstruccionesContext listainstrucciones() throws RecognitionException {
		ListainstruccionesContext _localctx = new ListainstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listainstrucciones);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				declavariable();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(95);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				declaconstante();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(99);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				asignacionvariable();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(103);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				ifelsecontrol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				swtichcontrol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				whilecontrol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				forcontrol();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				guardcontrol();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111);
				match(CONTINUE);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(112);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(115);
				match(BREAK);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(116);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(119);
				retorno();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTOCOMA) {
					{
					setState(120);
					match(PUNTOCOMA);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
				printcontrol();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(124);
				intembebida();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(125);
				floatembebida();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(126);
				stringembebida();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(127);
				funcionllamadacontrol();
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

	public static class DeclavariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRE_INTE() { return getToken(SwiftGrammarParser.CIERRE_INTE, 0); }
		public DeclavariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declavariable; }
	}

	public final DeclavariableContext declavariable() throws RecognitionException {
		DeclavariableContext _localctx = new DeclavariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declavariable);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(VAR);
				setState(131);
				match(ID_VALIDO);
				setState(132);
				match(DOS_PUNTOS);
				setState(133);
				tipodato();
				setState(134);
				match(IG);
				setState(135);
				expresion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(VAR);
				setState(138);
				match(ID_VALIDO);
				setState(139);
				match(IG);
				setState(140);
				expresion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(VAR);
				setState(142);
				match(ID_VALIDO);
				setState(143);
				match(DOS_PUNTOS);
				setState(144);
				tipodato();
				setState(145);
				match(CIERRE_INTE);
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
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaconstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaconstante; }
	}

	public final DeclaconstanteContext declaconstante() throws RecognitionException {
		DeclaconstanteContext _localctx = new DeclaconstanteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaconstante);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(LET);
				setState(150);
				match(ID_VALIDO);
				setState(151);
				match(DOS_PUNTOS);
				setState(152);
				tipodato();
				setState(153);
				match(IG);
				setState(154);
				expresion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(LET);
				setState(157);
				match(ID_VALIDO);
				setState(158);
				match(IG);
				setState(159);
				expresion(0);
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
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		enterRule(_localctx, 10, RULE_asignacionvariable);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ID_VALIDO);
				setState(163);
				match(IG);
				setState(164);
				expresion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(ID_VALIDO);
				setState(166);
				match(SUMA);
				setState(167);
				expresion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(ID_VALIDO);
				setState(169);
				match(RESTA);
				setState(170);
				expresion(0);
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
		enterRule(_localctx, 12, RULE_tipodato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << CHARACT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext left;
		public Token op;
		public ExpresionContext right;
		public TerminalNode NOT() { return getToken(SwiftGrammarParser.NOT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
		public IntembebidaContext intembebida() {
			return getRuleContext(IntembebidaContext.class,0);
		}
		public FloatembebidaContext floatembebida() {
			return getRuleContext(FloatembebidaContext.class,0);
		}
		public StringembebidaContext stringembebida() {
			return getRuleContext(StringembebidaContext.class,0);
		}
		public FuncionllamadacontrolContext funcionllamadacontrol() {
			return getRuleContext(FuncionllamadacontrolContext.class,0);
		}
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode MODULO() { return getToken(SwiftGrammarParser.MODULO, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(176);
				match(NOT);
				setState(177);
				expresion(20);
				}
				break;
			case 2:
				{
				setState(178);
				match(PARIZQ);
				setState(179);
				expresion(0);
				setState(180);
				match(PARDER);
				}
				break;
			case 3:
				{
				setState(182);
				match(SUB);
				setState(183);
				expresion(12);
				}
				break;
			case 4:
				{
				setState(184);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(185);
				match(CADENA);
				}
				break;
			case 6:
				{
				setState(186);
				match(TRU);
				}
				break;
			case 7:
				{
				setState(187);
				match(FAL);
				}
				break;
			case 8:
				{
				setState(188);
				match(CHARACTER);
				}
				break;
			case 9:
				{
				setState(189);
				match(ID_VALIDO);
				}
				break;
			case 10:
				{
				setState(190);
				match(NULO);
				}
				break;
			case 11:
				{
				setState(191);
				intembebida();
				}
				break;
			case 12:
				{
				setState(192);
				floatembebida();
				}
				break;
			case 13:
				{
				setState(193);
				stringembebida();
				}
				break;
			case 14:
				{
				setState(194);
				funcionllamadacontrol();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(197);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(198);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						((ExpresionContext)_localctx).right = expresion(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(200);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(201);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						((ExpresionContext)_localctx).right = expresion(19);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(203);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(204);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAY_IG) | (1L << MEN_IG) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						((ExpresionContext)_localctx).right = expresion(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(206);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(207);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						((ExpresionContext)_localctx).right = expresion(17);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(209);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(210);
						((ExpresionContext)_localctx).op = match(AND);
						setState(211);
						((ExpresionContext)_localctx).right = expresion(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(212);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(213);
						((ExpresionContext)_localctx).op = match(OR);
						setState(214);
						((ExpresionContext)_localctx).right = expresion(15);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class IfelsecontrolContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> LLAVEIZQ() { return getTokens(SwiftGrammarParser.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(SwiftGrammarParser.LLAVEIZQ, i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(SwiftGrammarParser.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(SwiftGrammarParser.LLAVEDER, i);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public IfelsecontrolContext ifelsecontrol() {
			return getRuleContext(IfelsecontrolContext.class,0);
		}
		public IfelsecontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelsecontrol; }
	}

	public final IfelsecontrolContext ifelsecontrol() throws RecognitionException {
		IfelsecontrolContext _localctx = new IfelsecontrolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifelsecontrol);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(IF);
				setState(221);
				expresion(0);
				setState(222);
				match(LLAVEIZQ);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
					{
					{
					setState(223);
					listainstrucciones();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(LLAVEDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(IF);
				setState(232);
				expresion(0);
				setState(233);
				match(LLAVEIZQ);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
					{
					{
					setState(234);
					listainstrucciones();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(LLAVEDER);
				setState(241);
				match(ELSE);
				setState(242);
				match(LLAVEIZQ);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
					{
					{
					setState(243);
					listainstrucciones();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(LLAVEDER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(IF);
				setState(252);
				expresion(0);
				setState(253);
				match(LLAVEIZQ);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
					{
					{
					setState(254);
					listainstrucciones();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(LLAVEDER);
				setState(261);
				match(ELSE);
				setState(262);
				ifelsecontrol();
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

	public static class SwtichcontrolContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SwiftGrammarParser.SWITCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<CasecontrolContext> casecontrol() {
			return getRuleContexts(CasecontrolContext.class);
		}
		public CasecontrolContext casecontrol(int i) {
			return getRuleContext(CasecontrolContext.class,i);
		}
		public DefectoContext defecto() {
			return getRuleContext(DefectoContext.class,0);
		}
		public SwtichcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swtichcontrol; }
	}

	public final SwtichcontrolContext swtichcontrol() throws RecognitionException {
		SwtichcontrolContext _localctx = new SwtichcontrolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_swtichcontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(SWITCH);
			setState(267);
			expresion(0);
			setState(268);
			match(LLAVEIZQ);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				casecontrol();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(274);
				defecto();
				}
			}

			setState(277);
			match(LLAVEDER);
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

	public static class CasecontrolContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SwiftGrammarParser.CASE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public CasecontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casecontrol; }
	}

	public final CasecontrolContext casecontrol() throws RecognitionException {
		CasecontrolContext _localctx = new CasecontrolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_casecontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(CASE);
			setState(280);
			expresion(0);
			setState(281);
			match(DOS_PUNTOS);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
				{
				{
				setState(282);
				listainstrucciones();
				}
				}
				setState(287);
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

	public static class DefectoContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SwiftGrammarParser.DEFAULT, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public DefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defecto; }
	}

	public final DefectoContext defecto() throws RecognitionException {
		DefectoContext _localctx = new DefectoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defecto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(DEFAULT);
			setState(289);
			match(DOS_PUNTOS);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
				{
				{
				setState(290);
				listainstrucciones();
				}
				}
				setState(295);
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

	public static class WhilecontrolContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SwiftGrammarParser.WHILE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public WhilecontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilecontrol; }
	}

	public final WhilecontrolContext whilecontrol() throws RecognitionException {
		WhilecontrolContext _localctx = new WhilecontrolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whilecontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(WHILE);
			setState(297);
			expresion(0);
			setState(298);
			match(LLAVEIZQ);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
				{
				{
				setState(299);
				listainstrucciones();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(LLAVEDER);
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
		public TerminalNode FOR() { return getToken(SwiftGrammarParser.FOR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode IN() { return getToken(SwiftGrammarParser.IN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public TerminalNode RANGO() { return getToken(SwiftGrammarParser.RANGO, 0); }
		public ForcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcontrol; }
	}

	public final ForcontrolContext forcontrol() throws RecognitionException {
		ForcontrolContext _localctx = new ForcontrolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forcontrol);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(FOR);
				setState(308);
				match(ID_VALIDO);
				setState(309);
				match(IN);
				setState(310);
				expresion(0);
				setState(311);
				match(LLAVEIZQ);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
					{
					{
					setState(312);
					listainstrucciones();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(LLAVEDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(FOR);
				setState(321);
				match(ID_VALIDO);
				setState(322);
				match(IN);
				setState(323);
				expresion(0);
				setState(324);
				match(RANGO);
				setState(325);
				expresion(0);
				setState(326);
				match(LLAVEIZQ);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0)) {
					{
					{
					setState(327);
					listainstrucciones();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
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

	public static class GuardcontrolContext extends ParserRuleContext {
		public TerminalNode GUARD() { return getToken(SwiftGrammarParser.GUARD, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(SwiftGrammarParser.PUNTOCOMA, 0); }
		public GuardcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardcontrol; }
	}

	public final GuardcontrolContext guardcontrol() throws RecognitionException {
		GuardcontrolContext _localctx = new GuardcontrolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_guardcontrol);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(GUARD);
			setState(338);
			expresion(0);
			setState(339);
			match(ELSE);
			setState(340);
			match(LLAVEIZQ);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					listainstrucciones();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				{
				setState(347);
				match(CONTINUE);
				}
				break;
			case BREAK:
				{
				setState(348);
				match(BREAK);
				}
				break;
			case RETURN:
				{
				setState(349);
				retorno();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(352);
				match(PUNTOCOMA);
				}
			}

			setState(355);
			match(LLAVEDER);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SwiftGrammarParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(358);
				expresion(0);
				}
				break;
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

	public static class VectorcontrolContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public DefinicionvectorContext definicionvector() {
			return getRuleContext(DefinicionvectorContext.class,0);
		}
		public VectorcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorcontrol; }
	}

	public final VectorcontrolContext vectorcontrol() throws RecognitionException {
		VectorcontrolContext _localctx = new VectorcontrolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_vectorcontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(VAR);
			setState(362);
			match(ID_VALIDO);
			setState(363);
			match(DOS_PUNTOS);
			setState(364);
			match(LLAVEIZQ);
			setState(365);
			tipodato();
			setState(366);
			match(LLAVEDER);
			setState(367);
			definicionvector();
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

	public static class DefinicionvectorContext extends ParserRuleContext {
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ListaexpresionContext listaexpresion() {
			return getRuleContext(ListaexpresionContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public DefinicionvectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionvector; }
	}

	public final DefinicionvectorContext definicionvector() throws RecognitionException {
		DefinicionvectorContext _localctx = new DefinicionvectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_definicionvector);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IG:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(IG);
				setState(370);
				match(LLAVEIZQ);
				setState(371);
				listaexpresion();
				setState(372);
				match(LLAVEDER);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case CHARACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				tipodato();
				setState(375);
				match(LLAVEIZQ);
				setState(376);
				match(LLAVEDER);
				}
				break;
			case PARIZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(PARIZQ);
				setState(379);
				match(PARDER);
				}
				break;
			case ID_VALIDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(ID_VALIDO);
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

	public static class ListaexpresionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(SwiftGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SwiftGrammarParser.COMA, i);
		}
		public List<ListaexpresionContext> listaexpresion() {
			return getRuleContexts(ListaexpresionContext.class);
		}
		public ListaexpresionContext listaexpresion(int i) {
			return getRuleContext(ListaexpresionContext.class,i);
		}
		public ListaexpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexpresion; }
	}

	public final ListaexpresionContext listaexpresion() throws RecognitionException {
		ListaexpresionContext _localctx = new ListaexpresionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaexpresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			expresion(0);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(COMA);
					setState(385);
					listaexpresion();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class VectoragregarContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode APPEND() { return getToken(SwiftGrammarParser.APPEND, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public VectoragregarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectoragregar; }
	}

	public final VectoragregarContext vectoragregar() throws RecognitionException {
		VectoragregarContext _localctx = new VectoragregarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vectoragregar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(ID_VALIDO);
			setState(392);
			match(PUNTO);
			setState(393);
			match(APPEND);
			setState(394);
			match(PARIZQ);
			setState(395);
			expresion(0);
			setState(396);
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

	public static class VectorremoverContext extends ParserRuleContext {
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode REMOVELAST() { return getToken(SwiftGrammarParser.REMOVELAST, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode REMOVE() { return getToken(SwiftGrammarParser.REMOVE, 0); }
		public TerminalNode AT() { return getToken(SwiftGrammarParser.AT, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(SwiftGrammarParser.DOS_PUNTOS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public VectorremoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorremover; }
	}

	public final VectorremoverContext vectorremover() throws RecognitionException {
		VectorremoverContext _localctx = new VectorremoverContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vectorremover);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(ID_VALIDO);
				setState(399);
				match(PUNTO);
				setState(400);
				match(REMOVELAST);
				setState(401);
				match(PARIZQ);
				setState(402);
				match(PARDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(ID_VALIDO);
				setState(404);
				match(PUNTO);
				setState(405);
				match(REMOVE);
				setState(406);
				match(PARIZQ);
				setState(407);
				match(AT);
				setState(408);
				match(DOS_PUNTOS);
				setState(409);
				expresion(0);
				setState(410);
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
		public TerminalNode EMPTY() { return getToken(SwiftGrammarParser.EMPTY, 0); }
		public VectorvacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorvacio; }
	}

	public final VectorvacioContext vectorvacio() throws RecognitionException {
		VectorvacioContext _localctx = new VectorvacioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vectorvacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(ID_VALIDO);
			setState(415);
			match(PUNTO);
			setState(416);
			match(EMPTY);
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
		enterRule(_localctx, 44, RULE_vectorcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(ID_VALIDO);
			setState(419);
			match(PUNTO);
			setState(420);
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
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public VectoraccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectoraccess; }
	}

	public final VectoraccessContext vectoraccess() throws RecognitionException {
		VectoraccessContext _localctx = new VectoraccessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vectoraccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(ID_VALIDO);
			setState(423);
			match(LLAVEIZQ);
			setState(424);
			expresion(0);
			setState(425);
			match(LLAVEDER);
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

	public static class PrintcontrolContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public PrintcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printcontrol; }
	}

	public final PrintcontrolContext printcontrol() throws RecognitionException {
		PrintcontrolContext _localctx = new PrintcontrolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_printcontrol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(PRINT);
			setState(428);
			match(PARIZQ);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << TRU) | (1L << FAL) | (1L << NULO) | (1L << NUMBER) | (1L << CADENA) | (1L << ID_VALIDO) | (1L << CHARACTER) | (1L << PARIZQ) | (1L << NOT) | (1L << SUB))) != 0)) {
				{
				setState(429);
				expresion(0);
				}
			}

			setState(432);
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

	public static class IntembebidaContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public IntembebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intembebida; }
	}

	public final IntembebidaContext intembebida() throws RecognitionException {
		IntembebidaContext _localctx = new IntembebidaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_intembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(INT);
			setState(435);
			match(PARIZQ);
			setState(436);
			expresion(0);
			setState(437);
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

	public static class FloatembebidaContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public FloatembebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatembebida; }
	}

	public final FloatembebidaContext floatembebida() throws RecognitionException {
		FloatembebidaContext _localctx = new FloatembebidaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(FLOAT);
			setState(440);
			match(PARIZQ);
			setState(441);
			expresion(0);
			setState(442);
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

	public static class StringembebidaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public StringembebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringembebida; }
	}

	public final StringembebidaContext stringembebida() throws RecognitionException {
		StringembebidaContext _localctx = new StringembebidaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringembebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(STRING);
			setState(445);
			match(PARIZQ);
			setState(446);
			expresion(0);
			setState(447);
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
		public TerminalNode FUNCION() { return getToken(SwiftGrammarParser.FUNCION, 0); }
		public TerminalNode ID_VALIDO() { return getToken(SwiftGrammarParser.ID_VALIDO, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode RETORNO() { return getToken(SwiftGrammarParser.RETORNO, 0); }
		public TipodatoContext tipodato() {
			return getRuleContext(TipodatoContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
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
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(FUNCION);
				setState(450);
				match(ID_VALIDO);
				setState(451);
				match(PARIZQ);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ID_VALIDO - 36)) | (1L << (COMA - 36)) | (1L << (GUIONBAJO - 36)))) != 0)) {
					{
					setState(452);
					listaparametros();
					}
				}

				setState(455);
				match(PARDER);
				setState(456);
				match(RETORNO);
				setState(457);
				tipodato();
				setState(458);
				match(LLAVEIZQ);
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(459);
					listainstrucciones();
					}
					}
					setState(462); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0) );
				setState(464);
				match(LLAVEDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(FUNCION);
				setState(467);
				match(ID_VALIDO);
				setState(468);
				match(PARIZQ);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ID_VALIDO - 36)) | (1L << (COMA - 36)) | (1L << (GUIONBAJO - 36)))) != 0)) {
					{
					setState(469);
					listaparametros();
					}
				}

				setState(472);
				match(PARDER);
				setState(473);
				match(LLAVEIZQ);
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(474);
					listainstrucciones();
					}
					}
					setState(477); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << SWITCH) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << GUARD) | (1L << RETURN) | (1L << PRINT) | (1L << ID_VALIDO))) != 0) );
				setState(479);
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
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(COMA);
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(484);
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
				setState(487);
				match(ID_VALIDO);
				setState(488);
				match(DOS_PUNTOS);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(489);
					match(INOUT);
					}
				}

				setState(492);
				tipodato();
				setState(493);
				listaparametros();
				}
				break;
			case ID_VALIDO:
			case GUIONBAJO:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(495);
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
				setState(498);
				match(ID_VALIDO);
				setState(499);
				match(DOS_PUNTOS);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(500);
					match(INOUT);
					}
				}

				setState(503);
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
			setState(506);
			match(ID_VALIDO);
			setState(507);
			match(PARIZQ);
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(508);
				listaparametrosllamada();
				}
				break;
			}
			setState(511);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(COMA);
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(514);
					match(ID_VALIDO);
					setState(515);
					match(DOS_PUNTOS);
					}
					break;
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(518);
					match(T__0);
					}
				}

				setState(521);
				expresion(0);
				setState(522);
				listaparametrosllamada();
				}
				break;
			case T__0:
			case INT:
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
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(524);
					match(ID_VALIDO);
					setState(525);
					match(DOS_PUNTOS);
					}
					break;
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(528);
					match(T__0);
					}
				}

				setState(531);
				expresion(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0219\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\5\3M\n\3\3\3\3\3\5\3Q"+
		"\n\3\3\3\3\3\5\3U\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4"+
		"\5\4c\n\4\3\4\3\4\5\4g\n\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4t\n\4\3\4\3\4\5\4x\n\4\3\4\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0083\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0096\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00a3\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00c6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00da\n\t\f\t\16\t\u00dd\13\t\3\n\3\n\3\n"+
		"\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ee"+
		"\n\n\f\n\16\n\u00f1\13\n\3\n\3\n\3\n\3\n\7\n\u00f7\n\n\f\n\16\n\u00fa"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0102\n\n\f\n\16\n\u0105\13\n\3\n\3"+
		"\n\3\n\3\n\5\n\u010b\n\n\3\13\3\13\3\13\3\13\6\13\u0111\n\13\r\13\16\13"+
		"\u0112\3\13\5\13\u0116\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u011e\n\f\f"+
		"\f\16\f\u0121\13\f\3\r\3\r\3\r\7\r\u0126\n\r\f\r\16\r\u0129\13\r\3\16"+
		"\3\16\3\16\3\16\7\16\u012f\n\16\f\16\16\16\u0132\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u013c\n\17\f\17\16\17\u013f\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u014b\n\17\f\17\16"+
		"\17\u014e\13\17\3\17\3\17\5\17\u0152\n\17\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0159\n\20\f\20\16\20\u015c\13\20\3\20\3\20\3\20\5\20\u0161\n\20\3\20"+
		"\5\20\u0164\n\20\3\20\3\20\3\21\3\21\5\21\u016a\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0180\n\23\3\24\3\24\3\24\7\24\u0185\n\24\f\24\16\24"+
		"\u0188\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u019f\n\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\5\32\u01b1\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u01c8\n\36"+
		"\3\36\3\36\3\36\3\36\3\36\6\36\u01cf\n\36\r\36\16\36\u01d0\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u01d9\n\36\3\36\3\36\3\36\6\36\u01de\n\36\r\36"+
		"\16\36\u01df\3\36\3\36\5\36\u01e4\n\36\3\37\3\37\5\37\u01e8\n\37\3\37"+
		"\3\37\3\37\5\37\u01ed\n\37\3\37\3\37\3\37\3\37\5\37\u01f3\n\37\3\37\3"+
		"\37\3\37\5\37\u01f8\n\37\3\37\5\37\u01fb\n\37\3 \3 \3 \5 \u0200\n \3 "+
		"\3 \3!\3!\3!\5!\u0207\n!\3!\5!\u020a\n!\3!\3!\3!\3!\3!\5!\u0211\n!\3!"+
		"\5!\u0214\n!\3!\5!\u0217\n!\3!\2\3\20\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\3\2\4\b\3\28:\3\2;<\3\2\64\67"+
		"\3\2/\60\4\2&&DD\2\u025c\2E\3\2\2\2\4^\3\2\2\2\6\u0082\3\2\2\2\b\u0095"+
		"\3\2\2\2\n\u00a2\3\2\2\2\f\u00ad\3\2\2\2\16\u00af\3\2\2\2\20\u00c5\3\2"+
		"\2\2\22\u010a\3\2\2\2\24\u010c\3\2\2\2\26\u0119\3\2\2\2\30\u0122\3\2\2"+
		"\2\32\u012a\3\2\2\2\34\u0151\3\2\2\2\36\u0153\3\2\2\2 \u0167\3\2\2\2\""+
		"\u016b\3\2\2\2$\u017f\3\2\2\2&\u0181\3\2\2\2(\u0189\3\2\2\2*\u019e\3\2"+
		"\2\2,\u01a0\3\2\2\2.\u01a4\3\2\2\2\60\u01a8\3\2\2\2\62\u01ad\3\2\2\2\64"+
		"\u01b4\3\2\2\2\66\u01b9\3\2\2\28\u01be\3\2\2\2:\u01e3\3\2\2\2<\u01fa\3"+
		"\2\2\2>\u01fc\3\2\2\2@\u0216\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JL\5\b\5\2KM"+
		"\7+\2\2LK\3\2\2\2LM\3\2\2\2M_\3\2\2\2NP\5\n\6\2OQ\7+\2\2PO\3\2\2\2PQ\3"+
		"\2\2\2Q_\3\2\2\2RT\5\f\7\2SU\7+\2\2TS\3\2\2\2TU\3\2\2\2U_\3\2\2\2V_\5"+
		"\22\n\2W_\5\24\13\2X_\5\32\16\2Y_\5\34\17\2Z_\5\36\20\2[_\5\"\22\2\\_"+
		"\5\62\32\2]_\5:\36\2^J\3\2\2\2^N\3\2\2\2^R\3\2\2\2^V\3\2\2\2^W\3\2\2\2"+
		"^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\5\3\2\2"+
		"\2`b\5\b\5\2ac\7+\2\2ba\3\2\2\2bc\3\2\2\2c\u0083\3\2\2\2df\5\n\6\2eg\7"+
		"+\2\2fe\3\2\2\2fg\3\2\2\2g\u0083\3\2\2\2hj\5\f\7\2ik\7+\2\2ji\3\2\2\2"+
		"jk\3\2\2\2k\u0083\3\2\2\2l\u0083\5\22\n\2m\u0083\5\24\13\2n\u0083\5\32"+
		"\16\2o\u0083\5\34\17\2p\u0083\5\36\20\2qs\7\24\2\2rt\7+\2\2sr\3\2\2\2"+
		"st\3\2\2\2t\u0083\3\2\2\2uw\7\23\2\2vx\7+\2\2wv\3\2\2\2wx\3\2\2\2x\u0083"+
		"\3\2\2\2y{\5 \21\2z|\7+\2\2{z\3\2\2\2{|\3\2\2\2|\u0083\3\2\2\2}\u0083"+
		"\5\62\32\2~\u0083\5\64\33\2\177\u0083\5\66\34\2\u0080\u0083\58\35\2\u0081"+
		"\u0083\5> \2\u0082`\3\2\2\2\u0082d\3\2\2\2\u0082h\3\2\2\2\u0082l\3\2\2"+
		"\2\u0082m\3\2\2\2\u0082n\3\2\2\2\u0082o\3\2\2\2\u0082p\3\2\2\2\u0082q"+
		"\3\2\2\2\u0082u\3\2\2\2\u0082y\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\7\3\2\2\2\u0084"+
		"\u0085\7\13\2\2\u0085\u0086\7&\2\2\u0086\u0087\7*\2\2\u0087\u0088\5\16"+
		"\b\2\u0088\u0089\7)\2\2\u0089\u008a\5\20\t\2\u008a\u0096\3\2\2\2\u008b"+
		"\u008c\7\13\2\2\u008c\u008d\7&\2\2\u008d\u008e\7)\2\2\u008e\u0096\5\20"+
		"\t\2\u008f\u0090\7\13\2\2\u0090\u0091\7&\2\2\u0091\u0092\7*\2\2\u0092"+
		"\u0093\5\16\b\2\u0093\u0094\7,\2\2\u0094\u0096\3\2\2\2\u0095\u0084\3\2"+
		"\2\2\u0095\u008b\3\2\2\2\u0095\u008f\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098"+
		"\7\f\2\2\u0098\u0099\7&\2\2\u0099\u009a\7*\2\2\u009a\u009b\5\16\b\2\u009b"+
		"\u009c\7)\2\2\u009c\u009d\5\20\t\2\u009d\u00a3\3\2\2\2\u009e\u009f\7\f"+
		"\2\2\u009f\u00a0\7&\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a3\5\20\t\2\u00a2"+
		"\u0097\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\7&\2\2"+
		"\u00a5\u00a6\7)\2\2\u00a6\u00ae\5\20\t\2\u00a7\u00a8\7&\2\2\u00a8\u00a9"+
		"\7=\2\2\u00a9\u00ae\5\20\t\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\7>\2\2\u00ac"+
		"\u00ae\5\20\t\2\u00ad\u00a4\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ae\r\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\17\3\2\2\2\u00b1\u00b2"+
		"\b\t\1\2\u00b2\u00b3\7\61\2\2\u00b3\u00c6\5\20\t\26\u00b4\u00b5\7-\2\2"+
		"\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7.\2\2\u00b7\u00c6\3\2\2\2\u00b8\u00b9"+
		"\7<\2\2\u00b9\u00c6\5\20\t\16\u00ba\u00c6\7$\2\2\u00bb\u00c6\7%\2\2\u00bc"+
		"\u00c6\7\t\2\2\u00bd\u00c6\7\n\2\2\u00be\u00c6\7\'\2\2\u00bf\u00c6\7&"+
		"\2\2\u00c0\u00c6\7\r\2\2\u00c1\u00c6\5\64\33\2\u00c2\u00c6\5\66\34\2\u00c3"+
		"\u00c6\58\35\2\u00c4\u00c6\5> \2\u00c5\u00b1\3\2\2\2\u00c5\u00b4\3\2\2"+
		"\2\u00c5\u00b8\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bc"+
		"\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5"+
		"\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00db\3\2\2\2\u00c7\u00c8\f\25\2\2\u00c8"+
		"\u00c9\t\3\2\2\u00c9\u00da\5\20\t\26\u00ca\u00cb\f\24\2\2\u00cb\u00cc"+
		"\t\4\2\2\u00cc\u00da\5\20\t\25\u00cd\u00ce\f\23\2\2\u00ce\u00cf\t\5\2"+
		"\2\u00cf\u00da\5\20\t\24\u00d0\u00d1\f\22\2\2\u00d1\u00d2\t\6\2\2\u00d2"+
		"\u00da\5\20\t\23\u00d3\u00d4\f\21\2\2\u00d4\u00d5\7\63\2\2\u00d5\u00da"+
		"\5\20\t\22\u00d6\u00d7\f\20\2\2\u00d7\u00d8\7\62\2\2\u00d8\u00da\5\20"+
		"\t\21\u00d9\u00c7\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9"+
		"\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\21\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00df\7\16\2\2\u00df\u00e0\5\20\t\2\u00e0\u00e4\7?\2\2"+
		"\u00e1\u00e3\5\6\4\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\7@\2\2\u00e8\u010b\3\2\2\2\u00e9\u00ea\7\16\2\2\u00ea\u00eb\5\20"+
		"\t\2\u00eb\u00ef\7?\2\2\u00ec\u00ee\5\6\4\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3\u00f4\7\17\2\2\u00f4"+
		"\u00f8\7?\2\2\u00f5\u00f7\5\6\4\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u010b\3\2\2\2\u00fd\u00fe\7\16"+
		"\2\2\u00fe\u00ff\5\20\t\2\u00ff\u0103\7?\2\2\u0100\u0102\5\6\4\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7@\2\2\u0107"+
		"\u0108\7\17\2\2\u0108\u0109\5\22\n\2\u0109\u010b\3\2\2\2\u010a\u00de\3"+
		"\2\2\2\u010a\u00e9\3\2\2\2\u010a\u00fd\3\2\2\2\u010b\23\3\2\2\2\u010c"+
		"\u010d\7\20\2\2\u010d\u010e\5\20\t\2\u010e\u0110\7?\2\2\u010f\u0111\5"+
		"\26\f\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5\30\r\2\u0115\u0114\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7@\2\2\u0118"+
		"\25\3\2\2\2\u0119\u011a\7\21\2\2\u011a\u011b\5\20\t\2\u011b\u011f\7*\2"+
		"\2\u011c\u011e\5\6\4\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\27\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\7\22\2\2\u0123\u0127\7*\2\2\u0124\u0126\5\6\4\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\31\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\30\2\2\u012b\u012c\5\20"+
		"\t\2\u012c\u0130\7?\2\2\u012d\u012f\5\6\4\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7@\2\2\u0134\33\3\2\2\2\u0135\u0136"+
		"\7\25\2\2\u0136\u0137\7&\2\2\u0137\u0138\7\26\2\2\u0138\u0139\5\20\t\2"+
		"\u0139\u013d\7?\2\2\u013a\u013c\5\6\4\2\u013b\u013a\3\2\2\2\u013c\u013f"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0141\7@\2\2\u0141\u0152\3\2\2\2\u0142\u0143\7\25"+
		"\2\2\u0143\u0144\7&\2\2\u0144\u0145\7\26\2\2\u0145\u0146\5\20\t\2\u0146"+
		"\u0147\7\27\2\2\u0147\u0148\5\20\t\2\u0148\u014c\7?\2\2\u0149\u014b\5"+
		"\6\4\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7@"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u0135\3\2\2\2\u0151\u0142\3\2\2\2\u0152"+
		"\35\3\2\2\2\u0153\u0154\7\31\2\2\u0154\u0155\5\20\t\2\u0155\u0156\7\17"+
		"\2\2\u0156\u015a\7?\2\2\u0157\u0159\5\6\4\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0160\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\u0161\7\24\2\2\u015e\u0161\7\23\2\2\u015f"+
		"\u0161\5 \21\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0164\7+\2\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7@\2\2\u0166\37\3\2\2\2"+
		"\u0167\u0169\7\32\2\2\u0168\u016a\5\20\t\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a!\3\2\2\2\u016b\u016c\7\13\2\2\u016c\u016d\7&\2\2\u016d"+
		"\u016e\7*\2\2\u016e\u016f\7?\2\2\u016f\u0170\5\16\b\2\u0170\u0171\7@\2"+
		"\2\u0171\u0172\5$\23\2\u0172#\3\2\2\2\u0173\u0174\7)\2\2\u0174\u0175\7"+
		"?\2\2\u0175\u0176\5&\24\2\u0176\u0177\7@\2\2\u0177\u0180\3\2\2\2\u0178"+
		"\u0179\5\16\b\2\u0179\u017a\7?\2\2\u017a\u017b\7@\2\2\u017b\u0180\3\2"+
		"\2\2\u017c\u017d\7-\2\2\u017d\u0180\7.\2\2\u017e\u0180\7&\2\2\u017f\u0173"+
		"\3\2\2\2\u017f\u0178\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017e\3\2\2\2\u0180"+
		"%\3\2\2\2\u0181\u0186\5\20\t\2\u0182\u0183\7B\2\2\u0183\u0185\5&\24\2"+
		"\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\'\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7&\2\2\u018a"+
		"\u018b\7C\2\2\u018b\u018c\7\36\2\2\u018c\u018d\7-\2\2\u018d\u018e\5\20"+
		"\t\2\u018e\u018f\7.\2\2\u018f)\3\2\2\2\u0190\u0191\7&\2\2\u0191\u0192"+
		"\7C\2\2\u0192\u0193\7 \2\2\u0193\u0194\7-\2\2\u0194\u019f\7.\2\2\u0195"+
		"\u0196\7&\2\2\u0196\u0197\7C\2\2\u0197\u0198\7\37\2\2\u0198\u0199\7-\2"+
		"\2\u0199\u019a\7#\2\2\u019a\u019b\7*\2\2\u019b\u019c\5\20\t\2\u019c\u019d"+
		"\7.\2\2\u019d\u019f\3\2\2\2\u019e\u0190\3\2\2\2\u019e\u0195\3\2\2\2\u019f"+
		"+\3\2\2\2\u01a0\u01a1\7&\2\2\u01a1\u01a2\7C\2\2\u01a2\u01a3\7\"\2\2\u01a3"+
		"-\3\2\2\2\u01a4\u01a5\7&\2\2\u01a5\u01a6\7C\2\2\u01a6\u01a7\7!\2\2\u01a7"+
		"/\3\2\2\2\u01a8\u01a9\7&\2\2\u01a9\u01aa\7?\2\2\u01aa\u01ab\5\20\t\2\u01ab"+
		"\u01ac\7@\2\2\u01ac\61\3\2\2\2\u01ad\u01ae\7\34\2\2\u01ae\u01b0\7-\2\2"+
		"\u01af\u01b1\5\20\t\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\7.\2\2\u01b3\63\3\2\2\2\u01b4\u01b5\7\4\2\2\u01b5"+
		"\u01b6\7-\2\2\u01b6\u01b7\5\20\t\2\u01b7\u01b8\7.\2\2\u01b8\65\3\2\2\2"+
		"\u01b9\u01ba\7\5\2\2\u01ba\u01bb\7-\2\2\u01bb\u01bc\5\20\t\2\u01bc\u01bd"+
		"\7.\2\2\u01bd\67\3\2\2\2\u01be\u01bf\7\6\2\2\u01bf\u01c0\7-\2\2\u01c0"+
		"\u01c1\5\20\t\2\u01c1\u01c2\7.\2\2\u01c29\3\2\2\2\u01c3\u01c4\7\33\2\2"+
		"\u01c4\u01c5\7&\2\2\u01c5\u01c7\7-\2\2\u01c6\u01c8\5<\37\2\u01c7\u01c6"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7.\2\2\u01ca"+
		"\u01cb\7A\2\2\u01cb\u01cc\5\16\b\2\u01cc\u01ce\7?\2\2\u01cd\u01cf\5\6"+
		"\4\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7@\2\2\u01d3\u01e4\3\2"+
		"\2\2\u01d4\u01d5\7\33\2\2\u01d5\u01d6\7&\2\2\u01d6\u01d8\7-\2\2\u01d7"+
		"\u01d9\5<\37\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\7.\2\2\u01db\u01dd\7?\2\2\u01dc\u01de\5\6\4\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\7@\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01c3\3\2"+
		"\2\2\u01e3\u01d4\3\2\2\2\u01e4;\3\2\2\2\u01e5\u01e7\7B\2\2\u01e6\u01e8"+
		"\t\7\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\7&\2\2\u01ea\u01ec\7*\2\2\u01eb\u01ed\7\35\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5\16\b\2\u01ef"+
		"\u01f0\5<\37\2\u01f0\u01fb\3\2\2\2\u01f1\u01f3\t\7\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7&\2\2\u01f5"+
		"\u01f7\7*\2\2\u01f6\u01f8\7\35\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\5\16\b\2\u01fa\u01e5\3\2\2\2\u01fa"+
		"\u01f2\3\2\2\2\u01fb=\3\2\2\2\u01fc\u01fd\7&\2\2\u01fd\u01ff\7-\2\2\u01fe"+
		"\u0200\5@!\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2"+
		"\2\u0201\u0202\7-\2\2\u0202?\3\2\2\2\u0203\u0206\7B\2\2\u0204\u0205\7"+
		"&\2\2\u0205\u0207\7*\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u020a\7\3\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5\20\t\2\u020c\u020d\5@!\2\u020d"+
		"\u0217\3\2\2\2\u020e\u020f\7&\2\2\u020f\u0211\7*\2\2\u0210\u020e\3\2\2"+
		"\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\7\3\2\2\u0213\u0212"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\5\20\t\2"+
		"\u0216\u0203\3\2\2\2\u0216\u0210\3\2\2\2\u0217A\3\2\2\29ELPT^bfjsw{\u0082"+
		"\u0095\u00a2\u00ad\u00c5\u00d9\u00db\u00e4\u00ef\u00f8\u0103\u010a\u0112"+
		"\u0115\u011f\u0127\u0130\u013d\u014c\u0151\u015a\u0160\u0163\u0169\u017f"+
		"\u0186\u019e\u01b0\u01c7\u01d0\u01d8\u01df\u01e3\u01e7\u01ec\u01f2\u01f7"+
		"\u01fa\u01ff\u0206\u0209\u0210\u0213\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}