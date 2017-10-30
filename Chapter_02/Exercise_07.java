package Chapter_02;
/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
 */
import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        int minutes;

        // Create instance of scanner object
        Scanner input = new Scanner(System.in);

        // Prompt number of minutes
        System.out.print("Please provide number of minutes: ");
        minutes = input.nextInt();

        // Minutes to years
        double years = minutes / 525600;
        System.out.println((int)years);

        // double
        int days = (minutes % 525600) / 1440;
        System.out.println(days);

        System.out.println(minutes + " is approximately " + (int)years + " and " + days + " days");

    }
}
