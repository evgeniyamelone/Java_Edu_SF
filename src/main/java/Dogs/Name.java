package Dogs;

import java.util.Scanner;

class Name {
    private String[] arrName;

    Name() {
    }

    String getRandomDogName() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Specify names of dogs (use space for separation): ");
        String str = s1.nextLine();
        String[] arrName = str.split(" ");
        int x = arrName.length;
        int rand = (int) (Math.random() * x);
        return arrName[rand];


    }
}
