package Chapter_08;
/*(Locate the largest element)
Write the following method that returns the location of the largest element in a two-dimensional array.

public static int[] locateLargest(double[][] a)

The return value is a one-dimensional array that contains two elements. These two elements indicate the row and column
indices of the largest element in the two-dimensional array. Write a test program that prompts the user to enter a
two-dimensional array and displays the location of the largest element in the array.
 */
public class Exercise_13 {
    public static void main(String[] args) {
        // initialize matrix
        double randomMatrix[][] = new double[4][4];

        // fill with 0s and 1s
        randomMatrix = filledWithRandomNumbers(randomMatrix);

        // print random matrix
        printMatrix(randomMatrix);

        // find location on max value
        int result[] = locateLargest(randomMatrix);
        printArray(result);

    }

    /** Returns one-dimensional array with indexes of maximum value from array 'a' */
    public static int[] locateLargest(double[][] a){
        int location[] = new int[2];
        double max=0;
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if(max < a[row][column]){
                    max = a[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
    return location;
    }

    /** Fills in matrix with 1s and 0s */
    public static double[][] filledWithRandomNumbers(double [][] matrix){
        // initialize matrix
        double filledMatrix[][] = new double[matrix.length][matrix[0].length];
        double randNum;
        // fill in with 1s and 0s
        for (int row = 0; row < filledMatrix.length; row++) {
            for (int column = 0; column < filledMatrix[row].length; column++) {
                randNum = Math.random()*100;
                filledMatrix[row][column] = randNum;
            }
        }
        return filledMatrix;
    }

    /** Prints matrix */
    public static void printArray(int[] inputMatrix){
        for (int row = 0; row < inputMatrix.length; row++) {
                System.out.print(inputMatrix[row]+ " ");
        }
    }

    /** Prints array */
    public static void printMatrix(double[][] inputMatrix){
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int column = 0; column < inputMatrix[row].length; column++) {
                System.out.printf("%6.1f ", inputMatrix[row][column]);
            }
            System.out.println();
        }
    }
}
