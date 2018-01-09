package Chapter_20;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
(Store numbers in a linked list) Write a program that lets the user enter numbers and displays them.
Use a linked list to store the numbers. Do not store duplicate numbers.
Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and reverse the list.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        // read numbers
        System.out.println("Enter integer numbers, 0 ends input: ");
        int num;
        while ((num = input.nextInt()) != 0){
            if (!integerLinkedList.contains(num)) {
                integerLinkedList.add(num);
            }
        }

        // print sorted
        Collections.sort(integerLinkedList);
        System.out.println("Sorted:");
        printList(integerLinkedList);

        // print shuffle
        Collections.shuffle(integerLinkedList);
        System.out.println("Shuffled:");
        printList(integerLinkedList);

        // reversed
        System.out.println("Reversed:");
        Collections.reverse(integerLinkedList);
        printList(integerLinkedList);


    }

    public static void printList(LinkedList<Integer> linkedList){
        for (Integer number : linkedList) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
