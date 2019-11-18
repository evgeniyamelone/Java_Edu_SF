package circle;

public class Circle {
    private double radius;
    private String colour;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    double getRadius() {
        return radius;
    }

    String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        double radius = getRadius();
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle parameters: \n\tradius: " + getRadius() + "\n\tcolour: " + getColour() + "\n\tarea: " + getArea();
    }
}
