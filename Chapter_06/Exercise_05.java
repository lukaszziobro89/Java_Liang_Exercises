package Chapter_06;
import java.util.Scanner;
/*
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for numbers
        System.out.println("Put 3 numbers to be sorted: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    /** Method that displays provided numbers in sorted order */
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;

        if (num1 > num2){ // check first and 2nd
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3){ // check 2nd with 3rd
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2){ // check 1st with 2nd in case of 2 has
            temp = num1;  // been changed with 3 in 2nd step (2nd if)
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 + " -> " + num2 + " -> " + num3);
    }
}
