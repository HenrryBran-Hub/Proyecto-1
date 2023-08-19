// Generated from c:\Users\Henrr\OneDrive\Escritorio\Compiladores\Proyecto No. 1\Proyecto No. 1\Proyecto 1\Backend\SwiftLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "STRING", "BOOL", "CHARACT", "TRU", "FAL", "VAR", "LET", 
			"NULO", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "BREAK", "CONTINUE", 
			"FOR", "IN", "RANGO", "WHILE", "GUARD", "RETURN", "FUNCION", "PRINT", 
			"INOUT", "APPEND", "REMOVE", "REMOVELAST", "COUNT", "ISEMPTY", "AT", 
			"REPEATING", "STRUCT", "MUTATING", "NUMBER", "CADENA", "ID_VALIDO", "CHARACTER", 
			"ESCAPE", "WS", "IG", "DOS_PUNTOS", "PUNTOCOMA", "CIERRE_INTE", "PARIZQ", 
			"PARDER", "DIF", "IG_IG", "NOT", "OR", "AND", "MAY_IG", "MEN_IG", "MAYOR", 
			"MENOR", "MODULO", "MUL", "DIV", "ADD", "SUB", "SUMA", "RESTA", "LLAVEIZQ", 
			"LLAVEDER", "RETORNO", "COMA", "PUNTO", "GUIONBAJO", "CORCHIZQ", "CORCHDER", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
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


	public SwiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0205\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\6%\u0171"+
		"\n%\r%\16%\u0172\3%\3%\6%\u0177\n%\r%\16%\u0178\5%\u017b\n%\3&\3&\7&\u017f"+
		"\n&\f&\16&\u0182\13&\3&\3&\3\'\3\'\7\'\u0188\n\'\f\'\16\'\u018b\13\'\3"+
		"(\3(\3(\5(\u0190\n(\3(\3(\3)\3)\3)\3*\6*\u0198\n*\r*\16*\u0199\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\6I\u01e4\nI\rI\16I\u01e5\3"+
		"I\3I\3J\3J\3J\3J\7J\u01ee\nJ\fJ\16J\u01f1\13J\3J\3J\3J\3J\3J\3K\3K\3K"+
		"\3K\7K\u01fc\nK\fK\16K\u01ff\13K\3K\3K\3L\3L\3L\3\u01ef\2M\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q\2S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y="+
		"{>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091"+
		"I\u0093J\u0095K\u0097\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|"+
		"\6\2\f\f\17\17))^^\7\2))^^ppttvv\5\2\13\f\17\17\"\"\6\2\13\f\17\17\"\""+
		"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u020c\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0099\3\2\2\2\5\u009d\3\2\2\2\7\u00a3"+
		"\3\2\2\2\t\u00aa\3\2\2\2\13\u00af\3\2\2\2\r\u00b9\3\2\2\2\17\u00be\3\2"+
		"\2\2\21\u00c4\3\2\2\2\23\u00c8\3\2\2\2\25\u00cc\3\2\2\2\27\u00d0\3\2\2"+
		"\2\31\u00d3\3\2\2\2\33\u00d8\3\2\2\2\35\u00df\3\2\2\2\37\u00e4\3\2\2\2"+
		"!\u00ec\3\2\2\2#\u00f3\3\2\2\2%\u00fc\3\2\2\2\'\u0100\3\2\2\2)\u0103\3"+
		"\2\2\2+\u0107\3\2\2\2-\u010d\3\2\2\2/\u0113\3\2\2\2\61\u011a\3\2\2\2\63"+
		"\u011f\3\2\2\2\65\u0125\3\2\2\2\67\u012b\3\2\2\29\u0132\3\2\2\2;\u0139"+
		"\3\2\2\2=\u0144\3\2\2\2?\u014a\3\2\2\2A\u0152\3\2\2\2C\u0155\3\2\2\2E"+
		"\u015f\3\2\2\2G\u0166\3\2\2\2I\u0170\3\2\2\2K\u017c\3\2\2\2M\u0185\3\2"+
		"\2\2O\u018c\3\2\2\2Q\u0193\3\2\2\2S\u0197\3\2\2\2U\u019d\3\2\2\2W\u019f"+
		"\3\2\2\2Y\u01a1\3\2\2\2[\u01a3\3\2\2\2]\u01a5\3\2\2\2_\u01a7\3\2\2\2a"+
		"\u01a9\3\2\2\2c\u01ac\3\2\2\2e\u01af\3\2\2\2g\u01b1\3\2\2\2i\u01b4\3\2"+
		"\2\2k\u01b7\3\2\2\2m\u01ba\3\2\2\2o\u01bd\3\2\2\2q\u01bf\3\2\2\2s\u01c1"+
		"\3\2\2\2u\u01c3\3\2\2\2w\u01c5\3\2\2\2y\u01c7\3\2\2\2{\u01c9\3\2\2\2}"+
		"\u01cb\3\2\2\2\177\u01ce\3\2\2\2\u0081\u01d1\3\2\2\2\u0083\u01d3\3\2\2"+
		"\2\u0085\u01d5\3\2\2\2\u0087\u01d8\3\2\2\2\u0089\u01da\3\2\2\2\u008b\u01dc"+
		"\3\2\2\2\u008d\u01de\3\2\2\2\u008f\u01e0\3\2\2\2\u0091\u01e3\3\2\2\2\u0093"+
		"\u01e9\3\2\2\2\u0095\u01f7\3\2\2\2\u0097\u0202\3\2\2\2\u0099\u009a\7K"+
		"\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\4\3\2\2\2\u009d\u009e"+
		"\7H\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7i\2\2"+
		"\u00a9\b\3\2\2\2\u00aa\u00ab\7D\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7q"+
		"\2\2\u00ad\u00ae\7n\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1"+
		"\7j\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7e\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7t\2\2"+
		"\u00b8\f\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7w"+
		"\2\2\u00bc\u00bd\7g\2\2\u00bd\16\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\20\3\2\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\22\3\2\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\24\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\26\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2\30\3\2\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\32\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7y\2\2\u00da\u00db\7"+
		"k\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7j\2\2\u00de\34"+
		"\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7h\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7n\2\2"+
		"\u00ea\u00eb\7v\2\2\u00eb \3\2\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7t\2"+
		"\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2"+
		"\7m\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7w\2\2\u00fa\u00fb\7g\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd"+
		"\u00fe\7q\2\2\u00fe\u00ff\7t\2\2\u00ff&\3\2\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0102\7p\2\2\u0102(\3\2\2\2\u0103\u0104\7\60\2\2\u0104\u0105\7\60\2\2"+
		"\u0105\u0106\7\60\2\2\u0106*\3\2\2\2\u0107\u0108\7y\2\2\u0108\u0109\7"+
		"j\2\2\u0109\u010a\7k\2\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2\u010c,"+
		"\3\2\2\2\u010d\u010e\7i\2\2\u010e\u010f\7w\2\2\u010f\u0110\7c\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7f\2\2\u0112.\3\2\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7v\2\2\u0116\u0117\7w\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7p\2\2\u0119\60\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c\7"+
		"w\2\2\u011c\u011d\7p\2\2\u011d\u011e\7e\2\2\u011e\62\3\2\2\2\u011f\u0120"+
		"\7r\2\2\u0120\u0121\7t\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123"+
		"\u0124\7v\2\2\u0124\64\3\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127"+
		"\u0128\7q\2\2\u0128\u0129\7w\2\2\u0129\u012a\7v\2\2\u012a\66\3\2\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7r\2\2\u012d\u012e\7r\2\2\u012e\u012f\7g\2\2"+
		"\u012f\u0130\7p\2\2\u0130\u0131\7f\2\2\u01318\3\2\2\2\u0132\u0133\7t\2"+
		"\2\u0133\u0134\7g\2\2\u0134\u0135\7o\2\2\u0135\u0136\7q\2\2\u0136\u0137"+
		"\7x\2\2\u0137\u0138\7g\2\2\u0138:\3\2\2\2\u0139\u013a\7t\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7o\2\2\u013c\u013d\7q\2\2\u013d\u013e\7x\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7N\2\2\u0140\u0141\7c\2\2\u0141\u0142\7u\2\2"+
		"\u0142\u0143\7v\2\2\u0143<\3\2\2\2\u0144\u0145\7e\2\2\u0145\u0146\7q\2"+
		"\2\u0146\u0147\7w\2\2\u0147\u0148\7p\2\2\u0148\u0149\7v\2\2\u0149>\3\2"+
		"\2\2\u014a\u014b\7k\2\2\u014b\u014c\7u\2\2\u014c\u014d\7G\2\2\u014d\u014e"+
		"\7o\2\2\u014e\u014f\7r\2\2\u014f\u0150\7v\2\2\u0150\u0151\7{\2\2\u0151"+
		"@\3\2\2\2\u0152\u0153\7c\2\2\u0153\u0154\7v\2\2\u0154B\3\2\2\2\u0155\u0156"+
		"\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7r\2\2\u0158\u0159\7g\2\2\u0159"+
		"\u015a\7c\2\2\u015a\u015b\7v\2\2\u015b\u015c\7k\2\2\u015c\u015d\7p\2\2"+
		"\u015d\u015e\7i\2\2\u015eD\3\2\2\2\u015f\u0160\7u\2\2\u0160\u0161\7v\2"+
		"\2\u0161\u0162\7t\2\2\u0162\u0163\7w\2\2\u0163\u0164\7e\2\2\u0164\u0165"+
		"\7v\2\2\u0165F\3\2\2\2\u0166\u0167\7o\2\2\u0167\u0168\7w\2\2\u0168\u0169"+
		"\7v\2\2\u0169\u016a\7c\2\2\u016a\u016b\7v\2\2\u016b\u016c\7k\2\2\u016c"+
		"\u016d\7p\2\2\u016d\u016e\7i\2\2\u016eH\3\2\2\2\u016f\u0171\t\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u017a\3\2\2\2\u0174\u0176\7\60\2\2\u0175\u0177\t\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017b\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"J\3\2\2\2\u017c\u0180\7$\2\2\u017d\u017f\n\3\2\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7$\2\2\u0184L\3\2\2\2\u0185\u0189"+
		"\t\4\2\2\u0186\u0188\t\5\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aN\3\2\2\2\u018b\u0189\3\2\2\2"+
		"\u018c\u018f\7)\2\2\u018d\u0190\5Q)\2\u018e\u0190\n\6\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7)\2\2\u0192"+
		"P\3\2\2\2\u0193\u0194\7^\2\2\u0194\u0195\t\7\2\2\u0195R\3\2\2\2\u0196"+
		"\u0198\t\b\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b*\2\2\u019c"+
		"T\3\2\2\2\u019d\u019e\7?\2\2\u019eV\3\2\2\2\u019f\u01a0\7<\2\2\u01a0X"+
		"\3\2\2\2\u01a1\u01a2\7=\2\2\u01a2Z\3\2\2\2\u01a3\u01a4\7A\2\2\u01a4\\"+
		"\3\2\2\2\u01a5\u01a6\7*\2\2\u01a6^\3\2\2\2\u01a7\u01a8\7+\2\2\u01a8`\3"+
		"\2\2\2\u01a9\u01aa\7#\2\2\u01aa\u01ab\7?\2\2\u01abb\3\2\2\2\u01ac\u01ad"+
		"\7?\2\2\u01ad\u01ae\7?\2\2\u01aed\3\2\2\2\u01af\u01b0\7#\2\2\u01b0f\3"+
		"\2\2\2\u01b1\u01b2\7~\2\2\u01b2\u01b3\7~\2\2\u01b3h\3\2\2\2\u01b4\u01b5"+
		"\7(\2\2\u01b5\u01b6\7(\2\2\u01b6j\3\2\2\2\u01b7\u01b8\7@\2\2\u01b8\u01b9"+
		"\7?\2\2\u01b9l\3\2\2\2\u01ba\u01bb\7>\2\2\u01bb\u01bc\7?\2\2\u01bcn\3"+
		"\2\2\2\u01bd\u01be\7@\2\2\u01bep\3\2\2\2\u01bf\u01c0\7>\2\2\u01c0r\3\2"+
		"\2\2\u01c1\u01c2\7\'\2\2\u01c2t\3\2\2\2\u01c3\u01c4\7,\2\2\u01c4v\3\2"+
		"\2\2\u01c5\u01c6\7\61\2\2\u01c6x\3\2\2\2\u01c7\u01c8\7-\2\2\u01c8z\3\2"+
		"\2\2\u01c9\u01ca\7/\2\2\u01ca|\3\2\2\2\u01cb\u01cc\7-\2\2\u01cc\u01cd"+
		"\7?\2\2\u01cd~\3\2\2\2\u01ce\u01cf\7/\2\2\u01cf\u01d0\7?\2\2\u01d0\u0080"+
		"\3\2\2\2\u01d1\u01d2\7}\2\2\u01d2\u0082\3\2\2\2\u01d3\u01d4\7\177\2\2"+
		"\u01d4\u0084\3\2\2\2\u01d5\u01d6\7/\2\2\u01d6\u01d7\7@\2\2\u01d7\u0086"+
		"\3\2\2\2\u01d8\u01d9\7.\2\2\u01d9\u0088\3\2\2\2\u01da\u01db\7\60\2\2\u01db"+
		"\u008a\3\2\2\2\u01dc\u01dd\7a\2\2\u01dd\u008c\3\2\2\2\u01de\u01df\7]\2"+
		"\2\u01df\u008e\3\2\2\2\u01e0\u01e1\7_\2\2\u01e1\u0090\3\2\2\2\u01e2\u01e4"+
		"\t\t\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\bI\2\2\u01e8\u0092\3\2"+
		"\2\2\u01e9\u01ea\7\61\2\2\u01ea\u01eb\7,\2\2\u01eb\u01ef\3\2\2\2\u01ec"+
		"\u01ee\13\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f3\7,\2\2\u01f3\u01f4\7\61\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\bJ"+
		"\2\2\u01f6\u0094\3\2\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01f9\7\61\2\2\u01f9"+
		"\u01fd\3\2\2\2\u01fa\u01fc\n\n\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0201\bK\2\2\u0201\u0096\3\2\2\2\u0202\u0203\7^\2"+
		"\2\u0203\u0204\t\13\2\2\u0204\u0098\3\2\2\2\r\2\u0172\u0178\u017a\u0180"+
		"\u0189\u018f\u0199\u01e5\u01ef\u01fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}