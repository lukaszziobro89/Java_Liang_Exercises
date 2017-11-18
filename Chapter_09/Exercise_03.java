package Chapter_09;
/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed time to
10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000,
and displays the date and time using the toString() method, respectively.
 */
import java.util.Date;
public class Exercise_03 {
    public static void main(String[] args) {

        long time = 10000; // set initial time

        for (int i = 0; i < 8; i++) {
            Date date = new Date(time);             // create object Date with provided time
            System.out.println(date.toString());    // print date in "human" format
            time = time * 10;                       // set value for next instance of time
        }
    }
}
