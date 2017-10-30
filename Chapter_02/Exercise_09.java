package Chapter_02;
import java.util.Scanner;

/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0)/t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
 */
public class Exercise_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt for velocity1
        System.out.println("Please provide v1:");
        double v1 = input.nextDouble();

        // prompt for velocity2
        System.out.println("Please provide v2:");
        double v2 = input.nextDouble();

        // prompt for time
        System.out.println("Please provide time:");
        double time = input.nextDouble();

        // calculate acceleration
        double acceleration = (v1 - v2) / time;

        // print result
        System.out.println("The average acceleration is: " + acceleration);

    }
}
