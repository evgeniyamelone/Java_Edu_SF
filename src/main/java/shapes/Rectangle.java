package shapes;

public class Rectangle extends Shape {
    private double width;
    private double length;

    //constructors
    Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    @Override
    double getArea() {
        return 0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    //getters
    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    //setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //perimeter of rectangle

    @Override
    double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    boolean isInside(double x, double y) {
        if (Math.abs(x)<length && Math.abs(y)<width) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + ", which is a subclass of " + super.toString();
    }


}
