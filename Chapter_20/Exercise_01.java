package Chapter_20;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
(Display words in ascending alphabetical order) Write a program that reads words from a text file and displays
all the words (duplicates allowed) in ascending alphabetical order. The words must start with a letter.
 */
public class Exercise_01 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\luq\\Desktop\\test\\inputFile.txt");
        List<String> list = new ArrayList<>();

        // read file into list
        boolean eof = false;
        try {
            BufferedReader dataInputStream = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = dataInputStream.readLine()) != null){
                if ((((int)line.charAt(0)) >= 65 && ((int)line.charAt(0)) <= 90) ||
                    (((int)line.charAt(0)) >= 97 && ((int)line.charAt(0)) <= 122)) {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eofEx){
            eof = true;
        }


        // sort list
        Collections.sort(list);

       // print list
        for (String word : list) {
            System.out.println(word);
        }
    }
}
