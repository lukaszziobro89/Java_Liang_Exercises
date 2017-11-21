package Chapter_09.Chapter_Classes;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    /**
     * Returns indexes of max value
     */
    public static Location locateLargest(double[][] a) {
        int row = 0;
        int column = 0;
        double maxValue = a[row][column];
        for (int rowMatrix = 0; rowMatrix < a.length; rowMatrix++) {
            for (int columnMatrix = 0; columnMatrix < a[rowMatrix].length; columnMatrix++) {
                if (maxValue < a[rowMatrix][columnMatrix]) {
                    maxValue = a[rowMatrix][columnMatrix];
                    row = rowMatrix;
                    column = columnMatrix;
                }
            }
        }
        return new Location(row, column, maxValue);
    }
}

