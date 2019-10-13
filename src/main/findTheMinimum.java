package main;

public class findTheMinimum {
    public static void main(String[] args) {
        int minOfTwo = getTwoMinimum(100, 111);
        int minOfThree = getThreeMinimum(5, 11, 1);
        int minOfFour = getFourMinimum(1111, 1, 0, 2);
        System.out.println("Minimum of two = " + minOfTwo);
        System.out.println("Minimum of three = " + minOfThree);
        System.out.println("Minimum of four = " + minOfFour);
    }

    public static int getTwoMinimum(int a, int b) {
        int min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return min;
    }

    public static int getThreeMinimum(int a, int b, int c) {
        int min = getTwoMinimum(getTwoMinimum(a, b), c);
        return min;
    }

    public static int getFourMinimum(int a, int b, int c, int d) {
        int min1 = getThreeMinimum(a, b, c);
        int min2 = (getTwoMinimum(min1, d));
        return min2;
    }
}
