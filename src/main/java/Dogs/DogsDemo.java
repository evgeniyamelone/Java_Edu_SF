package Dogs;

import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
//        Scanner s1 = new Scanner(System.in);
//        System.out.print("Specify the number of dogs and names/age/size for as many dogs as you want (divided by space): ");
//        String str = s1.nextLine();
        String str = "10 test TEST big";

        // split to array
        String delimeter = " ";
        String[] splitedStr = str.split(delimeter);

        //convert number of dogs to int;
        int numberOfDogs = Integer.parseInt(splitedStr[0]);

        //create array
        String[] arrDogs = new String[3];
       // for (int i = 1; i <= numberOfDogs; i++) {
            Name tempName = new Name();
            String dogName = tempName.getDogName();
            arrDogs[0] = dogName;
            Age tempAge = new Age();
            int intDogAge = tempAge.getDogsAge();
            String dogAge = Integer.toString(intDogAge);
            arrDogs[1] = dogAge;
            Size dogTempSize = new Size();
            String dogSize = dogTempSize.getSize();
            arrDogs[2] = dogSize;
            System.out.print(arrDogs[0]);
            System.out.print(" " + arrDogs[1]);
            System.out.print(" " + arrDogs[2]);
        //    i++;
        }
    }
//}
//        Name dogName = new Name();
//        dogName.getDogName();
//        Age dogAge = new Age();
//        dogAge.getDogsAge();
