package Chapter_02;

import java.util.Scanner;

/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer.
 */
public class Exercise_11 {
    public static void main(String[] args) {
        int current_population = 312032486;

        // 1. Create instance of scanner object
        Scanner input = new Scanner(System.in);

        // 2. Prompt user for subtotal
        System.out.println("Please provide number of years: ");
        int years_number = input.nextInt();

        // calculations
        int population_prediction = current_population + (years_number *((31536000 / 7) - (31536000 / 13) + (31536000 / 45)));
        System.out.println("Predicted population: " + population_prediction);

    }

}
