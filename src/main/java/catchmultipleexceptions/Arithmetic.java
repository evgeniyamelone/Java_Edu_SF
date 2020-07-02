package catchmultipleexceptions;


public class Arithmetic {

    public static int divide(int numerator, int denominator) throws InvalidInputParamException, EqualNumbersException, ResultZeroException {
        if (denominator == 0)
            throw new InvalidInputParamException("Denominator can't be zero");
        else if (denominator > numerator)
            throw new ResultZeroException("Denominator can't be greater than numerator");
        else if (denominator == numerator)
            throw new EqualNumbersException("Denominator can't be equal to numerator");
        else
            return numerator / denominator;
    }
}
