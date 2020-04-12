package circle;

public class Demo {
    public static void main(String[] args) {
        Ring ringRed = new Ring(5.5, "red");
        Ring ringBlue = new Ring(7, "blue");
        System.out.println(ringRed.toString());
        Cylinder cylinder=new Cylinder(6.5, 7.8, "blue");
        System.out.println("\n"+ cylinder.toString());
        System.out.println(ringRed.compareTo(ringBlue));
    }
}
