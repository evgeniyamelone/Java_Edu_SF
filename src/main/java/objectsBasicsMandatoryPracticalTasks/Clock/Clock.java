package objectsBasicsMandatoryPracticalTasks.Clock;


class Clock {
    private long hours;
    private long minutes;
    private long seconds;
    private static final int SEC_IN_DAYS = 86400;
    private static final int SEC_IN_HOURS = 3600;
    private static final int SEC_IN_MINUTE = 60;

    Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    Clock(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Clock(int secondsSinceMidnight) {
        Clock clock = new Clock();
        Clock time = this.setClock(secondsSinceMidnight);
        //  System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }

    private Clock setClock(long secondsSinceMidnight) {
        Clock clock = new Clock();
        long days = (int) (secondsSinceMidnight / SEC_IN_DAYS);
        secondsSinceMidnight = secondsSinceMidnight - days * SEC_IN_DAYS;
        this.hours = (int) (secondsSinceMidnight / SEC_IN_HOURS);
        this.minutes = (int) ((secondsSinceMidnight - this.hours * SEC_IN_HOURS) / SEC_IN_MINUTE);
        this.seconds = (int) (((secondsSinceMidnight - this.hours * SEC_IN_HOURS - this.minutes * SEC_IN_MINUTE)));
//        String s = this.hours + ":" + this.minutes + ":" + this.seconds;
        return clock;
    }

    void tick() {
        if (this.seconds + 1 > 59) {
            this.minutes += 1;
        }
        this.seconds += 1;
    }

    long getHours() {
        return this.hours;
    }

    long getMinutes() {
        return this.minutes;
    }

    long getSeconds() {
        return this.seconds;
    }

    Clock addClock(Clock clock) {
        long hh = clock.getHours();
        long mm = clock.getMinutes();
        long ss = clock.getSeconds();

        if (this.hours + hh >= 23) {
            this.hours = (this.hours + hh) - 24;
        } else {
            this.hours += hh;
        }
        if (this.minutes + mm > 59) {
            this.minutes = (this.minutes + mm) - 60;
            this.hours += 1;
        } else {
            this.minutes += mm;
        }
        if (this.seconds + ss > 59) {
            this.seconds = (this.seconds + ss) - 60;
            this.minutes += 1;
        } else {
            this.seconds += ss;
        }
        return clock;

    }

    String representationClock(Clock clock) {
        String currentTime = "Current time: ";
        if (this.hours < 10) {
            currentTime += "0" + this.hours + ":";
        } else {
            currentTime += +this.hours + ":";
        }
        if (this.minutes < 10) {
            currentTime += "0" + this.minutes + ":";
        } else {
            currentTime += +this.minutes + ":";
        }
        if (this.seconds < 10) {
            currentTime += "0" + this.seconds;
        } else {
            currentTime += +this.seconds;
        }
        return currentTime;
    }

    void tickDown() {
        if (this.seconds - 1 < 0) {
            System.out.println("Second can be negative number");
        }
        this.seconds -= 1;
    }

    Clock subtractClock(Clock clock) {
        long hh = clock.getHours();
        long mm = clock.getMinutes();
        long ss = clock.getSeconds();

        if (this.hours - hh < 0) {
            this.hours = (this.hours - hh) + 24;
        } else {
            this.hours -= hh;
        }
        if (this.minutes - mm < 0) {
            this.minutes = (this.minutes - mm) + 60;
            this.hours -= 1;
        } else {
            this.minutes -= mm;
        }
        if (this.seconds - mm < 0) {
            this.seconds = (this.seconds - ss) + 60;
            this.minutes -= 1;
        } else {
            this.seconds -= ss;
        }
        return clock;
    }
}

