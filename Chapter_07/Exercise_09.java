package Chapter_07;
import java.util.Scanner;
/*
(Find the smallest element) Write a method that finds the smallest element in an array of double
values using the following header:

public static double min(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and
displays the minimum value. Here is a sample run of the program:
 */
public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // put numbers into array
        double numbers[] = new double[10];
        System.out.println("Put 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // display results
        System.out.println("Minimum: " + min(numbers));
    }


    /** Returns minimum value from array */
    public static double min(double[] array){
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        } return min;
    }
}
