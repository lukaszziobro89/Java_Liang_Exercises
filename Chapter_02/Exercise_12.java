package Chapter_02;
import java.util.Scanner;
/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v,
you can compute the minimum runway length needed for an airplane to take off using the following formula:
length = v^2 / 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in
meters/second squared (m/s2), and displays the minimum runway length.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for speed
        System.out.println("Please provide speed: ");
        double speed = input.nextDouble();

        // prompt for acceleration
        System.out.println("Please provide acceleration: ");
        double acceleration = input.nextDouble();

        //calculations
        double length = Math.pow(speed , 2.0) / (2.0 * acceleration);

        // display results
        System.out.println("Length: " + length);
    }
}
