package circle;

public class Circle {
    private double radius;
    private String colour;

    //constructors
    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    //getters
    double getRadius() {
        return radius;
    }

    String getColour() {
        return colour;
    }

    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //area of​a circle
    public double getArea() {
        double radius = getRadius();
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle parameters [radius: " + getRadius() + "; colour: " + getColour() + "; area: " + getArea() + "]";
    }
}
