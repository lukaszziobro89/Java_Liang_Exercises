package Chapter_19;
import java.util.ArrayList;
/*
(Sort ArrayList) Write the following method that sorts an ArrayList:
public static <E extends Comparable<E>> void sort(ArrayList<E> list)
 */
public class Exercise_09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // unsorted ArrayList
        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) {
            int randNum = (int)(Math.random()*100);
            list.add(randNum);
            System.out.print(list.get(i) + " ");
        }

        sort(list);

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Sorted list:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        // take into checking each element except last one
        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int minIndex = i;
            // compare current element with each till end of list
            for (int j = i + 1; j < list.size(); j++) {
                 // change currentMin and minIndex if required
                if (currentMin.compareTo(list.get(j)) > 0){
                    currentMin = list.get(j);
                    minIndex = j;
                }
            }
            // swap elements if required
            if (minIndex != i){
                list.set(minIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
