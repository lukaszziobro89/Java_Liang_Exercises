package Chapter_04;
import java.util.Scanner;
/*
(Find the Unicode of a character) Write a program that receives a character and displays its Unicode.
 */
public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for character
        System.out.println("Enter a character: ");
        String character = input.nextLine();

        // get first character of provided string
        char firstChar = character.charAt(0);

        // display results (simply cast char into integer)
        System.out.println("The Unicode for the character " + firstChar + " is: " + (int)firstChar);
    }
}
