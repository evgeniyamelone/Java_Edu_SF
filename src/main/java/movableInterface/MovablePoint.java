package movableInterface;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y = this.getY() + this.getySpeed();
    }

    @Override
    public void moveDown() {
        this.y = this.getY() - this.getySpeed();
    }

    @Override
    public void moveLeft() {
        this.x = this.getX() - this.getxSpeed();
    }

    @Override
    public void moveRight() {
        this.x = this.getX() + this.getxSpeed();
    }

    @Override
    public String toString() {
        return "Coordinates: [x:" + x + ", y:" + y + "]";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
