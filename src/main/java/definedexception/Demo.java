package definedexception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator = scanner.nextInt();
        System.out.println("Enter denominator:");
        int denominator = scanner.nextInt();

        try {
            if (denominator == 0) {
                throw new Exception("Division by zero");
            }
            System.out.println("Result = " + divide(numerator, denominator));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block called");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
