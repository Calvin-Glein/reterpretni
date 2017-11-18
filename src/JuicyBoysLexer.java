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
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "IntegerTypeSuffix", 
		"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "ZeroToThree", "NullLiteral", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
		case 138:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 139:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2k\u040d\b\1\4\2\t"+
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\6\64\u027a\n\64\r\64\16\64\u027b\3\65\3\65\3\66\3\66\5\66\u0282"+
		"\n\66\3\66\5\66\u0285\n\66\3\67\3\67\5\67\u0289\n\67\38\38\39\69\u028e"+
		"\n9\r9\169\u028f\3:\3:\5:\u0294\n:\3;\6;\u0297\n;\r;\16;\u0298\3<\3<\3"+
		"<\3<\3=\3=\5=\u02a1\n=\3=\5=\u02a4\n=\3>\3>\3?\6?\u02a9\n?\r?\16?\u02aa"+
		"\3@\3@\5@\u02af\n@\3A\3A\5A\u02b3\nA\3A\3A\3B\3B\5B\u02b9\nB\3B\5B\u02bc"+
		"\nB\3C\3C\3D\6D\u02c1\nD\rD\16D\u02c2\3E\3E\5E\u02c7\nE\3F\3F\3F\3F\3"+
		"G\3G\5G\u02cf\nG\3G\5G\u02d2\nG\3H\3H\3I\6I\u02d7\nI\rI\16I\u02d8\3J\3"+
		"J\5J\u02dd\nJ\3K\3K\5K\u02e1\nK\3L\3L\3L\5L\u02e6\nL\3L\5L\u02e9\nL\3"+
		"L\5L\u02ec\nL\3L\3L\3L\5L\u02f1\nL\3L\5L\u02f4\nL\3L\3L\3L\5L\u02f9\n"+
		"L\3L\3L\3L\5L\u02fe\nL\3M\3M\3M\3N\3N\3O\5O\u0306\nO\3O\3O\3P\3P\3Q\3"+
		"Q\3R\3R\3R\5R\u0311\nR\3S\3S\5S\u0315\nS\3S\3S\3S\5S\u031a\nS\3S\3S\5"+
		"S\u031e\nS\3T\3T\3T\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u032e\nV\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\5W\u0338\nW\3X\3X\3Y\3Y\5Y\u033e\nY\3Y\3Y\3Z\6Z\u0343"+
		"\nZ\rZ\16Z\u0344\3[\3[\5[\u0349\n[\3\\\3\\\3\\\5\\\u034e\n\\\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\5]\u035b\n]\3^\3^\3_\3_\3_\3_\3_\3`\3`\3a\3a"+
		"\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m"+
		"\3m\3n\3n\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u"+
		"\3v\3v\3v\3w\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\7\u008b\u03d3\n\u008b\f\u008b\16\u008b\u03d6"+
		"\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u03de"+
		"\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u03e6"+
		"\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\6\u0090"+
		"\u03ef\n\u0090\r\u0090\16\u0090\u03f0\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\7\u0091\u03f9\n\u0091\f\u0091\16\u0091\u03fc\13\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\7\u0092\u0407\n\u0092\f\u0092\16\u0092\u040a\13\u0092\3\u0092\3\u0092"+
		"\3\u03fa\2\u0093\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\66\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\67\u00ad8\u00af\2\u00b19\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd"+
		":\u00bf;\u00c1<\u00c3=\u00c5>\u00c7?\u00c9@\u00cbA\u00cdB\u00cfC\u00d1"+
		"D\u00d3E\u00d5F\u00d7G\u00d9H\u00dbI\u00ddJ\u00dfK\u00e1L\u00e3M\u00e5"+
		"N\u00e7O\u00e9P\u00ebQ\u00edR\u00efS\u00f1T\u00f3U\u00f5V\u00f7W\u00f9"+
		"X\u00fbY\u00fdZ\u00ff[\u0101\\\u0103]\u0105^\u0107_\u0109`\u010ba\u010d"+
		"b\u010fc\u0111d\u0113e\u0115f\u0117\2\u0119\2\u011bg\u011dh\u011fi\u0121"+
		"j\u0123k\3\2\31\3\2\62;\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4"+
		"\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2"+
		"\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f"+
		"\f\17\17\2\u0417\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00b1\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2"+
		"\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5"+
		"\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2"+
		"\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107"+
		"\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2"+
		"\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u011b\3\2\2\2\2\u011d"+
		"\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\3\u0125\3\2\2"+
		"\2\5\u012e\3\2\2\2\7\u0135\3\2\2\2\t\u013d\3\2\2\2\13\u0143\3\2\2\2\r"+
		"\u0148\3\2\2\2\17\u014d\3\2\2\2\21\u0153\3\2\2\2\23\u0158\3\2\2\2\25\u015e"+
		"\3\2\2\2\27\u0164\3\2\2\2\31\u016d\3\2\2\2\33\u0175\3\2\2\2\35\u0178\3"+
		"\2\2\2\37\u017f\3\2\2\2!\u0184\3\2\2\2#\u0189\3\2\2\2%\u0191\3\2\2\2\'"+
		"\u0197\3\2\2\2)\u019f\3\2\2\2+\u01a5\3\2\2\2-\u01a9\3\2\2\2/\u01ac\3\2"+
		"\2\2\61\u01b1\3\2\2\2\63\u01bc\3\2\2\2\65\u01c3\3\2\2\2\67\u01ce\3\2\2"+
		"\29\u01d2\3\2\2\2;\u01dc\3\2\2\2=\u01e1\3\2\2\2?\u01e8\3\2\2\2A\u01ec"+
		"\3\2\2\2C\u01f4\3\2\2\2E\u01fc\3\2\2\2G\u0206\3\2\2\2I\u020d\3\2\2\2K"+
		"\u0214\3\2\2\2M\u021a\3\2\2\2O\u0221\3\2\2\2Q\u022a\3\2\2\2S\u0230\3\2"+
		"\2\2U\u0237\3\2\2\2W\u0244\3\2\2\2Y\u0249\3\2\2\2[\u024f\3\2\2\2]\u0256"+
		"\3\2\2\2_\u0260\3\2\2\2a\u0264\3\2\2\2c\u0269\3\2\2\2e\u0272\3\2\2\2g"+
		"\u0279\3\2\2\2i\u027d\3\2\2\2k\u027f\3\2\2\2m\u0288\3\2\2\2o\u028a\3\2"+
		"\2\2q\u028d\3\2\2\2s\u0293\3\2\2\2u\u0296\3\2\2\2w\u029a\3\2\2\2y\u029e"+
		"\3\2\2\2{\u02a5\3\2\2\2}\u02a8\3\2\2\2\177\u02ae\3\2\2\2\u0081\u02b0\3"+
		"\2\2\2\u0083\u02b6\3\2\2\2\u0085\u02bd\3\2\2\2\u0087\u02c0\3\2\2\2\u0089"+
		"\u02c6\3\2\2\2\u008b\u02c8\3\2\2\2\u008d\u02cc\3\2\2\2\u008f\u02d3\3\2"+
		"\2\2\u0091\u02d6\3\2\2\2\u0093\u02dc\3\2\2\2\u0095\u02e0\3\2\2\2\u0097"+
		"\u02fd\3\2\2\2\u0099\u02ff\3\2\2\2\u009b\u0302\3\2\2\2\u009d\u0305\3\2"+
		"\2\2\u009f\u0309\3\2\2\2\u00a1\u030b\3\2\2\2\u00a3\u030d\3\2\2\2\u00a5"+
		"\u031d\3\2\2\2\u00a7\u031f\3\2\2\2\u00a9\u0322\3\2\2\2\u00ab\u032d\3\2"+
		"\2\2\u00ad\u0337\3\2\2\2\u00af\u0339\3\2\2\2\u00b1\u033b\3\2\2\2\u00b3"+
		"\u0342\3\2\2\2\u00b5\u0348\3\2\2\2\u00b7\u034d\3\2\2\2\u00b9\u035a\3\2"+
		"\2\2\u00bb\u035c\3\2\2\2\u00bd\u035e\3\2\2\2\u00bf\u0363\3\2\2\2\u00c1"+
		"\u0365\3\2\2\2\u00c3\u0367\3\2\2\2\u00c5\u0369\3\2\2\2\u00c7\u036b\3\2"+
		"\2\2\u00c9\u036d\3\2\2\2\u00cb\u036f\3\2\2\2\u00cd\u0371\3\2\2\2\u00cf"+
		"\u0373\3\2\2\2\u00d1\u0375\3\2\2\2\u00d3\u0377\3\2\2\2\u00d5\u0379\3\2"+
		"\2\2\u00d7\u037b\3\2\2\2\u00d9\u037d\3\2\2\2\u00db\u037f\3\2\2\2\u00dd"+
		"\u0381\3\2\2\2\u00df\u0383\3\2\2\2\u00e1\u0386\3\2\2\2\u00e3\u0389\3\2"+
		"\2\2\u00e5\u038c\3\2\2\2\u00e7\u038f\3\2\2\2\u00e9\u0392\3\2\2\2\u00eb"+
		"\u0395\3\2\2\2\u00ed\u0398\3\2\2\2\u00ef\u039b\3\2\2\2\u00f1\u039d\3\2"+
		"\2\2\u00f3\u039f\3\2\2\2\u00f5\u03a1\3\2\2\2\u00f7\u03a3\3\2\2\2\u00f9"+
		"\u03a5\3\2\2\2\u00fb\u03a7\3\2\2\2\u00fd\u03a9\3\2\2\2\u00ff\u03ab\3\2"+
		"\2\2\u0101\u03ae\3\2\2\2\u0103\u03b1\3\2\2\2\u0105\u03b4\3\2\2\2\u0107"+
		"\u03b7\3\2\2\2\u0109\u03ba\3\2\2\2\u010b\u03bd\3\2\2\2\u010d\u03c0\3\2"+
		"\2\2\u010f\u03c3\3\2\2\2\u0111\u03c7\3\2\2\2\u0113\u03cb\3\2\2\2\u0115"+
		"\u03d0\3\2\2\2\u0117\u03dd\3\2\2\2\u0119\u03e5\3\2\2\2\u011b\u03e7\3\2"+
		"\2\2\u011d\u03e9\3\2\2\2\u011f\u03ee\3\2\2\2\u0121\u03f4\3\2\2\2\u0123"+
		"\u0402\3\2\2\2\u0125\u0126\7c\2\2\u0126\u0127\7d\2\2\u0127\u0128\7u\2"+
		"\2\u0128\u0129\7v\2\2\u0129\u012a\7t\2\2\u012a\u012b\7c\2\2\u012b\u012c"+
		"\7e\2\2\u012c\u012d\7v\2\2\u012d\4\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130"+
		"\7u\2\2\u0130\u0131\7u\2\2\u0131\u0132\7g\2\2\u0132\u0133\7t\2\2\u0133"+
		"\u0134\7v\2\2\u0134\6\3\2\2\2\u0135\u0136\7d\2\2\u0136\u0137\7q\2\2\u0137"+
		"\u0138\7q\2\2\u0138\u0139\7n\2\2\u0139\u013a\7g\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7p\2\2\u013c\b\3\2\2\2\u013d\u013e\7d\2\2\u013e\u013f\7t"+
		"\2\2\u013f\u0140\7g\2\2\u0140\u0141\7c\2\2\u0141\u0142\7m\2\2\u0142\n"+
		"\3\2\2\2\u0143\u0144\7d\2\2\u0144\u0145\7{\2\2\u0145\u0146\7v\2\2\u0146"+
		"\u0147\7g\2\2\u0147\f\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7c\2\2\u014a"+
		"\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\16\3\2\2\2\u014d\u014e\7e\2\2\u014e"+
		"\u014f\7c\2\2\u014f\u0150\7v\2\2\u0150\u0151\7e\2\2\u0151\u0152\7j\2\2"+
		"\u0152\20\3\2\2\2\u0153\u0154\7e\2\2\u0154\u0155\7j\2\2\u0155\u0156\7"+
		"c\2\2\u0156\u0157\7t\2\2\u0157\22\3\2\2\2\u0158\u0159\7e\2\2\u0159\u015a"+
		"\7n\2\2\u015a\u015b\7c\2\2\u015b\u015c\7u\2\2\u015c\u015d\7u\2\2\u015d"+
		"\24\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160\7q\2\2\u0160\u0161\7p\2\2\u0161"+
		"\u0162\7u\2\2\u0162\u0163\7v\2\2\u0163\26\3\2\2\2\u0164\u0165\7e\2\2\u0165"+
		"\u0166\7q\2\2\u0166\u0167\7p\2\2\u0167\u0168\7v\2\2\u0168\u0169\7k\2\2"+
		"\u0169\u016a\7p\2\2\u016a\u016b\7w\2\2\u016b\u016c\7g\2\2\u016c\30\3\2"+
		"\2\2\u016d\u016e\7f\2\2\u016e\u016f\7g\2\2\u016f\u0170\7h\2\2\u0170\u0171"+
		"\7c\2\2\u0171\u0172\7w\2\2\u0172\u0173\7n\2\2\u0173\u0174\7v\2\2\u0174"+
		"\32\3\2\2\2\u0175\u0176\7f\2\2\u0176\u0177\7q\2\2\u0177\34\3\2\2\2\u0178"+
		"\u0179\7f\2\2\u0179\u017a\7q\2\2\u017a\u017b\7w\2\2\u017b\u017c\7d\2\2"+
		"\u017c\u017d\7n\2\2\u017d\u017e\7g\2\2\u017e\36\3\2\2\2\u017f\u0180\7"+
		"g\2\2\u0180\u0181\7n\2\2\u0181\u0182\7u\2\2\u0182\u0183\7g\2\2\u0183 "+
		"\3\2\2\2\u0184\u0185\7g\2\2\u0185\u0186\7p\2\2\u0186\u0187\7w\2\2\u0187"+
		"\u0188\7o\2\2\u0188\"\3\2\2\2\u0189\u018a\7g\2\2\u018a\u018b\7z\2\2\u018b"+
		"\u018c\7v\2\2\u018c\u018d\7g\2\2\u018d\u018e\7p\2\2\u018e\u018f\7f\2\2"+
		"\u018f\u0190\7u\2\2\u0190$\3\2\2\2\u0191\u0192\7h\2\2\u0192\u0193\7k\2"+
		"\2\u0193\u0194\7p\2\2\u0194\u0195\7c\2\2\u0195\u0196\7n\2\2\u0196&\3\2"+
		"\2\2\u0197\u0198\7h\2\2\u0198\u0199\7k\2\2\u0199\u019a\7p\2\2\u019a\u019b"+
		"\7c\2\2\u019b\u019c\7n\2\2\u019c\u019d\7n\2\2\u019d\u019e\7{\2\2\u019e"+
		"(\3\2\2\2\u019f\u01a0\7h\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7q\2\2\u01a2"+
		"\u01a3\7c\2\2\u01a3\u01a4\7v\2\2\u01a4*\3\2\2\2\u01a5\u01a6\7h\2\2\u01a6"+
		"\u01a7\7q\2\2\u01a7\u01a8\7t\2\2\u01a8,\3\2\2\2\u01a9\u01aa\7k\2\2\u01aa"+
		"\u01ab\7h\2\2\u01ab.\3\2\2\2\u01ac\u01ad\7i\2\2\u01ad\u01ae\7q\2\2\u01ae"+
		"\u01af\7v\2\2\u01af\u01b0\7q\2\2\u01b0\60\3\2\2\2\u01b1\u01b2\7k\2\2\u01b2"+
		"\u01b3\7o\2\2\u01b3\u01b4\7r\2\2\u01b4\u01b5\7n\2\2\u01b5\u01b6\7g\2\2"+
		"\u01b6\u01b7\7o\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7p\2\2\u01b9\u01ba"+
		"\7v\2\2\u01ba\u01bb\7u\2\2\u01bb\62\3\2\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be"+
		"\7o\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7t\2\2\u01c1"+
		"\u01c2\7v\2\2\u01c2\64\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7p\2\2\u01c5"+
		"\u01c6\7u\2\2\u01c6\u01c7\7v\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7p\2\2"+
		"\u01c9\u01ca\7e\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd"+
		"\7h\2\2\u01cd\66\3\2\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1"+
		"\7v\2\2\u01d18\3\2\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d5"+
		"\7v\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7h\2\2\u01d8"+
		"\u01d9\7c\2\2\u01d9\u01da\7e\2\2\u01da\u01db\7g\2\2\u01db:\3\2\2\2\u01dc"+
		"\u01dd\7n\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7p\2\2\u01df\u01e0\7i\2\2"+
		"\u01e0<\3\2\2\2\u01e1\u01e2\7p\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7v\2"+
		"\2\u01e4\u01e5\7k\2\2\u01e5\u01e6\7x\2\2\u01e6\u01e7\7g\2\2\u01e7>\3\2"+
		"\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7y\2\2\u01eb@\3"+
		"\2\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7e\2\2\u01ef"+
		"\u01f0\7m\2\2\u01f0\u01f1\7c\2\2\u01f1\u01f2\7i\2\2\u01f2\u01f3\7g\2\2"+
		"\u01f3B\3\2\2\2\u01f4\u01f5\7r\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7k\2"+
		"\2\u01f7\u01f8\7x\2\2\u01f8\u01f9\7c\2\2\u01f9\u01fa\7v\2\2\u01fa\u01fb"+
		"\7g\2\2\u01fbD\3\2\2\2\u01fc\u01fd\7r\2\2\u01fd\u01fe\7t\2\2\u01fe\u01ff"+
		"\7q\2\2\u01ff\u0200\7v\2\2\u0200\u0201\7g\2\2\u0201\u0202\7e\2\2\u0202"+
		"\u0203\7v\2\2\u0203\u0204\7g\2\2\u0204\u0205\7f\2\2\u0205F\3\2\2\2\u0206"+
		"\u0207\7r\2\2\u0207\u0208\7w\2\2\u0208\u0209\7d\2\2\u0209\u020a\7n\2\2"+
		"\u020a\u020b\7k\2\2\u020b\u020c\7e\2\2\u020cH\3\2\2\2\u020d\u020e\7t\2"+
		"\2\u020e\u020f\7g\2\2\u020f\u0210\7v\2\2\u0210\u0211\7w\2\2\u0211\u0212"+
		"\7t\2\2\u0212\u0213\7p\2\2\u0213J\3\2\2\2\u0214\u0215\7u\2\2\u0215\u0216"+
		"\7j\2\2\u0216\u0217\7q\2\2\u0217\u0218\7t\2\2\u0218\u0219\7v\2\2\u0219"+
		"L\3\2\2\2\u021a\u021b\7u\2\2\u021b\u021c\7v\2\2\u021c\u021d\7c\2\2\u021d"+
		"\u021e\7v\2\2\u021e\u021f\7k\2\2\u021f\u0220\7e\2\2\u0220N\3\2\2\2\u0221"+
		"\u0222\7u\2\2\u0222\u0223\7v\2\2\u0223\u0224\7t\2\2\u0224\u0225\7k\2\2"+
		"\u0225\u0226\7e\2\2\u0226\u0227\7v\2\2\u0227\u0228\7h\2\2\u0228\u0229"+
		"\7r\2\2\u0229P\3\2\2\2\u022a\u022b\7u\2\2\u022b\u022c\7w\2\2\u022c\u022d"+
		"\7r\2\2\u022d\u022e\7g\2\2\u022e\u022f\7t\2\2\u022fR\3\2\2\2\u0230\u0231"+
		"\7u\2\2\u0231\u0232\7y\2\2\u0232\u0233\7k\2\2\u0233\u0234\7v\2\2\u0234"+
		"\u0235\7e\2\2\u0235\u0236\7j\2\2\u0236T\3\2\2\2\u0237\u0238\7u\2\2\u0238"+
		"\u0239\7{\2\2\u0239\u023a\7p\2\2\u023a\u023b\7e\2\2\u023b\u023c\7j\2\2"+
		"\u023c\u023d\7t\2\2\u023d\u023e\7q\2\2\u023e\u023f\7p\2\2\u023f\u0240"+
		"\7k\2\2\u0240\u0241\7|\2\2\u0241\u0242\7g\2\2\u0242\u0243\7f\2\2\u0243"+
		"V\3\2\2\2\u0244\u0245\7v\2\2\u0245\u0246\7j\2\2\u0246\u0247\7k\2\2\u0247"+
		"\u0248\7u\2\2\u0248X\3\2\2\2\u0249\u024a\7v\2\2\u024a\u024b\7j\2\2\u024b"+
		"\u024c\7t\2\2\u024c\u024d\7q\2\2\u024d\u024e\7y\2\2\u024eZ\3\2\2\2\u024f"+
		"\u0250\7v\2\2\u0250\u0251\7j\2\2\u0251\u0252\7t\2\2\u0252\u0253\7q\2\2"+
		"\u0253\u0254\7y\2\2\u0254\u0255\7u\2\2\u0255\\\3\2\2\2\u0256\u0257\7v"+
		"\2\2\u0257\u0258\7t\2\2\u0258\u0259\7c\2\2\u0259\u025a\7p\2\2\u025a\u025b"+
		"\7u\2\2\u025b\u025c\7k\2\2\u025c\u025d\7g\2\2\u025d\u025e\7p\2\2\u025e"+
		"\u025f\7v\2\2\u025f^\3\2\2\2\u0260\u0261\7v\2\2\u0261\u0262\7t\2\2\u0262"+
		"\u0263\7{\2\2\u0263`\3\2\2\2\u0264\u0265\7x\2\2\u0265\u0266\7q\2\2\u0266"+
		"\u0267\7k\2\2\u0267\u0268\7f\2\2\u0268b\3\2\2\2\u0269\u026a\7x\2\2\u026a"+
		"\u026b\7q\2\2\u026b\u026c\7n\2\2\u026c\u026d\7c\2\2\u026d\u026e\7v\2\2"+
		"\u026e\u026f\7k\2\2\u026f\u0270\7n\2\2\u0270\u0271\7g\2\2\u0271d\3\2\2"+
		"\2\u0272\u0273\7y\2\2\u0273\u0274\7j\2\2\u0274\u0275\7k\2\2\u0275\u0276"+
		"\7n\2\2\u0276\u0277\7g\2\2\u0277f\3\2\2\2\u0278\u027a\t\2\2\2\u0279\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"h\3\2\2\2\u027d\u027e\t\3\2\2\u027ej\3\2\2\2\u027f\u0284\5m\67\2\u0280"+
		"\u0282\5q9\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2"+
		"\2\u0283\u0285\5m\67\2\u0284\u0281\3\2\2\2\u0284\u0285\3\2\2\2\u0285l"+
		"\3\2\2\2\u0286\u0289\7\62\2\2\u0287\u0289\5o8\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0287\3\2\2\2\u0289n\3\2\2\2\u028a\u028b\t\4\2\2\u028bp\3\2\2\2\u028c"+
		"\u028e\5s:\2\u028d\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u028d\3\2\2"+
		"\2\u028f\u0290\3\2\2\2\u0290r\3\2\2\2\u0291\u0294\5m\67\2\u0292\u0294"+
		"\7a\2\2\u0293\u0291\3\2\2\2\u0293\u0292\3\2\2\2\u0294t\3\2\2\2\u0295\u0297"+
		"\7a\2\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299v\3\2\2\2\u029a\u029b\7\62\2\2\u029b\u029c\t\5\2\2"+
		"\u029c\u029d\5y=\2\u029dx\3\2\2\2\u029e\u02a3\5{>\2\u029f\u02a1\5}?\2"+
		"\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4"+
		"\5{>\2\u02a3\u02a0\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4z\3\2\2\2\u02a5\u02a6"+
		"\t\6\2\2\u02a6|\3\2\2\2\u02a7\u02a9\5\177@\2\u02a8\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab~\3\2\2\2"+
		"\u02ac\u02af\5{>\2\u02ad\u02af\7a\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02af\u0080\3\2\2\2\u02b0\u02b2\7\62\2\2\u02b1\u02b3\5u;\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\5\u0083"+
		"B\2\u02b5\u0082\3\2\2\2\u02b6\u02bb\5\u0085C\2\u02b7\u02b9\5\u0087D\2"+
		"\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc"+
		"\5\u0085C\2\u02bb\u02b8\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u0084\3\2\2"+
		"\2\u02bd\u02be\t\7\2\2\u02be\u0086\3\2\2\2\u02bf\u02c1\5\u0089E\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u0088\3\2\2\2\u02c4\u02c7\5\u0085C\2\u02c5\u02c7\7a\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u008a\3\2\2\2\u02c8\u02c9\7\62"+
		"\2\2\u02c9\u02ca\t\b\2\2\u02ca\u02cb\5\u008dG\2\u02cb\u008c\3\2\2\2\u02cc"+
		"\u02d1\5\u008fH\2\u02cd\u02cf\5\u0091I\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\5\u008fH\2\u02d1\u02ce\3\2\2"+
		"\2\u02d1\u02d2\3\2\2\2\u02d2\u008e\3\2\2\2\u02d3\u02d4\t\t\2\2\u02d4\u0090"+
		"\3\2\2\2\u02d5\u02d7\5\u0093J\2\u02d6\u02d5\3\2\2\2\u02d7\u02d8\3\2\2"+
		"\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u0092\3\2\2\2\u02da\u02dd"+
		"\5\u008fH\2\u02db\u02dd\7a\2\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2"+
		"\u02dd\u0094\3\2\2\2\u02de\u02e1\5\u0097L\2\u02df\u02e1\5\u00a3R\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1\u0096\3\2\2\2\u02e2\u02e3\5k"+
		"\66\2\u02e3\u02e5\7\60\2\2\u02e4\u02e6\5k\66\2\u02e5\u02e4\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e9\5\u0099M\2\u02e8\u02e7"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02ec\5\u00a1Q"+
		"\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02fe\3\2\2\2\u02ed\u02ee"+
		"\7\60\2\2\u02ee\u02f0\5k\66\2\u02ef\u02f1\5\u0099M\2\u02f0\u02ef\3\2\2"+
		"\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f4\5\u00a1Q\2\u02f3"+
		"\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fe\3\2\2\2\u02f5\u02f6\5k"+
		"\66\2\u02f6\u02f8\5\u0099M\2\u02f7\u02f9\5\u00a1Q\2\u02f8\u02f7\3\2\2"+
		"\2\u02f8\u02f9\3\2\2\2\u02f9\u02fe\3\2\2\2\u02fa\u02fb\5k\66\2\u02fb\u02fc"+
		"\5\u00a1Q\2\u02fc\u02fe\3\2\2\2\u02fd\u02e2\3\2\2\2\u02fd\u02ed\3\2\2"+
		"\2\u02fd\u02f5\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fe\u0098\3\2\2\2\u02ff\u0300"+
		"\5\u009bN\2\u0300\u0301\5\u009dO\2\u0301\u009a\3\2\2\2\u0302\u0303\t\n"+
		"\2\2\u0303\u009c\3\2\2\2\u0304\u0306\5\u009fP\2\u0305\u0304\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\5k\66\2\u0308\u009e\3\2"+
		"\2\2\u0309\u030a\t\13\2\2\u030a\u00a0\3\2\2\2\u030b\u030c\t\f\2\2\u030c"+
		"\u00a2\3\2\2\2\u030d\u030e\5\u00a5S\2\u030e\u0310\5\u00a7T\2\u030f\u0311"+
		"\5\u00a1Q\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u00a4\3\2\2"+
		"\2\u0312\u0314\5w<\2\u0313\u0315\7\60\2\2\u0314\u0313\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u031e\3\2\2\2\u0316\u0317\7\62\2\2\u0317\u0319\t\5\2\2"+
		"\u0318\u031a\5y=\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b"+
		"\3\2\2\2\u031b\u031c\7\60\2\2\u031c\u031e\5y=\2\u031d\u0312\3\2\2\2\u031d"+
		"\u0316\3\2\2\2\u031e\u00a6\3\2\2\2\u031f\u0320\5\u00a9U\2\u0320\u0321"+
		"\5\u009dO\2\u0321\u00a8\3\2\2\2\u0322\u0323\t\r\2\2\u0323\u00aa\3\2\2"+
		"\2\u0324\u0325\7v\2\2\u0325\u0326\7t\2\2\u0326\u0327\7w\2\2\u0327\u032e"+
		"\7g\2\2\u0328\u0329\7h\2\2\u0329\u032a\7c\2\2\u032a\u032b\7n\2\2\u032b"+
		"\u032c\7u\2\2\u032c\u032e\7g\2\2\u032d\u0324\3\2\2\2\u032d\u0328\3\2\2"+
		"\2\u032e\u00ac\3\2\2\2\u032f\u0330\7)\2\2\u0330\u0331\5\u00afX\2\u0331"+
		"\u0332\7)\2\2\u0332\u0338\3\2\2\2\u0333\u0334\7)\2\2\u0334\u0335\5\u00b7"+
		"\\\2\u0335\u0336\7)\2\2\u0336\u0338\3\2\2\2\u0337\u032f\3\2\2\2\u0337"+
		"\u0333\3\2\2\2\u0338\u00ae\3\2\2\2\u0339\u033a\n\16\2\2\u033a\u00b0\3"+
		"\2\2\2\u033b\u033d\7$\2\2\u033c\u033e\5\u00b3Z\2\u033d\u033c\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\7$\2\2\u0340\u00b2\3\2"+
		"\2\2\u0341\u0343\5\u00b5[\2\u0342\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u00b4\3\2\2\2\u0346\u0349\n\17"+
		"\2\2\u0347\u0349\5\u00b7\\\2\u0348\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349"+
		"\u00b6\3\2\2\2\u034a\u034b\7^\2\2\u034b\u034e\t\20\2\2\u034c\u034e\5\u00b9"+
		"]\2\u034d\u034a\3\2\2\2\u034d\u034c\3\2\2\2\u034e\u00b8\3\2\2\2\u034f"+
		"\u0350\7^\2\2\u0350\u035b\5\u0085C\2\u0351\u0352\7^\2\2\u0352\u0353\5"+
		"\u0085C\2\u0353\u0354\5\u0085C\2\u0354\u035b\3\2\2\2\u0355\u0356\7^\2"+
		"\2\u0356\u0357\5\u00bb^\2\u0357\u0358\5\u0085C\2\u0358\u0359\5\u0085C"+
		"\2\u0359\u035b\3\2\2\2\u035a\u034f\3\2\2\2\u035a\u0351\3\2\2\2\u035a\u0355"+
		"\3\2\2\2\u035b\u00ba\3\2\2\2\u035c\u035d\t\21\2\2\u035d\u00bc\3\2\2\2"+
		"\u035e\u035f\7p\2\2\u035f\u0360\7w\2\2\u0360\u0361\7n\2\2\u0361\u0362"+
		"\7n\2\2\u0362\u00be\3\2\2\2\u0363\u0364\7*\2\2\u0364\u00c0\3\2\2\2\u0365"+
		"\u0366\7+\2\2\u0366\u00c2\3\2\2\2\u0367\u0368\7}\2\2\u0368\u00c4\3\2\2"+
		"\2\u0369\u036a\7\177\2\2\u036a\u00c6\3\2\2\2\u036b\u036c\7]\2\2\u036c"+
		"\u00c8\3\2\2\2\u036d\u036e\7_\2\2\u036e\u00ca\3\2\2\2\u036f\u0370\7=\2"+
		"\2\u0370\u00cc\3\2\2\2\u0371\u0372\7.\2\2\u0372\u00ce\3\2\2\2\u0373\u0374"+
		"\7\60\2\2\u0374\u00d0\3\2\2\2\u0375\u0376\7?\2\2\u0376\u00d2\3\2\2\2\u0377"+
		"\u0378\7@\2\2\u0378\u00d4\3\2\2\2\u0379\u037a\7>\2\2\u037a\u00d6\3\2\2"+
		"\2\u037b\u037c\7#\2\2\u037c\u00d8\3\2\2\2\u037d\u037e\7\u0080\2\2\u037e"+
		"\u00da\3\2\2\2\u037f\u0380\7A\2\2\u0380\u00dc\3\2\2\2\u0381\u0382\7<\2"+
		"\2\u0382\u00de\3\2\2\2\u0383\u0384\7?\2\2\u0384\u0385\7?\2\2\u0385\u00e0"+
		"\3\2\2\2\u0386\u0387\7>\2\2\u0387\u0388\7?\2\2\u0388\u00e2\3\2\2\2\u0389"+
		"\u038a\7@\2\2\u038a\u038b\7?\2\2\u038b\u00e4\3\2\2\2\u038c\u038d\7#\2"+
		"\2\u038d\u038e\7?\2\2\u038e\u00e6\3\2\2\2\u038f\u0390\7(\2\2\u0390\u0391"+
		"\7(\2\2\u0391\u00e8\3\2\2\2\u0392\u0393\7~\2\2\u0393\u0394\7~\2\2\u0394"+
		"\u00ea\3\2\2\2\u0395\u0396\7-\2\2\u0396\u0397\7-\2\2\u0397\u00ec\3\2\2"+
		"\2\u0398\u0399\7/\2\2\u0399\u039a\7/\2\2\u039a\u00ee\3\2\2\2\u039b\u039c"+
		"\7-\2\2\u039c\u00f0\3\2\2\2\u039d\u039e\7/\2\2\u039e\u00f2\3\2\2\2\u039f"+
		"\u03a0\7,\2\2\u03a0\u00f4\3\2\2\2\u03a1\u03a2\7\61\2\2\u03a2\u00f6\3\2"+
		"\2\2\u03a3\u03a4\7(\2\2\u03a4\u00f8\3\2\2\2\u03a5\u03a6\7~\2\2\u03a6\u00fa"+
		"\3\2\2\2\u03a7\u03a8\7`\2\2\u03a8\u00fc\3\2\2\2\u03a9\u03aa\7\'\2\2\u03aa"+
		"\u00fe\3\2\2\2\u03ab\u03ac\7-\2\2\u03ac\u03ad\7?\2\2\u03ad\u0100\3\2\2"+
		"\2\u03ae\u03af\7/\2\2\u03af\u03b0\7?\2\2\u03b0\u0102\3\2\2\2\u03b1\u03b2"+
		"\7,\2\2\u03b2\u03b3\7?\2\2\u03b3\u0104\3\2\2\2\u03b4\u03b5\7\61\2\2\u03b5"+
		"\u03b6\7?\2\2\u03b6\u0106\3\2\2\2\u03b7\u03b8\7(\2\2\u03b8\u03b9\7?\2"+
		"\2\u03b9\u0108\3\2\2\2\u03ba\u03bb\7~\2\2\u03bb\u03bc\7?\2\2\u03bc\u010a"+
		"\3\2\2\2\u03bd\u03be\7`\2\2\u03be\u03bf\7?\2\2\u03bf\u010c\3\2\2\2\u03c0"+
		"\u03c1\7\'\2\2\u03c1\u03c2\7?\2\2\u03c2\u010e\3\2\2\2\u03c3\u03c4\7>\2"+
		"\2\u03c4\u03c5\7>\2\2\u03c5\u03c6\7?\2\2\u03c6\u0110\3\2\2\2\u03c7\u03c8"+
		"\7@\2\2\u03c8\u03c9\7@\2\2\u03c9\u03ca\7?\2\2\u03ca\u0112\3\2\2\2\u03cb"+
		"\u03cc\7@\2\2\u03cc\u03cd\7@\2\2\u03cd\u03ce\7@\2\2\u03ce\u03cf\7?\2\2"+
		"\u03cf\u0114\3\2\2\2\u03d0\u03d4\5\u0117\u008c\2\u03d1\u03d3\5\u0119\u008d"+
		"\2\u03d2\u03d1\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u0116\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03de\t\22\2\2"+
		"\u03d8\u03d9\n\23\2\2\u03d9\u03de\6\u008c\2\2\u03da\u03db\t\24\2\2\u03db"+
		"\u03dc\t\25\2\2\u03dc\u03de\6\u008c\3\2\u03dd\u03d7\3\2\2\2\u03dd\u03d8"+
		"\3\2\2\2\u03dd\u03da\3\2\2\2\u03de\u0118\3\2\2\2\u03df\u03e6\t\26\2\2"+
		"\u03e0\u03e1\n\23\2\2\u03e1\u03e6\6\u008d\4\2\u03e2\u03e3\t\24\2\2\u03e3"+
		"\u03e4\t\25\2\2\u03e4\u03e6\6\u008d\5\2\u03e5\u03df\3\2\2\2\u03e5\u03e0"+
		"\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e6\u011a\3\2\2\2\u03e7\u03e8\7B\2\2\u03e8"+
		"\u011c\3\2\2\2\u03e9\u03ea\7\60\2\2\u03ea\u03eb\7\60\2\2\u03eb\u03ec\7"+
		"\60\2\2\u03ec\u011e\3\2\2\2\u03ed\u03ef\t\27\2\2\u03ee\u03ed\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u03f3\b\u0090\2\2\u03f3\u0120\3\2\2\2\u03f4\u03f5\7\61\2\2"+
		"\u03f5\u03f6\7,\2\2\u03f6\u03fa\3\2\2\2\u03f7\u03f9\13\2\2\2\u03f8\u03f7"+
		"\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb"+
		"\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03fe\7,\2\2\u03fe\u03ff\7\61"+
		"\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\b\u0091\2\2\u0401\u0122\3\2\2\2\u0402"+
		"\u0403\7\61\2\2\u0403\u0404\7\61\2\2\u0404\u0408\3\2\2\2\u0405\u0407\n"+
		"\30\2\2\u0406\u0405\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2\2\2\u0408"+
		"\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u0408\3\2\2\2\u040b\u040c\b\u0092"+
		"\2\2\u040c\u0124\3\2\2\2\61\2\u027b\u0281\u0284\u0288\u028f\u0293\u0298"+
		"\u02a0\u02a3\u02aa\u02ae\u02b2\u02b8\u02bb\u02c2\u02c6\u02ce\u02d1\u02d8"+
		"\u02dc\u02e0\u02e5\u02e8\u02eb\u02f0\u02f3\u02f8\u02fd\u0305\u0310\u0314"+
		"\u0319\u031d\u032d\u0337\u033d\u0344\u0348\u034d\u035a\u03d4\u03dd\u03e5"+
		"\u03f0\u03fa\u0408\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}