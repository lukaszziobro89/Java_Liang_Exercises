package Chapter_03;
import java.util.Scanner;
/*
(Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or tails.
The program randomly generates an integer 0 or 1, which represents head or tail.
The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for head/tail
        System.out.println("Head - 0, Tail - 1, which one you choose?");
        int user_guess = input.nextInt();

        // random generate 0 or 1
        int coin = (int)(Math.random() * 2);
        System.out.println("Coin is " + ((coin == 0) ? " head." : " tail."));
        System.out.println("Your guess is " + ((coin == user_guess) ? " correct." :" incorrect."));
        System.out.println("-------------------------------------------");
    }
}
