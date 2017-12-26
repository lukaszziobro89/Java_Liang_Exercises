package Chapter_17;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
(Update count) Suppose you wish to track how many times a program has been executed. You can store an int to count the file.
Increase the count by 1 each time this program is executed. Let the program be Exercise17_08 and store the count in Exercise17_08.dat.
 */
public class Exercise_08 {
    public static void main(String[] args) throws IOException{
        // create reference file to read
        File inputFile = new File("C:\\Users\\luq\\Desktop\\test\\Exercise17_08.dat");

        try(RandomAccessFile raf = new RandomAccessFile(inputFile,"rw")){
            long count = raf.length();
            if(count != 0){
                count = raf.readLong() + 1;
            } else{
                count = 1;
            }
            raf.seek(0);
            raf.writeLong(count);
            System.out.println("The count is: " + count);
        }
    }
}
