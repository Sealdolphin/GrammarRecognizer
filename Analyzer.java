import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Analyzer extends controlBaseListener {

    /**
     * Different states of the token flag
     * Each state corresponds with a specific action
     */
    private enum tokenFlag{
        IDLE,
        SET_SOURCE,
        SET_DEST,
        SET_TRAIN,
        TYPE_MOVE,
        TYPE_INFO,
        SET_QUESTION,
        EOC
    };

    /**
     * The parser which parses the incoming input
     */
    private final controlParser parser;
    /**
     * Indicates whether the rule 'places' has got a source or a destination
     * It is true if the rule does NOT contain ANY of the two
     * and it is false otherwise.
     */
    private boolean noSrc_noDst = false;
    /**
     * Enables the writing of the token
     */
    private boolean tokenWriteEnabled = false;

    /**
     * The writing flag of token
     * It determines what is going to be written to the token
     * default state is IDLE
     */
    private tokenFlag flag = tokenFlag.IDLE;

    /**
     * A String token
     * If enabled the Analyser fills the token with the current bytes of the input
     */
    private String token = null;
    /**
     * The command formed from the input
     */
    private Command command = null;

    /**
     * A list of unwanted Token types
     * If any of the terminal Nodes has a type from this list it is unwanted
     * In that case we don't write the Node's bytes to the token
     */
    private final List<Integer> unwantedNodeTypes;

    /**
     * Basic constructor
     * @param parser is a grammar parser
     */
    Analyzer(controlParser parser){
        //set up parser
        this.parser = parser;
        //Ban unwanted types
        //Unwanted types are currently:
        //LEXER FROM
        //LEXER TO
        unwantedNodeTypes = new ArrayList<>();
        unwantedNodeTypes.add(parser.getTokenType("FROM"));
        unwantedNodeTypes.add(parser.getTokenType("TO"));
        unwantedNodeTypes.add(parser.getTokenType("'és'"));
        unwantedNodeTypes.add(parser.getTokenType("'között'"));
    }

    @Override
    public void enterQword(controlParser.QwordContext ctx) {
        flag = tokenFlag.SET_QUESTION;
        token = "";
        tokenWriteEnabled = true;
    }

    /**
     * Fires when the input contains a command
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterCommand(controlParser.CommandContext ctx) {
        command = new Command();
    }

    /**
     * Fires when the input contains a MOVE command
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterCmd_move(controlParser.Cmd_moveContext ctx) {
        flag = tokenFlag.TYPE_MOVE;
        sendTokenMessage();
    }

    /**
     * Fires when the input contains an INFO command
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterCmd_info(controlParser.Cmd_infoContext ctx) {
        flag = tokenFlag.TYPE_INFO;
        sendTokenMessage();
    }

    /**
     * Fires when the input contains PLACES rule (probably source and a destination)
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterNoExactPlace(controlParser.NoExactPlaceContext ctx) {
        System.out.println("ENTR_PLACES_EXP");
        flag = tokenFlag.SET_SOURCE;
        token = null;
    }


    /**
     * Fires when the input has a PLACE rule
     * It decides also if this PLACE is a source or a destination (or neither)
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterPlace(controlParser.PlaceContext ctx) {
//        if(noSrc_noDst) {
//            //We have no indicator for source nor destination
//            //source and destination is based on order
//            if(token == null){
//                flag = tokenFlag.SET_SOURCE;
//            }
//            else{
//                flag = tokenFlag.SET_DEST;
//            }
//        } //else src and dst based on rule (they might not exist at all)

        //Source or Destination is decided already
        token = "";
        tokenWriteEnabled = true;
    }

    /**
     * Fires when the input contains a Source place
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterFrom(controlParser.FromContext ctx) {

        noSrc_noDst = false;
        flag = tokenFlag.SET_SOURCE;
    }

    /**
     * Fires when the input contains a Destination place
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterTo(controlParser.ToContext ctx) {

        noSrc_noDst = false;
        flag = tokenFlag.SET_DEST;
    }

    /**
     * Fires when the parser reaches a Terminal Node
     * If writing is enabled it may write the byte of the node to the token
     * @param node is the terminal node inherited from controlBaseListener
     */
    @Override
    public void visitTerminal(TerminalNode node) {
        //Get the type of Node
        int nodeType = node.getSymbol().getType();
        boolean invalidType = false;

        //Check for unwanted node type
        for (int type:
                unwantedNodeTypes) {
            if(nodeType == type){
                invalidType = true;
                break;
            }
        }

        //Write token if enabled
        if(tokenWriteEnabled && !invalidType){

            if(token != null){
                token += node.getSymbol().getText();
            }

            if(Objects.equals(flag, tokenFlag.SET_QUESTION)) sendTokenMessage();

        } else sendTokenMessage();  //fire message

    }

    /**
     * Fires when the input reaches the end of a command
     * @param ctx the ruleContext inherited from controlBaseListener
     */
    @Override
    public void enterEoc(controlParser.EocContext ctx) {
        tokenWriteEnabled = false;
        flag = tokenFlag.EOC;
        System.out.println();
        sendTokenMessage();
        command = null;
    }

    /**
     * It is activated every time when the token finishes writing
     * Depending on the token's flag an action may take place with the token as an argument
     * If the flag is in IDLE state it does nothing
     * The token is cleared at the end
     */
    private void sendTokenMessage() {
        if(command == null) return;
        switch (flag){
            default:
            case IDLE:
                return;
            case SET_QUESTION:
                command.setQuestion(token);
                break;
            case SET_SOURCE:
                command.setSource(token.trim());
                break;
            case SET_DEST:
                command.setDestination(token.trim());
                break;
            case TYPE_MOVE:
                command.setType(Command.CommandType.CMD_MOVE);
                break;
            case TYPE_INFO:
                command.setType(Command.CommandType.CMD_INFO);
                break;
            case EOC:
                command.send();
                break;
        }
        flag = tokenFlag.IDLE;
        tokenWriteEnabled = false;
    }

}
