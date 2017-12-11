package Chapter_12;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
(InputMismatchException) Write a program that prompts the user to read two integers and displays their sum.
Your program should prompt the user to read the number again if the input is incorrect.
 */
public class Exercise_02 {
    public static void main(String[] args) {
       // create scanner and variables
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean isValid = false;

        // while isValid not change into true (while both numbers are not integers) do a loop
        while (!isValid){
            try {
                System.out.println("Put two integer numbers: ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                isValid = true;
            } catch (InputMismatchException ex){
                input.nextLine();
                System.out.println("Invalid input. Put integers: ");
            }
        }
        System.out.println("Sum is: " + (num1 + num2));
    }
}
