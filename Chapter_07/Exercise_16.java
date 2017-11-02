package Chapter_07;
/*
(Execution time) Write a program that randomly generates an array of 100,000 integers and a key.
Estimate the execution time of invoking the linearSearch method in Listing 7.6. Sort the array and
estimate the execution time of invoking the binarySearch method in Listing 7.7. You can use the following code
template to obtain the execution time:
long startTime = System.currentTimeMillis();
perform the task;
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
 */
public class Exercise_16 {
    static final int ELEMENTS = 100000;
    public static void main(String[] args) {

        // create array and fill in with integers
        int[] numbers = new int[100000];
        int key = (int)(Math.random() * ELEMENTS);
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = (int)(Math.random() * ELEMENTS);
        }

        // calculations for linear searching
        long startTime = System.currentTimeMillis();
        int linearIndex = linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Index using LINEAR searching = " + linearIndex + ". Processing time: " + executionTime);

        // calculations for binary search
        startTime = System.currentTimeMillis();
        System.out.println("Sorting array...");
        sortArray(numbers);
        int binaryIndex = binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Index using BINARY searching = " + binaryIndex + ". Processing time: " + executionTime);

    }

    /** Linear search - find index of key in inputArray */
    public static int linearSearch(int[] inputArray, int key){
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == key){
                return i;
            }
        } return -1;
    }

    /** Sort array - sorting array */
    public static void sortArray(int[] inputArray){
        // find minimum
        for (int i = 0; i < inputArray.length - 1; i++) {
            int currentMin = inputArray[i];
            int currentMinIndex = i;

            // iterate from current to the end and compare to each element to find minimum
            for (int j = i + 1; j < inputArray.length; j++) {
                if (currentMin > inputArray[j]) {
                    currentMin = inputArray[j];
                    currentMinIndex = j;
                }
            }

            // swap numbers if current minimum is
            if (currentMinIndex != i) {
                inputArray[currentMinIndex] = inputArray[i];
                inputArray[i] = currentMin;
            }
        }
    }

    /** Binary search of key element in list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            }
            else if (key == list[mid]){
                return mid;
            } else{
                low = mid + 1;
            }
        }
        return -low - 1;
    }

}
