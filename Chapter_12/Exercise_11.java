/*
(Remove text) Write a program that removes all the occurrences of a specified string from a text file.
For example, invoking java Exercise12_11 John filename removes the string John from the specified file.
Your program should get the arguments from the command line.
 */
package Chapter_12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercise_11 {
    public static void main(String[] args){
        // create placeholders for files
        File testFile = new File(args[1]);
        File testFile_new = new File(args[2]);
        String all = "";
        // read all data
        try {
            Scanner input = null;
            input = new Scanner(testFile);
            while (input.hasNext()){
                all += input.nextLine() + "\r\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            // print and replace
            System.out.println(all);
            all = all.replaceAll(args[0], "");
        // save to other file with replaced
        try{
            PrintWriter output = new PrintWriter(testFile_new);
            output.write(all);
            output.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
