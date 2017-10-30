package Chapter_06;
import java.util.Scanner;
/*
(Financial application: compute the future investment value) Write a method that computes future investment
value at a given interest rate for a specified number of years. The future investment is determined using
the formula in Programming Exercise 2.21. Use the following method header:*//**
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)*//*
For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59
Write a test program that prompts the user to enter the investment amount (e.g.,1000) and the interest rate
(e.g., 9%) and prints a table that displays future value for the years from 1 to 30, as shown below
The amount invested: 1000
Annual interest rate: 9
Years       Future Value
1               1093.80
2               1196.41
...
29              13467.25
30              14730.57
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for investment amount
        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();

        // prompt for interest rate percentage
        System.out.println("Enter annual interest rate in percentage:");
        double monthlyInterestRate = input.nextDouble();

        System.out.println("Enter number of years:");
        int years = input.nextInt();

        // display results
        System.out.printf("Future investment value is %1.2f " , futureInvestmentValue(investmentAmount, monthlyInterestRate, years));

    }

    /** Method that calculates future investment value */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow((1 + monthlyInterestRate/1200), (years * 12));
    }
}
