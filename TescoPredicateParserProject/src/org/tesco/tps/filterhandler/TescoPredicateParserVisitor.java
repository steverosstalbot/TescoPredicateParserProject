package org.tesco.tps.filterhandler;

import org.antlr.v4.runtime.misc.NotNull;
import org.tesco.tps.predicategrammar.*;

public class TescoPredicateParserVisitor extends TescoFilterGrammarBaseVisitor<String> 
{
	private String 	m_currentRPATH = "";
	
	public String getCurrentRPATH() { return m_currentRPATH; }
	public void setCurrentRPATH(String rp) { m_currentRPATH = rp; }
	
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitFilter(@NotNull TescoFilterGrammarParser.FilterContext ctx)
	{
		String s = "";
		s += visit(ctx.getChild(1));
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitOr_expression(@NotNull TescoFilterGrammarParser.Or_expressionContext ctx)
	{
		String s = "";

		if (ctx.getChildCount() == 1)
			return s = visit(ctx.getChild(0));
		for (int i = 0; (i < ctx.getChildCount()); i+=2)
		{
			if (i == ctx.getChildCount()-1)
				s += visit(ctx.getChild(i));
			else
				s += visit(ctx.getChild(i)) + " || ";
		}
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitExpression(@NotNull TescoFilterGrammarParser.ExpressionContext ctx)
	{
		String s = ""; 							// Root in JSONPath
		for (int i = 0; (i < ctx.getChildCount()); i++)
		{
			s += visit(ctx.getChild(i));
		}
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitAnd_expression(@NotNull TescoFilterGrammarParser.And_expressionContext ctx)
	{
		String s = "";
		if (ctx.getChildCount() == 1)
			return s = visit(ctx.getChild(0));
		for (int i = 0; (i < ctx.getChildCount()); i++)
		{
			if (i == ctx.getChildCount()-1)
				s += visit(ctx.getChild(i));
			else {
				if (visit(ctx.getChild(i)) != null)
					s += visit(ctx.getChild(i)) + " && ";
			}

		}
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitRuleset(@NotNull TescoFilterGrammarParser.RulesetContext ctx)
	{
		String s = "\n"; // Just to help with formatting and so should be removed at some point
						 // Really you want a list of rules returned
		
		//
		// -1 to deal with EOF
		//
		
		for (int i = 0; (i < ctx.getChildCount()-1); i++)
		{
			s += visit(ctx.getChild(i));
		}
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 * term : atom (operator atom)? | LPAREN expression RPAREN;
	 */
	public String visitTerm(@NotNull TescoFilterGrammarParser.TermContext ctx)
	{
		String s = "";
		int i = 0;
		int n = 0;
							// Skip over the "(" and ")"
		if (ctx.getChild(0) == ctx.LPAREN())
		{
			i = 1;
			n = ctx.getChildCount()-1;
		} else {			// Or do not bother cos none there
			n = ctx.getChildCount();
		}

		for (; (i < n); i++)
		{
			s += visit(ctx.getChild(i));
		}
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 * qualifiedterm : WITHIN atom LOOKFOR term
	 *
	 */
	
	//
	// Crappy fix
	//
	public String visitQualifiedterm(@NotNull TescoFilterGrammarParser.QualifiedtermContext ctx)
	{
		String s = "";
		String path = ctx.getChild(1).getText();
		if (ctx.ALL() != null)
		{
			s = "$.." + frigPathSuffix(path);
			return s;
		} else {
			path = ctx.getChild(1).getText();
			s = "$.." + frigPathSuffix(path) + "[?(" + visit(ctx.getChild(3)) + ")]";
		}
		return s;
	}
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitAtom(@NotNull TescoFilterGrammarParser.AtomContext ctx)
	{
		String s = "";
		//
		// At this point the Atom could be any of VAR | PATH | INT | FLOAT | STRING | TRUE | FALSE
		//
		if (ctx.VAR() != null)
		{
			System.out.println("Resolve " + ctx.getText());
			// Default to string matching for now
			s = "'" + RegisterSingleton.getRegisters().getUserContextVars().get(ctx.getText().substring(1,ctx.getText().length()-1)).toString() + "'";
			System.out.println("Resolved to " + s);
			//s = ctx.getText();
		} else if (ctx.INT() != null) {
			s = ctx.getText();
		} else if (ctx.FLOAT() != null) {
			s = ctx.getText();
		} else if (ctx.STRING() != null) {
			s = ctx.getText();
		} else if (ctx.PATH() != null) {
			// This is a paired hack. Since PATH doesn't work in the ANTLR grammar.
			// When we have to match terms such as supplier with companyname we indicate it by
			// adding a binding to the ends as such supplier.y y.companyname. The result being
			// supplier.companyname
			// If the PATH worked I wouldn't have to invent this crap
			String prefix = "y.";
			String path = ctx.getText();
			path = frigPathPrefix(path);
			s = "@." + path;
		} else if (ctx.TRUE() != null) {
			s = "true";
		} else if (ctx.FALSE() != null) {
			s = "false";
		} else
			s = "UNKNOWN";
		// Atom is as low as it gets.
		//for (int i = 0; (i < ctx.getChildCount()); i++)
		//{
		//	s += visit(ctx.getChild(i));
		//}
		return s;
	}

	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitOperator(@NotNull TescoFilterGrammarParser.OperatorContext ctx)
	{
		String s = " " + ctx.getText() + " ";
		return s;	
	}
	
	public String frigPathSuffix(String s)
	{
		String suffix = ".y";
		if (s.endsWith(suffix))
			return s.substring(0, s.length()-suffix.length());
		else
			return s;
	}
	public String frigPathPrefix(String s)
	{
		String prefix = "y.";
		if (s.startsWith(prefix))
			return s.substring(prefix.length(), s.length());
		else
			return s;
	}
}
