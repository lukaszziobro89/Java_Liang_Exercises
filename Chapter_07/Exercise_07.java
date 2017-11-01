package Chapter_07;
/*
(Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the count for each number.
(Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
public class Exercise_07 {
    public static void main(String[] args) {
        int counts[] = new int[10];

        // generate random from 1-10 range and increase index
        System.out.print("Random numbers (1-10) range: ");
        for (int i=1; i <= 10; i++){
            int randomNum = (int)(Math.random() * 10);
            System.out.print(randomNum + " ");
            counts[randomNum]++;
        }

        // print number of occurrences
        System.out.println("\n");
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Number of " + i + " occurrences: " + counts[i]);
        }
    }
}
