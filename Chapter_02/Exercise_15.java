package Chapter_02;
import java.util.Scanner;
/*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
The formula for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Note that
you can use Math.pow(a, 0.5) to compute 2a.
 */
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for points
        System.out.println("Please provide x1 :");
        double x1 = input.nextDouble();
        System.out.println("Please provide y1 :");
        double y1 = input.nextDouble();
        System.out.println("Please provide x2 :");
        double x2 = input.nextDouble();
        System.out.println("Please provide y2 :");
        double y2 = input.nextDouble();

        // calculations
        double distance = Math.pow(((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2))) ,0.5);

        // display results
        System.out.println("The distance between those 2 points is: " + distance);
    }
}
