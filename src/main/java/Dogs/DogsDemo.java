package Dogs;

import java.util.Arrays;
import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Specify the number of dogs: ");
        String str = s1.nextLine();
//        String delimeter = " ";
//        String[] splitedStr = str.split(delimeter);

        Name dogName = new Name();
        String name = dogName.getRandomDogName();

        Age dogAge = new Age();
        String age = dogAge.getRandomDogAge();

        Dog[] dogAny = new Dog[];
        System.out.println(Arrays.toString(dogAny.getDog(name, age)));

        //        System.out.println(name);
//        System.out.println(age);


        //  String str = "10 Harry 15 big";

//        // split to array
//        String delimeter = " ";
//        String[] splitedStr = str.split(delimeter);
//
//        //dogs quantity
//        int dogsQuantity = Integer.parseInt(splitedStr[0]);
//        System.out.println("\n" + dogsQuantity);
//
//        String[] dogs = new String[dogsQuantity];
//        dogs = splitedStr;
//        System.out.print(Arrays.toString(dogs));


        // print out dogs l


//        int i = 0;
//        while (i < dogsQuantity) {
//            for (int k = 1; k < splitedStr.length; k++) {
//                System.out.print(splitedStr[k] + " ");
//            }
//            i++;
//        }
//        String[] arrDogs = new String[3];
//        // for (int i = 1; i <= numberOfDogs; i++) {
//        Name tempName = new Name();
//        String dogName = tempName.getDogName();
//        arrDogs[0] = dogName;
//
//        Age tempAge = new Age();
//        int intDogAge = tempAge.getDogsAge();
//        String dogAge = Integer.toString(intDogAge);
//        arrDogs[1] = dogAge;
//
//        Size dogTempSize = new Size();
//        String dogSize = dogTempSize.getSize();
//        arrDogs[2] = dogSize;
//
//        System.out.print(arrDogs[0]);
//        System.out.print(" " + arrDogs[1]);
//        System.out.print(" " + arrDogs[2]);
//        //    i++;
//    }
    }
}
//}
//        Name dogName = new Name();
//        dogName.getDogName();
//        Age dogAge = new Age();
//        dogAge.getDogsAge();
