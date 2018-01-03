package Chapter_19;
import java.util.ArrayList;
/*
(Largest element in ArrayList) Write the following method that returns the largest element in an ArrayList:
public static <E extends Comparable<E>> E max(ArrayList<E> list)
 */
public class Exercise_10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randNum = (int)(Math.random() * 100);
            list.add(randNum);
            System.out.print(randNum + " ");
        }

        System.out.println();
        System.out.println("Max: " + max(list));
    }

    /** Largest element in ArrayList - generic method */
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max = list.get(0);
        for (E element: list){
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }

}
