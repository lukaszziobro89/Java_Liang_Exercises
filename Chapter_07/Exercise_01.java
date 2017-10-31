package Chapter_07;
import java.util.Scanner;
/*
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for number of students
        System.out.println("Put number of students: ");
        int numberOfStudents = input.nextInt();

        // get grade for each student
        int scores[] = new int[numberOfStudents];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Put score for " + " student: ");
            scores[i] = input.nextInt();
        }

        // print all scores
        System.out.print("Scores are: ");
        printArray(scores);

        // find max score
        int maxScore = findMaxInArray(scores);
        System.out.println("\nMax score is: " + maxScore);

        // print score for each student
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + i + " ->  Score: " + scores[i] + " - ");
            System.out.print("Grade: ");

            char grade;
            if (scores[i] >= maxScore - 10){
                grade = 'A';
            } else if (scores[i] >= maxScore - 20){
                grade = 'B';
            } else if (scores[i] >= maxScore - 30){
                grade = 'C';
            } else if (scores[i] >= maxScore - 40){
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println(grade);
        }
    }

    /** Print all elements of array in one line */
    public static void printArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

    /** Find max from all array elements */
    public static int findMaxInArray(int[] inputArray){
        // check if array is not empty
        if (inputArray.length ==0){
            System.out.println("Empty array provided.");
            return -1;
        }
        // assign max to first element of array
        int maxValue = inputArray[0];
        // compare to each element and swap maxValue if required
        for (int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}
