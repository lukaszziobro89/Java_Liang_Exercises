package Chapter_11;
import java.util.ArrayList;
/*
(Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
    public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
 */
public class Exercise_12 {
    public static void main(String[] args) {
        // create array and fill with numbers
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add((double)i);
        }

        // print sum
        System.out.println("Sum is: " + sum(list));

    }

    /** Sums all numbers in array list */
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
             sum += list.get(i);
        }
        return sum;
    }
}
