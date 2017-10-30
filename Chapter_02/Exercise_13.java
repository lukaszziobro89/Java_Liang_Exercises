package Chapter_02;
import java.util.Scanner;
/*
(Financial application: compound value) Suppose you save $100 each month into a savings account
with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the account
value after the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and
display the account value for any month.)
 */
public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for saving amount
        System.out.println("Please provide saving amount:");
        double saving_amount = input.nextDouble();

        double month_1 = saving_amount * (1 + 0.00417);
        double month_2 = (saving_amount + month_1) * (1 + 0.00417);
        double month_3 =  (saving_amount + month_2) * (1 + 0.00417);
        double month_4 =  (saving_amount + month_3) * (1 + 0.00417);
        double month_5 =  (saving_amount + month_4) * (1 + 0.00417);
        double month_6 =  (saving_amount + month_5) * (1 + 0.00417);

        // display results
        System.out.println("After sixth month account value will be: " + month_6);

    }
}
