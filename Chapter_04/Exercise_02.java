package Chapter_04;
import java.util.Scanner;
/*
(Geometry: great circle distance) The great circle distance is the distance between two points on the surface of a sphere.
Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great circle distance
between the two points can be computed using the following formula:
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees
and displays its great circle distance. The average earth radius is 6,371.01 km. Note that you need to convert
the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians.
The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        double RADIUS = 6371.01;
        Scanner input = new Scanner(System.in);

        // prompt for points
        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        // degrees
        double x1_deg = input.nextDouble();
        double y1_deg = input.nextDouble();
        // conversion to radians
        double x1_rad = Math.toRadians(x1_deg);
        double y1_rad = Math.toRadians(y1_deg);

        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        // degrees
        double x2_deg = input.nextDouble();
        double y2_deg = input.nextDouble();
        // conversion to radians
        double x2_rad = Math.toRadians(x2_deg);
        double y2_rad = Math.toRadians(y2_deg);

        // calculations and display results
        double distance = RADIUS * Math.acos(Math.sin(x1_rad) * Math.sin(x2_rad) + Math.cos(x1_rad) * Math.cos(x2_rad) * Math.cos(y1_rad - y2_rad));
        System.out.println("Distance between points is: " + distance + " km.");
    }
}
