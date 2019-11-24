package MathUtil;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        int power = 7;

        int[] intArray = {-22, 6, 800, 9, 11, 3, 19, 1, 5};
        System.out.println("Given array: " + Arrays.toString(intArray));
        System.out.println("Max number in array = " + mathUtil.max(intArray));
        System.out.println("Min number in array = " + mathUtil.min(intArray));
        System.out.println("First number from the array = " + mathUtil.nextAfter(intArray, 6));
        System.out.println("Value of the first argument (" + intArray[0] + ") raised to the power (" + power + ") = " + mathUtil.pow(intArray, power));

        double[] doubleArray = {1.1, 5.11, 120.6, 9.8, 1.32, 87.0, 16.4, 401.2, 55.9};
        System.out.println("\nGiven array: " + Arrays.toString(doubleArray));
        System.out.println("Max number in array = " + mathUtil.max(doubleArray));
        System.out.println("Min number in array = " + mathUtil.min(doubleArray));
        System.out.println("First number from the array = " + mathUtil.nextAfter(doubleArray, 130.88));
        System.out.println("Value of the first argument (" + doubleArray[0] + ") raised to the power (" + power + ") = " + mathUtil.pow(doubleArray, power));
    }
}



