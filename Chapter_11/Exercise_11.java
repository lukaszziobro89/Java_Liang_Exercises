package Chapter_11;
import java.util.ArrayList;
/*
(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
    public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays them in increasing order.
 */
public class Exercise_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        // sort and print array list
        sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    /** Sorts array in increasing order */
    public static void sort(ArrayList<Integer> list){
        // return if array list is empty
        if (list.isEmpty()){return;}
        // do for each element in array list
        for (int i = 0; i < list.size() - 1; i++) {
            int currentMin = list.get(i);
            int minIndex = i;
            // compare current element with each till end of array list
            for (int j = i + 1; j < list.size(); j++) {
                if(currentMin > list.get(j)){
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
