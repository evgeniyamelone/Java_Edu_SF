package exceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println("\nInput index of array's element need to be printed out: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        boolean continueLoop = true;

        ArrayActions arrayBound = new ArrayActions();
        do {
            boolean successInput = arrayBound.checkIndex(arr, index);
            if (successInput) {
                continueLoop = false;
            } else {
                index = scanner.nextInt();
            }
        } while (continueLoop);
    }
}

