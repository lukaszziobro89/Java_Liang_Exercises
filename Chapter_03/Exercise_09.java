package Chapter_03;
import java.util.Scanner;
/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits:
d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. The last digit, d10, is a checksum, which is calculated from the other
nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN
(including leading zeros). Your program should read the input as an integer.
 */
public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for first 9 digits
        System.out.println("Please provide first 9 digits of ISBN: ");
        int isbn = input.nextInt();

        // each digit separation
        int d1 = isbn / 100000000;
        int remain = isbn % 100000000;
        int d2 = remain / 10000000;
        remain = remain % 10000000;
        int d3 = remain / 1000000;
        remain = remain % 1000000;
        int d4 = remain / 100000;
        remain = remain % 100000;
        int d5 = remain / 10000;
        remain = remain % 10000;
        int d6 = remain / 1000;
        remain = remain % 1000;
        int d7 = remain / 100;
        remain = remain % 100;
        int d8 = remain / 10;
        remain = remain % 10;
        int d9 = remain;

        // checksum calculation
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (checksum == 10){
            String isbn_number = new StringBuilder().append(d1).append(d2).append(d3)
                    .append(d4).append(d5).append(d6).append(d7).append(d8).append(d9).append("X").toString();
            System.out.println("The ISBN-10 number is: " + isbn_number);
                    } else{
            String isbn_number = new StringBuilder().append(d1).append(d2).append(d3)
                    .append(d4).append(d5).append(d6).append(d7).append(d8).append(d9).append(checksum).toString();
            System.out.println("The ISBN-10 number is: " + isbn_number);
        }
    }
}
