package Chapter_17;
import java.io.*;
/*
(Convert a text file into UTF) Write a program that reads lines of characters from a text file and writes each line as a UTF-8
string into a binary file. Display the sizes of the text file and the binary file. Use the following command to run the program:
java Exercise17_04 Welcome.java Welcome.utf
 */
public class Exercise_04 {
    public static void main(String[] args) throws IOException{
        // input and output file
        File inputFile = new File("C:\\Users\\luq\\Desktop\\test\\inputfile.txt");
        File outputFile = new File("C:\\Users\\luq\\Desktop\\test\\outputfile.txt");

        boolean ifExist = false;
        // try to initialize input and output streams
        try(    // initialize input stream
                BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
                // initialize output stream
                DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)))
                ){
            String s = "";
            // read data until eof
            while ((s = inputStream.readLine()) != null){
                s += "\r\n";
                // write into new file with UTF
                outputStream.writeUTF(s);
            }
        }
    }
}
