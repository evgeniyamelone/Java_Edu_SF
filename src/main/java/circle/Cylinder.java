package circle;

public class Cylinder extends Circle {
    private double height;
    final double PI = 3.14;

    Cylinder() {
        super();
    }

    Cylinder(double radius) {
        super(radius);
    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    Cylinder(double radius, double height, String colour) {
        super(radius, colour);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * PI * super.getRadius() * (super.getRadius() + this.height);
    }

    double getVolume() {
        return PI * getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder parameters: \n\tradius: " + super.getRadius() + "\n\tcolour: " + super.getColour() + "\n\theight: " + getHeight() + "\n\tarea: " + getArea() + "\n\tvolume: " + getVolume();
    }
}
