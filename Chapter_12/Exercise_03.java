package Chapter_12;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
(ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
    ■ Creates an array with 100 randomly chosen integers.
    ■ Prompts the user to enter the index of the array, then displays the corresponding element value.
If the specified index is out of bounds, display the message Out of Bounds.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create array and write numbers
        int index;
        int[] numbers = new int[100];
        for (int i=0; i < numbers.length; i++) {
            int num = (int)(Math.random() * 1000);
            numbers[i] = num;
        }
        // prompt user to enter index number to display value
        try{
            System.out.println("Put index of number you want to know value: ");
            index = input.nextInt();
            System.out.println("Value is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index is incorrect.");
        } catch (InputMismatchException ex2){
            System.out.println("Input is incorrect.");
        }
    }
}
