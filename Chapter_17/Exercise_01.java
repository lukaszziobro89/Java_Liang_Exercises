package Chapter_17;
/*
(Create a text file) Write a program to create a file named Exercise17_01.txt if it does not exist.
Append new data to it if it already exists. Write 100 integers created randomly into the file using text I/O.
Integers are separated by a space.
 */
import java.io.*;
public class Exercise_01 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\luq\\Desktop\\test\\Exercise17_01.txt");
        boolean ifExist = file.exists();        // true if file exist
        int randValue;
        try (PrintWriter output = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, ifExist)))){
            for (int i = 0; i < 10; i++) {
                randValue = (int)(Math.random()*100);
                System.out.println(randValue);
                output.write(String.valueOf(randValue) + "\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}