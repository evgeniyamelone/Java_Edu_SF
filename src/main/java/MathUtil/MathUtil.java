package MathUtil;

public class MathUtil {
    public int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double max(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int nextAfter(int[] array, int number) {
        int nextAfter = 0;
        if (number > max(array)) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > number) {
                    nextAfter = array[i];
                }
            }
            return nextAfter;
        }
    }
}




