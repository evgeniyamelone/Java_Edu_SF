package exceptions;

public class ArrayActions {

    public static boolean checkIndex(int arr[], int index) {
        try {
            String.format("Element with index %s is %s", index, arr[index]);
            System.out.println(arr[index]);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Only index less than 4 allowed");
            return false;
        }
    }
}


