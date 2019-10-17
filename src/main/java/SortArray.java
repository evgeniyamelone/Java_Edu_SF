import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
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

        System.out.println(Arrays.toString(bubble(arr)));
        System.out.println(Arrays.toString(selection(arr)));
    }

    public static int[] bubble(int[] arrToSort) {
        int count = arrToSort.length * arrToSort.length;
        do {
            for (int i = 0; i < arrToSort.length - 1; i++) {
                if (arrToSort[i] > arrToSort[i + 1]) {
                    int temp = arrToSort[i];
                    arrToSort[i] = arrToSort[i + 1];
                    arrToSort[i + 1] = temp;
                }
            }
            count--;
        } while (count > 0);
        return arrToSort;
    }

    public static int[] selection(int[] arrToSort) {
        int minIndex;
        for (int i = 0; i < arrToSort.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arrToSort.length; j++) {
                if (arrToSort[j] < arrToSort[minIndex]) {
                    j = minIndex;
                }
                int temp = arrToSort[minIndex];
                arrToSort[minIndex] = arrToSort[i];
                arrToSort[i] = temp;
            }
        }
        return arrToSort;
    }
}
