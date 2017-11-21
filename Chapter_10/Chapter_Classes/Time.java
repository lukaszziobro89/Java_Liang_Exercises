package Chapter_10.Chapter_Classes;

public class Time {
    public long hour;
    public long minute;
    public long second;

    // no-arg constructor that creates a Time object for the current time
    public Time(){
        long timeSeconds = System.currentTimeMillis() / 1000;
        long timeMinutes = timeSeconds / 60;
        long timeHours = timeMinutes / 60;
        this.hour = timeHours % 24;
        this.minute = timeMinutes % 60;
        this.second = timeSeconds % 60;
    }

    // constructor that constructs a Time object with the specified hour, minute, and second
    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds
    public Time(long elapsedTime){
        long timeSeconds = elapsedTime / 1000;
        long timeMinutes = timeSeconds / 60;
        long timeHours = timeMinutes / 60;
        this.hour = timeHours % 24;
        this.minute = timeMinutes % 60;
        this.second = timeSeconds % 60;
    }

    /** Method that sets a new time for the object using the elapsed time. */
    public void setTime(long elapseTime){
        long timeSeconds = System.currentTimeMillis() / 1000;
        second = timeSeconds % 60;
        long timeMinutes = timeSeconds / 60;
        minute = timeMinutes % 60;
        long timeHours = timeMinutes / 60;
        hour = timeHours % 24;

        if (elapseTime > 0){
            timeSeconds = elapseTime / 1000;
            second += timeSeconds % 60;
            timeMinutes = timeHours / 60;
            minute += timeMinutes % 60;
            timeHours = timeMinutes / 60;
            hour += timeHours % 24;

        }

    }


    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
}
