package Chapter_03;
import java.util.Scanner;
/*
(Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes
the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid
if the sum of every pair of two edges is greater than the remaining edge.
 */
public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = 0;

        // prompt for triangle sides
        System.out.println("Put length of first side: ");
        double a = input.nextDouble();
        System.out.println("Put length of first side: ");
        double b = input.nextDouble();
        System.out.println("Put length of first side: ");
        double c = input.nextDouble();

        // check if every pair is greater then other one edge
        if (a + b > c && b + c > a && a + c > b){
            System.out.println("Correct edges.");
            perimeter = a + b + c;
            System.out.println("Perimeter: " + perimeter);
        } else {
            System.out.println("Incorrect edges.");
        }
    }
}
