package Chapter_11;
import java.util.ArrayList;
/*
Combine two lists) Write a method that returns the union of two array lists of integers using the following header:
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}.
Write a test program with two lists and displays their union. The numbers are separated by exactly one space in the output.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        // create two lists and fill with elements
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        // union lists and print all elements
        union(list1,list2);
        System.out.println("Union list:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }

    /** Unions two ArrayList of Integers */
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        for (int element = 0; element < list2.size(); element++) {
             list1.add(list2.get(element));
        }
        return list1;
    }
}
