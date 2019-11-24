package movableInterface;

public class Demo {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(5, 6, 4, 1);
        MovablePoint bottomRight = new MovablePoint(7, 3, 1, 11);

        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);
        rectangle.print();
        System.out.print("Move up => ");
        rectangle.moveUp();
        rectangle.print();
        rectangle.setSpeed(-2000, 100);
        System.out.print("Move down => ");
        rectangle.moveDown();
        rectangle.print();
        System.out.print("Move right => ");
        rectangle.moveRight();
        rectangle.print();
        rectangle.setSpeed(3000, -1100);
        System.out.print("Move left => ");
        rectangle.moveRight();
        rectangle.print();
    }
}
