package trycatchfinally;

public class InvalidInputParamException extends ArithmeticException {
    private String exceptionString;

    public InvalidInputParamException(String exceptionString) {
        super(exceptionString);
        this.exceptionString = exceptionString;
    }

    public String getExceptionString() {
        return exceptionString;
    }
}
