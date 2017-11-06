package Chapter_07;
import java.util.Scanner;
/*
(Strictly identical arrays) The arrays list1 and list2 are strictly identical if their corresponding elements are equal.
Write a method that returns true if list1 and list2 are strictly identical, using the following header:

public static boolean equals(int[] list1, int[] list2)

Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical.
Here are the sample runs. Note that the first number in the input indicates
 */
public class Exercise_26 {
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
        if (listsEqual(list1, list2)) {
            listsEqual = true;
            result = " are equal.";
        } else {
            listsEqual = false;
            result = " are not equal.";
        }

        // display results
        System.out.println("Lists" + result);

    }

    /** Returns true if list1 is equal to list2 and false if not */
    public static boolean listsEqual(int[] list1, int[] list2){
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
}
