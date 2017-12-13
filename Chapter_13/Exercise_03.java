package Chapter_13;
import java.util.ArrayList;
/*
(Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
    public static void sort(ArrayList<Number> list)
 */
public class Exercise_03 {
    public static void main(String[] args) {
        // create array list with random numbers
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random() * 100));
            System.out.print(numbers.get(i) + " ");
        }
        // sort array
        sort(numbers);
        System.out.println();
        // print sorted
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i).intValue()+ " ");
        }
    }

    /** Sort array list */
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size(); i++) {
            //find the minimum
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j= i + 1; j <= list.size() - 1; j++){
                if (currentMin.doubleValue() > list.get(j).doubleValue()){
                    currentMin = list.get(j); // change current min value
                    currentMinIndex = j;  // change index of current min value
                }
            }

            // swap numbers if necessary
            if (currentMinIndex != i){
                list.set(currentMinIndex, list.get(i).doubleValue());
                list.set(i, currentMin);
            }
        }
    }
}
