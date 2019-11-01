package objectsBasicsMandatoryPracticalTasks.Dogs;

import java.util.Arrays;
import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Specify the number of dogs: ");
        String str = s1.nextLine();
        String delimeter = " ";
        String[] splitedStr = str.split(delimeter);

        //dogs quantity
        int dogsQuantity = Integer.parseInt(splitedStr[0]);
        System.out.println(dogsQuantity);

        Name inputName = new Name();
        String[] arrNames = inputName.inputName(false);

        Age inputAge = new Age();
        String[] arrAges = inputAge.inputAge(false);

        Size inputSize = new Size();
        String[] arrSizes = inputSize.inputSize(false);

        Dog[] dog = new Dog[dogsQuantity];

        for (int i = 0; i < dogsQuantity; i++) {
            String name = Dog.getRandomElement(arrNames);
            String age = Dog.getRandomElement(arrAges);
            String size = Dog.getRandomElement(arrSizes);
            dog[i] = new Dog(name, age, size);
        }

        for (int i = 0; i < dog.length - 1; i++) {
            for (int j = i + 1; j < dog.length; j++) {
                Dog current = dog[i];
                Dog next = dog[j];
                if (current.getName().compareTo(next.getName()) > 0) {
                    Dog temp = dog[i];
                    dog[i] = dog[j];
                    dog[j] = temp;
                }
            }
        }

        System.out.print("\n\n\t\t---- SORTED ARRAY BY NAME ----\n\n");

        for (int i = 0; i < dogsQuantity; i++) {
            dog[i].printDog();
        }

        String[] myArray = {"two", "one", "three"};
        DogSort dogSort = new DogSort();
        String[] result = dogSort.dogSort(myArray);

        for (int i = 0; i < dog.length - 1; i++) {
            for (int j = i + 1; j < dog.length; j++) {
                Dog current = dog[i];
                Dog next = dog[j];
                if (current.getAge() >= next.getAge()) {
                    Dog temp = dog[i];
                    dog[i] = dog[j];
                    dog[j] = temp;
                }
            }
        }

        System.out.print("\n\n\t\t---- SORTED ARRAY BY AGE ----\n\n");

        for (int i = 0; i < dogsQuantity; i++) {
            dog[i].printDog();
        }

        for (int i = 0; i < dog.length - 1; i++) {
            for (int j = i + 1; j < dog.length; j++) {
                Dog current = dog[i];
                Dog next = dog[j];
                if (current.getSize().compareTo(next.getSize()) > 0) {
                    Dog temp = dog[i];
                    dog[i] = dog[j];
                    dog[j] = temp;
                }
            }
        }

        System.out.print("\n\n\t\t---- SORTED ARRAY BY SIZE ----\n\n");

        for (int i = 0; i < dogsQuantity; i++) {
            dog[i].printDog();
        }

    }


}



