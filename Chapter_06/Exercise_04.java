package Chapter_06;
import java.util.Scanner;
/*
Display an integer reversed) Write a method with the following header to display
an integer in reverse order: public static void reverse(int number)
For example, reverse(3456) displays 6543 . Write a test program that prompts
the user to enter an integer and displays its reversal.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for number
        System.out.println("Please provide integer: ");
        int number = input.nextInt();
        System.out.print(number + " in reversed order " + "is ");
        reverse(number);
    }

    /** reverse method displays number in reversed order */
    public static void reverse(int number){
        while (number > 0){
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
