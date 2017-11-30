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
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, CONSTINT=12, FLOATINT=13, FUNCTION=14, 
		DEFAULT=15, DO=16, DOUBLE=17, ELSE=18, ENUM=19, EXTENDS=20, FINAL=21, 
		FINALLY=22, FLOAT=23, FOR=24, IF=25, GOTO=26, IMPLEMENTS=27, IMPORT=28, 
		INSTANCEOF=29, INT=30, INTERFACE=31, LONG=32, NATIVE=33, NEW=34, PACKAGE=35, 
		PRIVATE=36, PROTECTED=37, PUBLIC=38, RETURN=39, SHORT=40, STATIC=41, STRICTFP=42, 
		STRING=43, SUPER=44, SWITCH=45, SYNCHRONIZED=46, THIS=47, THROW=48, THROWS=49, 
		TRANSIENT=50, TRY=51, VOID=52, VOLATILE=53, WHILE=54, OUTPUT=55, OUTPUTLN=56, 
		INPUT=57, IntegerLiteral=58, FloatingPointLiteral=59, BooleanLiteral=60, 
		CharacterLiteral=61, StringLiteral=62, NullLiteral=63, LPAREN=64, RPAREN=65, 
		LBRACE=66, RBRACE=67, LBRACK=68, RBRACK=69, SEMI=70, COMMA=71, DOT=72, 
		ASSIGN=73, GT=74, LT=75, BANG=76, TILDE=77, QUESTION=78, COLON=79, EQUAL=80, 
		LE=81, GE=82, NOTEQUAL=83, AND=84, OR=85, INC=86, DEC=87, ADD=88, SUB=89, 
		MUL=90, DIV=91, BITAND=92, BITOR=93, CARET=94, MOD=95, ADD_ASSIGN=96, 
		SUB_ASSIGN=97, MUL_ASSIGN=98, DIV_ASSIGN=99, AND_ASSIGN=100, OR_ASSIGN=101, 
		XOR_ASSIGN=102, MOD_ASSIGN=103, LSHIFT_ASSIGN=104, RSHIFT_ASSIGN=105, 
		URSHIFT_ASSIGN=106, Identifier=107, AT=108, ELLIPSIS=109, WS=110, COMMENT=111, 
		LINE_COMMENT=112;
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
		RULE_functionCall = 45, RULE_ioStatement = 46, RULE_input_statement = 47, 
		RULE_output_statement = 48, RULE_catches = 49, RULE_catchClause = 50, 
		RULE_catchType = 51, RULE_finallyBlock = 52, RULE_formalParameter = 53, 
		RULE_switchBlockStatementGroups = 54, RULE_switchBlockStatementGroup = 55, 
		RULE_switchLabel = 56, RULE_forControl = 57, RULE_forInit = 58, RULE_enhancedForControl = 59, 
		RULE_forUpdate = 60, RULE_parExpression = 61, RULE_expressionList = 62, 
		RULE_statementExpression = 63, RULE_constantExpression = 64, RULE_expression = 65, 
		RULE_assignmentOperator = 66, RULE_conditionalExpression = 67, RULE_conditionalOrExpression = 68, 
		RULE_conditionalAndExpression = 69, RULE_inclusiveOrExpression = 70, RULE_exclusiveOrExpression = 71, 
		RULE_andExpression = 72, RULE_equalityExpression = 73, RULE_equalORnotequal = 74, 
		RULE_instanceOfExpression = 75, RULE_relationalExpression = 76, RULE_relationalOp = 77, 
		RULE_shiftExpression = 78, RULE_shiftOp = 79, RULE_additiveExpression = 80, 
		RULE_addORsub = 81, RULE_multiplicativeExpression = 82, RULE_mulORdivORmod = 83, 
		RULE_unaryExpression = 84, RULE_unaryExpressionNotPlusMinus = 85, RULE_castExpression = 86, 
		RULE_primary = 87, RULE_identifierSuffix = 88, RULE_arrayCreatorRest = 89, 
		RULE_classCreatorRest = 90, RULE_selector = 91, RULE_superSuffix = 92, 
		RULE_explicitGenericInvocationSuffix = 93, RULE_arguments = 94;
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
		"variableModifiers", "statement", "functionCall", "ioStatement", "input_statement", 
		"output_statement", "catches", "catchClause", "catchType", "finallyBlock", 
		"formalParameter", "switchBlockStatementGroups", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "equalORnotequal", "instanceOfExpression", 
		"relationalExpression", "relationalOp", "shiftExpression", "shiftOp", 
		"additiveExpression", "addORsub", "multiplicativeExpression", "mulORdivORmod", 
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
		"identifierSuffix", "arrayCreatorRest", "classCreatorRest", "selector", 
		"superSuffix", "explicitGenericInvocationSuffix", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'const int'", 
		"'const double'", "'function'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'strictfp'", "'String'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'output'", 
		"'outputln'", "'input'", null, null, null, null, null, "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "CONSTINT", "FLOATINT", "FUNCTION", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", 
		"FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", 
		"INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "STRING", "SUPER", 
		"SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", 
		"VOID", "VOLATILE", "WHILE", "OUTPUT", "OUTPUTLN", "INPUT", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(190);
				classDeclaration();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				{
				setState(198);
				modifier();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CLASS);
			setState(207);
			match(Identifier);
			setState(208);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LBRACE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(211);
				classBodyDeclaration();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
		enterRule(_localctx, 10, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(220);
					match(STATIC);
					}
				}

				setState(223);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				modifiers();
				setState(225);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberDecl);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				memberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(Identifier);
				setState(231);
				constructorDeclaratorRest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
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
		enterRule(_localctx, 14, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			type();
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(236);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(237);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Identifier);
			setState(241);
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
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			variableDeclarators();
			setState(244);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			formalParameters();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(247);
				match(LBRACK);
				setState(248);
				match(RBRACK);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(254);
				match(THROWS);
				setState(255);
				qualifiedNameList();
				}
			}

			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(258);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(259);
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
		enterRule(_localctx, 22, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			formalParameters();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(263);
				match(THROWS);
				setState(264);
				qualifiedNameList();
				}
			}

			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(267);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(268);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVoidInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			formalParameters();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(272);
				match(THROWS);
				setState(273);
				qualifiedNameList();
				}
			}

			setState(276);
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
		enterRule(_localctx, 26, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			formalParameters();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(279);
				match(THROWS);
				setState(280);
				qualifiedNameList();
				}
			}

			setState(283);
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
		enterRule(_localctx, 28, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(Identifier);
			setState(286);
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
		enterRule(_localctx, 30, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			variableDeclarator();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				variableDeclarator();
				}
				}
				setState(295);
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
		enterRule(_localctx, 32, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			variableDeclaratorId();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(297);
				match(ASSIGN);
				setState(298);
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
		enterRule(_localctx, 34, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			constantDeclaratorRest();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				constantDeclarator();
				}
				}
				setState(308);
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
		enterRule(_localctx, 36, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(309);
				match(LBRACK);
				setState(310);
				match(RBRACK);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(ASSIGN);
			setState(317);
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
		enterRule(_localctx, 38, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Identifier);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(320);
				match(LBRACK);
				setState(321);
				match(RBRACK);
				}
				}
				setState(326);
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
		enterRule(_localctx, 40, RULE_variableInitializer);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CONSTINT:
			case FLOATINT:
			case FUNCTION:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
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
				setState(328);
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
		enterRule(_localctx, 42, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LBRACE);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(332);
				variableInitializer();
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(333);
						match(COMMA);
						setState(334);
						variableInitializer();
						}
						} 
					}
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(340);
					match(COMMA);
					}
				}

				}
			}

			setState(345);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			setState(358);
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
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CONSTINT:
			case FLOATINT:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				primitiveType();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(351);
					match(LBRACK);
					setState(352);
					match(RBRACK);
					}
					}
					setState(357);
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
		public TerminalNode BOOLEAN() { return getToken(JuicyBoysParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JuicyBoysParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JuicyBoysParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JuicyBoysParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JuicyBoysParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JuicyBoysParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JuicyBoysParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JuicyBoysParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(JuicyBoysParser.STRING, 0); }
		public TerminalNode CONSTINT() { return getToken(JuicyBoysParser.CONSTINT, 0); }
		public TerminalNode FLOATINT() { return getToken(JuicyBoysParser.FLOATINT, 0); }
		public TerminalNode VOID() { return getToken(JuicyBoysParser.VOID, 0); }
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
		enterRule(_localctx, 48, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			qualifiedName();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				qualifiedName();
				}
				}
				setState(371);
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
		public List<FormalParameterDeclsContext> formalParameterDecls() {
			return getRuleContexts(FormalParameterDeclsContext.class);
		}
		public FormalParameterDeclsContext formalParameterDecls(int i) {
			return getRuleContext(FormalParameterDeclsContext.class,i);
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
		enterRule(_localctx, 54, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(LPAREN);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID))) != 0) || _la==Identifier) {
				{
				setState(373);
				formalParameterDecls();
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(374);
					match(COMMA);
					setState(375);
					formalParameterDecls();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(383);
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
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
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
		enterRule(_localctx, 56, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			variableModifiers();
			setState(386);
			type();
			setState(387);
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
		enterRule(_localctx, 58, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				variableDeclaratorId();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(390);
					match(COMMA);
					setState(391);
					formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(ELLIPSIS);
				setState(395);
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
		enterRule(_localctx, 60, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 62, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 64, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(Identifier);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(403);
				match(DOT);
				setState(404);
				match(Identifier);
				}
				}
				setState(409);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			elementValuePair();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(413);
				match(COMMA);
				setState(414);
				elementValuePair();
				}
				}
				setState(419);
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
		enterRule(_localctx, 70, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Identifier);
			setState(421);
			match(ASSIGN);
			setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elementValue);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CONSTINT:
			case FLOATINT:
			case FUNCTION:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
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
				setState(424);
				conditionalExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
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
		enterRule(_localctx, 74, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(LBRACE);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(429);
				elementValue();
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						match(COMMA);
						setState(431);
						elementValue();
						}
						} 
					}
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(439);
				match(COMMA);
				}
			}

			setState(442);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(DEFAULT);
			setState(445);
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
		enterRule(_localctx, 78, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LBRACE);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OUTPUT) | (1L << OUTPUTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(448);
				blockStatement();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_blockStatement);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
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
		enterRule(_localctx, 82, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			localVariableDeclaration();
			setState(461);
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
		enterRule(_localctx, 84, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			variableModifiers();
			setState(464);
			type();
			setState(465);
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
		enterRule(_localctx, 86, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(467);
				variableModifier();
				}
				}
				setState(472);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagForStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagStatementExpressionStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagTerminateStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagIfStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagSwitchStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagContinueStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagIOStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HashtagReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JuicyBoysParser.RETURN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagReturnStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagDoStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagWhileStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagBreakStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagIdentifierStatement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagBlock(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new HashtagBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				block();
				}
				break;
			case 2:
				_localctx = new HashtagAssertStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(ASSERT);
				setState(475);
				expression();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(476);
					match(COLON);
					setState(477);
					expression();
					}
				}

				setState(480);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new HashtagIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(IF);
				setState(483);
				parExpression();
				setState(484);
				statement();
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(485);
					match(ELSE);
					setState(486);
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
				setState(489);
				match(FOR);
				setState(490);
				match(LPAREN);
				setState(491);
				forControl();
				setState(492);
				match(RPAREN);
				setState(493);
				statement();
				}
				break;
			case 5:
				_localctx = new HashtagWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				match(WHILE);
				setState(496);
				parExpression();
				setState(497);
				statement();
				}
				break;
			case 6:
				_localctx = new HashtagDoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				match(DO);
				setState(500);
				statement();
				setState(501);
				match(WHILE);
				setState(502);
				parExpression();
				setState(503);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new HashtagTryStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(505);
				match(TRY);
				setState(506);
				block();
				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(507);
					catches();
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(508);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(511);
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
				setState(514);
				match(SWITCH);
				setState(515);
				parExpression();
				setState(516);
				match(LBRACE);
				setState(517);
				switchBlockStatementGroups();
				setState(518);
				match(RBRACE);
				}
				break;
			case 9:
				_localctx = new HashtagReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(520);
				match(RETURN);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(521);
					expression();
					}
				}

				setState(524);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new HashtagBreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(525);
				match(BREAK);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(526);
					match(Identifier);
					}
				}

				setState(529);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new HashtagContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(530);
				match(CONTINUE);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(531);
					match(Identifier);
					}
				}

				setState(534);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new HashtagTerminateStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(535);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new HashtagStatementExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(536);
				statementExpression();
				setState(537);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new HashtagIdentifierStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(539);
				match(Identifier);
				setState(540);
				match(COLON);
				setState(541);
				statement();
				}
				break;
			case 15:
				_localctx = new HashtagIOStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(542);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JuicyBoysParser.FUNCTION, 0); }
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(FUNCTION);
			setState(546);
			match(Identifier);
			setState(547);
			match(LPAREN);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(548);
				expression();
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(549);
					match(COMMA);
					setState(550);
					expression();
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(558);
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
		enterRule(_localctx, 92, RULE_ioStatement);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				input_statement();
				}
				break;
			case OUTPUT:
			case OUTPUTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
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
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public TerminalNode INPUT() { return getToken(JuicyBoysParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
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
		enterRule(_localctx, 94, RULE_input_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(Identifier);
			setState(565);
			match(ASSIGN);
			setState(566);
			match(INPUT);
			setState(567);
			match(LPAREN);
			setState(568);
			match(RPAREN);
			setState(569);
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
		public Output_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_statement; }
	 
		public Output_statementContext() { }
		public void copyFrom(Output_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HashtagOutputVariableContext extends Output_statementContext {
		public TerminalNode OUTPUT() { return getToken(JuicyBoysParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(JuicyBoysParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JuicyBoysParser.SEMI, 0); }
		public HashtagOutputVariableContext(Output_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagOutputVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagOutputVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagOutputVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HashtagOutputLNStringContext extends Output_statementContext {
		public TerminalNode OUTPUTLN() { return getToken(JuicyBoysParser.OUTPUTLN, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
		public TerminalNode StringLiteral() { return getToken(JuicyBoysParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(JuicyBoysParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JuicyBoysParser.SEMI, 0); }
		public HashtagOutputLNStringContext(Output_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagOutputLNString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagOutputLNString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagOutputLNString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HashtagOutputLNVariableContext extends Output_statementContext {
		public TerminalNode OUTPUTLN() { return getToken(JuicyBoysParser.OUTPUTLN, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(JuicyBoysParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JuicyBoysParser.SEMI, 0); }
		public HashtagOutputLNVariableContext(Output_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagOutputLNVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagOutputLNVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagOutputLNVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HashtagOutputStringContext extends Output_statementContext {
		public TerminalNode OUTPUT() { return getToken(JuicyBoysParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(JuicyBoysParser.LPAREN, 0); }
		public TerminalNode StringLiteral() { return getToken(JuicyBoysParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(JuicyBoysParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JuicyBoysParser.SEMI, 0); }
		public HashtagOutputStringContext(Output_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterHashtagOutputString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitHashtagOutputString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitHashtagOutputString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_statementContext output_statement() throws RecognitionException {
		Output_statementContext _localctx = new Output_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_output_statement);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new HashtagOutputVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(OUTPUT);
				setState(572);
				match(LPAREN);
				setState(573);
				match(Identifier);
				setState(574);
				match(RPAREN);
				setState(575);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new HashtagOutputLNVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(OUTPUTLN);
				setState(577);
				match(LPAREN);
				setState(578);
				match(Identifier);
				setState(579);
				match(RPAREN);
				setState(580);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new HashtagOutputStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				match(OUTPUT);
				setState(582);
				match(LPAREN);
				setState(583);
				match(StringLiteral);
				setState(584);
				match(RPAREN);
				setState(585);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new HashtagOutputLNStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(OUTPUTLN);
				setState(587);
				match(LPAREN);
				setState(588);
				match(StringLiteral);
				setState(589);
				match(RPAREN);
				setState(590);
				match(SEMI);
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
		enterRule(_localctx, 98, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(593);
				catchClause();
				}
				}
				setState(596); 
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
		enterRule(_localctx, 100, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(CATCH);
			setState(599);
			match(LPAREN);
			setState(600);
			variableModifiers();
			setState(601);
			catchType();
			setState(602);
			match(Identifier);
			setState(603);
			match(RPAREN);
			setState(604);
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
		enterRule(_localctx, 102, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			qualifiedName();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(607);
				match(BITOR);
				setState(608);
				qualifiedName();
				}
				}
				setState(613);
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
		enterRule(_localctx, 104, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(FINALLY);
			setState(615);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			variableModifiers();
			setState(618);
			type();
			setState(619);
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
		enterRule(_localctx, 108, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(621);
				switchBlockStatementGroup();
				}
				}
				setState(626);
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
		enterRule(_localctx, 110, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(627);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(630); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << OUTPUT) | (1L << OUTPUTLN) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(632);
				blockStatement();
				}
				}
				setState(637);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_switchLabel);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(CASE);
				setState(639);
				constantExpression();
				setState(640);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(DEFAULT);
				setState(643);
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
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
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
		enterRule(_localctx, 114, RULE_forControl);
		int _la;
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(647);
					forInit();
					}
				}

				setState(650);
				match(SEMI);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(651);
					expression();
					}
				}

				setState(654);
				match(SEMI);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << VOID))) != 0) || _la==Identifier) {
					{
					setState(655);
					localVariableDeclaration();
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
		enterRule(_localctx, 116, RULE_forInit);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
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
		enterRule(_localctx, 118, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			variableModifiers();
			setState(665);
			type();
			setState(666);
			match(Identifier);
			setState(667);
			match(COLON);
			setState(668);
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
		enterRule(_localctx, 120, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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
		enterRule(_localctx, 122, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(LPAREN);
			setState(673);
			expression();
			setState(674);
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
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			expression();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(677);
				match(COMMA);
				setState(678);
				expression();
				}
				}
				setState(683);
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
		enterRule(_localctx, 126, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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
		enterRule(_localctx, 128, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		enterRule(_localctx, 130, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			conditionalExpression();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (ASSIGN - 73)) | (1L << (ADD_ASSIGN - 73)) | (1L << (SUB_ASSIGN - 73)) | (1L << (MUL_ASSIGN - 73)) | (1L << (DIV_ASSIGN - 73)) | (1L << (AND_ASSIGN - 73)) | (1L << (OR_ASSIGN - 73)) | (1L << (XOR_ASSIGN - 73)) | (1L << (MOD_ASSIGN - 73)) | (1L << (LSHIFT_ASSIGN - 73)) | (1L << (RSHIFT_ASSIGN - 73)) | (1L << (URSHIFT_ASSIGN - 73)))) != 0)) {
				{
				setState(689);
				assignmentOperator();
				setState(690);
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
		public TerminalNode ASSIGN() { return getToken(JuicyBoysParser.ASSIGN, 0); }
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
		enterRule(_localctx, 132, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (ASSIGN - 73)) | (1L << (ADD_ASSIGN - 73)) | (1L << (SUB_ASSIGN - 73)) | (1L << (MUL_ASSIGN - 73)) | (1L << (DIV_ASSIGN - 73)) | (1L << (AND_ASSIGN - 73)) | (1L << (OR_ASSIGN - 73)) | (1L << (XOR_ASSIGN - 73)) | (1L << (MOD_ASSIGN - 73)) | (1L << (LSHIFT_ASSIGN - 73)) | (1L << (RSHIFT_ASSIGN - 73)) | (1L << (URSHIFT_ASSIGN - 73)))) != 0)) ) {
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
		enterRule(_localctx, 134, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			conditionalOrExpression();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(697);
				match(QUESTION);
				setState(698);
				expression();
				setState(699);
				match(COLON);
				setState(700);
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
		public List<TerminalNode> OR() { return getTokens(JuicyBoysParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JuicyBoysParser.OR, i);
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
		enterRule(_localctx, 136, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			conditionalAndExpression();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(705);
				match(OR);
				setState(706);
				conditionalAndExpression();
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JuicyBoysParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JuicyBoysParser.AND, i);
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
		enterRule(_localctx, 138, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			inclusiveOrExpression();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(713);
				match(AND);
				setState(714);
				inclusiveOrExpression();
				}
				}
				setState(719);
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
		enterRule(_localctx, 140, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			exclusiveOrExpression();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(721);
				match(BITOR);
				setState(722);
				exclusiveOrExpression();
				}
				}
				setState(727);
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
		enterRule(_localctx, 142, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			andExpression();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(729);
				match(CARET);
				setState(730);
				andExpression();
				}
				}
				setState(735);
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
		enterRule(_localctx, 144, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			equalityExpression();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(737);
				match(BITAND);
				setState(738);
				equalityExpression();
				}
				}
				setState(743);
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
		public List<EqualORnotequalContext> equalORnotequal() {
			return getRuleContexts(EqualORnotequalContext.class);
		}
		public EqualORnotequalContext equalORnotequal(int i) {
			return getRuleContext(EqualORnotequalContext.class,i);
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
		enterRule(_localctx, 146, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			instanceOfExpression();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(745);
				equalORnotequal();
				setState(746);
				instanceOfExpression();
				}
				}
				setState(752);
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

	public static class EqualORnotequalContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(JuicyBoysParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JuicyBoysParser.NOTEQUAL, 0); }
		public EqualORnotequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalORnotequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterEqualORnotequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitEqualORnotequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitEqualORnotequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualORnotequalContext equalORnotequal() throws RecognitionException {
		EqualORnotequalContext _localctx = new EqualORnotequalContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_equalORnotequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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
		enterRule(_localctx, 150, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			relationalExpression();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(756);
				match(INSTANCEOF);
				setState(757);
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
		enterRule(_localctx, 152, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			shiftExpression();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (GT - 74)) | (1L << (LT - 74)) | (1L << (LE - 74)) | (1L << (GE - 74)))) != 0)) {
				{
				{
				setState(761);
				relationalOp();
				setState(762);
				shiftExpression();
				}
				}
				setState(768);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (GT - 74)) | (1L << (LT - 74)) | (1L << (LE - 74)) | (1L << (GE - 74)))) != 0)) ) {
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
		enterRule(_localctx, 156, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			additiveExpression();
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					shiftOp();
					setState(773);
					additiveExpression();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 158, RULE_shiftOp);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				((ShiftOpContext)_localctx).t1 = match(LT);
				setState(781);
				((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(783);
				((ShiftOpContext)_localctx).t2 = match(GT);
				setState(784);
				((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(786);
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
		enterRule(_localctx, 160, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			multiplicativeExpression();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(790);
				addORsub();
				setState(791);
				multiplicativeExpression();
				}
				}
				setState(797);
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
		enterRule(_localctx, 162, RULE_addORsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
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
		enterRule(_localctx, 164, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			unaryExpression();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) {
				{
				{
				setState(801);
				mulORdivORmod();
				setState(802);
				unaryExpression();
				}
				}
				setState(808);
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
		enterRule(_localctx, 166, RULE_mulORdivORmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (MUL - 90)) | (1L << (DIV - 90)) | (1L << (MOD - 90)))) != 0)) ) {
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
		enterRule(_localctx, 168, RULE_unaryExpression);
		int _la;
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (INC - 86)) | (1L << (DEC - 86)) | (1L << (ADD - 86)) | (1L << (SUB - 86)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(812);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CONSTINT:
			case FLOATINT:
			case FUNCTION:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
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
				setState(813);
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
		enterRule(_localctx, 170, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(TILDE);
				setState(817);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(BANG);
				setState(819);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				primary();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(822);
					selector();
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(828);
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
		enterRule(_localctx, 172, RULE_castExpression);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				match(LPAREN);
				setState(834);
				primitiveType();
				setState(835);
				match(RPAREN);
				setState(836);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				match(LPAREN);
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(839);
					type();
					}
					break;
				case 2:
					{
					setState(840);
					expression();
					}
					break;
				}
				setState(843);
				match(RPAREN);
				setState(844);
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
		public TerminalNode Identifier() { return getToken(JuicyBoysParser.Identifier, 0); }
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 174, RULE_primary);
		int _la;
		try {
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				parExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(THIS);
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(850);
					arguments();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(SUPER);
				setState(854);
				superSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(Identifier);
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(857);
					identifierSuffix();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(860);
				primitiveType();
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(861);
					match(LBRACK);
					setState(862);
					match(RBRACK);
					}
					}
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(868);
				match(DOT);
				setState(869);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(871);
				match(VOID);
				setState(872);
				match(DOT);
				setState(873);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(874);
				functionCall();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitIdentifierSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_identifierSuffix);
		int _la;
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(879); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(877);
					match(LBRACK);
					setState(878);
					match(RBRACK);
					}
					}
					setState(881); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(883);
				match(DOT);
				setState(884);
				match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(LBRACK);
				setState(886);
				expression();
				setState(887);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(LBRACK);
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(893);
				match(RBRACK);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(894);
					match(LBRACK);
					setState(895);
					match(RBRACK);
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CONSTINT:
			case FLOATINT:
			case FUNCTION:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
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
				setState(902);
				expression();
				setState(903);
				match(RBRACK);
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(904);
						match(LBRACK);
						setState(905);
						expression();
						setState(906);
						match(RBRACK);
						}
						} 
					}
					setState(912);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(913);
					match(LBRACK);
					setState(914);
					match(RBRACK);
					}
					}
					setState(919);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			arguments();
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(923);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(LBRACK);
			setState(927);
			expression();
			setState(928);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuicyBoysVisitor ) return ((JuicyBoysVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_superSuffix);
		int _la;
		try {
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(DOT);
				setState(932);
				match(Identifier);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(933);
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
		enterRule(_localctx, 186, RULE_explicitGenericInvocationSuffix);
		try {
			setState(942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				match(SUPER);
				setState(939);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(Identifier);
				setState(941);
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
		enterRule(_localctx, 188, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(LPAREN);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONSTINT) | (1L << FLOATINT) | (1L << FUNCTION) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LPAREN - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(945);
				expressionList();
				}
			}

			setState(948);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u03b9\4\2\t\2\4"+
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
		"`\t`\3\2\7\2\u00c2\n\2\f\2\16\2\u00c5\13\2\3\2\3\2\3\3\7\3\u00ca\n\3\f"+
		"\3\16\3\u00cd\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u00d7\n\6\f\6\16"+
		"\6\u00da\13\6\3\6\3\6\3\7\3\7\5\7\u00e0\n\7\3\7\3\7\3\7\3\7\5\7\u00e6"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u00ec\n\b\3\t\3\t\3\t\5\t\u00f1\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00fc\n\f\f\f\16\f\u00ff\13\f\3\f\3"+
		"\f\5\f\u0103\n\f\3\f\3\f\5\f\u0107\n\f\3\r\3\r\3\r\5\r\u010c\n\r\3\r\3"+
		"\r\5\r\u0110\n\r\3\16\3\16\3\16\5\16\u0115\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\5\17\u011c\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0126"+
		"\n\21\f\21\16\21\u0129\13\21\3\22\3\22\3\22\5\22\u012e\n\22\3\23\3\23"+
		"\3\23\7\23\u0133\n\23\f\23\16\23\u0136\13\23\3\24\3\24\7\24\u013a\n\24"+
		"\f\24\16\24\u013d\13\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u0145\n\25"+
		"\f\25\16\25\u0148\13\25\3\26\3\26\5\26\u014c\n\26\3\27\3\27\3\27\3\27"+
		"\7\27\u0152\n\27\f\27\16\27\u0155\13\27\3\27\5\27\u0158\n\27\5\27\u015a"+
		"\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0164\n\31\f\31\16"+
		"\31\u0167\13\31\5\31\u0169\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34"+
		"\u0172\n\34\f\34\16\34\u0175\13\34\3\35\3\35\3\35\3\35\7\35\u017b\n\35"+
		"\f\35\16\35\u017e\13\35\5\35\u0180\n\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\5\37\u018b\n\37\3\37\3\37\5\37\u018f\n\37\3 \3 \3!\3!"+
		"\3\"\3\"\3\"\7\"\u0198\n\"\f\"\16\"\u019b\13\"\3#\3#\3$\3$\3$\7$\u01a2"+
		"\n$\f$\16$\u01a5\13$\3%\3%\3%\3%\3&\3&\5&\u01ad\n&\3\'\3\'\3\'\3\'\7\'"+
		"\u01b3\n\'\f\'\16\'\u01b6\13\'\5\'\u01b8\n\'\3\'\5\'\u01bb\n\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\7)\u01c4\n)\f)\16)\u01c7\13)\3)\3)\3*\3*\5*\u01cd\n*\3"+
		"+\3+\3+\3,\3,\3,\3,\3-\7-\u01d7\n-\f-\16-\u01da\13-\3.\3.\3.\3.\3.\5."+
		"\u01e1\n.\3.\3.\3.\3.\3.\3.\3.\5.\u01ea\n.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0200\n.\3.\5.\u0203\n.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\5.\u020d\n.\3.\3.\3.\5.\u0212\n.\3.\3.\3.\5.\u0217\n."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0222\n.\3/\3/\3/\3/\3/\3/\7/\u022a\n/"+
		"\f/\16/\u022d\13/\5/\u022f\n/\3/\3/\3\60\3\60\5\60\u0235\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0252\n\62"+
		"\3\63\6\63\u0255\n\63\r\63\16\63\u0256\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\7\65\u0264\n\65\f\65\16\65\u0267\13\65\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\38\78\u0271\n8\f8\168\u0274\138\39\69\u0277"+
		"\n9\r9\169\u0278\39\79\u027c\n9\f9\169\u027f\139\3:\3:\3:\3:\3:\3:\5:"+
		"\u0287\n:\3;\3;\5;\u028b\n;\3;\3;\5;\u028f\n;\3;\3;\5;\u0293\n;\5;\u0295"+
		"\n;\3<\3<\5<\u0299\n<\3=\3=\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3@\7@"+
		"\u02aa\n@\f@\16@\u02ad\13@\3A\3A\3B\3B\3C\3C\3C\3C\5C\u02b7\nC\3D\3D\3"+
		"E\3E\3E\3E\3E\3E\5E\u02c1\nE\3F\3F\3F\7F\u02c6\nF\fF\16F\u02c9\13F\3G"+
		"\3G\3G\7G\u02ce\nG\fG\16G\u02d1\13G\3H\3H\3H\7H\u02d6\nH\fH\16H\u02d9"+
		"\13H\3I\3I\3I\7I\u02de\nI\fI\16I\u02e1\13I\3J\3J\3J\7J\u02e6\nJ\fJ\16"+
		"J\u02e9\13J\3K\3K\3K\3K\7K\u02ef\nK\fK\16K\u02f2\13K\3L\3L\3M\3M\3M\5"+
		"M\u02f9\nM\3N\3N\3N\3N\7N\u02ff\nN\fN\16N\u0302\13N\3O\3O\3P\3P\3P\3P"+
		"\7P\u030a\nP\fP\16P\u030d\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0316\nQ\3R\3R\3"+
		"R\3R\7R\u031c\nR\fR\16R\u031f\13R\3S\3S\3T\3T\3T\3T\7T\u0327\nT\fT\16"+
		"T\u032a\13T\3U\3U\3V\3V\3V\5V\u0331\nV\3W\3W\3W\3W\3W\3W\3W\7W\u033a\n"+
		"W\fW\16W\u033d\13W\3W\5W\u0340\nW\5W\u0342\nW\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\5X\u034c\nX\3X\3X\3X\5X\u0351\nX\3Y\3Y\3Y\5Y\u0356\nY\3Y\3Y\3Y\3Y\3Y"+
		"\5Y\u035d\nY\3Y\3Y\3Y\7Y\u0362\nY\fY\16Y\u0365\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\5Y\u036e\nY\3Z\3Z\6Z\u0372\nZ\rZ\16Z\u0373\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u037d"+
		"\nZ\3[\3[\3[\3[\7[\u0383\n[\f[\16[\u0386\13[\3[\3[\3[\3[\3[\3[\3[\7[\u038f"+
		"\n[\f[\16[\u0392\13[\3[\3[\7[\u0396\n[\f[\16[\u0399\13[\5[\u039b\n[\3"+
		"\\\3\\\5\\\u039f\n\\\3]\3]\3]\3]\3^\3^\3^\3^\5^\u03a9\n^\5^\u03ab\n^\3"+
		"_\3_\3_\3_\5_\u03b1\n_\3`\3`\5`\u03b5\n`\3`\3`\3`\2\2a\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\f\n\2\3"+
		"\3\27\27##&(+,\60\60\64\64\67\67\r\2\5\5\7\7\n\n\16\17\23\23\31\31  \""+
		"\"**--\66\66\3\2<A\4\2KKbl\4\2RRUU\4\2LMST\3\2Z[\4\2\\]aa\3\2X[\3\2XY"+
		"\2\u03d6\2\u00c3\3\2\2\2\4\u00cb\3\2\2\2\6\u00ce\3\2\2\2\b\u00d0\3\2\2"+
		"\2\n\u00d4\3\2\2\2\f\u00e5\3\2\2\2\16\u00eb\3\2\2\2\20\u00ed\3\2\2\2\22"+
		"\u00f2\3\2\2\2\24\u00f5\3\2\2\2\26\u00f8\3\2\2\2\30\u0108\3\2\2\2\32\u0111"+
		"\3\2\2\2\34\u0118\3\2\2\2\36\u011f\3\2\2\2 \u0122\3\2\2\2\"\u012a\3\2"+
		"\2\2$\u012f\3\2\2\2&\u013b\3\2\2\2(\u0141\3\2\2\2*\u014b\3\2\2\2,\u014d"+
		"\3\2\2\2.\u015d\3\2\2\2\60\u0168\3\2\2\2\62\u016a\3\2\2\2\64\u016c\3\2"+
		"\2\2\66\u016e\3\2\2\28\u0176\3\2\2\2:\u0183\3\2\2\2<\u018e\3\2\2\2>\u0190"+
		"\3\2\2\2@\u0192\3\2\2\2B\u0194\3\2\2\2D\u019c\3\2\2\2F\u019e\3\2\2\2H"+
		"\u01a6\3\2\2\2J\u01ac\3\2\2\2L\u01ae\3\2\2\2N\u01be\3\2\2\2P\u01c1\3\2"+
		"\2\2R\u01cc\3\2\2\2T\u01ce\3\2\2\2V\u01d1\3\2\2\2X\u01d8\3\2\2\2Z\u0221"+
		"\3\2\2\2\\\u0223\3\2\2\2^\u0234\3\2\2\2`\u0236\3\2\2\2b\u0251\3\2\2\2"+
		"d\u0254\3\2\2\2f\u0258\3\2\2\2h\u0260\3\2\2\2j\u0268\3\2\2\2l\u026b\3"+
		"\2\2\2n\u0272\3\2\2\2p\u0276\3\2\2\2r\u0286\3\2\2\2t\u0294\3\2\2\2v\u0298"+
		"\3\2\2\2x\u029a\3\2\2\2z\u02a0\3\2\2\2|\u02a2\3\2\2\2~\u02a6\3\2\2\2\u0080"+
		"\u02ae\3\2\2\2\u0082\u02b0\3\2\2\2\u0084\u02b2\3\2\2\2\u0086\u02b8\3\2"+
		"\2\2\u0088\u02ba\3\2\2\2\u008a\u02c2\3\2\2\2\u008c\u02ca\3\2\2\2\u008e"+
		"\u02d2\3\2\2\2\u0090\u02da\3\2\2\2\u0092\u02e2\3\2\2\2\u0094\u02ea\3\2"+
		"\2\2\u0096\u02f3\3\2\2\2\u0098\u02f5\3\2\2\2\u009a\u02fa\3\2\2\2\u009c"+
		"\u0303\3\2\2\2\u009e\u0305\3\2\2\2\u00a0\u0315\3\2\2\2\u00a2\u0317\3\2"+
		"\2\2\u00a4\u0320\3\2\2\2\u00a6\u0322\3\2\2\2\u00a8\u032b\3\2\2\2\u00aa"+
		"\u0330\3\2\2\2\u00ac\u0341\3\2\2\2\u00ae\u0350\3\2\2\2\u00b0\u036d\3\2"+
		"\2\2\u00b2\u037c\3\2\2\2\u00b4\u037e\3\2\2\2\u00b6\u039c\3\2\2\2\u00b8"+
		"\u03a0\3\2\2\2\u00ba\u03aa\3\2\2\2\u00bc\u03b0\3\2\2\2\u00be\u03b2\3\2"+
		"\2\2\u00c0\u00c2\5\6\4\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7\2\2\3\u00c7\3\3\2\2\2\u00c8\u00ca\5.\30\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\5\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\b\5\2\u00cf\7\3\2\2\2\u00d0"+
		"\u00d1\7\13\2\2\u00d1\u00d2\7m\2\2\u00d2\u00d3\5\n\6\2\u00d3\t\3\2\2\2"+
		"\u00d4\u00d8\7D\2\2\u00d5\u00d7\5\f\7\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7E\2\2\u00dc\13\3\2\2\2\u00dd\u00e6\7H\2\2"+
		"\u00de\u00e0\7+\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e6\5P)\2\u00e2\u00e3\5\4\3\2\u00e3\u00e4\5\16\b\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e2\3\2"+
		"\2\2\u00e6\r\3\2\2\2\u00e7\u00ec\5\20\t\2\u00e8\u00e9\7m\2\2\u00e9\u00ec"+
		"\5\34\17\2\u00ea\u00ec\5\6\4\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2"+
		"\u00eb\u00ea\3\2\2\2\u00ec\17\3\2\2\2\u00ed\u00f0\5\60\31\2\u00ee\u00f1"+
		"\5\22\n\2\u00ef\u00f1\5\24\13\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2"+
		"\2\u00f1\21\3\2\2\2\u00f2\u00f3\7m\2\2\u00f3\u00f4\5\26\f\2\u00f4\23\3"+
		"\2\2\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\7H\2\2\u00f7\25\3\2\2\2\u00f8\u00fd"+
		"\58\35\2\u00f9\u00fa\7F\2\2\u00fa\u00fc\7G\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\63\2\2\u0101\u0103\5\66\34\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0107\5>"+
		" \2\u0105\u0107\7H\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\27"+
		"\3\2\2\2\u0108\u010b\58\35\2\u0109\u010a\7\63\2\2\u010a\u010c\5\66\34"+
		"\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u0110"+
		"\5> \2\u010e\u0110\7H\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\31\3\2\2\2\u0111\u0114\58\35\2\u0112\u0113\7\63\2\2\u0113\u0115\5\66"+
		"\34\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\7H\2\2\u0117\33\3\2\2\2\u0118\u011b\58\35\2\u0119\u011a\7\63\2"+
		"\2\u011a\u011c\5\66\34\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\5@!\2\u011e\35\3\2\2\2\u011f\u0120\7m\2\2\u0120"+
		"\u0121\5&\24\2\u0121\37\3\2\2\2\u0122\u0127\5\"\22\2\u0123\u0124\7I\2"+
		"\2\u0124\u0126\5\"\22\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128!\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012d\5(\25\2\u012b\u012c\7K\2\2\u012c\u012e\5*\26\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e#\3\2\2\2\u012f\u0134\5&\24\2\u0130"+
		"\u0131\7I\2\2\u0131\u0133\5\36\20\2\u0132\u0130\3\2\2\2\u0133\u0136\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135%\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0138\7F\2\2\u0138\u013a\7G\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7K\2\2\u013f\u0140\5*\26\2\u0140"+
		"\'\3\2\2\2\u0141\u0146\7m\2\2\u0142\u0143\7F\2\2\u0143\u0145\7G\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147)\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014c\5,\27\2\u014a\u014c"+
		"\5\u0084C\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c+\3\2\2\2\u014d"+
		"\u0159\7D\2\2\u014e\u0153\5*\26\2\u014f\u0150\7I\2\2\u0150\u0152\5*\26"+
		"\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\7I\2\2\u0157"+
		"\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u014e\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7E\2\2\u015c"+
		"-\3\2\2\2\u015d\u015e\t\2\2\2\u015e/\3\2\2\2\u015f\u0169\3\2\2\2\u0160"+
		"\u0165\5\62\32\2\u0161\u0162\7F\2\2\u0162\u0164\7G\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u015f\3\2\2\2\u0168\u0160\3\2"+
		"\2\2\u0169\61\3\2\2\2\u016a\u016b\t\3\2\2\u016b\63\3\2\2\2\u016c\u016d"+
		"\7\27\2\2\u016d\65\3\2\2\2\u016e\u0173\5B\"\2\u016f\u0170\7I\2\2\u0170"+
		"\u0172\5B\"\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\67\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017f"+
		"\7B\2\2\u0177\u017c\5:\36\2\u0178\u0179\7I\2\2\u0179\u017b\5:\36\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0177\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7C\2\2\u01829\3\2\2\2\u0183"+
		"\u0184\5X-\2\u0184\u0185\5\60\31\2\u0185\u0186\5(\25\2\u0186;\3\2\2\2"+
		"\u0187\u018a\5(\25\2\u0188\u0189\7I\2\2\u0189\u018b\5:\36\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c\u018d\7o\2\2\u018d"+
		"\u018f\5(\25\2\u018e\u0187\3\2\2\2\u018e\u018c\3\2\2\2\u018f=\3\2\2\2"+
		"\u0190\u0191\5P)\2\u0191?\3\2\2\2\u0192\u0193\5P)\2\u0193A\3\2\2\2\u0194"+
		"\u0199\7m\2\2\u0195\u0196\7J\2\2\u0196\u0198\7m\2\2\u0197\u0195\3\2\2"+
		"\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aC"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\t\4\2\2\u019dE\3\2\2\2\u019e"+
		"\u01a3\5H%\2\u019f\u01a0\7I\2\2\u01a0\u01a2\5H%\2\u01a1\u019f\3\2\2\2"+
		"\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4G\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7m\2\2\u01a7\u01a8\7K\2\2\u01a8"+
		"\u01a9\5J&\2\u01a9I\3\2\2\2\u01aa\u01ad\5\u0088E\2\u01ab\u01ad\5L\'\2"+
		"\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adK\3\2\2\2\u01ae\u01b7\7"+
		"D\2\2\u01af\u01b4\5J&\2\u01b0\u01b1\7I\2\2\u01b1\u01b3\5J&\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01bb\7I\2\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7E\2\2\u01bdM\3\2\2\2\u01be"+
		"\u01bf\7\21\2\2\u01bf\u01c0\5J&\2\u01c0O\3\2\2\2\u01c1\u01c5\7D\2\2\u01c2"+
		"\u01c4\5R*\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9"+
		"\7E\2\2\u01c9Q\3\2\2\2\u01ca\u01cd\5T+\2\u01cb\u01cd\5Z.\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cdS\3\2\2\2\u01ce\u01cf\5V,\2\u01cf\u01d0"+
		"\7H\2\2\u01d0U\3\2\2\2\u01d1\u01d2\5X-\2\u01d2\u01d3\5\60\31\2\u01d3\u01d4"+
		"\5 \21\2\u01d4W\3\2\2\2\u01d5\u01d7\5\64\33\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9Y\3\2\2\2"+
		"\u01da\u01d8\3\2\2\2\u01db\u0222\5P)\2\u01dc\u01dd\7\4\2\2\u01dd\u01e0"+
		"\5\u0084C\2\u01de\u01df\7Q\2\2\u01df\u01e1\5\u0084C\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7H\2\2\u01e3"+
		"\u0222\3\2\2\2\u01e4\u01e5\7\33\2\2\u01e5\u01e6\5|?\2\u01e6\u01e9\5Z."+
		"\2\u01e7\u01e8\7\24\2\2\u01e8\u01ea\5Z.\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u0222\3\2\2\2\u01eb\u01ec\7\32\2\2\u01ec\u01ed\7B\2\2\u01ed"+
		"\u01ee\5t;\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\5Z.\2\u01f0\u0222\3\2\2\2"+
		"\u01f1\u01f2\78\2\2\u01f2\u01f3\5|?\2\u01f3\u01f4\5Z.\2\u01f4\u0222\3"+
		"\2\2\2\u01f5\u01f6\7\22\2\2\u01f6\u01f7\5Z.\2\u01f7\u01f8\78\2\2\u01f8"+
		"\u01f9\5|?\2\u01f9\u01fa\7H\2\2\u01fa\u0222\3\2\2\2\u01fb\u01fc\7\65\2"+
		"\2\u01fc\u0202\5P)\2\u01fd\u01ff\5d\63\2\u01fe\u0200\5j\66\2\u01ff\u01fe"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0203\5j\66\2\u0202"+
		"\u01fd\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0222\3\2\2\2\u0204\u0205\7/"+
		"\2\2\u0205\u0206\5|?\2\u0206\u0207\7D\2\2\u0207\u0208\5n8\2\u0208\u0209"+
		"\7E\2\2\u0209\u0222\3\2\2\2\u020a\u020c\7)\2\2\u020b\u020d\5\u0084C\2"+
		"\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0222"+
		"\7H\2\2\u020f\u0211\7\6\2\2\u0210\u0212\7m\2\2\u0211\u0210\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0222\7H\2\2\u0214\u0216\7\r"+
		"\2\2\u0215\u0217\7m\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0222\7H\2\2\u0219\u0222\7H\2\2\u021a\u021b\5\u0080"+
		"A\2\u021b\u021c\7H\2\2\u021c\u0222\3\2\2\2\u021d\u021e\7m\2\2\u021e\u021f"+
		"\7Q\2\2\u021f\u0222\5Z.\2\u0220\u0222\5^\60\2\u0221\u01db\3\2\2\2\u0221"+
		"\u01dc\3\2\2\2\u0221\u01e4\3\2\2\2\u0221\u01eb\3\2\2\2\u0221\u01f1\3\2"+
		"\2\2\u0221\u01f5\3\2\2\2\u0221\u01fb\3\2\2\2\u0221\u0204\3\2\2\2\u0221"+
		"\u020a\3\2\2\2\u0221\u020f\3\2\2\2\u0221\u0214\3\2\2\2\u0221\u0219\3\2"+
		"\2\2\u0221\u021a\3\2\2\2\u0221\u021d\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"[\3\2\2\2\u0223\u0224\7\20\2\2\u0224\u0225\7m\2\2\u0225\u022e\7B\2\2\u0226"+
		"\u022b\5\u0084C\2\u0227\u0228\7I\2\2\u0228\u022a\5\u0084C\2\u0229\u0227"+
		"\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0226\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7C\2\2\u0231]\3\2\2\2\u0232\u0235"+
		"\5`\61\2\u0233\u0235\5b\62\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		"_\3\2\2\2\u0236\u0237\7m\2\2\u0237\u0238\7K\2\2\u0238\u0239\7;\2\2\u0239"+
		"\u023a\7B\2\2\u023a\u023b\7C\2\2\u023b\u023c\7H\2\2\u023ca\3\2\2\2\u023d"+
		"\u023e\79\2\2\u023e\u023f\7B\2\2\u023f\u0240\7m\2\2\u0240\u0241\7C\2\2"+
		"\u0241\u0252\7H\2\2\u0242\u0243\7:\2\2\u0243\u0244\7B\2\2\u0244\u0245"+
		"\7m\2\2\u0245\u0246\7C\2\2\u0246\u0252\7H\2\2\u0247\u0248\79\2\2\u0248"+
		"\u0249\7B\2\2\u0249\u024a\7@\2\2\u024a\u024b\7C\2\2\u024b\u0252\7H\2\2"+
		"\u024c\u024d\7:\2\2\u024d\u024e\7B\2\2\u024e\u024f\7@\2\2\u024f\u0250"+
		"\7C\2\2\u0250\u0252\7H\2\2\u0251\u023d\3\2\2\2\u0251\u0242\3\2\2\2\u0251"+
		"\u0247\3\2\2\2\u0251\u024c\3\2\2\2\u0252c\3\2\2\2\u0253\u0255\5f\64\2"+
		"\u0254\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257"+
		"\3\2\2\2\u0257e\3\2\2\2\u0258\u0259\7\t\2\2\u0259\u025a\7B\2\2\u025a\u025b"+
		"\5X-\2\u025b\u025c\5h\65\2\u025c\u025d\7m\2\2\u025d\u025e\7C\2\2\u025e"+
		"\u025f\5P)\2\u025fg\3\2\2\2\u0260\u0265\5B\"\2\u0261\u0262\7_\2\2\u0262"+
		"\u0264\5B\"\2\u0263\u0261\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266i\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\7\30\2\2\u0269\u026a\5P)\2\u026ak\3\2\2\2\u026b\u026c\5X-\2\u026c\u026d"+
		"\5\60\31\2\u026d\u026e\5(\25\2\u026em\3\2\2\2\u026f\u0271\5p9\2\u0270"+
		"\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273o\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0277\5r:\2\u0276\u0275"+
		"\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027d\3\2\2\2\u027a\u027c\5R*\2\u027b\u027a\3\2\2\2\u027c\u027f\3\2\2"+
		"\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027eq\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u0280\u0281\7\b\2\2\u0281\u0282\5\u0082B\2\u0282\u0283\7Q\2\2"+
		"\u0283\u0287\3\2\2\2\u0284\u0285\7\21\2\2\u0285\u0287\7Q\2\2\u0286\u0280"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0287s\3\2\2\2\u0288\u0295\5x=\2\u0289\u028b"+
		"\5v<\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028e\7H\2\2\u028d\u028f\5\u0084C\2\u028e\u028d\3\2\2\2\u028e\u028f\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\7H\2\2\u0291\u0293\5V,\2\u0292"+
		"\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0288\3\2"+
		"\2\2\u0294\u028a\3\2\2\2\u0295u\3\2\2\2\u0296\u0299\5V,\2\u0297\u0299"+
		"\5~@\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299w\3\2\2\2\u029a\u029b"+
		"\5X-\2\u029b\u029c\5\60\31\2\u029c\u029d\7m\2\2\u029d\u029e\7Q\2\2\u029e"+
		"\u029f\5\u0084C\2\u029fy\3\2\2\2\u02a0\u02a1\5~@\2\u02a1{\3\2\2\2\u02a2"+
		"\u02a3\7B\2\2\u02a3\u02a4\5\u0084C\2\u02a4\u02a5\7C\2\2\u02a5}\3\2\2\2"+
		"\u02a6\u02ab\5\u0084C\2\u02a7\u02a8\7I\2\2\u02a8\u02aa\5\u0084C\2\u02a9"+
		"\u02a7\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\177\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\5\u0084C\2\u02af"+
		"\u0081\3\2\2\2\u02b0\u02b1\5\u0084C\2\u02b1\u0083\3\2\2\2\u02b2\u02b6"+
		"\5\u0088E\2\u02b3\u02b4\5\u0086D\2\u02b4\u02b5\5\u0084C\2\u02b5\u02b7"+
		"\3\2\2\2\u02b6\u02b3\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u0085\3\2\2\2\u02b8"+
		"\u02b9\t\5\2\2\u02b9\u0087\3\2\2\2\u02ba\u02c0\5\u008aF\2\u02bb\u02bc"+
		"\7P\2\2\u02bc\u02bd\5\u0084C\2\u02bd\u02be\7Q\2\2\u02be\u02bf\5\u0088"+
		"E\2\u02bf\u02c1\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u0089\3\2\2\2\u02c2\u02c7\5\u008cG\2\u02c3\u02c4\7W\2\2\u02c4\u02c6\5"+
		"\u008cG\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2"+
		"\u02c7\u02c8\3\2\2\2\u02c8\u008b\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cf"+
		"\5\u008eH\2\u02cb\u02cc\7V\2\2\u02cc\u02ce\5\u008eH\2\u02cd\u02cb\3\2"+
		"\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u008d\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d7\5\u0090I\2\u02d3\u02d4"+
		"\7_\2\2\u02d4\u02d6\5\u0090I\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9\3\2\2\2"+
		"\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u008f\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02da\u02df\5\u0092J\2\u02db\u02dc\7`\2\2\u02dc\u02de\5\u0092"+
		"J\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u0091\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e7\5\u0094"+
		"K\2\u02e3\u02e4\7^\2\2\u02e4\u02e6\5\u0094K\2\u02e5\u02e3\3\2\2\2\u02e6"+
		"\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u0093\3\2"+
		"\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02f0\5\u0098M\2\u02eb\u02ec\5\u0096L\2"+
		"\u02ec\u02ed\5\u0098M\2\u02ed\u02ef\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ef"+
		"\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u0095\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4\t\6\2\2\u02f4\u0097\3\2\2\2\u02f5"+
		"\u02f8\5\u009aN\2\u02f6\u02f7\7\37\2\2\u02f7\u02f9\5\60\31\2\u02f8\u02f6"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0099\3\2\2\2\u02fa\u0300\5\u009eP"+
		"\2\u02fb\u02fc\5\u009cO\2\u02fc\u02fd\5\u009eP\2\u02fd\u02ff\3\2\2\2\u02fe"+
		"\u02fb\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u009b\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\t\7\2\2\u0304"+
		"\u009d\3\2\2\2\u0305\u030b\5\u00a2R\2\u0306\u0307\5\u00a0Q\2\u0307\u0308"+
		"\5\u00a2R\2\u0308\u030a\3\2\2\2\u0309\u0306\3\2\2\2\u030a\u030d\3\2\2"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u009f\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030e\u030f\7M\2\2\u030f\u0316\7M\2\2\u0310\u0311\7L\2\2\u0311"+
		"\u0312\7L\2\2\u0312\u0316\7L\2\2\u0313\u0314\7L\2\2\u0314\u0316\7L\2\2"+
		"\u0315\u030e\3\2\2\2\u0315\u0310\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u00a1"+
		"\3\2\2\2\u0317\u031d\5\u00a6T\2\u0318\u0319\5\u00a4S\2\u0319\u031a\5\u00a6"+
		"T\2\u031a\u031c\3\2\2\2\u031b\u0318\3\2\2\2\u031c\u031f\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u00a3\3\2\2\2\u031f\u031d\3\2"+
		"\2\2\u0320\u0321\t\b\2\2\u0321\u00a5\3\2\2\2\u0322\u0328\5\u00aaV\2\u0323"+
		"\u0324\5\u00a8U\2\u0324\u0325\5\u00aaV\2\u0325\u0327\3\2\2\2\u0326\u0323"+
		"\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u00a7\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032c\t\t\2\2\u032c\u00a9\3\2"+
		"\2\2\u032d\u032e\t\n\2\2\u032e\u0331\5\u00aaV\2\u032f\u0331\5\u00acW\2"+
		"\u0330\u032d\3\2\2\2\u0330\u032f\3\2\2\2\u0331\u00ab\3\2\2\2\u0332\u0333"+
		"\7O\2\2\u0333\u0342\5\u00aaV\2\u0334\u0335\7N\2\2\u0335\u0342\5\u00aa"+
		"V\2\u0336\u0342\5\u00aeX\2\u0337\u033b\5\u00b0Y\2\u0338\u033a\5\u00b8"+
		"]\2\u0339\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0340\t\13"+
		"\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341"+
		"\u0332\3\2\2\2\u0341\u0334\3\2\2\2\u0341\u0336\3\2\2\2\u0341\u0337\3\2"+
		"\2\2\u0342\u00ad\3\2\2\2\u0343\u0344\7B\2\2\u0344\u0345\5\62\32\2\u0345"+
		"\u0346\7C\2\2\u0346\u0347\5\u00aaV\2\u0347\u0351\3\2\2\2\u0348\u034b\7"+
		"B\2\2\u0349\u034c\5\60\31\2\u034a\u034c\5\u0084C\2\u034b\u0349\3\2\2\2"+
		"\u034b\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7C\2\2\u034e\u034f"+
		"\5\u00acW\2\u034f\u0351\3\2\2\2\u0350\u0343\3\2\2\2\u0350\u0348\3\2\2"+
		"\2\u0351\u00af\3\2\2\2\u0352\u036e\5|?\2\u0353\u0355\7\61\2\2\u0354\u0356"+
		"\5\u00be`\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u036e\3\2\2"+
		"\2\u0357\u0358\7.\2\2\u0358\u036e\5\u00ba^\2\u0359\u036e\5D#\2\u035a\u035c"+
		"\7m\2\2\u035b\u035d\5\u00b2Z\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2"+
		"\u035d\u036e\3\2\2\2\u035e\u0363\5\62\32\2\u035f\u0360\7F\2\2\u0360\u0362"+
		"\7G\2\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0367\7J"+
		"\2\2\u0367\u0368\7\13\2\2\u0368\u036e\3\2\2\2\u0369\u036a\7\66\2\2\u036a"+
		"\u036b\7J\2\2\u036b\u036e\7\13\2\2\u036c\u036e\5\\/\2\u036d\u0352\3\2"+
		"\2\2\u036d\u0353\3\2\2\2\u036d\u0357\3\2\2\2\u036d\u0359\3\2\2\2\u036d"+
		"\u035a\3\2\2\2\u036d\u035e\3\2\2\2\u036d\u0369\3\2\2\2\u036d\u036c\3\2"+
		"\2\2\u036e\u00b1\3\2\2\2\u036f\u0370\7F\2\2\u0370\u0372\7G\2\2\u0371\u036f"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\7J\2\2\u0376\u037d\7\13\2\2\u0377\u0378\7F"+
		"\2\2\u0378\u0379\5\u0084C\2\u0379\u037a\7G\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u037d\5\u00be`\2\u037c\u0371\3\2\2\2\u037c\u0377\3\2\2\2\u037c\u037b"+
		"\3\2\2\2\u037d\u00b3\3\2\2\2\u037e\u039a\7F\2\2\u037f\u0384\7G\2\2\u0380"+
		"\u0381\7F\2\2\u0381\u0383\7G\2\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2"+
		"\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0387\u039b\5,\27\2\u0388\u0389\5\u0084C\2\u0389\u0390\7G\2\2"+
		"\u038a\u038b\7F\2\2\u038b\u038c\5\u0084C\2\u038c\u038d\7G\2\2\u038d\u038f"+
		"\3\2\2\2\u038e\u038a\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0397\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7F"+
		"\2\2\u0394\u0396\7G\2\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2\u0397"+
		"\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2"+
		"\2\2\u039a\u037f\3\2\2\2\u039a\u0388\3\2\2\2\u039b\u00b5\3\2\2\2\u039c"+
		"\u039e\5\u00be`\2\u039d\u039f\5\n\6\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u00b7\3\2\2\2\u03a0\u03a1\7F\2\2\u03a1\u03a2\5\u0084C\2"+
		"\u03a2\u03a3\7G\2\2\u03a3\u00b9\3\2\2\2\u03a4\u03ab\5\u00be`\2\u03a5\u03a6"+
		"\7J\2\2\u03a6\u03a8\7m\2\2\u03a7\u03a9\5\u00be`\2\u03a8\u03a7\3\2\2\2"+
		"\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a4\3\2\2\2\u03aa\u03a5"+
		"\3\2\2\2\u03ab\u00bb\3\2\2\2\u03ac\u03ad\7.\2\2\u03ad\u03b1\5\u00ba^\2"+
		"\u03ae\u03af\7m\2\2\u03af\u03b1\5\u00be`\2\u03b0\u03ac\3\2\2\2\u03b0\u03ae"+
		"\3\2\2\2\u03b1\u00bd\3\2\2\2\u03b2\u03b4\7B\2\2\u03b3\u03b5\5~@\2\u03b4"+
		"\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\7C"+
		"\2\2\u03b7\u00bf\3\2\2\2d\u00c3\u00cb\u00d8\u00df\u00e5\u00eb\u00f0\u00fd"+
		"\u0102\u0106\u010b\u010f\u0114\u011b\u0127\u012d\u0134\u013b\u0146\u014b"+
		"\u0153\u0157\u0159\u0165\u0168\u0173\u017c\u017f\u018a\u018e\u0199\u01a3"+
		"\u01ac\u01b4\u01b7\u01ba\u01c5\u01cc\u01d8\u01e0\u01e9\u01ff\u0202\u020c"+
		"\u0211\u0216\u0221\u022b\u022e\u0234\u0251\u0256\u0265\u0272\u0278\u027d"+
		"\u0286\u028a\u028e\u0292\u0294\u0298\u02ab\u02b6\u02c0\u02c7\u02cf\u02d7"+
		"\u02df\u02e7\u02f0\u02f8\u0300\u030b\u0315\u031d\u0328\u0330\u033b\u033f"+
		"\u0341\u034b\u0350\u0355\u035c\u0363\u036d\u0373\u037c\u0384\u0390\u0397"+
		"\u039a\u039e\u03a8\u03aa\u03b0\u03b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}