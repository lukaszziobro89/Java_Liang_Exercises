package Chapter_02;
import java.util.Scanner;
/*
(Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
you can compute the interest on the next monthly payment using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance, annual percentage interest rate and displays the interest for the next month.
 */
public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for balance and interest rate
        System.out.println("Provide balance:");
        double balance = input.nextDouble();
        System.out.println("Provide annual percentage interest rate (e.g., 3 for 3%):");
        double interest_rate = input.nextDouble();

        // calculations
        double interest = balance * (interest_rate / 1200);

        // display results
        System.out.println("The interest is " + interest);
    }
}
