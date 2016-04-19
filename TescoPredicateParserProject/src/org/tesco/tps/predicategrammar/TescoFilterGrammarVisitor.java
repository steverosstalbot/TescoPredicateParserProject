// Generated from TescoFilterGrammar.g4 by ANTLR 4.4

package org.tesco.tps.predicategrammar;
import java.util.HashMap;
import org.tesco.tps.filterhandler.RegisterSingleton;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TescoFilterGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TescoFilterGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(@NotNull TescoFilterGrammarParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull TescoFilterGrammarParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull TescoFilterGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull TescoFilterGrammarParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(@NotNull TescoFilterGrammarParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull TescoFilterGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull TescoFilterGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#filterset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterset(@NotNull TescoFilterGrammarParser.FiltersetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TescoFilterGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull TescoFilterGrammarParser.OperatorContext ctx);
}