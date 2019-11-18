package shapes;

public class Shape {
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


    @Override
    public String toString() {
        String isNot = "filled";
        if (!isFilled()) {
            isNot = "Not filled";
        }
        return "A Shape with the colour of " + getColour() +" "+ isNot;
    }
}
