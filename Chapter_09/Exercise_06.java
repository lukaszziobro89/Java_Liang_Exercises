package Chapter_09;
/*
(Stopwatch) Design a class named StopWatch. The class contains:
    ■ Private data fields startTime and endTime with getter methods.
    ■ A no-arg constructor that initializes startTime with the current time.
    ■ A method named start() that resets the startTime to the current time.
    ■ A method named stop() that sets the endTime to the current time.
    ■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */
import Chapter_09.Chapter_Classes.StopWatch;
public class Exercise_06 {
    public static void main(String[] args) {

        // declare 100,000 array of integer numbers
        int[] numbers = new int[300000];

        // initialize stop watch object
        StopWatch watch = new StopWatch();
        System.out.println("--------------------------------------------------------------");

        /** Count time of filling array with numbers */
        System.out.println("Generating random numbers...");
        watch.start();                          // start counting time of filling array with numbers

            // fill array with numbers
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int)(Math.random() * 1000000);
            }

        watch.stop();                           // end counting time of filling array with numbers
        long fillingTime = watch.getElapsedTime();
        System.out.println("Completed.");
        System.out.println("--------------------------------------------------------------");

        /** Count time of sorting array */
        System.out.println("Sorting elements...");
        watch.start();

            // sort array
            selectionSort(numbers);

        watch.stop();
        long sortingTime = watch.getElapsedTime() / 1000;
        System.out.println("Completed.");
        System.out.println("--------------------------------------------------------------");

        // display results
        System.out.println("Filling array with numbers time: " + fillingTime + " miliseconds.");
        System.out.println("Sorting array time: " + sortingTime + " seconds.");
        System.out.println("--------------------------------------------------------------");

    }

    /** Sort array of integer numbers */
    public static int[] selectionSort(int[] list){
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
