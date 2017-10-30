package Chapter_02;
import java.util.Scanner;
/*
(Cost of driving) Write a program that prompts the user to enter the distance to drive,
the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 */
public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for trip details
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double miles_per_galon = input.nextDouble();

        System.out.println("Enter price per gallon: ");
        double price_per_galon = input.nextDouble();

        // calculations
        double trip_cost = distance / miles_per_galon * price_per_galon;

        // display results
        System.out.println("Trip cost is: " + trip_cost);




    }
}
