// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuicyBoysParser}.
 */
public interface JuicyBoysListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JuicyBoysParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JuicyBoysParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JuicyBoysParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JuicyBoysParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JuicyBoysParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JuicyBoysParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JuicyBoysParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JuicyBoysParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JuicyBoysParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JuicyBoysParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JuicyBoysParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JuicyBoysParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(JuicyBoysParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(JuicyBoysParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JuicyBoysParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JuicyBoysParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JuicyBoysParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JuicyBoysParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JuicyBoysParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JuicyBoysParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaratorRest(JuicyBoysParser.MethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaratorRest(JuicyBoysParser.MethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclaratorRest(JuicyBoysParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclaratorRest(JuicyBoysParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidInterfaceMethodDeclaratorRest(JuicyBoysParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidInterfaceMethodDeclaratorRest(JuicyBoysParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaratorRest(JuicyBoysParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaratorRest(JuicyBoysParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JuicyBoysParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JuicyBoysParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JuicyBoysParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JuicyBoysParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JuicyBoysParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorsRest(JuicyBoysParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorsRest(JuicyBoysParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorRest(JuicyBoysParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorRest(JuicyBoysParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JuicyBoysParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JuicyBoysParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JuicyBoysParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JuicyBoysParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JuicyBoysParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JuicyBoysParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JuicyBoysParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JuicyBoysParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JuicyBoysParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JuicyBoysParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JuicyBoysParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JuicyBoysParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JuicyBoysParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JuicyBoysParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JuicyBoysParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JuicyBoysParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JuicyBoysParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JuicyBoysParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(JuicyBoysParser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(JuicyBoysParser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(JuicyBoysParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(JuicyBoysParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JuicyBoysParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JuicyBoysParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JuicyBoysParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JuicyBoysParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JuicyBoysParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JuicyBoysParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JuicyBoysParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JuicyBoysParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JuicyBoysParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JuicyBoysParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JuicyBoysParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JuicyBoysParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JuicyBoysParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JuicyBoysParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JuicyBoysParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JuicyBoysParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JuicyBoysParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JuicyBoysParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JuicyBoysParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JuicyBoysParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JuicyBoysParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JuicyBoysParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JuicyBoysParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JuicyBoysParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JuicyBoysParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(JuicyBoysParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(JuicyBoysParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagBlock}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagBlock(JuicyBoysParser.HashtagBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagBlock}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagBlock(JuicyBoysParser.HashtagBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagAssertStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagAssertStatement(JuicyBoysParser.HashtagAssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagAssertStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagAssertStatement(JuicyBoysParser.HashtagAssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagIfStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagIfStatement(JuicyBoysParser.HashtagIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagIfStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagIfStatement(JuicyBoysParser.HashtagIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagForStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagForStatement(JuicyBoysParser.HashtagForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagForStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagForStatement(JuicyBoysParser.HashtagForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagWhileStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagWhileStatement(JuicyBoysParser.HashtagWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagWhileStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagWhileStatement(JuicyBoysParser.HashtagWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagDoStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagDoStatement(JuicyBoysParser.HashtagDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagDoStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagDoStatement(JuicyBoysParser.HashtagDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagTryStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagTryStatement(JuicyBoysParser.HashtagTryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagTryStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagTryStatement(JuicyBoysParser.HashtagTryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagSwitchStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagSwitchStatement(JuicyBoysParser.HashtagSwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagSwitchStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagSwitchStatement(JuicyBoysParser.HashtagSwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagReturnStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagReturnStatement(JuicyBoysParser.HashtagReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagReturnStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagReturnStatement(JuicyBoysParser.HashtagReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagBreakStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagBreakStatement(JuicyBoysParser.HashtagBreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagBreakStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagBreakStatement(JuicyBoysParser.HashtagBreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagContinueStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagContinueStatement(JuicyBoysParser.HashtagContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagContinueStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagContinueStatement(JuicyBoysParser.HashtagContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagTerminateStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagTerminateStatement(JuicyBoysParser.HashtagTerminateStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagTerminateStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagTerminateStatement(JuicyBoysParser.HashtagTerminateStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagStatementExpressionStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagStatementExpressionStatement(JuicyBoysParser.HashtagStatementExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagStatementExpressionStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagStatementExpressionStatement(JuicyBoysParser.HashtagStatementExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagIdentifierStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagIdentifierStatement(JuicyBoysParser.HashtagIdentifierStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagIdentifierStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagIdentifierStatement(JuicyBoysParser.HashtagIdentifierStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagIOStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagIOStatement(JuicyBoysParser.HashtagIOStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagIOStatement}
	 * labeled alternative in {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagIOStatement(JuicyBoysParser.HashtagIOStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JuicyBoysParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JuicyBoysParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void enterIoStatement(JuicyBoysParser.IoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void exitIoStatement(JuicyBoysParser.IoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void enterInput_statement(JuicyBoysParser.Input_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#input_statement}.
	 * @param ctx the parse tree
	 */
	void exitInput_statement(JuicyBoysParser.Input_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagOutputVariable}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagOutputVariable(JuicyBoysParser.HashtagOutputVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagOutputVariable}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagOutputVariable(JuicyBoysParser.HashtagOutputVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagOutputLNVariable}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagOutputLNVariable(JuicyBoysParser.HashtagOutputLNVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagOutputLNVariable}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagOutputLNVariable(JuicyBoysParser.HashtagOutputLNVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagOutputString}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagOutputString(JuicyBoysParser.HashtagOutputStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagOutputString}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagOutputString(JuicyBoysParser.HashtagOutputStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashtagOutputLNString}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void enterHashtagOutputLNString(JuicyBoysParser.HashtagOutputLNStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashtagOutputLNString}
	 * labeled alternative in {@link JuicyBoysParser#output_statement}.
	 * @param ctx the parse tree
	 */
	void exitHashtagOutputLNString(JuicyBoysParser.HashtagOutputLNStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JuicyBoysParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JuicyBoysParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JuicyBoysParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JuicyBoysParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JuicyBoysParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JuicyBoysParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JuicyBoysParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JuicyBoysParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JuicyBoysParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JuicyBoysParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(JuicyBoysParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(JuicyBoysParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JuicyBoysParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JuicyBoysParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JuicyBoysParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JuicyBoysParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JuicyBoysParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JuicyBoysParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JuicyBoysParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JuicyBoysParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JuicyBoysParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JuicyBoysParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JuicyBoysParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JuicyBoysParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JuicyBoysParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JuicyBoysParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JuicyBoysParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JuicyBoysParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JuicyBoysParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JuicyBoysParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(JuicyBoysParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(JuicyBoysParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JuicyBoysParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JuicyBoysParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JuicyBoysParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JuicyBoysParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JuicyBoysParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JuicyBoysParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JuicyBoysParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JuicyBoysParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JuicyBoysParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JuicyBoysParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JuicyBoysParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JuicyBoysParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JuicyBoysParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JuicyBoysParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JuicyBoysParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JuicyBoysParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JuicyBoysParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#equalORnotequal}.
	 * @param ctx the parse tree
	 */
	void enterEqualORnotequal(JuicyBoysParser.EqualORnotequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#equalORnotequal}.
	 * @param ctx the parse tree
	 */
	void exitEqualORnotequal(JuicyBoysParser.EqualORnotequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(JuicyBoysParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(JuicyBoysParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JuicyBoysParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JuicyBoysParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(JuicyBoysParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(JuicyBoysParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JuicyBoysParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JuicyBoysParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(JuicyBoysParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(JuicyBoysParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JuicyBoysParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#addORsub}.
	 * @param ctx the parse tree
	 */
	void enterAddORsub(JuicyBoysParser.AddORsubContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#addORsub}.
	 * @param ctx the parse tree
	 */
	void exitAddORsub(JuicyBoysParser.AddORsubContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#mulORdivORmod}.
	 * @param ctx the parse tree
	 */
	void enterMulORdivORmod(JuicyBoysParser.MulORdivORmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#mulORdivORmod}.
	 * @param ctx the parse tree
	 */
	void exitMulORdivORmod(JuicyBoysParser.MulORdivORmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JuicyBoysParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JuicyBoysParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JuicyBoysParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JuicyBoysParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JuicyBoysParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JuicyBoysParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(JuicyBoysParser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(JuicyBoysParser.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JuicyBoysParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JuicyBoysParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JuicyBoysParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JuicyBoysParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(JuicyBoysParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(JuicyBoysParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JuicyBoysParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JuicyBoysParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JuicyBoysParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JuicyBoysParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JuicyBoysParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JuicyBoysParser.ArgumentsContext ctx);
}