package Chapter_05;
import java.util.Scanner;
/*
(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0 . Display
the average as a floating-point number.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        int positives = 0;
        int negatives = 0;
        double total = 0;
        double average;

        // prompt for first number
        System.out.println("Enter an integer, the input ends with '0': ");
        int number = input.nextInt();

        // check
        if (number==0){
            System.out.println("No number provided.");
            System.exit(1);
        }

        while (number != 0){
            if (number > 0){
                positives++;
            } else {
                negatives++;
            }

            total += number;
            number = input.nextInt();
        }

        // average count
        average = total / (positives + negatives);

        // display results
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Total: "+ total);
        System.out.println("Average: " + average);
    }
}
