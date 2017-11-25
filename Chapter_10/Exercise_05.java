package Chapter_10;
import Chapter_10.Chapter_Classes.StackOfIntegers;
import java.util.Scanner;
/*
(Displaying the prime factors) Write a program that prompts the user to enter a positive integer and displays all its
smallest factors in decreasing order. For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2.
Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.
 */
public class Exercise_05 {
    public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        int num = new Scanner(System.in).nextInt();

        StackOfIntegers myStack = new StackOfIntegers(15);

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                myStack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }

        // print in reverse order
        while (!myStack.empty()) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
