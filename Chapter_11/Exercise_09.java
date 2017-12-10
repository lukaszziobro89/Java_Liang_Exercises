package Chapter_11;

import java.util.ArrayList;

/*
(Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix, prints the matrix,
and finds the rows and columns with the most 1s. (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
 */
public class Exercise_09 {
    public static void main(String[] args) {

        // create lists
        ArrayList<Integer> mostRows = new ArrayList<>();
        ArrayList<Integer> mostColumns = new ArrayList<>();
        // create and print matrix
        int [][] matrix = randomMatrix(6);
        printSquareMatrix(matrix);
        // get and print rows with max 1s
        mostRows(matrix, mostRows);
        mostColumns(matrix, mostColumns);
        for (int row = 0; row < mostRows.size(); row++) {
            System.out.println("Index of row with most number of 1s: " + mostRows.get(row));
        }
        for (int row = 0; row < mostColumns.size(); row++) {
            System.out.println("Index of column with most number of 1s: " + mostColumns.get(row));
        }
    }

    /** Creates array list with indexes of rows with most number of 1s */
    public static void mostRows(int matrix [][], ArrayList<Integer> maxRows){
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int occurrences = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1){
                    occurrences++;
                }
            }
                if (occurrences > max){
                    max = occurrences;
                    maxRows.clear();
                    maxRows.add(i);
                } else if (max == occurrences){
                    maxRows.add(i);
                }
        }
    }

    /** Creates array list with indexes of columns with most number of 1s */
    public static void mostColumns(int matrix [][], ArrayList<Integer> maxColumns){
        int max = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int occurrences = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1){
                    occurrences++;
                }
            }
                if(occurrences > max){
                    max = occurrences;
                    maxColumns.clear();
                    maxColumns.add(j);
                } else if(max == occurrences){
                    maxColumns.add(j);
                }
        }
    }

    /** Creates square matrix with provided size and fills in with 0s and 1s */
    public static int[][] randomMatrix(int length){
        int randomMatrix[][] = new int[length][length];
        double randNum;
        for (int row = 0; row < randomMatrix.length; row++) {
            for (int column = 0; column < randomMatrix[row].length; column++) {
                randNum = Math.random();
                if (randNum >= 0.5){
                    randomMatrix[row][column] = 1;
                } else {
                    randomMatrix[row][column] = 0;
                }
            }
        }
        return randomMatrix;
    }

    /** Prints matrix */
    public static void printSquareMatrix(int [][] inputMatrix){
        for (int row = 0; row < inputMatrix.length; row++) {
            for (int column = 0; column < inputMatrix[row].length; column++) {
                System.out.print(inputMatrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
