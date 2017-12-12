package Chapter_12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*
(Write/read data) Write a program to create a file named Exercise12_15.txt if it does not exist.
Write 100 integers created randomly into the file using text I/O. Integers are separated by spaces in the file.
Read the data back from the file and display the data in increasing order.
 */
public class Exercise_15 {
    public static void main(String[] args)  {
        String path = args[0];
        generateRandomScores(100,path);
        printInDecreasedOrder(path);
    }

    /** Prints elements from file in decreased order */
    public static void printInDecreasedOrder(String path){
        File numbersFile = new File(path);
        // read data into array of integers
        try {
            ArrayList<Integer> numbersArray = new ArrayList<>();
            Scanner reader = new Scanner(numbersFile);
            while (reader.hasNext()){
                numbersArray.add(Integer.parseInt(reader.next()));
            }
            sort(numbersArray);
            // print in decreasing order
            for (int i = 0; i < numbersArray.size(); i++) {
                System.out.println(numbersArray.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /** Generates random numbers and saves into text file */
    public static void generateRandomScores(int numberOfScores, String path){
        File testFile = new File(path);
        boolean fileExists = false;
        // check if file exists - if not, create it
        try {
            if (testFile.exists()){
                System.out.println("File already exists.");
            } else {
                fileExists = testFile.createNewFile();
                System.out.println("File created: " + fileExists);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        // generate numbers and save it into file
        try {
            PrintWriter output = new PrintWriter(testFile);
            String numbers = "";
            for (int i = 0; i < numberOfScores; i++) {
                int number = (int)(Math.random() * 100);
                numbers += number + " ";
            }
            output.write(numbers);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /** Sorts array in decreasing order */
    public static void sort(ArrayList<Integer> list){
        // return if array list is empty
        if (list.isEmpty()){return;}
        // do for each element in array list
        for (int i = 0; i < list.size() - 1; i++) {
            int currentMin = list.get(i);
            int minIndex = i;
            // compare current element with each till end of array list
            for (int j = i + 1; j < list.size(); j++) {
                if(currentMin < list.get(j)){
                    currentMin = list.get(j);
                    minIndex = j;
                }
            }
            // shift elements if required
            if (minIndex != i){
                list.set(minIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
