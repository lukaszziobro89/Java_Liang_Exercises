package Chapter_17;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
(Store objects and arrays in a file) Write a program that stores an array of the five int values 1, 2, 3, 4, and 5, a Date object
for the current time, and the double value 5.5 into the file named Exercise17_05.dat.
 */
public class Exercise_05 {
    public static void main(String[] args) throws IOException{
        int[] numbers = {1,2,3};
        Date data = new Date();
        File file = new File("C:\\Users\\luq\\Desktop\\test\\objectOutputFile.txt");

        try(ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream(file))){
            objOutStream.writeObject(numbers);
            objOutStream.writeObject(data);
            objOutStream.writeInt(23);
            objOutStream.writeDouble(2.3);
        }
    }
}
