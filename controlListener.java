// Generated from C:/Users/Márk/Documents/_EGYETEM/TÉMALABOR/Project/src\control.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link controlParser}.
 */
public interface controlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link controlParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(controlParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(controlParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(controlParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(controlParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#cmd_type}.
	 * @param ctx the parse tree
	 */
	void enterCmd_type(controlParser.Cmd_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#cmd_type}.
	 * @param ctx the parse tree
	 */
	void exitCmd_type(controlParser.Cmd_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#cmd_move}.
	 * @param ctx the parse tree
	 */
	void enterCmd_move(controlParser.Cmd_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#cmd_move}.
	 * @param ctx the parse tree
	 */
	void exitCmd_move(controlParser.Cmd_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#cmd_info}.
	 * @param ctx the parse tree
	 */
	void enterCmd_info(controlParser.Cmd_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#cmd_info}.
	 * @param ctx the parse tree
	 */
	void exitCmd_info(controlParser.Cmd_infoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noExactPlace}
	 * labeled alternative in {@link controlParser#places}.
	 * @param ctx the parse tree
	 */
	void enterNoExactPlace(controlParser.NoExactPlaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noExactPlace}
	 * labeled alternative in {@link controlParser#places}.
	 * @param ctx the parse tree
	 */
	void exitNoExactPlace(controlParser.NoExactPlaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasFromTo}
	 * labeled alternative in {@link controlParser#places}.
	 * @param ctx the parse tree
	 */
	void enterHasFromTo(controlParser.HasFromToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasFromTo}
	 * labeled alternative in {@link controlParser#places}.
	 * @param ctx the parse tree
	 */
	void exitHasFromTo(controlParser.HasFromToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasTo}
	 * labeled alternative in {@link controlParser#places}.
	 * @param ctx the parse tree
	 */
	void enterHasTo(controlParser.HasToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasTo}
	 * labeled alternative in {@link controlParser#places}.
	 * @param ctx the parse tree
	 */
	void exitHasTo(controlParser.HasToContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(controlParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(controlParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(controlParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(controlParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(controlParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(controlParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#eoc}.
	 * @param ctx the parse tree
	 */
	void enterEoc(controlParser.EocContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#eoc}.
	 * @param ctx the parse tree
	 */
	void exitEoc(controlParser.EocContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#qword}.
	 * @param ctx the parse tree
	 */
	void enterQword(controlParser.QwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#qword}.
	 * @param ctx the parse tree
	 */
	void exitQword(controlParser.QwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#qplace}.
	 * @param ctx the parse tree
	 */
	void enterQplace(controlParser.QplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#qplace}.
	 * @param ctx the parse tree
	 */
	void exitQplace(controlParser.QplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#qtime}.
	 * @param ctx the parse tree
	 */
	void enterQtime(controlParser.QtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#qtime}.
	 * @param ctx the parse tree
	 */
	void exitQtime(controlParser.QtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link controlParser#quantity}.
	 * @param ctx the parse tree
	 */
	void enterQuantity(controlParser.QuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link controlParser#quantity}.
	 * @param ctx the parse tree
	 */
	void exitQuantity(controlParser.QuantityContext ctx);
}