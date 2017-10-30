package Chapter_05;
/*
(Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
integer n such that n3 is less than 12,000.
 */
public class Exercise_13 {
    public static void main(String[] args) {

        // variables
        int n = 0;

        // calculate
        while (Math.pow(n, 3) <= 12000){
            n = n + 1;
        }

        // display results
        System.out.println(n - 1 + "^2 =  " + (int)Math.pow(n - 1, 3));
        System.out.println(n + "^2 =  " + (int)Math.pow(n , 3));
        System.out.println("Largest integer that n^3 is less than 12,000 is " + (n -1));


    }
}
