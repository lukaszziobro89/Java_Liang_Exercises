package Chapter_17;
import java.io.*;
/*
(Create a binary data file) Write a program to create a file named Exercise17_02.dat if it does not exist.
Append new data to it if it already exists. Write 100 integers created randomly into the file using binary I/O.
 */
public class Exercise_02{
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\luq\\Desktop\\test\\Exercise17_01.dat");
        boolean ifExists = file.exists();
        int randValue;

        // write/append data into file
        try(DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file,ifExists)))){
            for (int i = 0; i < 10; i++) {
                randValue = (int)(Math.random()*100);
                System.out.println(randValue);
                outputStream.writeInt(randValue);
            }
        }

        // read data from file
        System.out.println("---");
        boolean eof = false;
        try(DataInputStream input = new DataInputStream(new FileInputStream(file))){
            while (!eof){
                System.out.println(input.readInt());
            }
        }catch (EOFException ex){
            eof = true;
        }
    }
}
