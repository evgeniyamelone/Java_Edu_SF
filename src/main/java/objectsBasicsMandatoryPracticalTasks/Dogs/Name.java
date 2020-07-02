package objectsBasicsMandatoryPracticalTasks.Dogs;

import java.util.Scanner;

class Name {
    private String[] arrName;

    String[] inputName(boolean dummy) {
        if (dummy) {
            String[] dummyNames= {"Dummy1", "Trex", "Waffle", "Superb"};
            return dummyNames;
        }
        Scanner s1 = new Scanner(System.in);
        System.out.print("Specify names of dogs (use space for separation): ");
        String str = s1.nextLine();
        String[] arrName = str.split(" ");
        return arrName;
    }

    String getRandomDogName(String[] arrName) {
        int x = arrName.length;
        int rand = (int) (Math.random() * x);
        return arrName[rand];
    }
}
