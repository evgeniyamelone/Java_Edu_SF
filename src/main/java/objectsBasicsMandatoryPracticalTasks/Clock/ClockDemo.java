package objectsBasicsMandatoryPracticalTasks.Clock;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Clock firstClock = new Clock(5345345);
        int i = 0;
        while (i < 10) {
            firstClock.tick();
            System.out.println(firstClock.getHours() + ":" + firstClock.getMinutes() + ":" + firstClock.getSeconds());
            i += 1;
        }

        Scanner s1 = new Scanner(System.in);
        System.out.print("Input hh: ");
        long hh = s1.nextInt();
        //Scanner s2 = new Scanner(System.in);
        System.out.print("Input mm: ");
        long mm = s1.nextInt();
        // Scanner s3 = new Scanner(System.in);
        System.out.print("Input ss: ");
        long ss = s1.nextInt();
        Clock secondClock = new Clock(hh, mm, ss);
        int j = 0;
        while (j < 10) {
            secondClock.tickDown();
            System.out.println(secondClock.getHours() + ":" + secondClock.getMinutes() + ":" + secondClock.getSeconds());
            j += 1;
        }
        System.out.println("\nAdd the secondClock time in firstClock:");
        System.out.println("\nFirst Clock: " + firstClock.getHours() + ":" + firstClock.getMinutes() + ":" + firstClock.getSeconds());
        System.out.println("Second Clock: " + secondClock.getHours() + ":" + secondClock.getMinutes() + ":" + secondClock.getSeconds());
        firstClock.subtractClock(secondClock);
        System.out.println("\nGet the difference of firstClock and secondClock:");
        System.out.println("\nFirst Clock: " + firstClock.getHours() + ":" + firstClock.getMinutes() + ":" + firstClock.getSeconds());
        System.out.println("Second Clock: " + secondClock.getHours() + ":" + secondClock.getMinutes() + ":" + secondClock.getSeconds());
    }
}

