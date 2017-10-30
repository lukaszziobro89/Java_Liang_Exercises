package Chapter_05;
import java.util.Scanner;
/*
(Find the highest score) Write a program that prompts the user to enter the number of students
and each student’s name and score, and finally displays the name of the student with the highest score.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        double currentScore = 0;
        double biggestScore=0;
        String currentName = "";
        String topName = "";

        // prompt for number of students
        System.out.println("Please enter number of students: ");
        int studentsNumber = input.nextInt();

        // loop within students
        for (int i=1; i<=studentsNumber; i++){
            // prompt for name and score
            System.out.print("Enter name for student no. " + i + " :");
            currentName = input.next();
            System.out.print("Enter score for student no. " + i + " :");
            currentScore = input.nextDouble();

            // check current score with biggest score
            if (currentScore > biggestScore){
                biggestScore = currentScore;
                topName = currentName;
            }
        }

        // display results
        System.out.println("--------------------------------------");
        System.out.println("Top students name: " + topName);
        System.out.println("Top students score: " + biggestScore);
    }
}
