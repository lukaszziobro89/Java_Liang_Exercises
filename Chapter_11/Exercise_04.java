package Chapter_11;
import java.util.ArrayList;
import java.util.Scanner;
/*
(Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers.
The method returns null if the list is null or the list size is 0.
    public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes this method to
return the largest number in the input.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int temp;

        // input elements
        System.out.println("Put numbers (number 0 ends input): ");
        do {
            temp = input.nextInt();
            list.add(temp);
        } while (temp != 0);

        System.out.println("Max element: " + max(list));


    }

    /** Method returns max element from list*/
    public static Integer max(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            return null;
        } else {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                 if (list.get(i) > max){
                     max = list.get(i);
                 }
            }
            return max;
        }
    }
}
