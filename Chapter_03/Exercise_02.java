package Chapter_03;
import java.util.Scanner;

public class Exercise_02 {

public static void main(String[] args) {
            int number1 = (int)(System.currentTimeMillis() % 10);
            int number2 = (int)(System.currentTimeMillis() / 7 % 10);
            int number3 = (int)(System.currentTimeMillis() / 7 % 10);

            // Create a Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

            // prompt for answer
            int answer = input.nextInt();

            // check answer and print message
            System.out.println(number1 + " + " + number2 + " + " + number2 + " = " + answer + " is " + (number1 + number2 + number3== answer));
    }
}

