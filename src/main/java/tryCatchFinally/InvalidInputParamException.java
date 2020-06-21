package tryCatchFinally;

public class InvalidInputParamException extends ArithmeticException {
    private String exceptionString;

    public InvalidInputParamException(String exceptionString) {
        this.exceptionString = exceptionString;
    }

    public String getExceptionString() {
        return exceptionString;
    }
}