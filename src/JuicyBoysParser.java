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
		RULE_compilationUnit = 0, RULE_modifiers = 1, RULE_classDeclaration = 2, 
		RULE_normalClassDeclaration = 3, RULE_classBody = 4, RULE_classBodyDeclaration = 5, 
		RULE_memberDecl = 6, RULE_memberDeclaration = 7, RULE_methodDeclaration = 8, 
		RULE_fieldDeclaration = 9, RULE_methodDeclaratorRest = 10, RULE_voidMethodDeclaratorRest = 11, 
		RULE_voidInterfaceMethodDeclaratorRest = 12, RULE_constructorDeclaratorRest = 13, 
		RULE_constantDeclarator = 14, RULE_variableDeclarators = 15, RULE_variableDeclarator = 16, 
		RULE_constantDeclaratorsRest = 17, RULE_constantDeclaratorRest = 18, RULE_variableDeclaratorId = 19, 
		RULE_variableInitializer = 20, RULE_arrayInitializer = 21, RULE_modifier = 22, 
		RULE_type = 23, RULE_primitiveType = 24, RULE_variableModifier = 25, RULE_qualifiedNameList = 26, 
		RULE_formalParameters = 27, RULE_formalParameterDecls = 28, RULE_formalParameterDeclsRest = 29, 
		RULE_methodBody = 30, RULE_constructorBody = 31, RULE_qualifiedName = 32, 
		RULE_literal = 33, RULE_elementValuePairs = 34, RULE_elementValuePair = 35, 
		RULE_elementValue = 36, RULE_elementValueArrayInitializer = 37, RULE_defaultValue = 38, 
		RULE_block = 39, RULE_blockStatement = 40, RULE_localVariableDeclarationStatement = 41, 
		RULE_localVariableDeclaration = 42, RULE_variableModifiers = 43, RULE_statement = 44, 
		RULE_ioStatement = 45, RULE_input_statement = 46, RULE_output_statement = 47, 
		RULE_catches = 48, RULE_catchClause = 49, RULE_catchType = 50, RULE_finallyBlock = 51, 
		RULE_formalParameter = 52, RULE_switchBlockStatementGroups = 53, RULE_switchBlockStatementGroup = 54, 
		RULE_switchLabel = 55, RULE_forControl = 56, RULE_forInit = 57, RULE_enhancedForControl = 58, 
		RULE_forUpdate = 59, RULE_parExpression = 60, RULE_expressionList = 61, 
		RULE_statementExpression = 62, RULE_constantExpression = 63, RULE_expression = 64, 
		RULE_assignmentOperator = 65, RULE_conditionalExpression = 66, RULE_conditionalOrExpression = 67, 
		RULE_conditionalAndExpression = 68, RULE_inclusiveOrExpression = 69, RULE_exclusiveOrExpression = 70, 
		RULE_andExpression = 71, RULE_equalityExpression = 72, RULE_instanceOfExpression = 73, 
		RULE_relationalExpression = 74, RULE_relationalOp = 75, RULE_shiftExpression = 76, 
		RULE_shiftOp = 77, RULE_additiveExpression = 78, RULE_addORsub = 79, RULE_multiplicativeExpression = 80, 
		RULE_mulORdivORmod = 81, RULE_unaryExpression = 82, RULE_unaryExpressionNotPlusMinus = 83, 
		RULE_castExpression = 84, RULE_primary = 85, RULE_identifierSuffix = 86, 
		RULE_arrayCreatorRest = 87, RULE_classCreatorRest = 88, RULE_selector = 89, 
		RULE_superSuffix = 90, RULE_explicitGenericInvocationSuffix = 91, RULE_arguments = 92;
	public static final String[] ruleNames = {
		"compilationUnit", "modifiers", "classDeclaration", "normalClassDeclaration", 
		"classBody", "classBodyDeclaration", "memberDecl", "memberDeclaration", 
		"methodDeclaration", "fieldDeclaration", "methodDeclaratorRest", "voidMethodDeclaratorRest", 
		"voidInterfaceMethodDeclaratorRest", "constructorDeclaratorRest", "constantDeclarator", 
		"variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
		"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "modifier", "type", "primitiveType", "variableModifier", 
		"qualifiedNameList", "formalParameters", "formalParameterDecls", "formalParameterDeclsRest", 
		"methodBody", "constructorBody", "qualifiedName", "literal", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "defaultValue", 
		"block", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"variableModifiers", "statement", "ioStatement", "input_statement", "output_statement", 
		"catches", "catchClause", "catchType", "finallyBlock", "formalParameter", 
		"switchBlockStatementGroups", "switchBlockStatementGroup", "switchLabel", 
		"forControl", "forInit", "enhancedForControl", "forUpdate", "parExpression", 
		"expressionList", "statementExpression", "constantExpression", "expression", 
		"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "addORsub", 
		"multiplicativeExpression", "mulORdivORmod", "unaryExpression", "unaryExpressionNotPlusMinus", 
		"castExpression", "primary", "identifierSuffix", "arrayCreatorRest", "classCreatorRest", 
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
		public TerminalNode EOF() { return getToken(JuicyBoysParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(186);
				classDeclaration();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				{
				setState(194);
				modifier();
				}
				}
				setState(199);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			normalClassDeclaration();
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
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(CLASS);
			setState(203);
			match(Identifier);
			setState(204);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LBRACE);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || _la==SEMI || _la==Identifier) {
				{
				{
				setState(207);
				classBodyDeclaration();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(216);
					match(STATIC);
					}
				}

				setState(219);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				modifiers();
				setState(221);
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
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberDecl);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				memberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(VOID);
				setState(227);
				match(Identifier);
				setState(228);
				voidMethodDeclaratorRest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(Identifier);
				setState(230);
				constructorDeclaratorRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
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
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			type();
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(235);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(236);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(Identifier);
			setState(240);
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
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			variableDeclarators();
			setState(243);
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
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			formalParameters();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(246);
				match(LBRACK);
				setState(247);
				match(RBRACK);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(253);
				match(THROWS);
				setState(254);
				qualifiedNameList();
				}
			}

			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(257);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(258);
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
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			formalParameters();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(262);
				match(THROWS);
				setState(263);
				qualifiedNameList();
				}
			}

			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(266);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(267);
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
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			formalParameters();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(271);
				match(THROWS);
				setState(272);
				qualifiedNameList();
				}
			}

			setState(275);
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
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			formalParameters();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(278);
				match(THROWS);
				setState(279);
				qualifiedNameList();
				}
			}

			setState(282);
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
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Identifier);
			setState(285);
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
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			variableDeclarator();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				variableDeclarator();
				}
				}
				setState(294);
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
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			variableDeclaratorId();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(296);
				match(ASSIGN);
				setState(297);
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
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			constantDeclaratorRest();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(302);
				constantDeclarator();
				}
				}
				setState(307);
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
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(308);
				match(LBRACK);
				setState(309);
				match(RBRACK);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(ASSIGN);
			setState(316);
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
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Identifier);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(319);
				match(LBRACK);
				setState(320);
				match(RBRACK);
				}
				}
				setState(325);
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableInitializer);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
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
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LBRACE);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
				{
				setState(331);
				variableInitializer();
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(COMMA);
						setState(333);
						variableInitializer();
						}
						} 
					}
					setState(338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(339);
					match(COMMA);
					}
				}

				}
			}

			setState(344);
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
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case RPAREN:
			case RBRACE:
			case RBRACK:
			case SEMI:
			case COMMA:
			case ASSIGN:
			case QUESTION:
			case COLON:
			case EQUAL:
			case NOTEQUAL:
			case AND:
			case OR:
			case BITAND:
			case BITOR:
			case CARET:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MUL_ASSIGN:
			case DIV_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case MOD_ASSIGN:
			case LSHIFT_ASSIGN:
			case RSHIFT_ASSIGN:
			case URSHIFT_ASSIGN:
			case Identifier:
			case ELLIPSIS:
				enterOuterAlt(_localctx, 1);
				{
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
				setState(349);
				primitiveType();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(350);
					match(LBRACK);
					setState(351);
					match(RBRACK);
					}
					}
					setState(356);
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
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(FINAL);
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
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			qualifiedName();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				qualifiedName();
				}
				}
				setState(370);
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
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(LPAREN);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==ELLIPSIS) {
				{
				setState(372);
				formalParameterDecls();
				}
			}

			setState(375);
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
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			variableModifiers();
			setState(378);
			type();
			setState(379);
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
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				variableDeclaratorId();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(382);
					match(COMMA);
					setState(383);
					formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(ELLIPSIS);
				setState(387);
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(Identifier);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(395);
				match(DOT);
				setState(396);
				match(Identifier);
				}
				}
				setState(401);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
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
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			elementValuePair();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				setState(406);
				elementValuePair();
				}
				}
				setState(411);
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
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(Identifier);
			setState(413);
			match(ASSIGN);
			setState(414);
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
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elementValue);
		try {
			setState(418);
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
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				conditionalExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
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
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LBRACE);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
				{
				setState(421);
				elementValue();
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(422);
						match(COMMA);
						setState(423);
						elementValue();
						}
						} 
					}
					setState(428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(431);
				match(COMMA);
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
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(DEFAULT);
			setState(437);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(LBRACE);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OUTPUT) | (1L << INPUT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(440);
				blockStatement();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_blockStatement);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
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
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			localVariableDeclaration();
			setState(453);
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
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			variableModifiers();
			setState(456);
			type();
			setState(457);
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
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(459);
				variableModifier();
				}
				}
				setState(464);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HashtagForStatementContext extends StatementContext {
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public HashtagForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagForStatement(this);
		}
	}
	public static class HashtagStatementExpressionStatementContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public HashtagStatementExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagStatementExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagStatementExpressionStatement(this);
		}
	}
	public static class HashtagTerminateStatementContext extends StatementContext {
		public HashtagTerminateStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagTerminateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagTerminateStatement(this);
		}
	}
	public static class HashtagIfStatementContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public HashtagIfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagIfStatement(this);
		}
	}
	public static class HashtagSwitchStatementContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public HashtagSwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagSwitchStatement(this);
		}
	}
	public static class HashtagContinueStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public HashtagContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagContinueStatement(this);
		}
	}
	public static class HashtagIOStatementContext extends StatementContext {
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public HashtagIOStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagIOStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagIOStatement(this);
		}
	}
	public static class HashtagAssertStatementContext extends StatementContext {
		public TerminalNode ASSERT() { return getToken(JuicyBoysParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HashtagAssertStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagAssertStatement(this);
		}
	}
	public static class HashtagReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HashtagReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagReturnStatement(this);
		}
	}
	public static class HashtagDoStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public HashtagDoStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagDoStatement(this);
		}
	}
	public static class HashtagWhileStatementContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public HashtagWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagWhileStatement(this);
		}
	}
	public static class HashtagBreakStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public HashtagBreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagBreakStatement(this);
		}
	}
	public static class HashtagIdentifierStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public HashtagIdentifierStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagIdentifierStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagIdentifierStatement(this);
		}
	}
	public static class HashtagBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public HashtagBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagBlock(this);
		}
	}
	public static class HashtagTryStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public HashtagTryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagTryStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new HashtagBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				block();
				}
				break;
			case 2:
				_localctx = new HashtagAssertStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(ASSERT);
				setState(467);
				expression();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(468);
					match(COLON);
					setState(469);
					expression();
					}
				}

				setState(472);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new HashtagIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(IF);
				setState(475);
				parExpression();
				setState(476);
				statement();
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(477);
					match(ELSE);
					setState(478);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new HashtagForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(FOR);
				setState(482);
				match(LPAREN);
				setState(483);
				forControl();
				setState(484);
				match(RPAREN);
				setState(485);
				statement();
				}
				break;
			case 5:
				_localctx = new HashtagWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				match(WHILE);
				setState(488);
				parExpression();
				setState(489);
				statement();
				}
				break;
			case 6:
				_localctx = new HashtagDoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(491);
				match(DO);
				setState(492);
				statement();
				setState(493);
				match(WHILE);
				setState(494);
				parExpression();
				setState(495);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new HashtagTryStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(497);
				match(TRY);
				setState(498);
				block();
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(499);
					catches();
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(500);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(503);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				_localctx = new HashtagSwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(506);
				match(SWITCH);
				setState(507);
				parExpression();
				setState(508);
				match(LBRACE);
				setState(509);
				switchBlockStatementGroups();
				setState(510);
				match(RBRACE);
				}
				break;
			case 9:
				_localctx = new HashtagReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(512);
				match(RETURN);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
					{
					setState(513);
					expression();
					}
				}

				setState(516);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new HashtagBreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(517);
				match(BREAK);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(518);
					match(Identifier);
					}
				}

				setState(521);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new HashtagContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(522);
				match(CONTINUE);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(523);
					match(Identifier);
					}
				}

				setState(526);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new HashtagTerminateStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(527);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new HashtagStatementExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(528);
				statementExpression();
				setState(529);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new HashtagIdentifierStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(531);
				match(Identifier);
				setState(532);
				match(COLON);
				setState(533);
				statement();
				}
				break;
			case 15:
				_localctx = new HashtagIOStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(534);
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
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ioStatement);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				input_statement();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
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
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_input_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(INPUT);
			setState(542);
			match(LPAREN);
			setState(543);
			match(Identifier);
			setState(544);
			match(RPAREN);
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
	}

	public final Output_statementContext output_statement() throws RecognitionException {
		Output_statementContext _localctx = new Output_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_output_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(OUTPUT);
			setState(548);
			match(LPAREN);
			setState(549);
			match(Identifier);
			setState(550);
			match(RPAREN);
			setState(551);
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
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(553);
				catchClause();
				}
				}
				setState(556); 
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(CATCH);
			setState(559);
			match(LPAREN);
			setState(560);
			variableModifiers();
			setState(561);
			catchType();
			setState(562);
			match(Identifier);
			setState(563);
			match(RPAREN);
			setState(564);
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
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			qualifiedName();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(567);
				match(BITOR);
				setState(568);
				qualifiedName();
				}
				}
				setState(573);
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
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(FINALLY);
			setState(575);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			variableModifiers();
			setState(578);
			type();
			setState(579);
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
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(581);
				switchBlockStatementGroup();
				}
				}
				setState(586);
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(587);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(590); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OUTPUT) | (1L << INPUT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(592);
				blockStatement();
				}
				}
				setState(597);
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
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switchLabel);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(CASE);
				setState(599);
				constantExpression();
				setState(600);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				match(DEFAULT);
				setState(603);
				match(COLON);
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
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forControl);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
					{
					setState(607);
					forInit();
					}
				}

				setState(610);
				match(SEMI);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
					{
					setState(611);
					expression();
					}
				}

				setState(614);
				match(SEMI);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
					{
					setState(615);
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forInit);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
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
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			variableModifiers();
			setState(625);
			type();
			setState(626);
			match(Identifier);
			setState(627);
			match(COLON);
			setState(628);
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
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(LPAREN);
			setState(633);
			expression();
			setState(634);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			expression();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				match(COMMA);
				setState(638);
				expression();
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
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			conditionalExpression();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (ASSIGN - 69)) | (1L << (ADD_ASSIGN - 69)) | (1L << (SUB_ASSIGN - 69)) | (1L << (MUL_ASSIGN - 69)) | (1L << (DIV_ASSIGN - 69)) | (1L << (AND_ASSIGN - 69)) | (1L << (OR_ASSIGN - 69)) | (1L << (XOR_ASSIGN - 69)) | (1L << (MOD_ASSIGN - 69)) | (1L << (LSHIFT_ASSIGN - 69)) | (1L << (RSHIFT_ASSIGN - 69)) | (1L << (URSHIFT_ASSIGN - 69)))) != 0)) {
				{
				setState(649);
				assignmentOperator();
				setState(650);
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
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			conditionalOrExpression();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(657);
				match(QUESTION);
				setState(658);
				expression();
				setState(659);
				match(COLON);
				setState(660);
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
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			conditionalAndExpression();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(665);
				match(OR);
				setState(666);
				conditionalAndExpression();
				}
				}
				setState(671);
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
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			inclusiveOrExpression();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(673);
				match(AND);
				setState(674);
				inclusiveOrExpression();
				}
				}
				setState(679);
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
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			exclusiveOrExpression();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(681);
				match(BITOR);
				setState(682);
				exclusiveOrExpression();
				}
				}
				setState(687);
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
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			andExpression();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(689);
				match(CARET);
				setState(690);
				andExpression();
				}
				}
				setState(695);
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
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			equalityExpression();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(697);
				match(BITAND);
				setState(698);
				equalityExpression();
				}
				}
				setState(703);
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
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			instanceOfExpression();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(706);
				instanceOfExpression();
				}
				}
				setState(711);
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
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			relationalExpression();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(713);
				match(INSTANCEOF);
				setState(714);
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
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			shiftExpression();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (GT - 70)) | (1L << (LT - 70)) | (1L << (LE - 70)) | (1L << (GE - 70)))) != 0)) {
				{
				{
				setState(718);
				relationalOp();
				setState(719);
				shiftExpression();
				}
				}
				setState(725);
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
		public TerminalNode LE() { return getToken(JuicyBoysParser.LE, 0); }
		public TerminalNode GE() { return getToken(JuicyBoysParser.GE, 0); }
		public TerminalNode LT() { return getToken(JuicyBoysParser.LT, 0); }
		public TerminalNode GT() { return getToken(JuicyBoysParser.GT, 0); }
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
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
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
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			additiveExpression();
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(729);
					shiftOp();
					setState(730);
					additiveExpression();
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_shiftOp);
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				((ShiftOpContext)_localctx).t1 = match(LT);
				setState(738);
				((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(740);
				((ShiftOpContext)_localctx).t2 = match(GT);
				setState(741);
				((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(743);
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			multiplicativeExpression();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(747);
				addORsub();
				setState(748);
				multiplicativeExpression();
				}
				}
				setState(754);
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
	}

	public final AddORsubContext addORsub() throws RecognitionException {
		AddORsubContext _localctx = new AddORsubContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_addORsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			unaryExpression();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MUL - 86)) | (1L << (DIV - 86)) | (1L << (MOD - 86)))) != 0)) {
				{
				{
				setState(758);
				mulORdivORmod();
				setState(759);
				unaryExpression();
				}
				}
				setState(765);
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
	}

	public final MulORdivORmodContext mulORdivORmod() throws RecognitionException {
		MulORdivORmodContext _localctx = new MulORdivORmodContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_mulORdivORmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_unaryExpression);
		int _la;
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (ADD - 82)) | (1L << (SUB - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(769);
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
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
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
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(TILDE);
				setState(774);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(BANG);
				setState(776);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				primary();
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(779);
					selector();
					}
					}
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(785);
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
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_castExpression);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(LPAREN);
				setState(791);
				primitiveType();
				setState(792);
				match(RPAREN);
				setState(793);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(LPAREN);
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(796);
					type();
					}
					break;
				case 2:
					{
					setState(797);
					expression();
					}
					break;
				}
				setState(800);
				match(RPAREN);
				setState(801);
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
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_primary);
		int _la;
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(THIS);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(807);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				match(SUPER);
				setState(811);
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
				setState(812);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(813);
				match(Identifier);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(814);
					match(DOT);
					setState(815);
					match(Identifier);
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(821);
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
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				primitiveType();
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(825);
					match(LBRACK);
					setState(826);
					match(RBRACK);
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(832);
				match(DOT);
				setState(833);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 7);
				{
				setState(835);
				match(VOID);
				setState(836);
				match(DOT);
				setState(837);
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
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_identifierSuffix);
		int _la;
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(840);
					match(LBRACK);
					setState(841);
					match(RBRACK);
					}
					}
					setState(844); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(846);
				match(DOT);
				setState(847);
				match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(LBRACK);
				setState(849);
				expression();
				setState(850);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				arguments();
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
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LBRACK);
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(856);
				match(RBRACK);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(857);
					match(LBRACK);
					setState(858);
					match(RBRACK);
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(864);
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
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(865);
				expression();
				setState(866);
				match(RBRACK);
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(867);
						match(LBRACK);
						setState(868);
						expression();
						setState(869);
						match(RBRACK);
						}
						} 
					}
					setState(875);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(876);
					match(LBRACK);
					setState(877);
					match(RBRACK);
					}
					}
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			arguments();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(886);
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

	public static class SelectorContext extends ParserRuleContext {
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
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(LBRACK);
			setState(890);
			expression();
			setState(891);
			match(RBRACK);
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
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_superSuffix);
		int _la;
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(DOT);
				setState(895);
				match(Identifier);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(896);
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
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_explicitGenericInvocationSuffix);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(SUPER);
				setState(902);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				match(Identifier);
				setState(904);
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(LPAREN);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)))) != 0)) {
				{
				setState(908);
				expressionList();
				}
			}

			setState(911);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u0394\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\7\2"+
		"\u00be\n\2\f\2\16\2\u00c1\13\2\3\2\3\2\3\3\7\3\u00c6\n\3\f\3\16\3\u00c9"+
		"\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u00d3\n\6\f\6\16\6\u00d6\13"+
		"\6\3\6\3\6\3\7\3\7\5\7\u00dc\n\7\3\7\3\7\3\7\3\7\5\7\u00e2\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00eb\n\b\3\t\3\t\3\t\5\t\u00f0\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00fb\n\f\f\f\16\f\u00fe\13\f\3\f\3"+
		"\f\5\f\u0102\n\f\3\f\3\f\5\f\u0106\n\f\3\r\3\r\3\r\5\r\u010b\n\r\3\r\3"+
		"\r\5\r\u010f\n\r\3\16\3\16\3\16\5\16\u0114\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\5\17\u011b\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0125"+
		"\n\21\f\21\16\21\u0128\13\21\3\22\3\22\3\22\5\22\u012d\n\22\3\23\3\23"+
		"\3\23\7\23\u0132\n\23\f\23\16\23\u0135\13\23\3\24\3\24\7\24\u0139\n\24"+
		"\f\24\16\24\u013c\13\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u0144\n\25"+
		"\f\25\16\25\u0147\13\25\3\26\3\26\5\26\u014b\n\26\3\27\3\27\3\27\3\27"+
		"\7\27\u0151\n\27\f\27\16\27\u0154\13\27\3\27\5\27\u0157\n\27\5\27\u0159"+
		"\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0163\n\31\f\31\16"+
		"\31\u0166\13\31\5\31\u0168\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34"+
		"\u0171\n\34\f\34\16\34\u0174\13\34\3\35\3\35\5\35\u0178\n\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0183\n\37\3\37\3\37\5\37\u0187"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u0190\n\"\f\"\16\"\u0193\13\"\3#\3#"+
		"\3$\3$\3$\7$\u019a\n$\f$\16$\u019d\13$\3%\3%\3%\3%\3&\3&\5&\u01a5\n&\3"+
		"\'\3\'\3\'\3\'\7\'\u01ab\n\'\f\'\16\'\u01ae\13\'\5\'\u01b0\n\'\3\'\5\'"+
		"\u01b3\n\'\3\'\3\'\3(\3(\3(\3)\3)\7)\u01bc\n)\f)\16)\u01bf\13)\3)\3)\3"+
		"*\3*\5*\u01c5\n*\3+\3+\3+\3,\3,\3,\3,\3-\7-\u01cf\n-\f-\16-\u01d2\13-"+
		"\3.\3.\3.\3.\3.\5.\u01d9\n.\3.\3.\3.\3.\3.\3.\3.\5.\u01e2\n.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01f8\n.\3.\5."+
		"\u01fb\n.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0205\n.\3.\3.\3.\5.\u020a\n.\3."+
		"\3.\3.\5.\u020f\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u021a\n.\3/\3/\5/\u021e"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\6"+
		"\62\u022d\n\62\r\62\16\62\u022e\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\7\64\u023c\n\64\f\64\16\64\u023f\13\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\7\67\u0249\n\67\f\67\16\67\u024c\13\67\38\6"+
		"8\u024f\n8\r8\168\u0250\38\78\u0254\n8\f8\168\u0257\138\39\39\39\39\3"+
		"9\39\59\u025f\n9\3:\3:\5:\u0263\n:\3:\3:\5:\u0267\n:\3:\3:\5:\u026b\n"+
		":\5:\u026d\n:\3;\3;\5;\u0271\n;\3<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3>\3>\3"+
		"?\3?\3?\7?\u0282\n?\f?\16?\u0285\13?\3@\3@\3A\3A\3B\3B\3B\3B\5B\u028f"+
		"\nB\3C\3C\3D\3D\3D\3D\3D\3D\5D\u0299\nD\3E\3E\3E\7E\u029e\nE\fE\16E\u02a1"+
		"\13E\3F\3F\3F\7F\u02a6\nF\fF\16F\u02a9\13F\3G\3G\3G\7G\u02ae\nG\fG\16"+
		"G\u02b1\13G\3H\3H\3H\7H\u02b6\nH\fH\16H\u02b9\13H\3I\3I\3I\7I\u02be\n"+
		"I\fI\16I\u02c1\13I\3J\3J\3J\7J\u02c6\nJ\fJ\16J\u02c9\13J\3K\3K\3K\5K\u02ce"+
		"\nK\3L\3L\3L\3L\7L\u02d4\nL\fL\16L\u02d7\13L\3M\3M\3N\3N\3N\3N\7N\u02df"+
		"\nN\fN\16N\u02e2\13N\3O\3O\3O\3O\3O\3O\3O\5O\u02eb\nO\3P\3P\3P\3P\7P\u02f1"+
		"\nP\fP\16P\u02f4\13P\3Q\3Q\3R\3R\3R\3R\7R\u02fc\nR\fR\16R\u02ff\13R\3"+
		"S\3S\3T\3T\3T\5T\u0306\nT\3U\3U\3U\3U\3U\3U\3U\7U\u030f\nU\fU\16U\u0312"+
		"\13U\3U\5U\u0315\nU\5U\u0317\nU\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0321\nV\3"+
		"V\3V\3V\5V\u0326\nV\3W\3W\3W\5W\u032b\nW\3W\3W\3W\3W\3W\3W\7W\u0333\n"+
		"W\fW\16W\u0336\13W\3W\5W\u0339\nW\3W\3W\3W\7W\u033e\nW\fW\16W\u0341\13"+
		"W\3W\3W\3W\3W\3W\3W\5W\u0349\nW\3X\3X\6X\u034d\nX\rX\16X\u034e\3X\3X\3"+
		"X\3X\3X\3X\3X\5X\u0358\nX\3Y\3Y\3Y\3Y\7Y\u035e\nY\fY\16Y\u0361\13Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u036a\nY\fY\16Y\u036d\13Y\3Y\3Y\7Y\u0371\nY\fY\16"+
		"Y\u0374\13Y\5Y\u0376\nY\3Z\3Z\5Z\u037a\nZ\3[\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\5\\\u0384\n\\\5\\\u0386\n\\\3]\3]\3]\3]\5]\u038c\n]\3^\3^\5^\u0390\n"+
		"^\3^\3^\3^\2\2_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\2\f\n\2\4\4\25\25!!$&)*--\61\61\64\64\13\2\3\3\6\6\b\b\13\13\21"+
		"\21\27\27\36\36  ((\3\28=\4\2GG^h\4\2NNQQ\4\2HIOP\3\2VW\4\2XY]]\3\2TW"+
		"\3\2TU\2\u03ae\2\u00bf\3\2\2\2\4\u00c7\3\2\2\2\6\u00ca\3\2\2\2\b\u00cc"+
		"\3\2\2\2\n\u00d0\3\2\2\2\f\u00e1\3\2\2\2\16\u00ea\3\2\2\2\20\u00ec\3\2"+
		"\2\2\22\u00f1\3\2\2\2\24\u00f4\3\2\2\2\26\u00f7\3\2\2\2\30\u0107\3\2\2"+
		"\2\32\u0110\3\2\2\2\34\u0117\3\2\2\2\36\u011e\3\2\2\2 \u0121\3\2\2\2\""+
		"\u0129\3\2\2\2$\u012e\3\2\2\2&\u013a\3\2\2\2(\u0140\3\2\2\2*\u014a\3\2"+
		"\2\2,\u014c\3\2\2\2.\u015c\3\2\2\2\60\u0167\3\2\2\2\62\u0169\3\2\2\2\64"+
		"\u016b\3\2\2\2\66\u016d\3\2\2\28\u0175\3\2\2\2:\u017b\3\2\2\2<\u0186\3"+
		"\2\2\2>\u0188\3\2\2\2@\u018a\3\2\2\2B\u018c\3\2\2\2D\u0194\3\2\2\2F\u0196"+
		"\3\2\2\2H\u019e\3\2\2\2J\u01a4\3\2\2\2L\u01a6\3\2\2\2N\u01b6\3\2\2\2P"+
		"\u01b9\3\2\2\2R\u01c4\3\2\2\2T\u01c6\3\2\2\2V\u01c9\3\2\2\2X\u01d0\3\2"+
		"\2\2Z\u0219\3\2\2\2\\\u021d\3\2\2\2^\u021f\3\2\2\2`\u0225\3\2\2\2b\u022c"+
		"\3\2\2\2d\u0230\3\2\2\2f\u0238\3\2\2\2h\u0240\3\2\2\2j\u0243\3\2\2\2l"+
		"\u024a\3\2\2\2n\u024e\3\2\2\2p\u025e\3\2\2\2r\u026c\3\2\2\2t\u0270\3\2"+
		"\2\2v\u0272\3\2\2\2x\u0278\3\2\2\2z\u027a\3\2\2\2|\u027e\3\2\2\2~\u0286"+
		"\3\2\2\2\u0080\u0288\3\2\2\2\u0082\u028a\3\2\2\2\u0084\u0290\3\2\2\2\u0086"+
		"\u0292\3\2\2\2\u0088\u029a\3\2\2\2\u008a\u02a2\3\2\2\2\u008c\u02aa\3\2"+
		"\2\2\u008e\u02b2\3\2\2\2\u0090\u02ba\3\2\2\2\u0092\u02c2\3\2\2\2\u0094"+
		"\u02ca\3\2\2\2\u0096\u02cf\3\2\2\2\u0098\u02d8\3\2\2\2\u009a\u02da\3\2"+
		"\2\2\u009c\u02ea\3\2\2\2\u009e\u02ec\3\2\2\2\u00a0\u02f5\3\2\2\2\u00a2"+
		"\u02f7\3\2\2\2\u00a4\u0300\3\2\2\2\u00a6\u0305\3\2\2\2\u00a8\u0316\3\2"+
		"\2\2\u00aa\u0325\3\2\2\2\u00ac\u0348\3\2\2\2\u00ae\u0357\3\2\2\2\u00b0"+
		"\u0359\3\2\2\2\u00b2\u0377\3\2\2\2\u00b4\u037b\3\2\2\2\u00b6\u0385\3\2"+
		"\2\2\u00b8\u038b\3\2\2\2\u00ba\u038d\3\2\2\2\u00bc\u00be\5\6\4\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\2\2\3\u00c3"+
		"\3\3\2\2\2\u00c4\u00c6\5.\30\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\5\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00ca\u00cb\5\b\5\2\u00cb\7\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce"+
		"\7i\2\2\u00ce\u00cf\5\n\6\2\u00cf\t\3\2\2\2\u00d0\u00d4\7@\2\2\u00d1\u00d3"+
		"\5\f\7\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7A"+
		"\2\2\u00d8\13\3\2\2\2\u00d9\u00e2\7D\2\2\u00da\u00dc\7)\2\2\u00db\u00da"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e2\5P)\2\u00de"+
		"\u00df\5\4\3\2\u00df\u00e0\5\16\b\2\u00e0\u00e2\3\2\2\2\u00e1\u00d9\3"+
		"\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\r\3\2\2\2\u00e3\u00eb"+
		"\5\20\t\2\u00e4\u00e5\7\63\2\2\u00e5\u00e6\7i\2\2\u00e6\u00eb\5\30\r\2"+
		"\u00e7\u00e8\7i\2\2\u00e8\u00eb\5\34\17\2\u00e9\u00eb\5\6\4\2\u00ea\u00e3"+
		"\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\17\3\2\2\2\u00ec\u00ef\5\60\31\2\u00ed\u00f0\5\22\n\2\u00ee\u00f0\5\24"+
		"\13\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\21\3\2\2\2\u00f1\u00f2"+
		"\7i\2\2\u00f2\u00f3\5\26\f\2\u00f3\23\3\2\2\2\u00f4\u00f5\5 \21\2\u00f5"+
		"\u00f6\7D\2\2\u00f6\25\3\2\2\2\u00f7\u00fc\58\35\2\u00f8\u00f9\7B\2\2"+
		"\u00f9\u00fb\7C\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\7\60\2\2\u0100\u0102\5\66\34\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0106\5> \2\u0104\u0106\7D\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\27\3\2\2\2\u0107\u010a\58\35"+
		"\2\u0108\u0109\7\60\2\2\u0109\u010b\5\66\34\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010f\5> \2\u010d\u010f\7D\2"+
		"\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\31\3\2\2\2\u0110\u0113"+
		"\58\35\2\u0111\u0112\7\60\2\2\u0112\u0114\5\66\34\2\u0113\u0111\3\2\2"+
		"\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7D\2\2\u0116\33"+
		"\3\2\2\2\u0117\u011a\58\35\2\u0118\u0119\7\60\2\2\u0119\u011b\5\66\34"+
		"\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\5@!\2\u011d\35\3\2\2\2\u011e\u011f\7i\2\2\u011f\u0120\5&\24\2\u0120\37"+
		"\3\2\2\2\u0121\u0126\5\"\22\2\u0122\u0123\7E\2\2\u0123\u0125\5\"\22\2"+
		"\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127!\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012c\5(\25\2\u012a"+
		"\u012b\7G\2\2\u012b\u012d\5*\26\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d#\3\2\2\2\u012e\u0133\5&\24\2\u012f\u0130\7E\2\2\u0130\u0132"+
		"\5\36\20\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134%\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7"+
		"B\2\2\u0137\u0139\7C\2\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013e\7G\2\2\u013e\u013f\5*\26\2\u013f\'\3\2\2\2\u0140\u0145"+
		"\7i\2\2\u0141\u0142\7B\2\2\u0142\u0144\7C\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146)\3\2\2\2"+
		"\u0147\u0145\3\2\2\2\u0148\u014b\5,\27\2\u0149\u014b\5\u0082B\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b+\3\2\2\2\u014c\u0158\7@\2\2\u014d"+
		"\u0152\5*\26\2\u014e\u014f\7E\2\2\u014f\u0151\5*\26\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\7E\2\2\u0156\u0155\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u014d\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7A\2\2\u015b-\3\2\2\2\u015c"+
		"\u015d\t\2\2\2\u015d/\3\2\2\2\u015e\u0168\3\2\2\2\u015f\u0164\5\62\32"+
		"\2\u0160\u0161\7B\2\2\u0161\u0163\7C\2\2\u0162\u0160\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u015f\3\2\2\2\u0168\61\3\2\2"+
		"\2\u0169\u016a\t\3\2\2\u016a\63\3\2\2\2\u016b\u016c\7\25\2\2\u016c\65"+
		"\3\2\2\2\u016d\u0172\5B\"\2\u016e\u016f\7E\2\2\u016f\u0171\5B\"\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\67\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\7>\2\2\u0176\u0178"+
		"\5:\36\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\7?\2\2\u017a9\3\2\2\2\u017b\u017c\5X-\2\u017c\u017d\5\60\31\2\u017d"+
		"\u017e\5<\37\2\u017e;\3\2\2\2\u017f\u0182\5(\25\2\u0180\u0181\7E\2\2\u0181"+
		"\u0183\5:\36\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0187\3\2"+
		"\2\2\u0184\u0185\7k\2\2\u0185\u0187\5(\25\2\u0186\u017f\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187=\3\2\2\2\u0188\u0189\5P)\2\u0189?\3\2\2\2\u018a\u018b"+
		"\5P)\2\u018bA\3\2\2\2\u018c\u0191\7i\2\2\u018d\u018e\7F\2\2\u018e\u0190"+
		"\7i\2\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192C\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\t\4\2\2"+
		"\u0195E\3\2\2\2\u0196\u019b\5H%\2\u0197\u0198\7E\2\2\u0198\u019a\5H%\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019cG\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7i\2\2\u019f\u01a0"+
		"\7G\2\2\u01a0\u01a1\5J&\2\u01a1I\3\2\2\2\u01a2\u01a5\5\u0086D\2\u01a3"+
		"\u01a5\5L\'\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5K\3\2\2\2\u01a6"+
		"\u01af\7@\2\2\u01a7\u01ac\5J&\2\u01a8\u01a9\7E\2\2\u01a9\u01ab\5J&\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01a7\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\7E\2\2\u01b2\u01b1\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7A\2\2\u01b5"+
		"M\3\2\2\2\u01b6\u01b7\7\17\2\2\u01b7\u01b8\5J&\2\u01b8O\3\2\2\2\u01b9"+
		"\u01bd\7@\2\2\u01ba\u01bc\5R*\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2"+
		"\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01c0\u01c1\7A\2\2\u01c1Q\3\2\2\2\u01c2\u01c5\5T+\2\u01c3\u01c5"+
		"\5Z.\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5S\3\2\2\2\u01c6\u01c7"+
		"\5V,\2\u01c7\u01c8\7D\2\2\u01c8U\3\2\2\2\u01c9\u01ca\5X-\2\u01ca\u01cb"+
		"\5\60\31\2\u01cb\u01cc\5 \21\2\u01ccW\3\2\2\2\u01cd\u01cf\5\64\33\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1Y\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u021a\5P)\2\u01d4\u01d5"+
		"\7\5\2\2\u01d5\u01d8\5\u0082B\2\u01d6\u01d7\7M\2\2\u01d7\u01d9\5\u0082"+
		"B\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\7D\2\2\u01db\u021a\3\2\2\2\u01dc\u01dd\7\31\2\2\u01dd\u01de\5z"+
		">\2\u01de\u01e1\5Z.\2\u01df\u01e0\7\22\2\2\u01e0\u01e2\5Z.\2\u01e1\u01df"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u021a\3\2\2\2\u01e3\u01e4\7\30\2\2"+
		"\u01e4\u01e5\7>\2\2\u01e5\u01e6\5r:\2\u01e6\u01e7\7?\2\2\u01e7\u01e8\5"+
		"Z.\2\u01e8\u021a\3\2\2\2\u01e9\u01ea\7\65\2\2\u01ea\u01eb\5z>\2\u01eb"+
		"\u01ec\5Z.\2\u01ec\u021a\3\2\2\2\u01ed\u01ee\7\20\2\2\u01ee\u01ef\5Z."+
		"\2\u01ef\u01f0\7\65\2\2\u01f0\u01f1\5z>\2\u01f1\u01f2\7D\2\2\u01f2\u021a"+
		"\3\2\2\2\u01f3\u01f4\7\62\2\2\u01f4\u01fa\5P)\2\u01f5\u01f7\5b\62\2\u01f6"+
		"\u01f8\5h\65\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fb\3\2"+
		"\2\2\u01f9\u01fb\5h\65\2\u01fa\u01f5\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u021a\3\2\2\2\u01fc\u01fd\7,\2\2\u01fd\u01fe\5z>\2\u01fe\u01ff\7@\2\2"+
		"\u01ff\u0200\5l\67\2\u0200\u0201\7A\2\2\u0201\u021a\3\2\2\2\u0202\u0204"+
		"\7\'\2\2\u0203\u0205\5\u0082B\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u021a\7D\2\2\u0207\u0209\7\7\2\2\u0208\u020a"+
		"\7i\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u021a\7D\2\2\u020c\u020e\7\16\2\2\u020d\u020f\7i\2\2\u020e\u020d\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u021a\7D\2\2\u0211"+
		"\u021a\7D\2\2\u0212\u0213\5~@\2\u0213\u0214\7D\2\2\u0214\u021a\3\2\2\2"+
		"\u0215\u0216\7i\2\2\u0216\u0217\7M\2\2\u0217\u021a\5Z.\2\u0218\u021a\5"+
		"\\/\2\u0219\u01d3\3\2\2\2\u0219\u01d4\3\2\2\2\u0219\u01dc\3\2\2\2\u0219"+
		"\u01e3\3\2\2\2\u0219\u01e9\3\2\2\2\u0219\u01ed\3\2\2\2\u0219\u01f3\3\2"+
		"\2\2\u0219\u01fc\3\2\2\2\u0219\u0202\3\2\2\2\u0219\u0207\3\2\2\2\u0219"+
		"\u020c\3\2\2\2\u0219\u0211\3\2\2\2\u0219\u0212\3\2\2\2\u0219\u0215\3\2"+
		"\2\2\u0219\u0218\3\2\2\2\u021a[\3\2\2\2\u021b\u021e\5^\60\2\u021c\u021e"+
		"\5`\61\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e]\3\2\2\2\u021f"+
		"\u0220\7\67\2\2\u0220\u0221\7>\2\2\u0221\u0222\7i\2\2\u0222\u0223\7?\2"+
		"\2\u0223\u0224\7D\2\2\u0224_\3\2\2\2\u0225\u0226\7\66\2\2\u0226\u0227"+
		"\7>\2\2\u0227\u0228\7i\2\2\u0228\u0229\7?\2\2\u0229\u022a\7D\2\2\u022a"+
		"a\3\2\2\2\u022b\u022d\5d\63\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022fc\3\2\2\2\u0230\u0231\7"+
		"\n\2\2\u0231\u0232\7>\2\2\u0232\u0233\5X-\2\u0233\u0234\5f\64\2\u0234"+
		"\u0235\7i\2\2\u0235\u0236\7?\2\2\u0236\u0237\5P)\2\u0237e\3\2\2\2\u0238"+
		"\u023d\5B\"\2\u0239\u023a\7[\2\2\u023a\u023c\5B\"\2\u023b\u0239\3\2\2"+
		"\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023eg"+
		"\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\7\26\2\2\u0241\u0242\5P)\2\u0242"+
		"i\3\2\2\2\u0243\u0244\5X-\2\u0244\u0245\5\60\31\2\u0245\u0246\5(\25\2"+
		"\u0246k\3\2\2\2\u0247\u0249\5n8\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024bm\3\2\2\2\u024c\u024a"+
		"\3\2\2\2\u024d\u024f\5p9\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0255\3\2\2\2\u0252\u0254\5R"+
		"*\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256o\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7\t\2\2"+
		"\u0259\u025a\5\u0080A\2\u025a\u025b\7M\2\2\u025b\u025f\3\2\2\2\u025c\u025d"+
		"\7\17\2\2\u025d\u025f\7M\2\2\u025e\u0258\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"q\3\2\2\2\u0260\u026d\5v<\2\u0261\u0263\5t;\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\7D\2\2\u0265\u0267\5\u0082"+
		"B\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026a\7D\2\2\u0269\u026b\5x=\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2"+
		"\2\u026b\u026d\3\2\2\2\u026c\u0260\3\2\2\2\u026c\u0262\3\2\2\2\u026ds"+
		"\3\2\2\2\u026e\u0271\5V,\2\u026f\u0271\5|?\2\u0270\u026e\3\2\2\2\u0270"+
		"\u026f\3\2\2\2\u0271u\3\2\2\2\u0272\u0273\5X-\2\u0273\u0274\5\60\31\2"+
		"\u0274\u0275\7i\2\2\u0275\u0276\7M\2\2\u0276\u0277\5\u0082B\2\u0277w\3"+
		"\2\2\2\u0278\u0279\5|?\2\u0279y\3\2\2\2\u027a\u027b\7>\2\2\u027b\u027c"+
		"\5\u0082B\2\u027c\u027d\7?\2\2\u027d{\3\2\2\2\u027e\u0283\5\u0082B\2\u027f"+
		"\u0280\7E\2\2\u0280\u0282\5\u0082B\2\u0281\u027f\3\2\2\2\u0282\u0285\3"+
		"\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284}\3\2\2\2\u0285\u0283"+
		"\3\2\2\2\u0286\u0287\5\u0082B\2\u0287\177\3\2\2\2\u0288\u0289\5\u0082"+
		"B\2\u0289\u0081\3\2\2\2\u028a\u028e\5\u0086D\2\u028b\u028c\5\u0084C\2"+
		"\u028c\u028d\5\u0082B\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0083\3\2\2\2\u0290\u0291\t\5\2\2\u0291\u0085\3\2"+
		"\2\2\u0292\u0298\5\u0088E\2\u0293\u0294\7L\2\2\u0294\u0295\5\u0082B\2"+
		"\u0295\u0296\7M\2\2\u0296\u0297\5\u0086D\2\u0297\u0299\3\2\2\2\u0298\u0293"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0087\3\2\2\2\u029a\u029f\5\u008aF"+
		"\2\u029b\u029c\7S\2\2\u029c\u029e\5\u008aF\2\u029d\u029b\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u0089\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a7\5\u008cG\2\u02a3\u02a4\7R\2\2\u02a4"+
		"\u02a6\5\u008cG\2\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u008b\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa"+
		"\u02af\5\u008eH\2\u02ab\u02ac\7[\2\2\u02ac\u02ae\5\u008eH\2\u02ad\u02ab"+
		"\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u008d\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b7\5\u0090I\2\u02b3\u02b4"+
		"\7\\\2\2\u02b4\u02b6\5\u0090I\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2\2"+
		"\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u008f\3\2\2\2\u02b9\u02b7"+
		"\3\2\2\2\u02ba\u02bf\5\u0092J\2\u02bb\u02bc\7Z\2\2\u02bc\u02be\5\u0092"+
		"J\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u0091\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c7\5\u0094"+
		"K\2\u02c3\u02c4\t\6\2\2\u02c4\u02c6\5\u0094K\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u0093\3\2"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\5\u0096L\2\u02cb\u02cc\7\35\2\2\u02cc"+
		"\u02ce\5\60\31\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u0095\3"+
		"\2\2\2\u02cf\u02d5\5\u009aN\2\u02d0\u02d1\5\u0098M\2\u02d1\u02d2\5\u009a"+
		"N\2\u02d2\u02d4\3\2\2\2\u02d3\u02d0\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u0097\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d8\u02d9\t\7\2\2\u02d9\u0099\3\2\2\2\u02da\u02e0\5\u009eP\2\u02db"+
		"\u02dc\5\u009cO\2\u02dc\u02dd\5\u009eP\2\u02dd\u02df\3\2\2\2\u02de\u02db"+
		"\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u009b\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7I\2\2\u02e4\u02eb\7I\2"+
		"\2\u02e5\u02e6\7H\2\2\u02e6\u02e7\7H\2\2\u02e7\u02eb\7H\2\2\u02e8\u02e9"+
		"\7H\2\2\u02e9\u02eb\7H\2\2\u02ea\u02e3\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02eb\u009d\3\2\2\2\u02ec\u02f2\5\u00a2R\2\u02ed\u02ee"+
		"\5\u00a0Q\2\u02ee\u02ef\5\u00a2R\2\u02ef\u02f1\3\2\2\2\u02f0\u02ed\3\2"+
		"\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u009f\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f6\t\b\2\2\u02f6\u00a1\3\2"+
		"\2\2\u02f7\u02fd\5\u00a6T\2\u02f8\u02f9\5\u00a4S\2\u02f9\u02fa\5\u00a6"+
		"T\2\u02fa\u02fc\3\2\2\2\u02fb\u02f8\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u00a3\3\2\2\2\u02ff\u02fd\3\2"+
		"\2\2\u0300\u0301\t\t\2\2\u0301\u00a5\3\2\2\2\u0302\u0303\t\n\2\2\u0303"+
		"\u0306\5\u00a6T\2\u0304\u0306\5\u00a8U\2\u0305\u0302\3\2\2\2\u0305\u0304"+
		"\3\2\2\2\u0306\u00a7\3\2\2\2\u0307\u0308\7K\2\2\u0308\u0317\5\u00a6T\2"+
		"\u0309\u030a\7J\2\2\u030a\u0317\5\u00a6T\2\u030b\u0317\5\u00aaV\2\u030c"+
		"\u0310\5\u00acW\2\u030d\u030f\5\u00b4[\2\u030e\u030d\3\2\2\2\u030f\u0312"+
		"\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\3\2\2\2\u0312"+
		"\u0310\3\2\2\2\u0313\u0315\t\13\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3"+
		"\2\2\2\u0315\u0317\3\2\2\2\u0316\u0307\3\2\2\2\u0316\u0309\3\2\2\2\u0316"+
		"\u030b\3\2\2\2\u0316\u030c\3\2\2\2\u0317\u00a9\3\2\2\2\u0318\u0319\7>"+
		"\2\2\u0319\u031a\5\62\32\2\u031a\u031b\7?\2\2\u031b\u031c\5\u00a6T\2\u031c"+
		"\u0326\3\2\2\2\u031d\u0320\7>\2\2\u031e\u0321\5\60\31\2\u031f\u0321\5"+
		"\u0082B\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u0322\3\2\2\2"+
		"\u0322\u0323\7?\2\2\u0323\u0324\5\u00a8U\2\u0324\u0326\3\2\2\2\u0325\u0318"+
		"\3\2\2\2\u0325\u031d\3\2\2\2\u0326\u00ab\3\2\2\2\u0327\u0349\5z>\2\u0328"+
		"\u032a\7.\2\2\u0329\u032b\5\u00ba^\2\u032a\u0329\3\2\2\2\u032a\u032b\3"+
		"\2\2\2\u032b\u0349\3\2\2\2\u032c\u032d\7+\2\2\u032d\u0349\5\u00b6\\\2"+
		"\u032e\u0349\5D#\2\u032f\u0334\7i\2\2\u0330\u0331\7F\2\2\u0331\u0333\7"+
		"i\2\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0339\5\u00ae"+
		"X\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0349\3\2\2\2\u033a"+
		"\u033f\5\62\32\2\u033b\u033c\7B\2\2\u033c\u033e\7C\2\2\u033d\u033b\3\2"+
		"\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\7F\2\2\u0343\u0344\7\f"+
		"\2\2\u0344\u0349\3\2\2\2\u0345\u0346\7\63\2\2\u0346\u0347\7F\2\2\u0347"+
		"\u0349\7\f\2\2\u0348\u0327\3\2\2\2\u0348\u0328\3\2\2\2\u0348\u032c\3\2"+
		"\2\2\u0348\u032e\3\2\2\2\u0348\u032f\3\2\2\2\u0348\u033a\3\2\2\2\u0348"+
		"\u0345\3\2\2\2\u0349\u00ad\3\2\2\2\u034a\u034b\7B\2\2\u034b\u034d\7C\2"+
		"\2\u034c\u034a\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f"+
		"\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\7F\2\2\u0351\u0358\7\f\2\2\u0352"+
		"\u0353\7B\2\2\u0353\u0354\5\u0082B\2\u0354\u0355\7C\2\2\u0355\u0358\3"+
		"\2\2\2\u0356\u0358\5\u00ba^\2\u0357\u034c\3\2\2\2\u0357\u0352\3\2\2\2"+
		"\u0357\u0356\3\2\2\2\u0358\u00af\3\2\2\2\u0359\u0375\7B\2\2\u035a\u035f"+
		"\7C\2\2\u035b\u035c\7B\2\2\u035c\u035e\7C\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0362\u0376\5,\27\2\u0363\u0364\5\u0082B\2\u0364"+
		"\u036b\7C\2\2\u0365\u0366\7B\2\2\u0366\u0367\5\u0082B\2\u0367\u0368\7"+
		"C\2\2\u0368\u036a\3\2\2\2\u0369\u0365\3\2\2\2\u036a\u036d\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0372\3\2\2\2\u036d\u036b\3\2"+
		"\2\2\u036e\u036f\7B\2\2\u036f\u0371\7C\2\2\u0370\u036e\3\2\2\2\u0371\u0374"+
		"\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0376\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0375\u035a\3\2\2\2\u0375\u0363\3\2\2\2\u0376\u00b1\3\2"+
		"\2\2\u0377\u0379\5\u00ba^\2\u0378\u037a\5\n\6\2\u0379\u0378\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037a\u00b3\3\2\2\2\u037b\u037c\7B\2\2\u037c\u037d\5\u0082"+
		"B\2\u037d\u037e\7C\2\2\u037e\u00b5\3\2\2\2\u037f\u0386\5\u00ba^\2\u0380"+
		"\u0381\7F\2\2\u0381\u0383\7i\2\2\u0382\u0384\5\u00ba^\2\u0383\u0382\3"+
		"\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u037f\3\2\2\2\u0385"+
		"\u0380\3\2\2\2\u0386\u00b7\3\2\2\2\u0387\u0388\7+\2\2\u0388\u038c\5\u00b6"+
		"\\\2\u0389\u038a\7i\2\2\u038a\u038c\5\u00ba^\2\u038b\u0387\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038c\u00b9\3\2\2\2\u038d\u038f\7>\2\2\u038e\u0390\5|?"+
		"\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392"+
		"\7?\2\2\u0392\u00bb\3\2\2\2a\u00bf\u00c7\u00d4\u00db\u00e1\u00ea\u00ef"+
		"\u00fc\u0101\u0105\u010a\u010e\u0113\u011a\u0126\u012c\u0133\u013a\u0145"+
		"\u014a\u0152\u0156\u0158\u0164\u0167\u0172\u0177\u0182\u0186\u0191\u019b"+
		"\u01a4\u01ac\u01af\u01b2\u01bd\u01c4\u01d0\u01d8\u01e1\u01f7\u01fa\u0204"+
		"\u0209\u020e\u0219\u021d\u022e\u023d\u024a\u0250\u0255\u025e\u0262\u0266"+
		"\u026a\u026c\u0270\u0283\u028e\u0298\u029f\u02a7\u02af\u02b7\u02bf\u02c7"+
		"\u02cd\u02d5\u02e0\u02ea\u02f2\u02fd\u0305\u0310\u0314\u0316\u0320\u0325"+
		"\u032a\u0334\u0338\u033f\u0348\u034e\u0357\u035f\u036b\u0372\u0375\u0379"+
		"\u0383\u0385\u038b\u038f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}