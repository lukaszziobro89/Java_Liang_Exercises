package Chapter_07;
import java.util.Scanner;
/*
(Find the index of the smallest element) Write a method that returns the index of the smallest element in an array
of integers. If the number of such elements is greater than 1, return the smallest index. Use the following header:

public static int indexOfSmallestElement(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this method to return the index of the
smallest element, and displays the index.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // put numbers into array
        double numbers[] = new double[10];
        System.out.println("Put 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // display results
        System.out.println("First index of minimal value: " + indexOfSmallestElement(numbers));

    }

    /** Return smallest index of minimal value from array */
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int minValueIndex=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                minValueIndex = i;
            }
        } return minValueIndex;
    }
}
