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
	 * Visit a parse tree produced by {@link JuicyBoysParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JuicyBoysParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JuicyBoysParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JuicyBoysParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceDeclaration(JuicyBoysParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifiers(JuicyBoysParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JuicyBoysParser.ClassOrInterfaceModifierContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JuicyBoysParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JuicyBoysParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JuicyBoysParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JuicyBoysParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(JuicyBoysParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JuicyBoysParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JuicyBoysParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JuicyBoysParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JuicyBoysParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(JuicyBoysParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JuicyBoysParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JuicyBoysParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JuicyBoysParser.InterfaceBodyContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodOrConstructorDecl(JuicyBoysParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodOrConstructorRest(JuicyBoysParser.GenericMethodOrConstructorRestContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JuicyBoysParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDecl(JuicyBoysParser.InterfaceMemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFieldDecl(JuicyBoysParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFieldRest(JuicyBoysParser.InterfaceMethodOrFieldRestContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaratorRest(JuicyBoysParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceGenericMethodDecl(JuicyBoysParser.InterfaceGenericMethodDeclContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(JuicyBoysParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(JuicyBoysParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JuicyBoysParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JuicyBoysParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JuicyBoysParser.ClassOrInterfaceTypeContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JuicyBoysParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JuicyBoysParser.TypeArgumentContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(JuicyBoysParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JuicyBoysParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(JuicyBoysParser.AnnotationNameContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JuicyBoysParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JuicyBoysParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JuicyBoysParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(JuicyBoysParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(JuicyBoysParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JuicyBoysParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JuicyBoysParser.AnnotationConstantRestContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JuicyBoysParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(JuicyBoysParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JuicyBoysParser.ResourceContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JuicyBoysParser.MultiplicativeExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JuicyBoysParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JuicyBoysParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JuicyBoysParser.InnerCreatorContext ctx);
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
	 * Visit a parse tree produced by {@link JuicyBoysParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JuicyBoysParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JuicyBoysParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JuicyBoysParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuicyBoysParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JuicyBoysParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
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