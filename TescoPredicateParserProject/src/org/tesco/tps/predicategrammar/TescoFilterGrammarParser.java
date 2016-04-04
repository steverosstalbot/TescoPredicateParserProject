// Generated from TescoFilterGrammar.g4 by ANTLR 4.4

package org.tesco.tps.predicategrammar;
import java.util.HashMap;
import org.tesco.tps.filterhandler.RegisterSingleton;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TescoFilterGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ALLOW=2, DENY=3, TRUE=4, FALSE=5, AND=6, OR=7, NOT=8, NE=9, LT=10, 
		LE=11, GT=12, GE=13, EQ=14, PATHSEP=15, SPATHSEP=16, RPATHSEP=17, LBRACK=18, 
		RBRACK=19, LPAREN=20, RPAREN=21, POUND=22, CONTEXTSEP=23, INT=24, FLOAT=25, 
		CURRENCY=26, STRING=27, ID=28, PATH=29, SPATH=30, RPATH=31, VAR=32, SPACE=33;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'ALLOW'", "'DENY'", "'true'", "'false'", "'and'", 
		"'or'", "'!'", "'!='", "'<'", "'<='", "'>'", "'>='", "'=='", "'.'", "'/'", 
		"':'", "'['", "']'", "'('", "')'", "'£'", "'->'", "INT", "FLOAT", "CURRENCY", 
		"STRING", "ID", "PATH", "SPATH", "RPATH", "VAR", "SPACE"
	};
	public static final int
		RULE_ruleset = 0, RULE_filterset = 1, RULE_filter = 2, RULE_expression = 3, 
		RULE_or_expression = 4, RULE_and_expression = 5, RULE_term = 6, RULE_atom = 7, 
		RULE_operator = 8;
	public static final String[] ruleNames = {
		"ruleset", "filterset", "filter", "expression", "or_expression", "and_expression", 
		"term", "atom", "operator"
	};

	@Override
	public String getGrammarFileName() { return "TescoFilterGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public TescoFilterGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RulesetContext extends ParserRuleContext {
		public FiltersetContext filterset(int i) {
			return getRuleContext(FiltersetContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TescoFilterGrammarParser.EOF, 0); }
		public List<FiltersetContext> filterset() {
			return getRuleContexts(FiltersetContext.class);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitRuleset(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); filterset();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RPATH );
			setState(23); match(EOF);
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

	public static class FiltersetContext extends ParserRuleContext {
		public Token RPATH;
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public TerminalNode CONTEXTSEP() { return getToken(TescoFilterGrammarParser.CONTEXTSEP, 0); }
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public TerminalNode RPATH() { return getToken(TescoFilterGrammarParser.RPATH, 0); }
		public FiltersetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterFilterset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitFilterset(this);
		}
	}

	public final FiltersetContext filterset() throws RecognitionException {
		FiltersetContext _localctx = new FiltersetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_filterset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); ((FiltersetContext)_localctx).RPATH = match(RPATH);
			setState(26); match(CONTEXTSEP);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27); filter();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALLOW || _la==DENY );
			 
					{
						//System.out.println("-->filterset <" + (((FiltersetContext)_localctx).RPATH!=null?((FiltersetContext)_localctx).RPATH.getText():null) + ">"); 
						RegisterSingleton.getRegisters().getResourceVars().put((((FiltersetContext)_localctx).RPATH!=null?((FiltersetContext)_localctx).RPATH.getText():null), new String("TO BE RESOLVED AGAINST JSON INBOUND DOC"));
						//System.out.println("--->resource count: " + RegisterSingleton.getRegisters().getResourceVars().size());
					}
					// What we want to add to this is a list of filter expressions
				
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(TescoFilterGrammarParser.DENY, 0); }
		public TerminalNode ALLOW() { return getToken(TescoFilterGrammarParser.ALLOW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==ALLOW || _la==DENY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(35); expression();
			setState(36); match(T__0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); or_expression();
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

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TescoFilterGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TescoFilterGrammarParser.OR, i);
		}
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); and_expression();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(41); match(OR);
				setState(42); and_expression();
				}
				}
				setState(47);
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

	public static class And_expressionContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(TescoFilterGrammarParser.AND, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TescoFilterGrammarParser.AND); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); term();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(49); match(AND);
				setState(50); term();
				}
				}
				setState(55);
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

	public static class TermContext extends ParserRuleContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(TescoFilterGrammarParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TescoFilterGrammarParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			setState(66);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case PATH:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); atom();
				setState(60);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ))) != 0)) {
					{
					setState(57); operator();
					setState(58); atom();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(LPAREN);
				setState(63); expression();
				setState(64); match(RPAREN);
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

	public static class AtomContext extends ParserRuleContext {
		public Token VAR;
		public Token PATH;
		public TerminalNode VAR() { return getToken(TescoFilterGrammarParser.VAR, 0); }
		public TerminalNode PATH() { return getToken(TescoFilterGrammarParser.PATH, 0); }
		public TerminalNode FALSE() { return getToken(TescoFilterGrammarParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(TescoFilterGrammarParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(TescoFilterGrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(TescoFilterGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TescoFilterGrammarParser.FLOAT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); ((AtomContext)_localctx).VAR = match(VAR);

								{ 
									//System.out.println("-->VAR");
									RegisterSingleton.getRegisters().getUserContextVars().put((((AtomContext)_localctx).VAR!=null?((AtomContext)_localctx).VAR.getText():null).substring(1,(((AtomContext)_localctx).VAR!=null?((AtomContext)_localctx).VAR.getText():null).length()-1), new String("TO BE BOUND FROM USER CONTEXT"));
									//System.out.println("--->" + (((AtomContext)_localctx).VAR!=null?((AtomContext)_localctx).VAR.getText():null));
									//System.out.println("--->usermemory count: " + RegisterSingleton.getRegisters().getUserContextVars().size());
								}
							
				}
				break;
			case PATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); ((AtomContext)_localctx).PATH = match(PATH);

								{ 
									//System.out.println("-->ID");
									RegisterSingleton.getRegisters().getJSONVars().put((((AtomContext)_localctx).PATH!=null?((AtomContext)_localctx).PATH.getText():null), new String("TO BE BOUND TO THE INCOMING JSON DOC"));
									//System.out.println("--->" + (((AtomContext)_localctx).PATH!=null?((AtomContext)_localctx).PATH.getText():null));
									//System.out.println("--->jsonmemory count: " + RegisterSingleton.getRegisters().getJSONVars().size());
								}
							
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(76); match(FALSE);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(TescoFilterGrammarParser.NOT, 0); }
		public TerminalNode GE() { return getToken(TescoFilterGrammarParser.GE, 0); }
		public TerminalNode LT() { return getToken(TescoFilterGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(TescoFilterGrammarParser.GT, 0); }
		public TerminalNode LE() { return getToken(TescoFilterGrammarParser.LE, 0); }
		public TerminalNode EQ() { return getToken(TescoFilterGrammarParser.EQ, 0); }
		public TerminalNode NE() { return getToken(TescoFilterGrammarParser.NE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#T\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26\n"+
		"\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\3\7\3\7\7"+
		"\7\66\n\7\f\7\16\79\13\7\3\b\3\b\3\b\3\b\5\b?\n\b\3\b\3\b\3\b\3\b\5\b"+
		"E\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tP\n\t\3\n\3\n\3\n\2\2\13"+
		"\2\4\6\b\n\f\16\20\22\2\4\3\2\4\5\3\2\n\20V\2\25\3\2\2\2\4\33\3\2\2\2"+
		"\6$\3\2\2\2\b(\3\2\2\2\n*\3\2\2\2\f\62\3\2\2\2\16D\3\2\2\2\20O\3\2\2\2"+
		"\22Q\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7!\2\2\34\36"+
		"\7\31\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2"+
		"\2!\"\3\2\2\2\"#\b\3\1\2#\5\3\2\2\2$%\t\2\2\2%&\5\b\5\2&\'\7\3\2\2\'\7"+
		"\3\2\2\2()\5\n\6\2)\t\3\2\2\2*/\5\f\7\2+,\7\t\2\2,.\5\f\7\2-+\3\2\2\2"+
		".\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61/\3\2\2\2\62\67\5\16"+
		"\b\2\63\64\7\b\2\2\64\66\5\16\b\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\r\3\2\2\29\67\3\2\2\2:>\5\20\t\2;<\5\22\n\2<=\5\20\t"+
		"\2=?\3\2\2\2>;\3\2\2\2>?\3\2\2\2?E\3\2\2\2@A\7\26\2\2AB\5\b\5\2BC\7\27"+
		"\2\2CE\3\2\2\2D:\3\2\2\2D@\3\2\2\2E\17\3\2\2\2FG\7\"\2\2GP\b\t\1\2HI\7"+
		"\37\2\2IP\b\t\1\2JP\7\32\2\2KP\7\33\2\2LP\7\35\2\2MP\7\6\2\2NP\7\7\2\2"+
		"OF\3\2\2\2OH\3\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2"+
		"P\21\3\2\2\2QR\t\3\2\2R\23\3\2\2\2\t\27 /\67>DO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}