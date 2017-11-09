package Chapter_08;
/*
(Largest row and column) Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
and finds the first row and column with the most 1s. Here is a sample run of the program:
0 0 1 1
0 0 1 1
1 1 0 1
1 0 1 0
The largest row index: 2
The largest column index: 2
 */
public class Exercise_10 {
    public static void main(String[] args) {
        // initialize matrix
        int randomMatrix[][] = new int[4][4];

        // fill with 0s and 1s
        randomMatrix = fillMatrix1sAnd0s(randomMatrix);

        // print matrix
        printMatrix(randomMatrix);

        // print largest index for rows
        System.out.println("Index of row with largest number of 1s: " + largest1sInRow(randomMatrix));

        // print largest index for columns
        System.out.println("Index of row with largest number of 1s: " + largest1sInColumn(randomMatrix));

    }

    /** Fills in matrix with 1s and 0s */
    public static int[][] fillMatrix1sAnd0s(int [][] matrix){
        // initialize matrix
        int filledMatrix[][] = new int[matrix.length][matrix[0].length];
        double randNum;
        // fill in with 1s and 0s
        for (int row = 0; row < filledMatrix.length; row++) {
            for (int column = 0; column < filledMatrix[row].length; column++) {
                randNum = Math.random();
                if (randNum >= 0.5){
                    filledMatrix[row][column] = 1;
                } else{
                    filledMatrix[row][column] = 0;
                }
            }
        }
        return filledMatrix;
    }

    /** Prints matrix */
    public static void printMatrix(int[][] inputMatrix){
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int column = 0; column < inputMatrix[row].length; column++) {
                System.out.print(inputMatrix[row][column]+ " ");
            }
            System.out.println();
        }
    }

    /** Find index of row with largest number of 1s */
    public static int largest1sInRow(int [][] inputMatrix){
        int largestIndex = -1;
        int max = 0;
        int sum = 0;
        for (int row = 0; row < inputMatrix.length; row++) {
            // sum all elements in current row
            for (int column = 0; column < inputMatrix[row].length; column++) {
                sum += inputMatrix[row][column];
            }
            // check if current row's sum is larger then max
            if (sum > max){
                largestIndex = row;
                max = sum;
            }
            // reset sum
            sum = 0;
        }
        return largestIndex;
    }

    /** Find index of column with largest number of 1s */
    public static int largest1sInColumn(int [][] inputMatrix){
        int largestIndex = -1;
        int max = 0;
        int sum = 0;
        for (int column = 0; column < inputMatrix[0].length; column++) {
            // sum all elements in current row
            for (int row = 0; row < inputMatrix.length; row++) {
                sum += inputMatrix[row][column];
            }
            // check if current row's sum is larger then max
            if (sum > max){
                largestIndex = column;
                max = sum;
            }
            // reset sum
            sum = 0;
        }
        return largestIndex;
    }

}
