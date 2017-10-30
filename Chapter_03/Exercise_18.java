package Chapter_03;
import java.util.Scanner;
/*
(Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping
based on the weight of the package (in pounds).
                            3.5, if 0 < w < = 1
			     c(w) =     5.5, if 1 < w < = 3
							8.5, if 3 < w < = 10
							10.5, if 10 < w < = 20
Write a program that prompts the user to enter the weight of the package and display the shipping cost.
If the weight is greater than 50, display a message “the package cannot be shipped.”
 */
public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare cost per pound variable
        double costPerPound;

        // prompt for weight
        System.out.println("Please provide weight in pounds: ");
        double weight = input.nextDouble();

        // calculate cost
        if (weight > 50) {
            System.out.println("The package cannot be shipped.");
        } else{
            if (weight > 0 && weight <= 1){costPerPound = 3.5;}
            else if (weight <=3) {costPerPound = 5.5;}
            else if (weight <= 10) {costPerPound = 8.5;}
            else {costPerPound= 10.5;}

            // calculate cost
            double shippingCost = weight * costPerPound;
            // display results
            System.out.println("Shipping cost is: " + shippingCost);
        }
    }
}
