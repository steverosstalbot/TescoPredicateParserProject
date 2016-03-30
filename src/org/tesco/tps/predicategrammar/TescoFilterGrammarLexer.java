// Generated from TescoFilterGrammar.g4 by ANTLR 4.4

package org.tesco.tps.predicategrammar;
import java.util.HashMap;

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
		T__0=1, ALLOW=2, DENY=3, TRUE=4, FALSE=5, AND=6, OR=7, NOT=8, NE=9, LT=10, 
		LE=11, GT=12, GE=13, EQ=14, PATHSEP=15, SPATHSEP=16, RPATHSEP=17, LBRACK=18, 
		RBRACK=19, LPAREN=20, RPAREN=21, POUND=22, CONTEXTSEP=23, INT=24, FLOAT=25, 
		CURRENCY=26, STRING=27, ID=28, PATH=29, SPATH=30, RPATH=31, VAR=32, SPACE=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"T__0", "ALLOW", "DENY", "TRUE", "FALSE", "AND", "OR", "NOT", "NE", "LT", 
		"LE", "GT", "GE", "EQ", "PATHSEP", "SPATHSEP", "RPATHSEP", "LBRACK", "RBRACK", 
		"LPAREN", "RPAREN", "POUND", "CONTEXTSEP", "INT", "FLOAT", "CURRENCY", 
		"STRING", "ID", "PATH", "SPATH", "RPATH", "VAR", "SPACE"
	};


	/** Map variable name to objects holding some value */
	public static HashMap resources = new HashMap(); 	// resource against filter list
	public static HashMap usermemory = new HashMap(); 	// unbound variables
	public static HashMap jsonmemory = new HashMap(); 	// unbound JSON variables


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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\6\31\u008b\n\31\r\31\16\31\u008c\3"+
		"\32\6\32\u0090\n\32\r\32\16\32\u0091\3\32\3\32\7\32\u0096\n\32\f\32\16"+
		"\32\u0099\13\32\3\33\3\33\3\33\3\34\3\34\7\34\u00a0\n\34\f\34\16\34\u00a3"+
		"\13\34\3\34\3\34\3\34\7\34\u00a8\n\34\f\34\16\34\u00ab\13\34\3\34\5\34"+
		"\u00ae\n\34\3\35\3\35\7\35\u00b2\n\35\f\35\16\35\u00b5\13\35\3\36\3\36"+
		"\3\36\3\36\7\36\u00bb\n\36\f\36\16\36\u00be\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u00c6\n\37\f\37\16\37\u00c9\13\37\3 \3 \3 \3 \3 \3 \7"+
		" \u00d1\n \f \16 \u00d4\13 \3!\3!\3!\3!\3\"\6\"\u00db\n\"\r\"\16\"\u00dc"+
		"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#\3\2\6\6\2//C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\4"+
		"\2\13\13\"\"\u00ea\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E"+
		"\3\2\2\2\5G\3\2\2\2\7M\3\2\2\2\tR\3\2\2\2\13W\3\2\2\2\r]\3\2\2\2\17a\3"+
		"\2\2\2\21d\3\2\2\2\23f\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31n\3\2\2\2\33"+
		"p\3\2\2\2\35s\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'~\3\2"+
		"\2\2)\u0080\3\2\2\2+\u0082\3\2\2\2-\u0084\3\2\2\2/\u0086\3\2\2\2\61\u008a"+
		"\3\2\2\2\63\u008f\3\2\2\2\65\u009a\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2"+
		"\2\2;\u00b6\3\2\2\2=\u00bf\3\2\2\2?\u00ca\3\2\2\2A\u00d5\3\2\2\2C\u00da"+
		"\3\2\2\2EF\7=\2\2F\4\3\2\2\2GH\7C\2\2HI\7N\2\2IJ\7N\2\2JK\7Q\2\2KL\7Y"+
		"\2\2L\6\3\2\2\2MN\7F\2\2NO\7G\2\2OP\7P\2\2PQ\7[\2\2Q\b\3\2\2\2RS\7v\2"+
		"\2ST\7t\2\2TU\7w\2\2UV\7g\2\2V\n\3\2\2\2WX\7h\2\2XY\7c\2\2YZ\7n\2\2Z["+
		"\7u\2\2[\\\7g\2\2\\\f\3\2\2\2]^\7c\2\2^_\7p\2\2_`\7f\2\2`\16\3\2\2\2a"+
		"b\7q\2\2bc\7t\2\2c\20\3\2\2\2de\7#\2\2e\22\3\2\2\2fg\7#\2\2gh\7?\2\2h"+
		"\24\3\2\2\2ij\7>\2\2j\26\3\2\2\2kl\7>\2\2lm\7?\2\2m\30\3\2\2\2no\7@\2"+
		"\2o\32\3\2\2\2pq\7@\2\2qr\7?\2\2r\34\3\2\2\2st\7?\2\2tu\7?\2\2u\36\3\2"+
		"\2\2vw\7\60\2\2w \3\2\2\2xy\7\61\2\2y\"\3\2\2\2z{\7<\2\2{$\3\2\2\2|}\7"+
		"]\2\2}&\3\2\2\2~\177\7_\2\2\177(\3\2\2\2\u0080\u0081\7*\2\2\u0081*\3\2"+
		"\2\2\u0082\u0083\7+\2\2\u0083,\3\2\2\2\u0084\u0085\7\u00a5\2\2\u0085."+
		"\3\2\2\2\u0086\u0087\7/\2\2\u0087\u0088\7@\2\2\u0088\60\3\2\2\2\u0089"+
		"\u008b\4\62;\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\62\3\2\2\2\u008e\u0090\4\62;\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0097\7\60\2\2\u0094\u0096\4\62;\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\64\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5-\27\2\u009b\u009c\5\63\32"+
		"\2\u009c\66\3\2\2\2\u009d\u00a1\7$\2\2\u009e\u00a0\t\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00ae\7$\2\2\u00a5\u00a9\7)\2"+
		"\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\7)\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ae8\3\2\2\2\u00af"+
		"\u00b3\t\3\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4:\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00bc\59\35\2\u00b7\u00b8\5\37\20\2\u00b8\u00b9\5;\36\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd<\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\59\35\2\u00c0\u00c1\5!\21\2\u00c1\u00c7\59\35\2\u00c2\u00c3\5!"+
		"\21\2\u00c3\u00c4\59\35\2\u00c4\u00c6\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8>\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cb\59\35\2\u00cb\u00cc\5#\22\2\u00cc\u00d2"+
		"\59\35\2\u00cd\u00ce\5#\22\2\u00ce\u00cf\59\35\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3@\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7}\2\2\u00d6\u00d7"+
		"\5;\36\2\u00d7\u00d8\7\177\2\2\u00d8B\3\2\2\2\u00d9\u00db\t\5\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\"\2\2\u00dfD\3\2\2\2\16\2\u008c"+
		"\u0091\u0097\u00a1\u00a9\u00ad\u00b3\u00bc\u00c7\u00d2\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}