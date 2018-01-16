package Chapter_20;
import java.util.Iterator;
import java.util.LinkedList;
/*
(Use iterators on linked lists) Write a test program that stores 500k integers in a linked list and test the
time to traverse the list using an iterator vs. using the get(index) method.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        // fill in with 500k integers
        for (int i = 0; i < 500000; i++) {
            integerLinkedList.add(i);
        }

        // count time of traversing list using iterator
        Iterator itr = integerLinkedList.iterator();
        long itrStartTime = System.currentTimeMillis()/1000;
        while (itr.hasNext()){
            itr.next();
        }
        long itrEndTime = System.currentTimeMillis()/1000;
        System.out.println("Processing time with iterator: " + (itrEndTime - itrStartTime) + " seconds");

        // count time of traversing list using get
        long loopStartTime = System.currentTimeMillis()/1000;
        for (int i = 0; i < integerLinkedList.size(); i++) {
            integerLinkedList.get(i);
        }
        long loopEndTime = System.currentTimeMillis()/1000;
        System.out.println("Processing time with loop and 'get' method: " + (loopEndTime - loopStartTime) + " seconds");

    }
}
