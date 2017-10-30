package Chapter_06;
import java.util.Scanner;
public class TestMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        displayPattern(num);
    }

    public static void displayPattern(int n) {

        // number of rows
        for (int row = 1; row <= n; row++) {

            // empty strings to print == n - row
            for (int formatter = 1; formatter <= n - row; formatter++) {
                System.out.printf("%4s", "");
            }

            // numbers to print == row number
            for (int column = row; column >= 1; column--) {
                System.out.printf("%4d", column);
            }
            System.out.println();

        }
    }
}
