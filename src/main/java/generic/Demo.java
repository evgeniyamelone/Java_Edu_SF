package generic;

import shapes.Shape;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Pair<String, Shape> objectsPair = new Pair<>("Simple Shape", new Shape("red", true));
        String name = objectsPair.getFirst();
        Shape shape = objectsPair.getSecond();
        System.out.println(name);
        System.out.println(shape);
    }
}
