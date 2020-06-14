package catchMultipleExeptions;


public class InvalidInputParamException extends Exception {

    public InvalidInputParamException(String exceptionString) {
        super(exceptionString);
    }
}
