package Chapter_11;
import java.util.ArrayList;
/*
(Remove duplicates) Write a method that removes the duplicate elements from an array list of integers using the following header:
    public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers separated by exactly one space.
 */
public class Exercise_13 {
    public static void main(String[] args) {
        // create array and fill with details
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(1);
        listOfIntegers.add(3);
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(4);
        listOfIntegers.add(5);

        // print distinct elements
        System.out.println("Initial state: ");
        for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.print(listOfIntegers.get(i) + " ");
        }

        // remove duplicates
        removeDuplicates(listOfIntegers);

        // print distinct elements
        System.out.println("\nDistinct elements: ");
        for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.print(listOfIntegers.get(i) + " ");
        }

    }

    /** Removes duplicates in ArrayList */
    public static void removeDuplicates(ArrayList<Integer> list){
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(i);
                }
            }
        }
    }
}
