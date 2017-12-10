package Chapter_11;
import java.util.ArrayList;
import java.util.Scanner;
/*
(Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an answer is entered again.
Hint: use an array list to store answers. Here is a sample run:
    What is 5 + 9? 12
    Wrong answer. Try again. What is 5 + 9? 34
    Wrong answer. Try again. What is 5 + 9? 12
    You already entered 12
    Wrong answer. Try again. What is 5 + 9? 14
    You got it!
 */
public class Exercise_16 {
    public static void main(String[] args) {
        // create variables and array for answers
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        ArrayList<Integer> allAnswers = new ArrayList<>();

        System.out.println("What is: " + num1 + " + " + num2 + " = ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // run the game
        while (num1 + num2 != answer){
            if (allAnswers.contains(answer)){
                System.out.println("You already provided this answer: " + answer);
            }
            System.out.println("Wrong answer! Try again. What is: " + num1 + " + " + num2 + " = ?");
            allAnswers.add(answer);
            answer = input.nextInt();
        }
        System.out.println("You got it! " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
