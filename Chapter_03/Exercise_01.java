package Chapter_03;
import java.util.Scanner;
/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:
r1 = (-b + sqrt(b^2 - 4ac))/ 2a
r2 = (-b + sqrt(b^2 - 4ac))/ 2a
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots.
If it is zero, the equation has one root. If it is negative,the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
Otherwise, display “The equation has no real roots”. Note that you can use Math.pow(x, 0.5) to compute sqrt.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for a,b,c
        System.out.println("Please provide 'a' :");
        double a = input.nextDouble();
        System.out.println("Please provide 'b' :");
        double b = input.nextDouble();
        System.out.println("Please provide 'c' :");
        double c = input.nextDouble();

        double discriminant = b*b - 4*a*c;

        if (discriminant < 0){
            System.out.println("The equation has no real roots");
        } else if (discriminant == 0){
            double r0 = -b / 2*a;
            System.out.println("The equation has one root: "+ r0);
        } else {
            double r1 = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            double r2 = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
    }
}
