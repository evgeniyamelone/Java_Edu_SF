package circle;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5, "red");
        System.out.println(circle.toString());
        Cylinder cylinder=new Cylinder(6.5, 7.8, "blue");
        System.out.println("\n"+ cylinder.toString());
    }
}
