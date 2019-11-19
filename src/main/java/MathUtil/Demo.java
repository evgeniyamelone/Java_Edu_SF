package MathUtil;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        int[] array = {1, 6, 800, 9, 11, 3, 19, 1, 5};
        System.out.println("Given array: " + array);
        System.out.println("Max number in array: " + mathUtil.max(array));
        System.out.println("Max number in array: " + mathUtil.min(array));
        System.out.println(mathUtil.nextAfter(array, 6));
    }
}