package Chapter_03;
import java.util.Scanner;
/*
(Palindrome number) Write a program that prompts the user to enter a three-digit integer and determines
whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for 3-digits integer number
        System.out.println("Please provide 3-digits integer number: ");
        int number = input.nextInt();

        // check if is palindrome
        int d1 = (number / 100);
        int remain = number % 100;
        int d3 = (remain % 10);

        // display results
        System.out.println(number + (
                (d1 == d3) ? " is " : " is not ")
                + " a palindrome.");
    }
}
