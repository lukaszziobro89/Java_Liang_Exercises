package Chapter_19;
import java.util.ArrayList;
/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList:
public static <E> void shuffle(ArrayList<E> list)
 */
public class Exercise_08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("-----------------------------");
        System.out.println("Original list: ");
        for (int i = 0; i < 5; i++) {
            list.add((int)(Math.random() * 100));
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        shuffle(list);

        System.out.println("-----------------------------");
        System.out.println("Shuffled list: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");

    }

    public static <E> void shuffle(ArrayList<E> list){
        for (int i = 0; i < list.size(); i++) {
            int random = (int)(Math.random() * list.size());    // generate random index
            E tempValue = list.get(random);                     // get value from random index
            list.set(random, list.get(i));
            list.set(i, tempValue);
        }
    }
}
