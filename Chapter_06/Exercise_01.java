package Chapter_06;
/*
(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal
numbers with 10 numbers on each line.
 */
public class Exercise_01 {
    // main method
    public static void main(String[] args) {

        int counter = 0;

        // print first 100 pentagonal numbers
        for (int i=1; i <= 100; i++){
            System.out.print(getPentagonalNumber(i) + " ");
            counter++;

            // go to next line if 8 in current one and reset counter
            if (counter == 8){
                System.out.print("\n");
                counter=0;
            }
        }
    }

    // method returns pentagonal number
    public static int getPentagonalNumber(int n){
        return n * (3 * n -1) / 2;
    }
}
