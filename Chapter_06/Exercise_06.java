package Chapter_06;
import java.util.Scanner;
/*
(Display patterns) Write a method to display a pattern as follows:
                1
              2 1
            3 2 1
...
  n n-1 ... 3 2 1
The method header is public static void displayPattern(int n)
 */
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt for number
        System.out.println("Please provide integer number: ");
        int number = input.nextInt();

        displayPattern(number);
    }

    /** Method that displays pattern */
    public static void displayPattern(int n){
        for (int i=1; i<=n; i++){
            // print spaces first
            for (int j=1; j <= n - i; j++){
                System.out.printf("%4s", "");
            }
            for (int k=1; k <= i; k++){
                System.out.printf("%4s" , (i - k + 1));
            }
            System.out.print("\n");
        }
    }
}
