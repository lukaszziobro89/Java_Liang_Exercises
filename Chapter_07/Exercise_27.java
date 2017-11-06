package Chapter_07;

import java.util.Scanner;

/*
(Identical arrays) The arrays list1 and list2 are identical if they have the same contents. Write a method that returns
true if list1 and list2 are identical, using the following header:

public static boolean equals(int[] list1, int[] list2)

Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical.
Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list. This number
is not part of the list.
 */
public class Exercise_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input for list 1
        System.out.println("Enter first list (first input is number of elements): ");
        int length1 = input.nextInt();
        int list1[] = new int[length1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        // input for list 2
        System.out.println("Enter first list (first input is number of elements): ");
        int length2 = input.nextInt();
        int list2[] = new int[length2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        // check if lists are equal
        boolean listsEqual;
        String result;
        if (listsIdentical(list1, list2)) {
            listsEqual = true;
            result = " are identical.";
        } else {
            listsEqual = false;
            result = " are not identical.";
        }

        // display results
        System.out.println("Lists" + result);

    }

    /** Returns true if list1 is equal to list2 and false if not */
    public static boolean listsIdentical(int[] list1, int[] list2){
        sortAscending(list1);
        sortAscending(list2);
        // if length of lists are different then return false
        boolean areEqual=false;
        if (list1.length != list2.length){
            return false;
        }
        //
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]){
                areEqual = false;
            } else {
                areEqual = true;
            }
        }
        return areEqual;
    }

    /** Sorts array in ascending order */
    public static int[] sortAscending(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            //find the minimum
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j= i + 1; j <= list.length-1; j++){
                if (currentMin > list[j]){
                    currentMin = list[j]; // change current min value
                    currentMinIndex = j;  // change index of current min value
                }
            }

            // swap numbers if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }

}
