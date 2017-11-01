package Chapter_07;
import java.util.Scanner;
/*
(Average an array) Write two overloaded methods that return the average of an array with the following headers:

public static int average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numbers[] = new double[10];

        System.out.println("Put 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        printArray(numbers, 5);
        System.out.printf("Average is: " + average(numbers));
    }

    /** Returns average from integer array */
    public static int average(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } return (sum / array.length);
    }

    /** Returns average from double array */
    public static double average(double[] array){
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } return (sum / array.length);
    }

    /** Print array - n elements per line */
    public static void printArray(double[] inputArray, int numbersPerLine){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("%3.1f ", inputArray[i]);
            /** if next element's index = numbersPerLine then go to next line
                modulo of next index / numbersPerLine means current element is numberPerLine
                element in line */
            if((i + 1) % numbersPerLine == 0){
                System.out.println("");
            }
        }
    }

}
