package shapes;

public class Square extends Rectangle {
    Square() {
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String colour, boolean filled) {
        super(side, side, colour, filled);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getWidth() + ", which is a subclass of " + super.toString();
    }
}

