package Chapter_07;
import java.util.Scanner;
/*
(Reverse the numbers entered) Write a program that reads ten integers and displays
them in the reverse of the order in which they were read.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10];
        // prompt user to get 10 integer numbers
        System.out.println("Provide 10 integers: ");
        // fill array with numbers provided from user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // print in reversed order
        System.out.print("Provided numbers in reversed order: ");
        for (int i = numbers.length - 1; i >=0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
