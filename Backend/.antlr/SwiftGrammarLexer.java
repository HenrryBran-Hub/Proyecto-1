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
		PRINT=26, INOUT=27, APPEND=28, REMOVE=29, REMOVELAST=30, COUNT=31, EMPTY=32, 
		AT=33, REPEATING=34, STRUCT=35, MUTATING=36, NUMBER=37, CADENA=38, ID_VALIDO=39, 
		CHARACTER=40, WS=41, IG=42, DOS_PUNTOS=43, PUNTOCOMA=44, CIERRE_INTE=45, 
		PARIZQ=46, PARDER=47, DIF=48, IG_IG=49, NOT=50, OR=51, AND=52, MAY_IG=53, 
		MEN_IG=54, MAYOR=55, MENOR=56, MODULO=57, MUL=58, DIV=59, ADD=60, SUB=61, 
		SUMA=62, RESTA=63, LLAVEIZQ=64, LLAVEDER=65, RETORNO=66, COMA=67, PUNTO=68, 
		GUIONBAJO=69, CORCHIZQ=70, CORCHDER=71, WHITESPACE=72, COMMENT=73, LINE_COMMENT=74;
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
			"INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "EMPTY", "AT", "REPEATING", 
			"STRUCT", "MUTATING", "NUMBER", "CADENA", "ID_VALIDO", "CHARACTER", "ESCAPE", 
			"WS", "IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ", "PARDER", 
			"DIF", "IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", 
			"MODULO", "MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", "LLAVEDER", 
			"RETORNO", "COMA", "PUNTO", "GUIONBAJO", "CORCHIZQ", "CORCHDER", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", 
			"'true'", "'false'", "'var'", "'let'", "'nil'", "'if'", "'else'", "'switch'", 
			"'case'", "'default'", "'breack'", "'continue'", "'for'", "'in'", "'...'", 
			"'while'", "'guard'", "'return'", "'func'", "'print'", "'inout'", "'append'", 
			"'remove'", "'removeLast'", "'count'", "'isEmpty'", "'at'", "'repeating'", 
			"'struct'", "'mutating'", null, null, null, null, null, "'='", "':'", 
			"';'", "'?'", "'('", "')'", "'!='", "'=='", "'!'", "'||'", "'&&'", "'>='", 
			"'<='", "'>'", "'<'", "'%'", "'*'", "'/'", "'+'", "'-'", "'+='", "'-='", 
			"'{'", "'}'", "'->'", "','", "'.'", "'_'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", 
			"VAR", "LET", "NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", 
			"CONTINUE", "FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", 
			"PRINT", "INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "EMPTY", 
			"AT", "REPEATING", "STRUCT", "MUTATING", "NUMBER", "CADENA", "ID_VALIDO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0209\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\6&\u0175"+
		"\n&\r&\16&\u0176\3&\3&\6&\u017b\n&\r&\16&\u017c\5&\u017f\n&\3\'\3\'\7"+
		"\'\u0183\n\'\f\'\16\'\u0186\13\'\3\'\3\'\3(\3(\7(\u018c\n(\f(\16(\u018f"+
		"\13(\3)\3)\3)\5)\u0194\n)\3)\3)\3*\3*\3*\3+\6+\u019c\n+\r+\16+\u019d\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38"+
		"\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B"+
		"\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\6J\u01e8\nJ\rJ\16J\u01e9"+
		"\3J\3J\3K\3K\3K\3K\7K\u01f2\nK\fK\16K\u01f5\13K\3K\3K\3K\3K\3K\3L\3L\3"+
		"L\3L\7L\u0200\nL\fL\16L\u0203\13L\3L\3L\3M\3M\3M\3\u01f3\2N\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S\2U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;"+
		"w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH"+
		"\u0091I\u0093J\u0095K\u0097L\u0099\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6"+
		"\2\62;C\\aac|\6\2\f\f\17\17))^^\7\2))^^ppttvv\5\2\13\f\17\17\"\"\6\2\13"+
		"\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u0210\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u009b\3\2\2"+
		"\2\5\u009d\3\2\2\2\7\u00a1\3\2\2\2\t\u00a7\3\2\2\2\13\u00ae\3\2\2\2\r"+
		"\u00b3\3\2\2\2\17\u00bd\3\2\2\2\21\u00c2\3\2\2\2\23\u00c8\3\2\2\2\25\u00cc"+
		"\3\2\2\2\27\u00d0\3\2\2\2\31\u00d4\3\2\2\2\33\u00d7\3\2\2\2\35\u00dc\3"+
		"\2\2\2\37\u00e3\3\2\2\2!\u00e8\3\2\2\2#\u00f0\3\2\2\2%\u00f7\3\2\2\2\'"+
		"\u0100\3\2\2\2)\u0104\3\2\2\2+\u0107\3\2\2\2-\u010b\3\2\2\2/\u0111\3\2"+
		"\2\2\61\u0117\3\2\2\2\63\u011e\3\2\2\2\65\u0123\3\2\2\2\67\u0129\3\2\2"+
		"\29\u012f\3\2\2\2;\u0136\3\2\2\2=\u013d\3\2\2\2?\u0148\3\2\2\2A\u014e"+
		"\3\2\2\2C\u0156\3\2\2\2E\u0159\3\2\2\2G\u0163\3\2\2\2I\u016a\3\2\2\2K"+
		"\u0174\3\2\2\2M\u0180\3\2\2\2O\u0189\3\2\2\2Q\u0190\3\2\2\2S\u0197\3\2"+
		"\2\2U\u019b\3\2\2\2W\u01a1\3\2\2\2Y\u01a3\3\2\2\2[\u01a5\3\2\2\2]\u01a7"+
		"\3\2\2\2_\u01a9\3\2\2\2a\u01ab\3\2\2\2c\u01ad\3\2\2\2e\u01b0\3\2\2\2g"+
		"\u01b3\3\2\2\2i\u01b5\3\2\2\2k\u01b8\3\2\2\2m\u01bb\3\2\2\2o\u01be\3\2"+
		"\2\2q\u01c1\3\2\2\2s\u01c3\3\2\2\2u\u01c5\3\2\2\2w\u01c7\3\2\2\2y\u01c9"+
		"\3\2\2\2{\u01cb\3\2\2\2}\u01cd\3\2\2\2\177\u01cf\3\2\2\2\u0081\u01d2\3"+
		"\2\2\2\u0083\u01d5\3\2\2\2\u0085\u01d7\3\2\2\2\u0087\u01d9\3\2\2\2\u0089"+
		"\u01dc\3\2\2\2\u008b\u01de\3\2\2\2\u008d\u01e0\3\2\2\2\u008f\u01e2\3\2"+
		"\2\2\u0091\u01e4\3\2\2\2\u0093\u01e7\3\2\2\2\u0095\u01ed\3\2\2\2\u0097"+
		"\u01fb\3\2\2\2\u0099\u0206\3\2\2\2\u009b\u009c\7(\2\2\u009c\4\3\2\2\2"+
		"\u009d\u009e\7K\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0\6\3\2"+
		"\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7i\2\2\u00ad\n\3\2\2\2\u00ae\u00af\7D\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\u00b2\7n\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7E\2\2\u00b4"+
		"\u00b5\7j\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7c\2\2"+
		"\u00b8\u00b9\7e\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc"+
		"\7t\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7w\2\2\u00c0\u00c1\7g\2\2\u00c1\20\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4"+
		"\7c\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\22\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\24\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\26\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\30\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7h\2\2\u00d6\32\3\2\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2"+
		"\u00db\34\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7y\2\2\u00de\u00df\7"+
		"k\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7j\2\2\u00e2\36"+
		"\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7u\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7h\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7n\2\2"+
		"\u00ee\u00ef\7v\2\2\u00ef\"\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7t"+
		"\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6"+
		"\7m\2\2\u00f6$\3\2\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7w\2\2\u00fe\u00ff\7g\2\2\u00ff&\3\2\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103(\3\2\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7p\2\2\u0106*\3\2\2\2\u0107\u0108\7\60\2\2\u0108\u0109\7\60\2\2"+
		"\u0109\u010a\7\60\2\2\u010a,\3\2\2\2\u010b\u010c\7y\2\2\u010c\u010d\7"+
		"j\2\2\u010d\u010e\7k\2\2\u010e\u010f\7n\2\2\u010f\u0110\7g\2\2\u0110."+
		"\3\2\2\2\u0111\u0112\7i\2\2\u0112\u0113\7w\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7t\2\2\u0115\u0116\7f\2\2\u0116\60\3\2\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7v\2\2\u011a\u011b\7w\2\2\u011b\u011c\7t\2\2"+
		"\u011c\u011d\7p\2\2\u011d\62\3\2\2\2\u011e\u011f\7h\2\2\u011f\u0120\7"+
		"w\2\2\u0120\u0121\7p\2\2\u0121\u0122\7e\2\2\u0122\64\3\2\2\2\u0123\u0124"+
		"\7r\2\2\u0124\u0125\7t\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127"+
		"\u0128\7v\2\2\u0128\66\3\2\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7q\2\2\u012c\u012d\7w\2\2\u012d\u012e\7v\2\2\u012e8\3\2\2\2\u012f"+
		"\u0130\7c\2\2\u0130\u0131\7r\2\2\u0131\u0132\7r\2\2\u0132\u0133\7g\2\2"+
		"\u0133\u0134\7p\2\2\u0134\u0135\7f\2\2\u0135:\3\2\2\2\u0136\u0137\7t\2"+
		"\2\u0137\u0138\7g\2\2\u0138\u0139\7o\2\2\u0139\u013a\7q\2\2\u013a\u013b"+
		"\7x\2\2\u013b\u013c\7g\2\2\u013c<\3\2\2\2\u013d\u013e\7t\2\2\u013e\u013f"+
		"\7g\2\2\u013f\u0140\7o\2\2\u0140\u0141\7q\2\2\u0141\u0142\7x\2\2\u0142"+
		"\u0143\7g\2\2\u0143\u0144\7N\2\2\u0144\u0145\7c\2\2\u0145\u0146\7u\2\2"+
		"\u0146\u0147\7v\2\2\u0147>\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7q\2"+
		"\2\u014a\u014b\7w\2\2\u014b\u014c\7p\2\2\u014c\u014d\7v\2\2\u014d@\3\2"+
		"\2\2\u014e\u014f\7k\2\2\u014f\u0150\7u\2\2\u0150\u0151\7G\2\2\u0151\u0152"+
		"\7o\2\2\u0152\u0153\7r\2\2\u0153\u0154\7v\2\2\u0154\u0155\7{\2\2\u0155"+
		"B\3\2\2\2\u0156\u0157\7c\2\2\u0157\u0158\7v\2\2\u0158D\3\2\2\2\u0159\u015a"+
		"\7t\2\2\u015a\u015b\7g\2\2\u015b\u015c\7r\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u015e\7c\2\2\u015e\u015f\7v\2\2\u015f\u0160\7k\2\2\u0160\u0161\7p\2\2"+
		"\u0161\u0162\7i\2\2\u0162F\3\2\2\2\u0163\u0164\7u\2\2\u0164\u0165\7v\2"+
		"\2\u0165\u0166\7t\2\2\u0166\u0167\7w\2\2\u0167\u0168\7e\2\2\u0168\u0169"+
		"\7v\2\2\u0169H\3\2\2\2\u016a\u016b\7o\2\2\u016b\u016c\7w\2\2\u016c\u016d"+
		"\7v\2\2\u016d\u016e\7c\2\2\u016e\u016f\7v\2\2\u016f\u0170\7k\2\2\u0170"+
		"\u0171\7p\2\2\u0171\u0172\7i\2\2\u0172J\3\2\2\2\u0173\u0175\t\2\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u017e\3\2\2\2\u0178\u017a\7\60\2\2\u0179\u017b\t\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"L\3\2\2\2\u0180\u0184\7$\2\2\u0181\u0183\n\3\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7$\2\2\u0188N\3\2\2\2\u0189\u018d"+
		"\t\4\2\2\u018a\u018c\t\5\2\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018eP\3\2\2\2\u018f\u018d\3\2\2\2"+
		"\u0190\u0193\7)\2\2\u0191\u0194\5S*\2\u0192\u0194\n\6\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7)\2\2\u0196"+
		"R\3\2\2\2\u0197\u0198\7^\2\2\u0198\u0199\t\7\2\2\u0199T\3\2\2\2\u019a"+
		"\u019c\t\b\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b+\2\2\u01a0"+
		"V\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2X\3\2\2\2\u01a3\u01a4\7<\2\2\u01a4Z"+
		"\3\2\2\2\u01a5\u01a6\7=\2\2\u01a6\\\3\2\2\2\u01a7\u01a8\7A\2\2\u01a8^"+
		"\3\2\2\2\u01a9\u01aa\7*\2\2\u01aa`\3\2\2\2\u01ab\u01ac\7+\2\2\u01acb\3"+
		"\2\2\2\u01ad\u01ae\7#\2\2\u01ae\u01af\7?\2\2\u01afd\3\2\2\2\u01b0\u01b1"+
		"\7?\2\2\u01b1\u01b2\7?\2\2\u01b2f\3\2\2\2\u01b3\u01b4\7#\2\2\u01b4h\3"+
		"\2\2\2\u01b5\u01b6\7~\2\2\u01b6\u01b7\7~\2\2\u01b7j\3\2\2\2\u01b8\u01b9"+
		"\7(\2\2\u01b9\u01ba\7(\2\2\u01bal\3\2\2\2\u01bb\u01bc\7@\2\2\u01bc\u01bd"+
		"\7?\2\2\u01bdn\3\2\2\2\u01be\u01bf\7>\2\2\u01bf\u01c0\7?\2\2\u01c0p\3"+
		"\2\2\2\u01c1\u01c2\7@\2\2\u01c2r\3\2\2\2\u01c3\u01c4\7>\2\2\u01c4t\3\2"+
		"\2\2\u01c5\u01c6\7\'\2\2\u01c6v\3\2\2\2\u01c7\u01c8\7,\2\2\u01c8x\3\2"+
		"\2\2\u01c9\u01ca\7\61\2\2\u01caz\3\2\2\2\u01cb\u01cc\7-\2\2\u01cc|\3\2"+
		"\2\2\u01cd\u01ce\7/\2\2\u01ce~\3\2\2\2\u01cf\u01d0\7-\2\2\u01d0\u01d1"+
		"\7?\2\2\u01d1\u0080\3\2\2\2\u01d2\u01d3\7/\2\2\u01d3\u01d4\7?\2\2\u01d4"+
		"\u0082\3\2\2\2\u01d5\u01d6\7}\2\2\u01d6\u0084\3\2\2\2\u01d7\u01d8\7\177"+
		"\2\2\u01d8\u0086\3\2\2\2\u01d9\u01da\7/\2\2\u01da\u01db\7@\2\2\u01db\u0088"+
		"\3\2\2\2\u01dc\u01dd\7.\2\2\u01dd\u008a\3\2\2\2\u01de\u01df\7\60\2\2\u01df"+
		"\u008c\3\2\2\2\u01e0\u01e1\7a\2\2\u01e1\u008e\3\2\2\2\u01e2\u01e3\7]\2"+
		"\2\u01e3\u0090\3\2\2\2\u01e4\u01e5\7_\2\2\u01e5\u0092\3\2\2\2\u01e6\u01e8"+
		"\t\t\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\bJ\2\2\u01ec\u0094\3\2"+
		"\2\2\u01ed\u01ee\7\61\2\2\u01ee\u01ef\7,\2\2\u01ef\u01f3\3\2\2\2\u01f0"+
		"\u01f2\13\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f4\3"+
		"\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\u01f7\7,\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\bK"+
		"\2\2\u01fa\u0096\3\2\2\2\u01fb\u01fc\7\61\2\2\u01fc\u01fd\7\61\2\2\u01fd"+
		"\u0201\3\2\2\2\u01fe\u0200\n\n\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0205\bL\2\2\u0205\u0098\3\2\2\2\u0206\u0207\7^\2"+
		"\2\u0207\u0208\t\13\2\2\u0208\u009a\3\2\2\2\r\2\u0176\u017c\u017e\u0184"+
		"\u018d\u0193\u019d\u01e9\u01f3\u0201\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}