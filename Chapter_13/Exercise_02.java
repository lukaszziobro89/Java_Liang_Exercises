package Chapter_13;
import java.util.ArrayList;
/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
    public static void shuffle(ArrayList<Number> list)
 */
public class Exercise_02 {
    public static void main(String[] args) {
        // create array list with random numbers
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
            System.out.print(i + " ");
        }
        // shuffle array list
        shuffle(numbers);
        // print shuffled array list
        System.out.println("");
        for (int i = 0; i < 100; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    /** Shuffles array list */
    public static void shuffle(ArrayList<Number> list){
        for (int i = 0; i < list.size(); i++) {
             int randIndex = (int)(Math.random() * 100);
             Number temp = list.get(randIndex);
             list.set(randIndex, list.get(i));
             list.set(i, temp);
        }
    }
}


