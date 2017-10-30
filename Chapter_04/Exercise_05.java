package Chapter_04;
import java.util.Scanner;
/*
The area of a hexagon can be computed using the following formula (s is the length of a side):
area  = (n * s^2) / 4 * tan(pi / n)
Write a program that prompts the user to enter the side of a hexagon and displays its area.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for side of hexagon
        System.out.println("Enter the number of sides: ");
        int sides_number = input.nextInt();

        //prompt for side
        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        // calculations
        double area = (sides_number * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / sides_number));

        // display results
        System.out.printf("Area is: " + String.format("%.2f", area));
    }
}
