package Chapter_04;
import java.util.Scanner;
/*
The area of a hexagon can be computed using the following formula (s is the length of a side):
area  = (6 * s^2) / 4 * tan(pi/6)
Write a program that prompts the user to enter the side of a hexagon and displays its area.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for side of hexagon
        System.out.println("Please provide side of hexagon: ");
        double side = input.nextDouble();

        // calculations
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        // display results
        System.out.printf("Area is: " + String.format("%.2f", area));
    }
}
