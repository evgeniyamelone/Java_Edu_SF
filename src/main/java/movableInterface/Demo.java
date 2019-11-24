package movableInterface;

public class Demo {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(5, 6, 4, 1);
        MovablePoint bottomRight = new MovablePoint(7, 3, 1, 11);

        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);
        rectangle.print();
        rectangle.moveUp();
        rectangle.print();
        rectangle.setSpeed(-2000, 100);
        rectangle.moveDown();
        rectangle.print();
        rectangle.moveRight();
        rectangle.print();
        rectangle.setSpeed(3000, -1100);
        rectangle.moveRight();
        rectangle.print();
    }
}
