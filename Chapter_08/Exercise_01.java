package Chapter_08;

import java.util.Scanner;

/* (Sum elements column by column) Write a method that returns the sum of all the elements in a specified column in a
matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each column. Here is a sample run:
Enter a 3-by-4 matrix row by row:
1.5     2   3   4
5.5     6   7   8
9.5     1   3   1
Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double matrix[][] = new double[3][4];

        // input elements
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        // sum up elements and display results
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum for " + i + " column: " + sumColumn(matrix, i));
        }

    }

    /** Sum up all elements from m array in provided column */
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
             sum += m[row][columnIndex];
        }
        return sum;
    }
}
