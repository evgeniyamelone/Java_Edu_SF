package tryCatchFinally;

public class Arithmetic {

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) throw new InvalidInputParamException("Denominator can't be zero");
        return numerator / denominator;
    }
}
