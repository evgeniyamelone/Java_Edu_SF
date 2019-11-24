package shapes;

public class Circle extends Shape {
    private double radius;

    Circle() {
        this.radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double radius = getRadius();
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    boolean isInside(double x, double y) {
        if (Math.abs(x)<radius && Math.abs(y)<radius) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
