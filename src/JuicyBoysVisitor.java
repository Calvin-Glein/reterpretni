// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuicyBoysParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuicyBoysVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JuicyBoysParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(JuicyBoysParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JuicyBoysParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(JuicyBoysParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JuicyBoysParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JuicyBoysParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(JuicyBoysParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JuicyBoysParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JuicyBoysParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JuicyBoysParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaratorRest(JuicyBoysParser.MethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDeclaratorRest(JuicyBoysParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidInterfaceMethodDeclaratorRest(JuicyBoysParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaratorRest(JuicyBoysParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JuicyBoysParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JuicyBoysParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorsRest(JuicyBoysParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorRest(JuicyBoysParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JuicyBoysParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JuicyBoysParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JuicyBoysParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JuicyBoysParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JuicyBoysParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JuicyBoysParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JuicyBoysParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JuicyBoysParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JuicyBoysParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDecls(JuicyBoysParser.FormalParameterDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDeclsRest(JuicyBoysParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JuicyBoysParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(JuicyBoysParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JuicyBoysParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JuicyBoysParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JuicyBoysParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JuicyBoysParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JuicyBoysParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JuicyBoysParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JuicyBoysParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JuicyBoysParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JuicyBoysParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(JuicyBoysParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(JuicyBoysParser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#ioStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoStatement(JuicyBoysParser.IoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#input_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_statement(JuicyBoysParser.Input_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_statement(JuicyBoysParser.Output_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(JuicyBoysParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JuicyBoysParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JuicyBoysParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JuicyBoysParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JuicyBoysParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroups(JuicyBoysParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JuicyBoysParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JuicyBoysParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JuicyBoysParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JuicyBoysParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JuicyBoysParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JuicyBoysParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JuicyBoysParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JuicyBoysParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JuicyBoysParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(JuicyBoysParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JuicyBoysParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JuicyBoysParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(JuicyBoysParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(JuicyBoysParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(JuicyBoysParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(JuicyBoysParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JuicyBoysParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JuicyBoysParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(JuicyBoysParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JuicyBoysParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(JuicyBoysParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(JuicyBoysParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(JuicyBoysParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#addORsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddORsub(JuicyBoysParser.AddORsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#mulORdivORmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulORdivORmod(JuicyBoysParser.MulORdivORmodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(JuicyBoysParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JuicyBoysParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(JuicyBoysParser.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JuicyBoysParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JuicyBoysParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(JuicyBoysParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JuicyBoysParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JuicyBoysParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JuicyBoysParser.ArgumentsContext ctx);
}