package Chapter_03;
/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit number. The program prompts
the user to enter a three-digit number and determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        // Generate a lottery
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryRemain = lottery % 100;
        int lotteryDigit2 = lotteryRemain / 10;
        int lotteryDigit3 = lotteryRemain % 10;

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessRemain = guess % 100;
        int guessDigit2 = guessRemain / 100;
        int guessDigit3 = guessRemain % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit3 == lotteryDigit3)) ||
                ((guessDigit1 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
                ((guessDigit3 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
                ((guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit1 == lotteryDigit3)) ||
                ((guessDigit3 == lotteryDigit1) && (guessDigit2 == lotteryDigit2) && (guessDigit1 == lotteryDigit3))) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3) ||
                (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3) ||
                (guessDigit3 == lotteryDigit1) || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3)) {
            System.out.println("Match one digit: you win $1,000");
        }
        else
            System.out.println("Sorry, no match");
    }
}

