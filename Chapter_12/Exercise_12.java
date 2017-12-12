package Chapter_12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
(Reformat Java source code) Write a program that converts the Java source code from the next-line brace style to the end-of-line brace style.
For example, the following Java source in (a) uses the next-line brace style. Your program converts it to the end-of-line brace style.
Your program can be invoked from the command line with the Java sourcecode file as the argument.
It converts the Java source code to a new format.
For example, the following command converts the Java source-code file Test.java to the end-of-line brace style.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        // create placeholders for files
        File testFile = new File("C:\\Users\\luq\\Desktop\\test\\Exercise_12.java");
        File testFile_new = new File("C:\\Users\\luq\\Desktop\\test\\Exercise_12_modified.java");
//        File testFile = new File(args[0]);
//        File testFile_new = new File(args[1]);
        StringBuilder all = new StringBuilder();
        // read all data
        try {
            Scanner input = null;
            input = new Scanner(testFile);
            while (input.hasNext()){
                String s = input.nextLine();
                if (s.contains("{")){
                    all.append(" {");
                } else{
                  all.append("\n" + s);
                }
            }
            System.out.println(all);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // save to other file with replaced
        try{
            PrintWriter output = new PrintWriter(testFile_new);
            output.write(all.toString());
            output.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
