package objectsBasicsMandatoryPracticalTasks.Dogs;

import java.util.Scanner;

class Size {
    private String[] arrSize;

    String[] inputSize(boolean dummy) {
        if (dummy) {
            String[] dummySizes= {"small", "medium", "big"};
            return dummySizes;
        }
        Scanner s1 = new Scanner(System.in);
        System.out.print("Specify sizes of dogs: small/medium/big (use space for separation): ");
        String str = s1.nextLine();
        String[] arrSize = str.split(" ");
        return arrSize;
    }

    String getSize(String[] arrSize) {
        int x = arrSize.length;
        int rand = (int) (Math.random() * x);
        return arrSize[rand];
    }
}
