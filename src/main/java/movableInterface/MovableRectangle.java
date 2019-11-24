package movableInterface;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft = new MovablePoint(5, 6, 4, 1);
    private MovablePoint bottomRight = new MovablePoint(7, 3, 1, 0);

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
     }

    @Override
    public void moveLeft() {
    }

    @Override
    public int moveRight() {
        return 0;
    }

    @Override
    public String toString() {
        return "Coordinates: [topLeft:" + topLeft + ", bottomRight:" + bottomRight + "]";
    }
}
