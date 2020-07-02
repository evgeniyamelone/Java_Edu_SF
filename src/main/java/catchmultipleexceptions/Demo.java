package catchmultipleexceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator = scanner.nextInt();
        System.out.println("Enter denominator:");
        int denominator = scanner.nextInt();

        try {
            System.out.println("Result = " + Arithmetic.divide(numerator, denominator));

        } catch (EqualNumbersException | InvalidInputParamException | ResultZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}