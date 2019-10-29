package objectsBasicsMandatoryPracticalTasks.Clock;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private long secondsSinceMidnight;

    Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Clock(int secondsSinceMidnight) {
        this.secondsSinceMidnight = secondsSinceMidnight;
    }

    void setClock(long secondsSinceMidnight) {
        long hours = (int)(secondsSinceMidnight / 3600);
        long minutes = secondsSinceMidnight / 60;
        System.out.println("hours = " + hours);
    }
}
