package circle;

public class Circle {
    private double radius;
    private String colour;
    final double PI = 3.14;

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

    public void setRadius(String colour) {
        this.colour = colour;
    }

    //area of​a circle
    public double getArea() {
        double radius = getRadius();
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle parameters: \n\tradius: " + getRadius() + "\n\tcolour: " + getColour() + "\n\tarea: " + getArea();
    }
}
