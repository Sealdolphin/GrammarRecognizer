// Generated from C:/Users/Márk/Documents/_EGYETEM/TÉMALABOR/Project/src\control.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class controlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, MOVE=13, STEPS=14, TRAIN=15, LINEFEED=16, 
		WS=17, FROM=18, TO=19, LTR=20;
	public static final int
		RULE_line = 0, RULE_command = 1, RULE_cmd_type = 2, RULE_cmd_move = 3, 
		RULE_cmd_info = 4, RULE_places = 5, RULE_place = 6, RULE_from = 7, RULE_to = 8, 
		RULE_eoc = 9, RULE_qword = 10, RULE_qplace = 11, RULE_qtime = 12, RULE_quantity = 13;
	public static final String[] ruleNames = {
		"line", "command", "cmd_type", "cmd_move", "cmd_info", "places", "place", 
		"from", "to", "eoc", "qword", "qplace", "qtime", "quantity"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u0102\u00A9s'", "'k\u0102\u00B6z\u0102\u00B6tt'", "'.'", "'!'", 
		"'?'", "'Hogyan'", "'Hol'", "'Merre'", "'Melyik'", "'Mikor'", "'Mennyi'", 
		"'H\u0102\u02C7ny'", null, "'meg\u0102\u02C7ll\u0102\u0142'", "'vonat'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "MOVE", "STEPS", "TRAIN", "LINEFEED", "WS", "FROM", "TO", "LTR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "control.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public controlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> LINEFEED() { return getTokens(controlParser.LINEFEED); }
		public TerminalNode LINEFEED(int i) {
			return getToken(controlParser.LINEFEED, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					command();
					setState(29);
					match(LINEFEED);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			command();
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

	public static class CommandContext extends ParserRuleContext {
		public Cmd_typeContext cmd_type() {
			return getRuleContext(Cmd_typeContext.class,0);
		}
		public EocContext eoc() {
			return getRuleContext(EocContext.class,0);
		}
		public QwordContext qword() {
			return getRuleContext(QwordContext.class,0);
		}
		public TerminalNode WS() { return getToken(controlParser.WS, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(38);
				qword();
				setState(39);
				match(WS);
				}
				break;
			}
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(43);
					matchWildcard();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(49);
			cmd_type();
			setState(50);
			eoc();
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

	public static class Cmd_typeContext extends ParserRuleContext {
		public Cmd_moveContext cmd_move() {
			return getRuleContext(Cmd_moveContext.class,0);
		}
		public Cmd_infoContext cmd_info() {
			return getRuleContext(Cmd_infoContext.class,0);
		}
		public TerminalNode WS() { return getToken(controlParser.WS, 0); }
		public PlacesContext places() {
			return getRuleContext(PlacesContext.class,0);
		}
		public Cmd_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterCmd_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitCmd_type(this);
		}
	}

	public final Cmd_typeContext cmd_type() throws RecognitionException {
		Cmd_typeContext _localctx = new Cmd_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
			case STEPS:
				{
				setState(52);
				cmd_move();
				}
				break;
			case TRAIN:
				{
				setState(53);
				cmd_info();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(56);
					matchWildcard();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62);
				match(WS);
				setState(63);
				places();
				}
				break;
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

	public static class Cmd_moveContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(controlParser.MOVE, 0); }
		public TerminalNode STEPS() { return getToken(controlParser.STEPS, 0); }
		public Cmd_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterCmd_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitCmd_move(this);
		}
	}

	public final Cmd_moveContext cmd_move() throws RecognitionException {
		Cmd_moveContext _localctx = new Cmd_moveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==MOVE || _la==STEPS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Cmd_infoContext extends ParserRuleContext {
		public TerminalNode TRAIN() { return getToken(controlParser.TRAIN, 0); }
		public Cmd_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterCmd_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitCmd_info(this);
		}
	}

	public final Cmd_infoContext cmd_info() throws RecognitionException {
		Cmd_infoContext _localctx = new Cmd_infoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TRAIN);
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

	public static class PlacesContext extends ParserRuleContext {
		public PlacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_places; }
	 
		public PlacesContext() { }
		public void copyFrom(PlacesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HasToContext extends PlacesContext {
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public HasToContext(PlacesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterHasTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitHasTo(this);
		}
	}
	public static class HasFromToContext extends PlacesContext {
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode WS() { return getToken(controlParser.WS, 0); }
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public HasFromToContext(PlacesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterHasFromTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitHasFromTo(this);
		}
	}
	public static class NoExactPlaceContext extends PlacesContext {
		public List<PlaceContext> place() {
			return getRuleContexts(PlaceContext.class);
		}
		public PlaceContext place(int i) {
			return getRuleContext(PlaceContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(controlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(controlParser.WS, i);
		}
		public NoExactPlaceContext(PlacesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterNoExactPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitNoExactPlace(this);
		}
	}

	public final PlacesContext places() throws RecognitionException {
		PlacesContext _localctx = new PlacesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_places);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new NoExactPlaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				place();
				setState(71);
				match(WS);
				setState(72);
				match(T__0);
				setState(73);
				match(WS);
				setState(74);
				place();
				setState(75);
				match(WS);
				setState(76);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new HasFromToContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				from();
				setState(79);
				match(WS);
				setState(80);
				to();
				}
				break;
			case 3:
				_localctx = new HasToContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				to();
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

	public static class PlaceContext extends ParserRuleContext {
		public List<TerminalNode> LTR() { return getTokens(controlParser.LTR); }
		public TerminalNode LTR(int i) {
			return getToken(controlParser.LTR, i);
		}
		public List<TerminalNode> FROM() { return getTokens(controlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(controlParser.FROM, i);
		}
		public List<TerminalNode> TO() { return getTokens(controlParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(controlParser.TO, i);
		}
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitPlace(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_place);
		int _la;
		try {
			int _alt;
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					match(LTR);
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LTR );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(90);
						match(LTR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(93); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						_la = _input.LA(1);
						if ( !(_la==FROM || _la==TO) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LTR) {
					{
					{
					setState(101);
					match(LTR);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FromContext extends ParserRuleContext {
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public TerminalNode FROM() { return getToken(controlParser.FROM, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitFrom(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			place();
			setState(110);
			match(FROM);
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

	public static class ToContext extends ParserRuleContext {
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public TerminalNode TO() { return getToken(controlParser.TO, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitTo(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			place();
			setState(113);
			match(TO);
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

	public static class EocContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(controlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(controlParser.WS, i);
		}
		public EocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterEoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitEoc(this);
		}
	}

	public final EocContext eoc() throws RecognitionException {
		EocContext _localctx = new EocContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(115);
				match(WS);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(121);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class QwordContext extends ParserRuleContext {
		public QplaceContext qplace() {
			return getRuleContext(QplaceContext.class,0);
		}
		public QtimeContext qtime() {
			return getRuleContext(QtimeContext.class,0);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public QwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterQword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitQword(this);
		}
	}

	public final QwordContext qword() throws RecognitionException {
		QwordContext _localctx = new QwordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_qword);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__5);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				qplace();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				qtime();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				quantity();
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

	public static class QplaceContext extends ParserRuleContext {
		public QplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterQplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitQplace(this);
		}
	}

	public final QplaceContext qplace() throws RecognitionException {
		QplaceContext _localctx = new QplaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_qplace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class QtimeContext extends ParserRuleContext {
		public QtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterQtime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitQtime(this);
		}
	}

	public final QtimeContext qtime() throws RecognitionException {
		QtimeContext _localctx = new QtimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__9);
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

	public static class QuantityContext extends ParserRuleContext {
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof controlListener ) ((controlListener)listener).exitQuantity(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_quantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\3\3\3\3\3\5\3,\n\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\3\3\4\3\4\5\49\n\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\5\4C\n"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7V\n\7\3\b\6\bY\n\b\r\b\16\bZ\3\b\6\b^\n\b\r\b\16\b_\3\b\7\bc\n\b\f"+
		"\b\16\bf\13\b\3\b\7\bi\n\b\f\b\16\bl\13\b\5\bn\n\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\7\13w\n\13\f\13\16\13z\13\13\3\13\5\13}\n\13\3\f\3\f\3\f\3\f"+
		"\5\f\u0083\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\4\60=\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\7\3\2\17\20\3\2\24\25\3\2\5\7\3\2\t\13\3\2"+
		"\r\16\2\u008e\2#\3\2\2\2\4+\3\2\2\2\68\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\f"+
		"U\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26\u0082\3\2"+
		"\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2\2\34\u0088\3\2\2\2\36\37\5\4\3\2"+
		"\37 \7\22\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&"+
		"\3\2\2\2%#\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\5\26\f\2)*\7\23\2\2*,\3\2"+
		"\2\2+(\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-/\13\2\2\2.-\3\2\2\2/\62\3\2\2\2"+
		"\60\61\3\2\2\2\60.\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\5\6\4\2\64"+
		"\65\5\24\13\2\65\5\3\2\2\2\669\5\b\5\2\679\5\n\6\28\66\3\2\2\28\67\3\2"+
		"\2\29=\3\2\2\2:<\13\2\2\2;:\3\2\2\2<?\3\2\2\2=>\3\2\2\2=;\3\2\2\2>B\3"+
		"\2\2\2?=\3\2\2\2@A\7\23\2\2AC\5\f\7\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2D"+
		"E\t\2\2\2E\t\3\2\2\2FG\7\21\2\2G\13\3\2\2\2HI\5\16\b\2IJ\7\23\2\2JK\7"+
		"\3\2\2KL\7\23\2\2LM\5\16\b\2MN\7\23\2\2NO\7\4\2\2OV\3\2\2\2PQ\5\20\t\2"+
		"QR\7\23\2\2RS\5\22\n\2SV\3\2\2\2TV\5\22\n\2UH\3\2\2\2UP\3\2\2\2UT\3\2"+
		"\2\2V\r\3\2\2\2WY\7\26\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[n\3"+
		"\2\2\2\\^\7\26\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3\2\2\2"+
		"ac\t\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ej\3\2\2\2fd\3\2\2\2"+
		"gi\7\26\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2mX\3\2\2\2m]\3\2\2\2n\17\3\2\2\2op\5\16\b\2pq\7\24\2\2q\21\3\2\2\2r"+
		"s\5\16\b\2st\7\25\2\2t\23\3\2\2\2uw\7\23\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\t\4\2\2|{\3\2\2\2|}\3\2\2\2}\25\3"+
		"\2\2\2~\u0083\7\b\2\2\177\u0083\5\30\r\2\u0080\u0083\5\32\16\2\u0081\u0083"+
		"\5\34\17\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\t\5\2\2\u0085\31\3\2\2\2\u0086"+
		"\u0087\7\f\2\2\u0087\33\3\2\2\2\u0088\u0089\t\6\2\2\u0089\35\3\2\2\2\21"+
		"#+\608=BUZ_djmx|\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}