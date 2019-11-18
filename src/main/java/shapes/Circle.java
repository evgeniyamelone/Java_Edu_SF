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

    double getArea() {
        double radius = getRadius();
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
