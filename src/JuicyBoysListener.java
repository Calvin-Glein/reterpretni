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
	 * Enter a parse tree produced by {@link JuicyBoysParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JuicyBoysParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JuicyBoysParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JuicyBoysParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JuicyBoysParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JuicyBoysParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JuicyBoysParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceDeclaration(JuicyBoysParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceDeclaration(JuicyBoysParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiers(JuicyBoysParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiers(JuicyBoysParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JuicyBoysParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JuicyBoysParser.ClassOrInterfaceModifierContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JuicyBoysParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JuicyBoysParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JuicyBoysParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JuicyBoysParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JuicyBoysParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JuicyBoysParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JuicyBoysParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JuicyBoysParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JuicyBoysParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JuicyBoysParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JuicyBoysParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JuicyBoysParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JuicyBoysParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JuicyBoysParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JuicyBoysParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JuicyBoysParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JuicyBoysParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JuicyBoysParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JuicyBoysParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JuicyBoysParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JuicyBoysParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JuicyBoysParser.TypeListContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JuicyBoysParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JuicyBoysParser.InterfaceBodyContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodOrConstructorDecl(JuicyBoysParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodOrConstructorDecl(JuicyBoysParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodOrConstructorRest(JuicyBoysParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodOrConstructorRest(JuicyBoysParser.GenericMethodOrConstructorRestContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JuicyBoysParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JuicyBoysParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDecl(JuicyBoysParser.InterfaceMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDecl(JuicyBoysParser.InterfaceMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldDecl(JuicyBoysParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldDecl(JuicyBoysParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldRest(JuicyBoysParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldRest(JuicyBoysParser.InterfaceMethodOrFieldRestContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaratorRest(JuicyBoysParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaratorRest(JuicyBoysParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceGenericMethodDecl(JuicyBoysParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceGenericMethodDecl(JuicyBoysParser.InterfaceGenericMethodDeclContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JuicyBoysParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JuicyBoysParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JuicyBoysParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JuicyBoysParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JuicyBoysParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JuicyBoysParser.TypeNameContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JuicyBoysParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JuicyBoysParser.ClassOrInterfaceTypeContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JuicyBoysParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JuicyBoysParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JuicyBoysParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JuicyBoysParser.TypeArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(JuicyBoysParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(JuicyBoysParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JuicyBoysParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JuicyBoysParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(JuicyBoysParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(JuicyBoysParser.AnnotationNameContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JuicyBoysParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JuicyBoysParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JuicyBoysParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JuicyBoysParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JuicyBoysParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JuicyBoysParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JuicyBoysParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JuicyBoysParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JuicyBoysParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JuicyBoysParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JuicyBoysParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JuicyBoysParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JuicyBoysParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JuicyBoysParser.AnnotationConstantRestContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JuicyBoysParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JuicyBoysParser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JuicyBoysParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JuicyBoysParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JuicyBoysParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JuicyBoysParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JuicyBoysParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JuicyBoysParser.ResourceContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JuicyBoysParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JuicyBoysParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JuicyBoysParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JuicyBoysParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JuicyBoysParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JuicyBoysParser.InnerCreatorContext ctx);
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
	 * Enter a parse tree produced by {@link JuicyBoysParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JuicyBoysParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JuicyBoysParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JuicyBoysParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JuicyBoysParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JuicyBoysParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JuicyBoysParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuicyBoysParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JuicyBoysParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuicyBoysParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JuicyBoysParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
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