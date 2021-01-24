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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DSLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#entRelModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntRelModel(DSLParser.EntRelModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#entRelModelItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntRelModelItem(DSLParser.EntRelModelItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(DSLParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#entityField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityField(DSLParser.EntityFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#nonKeyField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonKeyField(DSLParser.NonKeyFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#keyField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyField(DSLParser.KeyFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#simpleField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleField(DSLParser.SimpleFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#optionalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalField(DSLParser.OptionalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#derivedField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedField(DSLParser.DerivedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#compositeField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeField(DSLParser.CompositeFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#multivalueField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultivalueField(DSLParser.MultivalueFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#weakEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeakEntity(DSLParser.WeakEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#parentEntityPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentEntityPart(DSLParser.ParentEntityPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#relationship}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationship(DSLParser.RelationshipContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#relationshipConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationshipConstraints(DSLParser.RelationshipConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#relationalSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalSchema(DSLParser.RelationalSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#relationalSchemaItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalSchemaItem(DSLParser.RelationalSchemaItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDefinition(DSLParser.TableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableField(DSLParser.TableFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableFieldBaseDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFieldBaseDef(DSLParser.TableFieldBaseDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableKeyField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableKeyField(DSLParser.TableKeyFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableOptionalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionalField(DSLParser.TableOptionalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tablePlainField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePlainField(DSLParser.TablePlainFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableFieldTypeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFieldTypeInfo(DSLParser.TableFieldTypeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#tableForeignKeyReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableForeignKeyReference(DSLParser.TableForeignKeyReferenceContext ctx);
}