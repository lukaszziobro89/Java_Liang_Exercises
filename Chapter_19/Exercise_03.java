package Chapter_19;
import java.util.ArrayList;
/*
(Distinct elements in ArrayList) Write the following method that returns a new ArrayList.
The new list contains the non-duplicate elements from the original list.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
public class Exercise_03 {
    public static void main(String[] args) {
        ArrayList<String> withDuplicates = new ArrayList<>();
        ArrayList<String> withoutDuplicates;
        withDuplicates.add("first");
        withDuplicates.add("second");
        withDuplicates.add("third");
        withDuplicates.add("first");
        withDuplicates.add("first");
        withDuplicates.add("second");
        withDuplicates.add("third");
        withDuplicates.add("first");

        System.out.println("With duplicates");
        System.out.println("----------------");
        for (int i = 0; i < withDuplicates.size(); i++) {
            System.out.println(withDuplicates.get(i));
        }
        System.out.println("----------------");

        // remove duplicates
        withoutDuplicates = removeDuplicates(withDuplicates);

        System.out.println("Without duplicates");
        System.out.println("----------------");
        for (int i = 0; i < withoutDuplicates.size(); i++) {
            System.out.println(withoutDuplicates.get(i));
        }
        System.out.println("----------------");


    }

    /** Returns ArrayList without duplicated values */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> withoutDuplicates = new ArrayList<>();
        // iterate through original list
        for (E element: list){
            if (!withoutDuplicates.contains(element)){
                withoutDuplicates.add(element);
            }
        }
        return withoutDuplicates;
    }
}
