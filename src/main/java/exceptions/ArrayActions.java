package exceptions;

public class ArrayActions {

    public static boolean checkIndex(int arr[], int index) {
        try {
            System.out.println("\nElement with " + index + " is: ");
            System.out.println(arr[index]);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exeption: " + e);
            System.out.println("Only index less than 4 allowed");
            return false;
        }
    }
}


