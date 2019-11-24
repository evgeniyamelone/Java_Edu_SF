package shapes;

public abstract class Shape {
    private String colour;
    private boolean filled;

    //constructors
    Shape() {
        this.colour = "green";
        this.filled = true;
    }

    Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    String getColour() {
        return colour;
    }

    boolean isFilled() {
        return filled;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    abstract boolean isInside(double x, double y);

    @Override
    public String toString() {
        String filledText = isFilled() ? "filled" : "not filled";
        return "A Shape with the colour of " + getColour() + " " + filledText;
    }
}
