package shapes;

public class Demo {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(5.5, "red", true);
        shape[1] = new Rectangle(3, 6.7, "blue", false);
        shape[2] = new Square(5, "yellow", true);
        for (int i = 0; i < 3; i++) {
            System.out.println(shape[i]);



