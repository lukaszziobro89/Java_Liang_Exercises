package Chapter_08;
/*
(Algebra: add two matrices) Write a method to add two matrices. The header of the method is as follows:

public static double[][] addMatrix(double[][] a, double[][] b)
 */
public class Exercise_05 {
    public static void main(String[] args) {
        double first[][] = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        double second[][] = {{1, 1, 1},
                             {1, 1, 1},
                             {1, 1, 1}};

        // add matrices
        double sumMatrix[][] = addMatrix(first, second);

        // print results
        for (int row = 0; row < sumMatrix.length; row++) {
            for (int column = 0; column < sumMatrix[row].length; column++) {
                System.out.print(sumMatrix[row][column] + " ");

            }
            System.out.println("");
        }
    }

    /** Adds two matrices with the same sizes */
    public static double[][] addMatrix(double[][] a, double[][] b){
        double sumMatrix[][] = new double[a.length][a[0].length];
        // check if matrices have the same number of rows
        if (a.length != b.length){
            System.out.println("Different number of rows in matrices.");
            return sumMatrix;
            // check if each row have the same length
        } else {
            for (int row = 0; row < a.length; row++) {
                if( a[row].length != b[row].length){
                    System.out.println("Different number of columns in matrices.");
                    return sumMatrix;
                }
            }
        }

        // add matrices
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                sumMatrix[row][column] = a[row][column] + b[row][column];
            }
        }
        return sumMatrix;
    }
}
