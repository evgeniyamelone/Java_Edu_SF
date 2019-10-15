
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SearchElementInArray {
    public static void main(String[] args) {
        // input array size in console
        Scanner s1 = new Scanner(System.in);
        System.out.print("Input array size: ");
        int arraySize = s1.nextInt();

        //Generate a random array of integers of provided size and print it
        int arr[] = new int[arraySize];
        Random randomNumber = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber.nextInt(1000);
            System.out.println(arr[i]);
        }

        // a number to search in the array
        Scanner s2 = new Scanner(System.in);
        System.out.print("\nInput search number: ");
        int elementToSearch = s2.nextInt();

        // method and measure time execution
        long startLinear = System.nanoTime();
        System.out.println("\nLinear search number is present in array: " + linearSearch(arr, elementToSearch));
        long endLinear = System.nanoTime();
        long linearTimeExecution = endLinear - startLinear;

        Arrays.sort(arr);
        long startBinary = System.nanoTime();
        System.out.println("Binary search number is present in array: " + binarySearch(arr, elementToSearch));
        long endBinary = System.nanoTime();
        long binaryTimeExecution = endBinary - startBinary;

        System.out.println("\nLinear Search takes " + linearTimeExecution + "ms");
        System.out.println("Binary Search takes " + binaryTimeExecution + "ms");
    }

    public static boolean linearSearch(int[] arr, int i) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == i)
                return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int i) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (i < arr[middleIndex] - 1) {
                highIndex = middleIndex - 1;
            } else if (i > arr[middleIndex]) {
                lowIndex = middleIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}






