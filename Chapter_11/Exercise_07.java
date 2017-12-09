package Chapter_11;
import java.util.ArrayList;
import java.util.Collections;

/*
(Shuffle ArrayList) Write the following method that shuffles the elements in an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        shuffle(list);
        for (int element = 0; element < list.size(); element++) {
            System.out.println(list.get(element));
        }
    }

    /** Method that shuffles list */
    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}
