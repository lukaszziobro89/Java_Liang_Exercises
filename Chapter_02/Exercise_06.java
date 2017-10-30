package Chapter_02;
/*
Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
 */

import java.util.Scanner;
public class Exercise_06 {
    public static void main(String[] args) {
        int value;

        // Create instance of scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for subtotal
        System.out.println("Please provide integer from range 0-1000: ");
        value = input.nextInt();

        // get single
        int single = value%10;
        System.out.println(single);

        // first cut
        value = value/10;

        // get tens
        int tens = value%10;
        System.out.println(tens);

        // second cut
        value = value/10;

        // get hundreds
        int hundreds = value%10;
        System.out.println(hundreds);

        System.out.println("Sum of digits is: " + (single + tens + hundreds));
    }
}
