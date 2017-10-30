package Chapter_05;
import java.util.Scanner;
/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find the greatest common divisor
of two integers n1 and n2 is as follows: First find d to be the minimum of n1 and n2,
then check whether d, d-1, d-2, . . . , 2, or 1 is a divisor for both n1 and n2 in this order.
The first such common divisor is the greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        int d = 0;
        int gcd=1; // can initialize with 1 as 1 is always divisor of 2 integers

        // prompt for 2 integers
        System.out.println("Put first integer: ");
        int n1 = input.nextInt();
        System.out.println("Put second integer: ");
        int n2 = input.nextInt();

        d = Math.min(n1,n2);
        // calculate
        if (n1 % d == 0 && n2 % d == 0){
            gcd = d;
        } else {
            d--;
        }

        // display results
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}
