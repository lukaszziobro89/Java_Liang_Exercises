package Chapter_05;
/*
(Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest
integer n such that n^2 is greater than 12,000.
 */
public class Exercise_12 {
    public static void main(String[] args) {

        // variables
        int n = 0;

        // calculate
        while (Math.pow(n, 2) <= 12000){
            n = n + 1;
        }

        // display results
        System.out.println(n - 1 + "^2 =  " + (int)Math.pow(n - 1, 2));
        System.out.println(n + "^2 =  " + (int)Math.pow(n , 2));
    }
}
