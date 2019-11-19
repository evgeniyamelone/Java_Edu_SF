package MathUtil;

class MathUtil {
    int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    double max(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int nextAfter(int[] array, int number) {
        int nextAfter = 0;
        if (number > max(array)) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > number) {
                    nextAfter = array[i];
                    {
                        break;
                    }
                }
            }
            return nextAfter;
        }
    }

    double nextAfter(double[] array, double number) {
        double nextAfter = 0;
        if (number > max(array)) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > number) {
                    nextAfter = array[i];
                    {
                        break;
                    }
                }
            }
            return nextAfter;
        }
    }

    int pow(int[] array, int power) {
        int result = array[0];
        int i = 1;
        while (i < power) {
            result = result * array[0];
            i++;
        }
        return result;
    }

    double pow(double[] array, int power) {
        double result = array[0];
        int i = 1;
        while (i < power) {
            result = result * array[0];
            i++;
        }
        return result;
    }
}




