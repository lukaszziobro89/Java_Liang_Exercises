package Chapter_05;
import java.util.Scanner;
/*
(Find the two highest scores) Write a program that prompts the user to enter the number of students
and each student’s name and score, and finally displays the student with the highest score
and the student with the second-highest score.
 */
public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        double currentScore = 0;
        String currentName = "";
        double firstTopScore = 0;
        double secondTopScore = 0;
        String firstTopName = "";
        String secondTopName = "";

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
            if (currentScore > firstTopScore){
                firstTopScore = currentScore;
                firstTopName = currentName;
            } else if (currentScore > secondTopScore){
                secondTopScore = currentScore;
                secondTopName = currentName;
            }
        }

        // display results
        System.out.println("--------------------------------------");
        System.out.println("Top students name: " + firstTopName + " with score: " + firstTopScore);
        System.out.println("Second top students' name: " + secondTopName + " with score: " + secondTopScore);
    }
}
