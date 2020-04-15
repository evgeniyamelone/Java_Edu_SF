package generic;

import circle.Cylinder;
import shapes.Circle;
import circle.Ring;
import shapes.Shape;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Pair<String, Shape> objectsPair = new Pair<>("Simple Shape", new Shape("red", true));
        System.out.println(objectsPair);

        Ring ringRed = new Ring(7, "red");
        Ring ringBlue = new Ring(6, "blue");
        System.out.println("Rings are equal: " + compareObjects(ringRed, ringBlue));

        Cylinder cylinderRed = new Cylinder(6, 1, "red");
        Cylinder cylinderBlue = new Cylinder(6, 1, "blue");
        System.out.println("Cylinders are equal: " + compareObjects(cylinderRed, cylinderBlue));
    }

    public static <T extends Comparable<T>> boolean compareObjects(T object1, T object2) {
        int result = object1.compareTo(object2);
        return result == 0;
    }
}
