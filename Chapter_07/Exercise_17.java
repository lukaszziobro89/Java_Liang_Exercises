package Chapter_07;
import java.util.Scanner;
/*
(Sort students) Write a program that prompts the user to enter the number of students,
the students’ names, and their scores, and prints student names in decreasing order of their scores.
 */
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get number of students and create arrays
        System.out.println("How many students you want to add: ");
        int numberOfStudents = input.nextInt();
        String names[] = new String[numberOfStudents];
        int scores[] = new int[numberOfStudents];

        // prompt for names and scores
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Put name of student " + i + ": ");
            names[i] = input.next();
            System.out.print("Put score of student "+ i + ": ");
            scores[i] = input.nextInt();
        }

        // display unsorted
        System.out.println("-------------------------------------");
        System.out.println("Unsorted list of students and scores: ");
        printStudentsAndScores(names, scores);
        System.out.println("\n-------------------------------------");

        // sort and display sorted
        sortStudentsDecreasing(names, scores);
        System.out.println("Sorted decreased list of students and scores: ");
        printStudentsAndScores(names, scores);
        System.out.println("\n-------------------------------------");

    }

    /** Print all students and their scores */
    public static void printStudentsAndScores(String[] names, int[] scores){
        for (int i = 0; i < names.length; i++) {
            System.out.printf("\nStudent: %-10s Score: %-5d", names[i], scores[i]);
        }
    }

    /** Sort arrays of names and scores with decreased order of scores */
    public static void sortStudentsDecreasing(String[] names, int[] scores){
        for (int i = 0; i < names.length; i++) {
            int max = scores[i];
            int maxIndex = i;
            String tempName;

            // find maximum in the list of scores
            for (int j = i + 1; j < names.length; j++) {
                if(max < scores[j]){
                    max = scores[j];
                    maxIndex = j;
                }
            }

            // swap scores and names if required
            if (maxIndex != i){
                // scores
                scores[maxIndex] = scores[i];
                scores[i] = max;

                // names
                tempName = names[maxIndex];
                names[maxIndex] = names[i];
                names[i] = tempName;
            }
        }
    }
}
