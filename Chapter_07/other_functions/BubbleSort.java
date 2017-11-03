package Chapter_07.other_functions;
import Chapter_07.Exercise_01;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = new int[100000];

        // generate random numbers from 1-10000 range
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10000);
        }

        System.out.println("Sorting using bubble sort...");
        long startTime = System.currentTimeMillis();    // start time counter
        bubbleSort(numbers);                // sort using bubble sort
        long endTime = System.currentTimeMillis();      // end time counter
        double executionTime = (endTime/1000.0) - (startTime/1000.0); // calculate execution time
        System.out.println("Sorting completed");
        System.out.printf("Time: %2.2f seconds\n", executionTime);
        Exercise_01.printArray(numbers);                // print sorted array

    }

    /** Sort input array using bubble sort */
    public static void bubbleSort(int [] inputArray){
        int n = inputArray.length;
        int temp;
        // do sorting until loop moves to beginning
        do {
            //
            for (int i = 0; i < inputArray.length - 1; i++) {
                // swap if n'th element is larger then (n'th + 1) element
                if (inputArray[i] > inputArray[i + 1]){
                    temp = inputArray[i+1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
            n = n - 1;   // largest element is at the end so no need to check it again
        } while (n > 1);
    }
}
