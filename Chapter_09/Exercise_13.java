package Chapter_09;

import Chapter_09.Chapter_Classes.Location;

/* (The Location class) Design a class named Location for locating a maximal value and its location in a two-dimensional array.
The class contains public data fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as a double type.
Write the following method that returns the location of the largest element in a two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts the user to enter a two-dimensional
array and displays the location of the largest element in the array.
 */
public class Exercise_13 {
    public static void main(String[] args) {

        // create matrix
        double numbers[][] = new double[5][5];


        // fill with numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = Math.random() * 100;
            }
        }

        // print array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.printf("%5.2f | ", numbers[i][j]);
            }
            System.out.println();
        }

        // create Location object
        Location location = Location.locateLargest(numbers);

        System.out.println();
        System.out.printf("Max values is: %5.2f \n", location.maxValue);
        System.out.println("Row: " + location.row);
        System.out.println("Column: " + location.column);

    }
}
