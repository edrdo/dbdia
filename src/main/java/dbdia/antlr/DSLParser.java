// Generated from DSL.g4 by ANTLR 4.8

//
// Copyright Eduardo R. B. Marques
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package dbdia.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, BlockComment=21, LineComment=22, UNICODE_WS=23;
	public static final int
		RULE_root = 0, RULE_entRelModel = 1, RULE_entRelModelItem = 2, RULE_entity = 3, 
		RULE_entityField = 4, RULE_nonKeyField = 5, RULE_keyField = 6, RULE_simpleField = 7, 
		RULE_optionalField = 8, RULE_derivedField = 9, RULE_compositeField = 10, 
		RULE_multivalueField = 11, RULE_weakEntity = 12, RULE_parentEntityPart = 13, 
		RULE_relationship = 14, RULE_relationshipConstraints = 15, RULE_relationalSchema = 16, 
		RULE_relationalSchemaItem = 17, RULE_tableDefinition = 18, RULE_tableField = 19, 
		RULE_tableFieldBaseDef = 20, RULE_tableKeyField = 21, RULE_tableOptionalField = 22, 
		RULE_tablePlainField = 23, RULE_tableFieldTypeInfo = 24, RULE_tableForeignKeyReference = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "entRelModel", "entRelModelItem", "entity", "entityField", "nonKeyField", 
			"keyField", "simpleField", "optionalField", "derivedField", "compositeField", 
			"multivalueField", "weakEntity", "parentEntityPart", "relationship", 
			"relationshipConstraints", "relationalSchema", "relationalSchemaItem", 
			"tableDefinition", "tableField", "tableFieldBaseDef", "tableKeyField", 
			"tableOptionalField", "tablePlainField", "tableFieldTypeInfo", "tableForeignKeyReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'_'", "'?'", "'.'", "'{'", "'}'", "'<<'", 
			"'>>'", "'-'", "'='", "'<'", "'>'", "'1'", "'M'", "'N'", "'table'", "'-->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "BlockComment", 
			"LineComment", "UNICODE_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "DSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DSLParser.EOF, 0); }
		public EntRelModelContext entRelModel() {
			return getRuleContext(EntRelModelContext.class,0);
		}
		public RelationalSchemaContext relationalSchema() {
			return getRuleContext(RelationalSchemaContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(52);
				entRelModel();
				}
				break;
			case 2:
				{
				setState(53);
				relationalSchema();
				}
				break;
			}
			setState(56);
			match(EOF);
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

	public static class EntRelModelContext extends ParserRuleContext {
		public List<EntRelModelItemContext> entRelModelItem() {
			return getRuleContexts(EntRelModelItemContext.class);
		}
		public EntRelModelItemContext entRelModelItem(int i) {
			return getRuleContext(EntRelModelItemContext.class,i);
		}
		public EntRelModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entRelModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterEntRelModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitEntRelModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitEntRelModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntRelModelContext entRelModel() throws RecognitionException {
		EntRelModelContext _localctx = new EntRelModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entRelModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(58);
				entRelModelItem();
				}
				}
				setState(63);
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

	public static class EntRelModelItemContext extends ParserRuleContext {
		public EntityContext ent;
		public RelationshipContext rel;
		public WeakEntityContext we;
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public RelationshipContext relationship() {
			return getRuleContext(RelationshipContext.class,0);
		}
		public WeakEntityContext weakEntity() {
			return getRuleContext(WeakEntityContext.class,0);
		}
		public EntRelModelItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entRelModelItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterEntRelModelItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitEntRelModelItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitEntRelModelItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntRelModelItemContext entRelModelItem() throws RecognitionException {
		EntRelModelItemContext _localctx = new EntRelModelItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entRelModelItem);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((EntRelModelItemContext)_localctx).ent = entity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((EntRelModelItemContext)_localctx).rel = relationship();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((EntRelModelItemContext)_localctx).we = weakEntity();
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

	public static class EntityContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public List<EntityFieldContext> entityField() {
			return getRuleContexts(EntityFieldContext.class);
		}
		public EntityFieldContext entityField(int i) {
			return getRuleContext(EntityFieldContext.class,i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((EntityContext)_localctx).name = match(ID);
			setState(70);
			match(T__0);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				setState(71);
				entityField();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(72);
					match(T__1);
					setState(73);
					entityField();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(T__2);
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

	public static class EntityFieldContext extends ParserRuleContext {
		public KeyFieldContext keyField() {
			return getRuleContext(KeyFieldContext.class,0);
		}
		public NonKeyFieldContext nonKeyField() {
			return getRuleContext(NonKeyFieldContext.class,0);
		}
		public EntityFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterEntityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitEntityField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitEntityField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityFieldContext entityField() throws RecognitionException {
		EntityFieldContext _localctx = new EntityFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entityField);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				keyField();
				}
				break;
			case T__5:
			case T__6:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				nonKeyField();
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

	public static class NonKeyFieldContext extends ParserRuleContext {
		public SimpleFieldContext simpleField() {
			return getRuleContext(SimpleFieldContext.class,0);
		}
		public OptionalFieldContext optionalField() {
			return getRuleContext(OptionalFieldContext.class,0);
		}
		public DerivedFieldContext derivedField() {
			return getRuleContext(DerivedFieldContext.class,0);
		}
		public CompositeFieldContext compositeField() {
			return getRuleContext(CompositeFieldContext.class,0);
		}
		public MultivalueFieldContext multivalueField() {
			return getRuleContext(MultivalueFieldContext.class,0);
		}
		public NonKeyFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonKeyField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterNonKeyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitNonKeyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitNonKeyField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonKeyFieldContext nonKeyField() throws RecognitionException {
		NonKeyFieldContext _localctx = new NonKeyFieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonKeyField);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				simpleField();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				optionalField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				derivedField();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				compositeField();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				multivalueField();
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

	public static class KeyFieldContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public KeyFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterKeyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitKeyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitKeyField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyFieldContext keyField() throws RecognitionException {
		KeyFieldContext _localctx = new KeyFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__3);
			setState(95);
			((KeyFieldContext)_localctx).name = match(ID);
			setState(96);
			match(T__3);
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

	public static class SimpleFieldContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public SimpleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterSimpleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitSimpleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitSimpleField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFieldContext simpleField() throws RecognitionException {
		SimpleFieldContext _localctx = new SimpleFieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((SimpleFieldContext)_localctx).name = match(ID);
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

	public static class OptionalFieldContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public OptionalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterOptionalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitOptionalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitOptionalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalFieldContext optionalField() throws RecognitionException {
		OptionalFieldContext _localctx = new OptionalFieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optionalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((OptionalFieldContext)_localctx).name = match(ID);
			setState(101);
			match(T__4);
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

	public static class DerivedFieldContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public DerivedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterDerivedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitDerivedField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitDerivedField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivedFieldContext derivedField() throws RecognitionException {
		DerivedFieldContext _localctx = new DerivedFieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_derivedField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__5);
			setState(104);
			((DerivedFieldContext)_localctx).name = match(ID);
			setState(105);
			match(T__5);
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

	public static class CompositeFieldContext extends ParserRuleContext {
		public Token name;
		public List<NonKeyFieldContext> nonKeyField() {
			return getRuleContexts(NonKeyFieldContext.class);
		}
		public NonKeyFieldContext nonKeyField(int i) {
			return getRuleContext(NonKeyFieldContext.class,i);
		}
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public CompositeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterCompositeField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitCompositeField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitCompositeField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeFieldContext compositeField() throws RecognitionException {
		CompositeFieldContext _localctx = new CompositeFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compositeField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((CompositeFieldContext)_localctx).name = match(ID);
			setState(108);
			match(T__0);
			setState(109);
			nonKeyField();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(110);
				match(T__1);
				setState(111);
				nonKeyField();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__2);
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

	public static class MultivalueFieldContext extends ParserRuleContext {
		public SimpleFieldContext simpleField() {
			return getRuleContext(SimpleFieldContext.class,0);
		}
		public CompositeFieldContext compositeField() {
			return getRuleContext(CompositeFieldContext.class,0);
		}
		public MultivalueFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multivalueField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterMultivalueField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitMultivalueField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitMultivalueField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultivalueFieldContext multivalueField() throws RecognitionException {
		MultivalueFieldContext _localctx = new MultivalueFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multivalueField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__6);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(120);
				simpleField();
				}
				break;
			case 2:
				{
				setState(121);
				compositeField();
				}
				break;
			}
			setState(124);
			match(T__7);
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

	public static class WeakEntityContext extends ParserRuleContext {
		public Token parent_entity;
		public ParentEntityPartContext parent_entity_part;
		public Token idrel;
		public EntityContext dependent_entity;
		public List<TerminalNode> ID() { return getTokens(DSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DSLParser.ID, i);
		}
		public ParentEntityPartContext parentEntityPart() {
			return getRuleContext(ParentEntityPartContext.class,0);
		}
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public WeakEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterWeakEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitWeakEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitWeakEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeakEntityContext weakEntity() throws RecognitionException {
		WeakEntityContext _localctx = new WeakEntityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_weakEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((WeakEntityContext)_localctx).parent_entity = match(ID);
			setState(127);
			((WeakEntityContext)_localctx).parent_entity_part = parentEntityPart();
			setState(128);
			match(T__8);
			setState(129);
			((WeakEntityContext)_localctx).idrel = match(ID);
			setState(130);
			match(T__9);
			setState(131);
			((WeakEntityContext)_localctx).dependent_entity = entity();
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

	public static class ParentEntityPartContext extends ParserRuleContext {
		public Token part;
		public ParentEntityPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentEntityPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterParentEntityPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitParentEntityPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitParentEntityPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentEntityPartContext parentEntityPart() throws RecognitionException {
		ParentEntityPartContext _localctx = new ParentEntityPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parentEntityPart);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((ParentEntityPartContext)_localctx).part = match(T__10);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(134);
					match(T__10);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((ParentEntityPartContext)_localctx).part = match(T__11);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(141);
					match(T__11);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class RelationshipContext extends ParserRuleContext {
		public Token entityA;
		public RelationshipConstraintsContext constrA;
		public Token name;
		public RelationshipConstraintsContext constrB;
		public Token entityB;
		public List<TerminalNode> ID() { return getTokens(DSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DSLParser.ID, i);
		}
		public List<RelationshipConstraintsContext> relationshipConstraints() {
			return getRuleContexts(RelationshipConstraintsContext.class);
		}
		public RelationshipConstraintsContext relationshipConstraints(int i) {
			return getRuleContext(RelationshipConstraintsContext.class,i);
		}
		public List<NonKeyFieldContext> nonKeyField() {
			return getRuleContexts(NonKeyFieldContext.class);
		}
		public NonKeyFieldContext nonKeyField(int i) {
			return getRuleContext(NonKeyFieldContext.class,i);
		}
		public RelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRelationship(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRelationship(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipContext relationship() throws RecognitionException {
		RelationshipContext _localctx = new RelationshipContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationship);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((RelationshipContext)_localctx).entityA = match(ID);
			setState(150);
			((RelationshipContext)_localctx).constrA = relationshipConstraints();
			setState(151);
			match(T__12);
			setState(152);
			((RelationshipContext)_localctx).name = match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(153);
				match(T__0);
				setState(154);
				nonKeyField();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(155);
					match(T__1);
					setState(156);
					nonKeyField();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__2);
				}
			}

			setState(166);
			match(T__13);
			setState(167);
			((RelationshipContext)_localctx).constrB = relationshipConstraints();
			setState(168);
			((RelationshipContext)_localctx).entityB = match(ID);
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

	public static class RelationshipConstraintsContext extends ParserRuleContext {
		public Token part;
		public Token card;
		public RelationshipConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRelationshipConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRelationshipConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRelationshipConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipConstraintsContext relationshipConstraints() throws RecognitionException {
		RelationshipConstraintsContext _localctx = new RelationshipConstraintsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationshipConstraints);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((RelationshipConstraintsContext)_localctx).part = match(T__10);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(171);
					match(T__10);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				((RelationshipConstraintsContext)_localctx).card = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
					((RelationshipConstraintsContext)_localctx).card = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					match(T__10);
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((RelationshipConstraintsContext)_localctx).part = match(T__11);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(184);
					match(T__11);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				((RelationshipConstraintsContext)_localctx).card = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
					((RelationshipConstraintsContext)_localctx).card = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					match(T__11);
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
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

	public static class RelationalSchemaContext extends ParserRuleContext {
		public List<RelationalSchemaItemContext> relationalSchemaItem() {
			return getRuleContexts(RelationalSchemaItemContext.class);
		}
		public RelationalSchemaItemContext relationalSchemaItem(int i) {
			return getRuleContext(RelationalSchemaItemContext.class,i);
		}
		public RelationalSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRelationalSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRelationalSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRelationalSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalSchemaContext relationalSchema() throws RecognitionException {
		RelationalSchemaContext _localctx = new RelationalSchemaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(198);
				relationalSchemaItem();
				}
				}
				setState(203);
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

	public static class RelationalSchemaItemContext extends ParserRuleContext {
		public TableDefinitionContext tableDefinition() {
			return getRuleContext(TableDefinitionContext.class,0);
		}
		public RelationalSchemaItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalSchemaItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterRelationalSchemaItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitRelationalSchemaItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitRelationalSchemaItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalSchemaItemContext relationalSchemaItem() throws RecognitionException {
		RelationalSchemaItemContext _localctx = new RelationalSchemaItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalSchemaItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			tableDefinition();
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

	public static class TableDefinitionContext extends ParserRuleContext {
		public Token name;
		public List<TableFieldContext> tableField() {
			return getRuleContexts(TableFieldContext.class);
		}
		public TableFieldContext tableField(int i) {
			return getRuleContext(TableFieldContext.class,i);
		}
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public TableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDefinitionContext tableDefinition() throws RecognitionException {
		TableDefinitionContext _localctx = new TableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__17);
			setState(207);
			((TableDefinitionContext)_localctx).name = match(ID);
			setState(208);
			match(T__0);
			setState(209);
			tableField();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(210);
				match(T__1);
				setState(211);
				tableField();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__2);
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

	public static class TableFieldContext extends ParserRuleContext {
		public TableFieldBaseDefContext field;
		public TableFieldTypeInfoContext type;
		public TableForeignKeyReferenceContext ref;
		public TableFieldBaseDefContext tableFieldBaseDef() {
			return getRuleContext(TableFieldBaseDefContext.class,0);
		}
		public TableFieldTypeInfoContext tableFieldTypeInfo() {
			return getRuleContext(TableFieldTypeInfoContext.class,0);
		}
		public TableForeignKeyReferenceContext tableForeignKeyReference() {
			return getRuleContext(TableForeignKeyReferenceContext.class,0);
		}
		public TableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFieldContext tableField() throws RecognitionException {
		TableFieldContext _localctx = new TableFieldContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((TableFieldContext)_localctx).field = tableFieldBaseDef();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(220);
				((TableFieldContext)_localctx).type = tableFieldTypeInfo();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(223);
				((TableFieldContext)_localctx).ref = tableForeignKeyReference();
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

	public static class TableFieldBaseDefContext extends ParserRuleContext {
		public String nameOfField;
		public TableKeyFieldContext kf;
		public TablePlainFieldContext of;
		public TableOptionalFieldContext pf;
		public TableKeyFieldContext tableKeyField() {
			return getRuleContext(TableKeyFieldContext.class,0);
		}
		public TablePlainFieldContext tablePlainField() {
			return getRuleContext(TablePlainFieldContext.class,0);
		}
		public TableOptionalFieldContext tableOptionalField() {
			return getRuleContext(TableOptionalFieldContext.class,0);
		}
		public TableFieldBaseDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFieldBaseDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableFieldBaseDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableFieldBaseDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableFieldBaseDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFieldBaseDefContext tableFieldBaseDef() throws RecognitionException {
		TableFieldBaseDefContext _localctx = new TableFieldBaseDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableFieldBaseDef);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((TableFieldBaseDefContext)_localctx).kf = tableKeyField();
				 ((TableFieldBaseDefContext)_localctx).nameOfField =  ((TableFieldBaseDefContext)_localctx).kf.nameOfField; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((TableFieldBaseDefContext)_localctx).of = tablePlainField();
				 ((TableFieldBaseDefContext)_localctx).nameOfField =  ((TableFieldBaseDefContext)_localctx).of.nameOfField; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				((TableFieldBaseDefContext)_localctx).pf = tableOptionalField();
				 ((TableFieldBaseDefContext)_localctx).nameOfField =  ((TableFieldBaseDefContext)_localctx).pf.nameOfField; 
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

	public static class TableKeyFieldContext extends ParserRuleContext {
		public String nameOfField;
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public TableKeyFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableKeyField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableKeyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableKeyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableKeyField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableKeyFieldContext tableKeyField() throws RecognitionException {
		TableKeyFieldContext _localctx = new TableKeyFieldContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableKeyField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__3);
			setState(238);
			((TableKeyFieldContext)_localctx).name = match(ID);
			setState(239);
			match(T__3);
			 ((TableKeyFieldContext)_localctx).nameOfField =  ((TableKeyFieldContext)_localctx).name.getText();
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

	public static class TableOptionalFieldContext extends ParserRuleContext {
		public String nameOfField;
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public TableOptionalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptionalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableOptionalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableOptionalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableOptionalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionalFieldContext tableOptionalField() throws RecognitionException {
		TableOptionalFieldContext _localctx = new TableOptionalFieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableOptionalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((TableOptionalFieldContext)_localctx).name = match(ID);
			setState(243);
			match(T__4);
			 ((TableOptionalFieldContext)_localctx).nameOfField =  ((TableOptionalFieldContext)_localctx).name.getText();
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

	public static class TablePlainFieldContext extends ParserRuleContext {
		public String nameOfField;
		public Token name;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public TablePlainFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePlainField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTablePlainField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTablePlainField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTablePlainField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePlainFieldContext tablePlainField() throws RecognitionException {
		TablePlainFieldContext _localctx = new TablePlainFieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablePlainField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((TablePlainFieldContext)_localctx).name = match(ID);
			 ((TablePlainFieldContext)_localctx).nameOfField =  ((TablePlainFieldContext)_localctx).name.getText();
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

	public static class TableFieldTypeInfoContext extends ParserRuleContext {
		public Token type;
		public TerminalNode ID() { return getToken(DSLParser.ID, 0); }
		public TableFieldTypeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFieldTypeInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableFieldTypeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableFieldTypeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableFieldTypeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFieldTypeInfoContext tableFieldTypeInfo() throws RecognitionException {
		TableFieldTypeInfoContext _localctx = new TableFieldTypeInfoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableFieldTypeInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((TableFieldTypeInfoContext)_localctx).type = match(ID);
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

	public static class TableForeignKeyReferenceContext extends ParserRuleContext {
		public Token table;
		public Token field;
		public List<TerminalNode> ID() { return getTokens(DSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DSLParser.ID, i);
		}
		public TableForeignKeyReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableForeignKeyReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterTableForeignKeyReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitTableForeignKeyReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitTableForeignKeyReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableForeignKeyReferenceContext tableForeignKeyReference() throws RecognitionException {
		TableForeignKeyReferenceContext _localctx = new TableForeignKeyReferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tableForeignKeyReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__18);
			setState(252);
			((TableForeignKeyReferenceContext)_localctx).table = match(ID);
			setState(253);
			match(T__5);
			setState(254);
			((TableForeignKeyReferenceContext)_localctx).field = match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0103\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\2\3\2\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\5"+
		"\5R\n\5\3\5\3\5\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\fs\n\f\f\f\16\fv\13\f\3\f\3\f\3\r\3\r\3\r\5\r}\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d\13"+
		"\17\3\17\3\17\7\17\u0091\n\17\f\17\16\17\u0094\13\17\5\17\u0096\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a0\n\20\f\20\16\20\u00a3"+
		"\13\20\3\20\3\20\5\20\u00a7\n\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u00af"+
		"\n\21\f\21\16\21\u00b2\13\21\3\21\3\21\6\21\u00b6\n\21\r\21\16\21\u00b7"+
		"\3\21\3\21\7\21\u00bc\n\21\f\21\16\21\u00bf\13\21\3\21\3\21\6\21\u00c3"+
		"\n\21\r\21\16\21\u00c4\5\21\u00c7\n\21\3\22\7\22\u00ca\n\22\f\22\16\22"+
		"\u00cd\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d7\n\24\f"+
		"\24\16\24\u00da\13\24\3\24\3\24\3\25\3\25\5\25\u00e0\n\25\3\25\5\25\u00e3"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ee\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\3\3\2\21\23\2\u0105\28\3\2\2\2\4?\3\2\2\2\6E\3\2"+
		"\2\2\bG\3\2\2\2\nW\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20d\3\2\2\2\22f\3\2"+
		"\2\2\24i\3\2\2\2\26m\3\2\2\2\30y\3\2\2\2\32\u0080\3\2\2\2\34\u0095\3\2"+
		"\2\2\36\u0097\3\2\2\2 \u00c6\3\2\2\2\"\u00cb\3\2\2\2$\u00ce\3\2\2\2&\u00d0"+
		"\3\2\2\2(\u00dd\3\2\2\2*\u00ed\3\2\2\2,\u00ef\3\2\2\2.\u00f4\3\2\2\2\60"+
		"\u00f8\3\2\2\2\62\u00fb\3\2\2\2\64\u00fd\3\2\2\2\669\5\4\3\2\679\5\"\22"+
		"\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<>\5\6\4\2=<"+
		"\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BF\5\b\5\2"+
		"CF\5\36\20\2DF\5\32\16\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\7"+
		"\26\2\2HQ\7\3\2\2IN\5\n\6\2JK\7\4\2\2KM\5\n\6\2LJ\3\2\2\2MP\3\2\2\2NL"+
		"\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2S"+
		"T\7\5\2\2T\t\3\2\2\2UX\5\16\b\2VX\5\f\7\2WU\3\2\2\2WV\3\2\2\2X\13\3\2"+
		"\2\2Y_\5\20\t\2Z_\5\22\n\2[_\5\24\13\2\\_\5\26\f\2]_\5\30\r\2^Y\3\2\2"+
		"\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\r\3\2\2\2`a\7\6\2\2ab\7\26"+
		"\2\2bc\7\6\2\2c\17\3\2\2\2de\7\26\2\2e\21\3\2\2\2fg\7\26\2\2gh\7\7\2\2"+
		"h\23\3\2\2\2ij\7\b\2\2jk\7\26\2\2kl\7\b\2\2l\25\3\2\2\2mn\7\26\2\2no\7"+
		"\3\2\2ot\5\f\7\2pq\7\4\2\2qs\5\f\7\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\5\2\2x\27\3\2\2\2y|\7\t\2\2z}\5\20\t\2"+
		"{}\5\26\f\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\7\n\2\2\177\31\3\2\2\2"+
		"\u0080\u0081\7\26\2\2\u0081\u0082\5\34\17\2\u0082\u0083\7\13\2\2\u0083"+
		"\u0084\7\26\2\2\u0084\u0085\7\f\2\2\u0085\u0086\5\b\5\2\u0086\33\3\2\2"+
		"\2\u0087\u008b\7\r\2\2\u0088\u008a\7\r\2\2\u0089\u0088\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0096\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0092\7\16\2\2\u008f\u0091\7\16\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0087\3\2\2\2\u0095\u008e\3\2"+
		"\2\2\u0096\35\3\2\2\2\u0097\u0098\7\26\2\2\u0098\u0099\5 \21\2\u0099\u009a"+
		"\7\17\2\2\u009a\u00a6\7\26\2\2\u009b\u009c\7\3\2\2\u009c\u00a1\5\f\7\2"+
		"\u009d\u009e\7\4\2\2\u009e\u00a0\5\f\7\2\u009f\u009d\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009b\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9"+
		"\u00aa\5 \21\2\u00aa\u00ab\7\26\2\2\u00ab\37\3\2\2\2\u00ac\u00b0\7\r\2"+
		"\2\u00ad\u00af\7\r\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\t\2\2\2\u00b4\u00b6\7\r\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c7\3\2\2\2\u00b9"+
		"\u00bd\7\16\2\2\u00ba\u00bc\7\16\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00c3\7\16\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00ac\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c7!\3\2\2\2"+
		"\u00c8\u00ca\5$\23\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\5&\24\2\u00cf%\3\2\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\7\26\2"+
		"\2\u00d2\u00d3\7\3\2\2\u00d3\u00d8\5(\25\2\u00d4\u00d5\7\4\2\2\u00d5\u00d7"+
		"\5(\25\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\5"+
		"\2\2\u00dc\'\3\2\2\2\u00dd\u00df\5*\26\2\u00de\u00e0\5\62\32\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\5\64\33\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e5\5"+
		",\27\2\u00e5\u00e6\b\26\1\2\u00e6\u00ee\3\2\2\2\u00e7\u00e8\5\60\31\2"+
		"\u00e8\u00e9\b\26\1\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\5.\30\2\u00eb\u00ec"+
		"\b\26\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e7\3\2\2\2"+
		"\u00ed\u00ea\3\2\2\2\u00ee+\3\2\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\7"+
		"\26\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3\b\27\1\2\u00f3-\3\2\2\2\u00f4"+
		"\u00f5\7\26\2\2\u00f5\u00f6\7\7\2\2\u00f6\u00f7\b\30\1\2\u00f7/\3\2\2"+
		"\2\u00f8\u00f9\7\26\2\2\u00f9\u00fa\b\31\1\2\u00fa\61\3\2\2\2\u00fb\u00fc"+
		"\7\26\2\2\u00fc\63\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe\u00ff\7\26\2\2\u00ff"+
		"\u0100\7\b\2\2\u0100\u0101\7\26\2\2\u0101\65\3\2\2\2\328?ENQW^t|\u008b"+
		"\u0092\u0095\u00a1\u00a6\u00b0\u00b7\u00bd\u00c4\u00c6\u00cb\u00d8\u00df"+
		"\u00e2\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}