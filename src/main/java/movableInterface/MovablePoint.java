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
        int y = this.getY() + this.getySpeed();
        this.setY(y);
    }

    @Override
    public void moveDown() {
        int y = this.getY() - this.getySpeed();
        this.setY(y);
    }

    @Override
    public void moveLeft() {
        int x = this.getX() - this.getxSpeed();
        this.setX(x);
    }

    @Override
    public void moveRight() {
        int x = this.getX() + this.getxSpeed();
        this.setX(x);
    }

    @Override
    public String toString() {
        return "coordinates: [x: " + x + ", y: " + y + "]";
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getxSpeed() {
        return xSpeed;
    }

    int getySpeed() {
        return ySpeed;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
