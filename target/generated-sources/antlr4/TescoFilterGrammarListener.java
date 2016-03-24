// Generated from TescoFilterGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TescoFilterGrammarParser}.
 */
public interface TescoFilterGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(@NotNull TescoFilterGrammarParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(@NotNull TescoFilterGrammarParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull TescoFilterGrammarParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull TescoFilterGrammarParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TescoFilterGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TescoFilterGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull TescoFilterGrammarParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull TescoFilterGrammarParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(@NotNull TescoFilterGrammarParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(@NotNull TescoFilterGrammarParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull TescoFilterGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull TescoFilterGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull TescoFilterGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull TescoFilterGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#filterset}.
	 * @param ctx the parse tree
	 */
	void enterFilterset(@NotNull TescoFilterGrammarParser.FiltersetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#filterset}.
	 * @param ctx the parse tree
	 */
	void exitFilterset(@NotNull TescoFilterGrammarParser.FiltersetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TescoFilterGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull TescoFilterGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TescoFilterGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull TescoFilterGrammarParser.OperatorContext ctx);
}