package Chapter_10;
import Chapter_10.Chapter_Classes.MyRectangle2D;
import java.util.Scanner;
/*
(Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle that encloses a set of points in a two-dimensional plane,
as shown in Write a method that returns a bounding rectangle for a set of points in a two-dimensional plane, as follows:
public static MyRectangle2D getRectangle(double[][] points)
Write a test program that prompts the user to enter five points and displays the bounding rectangle’s center, width, and height.
 */
public class Exercise_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        // get points from user
        for (int row = 0; row < points.length; row++) {
                System.out.println("Put x for point " + row);
                double x = input.nextDouble();
                System.out.println("Put y for point " + row);
                double y = input.nextDouble();
                points[row][0] = x;
                points[row][1] = y;
        }

        System.out.println(getMaxX(points));
        System.out.println(getMaxY(points));
        System.out.println(getMinX(points));
        System.out.println(getMinY(points));

        // get bounding rectangle
        MyRectangle2D boundingRectangle = getRectangle(points);

        // display results
        System.out.println("The bounding rectangle's center ("
                + boundingRectangle.getX() + ", " + boundingRectangle.getY() +
                "), width: " +  boundingRectangle.getWidth() + " height: " + boundingRectangle.getHeight());

    }

    /** The bounding rectangle is the minimum rectangle that encloses a set of points in a two-dimensional plane */
    public static MyRectangle2D getRectangle(double[][] points){
        double maxX = getMaxX(points);
        double minX = getMinX(points);
        double maxY = getMaxY(points);
        double minY = getMinY(points);
        double centerX = (maxX + minX)/2;
        double centerY = (maxY + minY)/2;
        double width = maxX - minX;
        double height = maxY - minY;

        // create rectangle
        MyRectangle2D myRec = new MyRectangle2D(centerX, centerY, width, height);

        // return rectangle
        return myRec;
    }

    /** Returns max value from x coordinates*/
    public static double getMaxX(double[][] points){
        double max = points[0][0];
        for (int row = 0; row < points.length; row++) {
            if (points[row][0] > max){
                max = points[row][0];
            }
        }
        return max;
    }

    /** Returns min value from x coordinates*/
    public static double getMinX(double[][] points){
        double min = points[0][0];
        for (int row = 0; row < points.length; row++) {
            if (points[row][0] < min){
                min = points[row][0];
            }
        }
        return min;
    }

    /** Returns max value from y coordinates*/
    public static double getMaxY(double[][] points){
        double max = points[0][1];
        for (int row = 0; row < points.length; row++) {
                if (points[row][1] > max){
                    max = points[row][1];
                }
        }
        return max;
    }

    /** Returns min value from y coordinates*/
    public static double getMinY(double[][] points){
        double min = points[0][1];
        for (int row = 0; row < points.length; row++) {
            if (points[row][1] < min){
                min = points[row][1];
            }
        }
        return min;
    }

}
