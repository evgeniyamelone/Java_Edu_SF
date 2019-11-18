package shapes;

public class Demo {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(5.55, "red", true);
        shape[1] = new Rectangle(3.9, 6.75, "blue", false);
        shape[2] = new Square(5.98, "yellow", true);

        for (int i = 0; i < shape.length; i++) {
            System.out.println("\n" + shape[i]);
            if (shape[i] instanceof Circle) {
                System.out.println("Area of circle = " + ((Circle) shape[i]).getArea());
            }
            if (shape[i] instanceof Rectangle) {
                System.out.println("Perimeter of rectangle = "+((Rectangle) shape[i]).getPerimeter());
            }
        }
    }
}




