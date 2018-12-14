// Generated from .\control.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link controlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface controlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link controlParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(controlParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(controlParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#cmd_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_type(controlParser.Cmd_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#cmd_move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_move(controlParser.Cmd_moveContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#cmd_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_info(controlParser.Cmd_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#places}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaces(controlParser.PlacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#place}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(controlParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(controlParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(controlParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#eoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEoc(controlParser.EocContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#qword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQword(controlParser.QwordContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#qplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQplace(controlParser.QplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#qtime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtime(controlParser.QtimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link controlParser#quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity(controlParser.QuantityContext ctx);
}