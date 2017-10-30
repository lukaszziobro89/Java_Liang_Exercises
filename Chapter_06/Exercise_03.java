package Chapter_06;

import java.util.Scanner;

/*
(Palindrome integer) Write the methods with the following headers

// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome . A number is a palindrome if its reversal
is the same as itself. Write a test program that prompts the user to enter an integer and
reports whether the integer is a palindrome.
 */
public class Exercise_03 {
    /** main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt for number
        System.out.println("Please provide integer number: ");
        int number = input.nextInt();

        // check if number is palindrome
        System.out.println(isPalindrome(number));
    }

    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number){
        //variables

        int reversedNumber = 0;

        while (number != 0){
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }

}
