// Generated from DSL.g4 by ANTLR 4.8

package dbdia.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DSLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DSLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#entRelModel}.
	 * @param ctx the parse tree
	 */
	void enterEntRelModel(DSLParser.EntRelModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#entRelModel}.
	 * @param ctx the parse tree
	 */
	void exitEntRelModel(DSLParser.EntRelModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#entRelModelItem}.
	 * @param ctx the parse tree
	 */
	void enterEntRelModelItem(DSLParser.EntRelModelItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#entRelModelItem}.
	 * @param ctx the parse tree
	 */
	void exitEntRelModelItem(DSLParser.EntRelModelItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(DSLParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(DSLParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#entityField}.
	 * @param ctx the parse tree
	 */
	void enterEntityField(DSLParser.EntityFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#entityField}.
	 * @param ctx the parse tree
	 */
	void exitEntityField(DSLParser.EntityFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#nonKeyField}.
	 * @param ctx the parse tree
	 */
	void enterNonKeyField(DSLParser.NonKeyFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#nonKeyField}.
	 * @param ctx the parse tree
	 */
	void exitNonKeyField(DSLParser.NonKeyFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#keyField}.
	 * @param ctx the parse tree
	 */
	void enterKeyField(DSLParser.KeyFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#keyField}.
	 * @param ctx the parse tree
	 */
	void exitKeyField(DSLParser.KeyFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#simpleField}.
	 * @param ctx the parse tree
	 */
	void enterSimpleField(DSLParser.SimpleFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#simpleField}.
	 * @param ctx the parse tree
	 */
	void exitSimpleField(DSLParser.SimpleFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#optionalField}.
	 * @param ctx the parse tree
	 */
	void enterOptionalField(DSLParser.OptionalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#optionalField}.
	 * @param ctx the parse tree
	 */
	void exitOptionalField(DSLParser.OptionalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#derivedField}.
	 * @param ctx the parse tree
	 */
	void enterDerivedField(DSLParser.DerivedFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#derivedField}.
	 * @param ctx the parse tree
	 */
	void exitDerivedField(DSLParser.DerivedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#compositeField}.
	 * @param ctx the parse tree
	 */
	void enterCompositeField(DSLParser.CompositeFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#compositeField}.
	 * @param ctx the parse tree
	 */
	void exitCompositeField(DSLParser.CompositeFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#multivalueField}.
	 * @param ctx the parse tree
	 */
	void enterMultivalueField(DSLParser.MultivalueFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#multivalueField}.
	 * @param ctx the parse tree
	 */
	void exitMultivalueField(DSLParser.MultivalueFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#weakEntity}.
	 * @param ctx the parse tree
	 */
	void enterWeakEntity(DSLParser.WeakEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#weakEntity}.
	 * @param ctx the parse tree
	 */
	void exitWeakEntity(DSLParser.WeakEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#parentEntityPart}.
	 * @param ctx the parse tree
	 */
	void enterParentEntityPart(DSLParser.ParentEntityPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#parentEntityPart}.
	 * @param ctx the parse tree
	 */
	void exitParentEntityPart(DSLParser.ParentEntityPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DSLParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DSLParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#relationConstraints}.
	 * @param ctx the parse tree
	 */
	void enterRelationConstraints(DSLParser.RelationConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#relationConstraints}.
	 * @param ctx the parse tree
	 */
	void exitRelationConstraints(DSLParser.RelationConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#relationalSchema}.
	 * @param ctx the parse tree
	 */
	void enterRelationalSchema(DSLParser.RelationalSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#relationalSchema}.
	 * @param ctx the parse tree
	 */
	void exitRelationalSchema(DSLParser.RelationalSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#relationalSchemaItem}.
	 * @param ctx the parse tree
	 */
	void enterRelationalSchemaItem(DSLParser.RelationalSchemaItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#relationalSchemaItem}.
	 * @param ctx the parse tree
	 */
	void exitRelationalSchemaItem(DSLParser.RelationalSchemaItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableDefinition(DSLParser.TableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableDefinition(DSLParser.TableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableField}.
	 * @param ctx the parse tree
	 */
	void enterTableField(DSLParser.TableFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableField}.
	 * @param ctx the parse tree
	 */
	void exitTableField(DSLParser.TableFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableFieldBaseDef}.
	 * @param ctx the parse tree
	 */
	void enterTableFieldBaseDef(DSLParser.TableFieldBaseDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableFieldBaseDef}.
	 * @param ctx the parse tree
	 */
	void exitTableFieldBaseDef(DSLParser.TableFieldBaseDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableKeyField}.
	 * @param ctx the parse tree
	 */
	void enterTableKeyField(DSLParser.TableKeyFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableKeyField}.
	 * @param ctx the parse tree
	 */
	void exitTableKeyField(DSLParser.TableKeyFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableOptionalField}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionalField(DSLParser.TableOptionalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableOptionalField}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionalField(DSLParser.TableOptionalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tablePlainField}.
	 * @param ctx the parse tree
	 */
	void enterTablePlainField(DSLParser.TablePlainFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tablePlainField}.
	 * @param ctx the parse tree
	 */
	void exitTablePlainField(DSLParser.TablePlainFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableFieldTypeInfo}.
	 * @param ctx the parse tree
	 */
	void enterTableFieldTypeInfo(DSLParser.TableFieldTypeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableFieldTypeInfo}.
	 * @param ctx the parse tree
	 */
	void exitTableFieldTypeInfo(DSLParser.TableFieldTypeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#tableForeignKeyReference}.
	 * @param ctx the parse tree
	 */
	void enterTableForeignKeyReference(DSLParser.TableForeignKeyReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#tableForeignKeyReference}.
	 * @param ctx the parse tree
	 */
	void exitTableForeignKeyReference(DSLParser.TableForeignKeyReferenceContext ctx);
}