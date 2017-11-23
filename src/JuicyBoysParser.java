// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuicyBoysParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABSTRACT=2, ASSERT=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, 
		ELSE=16, ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VOID=49, VOLATILE=50, 
		WHILE=51, OUTPUT=52, INPUT=53, IntegerLiteral=54, FloatingPointLiteral=55, 
		BooleanLiteral=56, CharacterLiteral=57, StringLiteral=58, NullLiteral=59, 
		LPAREN=60, RPAREN=61, LBRACE=62, RBRACE=63, LBRACK=64, RBRACK=65, SEMI=66, 
		COMMA=67, DOT=68, ASSIGN=69, GT=70, LT=71, BANG=72, TILDE=73, QUESTION=74, 
		COLON=75, EQUAL=76, LE=77, GE=78, NOTEQUAL=79, AND=80, OR=81, INC=82, 
		DEC=83, ADD=84, SUB=85, MUL=86, DIV=87, BITAND=88, BITOR=89, CARET=90, 
		MOD=91, ADD_ASSIGN=92, SUB_ASSIGN=93, MUL_ASSIGN=94, DIV_ASSIGN=95, AND_ASSIGN=96, 
		OR_ASSIGN=97, XOR_ASSIGN=98, MOD_ASSIGN=99, LSHIFT_ASSIGN=100, RSHIFT_ASSIGN=101, 
		URSHIFT_ASSIGN=102, Identifier=103, AT=104, ELLIPSIS=105, WS=106, COMMENT=107, 
		LINE_COMMENT=108;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceDeclaration = 4, RULE_classOrInterfaceModifiers = 5, 
		RULE_classOrInterfaceModifier = 6, RULE_modifiers = 7, RULE_classDeclaration = 8, 
		RULE_normalClassDeclaration = 9, RULE_typeParameters = 10, RULE_typeParameter = 11, 
		RULE_typeBound = 12, RULE_enumDeclaration = 13, RULE_enumBody = 14, RULE_enumConstants = 15, 
		RULE_enumConstant = 16, RULE_enumBodyDeclarations = 17, RULE_interfaceDeclaration = 18, 
		RULE_normalInterfaceDeclaration = 19, RULE_typeList = 20, RULE_classBody = 21, 
		RULE_interfaceBody = 22, RULE_classBodyDeclaration = 23, RULE_memberDecl = 24, 
		RULE_memberDeclaration = 25, RULE_genericMethodOrConstructorDecl = 26, 
		RULE_genericMethodOrConstructorRest = 27, RULE_methodDeclaration = 28, 
		RULE_fieldDeclaration = 29, RULE_interfaceBodyDeclaration = 30, RULE_interfaceMemberDecl = 31, 
		RULE_interfaceMethodOrFieldDecl = 32, RULE_interfaceMethodOrFieldRest = 33, 
		RULE_methodDeclaratorRest = 34, RULE_voidMethodDeclaratorRest = 35, RULE_interfaceMethodDeclaratorRest = 36, 
		RULE_interfaceGenericMethodDecl = 37, RULE_voidInterfaceMethodDeclaratorRest = 38, 
		RULE_constructorDeclaratorRest = 39, RULE_constantDeclarator = 40, RULE_variableDeclarators = 41, 
		RULE_variableDeclarator = 42, RULE_constantDeclaratorsRest = 43, RULE_constantDeclaratorRest = 44, 
		RULE_variableDeclaratorId = 45, RULE_variableInitializer = 46, RULE_arrayInitializer = 47, 
		RULE_modifier = 48, RULE_packageOrTypeName = 49, RULE_enumConstantName = 50, 
		RULE_typeName = 51, RULE_type = 52, RULE_classOrInterfaceType = 53, RULE_primitiveType = 54, 
		RULE_variableModifier = 55, RULE_typeArguments = 56, RULE_typeArgument = 57, 
		RULE_qualifiedNameList = 58, RULE_formalParameters = 59, RULE_formalParameterDecls = 60, 
		RULE_formalParameterDeclsRest = 61, RULE_methodBody = 62, RULE_constructorBody = 63, 
		RULE_qualifiedName = 64, RULE_literal = 65, RULE_annotations = 66, RULE_annotation = 67, 
		RULE_annotationName = 68, RULE_elementValuePairs = 69, RULE_elementValuePair = 70, 
		RULE_elementValue = 71, RULE_elementValueArrayInitializer = 72, RULE_annotationTypeDeclaration = 73, 
		RULE_annotationTypeBody = 74, RULE_annotationTypeElementDeclaration = 75, 
		RULE_annotationTypeElementRest = 76, RULE_annotationMethodOrConstantRest = 77, 
		RULE_annotationMethodRest = 78, RULE_annotationConstantRest = 79, RULE_defaultValue = 80, 
		RULE_block = 81, RULE_blockStatement = 82, RULE_localVariableDeclarationStatement = 83, 
		RULE_localVariableDeclaration = 84, RULE_variableModifiers = 85, RULE_statement = 86, 
		RULE_ioStatement = 87, RULE_input_statement = 88, RULE_output_statement = 89, 
		RULE_catches = 90, RULE_catchClause = 91, RULE_catchType = 92, RULE_finallyBlock = 93, 
		RULE_resourceSpecification = 94, RULE_resources = 95, RULE_resource = 96, 
		RULE_formalParameter = 97, RULE_switchBlockStatementGroups = 98, RULE_switchBlockStatementGroup = 99, 
		RULE_switchLabel = 100, RULE_forControl = 101, RULE_forInit = 102, RULE_enhancedForControl = 103, 
		RULE_forUpdate = 104, RULE_parExpression = 105, RULE_expressionList = 106, 
		RULE_statementExpression = 107, RULE_constantExpression = 108, RULE_expression = 109, 
		RULE_assignmentOperator = 110, RULE_conditionalExpression = 111, RULE_conditionalOrExpression = 112, 
		RULE_conditionalAndExpression = 113, RULE_inclusiveOrExpression = 114, 
		RULE_exclusiveOrExpression = 115, RULE_andExpression = 116, RULE_equalityExpression = 117, 
		RULE_instanceOfExpression = 118, RULE_relationalExpression = 119, RULE_relationalOp = 120, 
		RULE_shiftExpression = 121, RULE_shiftOp = 122, RULE_additiveExpression = 123, 
		RULE_addORsub = 124, RULE_multiplicativeExpression = 125, RULE_mulORdivORmod = 126, 
		RULE_unaryExpression = 127, RULE_unaryExpressionNotPlusMinus = 128, RULE_castExpression = 129, 
		RULE_primary = 130, RULE_identifierSuffix = 131, RULE_creator = 132, RULE_createdName = 133, 
		RULE_innerCreator = 134, RULE_arrayCreatorRest = 135, RULE_classCreatorRest = 136, 
		RULE_explicitGenericInvocation = 137, RULE_nonWildcardTypeArguments = 138, 
		RULE_typeArgumentsOrDiamond = 139, RULE_nonWildcardTypeArgumentsOrDiamond = 140, 
		RULE_selector = 141, RULE_superSuffix = 142, RULE_explicitGenericInvocationSuffix = 143, 
		RULE_arguments = 144;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceDeclaration", "classOrInterfaceModifiers", "classOrInterfaceModifier", 
		"modifiers", "classDeclaration", "normalClassDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "enumDeclaration", "enumBody", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
		"memberDeclaration", "genericMethodOrConstructorDecl", "genericMethodOrConstructorRest", 
		"methodDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDecl", 
		"interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", "methodDeclaratorRest", 
		"voidMethodDeclaratorRest", "interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", 
		"voidInterfaceMethodDeclaratorRest", "constructorDeclaratorRest", "constantDeclarator", 
		"variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
		"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "modifier", "packageOrTypeName", "enumConstantName", 
		"typeName", "type", "classOrInterfaceType", "primitiveType", "variableModifier", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterDecls", "formalParameterDeclsRest", "methodBody", "constructorBody", 
		"qualifiedName", "literal", "annotations", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
		"annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "variableModifiers", "statement", "ioStatement", 
		"input_statement", "output_statement", "catches", "catchClause", "catchType", 
		"finallyBlock", "resourceSpecification", "resources", "resource", "formalParameter", 
		"switchBlockStatementGroups", "switchBlockStatementGroup", "switchLabel", 
		"forControl", "forInit", "enhancedForControl", "forUpdate", "parExpression", 
		"expressionList", "statementExpression", "constantExpression", "expression", 
		"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "addORsub", 
		"multiplicativeExpression", "mulORdivORmod", "unaryExpression", "unaryExpressionNotPlusMinus", 
		"castExpression", "primary", "identifierSuffix", "creator", "createdName", 
		"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
		"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
		"selector", "superSuffix", "explicitGenericInvocationSuffix", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'String'", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'output'", 
		"'input'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "OUTPUT", "INPUT", 
		"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "JuicyBoys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuicyBoysParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JuicyBoysParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				annotations();
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PACKAGE:
					{
					setState(291);
					packageDeclaration();
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IMPORT) {
						{
						{
						setState(292);
						importDeclaration();
						}
						}
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
						{
						{
						setState(298);
						typeDeclaration();
						}
						}
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ABSTRACT:
				case CLASS:
				case ENUM:
				case FINAL:
				case INTERFACE:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case AT:
					{
					setState(304);
					classOrInterfaceDeclaration();
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
						{
						{
						setState(305);
						typeDeclaration();
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PACKAGE) {
					{
					setState(315);
					packageDeclaration();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(318);
					importDeclaration();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
					{
					{
					setState(324);
					typeDeclaration();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(PACKAGE);
			setState(334);
			qualifiedName();
			setState(335);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IMPORT);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(338);
				match(STATIC);
				}
			}

			setState(341);
			qualifiedName();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(342);
				match(DOT);
				setState(343);
				match(MUL);
				}
			}

			setState(346);
			match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(SEMI);
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

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassOrInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassOrInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			classOrInterfaceModifiers();
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ENUM:
				{
				setState(353);
				classDeclaration();
				}
				break;
			case INTERFACE:
			case AT:
				{
				setState(354);
				interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassOrInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					modifier();
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(CLASS);
			setState(378);
			match(Identifier);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(379);
				typeParameters();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(382);
				match(EXTENDS);
				setState(383);
				type();
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(386);
				match(IMPLEMENTS);
				setState(387);
				typeList();
				}
			}

			setState(390);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LT);
			setState(393);
			typeParameter();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(394);
				match(COMMA);
				setState(395);
				typeParameter();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Identifier);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(404);
				match(EXTENDS);
				setState(405);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			type();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(409);
				match(BITAND);
				setState(410);
				type();
				}
				}
				setState(415);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JuicyBoysParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(ENUM);
			setState(417);
			match(Identifier);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(418);
				match(IMPLEMENTS);
				setState(419);
				typeList();
				}
			}

			setState(422);
			enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(LBRACE);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(425);
				enumConstants();
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(428);
				match(COMMA);
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(431);
				enumBodyDeclarations();
				}
			}

			setState(434);
			match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			enumConstant();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					match(COMMA);
					setState(438);
					enumConstant();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(444);
				annotations();
				}
			}

			setState(447);
			match(Identifier);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(448);
				arguments();
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(451);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(SEMI);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(455);
				classBodyDeclaration();
				}
				}
				setState(460);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceDeclaration);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				normalInterfaceDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				annotationTypeDeclaration();
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

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(INTERFACE);
			setState(466);
			match(Identifier);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(467);
				typeParameters();
				}
			}

			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(470);
				match(EXTENDS);
				setState(471);
				typeList();
				}
			}

			setState(474);
			interfaceBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			type();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(477);
				match(COMMA);
				setState(478);
				type();
				}
				}
				setState(483);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(LBRACE);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(485);
				classBodyDeclaration();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(LBRACE);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(494);
				interfaceBodyDeclaration();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(503);
					match(STATIC);
					}
				}

				setState(506);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				modifiers();
				setState(508);
				memberDecl();
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

	public static class MemberDeclContext extends ParserRuleContext {
		public GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() {
			return getRuleContext(GenericMethodOrConstructorDeclContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memberDecl);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				genericMethodOrConstructorDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				memberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(VOID);
				setState(515);
				match(Identifier);
				setState(516);
				voidMethodDeclaratorRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				match(Identifier);
				setState(518);
				constructorDeclaratorRest();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(520);
				classDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			type();
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(524);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(525);
				fieldDeclaration();
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

	public static class GenericMethodOrConstructorDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() {
			return getRuleContext(GenericMethodOrConstructorRestContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterGenericMethodOrConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitGenericMethodOrConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitGenericMethodOrConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() throws RecognitionException {
		GenericMethodOrConstructorDeclContext _localctx = new GenericMethodOrConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericMethodOrConstructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			typeParameters();
			setState(529);
			genericMethodOrConstructorRest();
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

	public static class GenericMethodOrConstructorRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public GenericMethodOrConstructorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterGenericMethodOrConstructorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitGenericMethodOrConstructorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitGenericMethodOrConstructorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() throws RecognitionException {
		GenericMethodOrConstructorRestContext _localctx = new GenericMethodOrConstructorRestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericMethodOrConstructorRest);
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case Identifier:
					{
					setState(531);
					type();
					}
					break;
				case VOID:
					{
					setState(532);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535);
				match(Identifier);
				setState(536);
				methodDeclaratorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(Identifier);
				setState(538);
				constructorDeclaratorRest();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(Identifier);
			setState(542);
			methodDeclaratorRest();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			variableDeclarators();
			setState(545);
			match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceBodyDeclaration);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				modifiers();
				setState(548);
				interfaceMemberDecl();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(SEMI);
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

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMemberDecl);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				interfaceMethodOrFieldDecl();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				interfaceGenericMethodDecl();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(VOID);
				setState(556);
				match(Identifier);
				setState(557);
				voidInterfaceMethodDeclaratorRest();
				}
				break;
			case INTERFACE:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				interfaceDeclaration();
				}
				break;
			case CLASS:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				classDeclaration();
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

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			type();
			setState(563);
			match(Identifier);
			setState(564);
			interfaceMethodOrFieldRest();
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

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceMethodOrFieldRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMethodOrFieldRest);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				constantDeclaratorsRest();
				setState(567);
				match(SEMI);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				interfaceMethodDeclaratorRest();
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

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			formalParameters();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(573);
				match(LBRACK);
				setState(574);
				match(RBRACK);
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(580);
				match(THROWS);
				setState(581);
				qualifiedNameList();
				}
			}

			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(584);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(585);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVoidMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVoidMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVoidMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			formalParameters();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(589);
				match(THROWS);
				setState(590);
				qualifiedNameList();
				}
			}

			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(593);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(594);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			formalParameters();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(598);
				match(LBRACK);
				setState(599);
				match(RBRACK);
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(605);
				match(THROWS);
				setState(606);
				qualifiedNameList();
				}
			}

			setState(609);
			match(SEMI);
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

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInterfaceGenericMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInterfaceGenericMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			typeParameters();
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(612);
				type();
				}
				break;
			case VOID:
				{
				setState(613);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(616);
			match(Identifier);
			setState(617);
			interfaceMethodDeclaratorRest();
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

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVoidInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			formalParameters();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(620);
				match(THROWS);
				setState(621);
				qualifiedNameList();
				}
			}

			setState(624);
			match(SEMI);
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

	public static class ConstructorDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstructorDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstructorDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConstructorDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			formalParameters();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(627);
				match(THROWS);
				setState(628);
				qualifiedNameList();
				}
			}

			setState(631);
			constructorBody();
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(Identifier);
			setState(634);
			constantDeclaratorRest();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			variableDeclarator();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				match(COMMA);
				setState(638);
				variableDeclarator();
				}
				}
				setState(643);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			variableDeclaratorId();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(645);
				match(ASSIGN);
				setState(646);
				variableInitializer();
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

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstantDeclaratorsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConstantDeclaratorsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			constantDeclaratorRest();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(650);
				match(COMMA);
				setState(651);
				constantDeclarator();
				}
				}
				setState(656);
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

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstantDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConstantDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(657);
				match(LBRACK);
				setState(658);
				match(RBRACK);
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			match(ASSIGN);
			setState(665);
			variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(Identifier);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(668);
				match(LBRACK);
				setState(669);
				match(RBRACK);
				}
				}
				setState(674);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableInitializer);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				arrayInitializer();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				expression();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(LBRACE);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(680);
				variableInitializer();
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(681);
						match(COMMA);
						setState(682);
						variableInitializer();
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(688);
					match(COMMA);
					}
				}

				}
			}

			setState(693);
			match(RBRACE);
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

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_modifier);
		int _la;
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			qualifiedName();
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(Identifier);
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

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			qualifiedName();
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

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_type);
		int _la;
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				classOrInterfaceType();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(706);
					match(LBRACK);
					setState(707);
					match(RBRACK);
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				primitiveType();
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(714);
					match(LBRACK);
					setState(715);
					match(RBRACK);
					}
					}
					setState(720);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JuicyBoysParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JuicyBoysParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(Identifier);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(724);
				typeArguments();
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(727);
				match(DOT);
				setState(728);
				match(Identifier);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(729);
					typeArguments();
					}
				}

				}
				}
				setState(736);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableModifier);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				annotation();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(LT);
			setState(744);
			typeArgument();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				typeArgument();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeArgument);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				match(QUESTION);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(756);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(757);
					type();
					}
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			qualifiedName();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(763);
				match(COMMA);
				setState(764);
				qualifiedName();
				}
				}
				setState(769);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(LPAREN);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(771);
				formalParameterDecls();
				}
			}

			setState(774);
			match(RPAREN);
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

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFormalParameterDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFormalParameterDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			variableModifiers();
			setState(777);
			type();
			setState(778);
			formalParameterDeclsRest();
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

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFormalParameterDeclsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFormalParameterDeclsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFormalParameterDeclsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				variableDeclaratorId();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(781);
					match(COMMA);
					setState(782);
					formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				match(ELLIPSIS);
				setState(786);
				variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			block();
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			block();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JuicyBoysParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JuicyBoysParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(Identifier);
			setState(798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(794);
					match(DOT);
					setState(795);
					match(Identifier);
					}
					} 
				}
				setState(800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JuicyBoysParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JuicyBoysParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JuicyBoysParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JuicyBoysParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JuicyBoysParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(803);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(806); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(AT);
			setState(809);
			annotationName();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(810);
				match(LPAREN);
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(811);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(812);
					elementValue();
					}
					break;
				}
				setState(815);
				match(RPAREN);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JuicyBoysParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JuicyBoysParser.Identifier, i);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(Identifier);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(819);
				match(DOT);
				setState(820);
				match(Identifier);
				}
				}
				setState(825);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			elementValuePair();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(827);
				match(COMMA);
				setState(828);
				elementValuePair();
				}
				}
				setState(833);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(Identifier);
			setState(835);
			match(ASSIGN);
			setState(836);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_elementValue);
		try {
			setState(841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(LBRACE);
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
				{
				setState(844);
				elementValue();
				setState(849);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(845);
						match(COMMA);
						setState(846);
						elementValue();
						}
						} 
					}
					setState(851);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
			}

			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(854);
				match(COMMA);
				}
			}

			setState(857);
			match(RBRACE);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(AT);
			setState(860);
			match(INTERFACE);
			setState(861);
			match(Identifier);
			setState(862);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(LBRACE);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(865);
				annotationTypeElementDeclaration();
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			match(RBRACE);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationTypeElementDeclaration);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				modifiers();
				setState(874);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotationTypeElementRest);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				type();
				setState(880);
				annotationMethodOrConstantRest();
				setState(881);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				normalClassDeclaration();
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(884);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(887);
				normalInterfaceDeclaration();
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(888);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(891);
				enumDeclaration();
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(892);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(895);
				annotationTypeDeclaration();
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(896);
					match(SEMI);
					}
					break;
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotationMethodOrConstantRest);
		try {
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(Identifier);
			setState(906);
			match(LPAREN);
			setState(907);
			match(RPAREN);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(908);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(DEFAULT);
			setState(914);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(LBRACE);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OUTPUT) | (1L << INPUT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(917);
				blockStatement();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(923);
			match(RBRACE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_blockStatement);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			localVariableDeclaration();
			setState(931);
			match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			variableModifiers();
			setState(934);
			type();
			setState(935);
			variableDeclarators();
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

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(937);
				variableModifier();
				}
				}
				setState(942);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JuicyBoysParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statement);
		int _la;
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				match(ASSERT);
				setState(945);
				expression();
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(946);
					match(COLON);
					setState(947);
					expression();
					}
				}

				setState(950);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				match(IF);
				setState(953);
				parExpression();
				setState(954);
				statement();
				setState(957);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(955);
					match(ELSE);
					setState(956);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(959);
				match(FOR);
				setState(960);
				match(LPAREN);
				setState(961);
				forControl();
				setState(962);
				match(RPAREN);
				setState(963);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(965);
				match(WHILE);
				setState(966);
				parExpression();
				setState(967);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				match(DO);
				setState(970);
				statement();
				setState(971);
				match(WHILE);
				setState(972);
				parExpression();
				setState(973);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(975);
				match(TRY);
				setState(976);
				block();
				setState(982);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(977);
					catches();
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(978);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(981);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(984);
				match(TRY);
				setState(985);
				resourceSpecification();
				setState(986);
				block();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(987);
					catches();
					}
				}

				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(990);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(993);
				match(SWITCH);
				setState(994);
				parExpression();
				setState(995);
				match(LBRACE);
				setState(996);
				switchBlockStatementGroups();
				setState(997);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(999);
				match(SYNCHRONIZED);
				setState(1000);
				parExpression();
				setState(1001);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1003);
				match(RETURN);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(1004);
					expression();
					}
				}

				setState(1007);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1008);
				match(THROW);
				setState(1009);
				expression();
				setState(1010);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1012);
				match(BREAK);
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1013);
					match(Identifier);
					}
				}

				setState(1016);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1017);
				match(CONTINUE);
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1018);
					match(Identifier);
					}
				}

				setState(1021);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1022);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1023);
				statementExpression();
				setState(1024);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1026);
				match(Identifier);
				setState(1027);
				match(COLON);
				setState(1028);
				statement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1029);
				ioStatement();
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

	public static class IoStatementContext extends ParserRuleContext {
		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class,0);
		}
		public Output_statementContext output_statement() {
			return getRuleContext(Output_statementContext.class,0);
		}
		public IoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterIoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitIoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitIoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ioStatement);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				input_statement();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				output_statement();
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

	public static class Input_statementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(JuicyBoysParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(JuicyBoysParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JuicyBoysParser.SEMI, 0); }
		public Input_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInput_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInput_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInput_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_input_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(INPUT);
			setState(1037);
			match(LPAREN);
			setState(1038);
			match(Identifier);
			setState(1039);
			match(RPAREN);
			setState(1040);
			match(SEMI);
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

	public static class Output_statementContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(JuicyBoysParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(JuicyBoysParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JuicyBoysParser.SEMI, 0); }
		public Output_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterOutput_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitOutput_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitOutput_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_statementContext output_statement() throws RecognitionException {
		Output_statementContext _localctx = new Output_statementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_output_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(OUTPUT);
			setState(1043);
			match(LPAREN);
			setState(1044);
			match(Identifier);
			setState(1045);
			match(RPAREN);
			setState(1046);
			match(SEMI);
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

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1048);
				catchClause();
				}
				}
				setState(1051); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
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

	public static class CatchClauseContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(CATCH);
			setState(1054);
			match(LPAREN);
			setState(1055);
			variableModifiers();
			setState(1056);
			catchType();
			setState(1057);
			match(Identifier);
			setState(1058);
			match(RPAREN);
			setState(1059);
			block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			qualifiedName();
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1062);
				match(BITOR);
				setState(1063);
				qualifiedName();
				}
				}
				setState(1068);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(FINALLY);
			setState(1070);
			block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(LPAREN);
			setState(1073);
			resources();
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1074);
				match(SEMI);
				}
			}

			setState(1077);
			match(RPAREN);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			resource();
			setState(1084);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1080);
					match(SEMI);
					setState(1081);
					resource();
					}
					} 
				}
				setState(1086);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			variableModifiers();
			setState(1088);
			classOrInterfaceType();
			setState(1089);
			variableDeclaratorId();
			setState(1090);
			match(ASSIGN);
			setState(1091);
			expression();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			variableModifiers();
			setState(1094);
			type();
			setState(1095);
			variableDeclaratorId();
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

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSwitchBlockStatementGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1097);
				switchBlockStatementGroup();
				}
				}
				setState(1102);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1103);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OUTPUT) | (1L << INPUT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1108);
				blockStatement();
				}
				}
				setState(1113);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_switchLabel);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				match(CASE);
				setState(1115);
				constantExpression();
				setState(1116);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				match(CASE);
				setState(1119);
				enumConstantName();
				setState(1120);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				match(DEFAULT);
				setState(1123);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_forControl);
		int _la;
		try {
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
					setState(1127);
					forInit();
					}
				}

				setState(1130);
				match(SEMI);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(1131);
					expression();
					}
				}

				setState(1134);
				match(SEMI);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(1135);
					forUpdate();
					}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_forInit);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			variableModifiers();
			setState(1145);
			type();
			setState(1146);
			match(Identifier);
			setState(1147);
			match(COLON);
			setState(1148);
			expression();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(LPAREN);
			setState(1153);
			expression();
			setState(1154);
			match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			expression();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1157);
				match(COMMA);
				setState(1158);
				expression();
				}
				}
				setState(1163);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			expression();
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			conditionalExpression();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ASSIGN - 69)) | (1L << (ADD_ASSIGN - 69)) | (1L << (SUB_ASSIGN - 69)) | (1L << (MUL_ASSIGN - 69)) | (1L << (DIV_ASSIGN - 69)) | (1L << (AND_ASSIGN - 69)) | (1L << (OR_ASSIGN - 69)) | (1L << (XOR_ASSIGN - 69)) | (1L << (MOD_ASSIGN - 69)) | (1L << (LSHIFT_ASSIGN - 69)) | (1L << (RSHIFT_ASSIGN - 69)) | (1L << (URSHIFT_ASSIGN - 69)))) != 0)) {
				{
				setState(1169);
				assignmentOperator();
				setState(1170);
				expression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ASSIGN - 69)) | (1L << (ADD_ASSIGN - 69)) | (1L << (SUB_ASSIGN - 69)) | (1L << (MUL_ASSIGN - 69)) | (1L << (DIV_ASSIGN - 69)) | (1L << (AND_ASSIGN - 69)) | (1L << (OR_ASSIGN - 69)) | (1L << (XOR_ASSIGN - 69)) | (1L << (MOD_ASSIGN - 69)) | (1L << (LSHIFT_ASSIGN - 69)) | (1L << (RSHIFT_ASSIGN - 69)) | (1L << (URSHIFT_ASSIGN - 69)))) != 0)) ) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			conditionalOrExpression();
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1177);
				match(QUESTION);
				setState(1178);
				expression();
				setState(1179);
				match(COLON);
				setState(1180);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			conditionalAndExpression();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1185);
				match(OR);
				setState(1186);
				conditionalAndExpression();
				}
				}
				setState(1191);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			inclusiveOrExpression();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1193);
				match(AND);
				setState(1194);
				inclusiveOrExpression();
				}
				}
				setState(1199);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			exclusiveOrExpression();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1201);
				match(BITOR);
				setState(1202);
				exclusiveOrExpression();
				}
				}
				setState(1207);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			andExpression();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1209);
				match(CARET);
				setState(1210);
				andExpression();
				}
				}
				setState(1215);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			equalityExpression();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1217);
				match(BITAND);
				setState(1218);
				equalityExpression();
				}
				}
				setState(1223);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			instanceOfExpression();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1225);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1226);
				instanceOfExpression();
				}
				}
				setState(1231);
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

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			relationalExpression();
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1233);
				match(INSTANCEOF);
				setState(1234);
				type();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			shiftExpression();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GT - 70)) | (1L << (LT - 70)) | (1L << (LE - 70)) | (1L << (GE - 70)))) != 0)) {
				{
				{
				setState(1238);
				relationalOp();
				setState(1239);
				shiftExpression();
				}
				}
				setState(1245);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GT - 70)) | (1L << (LT - 70)) | (1L << (LE - 70)) | (1L << (GE - 70)))) != 0)) ) {
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			additiveExpression();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					shiftOp();
					setState(1250);
					additiveExpression();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public Token t1;
		public Token t2;
		public Token t3;
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitShiftOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitShiftOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_shiftOp);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				((ShiftOpContext)_localctx).t1 = match(LT);
				setState(1258);
				((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(1260);
				((ShiftOpContext)_localctx).t2 = match(GT);
				setState(1261);
				((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(1263);
				((ShiftOpContext)_localctx).t2 = match(GT);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AddORsubContext> addORsub() {
			return getRuleContexts(AddORsubContext.class);
		}
		public AddORsubContext addORsub(int i) {
			return getRuleContext(AddORsubContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			multiplicativeExpression();
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1267);
				addORsub();
				setState(1268);
				multiplicativeExpression();
				}
				}
				setState(1274);
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

	public static class AddORsubContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JuicyBoysParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JuicyBoysParser.SUB, 0); }
		public AddORsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addORsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAddORsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAddORsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitAddORsub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddORsubContext addORsub() throws RecognitionException {
		AddORsubContext _localctx = new AddORsubContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_addORsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MulORdivORmodContext> mulORdivORmod() {
			return getRuleContexts(MulORdivORmodContext.class);
		}
		public MulORdivORmodContext mulORdivORmod(int i) {
			return getRuleContext(MulORdivORmodContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			unaryExpression();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) {
				{
				{
				setState(1278);
				mulORdivORmod();
				setState(1279);
				unaryExpression();
				}
				}
				setState(1285);
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

	public static class MulORdivORmodContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(JuicyBoysParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JuicyBoysParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JuicyBoysParser.MOD, 0); }
		public MulORdivORmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulORdivORmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMulORdivORmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMulORdivORmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMulORdivORmod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulORdivORmodContext mulORdivORmod() throws RecognitionException {
		MulORdivORmodContext _localctx = new MulORdivORmodContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_mulORdivORmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) ) {
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JuicyBoysParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JuicyBoysParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JuicyBoysParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JuicyBoysParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_unaryExpression);
		int _la;
		try {
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (ADD - 82)) | (1L << (SUB - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1289);
				unaryExpression();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				unaryExpressionNotPlusMinus();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(TILDE);
				setState(1294);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				match(BANG);
				setState(1296);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1298);
				primary();
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==DOT) {
					{
					{
					setState(1299);
					selector();
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(1305);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_castExpression);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				match(LPAREN);
				setState(1311);
				primitiveType();
				setState(1312);
				match(RPAREN);
				setState(1313);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				match(LPAREN);
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1316);
					type();
					}
					break;
				case 2:
					{
					setState(1317);
					expression();
					}
					break;
				}
				setState(1320);
				match(RPAREN);
				setState(1321);
				unaryExpressionNotPlusMinus();
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(JuicyBoysParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JuicyBoysParser.Identifier, i);
		}
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326);
				match(THIS);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1327);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330);
				match(SUPER);
				setState(1331);
				superSuffix();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1333);
				match(NEW);
				setState(1334);
				creator();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1335);
				nonWildcardTypeArguments();
				setState(1339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1336);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1337);
					match(THIS);
					setState(1338);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(1341);
				match(Identifier);
				setState(1346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1342);
						match(DOT);
						setState(1343);
						match(Identifier);
						}
						} 
					}
					setState(1348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1349);
					identifierSuffix();
					}
					break;
				}
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1352);
				primitiveType();
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1353);
					match(LBRACK);
					setState(1354);
					match(RBRACK);
					}
					}
					setState(1359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1360);
				match(DOT);
				setState(1361);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 9);
				{
				setState(1363);
				match(VOID);
				setState(1364);
				match(DOT);
				setState(1365);
				match(CLASS);
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

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterIdentifierSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitIdentifierSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitIdentifierSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_identifierSuffix);
		int _la;
		try {
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1368);
					match(LBRACK);
					setState(1369);
					match(RBRACK);
					}
					}
					setState(1372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(1374);
				match(DOT);
				setState(1375);
				match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				match(LBRACK);
				setState(1377);
				expression();
				setState(1378);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1380);
				arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1381);
				match(DOT);
				setState(1382);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1383);
				match(DOT);
				setState(1384);
				explicitGenericInvocation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1385);
				match(DOT);
				setState(1386);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1387);
				match(DOT);
				setState(1388);
				match(SUPER);
				setState(1389);
				arguments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1390);
				match(DOT);
				setState(1391);
				match(NEW);
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1392);
					nonWildcardTypeArguments();
					}
				}

				setState(1395);
				innerCreator();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_creator);
		try {
			setState(1407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398);
				nonWildcardTypeArguments();
				setState(1399);
				createdName();
				setState(1400);
				classCreatorRest();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				createdName();
				setState(1405);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1403);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1404);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JuicyBoysParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JuicyBoysParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_createdName);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				match(Identifier);
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1410);
					typeArgumentsOrDiamond();
					}
				}

				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1413);
					match(DOT);
					setState(1414);
					match(Identifier);
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1415);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(Identifier);
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1427);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1430);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(LBRACK);
			setState(1460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1433);
				match(RBRACK);
				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1434);
					match(LBRACK);
					setState(1435);
					match(RBRACK);
					}
					}
					setState(1440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1441);
				arrayInitializer();
				}
				break;
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1442);
				expression();
				setState(1443);
				match(RBRACK);
				setState(1450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1444);
						match(LBRACK);
						setState(1445);
						expression();
						setState(1446);
						match(RBRACK);
						}
						} 
					}
					setState(1452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1453);
						match(LBRACK);
						setState(1454);
						match(RBRACK);
						}
						} 
					}
					setState(1459);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			arguments();
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1463);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			nonWildcardTypeArguments();
			setState(1467);
			explicitGenericInvocationSuffix();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(LT);
			setState(1470);
			typeList();
			setState(1471);
			match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_typeArgumentsOrDiamond);
		try {
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(LT);
				setState(1474);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				match(LT);
				setState(1479);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				nonWildcardTypeArguments();
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_selector);
		int _la;
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				match(DOT);
				setState(1484);
				match(Identifier);
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1485);
					arguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				match(DOT);
				setState(1489);
				explicitGenericInvocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(DOT);
				setState(1491);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				match(DOT);
				setState(1493);
				match(SUPER);
				setState(1494);
				superSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1495);
				match(DOT);
				setState(1496);
				match(NEW);
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1497);
					nonWildcardTypeArguments();
					}
				}

				setState(1500);
				innerCreator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1501);
				match(LBRACK);
				setState(1502);
				expression();
				setState(1503);
				match(RBRACK);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_superSuffix);
		int _la;
		try {
			setState(1513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(DOT);
				setState(1509);
				match(Identifier);
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1510);
					arguments();
					}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				match(SUPER);
				setState(1516);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				match(Identifier);
				setState(1518);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(LPAREN);
			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LT - 71)) | (1L << (BANG - 71)) | (1L << (TILDE - 71)) | (1L << (INC - 71)) | (1L << (DEC - 71)) | (1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				setState(1522);
				expressionList();
				}
			}

			setState(1525);
			match(RPAREN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u05fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\3\2\3\2\3\2\7\2\u0128\n\2\f\2\16\2\u012b\13\2\3\2\7\2\u012e\n\2\f\2\16"+
		"\2\u0131\13\2\3\2\3\2\7\2\u0135\n\2\f\2\16\2\u0138\13\2\5\2\u013a\n\2"+
		"\3\2\3\2\3\2\5\2\u013f\n\2\3\2\7\2\u0142\n\2\f\2\16\2\u0145\13\2\3\2\7"+
		"\2\u0148\n\2\f\2\16\2\u014b\13\2\3\2\5\2\u014e\n\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\5\4\u0156\n\4\3\4\3\4\3\4\5\4\u015b\n\4\3\4\3\4\3\5\3\5\5\5\u0161"+
		"\n\5\3\6\3\6\3\6\5\6\u0166\n\6\3\7\7\7\u0169\n\7\f\7\16\7\u016c\13\7\3"+
		"\b\3\b\5\b\u0170\n\b\3\t\7\t\u0173\n\t\f\t\16\t\u0176\13\t\3\n\3\n\5\n"+
		"\u017a\n\n\3\13\3\13\3\13\5\13\u017f\n\13\3\13\3\13\5\13\u0183\n\13\3"+
		"\13\3\13\5\13\u0187\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u018f\n\f\f\f\16"+
		"\f\u0192\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u0199\n\r\3\16\3\16\3\16\7\16\u019e"+
		"\n\16\f\16\16\16\u01a1\13\16\3\17\3\17\3\17\3\17\5\17\u01a7\n\17\3\17"+
		"\3\17\3\20\3\20\5\20\u01ad\n\20\3\20\5\20\u01b0\n\20\3\20\5\20\u01b3\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\7\21\u01ba\n\21\f\21\16\21\u01bd\13\21\3"+
		"\22\5\22\u01c0\n\22\3\22\3\22\5\22\u01c4\n\22\3\22\5\22\u01c7\n\22\3\23"+
		"\3\23\7\23\u01cb\n\23\f\23\16\23\u01ce\13\23\3\24\3\24\5\24\u01d2\n\24"+
		"\3\25\3\25\3\25\5\25\u01d7\n\25\3\25\3\25\5\25\u01db\n\25\3\25\3\25\3"+
		"\26\3\26\3\26\7\26\u01e2\n\26\f\26\16\26\u01e5\13\26\3\27\3\27\7\27\u01e9"+
		"\n\27\f\27\16\27\u01ec\13\27\3\27\3\27\3\30\3\30\7\30\u01f2\n\30\f\30"+
		"\16\30\u01f5\13\30\3\30\3\30\3\31\3\31\5\31\u01fb\n\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0201\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u020c\n\32\3\33\3\33\3\33\5\33\u0211\n\33\3\34\3\34\3\34\3\35\3\35\5"+
		"\35\u0218\n\35\3\35\3\35\3\35\3\35\5\35\u021e\n\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \5 \u022a\n \3!\3!\3!\3!\3!\3!\3!\5!\u0233\n!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u023d\n#\3$\3$\3$\7$\u0242\n$\f$\16$\u0245"+
		"\13$\3$\3$\5$\u0249\n$\3$\3$\5$\u024d\n$\3%\3%\3%\5%\u0252\n%\3%\3%\5"+
		"%\u0256\n%\3&\3&\3&\7&\u025b\n&\f&\16&\u025e\13&\3&\3&\5&\u0262\n&\3&"+
		"\3&\3\'\3\'\3\'\5\'\u0269\n\'\3\'\3\'\3\'\3(\3(\3(\5(\u0271\n(\3(\3(\3"+
		")\3)\3)\5)\u0278\n)\3)\3)\3*\3*\3*\3+\3+\3+\7+\u0282\n+\f+\16+\u0285\13"+
		"+\3,\3,\3,\5,\u028a\n,\3-\3-\3-\7-\u028f\n-\f-\16-\u0292\13-\3.\3.\7."+
		"\u0296\n.\f.\16.\u0299\13.\3.\3.\3.\3/\3/\3/\7/\u02a1\n/\f/\16/\u02a4"+
		"\13/\3\60\3\60\5\60\u02a8\n\60\3\61\3\61\3\61\3\61\7\61\u02ae\n\61\f\61"+
		"\16\61\u02b1\13\61\3\61\5\61\u02b4\n\61\5\61\u02b6\n\61\3\61\3\61\3\62"+
		"\3\62\5\62\u02bc\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\7\66"+
		"\u02c7\n\66\f\66\16\66\u02ca\13\66\3\66\3\66\3\66\7\66\u02cf\n\66\f\66"+
		"\16\66\u02d2\13\66\5\66\u02d4\n\66\3\67\3\67\5\67\u02d8\n\67\3\67\3\67"+
		"\3\67\5\67\u02dd\n\67\7\67\u02df\n\67\f\67\16\67\u02e2\13\67\38\38\39"+
		"\39\59\u02e8\n9\3:\3:\3:\3:\7:\u02ee\n:\f:\16:\u02f1\13:\3:\3:\3;\3;\3"+
		";\3;\5;\u02f9\n;\5;\u02fb\n;\3<\3<\3<\7<\u0300\n<\f<\16<\u0303\13<\3="+
		"\3=\5=\u0307\n=\3=\3=\3>\3>\3>\3>\3?\3?\3?\5?\u0312\n?\3?\3?\5?\u0316"+
		"\n?\3@\3@\3A\3A\3B\3B\3B\7B\u031f\nB\fB\16B\u0322\13B\3C\3C\3D\6D\u0327"+
		"\nD\rD\16D\u0328\3E\3E\3E\3E\3E\5E\u0330\nE\3E\5E\u0333\nE\3F\3F\3F\7"+
		"F\u0338\nF\fF\16F\u033b\13F\3G\3G\3G\7G\u0340\nG\fG\16G\u0343\13G\3H\3"+
		"H\3H\3H\3I\3I\3I\5I\u034c\nI\3J\3J\3J\3J\7J\u0352\nJ\fJ\16J\u0355\13J"+
		"\5J\u0357\nJ\3J\5J\u035a\nJ\3J\3J\3K\3K\3K\3K\3K\3L\3L\7L\u0365\nL\fL"+
		"\16L\u0368\13L\3L\3L\3M\3M\3M\3M\5M\u0370\nM\3N\3N\3N\3N\3N\3N\5N\u0378"+
		"\nN\3N\3N\5N\u037c\nN\3N\3N\5N\u0380\nN\3N\3N\5N\u0384\nN\5N\u0386\nN"+
		"\3O\3O\5O\u038a\nO\3P\3P\3P\3P\5P\u0390\nP\3Q\3Q\3R\3R\3R\3S\3S\7S\u0399"+
		"\nS\fS\16S\u039c\13S\3S\3S\3T\3T\3T\5T\u03a3\nT\3U\3U\3U\3V\3V\3V\3V\3"+
		"W\7W\u03ad\nW\fW\16W\u03b0\13W\3X\3X\3X\3X\3X\5X\u03b7\nX\3X\3X\3X\3X"+
		"\3X\3X\3X\5X\u03c0\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\5X\u03d6\nX\3X\5X\u03d9\nX\3X\3X\3X\3X\5X\u03df\nX\3X\5X"+
		"\u03e2\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u03f0\nX\3X\3X\3X\3X"+
		"\3X\3X\3X\5X\u03f9\nX\3X\3X\3X\5X\u03fe\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\5X\u0409\nX\3Y\3Y\5Y\u040d\nY\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3\\"+
		"\6\\\u041c\n\\\r\\\16\\\u041d\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\7^\u042b"+
		"\n^\f^\16^\u042e\13^\3_\3_\3_\3`\3`\3`\5`\u0436\n`\3`\3`\3a\3a\3a\7a\u043d"+
		"\na\fa\16a\u0440\13a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3d\7d\u044d\nd\fd\16"+
		"d\u0450\13d\3e\6e\u0453\ne\re\16e\u0454\3e\7e\u0458\ne\fe\16e\u045b\13"+
		"e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0467\nf\3g\3g\5g\u046b\ng\3g\3g\5"+
		"g\u046f\ng\3g\3g\5g\u0473\ng\5g\u0475\ng\3h\3h\5h\u0479\nh\3i\3i\3i\3"+
		"i\3i\3i\3j\3j\3k\3k\3k\3k\3l\3l\3l\7l\u048a\nl\fl\16l\u048d\13l\3m\3m"+
		"\3n\3n\3o\3o\3o\3o\5o\u0497\no\3p\3p\3q\3q\3q\3q\3q\3q\5q\u04a1\nq\3r"+
		"\3r\3r\7r\u04a6\nr\fr\16r\u04a9\13r\3s\3s\3s\7s\u04ae\ns\fs\16s\u04b1"+
		"\13s\3t\3t\3t\7t\u04b6\nt\ft\16t\u04b9\13t\3u\3u\3u\7u\u04be\nu\fu\16"+
		"u\u04c1\13u\3v\3v\3v\7v\u04c6\nv\fv\16v\u04c9\13v\3w\3w\3w\7w\u04ce\n"+
		"w\fw\16w\u04d1\13w\3x\3x\3x\5x\u04d6\nx\3y\3y\3y\3y\7y\u04dc\ny\fy\16"+
		"y\u04df\13y\3z\3z\3{\3{\3{\3{\7{\u04e7\n{\f{\16{\u04ea\13{\3|\3|\3|\3"+
		"|\3|\3|\3|\5|\u04f3\n|\3}\3}\3}\3}\7}\u04f9\n}\f}\16}\u04fc\13}\3~\3~"+
		"\3\177\3\177\3\177\3\177\7\177\u0504\n\177\f\177\16\177\u0507\13\177\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u050e\n\u0081\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0517\n\u0082\f"+
		"\u0082\16\u0082\u051a\13\u0082\3\u0082\5\u0082\u051d\n\u0082\5\u0082\u051f"+
		"\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0529\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u052e\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\5\u0084\u0533\n\u0084\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u053e\n\u0084\3"+
		"\u0084\3\u0084\3\u0084\7\u0084\u0543\n\u0084\f\u0084\16\u0084\u0546\13"+
		"\u0084\3\u0084\5\u0084\u0549\n\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u054e"+
		"\n\u0084\f\u0084\16\u0084\u0551\13\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u0559\n\u0084\3\u0085\3\u0085\6\u0085\u055d\n"+
		"\u0085\r\u0085\16\u0085\u055e\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0574\n\u0085\3\u0085"+
		"\5\u0085\u0577\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0580\n\u0086\5\u0086\u0582\n\u0086\3\u0087\3\u0087\5"+
		"\u0087\u0586\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u058b\n\u0087\7\u0087"+
		"\u058d\n\u0087\f\u0087\16\u0087\u0590\13\u0087\3\u0087\5\u0087\u0593\n"+
		"\u0087\3\u0088\3\u0088\5\u0088\u0597\n\u0088\3\u0088\3\u0088\3\u0089\3"+
		"\u0089\3\u0089\3\u0089\7\u0089\u059f\n\u0089\f\u0089\16\u0089\u05a2\13"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089"+
		"\u05ab\n\u0089\f\u0089\16\u0089\u05ae\13\u0089\3\u0089\3\u0089\7\u0089"+
		"\u05b2\n\u0089\f\u0089\16\u0089\u05b5\13\u0089\5\u0089\u05b7\n\u0089\3"+
		"\u008a\3\u008a\5\u008a\u05bb\n\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u05c7\n\u008d\3"+
		"\u008e\3\u008e\3\u008e\5\u008e\u05cc\n\u008e\3\u008f\3\u008f\3\u008f\5"+
		"\u008f\u05d1\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u05dd\n\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\5\u008f\u05e4\n\u008f\3\u0090\3\u0090\3\u0090\3"+
		"\u0090\5\u0090\u05ea\n\u0090\5\u0090\u05ec\n\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u05f2\n\u0091\3\u0092\3\u0092\5\u0092\u05f6\n\u0092\3"+
		"\u0092\3\u0092\3\u0092\2\2\u0093\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\2\16\6\2\4\4\25\25$&"+
		")*\n\2\4\4\25\25!!$&)*--\61\61\64\64\13\2\3\3\6\6\b\b\13\13\21\21\27\27"+
		"\36\36  ((\4\2\24\24++\3\28=\4\2GG^h\4\2NNQQ\4\2HIOP\3\2VW\4\2XY]]\3\2"+
		"TW\3\2TU\2\u064c\2\u014d\3\2\2\2\4\u014f\3\2\2\2\6\u0153\3\2\2\2\b\u0160"+
		"\3\2\2\2\n\u0162\3\2\2\2\f\u016a\3\2\2\2\16\u016f\3\2\2\2\20\u0174\3\2"+
		"\2\2\22\u0179\3\2\2\2\24\u017b\3\2\2\2\26\u018a\3\2\2\2\30\u0195\3\2\2"+
		"\2\32\u019a\3\2\2\2\34\u01a2\3\2\2\2\36\u01aa\3\2\2\2 \u01b6\3\2\2\2\""+
		"\u01bf\3\2\2\2$\u01c8\3\2\2\2&\u01d1\3\2\2\2(\u01d3\3\2\2\2*\u01de\3\2"+
		"\2\2,\u01e6\3\2\2\2.\u01ef\3\2\2\2\60\u0200\3\2\2\2\62\u020b\3\2\2\2\64"+
		"\u020d\3\2\2\2\66\u0212\3\2\2\28\u021d\3\2\2\2:\u021f\3\2\2\2<\u0222\3"+
		"\2\2\2>\u0229\3\2\2\2@\u0232\3\2\2\2B\u0234\3\2\2\2D\u023c\3\2\2\2F\u023e"+
		"\3\2\2\2H\u024e\3\2\2\2J\u0257\3\2\2\2L\u0265\3\2\2\2N\u026d\3\2\2\2P"+
		"\u0274\3\2\2\2R\u027b\3\2\2\2T\u027e\3\2\2\2V\u0286\3\2\2\2X\u028b\3\2"+
		"\2\2Z\u0297\3\2\2\2\\\u029d\3\2\2\2^\u02a7\3\2\2\2`\u02a9\3\2\2\2b\u02bb"+
		"\3\2\2\2d\u02bd\3\2\2\2f\u02bf\3\2\2\2h\u02c1\3\2\2\2j\u02d3\3\2\2\2l"+
		"\u02d5\3\2\2\2n\u02e3\3\2\2\2p\u02e7\3\2\2\2r\u02e9\3\2\2\2t\u02fa\3\2"+
		"\2\2v\u02fc\3\2\2\2x\u0304\3\2\2\2z\u030a\3\2\2\2|\u0315\3\2\2\2~\u0317"+
		"\3\2\2\2\u0080\u0319\3\2\2\2\u0082\u031b\3\2\2\2\u0084\u0323\3\2\2\2\u0086"+
		"\u0326\3\2\2\2\u0088\u032a\3\2\2\2\u008a\u0334\3\2\2\2\u008c\u033c\3\2"+
		"\2\2\u008e\u0344\3\2\2\2\u0090\u034b\3\2\2\2\u0092\u034d\3\2\2\2\u0094"+
		"\u035d\3\2\2\2\u0096\u0362\3\2\2\2\u0098\u036f\3\2\2\2\u009a\u0385\3\2"+
		"\2\2\u009c\u0389\3\2\2\2\u009e\u038b\3\2\2\2\u00a0\u0391\3\2\2\2\u00a2"+
		"\u0393\3\2\2\2\u00a4\u0396\3\2\2\2\u00a6\u03a2\3\2\2\2\u00a8\u03a4\3\2"+
		"\2\2\u00aa\u03a7\3\2\2\2\u00ac\u03ae\3\2\2\2\u00ae\u0408\3\2\2\2\u00b0"+
		"\u040c\3\2\2\2\u00b2\u040e\3\2\2\2\u00b4\u0414\3\2\2\2\u00b6\u041b\3\2"+
		"\2\2\u00b8\u041f\3\2\2\2\u00ba\u0427\3\2\2\2\u00bc\u042f\3\2\2\2\u00be"+
		"\u0432\3\2\2\2\u00c0\u0439\3\2\2\2\u00c2\u0441\3\2\2\2\u00c4\u0447\3\2"+
		"\2\2\u00c6\u044e\3\2\2\2\u00c8\u0452\3\2\2\2\u00ca\u0466\3\2\2\2\u00cc"+
		"\u0474\3\2\2\2\u00ce\u0478\3\2\2\2\u00d0\u047a\3\2\2\2\u00d2\u0480\3\2"+
		"\2\2\u00d4\u0482\3\2\2\2\u00d6\u0486\3\2\2\2\u00d8\u048e\3\2\2\2\u00da"+
		"\u0490\3\2\2\2\u00dc\u0492\3\2\2\2\u00de\u0498\3\2\2\2\u00e0\u049a\3\2"+
		"\2\2\u00e2\u04a2\3\2\2\2\u00e4\u04aa\3\2\2\2\u00e6\u04b2\3\2\2\2\u00e8"+
		"\u04ba\3\2\2\2\u00ea\u04c2\3\2\2\2\u00ec\u04ca\3\2\2\2\u00ee\u04d2\3\2"+
		"\2\2\u00f0\u04d7\3\2\2\2\u00f2\u04e0\3\2\2\2\u00f4\u04e2\3\2\2\2\u00f6"+
		"\u04f2\3\2\2\2\u00f8\u04f4\3\2\2\2\u00fa\u04fd\3\2\2\2\u00fc\u04ff\3\2"+
		"\2\2\u00fe\u0508\3\2\2\2\u0100\u050d\3\2\2\2\u0102\u051e\3\2\2\2\u0104"+
		"\u052d\3\2\2\2\u0106\u0558\3\2\2\2\u0108\u0576\3\2\2\2\u010a\u0581\3\2"+
		"\2\2\u010c\u0592\3\2\2\2\u010e\u0594\3\2\2\2\u0110\u059a\3\2\2\2\u0112"+
		"\u05b8\3\2\2\2\u0114\u05bc\3\2\2\2\u0116\u05bf\3\2\2\2\u0118\u05c6\3\2"+
		"\2\2\u011a\u05cb\3\2\2\2\u011c\u05e3\3\2\2\2\u011e\u05eb\3\2\2\2\u0120"+
		"\u05f1\3\2\2\2\u0122\u05f3\3\2\2\2\u0124\u0139\5\u0086D\2\u0125\u0129"+
		"\5\4\3\2\u0126\u0128\5\6\4\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012f\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012c\u012e\5\b\5\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u013a\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u0136\5\n\6\2\u0133\u0135\5\b\5\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u0125\3\2\2\2\u0139\u0132\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\7\2\2\3\u013c\u014e\3\2\2\2\u013d\u013f\5\4"+
		"\3\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140"+
		"\u0142\5\6\4\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\5\b\5\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\7\2\2\3\u014d\u0124\3\2\2\2\u014d\u013e\3\2\2\2\u014e\3\3\2\2\2"+
		"\u014f\u0150\7#\2\2\u0150\u0151\5\u0082B\2\u0151\u0152\7D\2\2\u0152\5"+
		"\3\2\2\2\u0153\u0155\7\34\2\2\u0154\u0156\7)\2\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\5\u0082B\2\u0158\u0159"+
		"\7F\2\2\u0159\u015b\7X\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\7D\2\2\u015d\7\3\2\2\2\u015e\u0161\5\n\6\2"+
		"\u015f\u0161\7D\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\t\3"+
		"\2\2\2\u0162\u0165\5\f\7\2\u0163\u0166\5\22\n\2\u0164\u0166\5&\24\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\13\3\2\2\2\u0167\u0169\5\16\b"+
		"\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\r\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0170\5\u0088E\2\u016e"+
		"\u0170\t\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\17\3\2\2"+
		"\2\u0171\u0173\5b\62\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\21\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u017a\5\24\13\2\u0178\u017a\5\34\17\2\u0179\u0177\3\2\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\23\3\2\2\2\u017b\u017c\7\f\2\2\u017c\u017e\7i\2\2\u017d"+
		"\u017f\5\26\f\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3"+
		"\2\2\2\u0180\u0181\7\24\2\2\u0181\u0183\5j\66\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0185\7\33\2\2\u0185\u0187\5"+
		"*\26\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\5,\27\2\u0189\25\3\2\2\2\u018a\u018b\7I\2\2\u018b\u0190\5\30\r"+
		"\2\u018c\u018d\7E\2\2\u018d\u018f\5\30\r\2\u018e\u018c\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\7H\2\2\u0194\27\3\2\2\2\u0195\u0198\7i\2\2"+
		"\u0196\u0197\7\24\2\2\u0197\u0199\5\32\16\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\31\3\2\2\2\u019a\u019f\5j\66\2\u019b\u019c\7Z\2\2"+
		"\u019c\u019e\5j\66\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\33\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a3\7\23\2\2\u01a3\u01a6\7i\2\2\u01a4\u01a5\7\33\2\2\u01a5\u01a7\5"+
		"*\26\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\5\36\20\2\u01a9\35\3\2\2\2\u01aa\u01ac\7@\2\2\u01ab\u01ad\5 \21"+
		"\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0"+
		"\7E\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01b3\5$\23\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b5\7A\2\2\u01b5\37\3\2\2\2\u01b6\u01bb\5\"\22\2\u01b7\u01b8"+
		"\7E\2\2\u01b8\u01ba\5\"\22\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc!\3\2\2\2\u01bd\u01bb\3\2\2\2"+
		"\u01be\u01c0\5\u0086D\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\7i\2\2\u01c2\u01c4\5\u0122\u0092\2\u01c3\u01c2"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c7\5,\27\2\u01c6"+
		"\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7#\3\2\2\2\u01c8\u01cc\7D\2\2\u01c9"+
		"\u01cb\5\60\31\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd%\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2"+
		"\5(\25\2\u01d0\u01d2\5\u0094K\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2"+
		"\2\u01d2\'\3\2\2\2\u01d3\u01d4\7\37\2\2\u01d4\u01d6\7i\2\2\u01d5\u01d7"+
		"\5\26\f\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2"+
		"\u01d8\u01d9\7\24\2\2\u01d9\u01db\5*\26\2\u01da\u01d8\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\5.\30\2\u01dd)\3\2\2\2\u01de"+
		"\u01e3\5j\66\2\u01df\u01e0\7E\2\2\u01e0\u01e2\5j\66\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"+\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01ea\7@\2\2\u01e7\u01e9\5\60\31\2"+
		"\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7A\2\2\u01ee"+
		"-\3\2\2\2\u01ef\u01f3\7@\2\2\u01f0\u01f2\5> \2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7A\2\2\u01f7/\3\2\2\2\u01f8\u0201"+
		"\7D\2\2\u01f9\u01fb\7)\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u0201\5\u00a4S\2\u01fd\u01fe\5\20\t\2\u01fe\u01ff"+
		"\5\62\32\2\u01ff\u0201\3\2\2\2\u0200\u01f8\3\2\2\2\u0200\u01fa\3\2\2\2"+
		"\u0200\u01fd\3\2\2\2\u0201\61\3\2\2\2\u0202\u020c\5\66\34\2\u0203\u020c"+
		"\5\64\33\2\u0204\u0205\7\63\2\2\u0205\u0206\7i\2\2\u0206\u020c\5H%\2\u0207"+
		"\u0208\7i\2\2\u0208\u020c\5P)\2\u0209\u020c\5&\24\2\u020a\u020c\5\22\n"+
		"\2\u020b\u0202\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0204\3\2\2\2\u020b\u0207"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\63\3\2\2\2\u020d"+
		"\u0210\5j\66\2\u020e\u0211\5:\36\2\u020f\u0211\5<\37\2\u0210\u020e\3\2"+
		"\2\2\u0210\u020f\3\2\2\2\u0211\65\3\2\2\2\u0212\u0213\5\26\f\2\u0213\u0214"+
		"\58\35\2\u0214\67\3\2\2\2\u0215\u0218\5j\66\2\u0216\u0218\7\63\2\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\7i"+
		"\2\2\u021a\u021e\5F$\2\u021b\u021c\7i\2\2\u021c\u021e\5P)\2\u021d\u0217"+
		"\3\2\2\2\u021d\u021b\3\2\2\2\u021e9\3\2\2\2\u021f\u0220\7i\2\2\u0220\u0221"+
		"\5F$\2\u0221;\3\2\2\2\u0222\u0223\5T+\2\u0223\u0224\7D\2\2\u0224=\3\2"+
		"\2\2\u0225\u0226\5\20\t\2\u0226\u0227\5@!\2\u0227\u022a\3\2\2\2\u0228"+
		"\u022a\7D\2\2\u0229\u0225\3\2\2\2\u0229\u0228\3\2\2\2\u022a?\3\2\2\2\u022b"+
		"\u0233\5B\"\2\u022c\u0233\5L\'\2\u022d\u022e\7\63\2\2\u022e\u022f\7i\2"+
		"\2\u022f\u0233\5N(\2\u0230\u0233\5&\24\2\u0231\u0233\5\22\n\2\u0232\u022b"+
		"\3\2\2\2\u0232\u022c\3\2\2\2\u0232\u022d\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0231\3\2\2\2\u0233A\3\2\2\2\u0234\u0235\5j\66\2\u0235\u0236\7i\2\2\u0236"+
		"\u0237\5D#\2\u0237C\3\2\2\2\u0238\u0239\5X-\2\u0239\u023a\7D\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u023d\5J&\2\u023c\u0238\3\2\2\2\u023c\u023b\3\2\2"+
		"\2\u023dE\3\2\2\2\u023e\u0243\5x=\2\u023f\u0240\7B\2\2\u0240\u0242\7C"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0248\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7\60"+
		"\2\2\u0247\u0249\5v<\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024c"+
		"\3\2\2\2\u024a\u024d\5~@\2\u024b\u024d\7D\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024b\3\2\2\2\u024dG\3\2\2\2\u024e\u0251\5x=\2\u024f\u0250\7\60\2\2\u0250"+
		"\u0252\5v<\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255\3\2\2"+
		"\2\u0253\u0256\5~@\2\u0254\u0256\7D\2\2\u0255\u0253\3\2\2\2\u0255\u0254"+
		"\3\2\2\2\u0256I\3\2\2\2\u0257\u025c\5x=\2\u0258\u0259\7B\2\2\u0259\u025b"+
		"\7C\2\2\u025a\u0258\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u0261\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\7\60"+
		"\2\2\u0260\u0262\5v<\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0264\7D\2\2\u0264K\3\2\2\2\u0265\u0268\5\26\f\2\u0266"+
		"\u0269\5j\66\2\u0267\u0269\7\63\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3"+
		"\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\7i\2\2\u026b\u026c\5J&\2\u026c"+
		"M\3\2\2\2\u026d\u0270\5x=\2\u026e\u026f\7\60\2\2\u026f\u0271\5v<\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\7D"+
		"\2\2\u0273O\3\2\2\2\u0274\u0277\5x=\2\u0275\u0276\7\60\2\2\u0276\u0278"+
		"\5v<\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027a\5\u0080A\2\u027aQ\3\2\2\2\u027b\u027c\7i\2\2\u027c\u027d\5Z.\2"+
		"\u027dS\3\2\2\2\u027e\u0283\5V,\2\u027f\u0280\7E\2\2\u0280\u0282\5V,\2"+
		"\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284U\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0289\5\\/\2\u0287\u0288"+
		"\7G\2\2\u0288\u028a\5^\60\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"W\3\2\2\2\u028b\u0290\5Z.\2\u028c\u028d\7E\2\2\u028d\u028f\5R*\2\u028e"+
		"\u028c\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291Y\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7B\2\2\u0294\u0296"+
		"\7C\2\2\u0295\u0293\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\7G"+
		"\2\2\u029b\u029c\5^\60\2\u029c[\3\2\2\2\u029d\u02a2\7i\2\2\u029e\u029f"+
		"\7B\2\2\u029f\u02a1\7C\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3]\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a5\u02a8\5`\61\2\u02a6\u02a8\5\u00dco\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a6\3\2\2\2\u02a8_\3\2\2\2\u02a9\u02b5\7@\2\2\u02aa\u02af\5^\60\2\u02ab"+
		"\u02ac\7E\2\2\u02ac\u02ae\5^\60\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02b4\7E\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02aa\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b8\7A\2\2\u02b8a\3\2\2\2\u02b9\u02bc\5\u0088E"+
		"\2\u02ba\u02bc\t\3\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bcc"+
		"\3\2\2\2\u02bd\u02be\5\u0082B\2\u02bee\3\2\2\2\u02bf\u02c0\7i\2\2\u02c0"+
		"g\3\2\2\2\u02c1\u02c2\5\u0082B\2\u02c2i\3\2\2\2\u02c3\u02c8\5l\67\2\u02c4"+
		"\u02c5\7B\2\2\u02c5\u02c7\7C\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2"+
		"\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02d4\3\2\2\2\u02ca\u02c8"+
		"\3\2\2\2\u02cb\u02d0\5n8\2\u02cc\u02cd\7B\2\2\u02cd\u02cf\7C\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2"+
		"\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02c3\3\2\2\2\u02d3"+
		"\u02cb\3\2\2\2\u02d4k\3\2\2\2\u02d5\u02d7\7i\2\2\u02d6\u02d8\5r:\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02e0\3\2\2\2\u02d9\u02da\7F"+
		"\2\2\u02da\u02dc\7i\2\2\u02db\u02dd\5r:\2\u02dc\u02db\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02d9\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1m\3\2\2\2\u02e2\u02e0\3\2\2\2"+
		"\u02e3\u02e4\t\4\2\2\u02e4o\3\2\2\2\u02e5\u02e8\7\25\2\2\u02e6\u02e8\5"+
		"\u0088E\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8q\3\2\2\2\u02e9"+
		"\u02ea\7I\2\2\u02ea\u02ef\5t;\2\u02eb\u02ec\7E\2\2\u02ec\u02ee\5t;\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7H\2\2\u02f3"+
		"s\3\2\2\2\u02f4\u02fb\5j\66\2\u02f5\u02f8\7L\2\2\u02f6\u02f7\t\5\2\2\u02f7"+
		"\u02f9\5j\66\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2"+
		"\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02f5\3\2\2\2\u02fbu\3\2\2\2\u02fc\u0301"+
		"\5\u0082B\2\u02fd\u02fe\7E\2\2\u02fe\u0300\5\u0082B\2\u02ff\u02fd\3\2"+
		"\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"w\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0306\7>\2\2\u0305\u0307\5z>\2\u0306"+
		"\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\7?"+
		"\2\2\u0309y\3\2\2\2\u030a\u030b\5\u00acW\2\u030b\u030c\5j\66\2\u030c\u030d"+
		"\5|?\2\u030d{\3\2\2\2\u030e\u0311\5\\/\2\u030f\u0310\7E\2\2\u0310\u0312"+
		"\5z>\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0316\3\2\2\2\u0313"+
		"\u0314\7k\2\2\u0314\u0316\5\\/\2\u0315\u030e\3\2\2\2\u0315\u0313\3\2\2"+
		"\2\u0316}\3\2\2\2\u0317\u0318\5\u00a4S\2\u0318\177\3\2\2\2\u0319\u031a"+
		"\5\u00a4S\2\u031a\u0081\3\2\2\2\u031b\u0320\7i\2\2\u031c\u031d\7F\2\2"+
		"\u031d\u031f\7i\2\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0083\3\2\2\2\u0322\u0320\3\2\2\2\u0323"+
		"\u0324\t\6\2\2\u0324\u0085\3\2\2\2\u0325\u0327\5\u0088E\2\u0326\u0325"+
		"\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u0087\3\2\2\2\u032a\u032b\7j\2\2\u032b\u0332\5\u008aF\2\u032c\u032f\7"+
		">\2\2\u032d\u0330\5\u008cG\2\u032e\u0330\5\u0090I\2\u032f\u032d\3\2\2"+
		"\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\7?\2\2\u0332\u032c\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0089\3\2\2\2\u0334"+
		"\u0339\7i\2\2\u0335\u0336\7F\2\2\u0336\u0338\7i\2\2\u0337\u0335\3\2\2"+
		"\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u008b"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u0341\5\u008eH\2\u033d\u033e\7E\2\2"+
		"\u033e\u0340\5\u008eH\2\u033f\u033d\3\2\2\2\u0340\u0343\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u008d\3\2\2\2\u0343\u0341\3\2"+
		"\2\2\u0344\u0345\7i\2\2\u0345\u0346\7G\2\2\u0346\u0347\5\u0090I\2\u0347"+
		"\u008f\3\2\2\2\u0348\u034c\5\u00e0q\2\u0349\u034c\5\u0088E\2\u034a\u034c"+
		"\5\u0092J\2\u034b\u0348\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034a\3\2\2"+
		"\2\u034c\u0091\3\2\2\2\u034d\u0356\7@\2\2\u034e\u0353\5\u0090I\2\u034f"+
		"\u0350\7E\2\2\u0350\u0352\5\u0090I\2\u0351\u034f\3\2\2\2\u0352\u0355\3"+
		"\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0357\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0356\u034e\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2"+
		"\2\2\u0358\u035a\7E\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u035c\7A\2\2\u035c\u0093\3\2\2\2\u035d\u035e\7j\2"+
		"\2\u035e\u035f\7\37\2\2\u035f\u0360\7i\2\2\u0360\u0361\5\u0096L\2\u0361"+
		"\u0095\3\2\2\2\u0362\u0366\7@\2\2\u0363\u0365\5\u0098M\2\u0364\u0363\3"+
		"\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\7A\2\2\u036a\u0097\3\2"+
		"\2\2\u036b\u036c\5\20\t\2\u036c\u036d\5\u009aN\2\u036d\u0370\3\2\2\2\u036e"+
		"\u0370\7D\2\2\u036f\u036b\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u0099\3\2"+
		"\2\2\u0371\u0372\5j\66\2\u0372\u0373\5\u009cO\2\u0373\u0374\7D\2\2\u0374"+
		"\u0386\3\2\2\2\u0375\u0377\5\24\13\2\u0376\u0378\7D\2\2\u0377\u0376\3"+
		"\2\2\2\u0377\u0378\3\2\2\2\u0378\u0386\3\2\2\2\u0379\u037b\5(\25\2\u037a"+
		"\u037c\7D\2\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0386\3\2"+
		"\2\2\u037d\u037f\5\34\17\2\u037e\u0380\7D\2\2\u037f\u037e\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0386\3\2\2\2\u0381\u0383\5\u0094K\2\u0382\u0384"+
		"\7D\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385"+
		"\u0371\3\2\2\2\u0385\u0375\3\2\2\2\u0385\u0379\3\2\2\2\u0385\u037d\3\2"+
		"\2\2\u0385\u0381\3\2\2\2\u0386\u009b\3\2\2\2\u0387\u038a\5\u009eP\2\u0388"+
		"\u038a\5\u00a0Q\2\u0389\u0387\3\2\2\2\u0389\u0388\3\2\2\2\u038a\u009d"+
		"\3\2\2\2\u038b\u038c\7i\2\2\u038c\u038d\7>\2\2\u038d\u038f\7?\2\2\u038e"+
		"\u0390\5\u00a2R\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u009f"+
		"\3\2\2\2\u0391\u0392\5T+\2\u0392\u00a1\3\2\2\2\u0393\u0394\7\17\2\2\u0394"+
		"\u0395\5\u0090I\2\u0395\u00a3\3\2\2\2\u0396\u039a\7@\2\2\u0397\u0399\5"+
		"\u00a6T\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2"+
		"\u039a\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e"+
		"\7A\2\2\u039e\u00a5\3\2\2\2\u039f\u03a3\5\u00a8U\2\u03a0\u03a3\5\n\6\2"+
		"\u03a1\u03a3\5\u00aeX\2\u03a2\u039f\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2"+
		"\u03a1\3\2\2\2\u03a3\u00a7\3\2\2\2\u03a4\u03a5\5\u00aaV\2\u03a5\u03a6"+
		"\7D\2\2\u03a6\u00a9\3\2\2\2\u03a7\u03a8\5\u00acW\2\u03a8\u03a9\5j\66\2"+
		"\u03a9\u03aa\5T+\2\u03aa\u00ab\3\2\2\2\u03ab\u03ad\5p9\2\u03ac\u03ab\3"+
		"\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u00ad\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u0409\5\u00a4S\2\u03b2\u03b3"+
		"\7\5\2\2\u03b3\u03b6\5\u00dco\2\u03b4\u03b5\7M\2\2\u03b5\u03b7\5\u00dc"+
		"o\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03b9\7D\2\2\u03b9\u0409\3\2\2\2\u03ba\u03bb\7\31\2\2\u03bb\u03bc\5\u00d4"+
		"k\2\u03bc\u03bf\5\u00aeX\2\u03bd\u03be\7\22\2\2\u03be\u03c0\5\u00aeX\2"+
		"\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u0409\3\2\2\2\u03c1\u03c2"+
		"\7\30\2\2\u03c2\u03c3\7>\2\2\u03c3\u03c4\5\u00ccg\2\u03c4\u03c5\7?\2\2"+
		"\u03c5\u03c6\5\u00aeX\2\u03c6\u0409\3\2\2\2\u03c7\u03c8\7\65\2\2\u03c8"+
		"\u03c9\5\u00d4k\2\u03c9\u03ca\5\u00aeX\2\u03ca\u0409\3\2\2\2\u03cb\u03cc"+
		"\7\20\2\2\u03cc\u03cd\5\u00aeX\2\u03cd\u03ce\7\65\2\2\u03ce\u03cf\5\u00d4"+
		"k\2\u03cf\u03d0\7D\2\2\u03d0\u0409\3\2\2\2\u03d1\u03d2\7\62\2\2\u03d2"+
		"\u03d8\5\u00a4S\2\u03d3\u03d5\5\u00b6\\\2\u03d4\u03d6\5\u00bc_\2\u03d5"+
		"\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d9\5\u00bc"+
		"_\2\u03d8\u03d3\3\2\2\2\u03d8\u03d7\3\2\2\2\u03d9\u0409\3\2\2\2\u03da"+
		"\u03db\7\62\2\2\u03db\u03dc\5\u00be`\2\u03dc\u03de\5\u00a4S\2\u03dd\u03df"+
		"\5\u00b6\\\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2"+
		"\2\u03e0\u03e2\5\u00bc_\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u0409\3\2\2\2\u03e3\u03e4\7,\2\2\u03e4\u03e5\5\u00d4k\2\u03e5\u03e6\7"+
		"@\2\2\u03e6\u03e7\5\u00c6d\2\u03e7\u03e8\7A\2\2\u03e8\u0409\3\2\2\2\u03e9"+
		"\u03ea\7-\2\2\u03ea\u03eb\5\u00d4k\2\u03eb\u03ec\5\u00a4S\2\u03ec\u0409"+
		"\3\2\2\2\u03ed\u03ef\7\'\2\2\u03ee\u03f0\5\u00dco\2\u03ef\u03ee\3\2\2"+
		"\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u0409\7D\2\2\u03f2\u03f3"+
		"\7/\2\2\u03f3\u03f4\5\u00dco\2\u03f4\u03f5\7D\2\2\u03f5\u0409\3\2\2\2"+
		"\u03f6\u03f8\7\7\2\2\u03f7\u03f9\7i\2\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0409\7D\2\2\u03fb\u03fd\7\16\2\2\u03fc"+
		"\u03fe\7i\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2"+
		"\2\2\u03ff\u0409\7D\2\2\u0400\u0409\7D\2\2\u0401\u0402\5\u00d8m\2\u0402"+
		"\u0403\7D\2\2\u0403\u0409\3\2\2\2\u0404\u0405\7i\2\2\u0405\u0406\7M\2"+
		"\2\u0406\u0409\5\u00aeX\2\u0407\u0409\5\u00b0Y\2\u0408\u03b1\3\2\2\2\u0408"+
		"\u03b2\3\2\2\2\u0408\u03ba\3\2\2\2\u0408\u03c1\3\2\2\2\u0408\u03c7\3\2"+
		"\2\2\u0408\u03cb\3\2\2\2\u0408\u03d1\3\2\2\2\u0408\u03da\3\2\2\2\u0408"+
		"\u03e3\3\2\2\2\u0408\u03e9\3\2\2\2\u0408\u03ed\3\2\2\2\u0408\u03f2\3\2"+
		"\2\2\u0408\u03f6\3\2\2\2\u0408\u03fb\3\2\2\2\u0408\u0400\3\2\2\2\u0408"+
		"\u0401\3\2\2\2\u0408\u0404\3\2\2\2\u0408\u0407\3\2\2\2\u0409\u00af\3\2"+
		"\2\2\u040a\u040d\5\u00b2Z\2\u040b\u040d\5\u00b4[\2\u040c\u040a\3\2\2\2"+
		"\u040c\u040b\3\2\2\2\u040d\u00b1\3\2\2\2\u040e\u040f\7\67\2\2\u040f\u0410"+
		"\7>\2\2\u0410\u0411\7i\2\2\u0411\u0412\7?\2\2\u0412\u0413\7D\2\2\u0413"+
		"\u00b3\3\2\2\2\u0414\u0415\7\66\2\2\u0415\u0416\7>\2\2\u0416\u0417\7i"+
		"\2\2\u0417\u0418\7?\2\2\u0418\u0419\7D\2\2\u0419\u00b5\3\2\2\2\u041a\u041c"+
		"\5\u00b8]\2\u041b\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3\2\2"+
		"\2\u041d\u041e\3\2\2\2\u041e\u00b7\3\2\2\2\u041f\u0420\7\n\2\2\u0420\u0421"+
		"\7>\2\2\u0421\u0422\5\u00acW\2\u0422\u0423\5\u00ba^\2\u0423\u0424\7i\2"+
		"\2\u0424\u0425\7?\2\2\u0425\u0426\5\u00a4S\2\u0426\u00b9\3\2\2\2\u0427"+
		"\u042c\5\u0082B\2\u0428\u0429\7[\2\2\u0429\u042b\5\u0082B\2\u042a\u0428"+
		"\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u00bb\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0430\7\26\2\2\u0430\u0431\5"+
		"\u00a4S\2\u0431\u00bd\3\2\2\2\u0432\u0433\7>\2\2\u0433\u0435\5\u00c0a"+
		"\2\u0434\u0436\7D\2\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437"+
		"\3\2\2\2\u0437\u0438\7?\2\2\u0438\u00bf\3\2\2\2\u0439\u043e\5\u00c2b\2"+
		"\u043a\u043b\7D\2\2\u043b\u043d\5\u00c2b\2\u043c\u043a\3\2\2\2\u043d\u0440"+
		"\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u00c1\3\2\2\2\u0440"+
		"\u043e\3\2\2\2\u0441\u0442\5\u00acW\2\u0442\u0443\5l\67\2\u0443\u0444"+
		"\5\\/\2\u0444\u0445\7G\2\2\u0445\u0446\5\u00dco\2\u0446\u00c3\3\2\2\2"+
		"\u0447\u0448\5\u00acW\2\u0448\u0449\5j\66\2\u0449\u044a\5\\/\2\u044a\u00c5"+
		"\3\2\2\2\u044b\u044d\5\u00c8e\2\u044c\u044b\3\2\2\2\u044d\u0450\3\2\2"+
		"\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u00c7\3\2\2\2\u0450\u044e"+
		"\3\2\2\2\u0451\u0453\5\u00caf\2\u0452\u0451\3\2\2\2\u0453\u0454\3\2\2"+
		"\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0459\3\2\2\2\u0456\u0458"+
		"\5\u00a6T\2\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2"+
		"\2\u0459\u045a\3\2\2\2\u045a\u00c9\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d"+
		"\7\t\2\2\u045d\u045e\5\u00dan\2\u045e\u045f\7M\2\2\u045f\u0467\3\2\2\2"+
		"\u0460\u0461\7\t\2\2\u0461\u0462\5f\64\2\u0462\u0463\7M\2\2\u0463\u0467"+
		"\3\2\2\2\u0464\u0465\7\17\2\2\u0465\u0467\7M\2\2\u0466\u045c\3\2\2\2\u0466"+
		"\u0460\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u00cb\3\2\2\2\u0468\u0475\5\u00d0"+
		"i\2\u0469\u046b\5\u00ceh\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046e\7D\2\2\u046d\u046f\5\u00dco\2\u046e\u046d\3"+
		"\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\7D\2\2\u0471"+
		"\u0473\5\u00d2j\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475"+
		"\3\2\2\2\u0474\u0468\3\2\2\2\u0474\u046a\3\2\2\2\u0475\u00cd\3\2\2\2\u0476"+
		"\u0479\5\u00aaV\2\u0477\u0479\5\u00d6l\2\u0478\u0476\3\2\2\2\u0478\u0477"+
		"\3\2\2\2\u0479\u00cf\3\2\2\2\u047a\u047b\5\u00acW\2\u047b\u047c\5j\66"+
		"\2\u047c\u047d\7i\2\2\u047d\u047e\7M\2\2\u047e\u047f\5\u00dco\2\u047f"+
		"\u00d1\3\2\2\2\u0480\u0481\5\u00d6l\2\u0481\u00d3\3\2\2\2\u0482\u0483"+
		"\7>\2\2\u0483\u0484\5\u00dco\2\u0484\u0485\7?\2\2\u0485\u00d5\3\2\2\2"+
		"\u0486\u048b\5\u00dco\2\u0487\u0488\7E\2\2\u0488\u048a\5\u00dco\2\u0489"+
		"\u0487\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2"+
		"\2\2\u048c\u00d7\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u048f\5\u00dco\2\u048f"+
		"\u00d9\3\2\2\2\u0490\u0491\5\u00dco\2\u0491\u00db\3\2\2\2\u0492\u0496"+
		"\5\u00e0q\2\u0493\u0494\5\u00dep\2\u0494\u0495\5\u00dco\2\u0495\u0497"+
		"\3\2\2\2\u0496\u0493\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u00dd\3\2\2\2\u0498"+
		"\u0499\t\7\2\2\u0499\u00df\3\2\2\2\u049a\u04a0\5\u00e2r\2\u049b\u049c"+
		"\7L\2\2\u049c\u049d\5\u00dco\2\u049d\u049e\7M\2\2\u049e\u049f\5\u00e0"+
		"q\2\u049f\u04a1\3\2\2\2\u04a0\u049b\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u00e1\3\2\2\2\u04a2\u04a7\5\u00e4s\2\u04a3\u04a4\7S\2\2\u04a4\u04a6\5"+
		"\u00e4s\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2"+
		"\u04a7\u04a8\3\2\2\2\u04a8\u00e3\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04af"+
		"\5\u00e6t\2\u04ab\u04ac\7R\2\2\u04ac\u04ae\5\u00e6t\2\u04ad\u04ab\3\2"+
		"\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u00e5\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b7\5\u00e8u\2\u04b3\u04b4"+
		"\7[\2\2\u04b4\u04b6\5\u00e8u\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2"+
		"\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u00e7\3\2\2\2\u04b9\u04b7"+
		"\3\2\2\2\u04ba\u04bf\5\u00eav\2\u04bb\u04bc\7\\\2\2\u04bc\u04be\5\u00ea"+
		"v\2\u04bd\u04bb\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u00e9\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c7\5\u00ec"+
		"w\2\u04c3\u04c4\7Z\2\2\u04c4\u04c6\5\u00ecw\2\u04c5\u04c3\3\2\2\2\u04c6"+
		"\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u00eb\3\2"+
		"\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04cf\5\u00eex\2\u04cb\u04cc\t\b\2\2\u04cc"+
		"\u04ce\5\u00eex\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u00ed\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2"+
		"\u04d5\5\u00f0y\2\u04d3\u04d4\7\35\2\2\u04d4\u04d6\5j\66\2\u04d5\u04d3"+
		"\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u00ef\3\2\2\2\u04d7\u04dd\5\u00f4{"+
		"\2\u04d8\u04d9\5\u00f2z\2\u04d9\u04da\5\u00f4{\2\u04da\u04dc\3\2\2\2\u04db"+
		"\u04d8\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2"+
		"\2\2\u04de\u00f1\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e1\t\t\2\2\u04e1"+
		"\u00f3\3\2\2\2\u04e2\u04e8\5\u00f8}\2\u04e3\u04e4\5\u00f6|\2\u04e4\u04e5"+
		"\5\u00f8}\2\u04e5\u04e7\3\2\2\2\u04e6\u04e3\3\2\2\2\u04e7\u04ea\3\2\2"+
		"\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00f5\3\2\2\2\u04ea\u04e8"+
		"\3\2\2\2\u04eb\u04ec\7I\2\2\u04ec\u04f3\7I\2\2\u04ed\u04ee\7H\2\2\u04ee"+
		"\u04ef\7H\2\2\u04ef\u04f3\7H\2\2\u04f0\u04f1\7H\2\2\u04f1\u04f3\7H\2\2"+
		"\u04f2\u04eb\3\2\2\2\u04f2\u04ed\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u00f7"+
		"\3\2\2\2\u04f4\u04fa\5\u00fc\177\2\u04f5\u04f6\5\u00fa~\2\u04f6\u04f7"+
		"\5\u00fc\177\2\u04f7\u04f9\3\2\2\2\u04f8\u04f5\3\2\2\2\u04f9\u04fc\3\2"+
		"\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00f9\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fd\u04fe\t\n\2\2\u04fe\u00fb\3\2\2\2\u04ff\u0505\5\u0100"+
		"\u0081\2\u0500\u0501\5\u00fe\u0080\2\u0501\u0502\5\u0100\u0081\2\u0502"+
		"\u0504\3\2\2\2\u0503\u0500\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2"+
		"\2\2\u0505\u0506\3\2\2\2\u0506\u00fd\3\2\2\2\u0507\u0505\3\2\2\2\u0508"+
		"\u0509\t\13\2\2\u0509\u00ff\3\2\2\2\u050a\u050b\t\f\2\2\u050b\u050e\5"+
		"\u0100\u0081\2\u050c\u050e\5\u0102\u0082\2\u050d\u050a\3\2\2\2\u050d\u050c"+
		"\3\2\2\2\u050e\u0101\3\2\2\2\u050f\u0510\7K\2\2\u0510\u051f\5\u0100\u0081"+
		"\2\u0511\u0512\7J\2\2\u0512\u051f\5\u0100\u0081\2\u0513\u051f\5\u0104"+
		"\u0083\2\u0514\u0518\5\u0106\u0084\2\u0515\u0517\5\u011c\u008f\2\u0516"+
		"\u0515\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2"+
		"\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051d\t\r\2\2\u051c"+
		"\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e\u050f\3\2"+
		"\2\2\u051e\u0511\3\2\2\2\u051e\u0513\3\2\2\2\u051e\u0514\3\2\2\2\u051f"+
		"\u0103\3\2\2\2\u0520\u0521\7>\2\2\u0521\u0522\5n8\2\u0522\u0523\7?\2\2"+
		"\u0523\u0524\5\u0100\u0081\2\u0524\u052e\3\2\2\2\u0525\u0528\7>\2\2\u0526"+
		"\u0529\5j\66\2\u0527\u0529\5\u00dco\2\u0528\u0526\3\2\2\2\u0528\u0527"+
		"\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\7?\2\2\u052b\u052c\5\u0102\u0082"+
		"\2\u052c\u052e\3\2\2\2\u052d\u0520\3\2\2\2\u052d\u0525\3\2\2\2\u052e\u0105"+
		"\3\2\2\2\u052f\u0559\5\u00d4k\2\u0530\u0532\7.\2\2\u0531\u0533\5\u0122"+
		"\u0092\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0559\3\2\2\2\u0534"+
		"\u0535\7+\2\2\u0535\u0559\5\u011e\u0090\2\u0536\u0559\5\u0084C\2\u0537"+
		"\u0538\7\"\2\2\u0538\u0559\5\u010a\u0086\2\u0539\u053d\5\u0116\u008c\2"+
		"\u053a\u053e\5\u0120\u0091\2\u053b\u053c\7.\2\2\u053c\u053e\5\u0122\u0092"+
		"\2\u053d\u053a\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u0559\3\2\2\2\u053f\u0544"+
		"\7i\2\2\u0540\u0541\7F\2\2\u0541\u0543\7i\2\2\u0542\u0540\3\2\2\2\u0543"+
		"\u0546\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0548\3\2"+
		"\2\2\u0546\u0544\3\2\2\2\u0547\u0549\5\u0108\u0085\2\u0548\u0547\3\2\2"+
		"\2\u0548\u0549\3\2\2\2\u0549\u0559\3\2\2\2\u054a\u054f\5n8\2\u054b\u054c"+
		"\7B\2\2\u054c\u054e\7C\2\2\u054d\u054b\3\2\2\2\u054e\u0551\3\2\2\2\u054f"+
		"\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\3\2\2\2\u0551\u054f\3\2"+
		"\2\2\u0552\u0553\7F\2\2\u0553\u0554\7\f\2\2\u0554\u0559\3\2\2\2\u0555"+
		"\u0556\7\63\2\2\u0556\u0557\7F\2\2\u0557\u0559\7\f\2\2\u0558\u052f\3\2"+
		"\2\2\u0558\u0530\3\2\2\2\u0558\u0534\3\2\2\2\u0558\u0536\3\2\2\2\u0558"+
		"\u0537\3\2\2\2\u0558\u0539\3\2\2\2\u0558\u053f\3\2\2\2\u0558\u054a\3\2"+
		"\2\2\u0558\u0555\3\2\2\2\u0559\u0107\3\2\2\2\u055a\u055b\7B\2\2\u055b"+
		"\u055d\7C\2\2\u055c\u055a\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055c\3\2"+
		"\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\7F\2\2\u0561"+
		"\u0577\7\f\2\2\u0562\u0563\7B\2\2\u0563\u0564\5\u00dco\2\u0564\u0565\7"+
		"C\2\2\u0565\u0577\3\2\2\2\u0566\u0577\5\u0122\u0092\2\u0567\u0568\7F\2"+
		"\2\u0568\u0577\7\f\2\2\u0569\u056a\7F\2\2\u056a\u0577\5\u0114\u008b\2"+
		"\u056b\u056c\7F\2\2\u056c\u0577\7.\2\2\u056d\u056e\7F\2\2\u056e\u056f"+
		"\7+\2\2\u056f\u0577\5\u0122\u0092\2\u0570\u0571\7F\2\2\u0571\u0573\7\""+
		"\2\2\u0572\u0574\5\u0116\u008c\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u0577\5\u010e\u0088\2\u0576\u055c\3\2\2\2"+
		"\u0576\u0562\3\2\2\2\u0576\u0566\3\2\2\2\u0576\u0567\3\2\2\2\u0576\u0569"+
		"\3\2\2\2\u0576\u056b\3\2\2\2\u0576\u056d\3\2\2\2\u0576\u0570\3\2\2\2\u0577"+
		"\u0109\3\2\2\2\u0578\u0579\5\u0116\u008c\2\u0579\u057a\5\u010c\u0087\2"+
		"\u057a\u057b\5\u0112\u008a\2\u057b\u0582\3\2\2\2\u057c\u057f\5\u010c\u0087"+
		"\2\u057d\u0580\5\u0110\u0089\2\u057e\u0580\5\u0112\u008a\2\u057f\u057d"+
		"\3\2\2\2\u057f\u057e\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u0578\3\2\2\2\u0581"+
		"\u057c\3\2\2\2\u0582\u010b\3\2\2\2\u0583\u0585\7i\2\2\u0584\u0586\5\u0118"+
		"\u008d\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u058e\3\2\2\2\u0587"+
		"\u0588\7F\2\2\u0588\u058a\7i\2\2\u0589\u058b\5\u0118\u008d\2\u058a\u0589"+
		"\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u0587\3\2\2\2\u058d"+
		"\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0593\3\2"+
		"\2\2\u0590\u058e\3\2\2\2\u0591\u0593\5n8\2\u0592\u0583\3\2\2\2\u0592\u0591"+
		"\3\2\2\2\u0593\u010d\3\2\2\2\u0594\u0596\7i\2\2\u0595\u0597\5\u011a\u008e"+
		"\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599"+
		"\5\u0112\u008a\2\u0599\u010f\3\2\2\2\u059a\u05b6\7B\2\2\u059b\u05a0\7"+
		"C\2\2\u059c\u059d\7B\2\2\u059d\u059f\7C\2\2\u059e\u059c\3\2\2\2\u059f"+
		"\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2"+
		"\2\2\u05a2\u05a0\3\2\2\2\u05a3\u05b7\5`\61\2\u05a4\u05a5\5\u00dco\2\u05a5"+
		"\u05ac\7C\2\2\u05a6\u05a7\7B\2\2\u05a7\u05a8\5\u00dco\2\u05a8\u05a9\7"+
		"C\2\2\u05a9\u05ab\3\2\2\2\u05aa\u05a6\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac"+
		"\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05b3\3\2\2\2\u05ae\u05ac\3\2"+
		"\2\2\u05af\u05b0\7B\2\2\u05b0\u05b2\7C\2\2\u05b1\u05af\3\2\2\2\u05b2\u05b5"+
		"\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b7\3\2\2\2\u05b5"+
		"\u05b3\3\2\2\2\u05b6\u059b\3\2\2\2\u05b6\u05a4\3\2\2\2\u05b7\u0111\3\2"+
		"\2\2\u05b8\u05ba\5\u0122\u0092\2\u05b9\u05bb\5,\27\2\u05ba\u05b9\3\2\2"+
		"\2\u05ba\u05bb\3\2\2\2\u05bb\u0113\3\2\2\2\u05bc\u05bd\5\u0116\u008c\2"+
		"\u05bd\u05be\5\u0120\u0091\2\u05be\u0115\3\2\2\2\u05bf\u05c0\7I\2\2\u05c0"+
		"\u05c1\5*\26\2\u05c1\u05c2\7H\2\2\u05c2\u0117\3\2\2\2\u05c3\u05c4\7I\2"+
		"\2\u05c4\u05c7\7H\2\2\u05c5\u05c7\5r:\2\u05c6\u05c3\3\2\2\2\u05c6\u05c5"+
		"\3\2\2\2\u05c7\u0119\3\2\2\2\u05c8\u05c9\7I\2\2\u05c9\u05cc\7H\2\2\u05ca"+
		"\u05cc\5\u0116\u008c\2\u05cb\u05c8\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc\u011b"+
		"\3\2\2\2\u05cd\u05ce\7F\2\2\u05ce\u05d0\7i\2\2\u05cf\u05d1\5\u0122\u0092"+
		"\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05e4\3\2\2\2\u05d2\u05d3"+
		"\7F\2\2\u05d3\u05e4\5\u0114\u008b\2\u05d4\u05d5\7F\2\2\u05d5\u05e4\7."+
		"\2\2\u05d6\u05d7\7F\2\2\u05d7\u05d8\7+\2\2\u05d8\u05e4\5\u011e\u0090\2"+
		"\u05d9\u05da\7F\2\2\u05da\u05dc\7\"\2\2\u05db\u05dd\5\u0116\u008c\2\u05dc"+
		"\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e4\5\u010e"+
		"\u0088\2\u05df\u05e0\7B\2\2\u05e0\u05e1\5\u00dco\2\u05e1\u05e2\7C\2\2"+
		"\u05e2\u05e4\3\2\2\2\u05e3\u05cd\3\2\2\2\u05e3\u05d2\3\2\2\2\u05e3\u05d4"+
		"\3\2\2\2\u05e3\u05d6\3\2\2\2\u05e3\u05d9\3\2\2\2\u05e3\u05df\3\2\2\2\u05e4"+
		"\u011d\3\2\2\2\u05e5\u05ec\5\u0122\u0092\2\u05e6\u05e7\7F\2\2\u05e7\u05e9"+
		"\7i\2\2\u05e8\u05ea\5\u0122\u0092\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3"+
		"\2\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05e5\3\2\2\2\u05eb\u05e6\3\2\2\2\u05ec"+
		"\u011f\3\2\2\2\u05ed\u05ee\7+\2\2\u05ee\u05f2\5\u011e\u0090\2\u05ef\u05f0"+
		"\7i\2\2\u05f0\u05f2\5\u0122\u0092\2\u05f1\u05ed\3\2\2\2\u05f1\u05ef\3"+
		"\2\2\2\u05f2\u0121\3\2\2\2\u05f3\u05f5\7>\2\2\u05f4\u05f6\5\u00d6l\2\u05f5"+
		"\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\7?"+
		"\2\2\u05f8\u0123\3\2\2\2\u00b3\u0129\u012f\u0136\u0139\u013e\u0143\u0149"+
		"\u014d\u0155\u015a\u0160\u0165\u016a\u016f\u0174\u0179\u017e\u0182\u0186"+
		"\u0190\u0198\u019f\u01a6\u01ac\u01af\u01b2\u01bb\u01bf\u01c3\u01c6\u01cc"+
		"\u01d1\u01d6\u01da\u01e3\u01ea\u01f3\u01fa\u0200\u020b\u0210\u0217\u021d"+
		"\u0229\u0232\u023c\u0243\u0248\u024c\u0251\u0255\u025c\u0261\u0268\u0270"+
		"\u0277\u0283\u0289\u0290\u0297\u02a2\u02a7\u02af\u02b3\u02b5\u02bb\u02c8"+
		"\u02d0\u02d3\u02d7\u02dc\u02e0\u02e7\u02ef\u02f8\u02fa\u0301\u0306\u0311"+
		"\u0315\u0320\u0328\u032f\u0332\u0339\u0341\u034b\u0353\u0356\u0359\u0366"+
		"\u036f\u0377\u037b\u037f\u0383\u0385\u0389\u038f\u039a\u03a2\u03ae\u03b6"+
		"\u03bf\u03d5\u03d8\u03de\u03e1\u03ef\u03f8\u03fd\u0408\u040c\u041d\u042c"+
		"\u0435\u043e\u044e\u0454\u0459\u0466\u046a\u046e\u0472\u0474\u0478\u048b"+
		"\u0496\u04a0\u04a7\u04af\u04b7\u04bf\u04c7\u04cf\u04d5\u04dd\u04e8\u04f2"+
		"\u04fa\u0505\u050d\u0518\u051c\u051e\u0528\u052d\u0532\u053d\u0544\u0548"+
		"\u054f\u0558\u055e\u0573\u0576\u057f\u0581\u0585\u058a\u058e\u0592\u0596"+
		"\u05a0\u05ac\u05b3\u05b6\u05ba\u05c6\u05cb\u05d0\u05dc\u05e3\u05e9\u05eb"+
		"\u05f1\u05f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}