package Chapter_04;
import java.util.Scanner;
/*
(Geometry: area of a pentagon) Write a program that prompts the user to enter the length from the center of a pentagon
to a vertex and computes the area of the pentagon. The formula for computing the area of a pentagon is
Area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.pi / 5))
s = 2 * r * sin(Math.pi / 5 )
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for r
        System.out.println("Enter the length from the center to a vertex: ");
        double pentagon_r = input.nextDouble();

        // calculations
        double pentagon_s = 2 * pentagon_r * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(pentagon_s, 2)) / (4 * Math.tan(Math.PI / 5));

        // display results
        System.out.println("Area of pentagon is: " + String.format("%.2f", area));
    }
}
