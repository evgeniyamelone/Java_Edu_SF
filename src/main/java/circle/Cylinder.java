package circle;

public class Cylinder extends Circle {
    private double height;

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
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + this.height);
    }

    double getVolume() {
        return Math.PI * getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder parameters: [radius: " + super.getRadius() + "; colour: " + super.getColour() + "; height: " + getHeight() + "; area: " + getArea() + "; volume: " + getVolume()+"]";
    }
}
