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
		T__0=1, ALL=2, WITHIN=3, MATCH=4, ALLOW=5, DENY=6, TRUE=7, FALSE=8, AND=9, 
		OR=10, NOT=11, NE=12, LT=13, LE=14, GT=15, GE=16, EQ=17, PATHSEP=18, SPATHSEP=19, 
		RPATHSEP=20, LBRACK=21, RBRACK=22, QMARK=23, AT=24, LPAREN=25, RPAREN=26, 
		POUND=27, CONTEXTSEP=28, INT=29, FLOAT=30, CURRENCY=31, STRING=32, ID=33, 
		PATH=34, SPATH=35, RPATH=36, VAR=37, SPACE=38;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'all'", "'within'", "'matching'", "'ALLOW'", "'DENY'", 
		"'true'", "'false'", "'and'", "'or'", "'!'", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'.'", "'/'", "':'", "'['", "']'", "'?'", "'@'", "'('", 
		"')'", "'£'", "'->'", "INT", "FLOAT", "CURRENCY", "STRING", "ID", "PATH", 
		"SPATH", "RPATH", "VAR", "SPACE"
	};
	public static final int
		RULE_ruleset = 0, RULE_filter = 1, RULE_expression = 2, RULE_or_expression = 3, 
		RULE_and_expression = 4, RULE_term = 5, RULE_qualifiedterm = 6, RULE_atom = 7, 
		RULE_operator = 8;
	public static final String[] ruleNames = {
		"ruleset", "filter", "expression", "or_expression", "and_expression", 
		"term", "qualifiedterm", "atom", "operator"
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
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public TerminalNode EOF() { return getToken(TescoFilterGrammarParser.EOF, 0); }
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
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
				setState(18); filter();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALLOW || _la==DENY );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==ALLOW || _la==DENY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(26); expression();
			setState(27); match(T__0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); or_expression();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); and_expression();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(32); match(OR);
				setState(33); and_expression();
				}
				}
				setState(38);
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
		public QualifiedtermContext qualifiedterm(int i) {
			return getRuleContext(QualifiedtermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TescoFilterGrammarParser.AND); }
		public List<QualifiedtermContext> qualifiedterm() {
			return getRuleContexts(QualifiedtermContext.class);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NOT:
			case LPAREN:
			case INT:
			case FLOAT:
			case STRING:
			case PATH:
			case VAR:
				{
				setState(39); term();
				}
				break;
			case ALL:
			case WITHIN:
				{
				setState(40); qualifiedterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(43); match(AND);
				setState(46);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NOT:
				case LPAREN:
				case INT:
				case FLOAT:
				case STRING:
				case PATH:
				case VAR:
					{
					setState(44); term();
					}
					break;
				case ALL:
				case WITHIN:
					{
					setState(45); qualifiedterm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(52);
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
		public TerminalNode NOT() { return getToken(TescoFilterGrammarParser.NOT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(53); match(NOT);
					}
				}

				setState(56); atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); atom();
				setState(61);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ))) != 0)) {
					{
					setState(58); operator();
					setState(59); atom();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); match(LPAREN);
				setState(64); expression();
				setState(65); match(RPAREN);
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

	public static class QualifiedtermContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PATH() { return getToken(TescoFilterGrammarParser.PATH, 0); }
		public TerminalNode MATCH() { return getToken(TescoFilterGrammarParser.MATCH, 0); }
		public TerminalNode WITHIN() { return getToken(TescoFilterGrammarParser.WITHIN, 0); }
		public TerminalNode ALL() { return getToken(TescoFilterGrammarParser.ALL, 0); }
		public QualifiedtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).enterQualifiedterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TescoFilterGrammarListener ) ((TescoFilterGrammarListener)listener).exitQualifiedterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitQualifiedterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedtermContext qualifiedterm() throws RecognitionException {
		QualifiedtermContext _localctx = new QualifiedtermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifiedterm);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case WITHIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(WITHIN);
				setState(70); match(PATH);
				setState(71); match(MATCH);
				setState(72); term();
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(ALL);
				setState(74); match(PATH);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); ((AtomContext)_localctx).VAR = match(VAR);

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
				setState(79); ((AtomContext)_localctx).PATH = match(PATH);

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
				setState(81); match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(82); match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(83); match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(84); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(85); match(FALSE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TescoFilterGrammarVisitor ) return ((TescoFilterGrammarVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(]\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26\n"+
		"\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5%\n\5\f"+
		"\5\16\5(\13\5\3\6\3\6\5\6,\n\6\3\6\3\6\3\6\5\6\61\n\6\7\6\63\n\6\f\6\16"+
		"\6\66\13\6\3\7\5\79\n\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\3\7\3\7\3\7\5"+
		"\7F\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tY\n\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\7\b\3"+
		"\2\r\23c\2\25\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n+\3\2\2\2"+
		"\fE\3\2\2\2\16M\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24\26\5\4\3\2\25\24\3"+
		"\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7"+
		"\2\2\3\32\3\3\2\2\2\33\34\t\2\2\2\34\35\5\6\4\2\35\36\7\3\2\2\36\5\3\2"+
		"\2\2\37 \5\b\5\2 \7\3\2\2\2!&\5\n\6\2\"#\7\f\2\2#%\5\n\6\2$\"\3\2\2\2"+
		"%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\t\3\2\2\2(&\3\2\2\2),\5\f\7\2*,\5\16"+
		"\b\2+)\3\2\2\2+*\3\2\2\2,\64\3\2\2\2-\60\7\13\2\2.\61\5\f\7\2/\61\5\16"+
		"\b\2\60.\3\2\2\2\60/\3\2\2\2\61\63\3\2\2\2\62-\3\2\2\2\63\66\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\64\3\2\2\2\679\7\r\2\28\67"+
		"\3\2\2\289\3\2\2\29:\3\2\2\2:F\5\20\t\2;?\5\20\t\2<=\5\22\n\2=>\5\20\t"+
		"\2>@\3\2\2\2?<\3\2\2\2?@\3\2\2\2@F\3\2\2\2AB\7\33\2\2BC\5\6\4\2CD\7\34"+
		"\2\2DF\3\2\2\2E8\3\2\2\2E;\3\2\2\2EA\3\2\2\2F\r\3\2\2\2GH\7\5\2\2HI\7"+
		"$\2\2IJ\7\6\2\2JN\5\f\7\2KL\7\4\2\2LN\7$\2\2MG\3\2\2\2MK\3\2\2\2N\17\3"+
		"\2\2\2OP\7\'\2\2PY\b\t\1\2QR\7$\2\2RY\b\t\1\2SY\7\37\2\2TY\7 \2\2UY\7"+
		"\"\2\2VY\7\t\2\2WY\7\n\2\2XO\3\2\2\2XQ\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3"+
		"\2\2\2XV\3\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\t\3\2\2[\23\3\2\2\2\f\27&+\60"+
		"\648?EMX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}