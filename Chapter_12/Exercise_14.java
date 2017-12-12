package Chapter_12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*
(Process scores in a text file) Suppose that a text file contains an unspecified number of scores separated by blanks.
Write a program that prompts the user to enter the file, reads the scores from the file, and displays their total and average.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        // generate random numbers and save into file
        generateRandomScores(15, args[0]);
    }

    /** Count total and average from scores file */
    public static void countTotalAndAverageFromScores(String scoresPath){
        try {
            double total = 0;
            File numbersFile = new File(scoresPath);
            Scanner input = new Scanner(numbersFile);
            ArrayList<Integer> numbersSplitted = new ArrayList<>();
            while (input.hasNext()){
                numbersSplitted.add(Integer.parseInt(input.next()));
            }
            // count total
            for (int i = 0; i < numbersSplitted.size(); i++) {
                total += numbersSplitted.get(i);
            }
            System.out.println("Total: " + total);
            System.out.println("Average: " + (total/numbersSplitted.size()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /** Generate random numbers and saves into text file */
    public static void generateRandomScores(int numberOfScores, String path){
        File testFile = new File(path);
        try {
            PrintWriter output = new PrintWriter(testFile);
            String numbers = "";
            for (int i = 0; i < numberOfScores; i++) {
                int number = (int)(Math.random() * 100);
                System.out.println(number);
                numbers += number + " ";
            }
            output.write(numbers);
            output.close();
            countTotalAndAverageFromScores(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
