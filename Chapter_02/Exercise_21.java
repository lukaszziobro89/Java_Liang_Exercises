package Chapter_02;

import java.util.Scanner;

/*
(Financial application: calculate future investment value) Write a program that reads in investment amount,
annual interest rate, and number of years, and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
 */
public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for investment amount
        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();

        // prompt for interest rate percentage
        System.out.println("Enter annual interest rate in percentage:");
        double monthlyInterestRate = input.nextDouble();

        System.out.println("Enter number of years:");
        double numberOfYears = input.nextDouble();

        // calculations
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate/1200), (numberOfYears * 12));

        // display results
        System.out.println("Accumulated value is: " + futureInvestmentValue);
    }
}
