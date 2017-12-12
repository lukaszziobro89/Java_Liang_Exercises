package Chapter_12;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/*
(Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces text in a source file and saves the change into a new file.
Revise the program to save the change into the original file. For example, invoking java Exercise12_16 file oldString newString
replaces oldString in the source file with newString.
 */
public class Exercise_16 {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println(
                    "Usage: java sourceFile oldStr newStr");
            System.exit(1);
        }

        String path = args[0];
        // Check if source file exists
        File sourceFile = new File(path);

        // check if file exist
        if(!sourceFile.exists()){
            System.out.println("File does not exist.");
            System.exit(0);
        }

        // read file, replace patterns and save into the same file
        try (
            // Create input and output files
            Scanner input = new Scanner(sourceFile)
        ) {
            StringBuilder s1 = new StringBuilder();
            while (input.hasNext()) {
                String s = input.nextLine().replaceAll(args[1],args[2]);
                s1.append(s+"\r\n");
            }
            PrintWriter output = new PrintWriter(sourceFile);
            output.println(s1);
            output.close();
        }
    }
}
