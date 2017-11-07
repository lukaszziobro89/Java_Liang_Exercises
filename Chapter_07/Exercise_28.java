package Chapter_07;
import java.util.Scanner;
/*
(Math: combinations) Write a program that prompts the user to enter 10 integers
and displays all combinations of picking two numbers from the 10.
 */
public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create array for numbers
        int numbers[] = new int[10];
        System.out.println("Put numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // print all combinations of numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    System.out.println(numbers[i] + " - " + numbers[j]);
                }
            }
        }
    }
}
