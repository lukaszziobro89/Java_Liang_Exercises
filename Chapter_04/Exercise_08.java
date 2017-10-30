package Chapter_04;
import java.util.Scanner;
/*
(Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for ascii code
        System.out.println("Enter an ASCII code (0 - 127): ");
        int asciiNum = input.nextInt();

        // display results
        System.out.println("The character for ASCII code " + asciiNum + " is: " + (char)asciiNum);
    }
}
