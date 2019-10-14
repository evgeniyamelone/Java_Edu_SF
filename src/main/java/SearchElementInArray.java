
import java.util.Scanner;
import java.util.Random;

public class SearchElementInArray {
    public static void main(String[] args) {
        // array size
        Scanner s1 = new Scanner(System.in);
        System.out.print("Input array size: ");
        int arraySize = s1.nextInt();
        //Generate a random array of integers of provided size and print it
        Random rd = new Random();
        int arr[] = new int[arraySize];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = rd.nextInt();
            System.out.println(arr[n]);
        }
        // a number to search in the array
        Scanner s2 = new Scanner(System.in);
        System.out.print("Input search number: ");
        System.out.print(" ");
        int elementToSearch = s2.nextInt();

        //int linear = linearSearch( arr[ arraySize],elementToSearch );
    }

    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
}




