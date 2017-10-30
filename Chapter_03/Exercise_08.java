package Chapter_03;
import java.util.Scanner;
/*
(Sort three integers) Write a program that prompts the user to enter three
integers and display the integers in non-decreasing order.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for numbers
        System.out.println("Please provide 3 integer numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 < num2){
            if (num2 < num3){
                System.out.println(num1 + " -> " + num2 + " -> " + num3);
            } else {
                System.out.println(num1 + " -> " + num3 + " -> " + num2);
            }
        } else if (num2 < num3){
            System.out.println(num2 + " -> " + num3 + " -> " + num1);
        } else{
            System.out.println(num3 + " -> " + num2 + " -> " + num1);
        }
    }
}
