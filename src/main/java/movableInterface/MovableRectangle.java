package movableInterface;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Rectangle info: [topLeft " + this.getTopLeft() + ", bottomRight " + this.getBottomRight() + ", xSpeed: " + this.topLeft.getxSpeed() + ", ySpeed: " + this.bottomRight.getySpeed() + "]";
    }

    void print() {
        System.out.println(this.toString());
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    MovablePoint getBottomRight() {
        return this.bottomRight;
    }

    MovablePoint getTopLeft() {
        return this.topLeft;
    }

    void setSpeed(int xSpeed, int ySpeed) {
        this.topLeft.setxSpeed(xSpeed);
        this.topLeft.setySpeed(ySpeed);
        this.bottomRight.setxSpeed(xSpeed);
        this.bottomRight.setySpeed(ySpeed);
    }
}
