// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuicyBoysLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, CONSTINT=12, FLOATINT=13, DEFAULT=14, 
		DO=15, DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, 
		FLOAT=22, FOR=23, IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, 
		INT=29, INTERFACE=30, LONG=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, 
		PROTECTED=36, PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, 
		STRING=42, SUPER=43, SWITCH=44, SYNCHRONIZED=45, THIS=46, THROW=47, THROWS=48, 
		TRANSIENT=49, TRY=50, VOID=51, VOLATILE=52, WHILE=53, OUTPUT=54, OUTPUTLN=55, 
		INPUT=56, IntegerLiteral=57, FloatingPointLiteral=58, BooleanLiteral=59, 
		CharacterLiteral=60, StringLiteral=61, NullLiteral=62, LPAREN=63, RPAREN=64, 
		LBRACE=65, RBRACE=66, LBRACK=67, RBRACK=68, SEMI=69, COMMA=70, DOT=71, 
		ASSIGN=72, GT=73, LT=74, BANG=75, TILDE=76, QUESTION=77, COLON=78, EQUAL=79, 
		LE=80, GE=81, NOTEQUAL=82, AND=83, OR=84, INC=85, DEC=86, ADD=87, SUB=88, 
		MUL=89, DIV=90, BITAND=91, BITOR=92, CARET=93, MOD=94, ADD_ASSIGN=95, 
		SUB_ASSIGN=96, MUL_ASSIGN=97, DIV_ASSIGN=98, AND_ASSIGN=99, OR_ASSIGN=100, 
		XOR_ASSIGN=101, MOD_ASSIGN=102, LSHIFT_ASSIGN=103, RSHIFT_ASSIGN=104, 
		URSHIFT_ASSIGN=105, Identifier=106, AT=107, ELLIPSIS=108, WS=109, COMMENT=110, 
		LINE_COMMENT=111;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "CONSTINT", "FLOATINT", "DEFAULT", "DO", 
		"DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
		"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "SHORT", "STATIC", "STRICTFP", "STRING", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "OUTPUT", "OUTPUTLN", "INPUT", "IntegerLiteral", 
		"IntegerTypeSuffix", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
		"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'const int'", 
		"'const double'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
		"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
		"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'String'", "'super'", 
		"'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", 
		"'try'", "'void'", "'volatile'", "'while'", "'output'", "'outputln'", 
		"'input'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "CONSTINT", "FLOATINT", "DEFAULT", 
		"DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
		"FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
		"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "SHORT", "STATIC", "STRICTFP", "STRING", "SUPER", "SWITCH", 
		"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
		"VOLATILE", "WHILE", "OUTPUT", "OUTPUTLN", "INPUT", "IntegerLiteral", 
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


	public JuicyBoysLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JuicyBoys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 144:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 145:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2q\u044d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\6:\u02ba\n:\r:\16"+
		":\u02bb\3;\3;\3<\3<\5<\u02c2\n<\3<\5<\u02c5\n<\3=\3=\5=\u02c9\n=\3>\3"+
		">\3?\6?\u02ce\n?\r?\16?\u02cf\3@\3@\5@\u02d4\n@\3A\6A\u02d7\nA\rA\16A"+
		"\u02d8\3B\3B\3B\3B\3C\3C\5C\u02e1\nC\3C\5C\u02e4\nC\3D\3D\3E\6E\u02e9"+
		"\nE\rE\16E\u02ea\3F\3F\5F\u02ef\nF\3G\3G\5G\u02f3\nG\3G\3G\3H\3H\5H\u02f9"+
		"\nH\3H\5H\u02fc\nH\3I\3I\3J\6J\u0301\nJ\rJ\16J\u0302\3K\3K\5K\u0307\n"+
		"K\3L\3L\3L\3L\3M\3M\5M\u030f\nM\3M\5M\u0312\nM\3N\3N\3O\6O\u0317\nO\r"+
		"O\16O\u0318\3P\3P\5P\u031d\nP\3Q\3Q\5Q\u0321\nQ\3R\3R\3R\5R\u0326\nR\3"+
		"R\5R\u0329\nR\3R\5R\u032c\nR\3R\3R\3R\5R\u0331\nR\3R\5R\u0334\nR\3R\3"+
		"R\3R\5R\u0339\nR\3R\3R\3R\5R\u033e\nR\3S\3S\3S\3T\3T\3U\5U\u0346\nU\3"+
		"U\3U\3V\3V\3W\3W\3X\3X\3X\5X\u0351\nX\3Y\3Y\5Y\u0355\nY\3Y\3Y\3Y\5Y\u035a"+
		"\nY\3Y\3Y\5Y\u035e\nY\3Z\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u036e\n\\\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0378\n]\3^\3^\3_\3_\5_\u037e"+
		"\n_\3_\3_\3`\6`\u0383\n`\r`\16`\u0384\3a\3a\5a\u0389\na\3b\3b\3b\5b\u038e"+
		"\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u039b\nc\3d\3d\3e\3e\3e\3e\3e"+
		"\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q"+
		"\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z"+
		"\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\7\u0091\u0413\n\u0091\f\u0091\16\u0091\u0416"+
		"\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u041e"+
		"\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0426"+
		"\n\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\6\u0096"+
		"\u042f\n\u0096\r\u0096\16\u0096\u0430\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\7\u0097\u0439\n\u0097\f\u0097\16\u0097\u043c\13\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\7\u0098\u0447\n\u0098\f\u0098\16\u0098\u044a\13\u0098\3\u0098\3\u0098"+
		"\3\u043a\2\u0099\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\u00a1<\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7=\u00b9>\u00bb\2\u00bd"+
		"?\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9@\u00cbA\u00cdB\u00cfC"+
		"\u00d1D\u00d3E\u00d5F\u00d7G\u00d9H\u00dbI\u00ddJ\u00dfK\u00e1L\u00e3"+
		"M\u00e5N\u00e7O\u00e9P\u00ebQ\u00edR\u00efS\u00f1T\u00f3U\u00f5V\u00f7"+
		"W\u00f9X\u00fbY\u00fdZ\u00ff[\u0101\\\u0103]\u0105^\u0107_\u0109`\u010b"+
		"a\u010db\u010fc\u0111d\u0113e\u0115f\u0117g\u0119h\u011bi\u011dj\u011f"+
		"k\u0121l\u0123\2\u0125\2\u0127m\u0129n\u012bo\u012dp\u012fq\3\2\31\3\2"+
		"\62;\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2"+
		"GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3"+
		"\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0457\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\u00a1\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2"+
		"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9"+
		"\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2"+
		"\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb"+
		"\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2"+
		"\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d"+
		"\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2"+
		"\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f"+
		"\3\2\2\2\2\u0121\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2"+
		"\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\3\u0131\3\2\2\2\5\u013a\3\2\2\2\7\u0141"+
		"\3\2\2\2\t\u0149\3\2\2\2\13\u014f\3\2\2\2\r\u0154\3\2\2\2\17\u0159\3\2"+
		"\2\2\21\u015f\3\2\2\2\23\u0164\3\2\2\2\25\u016a\3\2\2\2\27\u0170\3\2\2"+
		"\2\31\u0179\3\2\2\2\33\u0183\3\2\2\2\35\u0190\3\2\2\2\37\u0198\3\2\2\2"+
		"!\u019b\3\2\2\2#\u01a2\3\2\2\2%\u01a7\3\2\2\2\'\u01ac\3\2\2\2)\u01b4\3"+
		"\2\2\2+\u01ba\3\2\2\2-\u01c2\3\2\2\2/\u01c8\3\2\2\2\61\u01cc\3\2\2\2\63"+
		"\u01cf\3\2\2\2\65\u01d4\3\2\2\2\67\u01df\3\2\2\29\u01e6\3\2\2\2;\u01f1"+
		"\3\2\2\2=\u01f5\3\2\2\2?\u01ff\3\2\2\2A\u0204\3\2\2\2C\u020b\3\2\2\2E"+
		"\u020f\3\2\2\2G\u0217\3\2\2\2I\u021f\3\2\2\2K\u0229\3\2\2\2M\u0230\3\2"+
		"\2\2O\u0237\3\2\2\2Q\u023d\3\2\2\2S\u0244\3\2\2\2U\u024d\3\2\2\2W\u0254"+
		"\3\2\2\2Y\u025a\3\2\2\2[\u0261\3\2\2\2]\u026e\3\2\2\2_\u0273\3\2\2\2a"+
		"\u0279\3\2\2\2c\u0280\3\2\2\2e\u028a\3\2\2\2g\u028e\3\2\2\2i\u0293\3\2"+
		"\2\2k\u029c\3\2\2\2m\u02a2\3\2\2\2o\u02a9\3\2\2\2q\u02b2\3\2\2\2s\u02b9"+
		"\3\2\2\2u\u02bd\3\2\2\2w\u02bf\3\2\2\2y\u02c8\3\2\2\2{\u02ca\3\2\2\2}"+
		"\u02cd\3\2\2\2\177\u02d3\3\2\2\2\u0081\u02d6\3\2\2\2\u0083\u02da\3\2\2"+
		"\2\u0085\u02de\3\2\2\2\u0087\u02e5\3\2\2\2\u0089\u02e8\3\2\2\2\u008b\u02ee"+
		"\3\2\2\2\u008d\u02f0\3\2\2\2\u008f\u02f6\3\2\2\2\u0091\u02fd\3\2\2\2\u0093"+
		"\u0300\3\2\2\2\u0095\u0306\3\2\2\2\u0097\u0308\3\2\2\2\u0099\u030c\3\2"+
		"\2\2\u009b\u0313\3\2\2\2\u009d\u0316\3\2\2\2\u009f\u031c\3\2\2\2\u00a1"+
		"\u0320\3\2\2\2\u00a3\u033d\3\2\2\2\u00a5\u033f\3\2\2\2\u00a7\u0342\3\2"+
		"\2\2\u00a9\u0345\3\2\2\2\u00ab\u0349\3\2\2\2\u00ad\u034b\3\2\2\2\u00af"+
		"\u034d\3\2\2\2\u00b1\u035d\3\2\2\2\u00b3\u035f\3\2\2\2\u00b5\u0362\3\2"+
		"\2\2\u00b7\u036d\3\2\2\2\u00b9\u0377\3\2\2\2\u00bb\u0379\3\2\2\2\u00bd"+
		"\u037b\3\2\2\2\u00bf\u0382\3\2\2\2\u00c1\u0388\3\2\2\2\u00c3\u038d\3\2"+
		"\2\2\u00c5\u039a\3\2\2\2\u00c7\u039c\3\2\2\2\u00c9\u039e\3\2\2\2\u00cb"+
		"\u03a3\3\2\2\2\u00cd\u03a5\3\2\2\2\u00cf\u03a7\3\2\2\2\u00d1\u03a9\3\2"+
		"\2\2\u00d3\u03ab\3\2\2\2\u00d5\u03ad\3\2\2\2\u00d7\u03af\3\2\2\2\u00d9"+
		"\u03b1\3\2\2\2\u00db\u03b3\3\2\2\2\u00dd\u03b5\3\2\2\2\u00df\u03b7\3\2"+
		"\2\2\u00e1\u03b9\3\2\2\2\u00e3\u03bb\3\2\2\2\u00e5\u03bd\3\2\2\2\u00e7"+
		"\u03bf\3\2\2\2\u00e9\u03c1\3\2\2\2\u00eb\u03c3\3\2\2\2\u00ed\u03c6\3\2"+
		"\2\2\u00ef\u03c9\3\2\2\2\u00f1\u03cc\3\2\2\2\u00f3\u03cf\3\2\2\2\u00f5"+
		"\u03d2\3\2\2\2\u00f7\u03d5\3\2\2\2\u00f9\u03d8\3\2\2\2\u00fb\u03db\3\2"+
		"\2\2\u00fd\u03dd\3\2\2\2\u00ff\u03df\3\2\2\2\u0101\u03e1\3\2\2\2\u0103"+
		"\u03e3\3\2\2\2\u0105\u03e5\3\2\2\2\u0107\u03e7\3\2\2\2\u0109\u03e9\3\2"+
		"\2\2\u010b\u03eb\3\2\2\2\u010d\u03ee\3\2\2\2\u010f\u03f1\3\2\2\2\u0111"+
		"\u03f4\3\2\2\2\u0113\u03f7\3\2\2\2\u0115\u03fa\3\2\2\2\u0117\u03fd\3\2"+
		"\2\2\u0119\u0400\3\2\2\2\u011b\u0403\3\2\2\2\u011d\u0407\3\2\2\2\u011f"+
		"\u040b\3\2\2\2\u0121\u0410\3\2\2\2\u0123\u041d\3\2\2\2\u0125\u0425\3\2"+
		"\2\2\u0127\u0427\3\2\2\2\u0129\u0429\3\2\2\2\u012b\u042e\3\2\2\2\u012d"+
		"\u0434\3\2\2\2\u012f\u0442\3\2\2\2\u0131\u0132\7c\2\2\u0132\u0133\7d\2"+
		"\2\u0133\u0134\7u\2\2\u0134\u0135\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137"+
		"\7c\2\2\u0137\u0138\7e\2\2\u0138\u0139\7v\2\2\u0139\4\3\2\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7u\2\2\u013c\u013d\7u\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7t\2\2\u013f\u0140\7v\2\2\u0140\6\3\2\2\2\u0141\u0142\7d\2\2\u0142"+
		"\u0143\7q\2\2\u0143\u0144\7q\2\2\u0144\u0145\7n\2\2\u0145\u0146\7g\2\2"+
		"\u0146\u0147\7c\2\2\u0147\u0148\7p\2\2\u0148\b\3\2\2\2\u0149\u014a\7d"+
		"\2\2\u014a\u014b\7t\2\2\u014b\u014c\7g\2\2\u014c\u014d\7c\2\2\u014d\u014e"+
		"\7m\2\2\u014e\n\3\2\2\2\u014f\u0150\7d\2\2\u0150\u0151\7{\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7g\2\2\u0153\f\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156"+
		"\7c\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158\16\3\2\2\2\u0159\u015a"+
		"\7e\2\2\u015a\u015b\7c\2\2\u015b\u015c\7v\2\2\u015c\u015d\7e\2\2\u015d"+
		"\u015e\7j\2\2\u015e\20\3\2\2\2\u015f\u0160\7e\2\2\u0160\u0161\7j\2\2\u0161"+
		"\u0162\7c\2\2\u0162\u0163\7t\2\2\u0163\22\3\2\2\2\u0164\u0165\7e\2\2\u0165"+
		"\u0166\7n\2\2\u0166\u0167\7c\2\2\u0167\u0168\7u\2\2\u0168\u0169\7u\2\2"+
		"\u0169\24\3\2\2\2\u016a\u016b\7e\2\2\u016b\u016c\7q\2\2\u016c\u016d\7"+
		"p\2\2\u016d\u016e\7u\2\2\u016e\u016f\7v\2\2\u016f\26\3\2\2\2\u0170\u0171"+
		"\7e\2\2\u0171\u0172\7q\2\2\u0172\u0173\7p\2\2\u0173\u0174\7v\2\2\u0174"+
		"\u0175\7k\2\2\u0175\u0176\7p\2\2\u0176\u0177\7w\2\2\u0177\u0178\7g\2\2"+
		"\u0178\30\3\2\2\2\u0179\u017a\7e\2\2\u017a\u017b\7q\2\2\u017b\u017c\7"+
		"p\2\2\u017c\u017d\7u\2\2\u017d\u017e\7v\2\2\u017e\u017f\7\"\2\2\u017f"+
		"\u0180\7k\2\2\u0180\u0181\7p\2\2\u0181\u0182\7v\2\2\u0182\32\3\2\2\2\u0183"+
		"\u0184\7e\2\2\u0184\u0185\7q\2\2\u0185\u0186\7p\2\2\u0186\u0187\7u\2\2"+
		"\u0187\u0188\7v\2\2\u0188\u0189\7\"\2\2\u0189\u018a\7f\2\2\u018a\u018b"+
		"\7q\2\2\u018b\u018c\7w\2\2\u018c\u018d\7d\2\2\u018d\u018e\7n\2\2\u018e"+
		"\u018f\7g\2\2\u018f\34\3\2\2\2\u0190\u0191\7f\2\2\u0191\u0192\7g\2\2\u0192"+
		"\u0193\7h\2\2\u0193\u0194\7c\2\2\u0194\u0195\7w\2\2\u0195\u0196\7n\2\2"+
		"\u0196\u0197\7v\2\2\u0197\36\3\2\2\2\u0198\u0199\7f\2\2\u0199\u019a\7"+
		"q\2\2\u019a \3\2\2\2\u019b\u019c\7f\2\2\u019c\u019d\7q\2\2\u019d\u019e"+
		"\7w\2\2\u019e\u019f\7d\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7g\2\2\u01a1"+
		"\"\3\2\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7u\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6$\3\2\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7p\2\2\u01a9"+
		"\u01aa\7w\2\2\u01aa\u01ab\7o\2\2\u01ab&\3\2\2\2\u01ac\u01ad\7g\2\2\u01ad"+
		"\u01ae\7z\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7p\2\2"+
		"\u01b1\u01b2\7f\2\2\u01b2\u01b3\7u\2\2\u01b3(\3\2\2\2\u01b4\u01b5\7h\2"+
		"\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9"+
		"\7n\2\2\u01b9*\3\2\2\2\u01ba\u01bb\7h\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd"+
		"\7p\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7n\2\2\u01bf\u01c0\7n\2\2\u01c0"+
		"\u01c1\7{\2\2\u01c1,\3\2\2\2\u01c2\u01c3\7h\2\2\u01c3\u01c4\7n\2\2\u01c4"+
		"\u01c5\7q\2\2\u01c5\u01c6\7c\2\2\u01c6\u01c7\7v\2\2\u01c7.\3\2\2\2\u01c8"+
		"\u01c9\7h\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb\7t\2\2\u01cb\60\3\2\2\2\u01cc"+
		"\u01cd\7k\2\2\u01cd\u01ce\7h\2\2\u01ce\62\3\2\2\2\u01cf\u01d0\7i\2\2\u01d0"+
		"\u01d1\7q\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7q\2\2\u01d3\64\3\2\2\2\u01d4"+
		"\u01d5\7k\2\2\u01d5\u01d6\7o\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8\7n\2\2"+
		"\u01d8\u01d9\7g\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7g\2\2\u01db\u01dc"+
		"\7p\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7u\2\2\u01de\66\3\2\2\2\u01df\u01e0"+
		"\7k\2\2\u01e0\u01e1\7o\2\2\u01e1\u01e2\7r\2\2\u01e2\u01e3\7q\2\2\u01e3"+
		"\u01e4\7t\2\2\u01e4\u01e5\7v\2\2\u01e58\3\2\2\2\u01e6\u01e7\7k\2\2\u01e7"+
		"\u01e8\7p\2\2\u01e8\u01e9\7u\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7c\2\2"+
		"\u01eb\u01ec\7p\2\2\u01ec\u01ed\7e\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef"+
		"\7q\2\2\u01ef\u01f0\7h\2\2\u01f0:\3\2\2\2\u01f1\u01f2\7k\2\2\u01f2\u01f3"+
		"\7p\2\2\u01f3\u01f4\7v\2\2\u01f4<\3\2\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7"+
		"\7p\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7t\2\2\u01fa"+
		"\u01fb\7h\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd\7e\2\2\u01fd\u01fe\7g\2\2"+
		"\u01fe>\3\2\2\2\u01ff\u0200\7n\2\2\u0200\u0201\7q\2\2\u0201\u0202\7p\2"+
		"\2\u0202\u0203\7i\2\2\u0203@\3\2\2\2\u0204\u0205\7p\2\2\u0205\u0206\7"+
		"c\2\2\u0206\u0207\7v\2\2\u0207\u0208\7k\2\2\u0208\u0209\7x\2\2\u0209\u020a"+
		"\7g\2\2\u020aB\3\2\2\2\u020b\u020c\7p\2\2\u020c\u020d\7g\2\2\u020d\u020e"+
		"\7y\2\2\u020eD\3\2\2\2\u020f\u0210\7r\2\2\u0210\u0211\7c\2\2\u0211\u0212"+
		"\7e\2\2\u0212\u0213\7m\2\2\u0213\u0214\7c\2\2\u0214\u0215\7i\2\2\u0215"+
		"\u0216\7g\2\2\u0216F\3\2\2\2\u0217\u0218\7r\2\2\u0218\u0219\7t\2\2\u0219"+
		"\u021a\7k\2\2\u021a\u021b\7x\2\2\u021b\u021c\7c\2\2\u021c\u021d\7v\2\2"+
		"\u021d\u021e\7g\2\2\u021eH\3\2\2\2\u021f\u0220\7r\2\2\u0220\u0221\7t\2"+
		"\2\u0221\u0222\7q\2\2\u0222\u0223\7v\2\2\u0223\u0224\7g\2\2\u0224\u0225"+
		"\7e\2\2\u0225\u0226\7v\2\2\u0226\u0227\7g\2\2\u0227\u0228\7f\2\2\u0228"+
		"J\3\2\2\2\u0229\u022a\7r\2\2\u022a\u022b\7w\2\2\u022b\u022c\7d\2\2\u022c"+
		"\u022d\7n\2\2\u022d\u022e\7k\2\2\u022e\u022f\7e\2\2\u022fL\3\2\2\2\u0230"+
		"\u0231\7t\2\2\u0231\u0232\7g\2\2\u0232\u0233\7v\2\2\u0233\u0234\7w\2\2"+
		"\u0234\u0235\7t\2\2\u0235\u0236\7p\2\2\u0236N\3\2\2\2\u0237\u0238\7u\2"+
		"\2\u0238\u0239\7j\2\2\u0239\u023a\7q\2\2\u023a\u023b\7t\2\2\u023b\u023c"+
		"\7v\2\2\u023cP\3\2\2\2\u023d\u023e\7u\2\2\u023e\u023f\7v\2\2\u023f\u0240"+
		"\7c\2\2\u0240\u0241\7v\2\2\u0241\u0242\7k\2\2\u0242\u0243\7e\2\2\u0243"+
		"R\3\2\2\2\u0244\u0245\7u\2\2\u0245\u0246\7v\2\2\u0246\u0247\7t\2\2\u0247"+
		"\u0248\7k\2\2\u0248\u0249\7e\2\2\u0249\u024a\7v\2\2\u024a\u024b\7h\2\2"+
		"\u024b\u024c\7r\2\2\u024cT\3\2\2\2\u024d\u024e\7U\2\2\u024e\u024f\7v\2"+
		"\2\u024f\u0250\7t\2\2\u0250\u0251\7k\2\2\u0251\u0252\7p\2\2\u0252\u0253"+
		"\7i\2\2\u0253V\3\2\2\2\u0254\u0255\7u\2\2\u0255\u0256\7w\2\2\u0256\u0257"+
		"\7r\2\2\u0257\u0258\7g\2\2\u0258\u0259\7t\2\2\u0259X\3\2\2\2\u025a\u025b"+
		"\7u\2\2\u025b\u025c\7y\2\2\u025c\u025d\7k\2\2\u025d\u025e\7v\2\2\u025e"+
		"\u025f\7e\2\2\u025f\u0260\7j\2\2\u0260Z\3\2\2\2\u0261\u0262\7u\2\2\u0262"+
		"\u0263\7{\2\2\u0263\u0264\7p\2\2\u0264\u0265\7e\2\2\u0265\u0266\7j\2\2"+
		"\u0266\u0267\7t\2\2\u0267\u0268\7q\2\2\u0268\u0269\7p\2\2\u0269\u026a"+
		"\7k\2\2\u026a\u026b\7|\2\2\u026b\u026c\7g\2\2\u026c\u026d\7f\2\2\u026d"+
		"\\\3\2\2\2\u026e\u026f\7v\2\2\u026f\u0270\7j\2\2\u0270\u0271\7k\2\2\u0271"+
		"\u0272\7u\2\2\u0272^\3\2\2\2\u0273\u0274\7v\2\2\u0274\u0275\7j\2\2\u0275"+
		"\u0276\7t\2\2\u0276\u0277\7q\2\2\u0277\u0278\7y\2\2\u0278`\3\2\2\2\u0279"+
		"\u027a\7v\2\2\u027a\u027b\7j\2\2\u027b\u027c\7t\2\2\u027c\u027d\7q\2\2"+
		"\u027d\u027e\7y\2\2\u027e\u027f\7u\2\2\u027fb\3\2\2\2\u0280\u0281\7v\2"+
		"\2\u0281\u0282\7t\2\2\u0282\u0283\7c\2\2\u0283\u0284\7p\2\2\u0284\u0285"+
		"\7u\2\2\u0285\u0286\7k\2\2\u0286\u0287\7g\2\2\u0287\u0288\7p\2\2\u0288"+
		"\u0289\7v\2\2\u0289d\3\2\2\2\u028a\u028b\7v\2\2\u028b\u028c\7t\2\2\u028c"+
		"\u028d\7{\2\2\u028df\3\2\2\2\u028e\u028f\7x\2\2\u028f\u0290\7q\2\2\u0290"+
		"\u0291\7k\2\2\u0291\u0292\7f\2\2\u0292h\3\2\2\2\u0293\u0294\7x\2\2\u0294"+
		"\u0295\7q\2\2\u0295\u0296\7n\2\2\u0296\u0297\7c\2\2\u0297\u0298\7v\2\2"+
		"\u0298\u0299\7k\2\2\u0299\u029a\7n\2\2\u029a\u029b\7g\2\2\u029bj\3\2\2"+
		"\2\u029c\u029d\7y\2\2\u029d\u029e\7j\2\2\u029e\u029f\7k\2\2\u029f\u02a0"+
		"\7n\2\2\u02a0\u02a1\7g\2\2\u02a1l\3\2\2\2\u02a2\u02a3\7q\2\2\u02a3\u02a4"+
		"\7w\2\2\u02a4\u02a5\7v\2\2\u02a5\u02a6\7r\2\2\u02a6\u02a7\7w\2\2\u02a7"+
		"\u02a8\7v\2\2\u02a8n\3\2\2\2\u02a9\u02aa\7q\2\2\u02aa\u02ab\7w\2\2\u02ab"+
		"\u02ac\7v\2\2\u02ac\u02ad\7r\2\2\u02ad\u02ae\7w\2\2\u02ae\u02af\7v\2\2"+
		"\u02af\u02b0\7n\2\2\u02b0\u02b1\7p\2\2\u02b1p\3\2\2\2\u02b2\u02b3\7k\2"+
		"\2\u02b3\u02b4\7p\2\2\u02b4\u02b5\7r\2\2\u02b5\u02b6\7w\2\2\u02b6\u02b7"+
		"\7v\2\2\u02b7r\3\2\2\2\u02b8\u02ba\t\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bct\3\2\2\2\u02bd"+
		"\u02be\t\3\2\2\u02bev\3\2\2\2\u02bf\u02c4\5y=\2\u02c0\u02c2\5}?\2\u02c1"+
		"\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\5y"+
		"=\2\u02c4\u02c1\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5x\3\2\2\2\u02c6\u02c9"+
		"\7\62\2\2\u02c7\u02c9\5{>\2\u02c8\u02c6\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9"+
		"z\3\2\2\2\u02ca\u02cb\t\4\2\2\u02cb|\3\2\2\2\u02cc\u02ce\5\177@\2\u02cd"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0~\3\2\2\2\u02d1\u02d4\5y=\2\u02d2\u02d4\7a\2\2\u02d3\u02d1\3"+
		"\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u0080\3\2\2\2\u02d5\u02d7\7a\2\2\u02d6"+
		"\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u0082\3\2\2\2\u02da\u02db\7\62\2\2\u02db\u02dc\t\5\2\2\u02dc"+
		"\u02dd\5\u0085C\2\u02dd\u0084\3\2\2\2\u02de\u02e3\5\u0087D\2\u02df\u02e1"+
		"\5\u0089E\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2"+
		"\2\u02e2\u02e4\5\u0087D\2\u02e3\u02e0\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u0086\3\2\2\2\u02e5\u02e6\t\6\2\2\u02e6\u0088\3\2\2\2\u02e7\u02e9\5\u008b"+
		"F\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u008a\3\2\2\2\u02ec\u02ef\5\u0087D\2\u02ed\u02ef"+
		"\7a\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u008c\3\2\2\2\u02f0"+
		"\u02f2\7\62\2\2\u02f1\u02f3\5\u0081A\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\5\u008fH\2\u02f5\u008e\3\2\2"+
		"\2\u02f6\u02fb\5\u0091I\2\u02f7\u02f9\5\u0093J\2\u02f8\u02f7\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\5\u0091I\2\u02fb\u02f8"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0090\3\2\2\2\u02fd\u02fe\t\7\2\2\u02fe"+
		"\u0092\3\2\2\2\u02ff\u0301\5\u0095K\2\u0300\u02ff\3\2\2\2\u0301\u0302"+
		"\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0094\3\2\2\2\u0304"+
		"\u0307\5\u0091I\2\u0305\u0307\7a\2\2\u0306\u0304\3\2\2\2\u0306\u0305\3"+
		"\2\2\2\u0307\u0096\3\2\2\2\u0308\u0309\7\62\2\2\u0309\u030a\t\b\2\2\u030a"+
		"\u030b\5\u0099M\2\u030b\u0098\3\2\2\2\u030c\u0311\5\u009bN\2\u030d\u030f"+
		"\5\u009dO\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2"+
		"\2\u0310\u0312\5\u009bN\2\u0311\u030e\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u009a\3\2\2\2\u0313\u0314\t\t\2\2\u0314\u009c\3\2\2\2\u0315\u0317\5\u009f"+
		"P\2\u0316\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u009e\3\2\2\2\u031a\u031d\5\u009bN\2\u031b\u031d"+
		"\7a\2\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u00a0\3\2\2\2\u031e"+
		"\u0321\5\u00a3R\2\u031f\u0321\5\u00afX\2\u0320\u031e\3\2\2\2\u0320\u031f"+
		"\3\2\2\2\u0321\u00a2\3\2\2\2\u0322\u0323\5w<\2\u0323\u0325\7\60\2\2\u0324"+
		"\u0326\5w<\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2"+
		"\2\u0327\u0329\5\u00a5S\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032b\3\2\2\2\u032a\u032c\5\u00adW\2\u032b\u032a\3\2\2\2\u032b\u032c"+
		"\3\2\2\2\u032c\u033e\3\2\2\2\u032d\u032e\7\60\2\2\u032e\u0330\5w<\2\u032f"+
		"\u0331\5\u00a5S\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u0334\5\u00adW\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2"+
		"\2\u0334\u033e\3\2\2\2\u0335\u0336\5w<\2\u0336\u0338\5\u00a5S\2\u0337"+
		"\u0339\5\u00adW\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033e"+
		"\3\2\2\2\u033a\u033b\5w<\2\u033b\u033c\5\u00adW\2\u033c\u033e\3\2\2\2"+
		"\u033d\u0322\3\2\2\2\u033d\u032d\3\2\2\2\u033d\u0335\3\2\2\2\u033d\u033a"+
		"\3\2\2\2\u033e\u00a4\3\2\2\2\u033f\u0340\5\u00a7T\2\u0340\u0341\5\u00a9"+
		"U\2\u0341\u00a6\3\2\2\2\u0342\u0343\t\n\2\2\u0343\u00a8\3\2\2\2\u0344"+
		"\u0346\5\u00abV\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347"+
		"\3\2\2\2\u0347\u0348\5w<\2\u0348\u00aa\3\2\2\2\u0349\u034a\t\13\2\2\u034a"+
		"\u00ac\3\2\2\2\u034b\u034c\t\f\2\2\u034c\u00ae\3\2\2\2\u034d\u034e\5\u00b1"+
		"Y\2\u034e\u0350\5\u00b3Z\2\u034f\u0351\5\u00adW\2\u0350\u034f\3\2\2\2"+
		"\u0350\u0351\3\2\2\2\u0351\u00b0\3\2\2\2\u0352\u0354\5\u0083B\2\u0353"+
		"\u0355\7\60\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u035e\3"+
		"\2\2\2\u0356\u0357\7\62\2\2\u0357\u0359\t\5\2\2\u0358\u035a\5\u0085C\2"+
		"\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c"+
		"\7\60\2\2\u035c\u035e\5\u0085C\2\u035d\u0352\3\2\2\2\u035d\u0356\3\2\2"+
		"\2\u035e\u00b2\3\2\2\2\u035f\u0360\5\u00b5[\2\u0360\u0361\5\u00a9U\2\u0361"+
		"\u00b4\3\2\2\2\u0362\u0363\t\r\2\2\u0363\u00b6\3\2\2\2\u0364\u0365\7v"+
		"\2\2\u0365\u0366\7t\2\2\u0366\u0367\7w\2\2\u0367\u036e\7g\2\2\u0368\u0369"+
		"\7h\2\2\u0369\u036a\7c\2\2\u036a\u036b\7n\2\2\u036b\u036c\7u\2\2\u036c"+
		"\u036e\7g\2\2\u036d\u0364\3\2\2\2\u036d\u0368\3\2\2\2\u036e\u00b8\3\2"+
		"\2\2\u036f\u0370\7)\2\2\u0370\u0371\5\u00bb^\2\u0371\u0372\7)\2\2\u0372"+
		"\u0378\3\2\2\2\u0373\u0374\7)\2\2\u0374\u0375\5\u00c3b\2\u0375\u0376\7"+
		")\2\2\u0376\u0378\3\2\2\2\u0377\u036f\3\2\2\2\u0377\u0373\3\2\2\2\u0378"+
		"\u00ba\3\2\2\2\u0379\u037a\n\16\2\2\u037a\u00bc\3\2\2\2\u037b\u037d\7"+
		"$\2\2\u037c\u037e\5\u00bf`\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0380\7$\2\2\u0380\u00be\3\2\2\2\u0381\u0383\5\u00c1"+
		"a\2\u0382\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0382\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u00c0\3\2\2\2\u0386\u0389\n\17\2\2\u0387\u0389\5"+
		"\u00c3b\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389\u00c2\3\2\2\2"+
		"\u038a\u038b\7^\2\2\u038b\u038e\t\20\2\2\u038c\u038e\5\u00c5c\2\u038d"+
		"\u038a\3\2\2\2\u038d\u038c\3\2\2\2\u038e\u00c4\3\2\2\2\u038f\u0390\7^"+
		"\2\2\u0390\u039b\5\u0091I\2\u0391\u0392\7^\2\2\u0392\u0393\5\u0091I\2"+
		"\u0393\u0394\5\u0091I\2\u0394\u039b\3\2\2\2\u0395\u0396\7^\2\2\u0396\u0397"+
		"\5\u00c7d\2\u0397\u0398\5\u0091I\2\u0398\u0399\5\u0091I\2\u0399\u039b"+
		"\3\2\2\2\u039a\u038f\3\2\2\2\u039a\u0391\3\2\2\2\u039a\u0395\3\2\2\2\u039b"+
		"\u00c6\3\2\2\2\u039c\u039d\t\21\2\2\u039d\u00c8\3\2\2\2\u039e\u039f\7"+
		"p\2\2\u039f\u03a0\7w\2\2\u03a0\u03a1\7n\2\2\u03a1\u03a2\7n\2\2\u03a2\u00ca"+
		"\3\2\2\2\u03a3\u03a4\7*\2\2\u03a4\u00cc\3\2\2\2\u03a5\u03a6\7+\2\2\u03a6"+
		"\u00ce\3\2\2\2\u03a7\u03a8\7}\2\2\u03a8\u00d0\3\2\2\2\u03a9\u03aa\7\177"+
		"\2\2\u03aa\u00d2\3\2\2\2\u03ab\u03ac\7]\2\2\u03ac\u00d4\3\2\2\2\u03ad"+
		"\u03ae\7_\2\2\u03ae\u00d6\3\2\2\2\u03af\u03b0\7=\2\2\u03b0\u00d8\3\2\2"+
		"\2\u03b1\u03b2\7.\2\2\u03b2\u00da\3\2\2\2\u03b3\u03b4\7\60\2\2\u03b4\u00dc"+
		"\3\2\2\2\u03b5\u03b6\7?\2\2\u03b6\u00de\3\2\2\2\u03b7\u03b8\7@\2\2\u03b8"+
		"\u00e0\3\2\2\2\u03b9\u03ba\7>\2\2\u03ba\u00e2\3\2\2\2\u03bb\u03bc\7#\2"+
		"\2\u03bc\u00e4\3\2\2\2\u03bd\u03be\7\u0080\2\2\u03be\u00e6\3\2\2\2\u03bf"+
		"\u03c0\7A\2\2\u03c0\u00e8\3\2\2\2\u03c1\u03c2\7<\2\2\u03c2\u00ea\3\2\2"+
		"\2\u03c3\u03c4\7?\2\2\u03c4\u03c5\7?\2\2\u03c5\u00ec\3\2\2\2\u03c6\u03c7"+
		"\7>\2\2\u03c7\u03c8\7?\2\2\u03c8\u00ee\3\2\2\2\u03c9\u03ca\7@\2\2\u03ca"+
		"\u03cb\7?\2\2\u03cb\u00f0\3\2\2\2\u03cc\u03cd\7#\2\2\u03cd\u03ce\7?\2"+
		"\2\u03ce\u00f2\3\2\2\2\u03cf\u03d0\7(\2\2\u03d0\u03d1\7(\2\2\u03d1\u00f4"+
		"\3\2\2\2\u03d2\u03d3\7~\2\2\u03d3\u03d4\7~\2\2\u03d4\u00f6\3\2\2\2\u03d5"+
		"\u03d6\7-\2\2\u03d6\u03d7\7-\2\2\u03d7\u00f8\3\2\2\2\u03d8\u03d9\7/\2"+
		"\2\u03d9\u03da\7/\2\2\u03da\u00fa\3\2\2\2\u03db\u03dc\7-\2\2\u03dc\u00fc"+
		"\3\2\2\2\u03dd\u03de\7/\2\2\u03de\u00fe\3\2\2\2\u03df\u03e0\7,\2\2\u03e0"+
		"\u0100\3\2\2\2\u03e1\u03e2\7\61\2\2\u03e2\u0102\3\2\2\2\u03e3\u03e4\7"+
		"(\2\2\u03e4\u0104\3\2\2\2\u03e5\u03e6\7~\2\2\u03e6\u0106\3\2\2\2\u03e7"+
		"\u03e8\7`\2\2\u03e8\u0108\3\2\2\2\u03e9\u03ea\7\'\2\2\u03ea\u010a\3\2"+
		"\2\2\u03eb\u03ec\7-\2\2\u03ec\u03ed\7?\2\2\u03ed\u010c\3\2\2\2\u03ee\u03ef"+
		"\7/\2\2\u03ef\u03f0\7?\2\2\u03f0\u010e\3\2\2\2\u03f1\u03f2\7,\2\2\u03f2"+
		"\u03f3\7?\2\2\u03f3\u0110\3\2\2\2\u03f4\u03f5\7\61\2\2\u03f5\u03f6\7?"+
		"\2\2\u03f6\u0112\3\2\2\2\u03f7\u03f8\7(\2\2\u03f8\u03f9\7?\2\2\u03f9\u0114"+
		"\3\2\2\2\u03fa\u03fb\7~\2\2\u03fb\u03fc\7?\2\2\u03fc\u0116\3\2\2\2\u03fd"+
		"\u03fe\7`\2\2\u03fe\u03ff\7?\2\2\u03ff\u0118\3\2\2\2\u0400\u0401\7\'\2"+
		"\2\u0401\u0402\7?\2\2\u0402\u011a\3\2\2\2\u0403\u0404\7>\2\2\u0404\u0405"+
		"\7>\2\2\u0405\u0406\7?\2\2\u0406\u011c\3\2\2\2\u0407\u0408\7@\2\2\u0408"+
		"\u0409\7@\2\2\u0409\u040a\7?\2\2\u040a\u011e\3\2\2\2\u040b\u040c\7@\2"+
		"\2\u040c\u040d\7@\2\2\u040d\u040e\7@\2\2\u040e\u040f\7?\2\2\u040f\u0120"+
		"\3\2\2\2\u0410\u0414\5\u0123\u0092\2\u0411\u0413\5\u0125\u0093\2\u0412"+
		"\u0411\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2"+
		"\2\2\u0415\u0122\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u041e\t\22\2\2\u0418"+
		"\u0419\n\23\2\2\u0419\u041e\6\u0092\2\2\u041a\u041b\t\24\2\2\u041b\u041c"+
		"\t\25\2\2\u041c\u041e\6\u0092\3\2\u041d\u0417\3\2\2\2\u041d\u0418\3\2"+
		"\2\2\u041d\u041a\3\2\2\2\u041e\u0124\3\2\2\2\u041f\u0426\t\26\2\2\u0420"+
		"\u0421\n\23\2\2\u0421\u0426\6\u0093\4\2\u0422\u0423\t\24\2\2\u0423\u0424"+
		"\t\25\2\2\u0424\u0426\6\u0093\5\2\u0425\u041f\3\2\2\2\u0425\u0420\3\2"+
		"\2\2\u0425\u0422\3\2\2\2\u0426\u0126\3\2\2\2\u0427\u0428\7B\2\2\u0428"+
		"\u0128\3\2\2\2\u0429\u042a\7\60\2\2\u042a\u042b\7\60\2\2\u042b\u042c\7"+
		"\60\2\2\u042c\u012a\3\2\2\2\u042d\u042f\t\27\2\2\u042e\u042d\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2"+
		"\2\2\u0432\u0433\b\u0096\2\2\u0433\u012c\3\2\2\2\u0434\u0435\7\61\2\2"+
		"\u0435\u0436\7,\2\2\u0436\u043a\3\2\2\2\u0437\u0439\13\2\2\2\u0438\u0437"+
		"\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b"+
		"\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\7,\2\2\u043e\u043f\7\61"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0441\b\u0097\2\2\u0441\u012e\3\2\2\2\u0442"+
		"\u0443\7\61\2\2\u0443\u0444\7\61\2\2\u0444\u0448\3\2\2\2\u0445\u0447\n"+
		"\30\2\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\b\u0098"+
		"\2\2\u044c\u0130\3\2\2\2\61\2\u02bb\u02c1\u02c4\u02c8\u02cf\u02d3\u02d8"+
		"\u02e0\u02e3\u02ea\u02ee\u02f2\u02f8\u02fb\u0302\u0306\u030e\u0311\u0318"+
		"\u031c\u0320\u0325\u0328\u032b\u0330\u0333\u0338\u033d\u0345\u0350\u0354"+
		"\u0359\u035d\u036d\u0377\u037d\u0384\u0388\u038d\u039a\u0414\u041d\u0425"+
		"\u0430\u043a\u0448\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}