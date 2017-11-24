public class ErrorObject {
    public int lineNumber, characterPosition;
    public String specificError;

    public ErrorObject(int lineNumber, int characterPosition, String specificError) {
        this.lineNumber = lineNumber;
        this.characterPosition = characterPosition;
        this.specificError = specificError;
    }

    public int getLineNumber() {

        return lineNumber;
    }

    public int getCharacterPosition() {
        return characterPosition;
    }

    public String getSpecificError() {
        return specificError;
    }
}
