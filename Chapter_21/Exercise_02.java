package Chapter_21;
import java.io.*;
import java.util.*;
/*
(Display non-duplicate words in ascending order) Write a program that reads words from a text file and displays all the
non-duplicate words in ascending order.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        String path = "C:\\Users\\luq\\Desktop\\test\\words.txt";
        // create HashSet for non-duplicate words
        HashSet<String> distinctWords = new HashSet<>();

        File file = new File(path);

        // read file
        try(BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            // put each line to string builder and separate lines with space
            while ((inputLine = input.readLine()) != null){
                stringBuilder.append(inputLine).append(" ");
            }
            // separate words from string builder
            System.out.println("All words: " + stringBuilder);
            String[] distinct = stringBuilder.toString().split(" ");
            // add words to HashSet
            Collections.addAll(distinctWords, distinct);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        // print distinct words using iterator
        Iterator itr = distinctWords.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}
