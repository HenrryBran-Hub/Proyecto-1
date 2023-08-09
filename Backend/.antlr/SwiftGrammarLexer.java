// Generated from c:\Users\Henrr\OneDrive\Escritorio\Compiladores\Proyecto No. 1\Proyecto No. 1\Proyecto 1\Backend\SwiftGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, FLOAT=3, STRING=4, BOOL=5, CHARACT=6, TRU=7, FAL=8, VAR=9, 
		LET=10, NULO=11, IF=12, ELSE=13, SWITCH=14, CASE=15, DEFAULT=16, BREAK=17, 
		CONTINUE=18, FOR=19, IN=20, RANGO=21, WHILE=22, GUARD=23, RETURN=24, FUNCION=25, 
		PRINT=26, INOUT=27, NUMBER=28, CADENA=29, ID_VALIDO=30, CHARACTER=31, 
		WS=32, IG=33, DOS_PUNTOS=34, PUNTOCOMA=35, CIERRE_INTE=36, PARIZQ=37, 
		PARDER=38, DIF=39, IG_IG=40, NOT=41, OR=42, AND=43, MAY_IG=44, MEN_IG=45, 
		MAYOR=46, MENOR=47, MODULO=48, MUL=49, DIV=50, ADD=51, SUB=52, SUMA=53, 
		RESTA=54, LLAVEIZQ=55, LLAVEDER=56, RETORNO=57, COMA=58, PUNTO=59, GUIONBAJO=60, 
		WHITESPACE=61, COMMENT=62, LINE_COMMENT=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR", 
			"LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", "PRINT", 
			"INOUT", "NUMBER", "CADENA", "ID_VALIDO", "CHARACTER", "ESCAPE", "WS", 
			"IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ", "PARDER", "DIF", 
			"IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MODULO", 
			"MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", "LLAVEDER", 
			"RETORNO", "COMA", "PUNTO", "GUIONBAJO", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
			"ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", 
			"'true'", "'false'", "'var'", "'let'", "'nil'", "'if'", "'else'", "'switch'", 
			"'case'", "'default'", "'breack'", "'continue'", "'for'", "'in'", "'...'", 
			"'while'", "'guard'", "'return'", "'func'", "'print'", "'inout'", null, 
			null, null, null, null, "'='", "':'", "';'", "'?'", "'('", "')'", "'!='", 
			"'=='", "'!'", "'||'", "'&&'", "'>='", "'<='", "'>'", "'<'", "'%'", "'*'", 
			"'/'", "'+'", "'-'", "'+='", "'-='", "'{'", "'}'", "'->'", "','", "'.'", 
			"'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", 
			"VAR", "LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", 
			"CONTINUE", "FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", 
			"PRINT", "INOUT", "NUMBER", "CADENA", "ID_VALIDO", "CHARACTER", "WS", 
			"IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ", "PARDER", "DIF", 
			"IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MODULO", 
			"MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", "LLAVEDER", 
			"RETORNO", "COMA", "PUNTO", "GUIONBAJO", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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


	public SwiftGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\6\35\u011b\n\35\r\35\16\35\u011c\3\35\3\35\6\35\u0121"+
		"\n\35\r\35\16\35\u0122\5\35\u0125\n\35\3\36\3\36\7\36\u0129\n\36\f\36"+
		"\16\36\u012c\13\36\3\36\3\36\3\37\3\37\7\37\u0132\n\37\f\37\16\37\u0135"+
		"\13\37\3 \3 \3 \5 \u013a\n \3 \3 \3!\3!\3!\3\"\6\"\u0142\n\"\r\"\16\""+
		"\u0143\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"9\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\6?\u018a\n?\r?\16?\u018b\3?\3"+
		"?\3@\3@\3@\3@\7@\u0194\n@\f@\16@\u0197\13@\3@\3@\3@\3@\3@\3A\3A\3A\3A"+
		"\7A\u01a2\nA\fA\16A\u01a5\13A\3A\3A\3B\3B\3B\3\u0195\2C\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\"E#"+
		"G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y="+
		"{>}?\177@\u0081A\u0083\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac"+
		"|\6\2\f\f\17\17))^^\7\2))^^ppttvv\5\2\13\f\17\17\"\"\6\2\13\f\17\17\""+
		"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u01b2\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u008b\3\2\2\2\t\u0091"+
		"\3\2\2\2\13\u0098\3\2\2\2\r\u009d\3\2\2\2\17\u00a7\3\2\2\2\21\u00ac\3"+
		"\2\2\2\23\u00b2\3\2\2\2\25\u00b6\3\2\2\2\27\u00ba\3\2\2\2\31\u00be\3\2"+
		"\2\2\33\u00c1\3\2\2\2\35\u00c6\3\2\2\2\37\u00cd\3\2\2\2!\u00d2\3\2\2\2"+
		"#\u00da\3\2\2\2%\u00e1\3\2\2\2\'\u00ea\3\2\2\2)\u00ee\3\2\2\2+\u00f1\3"+
		"\2\2\2-\u00f5\3\2\2\2/\u00fb\3\2\2\2\61\u0101\3\2\2\2\63\u0108\3\2\2\2"+
		"\65\u010d\3\2\2\2\67\u0113\3\2\2\29\u011a\3\2\2\2;\u0126\3\2\2\2=\u012f"+
		"\3\2\2\2?\u0136\3\2\2\2A\u013d\3\2\2\2C\u0141\3\2\2\2E\u0147\3\2\2\2G"+
		"\u0149\3\2\2\2I\u014b\3\2\2\2K\u014d\3\2\2\2M\u014f\3\2\2\2O\u0151\3\2"+
		"\2\2Q\u0153\3\2\2\2S\u0156\3\2\2\2U\u0159\3\2\2\2W\u015b\3\2\2\2Y\u015e"+
		"\3\2\2\2[\u0161\3\2\2\2]\u0164\3\2\2\2_\u0167\3\2\2\2a\u0169\3\2\2\2c"+
		"\u016b\3\2\2\2e\u016d\3\2\2\2g\u016f\3\2\2\2i\u0171\3\2\2\2k\u0173\3\2"+
		"\2\2m\u0175\3\2\2\2o\u0178\3\2\2\2q\u017b\3\2\2\2s\u017d\3\2\2\2u\u017f"+
		"\3\2\2\2w\u0182\3\2\2\2y\u0184\3\2\2\2{\u0186\3\2\2\2}\u0189\3\2\2\2\177"+
		"\u018f\3\2\2\2\u0081\u019d\3\2\2\2\u0083\u01a8\3\2\2\2\u0085\u0086\7("+
		"\2\2\u0086\4\3\2\2\2\u0087\u0088\7K\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7v\2\2\u008a\6\3\2\2\2\u008b\u008c\7H\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090\b\3\2\2\2\u0091\u0092"+
		"\7U\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7i\2\2\u0097\n\3\2\2\2\u0098\u0099\7D\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b\u009c\7n\2\2\u009c\f\3\2\2\2\u009d"+
		"\u009e\7E\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\u00a2\7c\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7g\2\2\u00ab\20\3\2\2\2\u00ac\u00ad"+
		"\7h\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0"+
		"\32\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7y\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7j\2\2"+
		"\u00cc\36\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7"+
		"u\2\2\u00d0\u00d1\7g\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7v\2\2\u00d9\"\3\2\2\2\u00da\u00db\7d\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7e\2\2"+
		"\u00df\u00e0\7m\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7q\2"+
		"\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7g\2\2\u00e9&\3\2\2\2\u00ea\u00eb"+
		"\7h\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7t\2\2\u00ed(\3\2\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7p\2\2\u00f0*\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3"+
		"\7\60\2\2\u00f3\u00f4\7\60\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6"+
		"\u00f7\7j\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2"+
		"\u00fa.\3\2\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7c\2"+
		"\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7f\2\2\u0100\60\3\2\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7g\2\2\u0103\u0104\7v\2\2\u0104\u0105\7w\2\2\u0105"+
		"\u0106\7t\2\2\u0106\u0107\7p\2\2\u0107\62\3\2\2\2\u0108\u0109\7h\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u010b\7p\2\2\u010b\u010c\7e\2\2\u010c\64\3\2\2\2\u010d"+
		"\u010e\7r\2\2\u010e\u010f\7t\2\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2"+
		"\u0111\u0112\7v\2\2\u0112\66\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7"+
		"p\2\2\u0115\u0116\7q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7v\2\2\u01188"+
		"\3\2\2\2\u0119\u011b\t\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0124\3\2\2\2\u011e\u0120\7\60"+
		"\2\2\u011f\u0121\t\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u011e\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125:\3\2\2\2\u0126\u012a\7$\2\2\u0127\u0129"+
		"\n\3\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7$"+
		"\2\2\u012e<\3\2\2\2\u012f\u0133\t\4\2\2\u0130\u0132\t\5\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		">\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139\7)\2\2\u0137\u013a\5A!\2\u0138"+
		"\u013a\n\6\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\7)\2\2\u013c@\3\2\2\2\u013d\u013e\7^\2\2\u013e\u013f"+
		"\t\7\2\2\u013fB\3\2\2\2\u0140\u0142\t\b\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\b\"\2\2\u0146D\3\2\2\2\u0147\u0148\7?\2\2\u0148F\3\2"+
		"\2\2\u0149\u014a\7<\2\2\u014aH\3\2\2\2\u014b\u014c\7=\2\2\u014cJ\3\2\2"+
		"\2\u014d\u014e\7A\2\2\u014eL\3\2\2\2\u014f\u0150\7*\2\2\u0150N\3\2\2\2"+
		"\u0151\u0152\7+\2\2\u0152P\3\2\2\2\u0153\u0154\7#\2\2\u0154\u0155\7?\2"+
		"\2\u0155R\3\2\2\2\u0156\u0157\7?\2\2\u0157\u0158\7?\2\2\u0158T\3\2\2\2"+
		"\u0159\u015a\7#\2\2\u015aV\3\2\2\2\u015b\u015c\7~\2\2\u015c\u015d\7~\2"+
		"\2\u015dX\3\2\2\2\u015e\u015f\7(\2\2\u015f\u0160\7(\2\2\u0160Z\3\2\2\2"+
		"\u0161\u0162\7@\2\2\u0162\u0163\7?\2\2\u0163\\\3\2\2\2\u0164\u0165\7>"+
		"\2\2\u0165\u0166\7?\2\2\u0166^\3\2\2\2\u0167\u0168\7@\2\2\u0168`\3\2\2"+
		"\2\u0169\u016a\7>\2\2\u016ab\3\2\2\2\u016b\u016c\7\'\2\2\u016cd\3\2\2"+
		"\2\u016d\u016e\7,\2\2\u016ef\3\2\2\2\u016f\u0170\7\61\2\2\u0170h\3\2\2"+
		"\2\u0171\u0172\7-\2\2\u0172j\3\2\2\2\u0173\u0174\7/\2\2\u0174l\3\2\2\2"+
		"\u0175\u0176\7-\2\2\u0176\u0177\7?\2\2\u0177n\3\2\2\2\u0178\u0179\7/\2"+
		"\2\u0179\u017a\7?\2\2\u017ap\3\2\2\2\u017b\u017c\7}\2\2\u017cr\3\2\2\2"+
		"\u017d\u017e\7\177\2\2\u017et\3\2\2\2\u017f\u0180\7/\2\2\u0180\u0181\7"+
		"@\2\2\u0181v\3\2\2\2\u0182\u0183\7.\2\2\u0183x\3\2\2\2\u0184\u0185\7\60"+
		"\2\2\u0185z\3\2\2\2\u0186\u0187\7a\2\2\u0187|\3\2\2\2\u0188\u018a\t\t"+
		"\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b?\2\2\u018e~\3\2\2\2\u018f"+
		"\u0190\7\61\2\2\u0190\u0191\7,\2\2\u0191\u0195\3\2\2\2\u0192\u0194\13"+
		"\2\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0196\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7,"+
		"\2\2\u0199\u019a\7\61\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b@\2\2\u019c"+
		"\u0080\3\2\2\2\u019d\u019e\7\61\2\2\u019e\u019f\7\61\2\2\u019f\u01a3\3"+
		"\2\2\2\u01a0\u01a2\n\n\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01a7\bA\2\2\u01a7\u0082\3\2\2\2\u01a8\u01a9\7^\2\2\u01a9\u01aa"+
		"\t\13\2\2\u01aa\u0084\3\2\2\2\r\2\u011c\u0122\u0124\u012a\u0133\u0139"+
		"\u0143\u018b\u0195\u01a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}