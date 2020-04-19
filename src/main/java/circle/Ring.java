package circle;

public class Ring implements Comparable<Ring> {
    private double radius;
    private String colour;

    Ring() {

    }

    Ring(double radius) {
        this.radius = radius;
    }

    public Ring(double radius, String colour) {
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

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        double radius = getRadius();
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle parameters [radius: " + getRadius() + "; colour: " + getColour() + "; area: " + getArea() + "]";
    }

    @Override
    public int compareTo(Ring ring) {
        return Double.compare(getArea(), ring.getArea());
    }
}
