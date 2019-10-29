package objectsBasicsMandatoryPracticalTasks.Dogs;

import java.util.Scanner;

class Age {
    private String[] arrAge;

    String[] inputAge() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Specify age of dogs from 1 to 21 (use space for separation): ");
        String str = s1.nextLine();
        String[] arrAge = str.split(" ");
        return arrAge;
    }

    String getRandomDogAge(String[] arrAge) {
        int x = arrAge.length;
        int rand = (int) (Math.random() * x);
        return arrAge[rand];
    }
}
