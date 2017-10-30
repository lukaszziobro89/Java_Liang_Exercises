package Chapter_06;
import java.util.Scanner;
/*
(Sum the digits in an integer) Write a method that computes the sum of the digits in an integer.
Use the following method header: public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits,
and the / operator to remove the extracted digit. For instance,to extract 4 from 234, use 234 % 10 ( = 4).
To remove 4 from 234, use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until
all the digits are extracted. Write a test program that prompts the user to enter an integer and
displays the sum of all its digits.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for number
        System.out.println("Put number: ");
        long number = input.nextLong();

        // print results
        System.out.println("Sum of digits for " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(long n){
        int sum = 0;
        long singleDigit;

        // extract digit
        while (n % 10 > 0){
            singleDigit = n % 10;
            sum += singleDigit;
            n /= 10;
        }
        return sum;
    }
}
