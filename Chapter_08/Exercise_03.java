package Chapter_08;
/*
(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the students in increasing order of the number of correct answers.
 */
public class Exercise_03 {
    /** Main method */
    public static void main(String args[]) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // grades
        int grades[][] = new int[answers.length][2];

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            // write student's number and his grade int grades array
            grades[i][0] = i;
            grades[i][1] = correctCount;

            System.out.println("Student " + grades[i][0] + "'s correct count is " + grades[i][1]);
        }

        // sort grades array
        sortGrades(grades);

        // print sorted array
        System.out.println("------------------------------");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + grades[i][0] + "'s correct count is " + grades[i][1]);

        }
    }

    /** Sorts grades array ascending */
    public static int[][] sortGrades(int[][] grades){
        for (int i = 0; i < grades.length - 1; i++) {
            //find the minimum
            int currentMin = grades[i][1];
            int studentNumber = grades[i][0];
            int currentMinIndex = i;

            for (int j= i + 1; j <= grades.length-1; j++){
                if (currentMin > grades[j][1]){
                    currentMin = grades[j][1]; // change current min value
                    studentNumber = grades[j][0];
                    currentMinIndex = j;  // change index of current min value
                }
            }

            // swap numbers if necessary
            if (currentMinIndex != i){
                grades[currentMinIndex][0] = grades[i][0];
                grades[currentMinIndex][1] = grades[i][1];
                grades[i][0] = studentNumber;
                grades[i][1] = currentMin;
            }
        }
        return grades;
    }
}
