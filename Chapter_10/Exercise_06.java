package Chapter_10;
import Chapter_10.Chapter_Classes.StackOfIntegers;
/*
(Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order.
Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */
public class Exercise_06 {
    public static void main(String[] args) {

        int limit = 120;
        // stack of prime numbers
        StackOfIntegers primeNumbers = new StackOfIntegers(20);

        // push all prime numbers < 120 into stack
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)){
                primeNumbers.push(i);
            }
        }

        // print all prime numbers
        while (!primeNumbers.empty()){
            System.out.println(primeNumbers.pop());
        }
    }

    /** Method returns true if value is prime number */
    public static boolean isPrime(int value){
        for (int i = 2; i < value; i++) {
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }
}
