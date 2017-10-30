package Chapter_02;
import java.util.Scanner;
/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
area = (3*sqrt(3) / 2 ) * s^2
 */
public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for side
        System.out.println("Please provide side of hexagon :");
        double side = input.nextDouble();

        // calculations
        double area = ((3*Math.sqrt(3))/2) * Math.pow(side,2);

        // display results
        System.out.println("The area of the hexagon is: " + area);
    }
}
