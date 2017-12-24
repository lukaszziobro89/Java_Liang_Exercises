package Chapter_17;
import java.io.*;
/*
(Sum all the integers in a binary data file) Suppose a binary data file named Exercise17_03.dat has been created and its data are created
using writeInt(int) in DataOutputStream. The file contains an unspecified number of integers. Write a program to find the sum of the integers.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        // generate random numbers 1-100 and save into file in path directory
        saveRandomNumbersInFile(10,"C:\\Users\\luq\\Desktop\\test", "Exercise17_03.dat");
        // open file read it and sum elements
        System.out.println("---------------");
        double sum = sumIntElementsFromBinaryFile("C:\\Users\\luq\\Desktop\\test\\Exercise17_03.dat");
        System.out.println("Sum of elements: " + sum);
    }

    /** Reads numbers from file and sums them */
    private static double sumIntElementsFromBinaryFile(String pathToFile){
        double sum = 0;
        File file = new File(pathToFile);
        boolean eof = false;

        try(DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(pathToFile)))){
            int value = 0;
            while(!eof){
                value = inputStream.readInt();
                sum += value;
            }
        } catch (EOFException eofEx){
            eof = true;
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return sum;
    }

    /** Generates number of random numbers and saves in file under path */
    private static File saveRandomNumbersInFile(int numberOfElements, String path, String fileName){
        String fullPath = path + "\\" + fileName;
        File file = new File(fullPath);
        boolean ifExist = file.exists();
        int randValue;

        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, ifExist)))){
            for (int i = 0; i < numberOfElements; i++) {
                 randValue = (int)(Math.random() *100);
                 outputStream.writeInt(randValue);
                 System.out.println(randValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}
