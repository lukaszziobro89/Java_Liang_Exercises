package Chapter_10.Chapter_Classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private long year;
    private long month;
    private long day;

    // A no-arg constructor that creates a MyDate object for the current date.
    public MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
    public MyDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /** A method that sets a new date for the object using the elapsed time. */
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    /** A method that prints date */
    public String printDate(){
        return this.getYear() + "-" + this.getMonth() + "-" + this.getDay();
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public long getMonth() {
        return month;
    }

    public void setMonth(long month) {
        this.month = month;
    }

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }
}
