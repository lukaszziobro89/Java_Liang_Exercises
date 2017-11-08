package Chapter_08;
/*
(Sum the major diagonal in a matrix) Write a method that sums all the numbers in the major diagonal in an n * n matrix
of double values using the following header:

public static double sumMajorDiagonal(double[][] m)

Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal.
*/
import java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double matrix[][] = new double[4][4];

        // input elements
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        // display results
        System.out.println("Sum of diagonal elements: " + sumMajorDiagonal(matrix));

    }

    /** Sum up all diagonal elements in matrix */
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][row];
        }
        return sum;
    }
}

