package Chapter_08.other;

public class GradeExam {
    public static void main(String[] args) {
        // students answers
        char[][] exams = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        };

        // key to the questions
        char [] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // grage all exams
        for (int i = 0; i < exams.length; i++) {
            int correctAnswers = countCorrectAnswers(exams[i], keys);
            System.out.println("Exam " + i + " : " + correctAnswers + " correct answers.");
        }


    }

    /** Count correct answers using key */
    public static int countCorrectAnswers(char[] answers, char[] keys){
        int counter = 0;
        for (int studentAnswer = 0; studentAnswer < answers.length; studentAnswer++) {
            if (answers[studentAnswer] == keys[studentAnswer]){
                counter++;
            }
        }
        return counter;
    }
}
