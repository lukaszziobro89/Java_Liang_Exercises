package Chapter_12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
(Count characters, words, and lines in a file) Write a program that will count the number of characters, words, and lines in a file.
Words are separated by whitespace characters. The file name should be passed as a command-line argument.
 */
public class Exercise_13 {
    public static void main(String[] args) {
        // create placeholders for files
        File testFile = new File(args[0]);
        int characters = 0;
        int words = 0;
        int lines = 0;
        // count characters, words and lines
        try {
            Scanner input = null;
            input = new Scanner(testFile);

            while(input.hasNext()){
                String s = input.nextLine();
                lines++; // increase lines counter in each nextLine
                characters += s.length(); // number of characters in line is length of line
                String[] wordsInLine = s.split(" "); // words in line is array of strings splitted by space
                for (int i = 0; i < wordsInLine.length; i++) {
                    words++; // increase each
                }
            }
            System.out.println("Lines: " + lines);
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
