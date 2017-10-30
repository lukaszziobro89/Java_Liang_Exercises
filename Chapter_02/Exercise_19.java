package Chapter_02;
import java.util.Scanner;
/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = sqrt[s(s - side1)(s - side2)(s - side3)]
 */
public class Exercise_19 {
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
        System.out.println("Please provide x3 :");
        double x3 = input.nextDouble();
        System.out.println("Please provide y3 :");
        double y3 = input.nextDouble();

        //calculations
        double side_1 = Math.pow(((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2))) ,0.5);
        double side_2 = Math.pow(((Math.pow(x3-x1, 2)) + (Math.pow(y3-y1, 2))) ,0.5);
        double side_3 = Math.pow(((Math.pow(x3-x2, 2)) + (Math.pow(y3-y2, 2))) ,0.5);
        double s = (side_1 + side_2 + side_3) / 2;
        double area = Math.sqrt(s*(s - side_1)*(s - side_2)*(s - side_3));

        // display results
        System.out.println("Area is: " + area);
    }
}
