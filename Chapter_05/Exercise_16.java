package Chapter_05;
import java.util.Scanner;
/*
(Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors
in increasing order. For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for integer
        System.out.print("Put integer: ");
        int number = input.nextInt();

        for (int i = 2; i <= number; ) {
            // start with divide by 2, if not divisible try with 3 then 4, 5...
            if (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            } else {
                i++;
            }
        }
    }
}
