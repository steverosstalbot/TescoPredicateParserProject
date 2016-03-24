// Generated from TescoFilterGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TescoFilterGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, ALLOW=3, DENY=4, TRUE=5, FALSE=6, AND=7, OR=8, NOT=9, 
		LT=10, LE=11, GT=12, GE=13, EQ=14, PATHSEP=15, LBRACK=16, RBRACK=17, LPAREN=18, 
		RPAREN=19, POUND=20, INT=21, FLOAT=22, CURRENCY=23, STRING=24, ID=25, 
		VAR=26, PATH=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "ALLOW", "DENY", "TRUE", "FALSE", "AND", "OR", "NOT", 
		"LT", "LE", "GT", "GE", "EQ", "PATHSEP", "LBRACK", "RBRACK", "LPAREN", 
		"RPAREN", "POUND", "INT", "FLOAT", "CURRENCY", "STRING", "ID", "VAR", 
		"PATH"
	};


	public TescoFilterGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TescoFilterGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\6\26v\n\26\r\26\16\26w\3\27\6\27{\n\27\r\27\16\27|\3\27"+
		"\3\27\7\27\u0081\n\27\f\27\16\27\u0084\13\27\3\30\3\30\3\30\3\31\3\31"+
		"\7\31\u008b\n\31\f\31\16\31\u008e\13\31\3\31\3\31\3\32\3\32\7\32\u0094"+
		"\n\32\f\32\16\32\u0097\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\6\34\u00a2\n\34\r\34\16\34\u00a3\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\35\3\2\5\6\2\"\"C\\aac|\5\2C\\aac|\6"+
		"\2\62;C\\aac|\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13H\3\2\2\2\rM\3\2\2"+
		"\2\17S\3\2\2\2\21W\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31a\3"+
		"\2\2\2\33c\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#l\3\2\2\2%n\3\2\2"+
		"\2\'p\3\2\2\2)r\3\2\2\2+u\3\2\2\2-z\3\2\2\2/\u0085\3\2\2\2\61\u0088\3"+
		"\2\2\2\63\u0091\3\2\2\2\65\u0098\3\2\2\2\67\u00a1\3\2\2\29:\7<\2\2:\4"+
		"\3\2\2\2;<\7=\2\2<\6\3\2\2\2=>\7C\2\2>?\7N\2\2?@\7N\2\2@A\7Q\2\2AB\7Y"+
		"\2\2B\b\3\2\2\2CD\7F\2\2DE\7G\2\2EF\7P\2\2FG\7[\2\2G\n\3\2\2\2HI\7v\2"+
		"\2IJ\7t\2\2JK\7w\2\2KL\7g\2\2L\f\3\2\2\2MN\7h\2\2NO\7c\2\2OP\7n\2\2PQ"+
		"\7u\2\2QR\7g\2\2R\16\3\2\2\2ST\7c\2\2TU\7p\2\2UV\7f\2\2V\20\3\2\2\2WX"+
		"\7q\2\2XY\7t\2\2Y\22\3\2\2\2Z[\7#\2\2[\24\3\2\2\2\\]\7>\2\2]\26\3\2\2"+
		"\2^_\7>\2\2_`\7?\2\2`\30\3\2\2\2ab\7@\2\2b\32\3\2\2\2cd\7@\2\2de\7?\2"+
		"\2e\34\3\2\2\2fg\7?\2\2g\36\3\2\2\2hi\7\61\2\2i \3\2\2\2jk\7]\2\2k\"\3"+
		"\2\2\2lm\7_\2\2m$\3\2\2\2no\7*\2\2o&\3\2\2\2pq\7+\2\2q(\3\2\2\2rs\7\u00a5"+
		"\2\2s*\3\2\2\2tv\4\62;\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x,\3\2"+
		"\2\2y{\4\62;\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0082"+
		"\7\60\2\2\177\u0081\4\62;\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083.\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0086\5)\25\2\u0086\u0087\5-\27\2\u0087\60\3\2\2\2\u0088\u008c"+
		"\7$\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7$\2\2\u0090\62\3\2\2\2\u0091\u0095\t\3\2\2\u0092\u0094"+
		"\t\4\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\64\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7}\2\2"+
		"\u0099\u009a\5\67\34\2\u009a\u009b\7\177\2\2\u009b\66\3\2\2\2\u009c\u00a2"+
		"\5\63\32\2\u009d\u009e\5\63\32\2\u009e\u009f\5\37\20\2\u009f\u00a0\5\67"+
		"\34\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a48\3\2\2\2"+
		"\n\2w|\u0082\u008c\u0095\u00a1\u00a3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}