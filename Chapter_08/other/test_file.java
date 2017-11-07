package Chapter_08.other;

public class test_file {
    public static void main(String[] args) {
        int matrix[][] = new int[5][4];

        System.out.println(matrix.length + " rows");
        System.out.println(matrix[0].length + " columns");

        // print values
        printMatrix(matrix);

        // fill in with random values
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int)(Math.random()*10);
            }
        }

        // print values
        System.out.println("-----------");
        printMatrix(matrix);

        // print sum
        System.out.println("-----------");
        System.out.println("Sum of above: " + sumMatrix(matrix));



    }

    /** Print 2-dimensional array */
    public static void printMatrix(int matrix[][]){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println();
        }
    }

    /** Sum up all elements in 2-dimensional array */
    public static int sumMatrix(int matrix[][]){
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                sum += matrix[row][column];
            }
        }
        return sum;
    }
}
