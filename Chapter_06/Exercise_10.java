package Chapter_06;
/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for
testing whether a number is prime. Use this method to find the number of prime numbers less than 10000.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        System.out.print("Number of prime numbers: " + countPrimeNumbers(10000));

    }

    /** Return number of prime numbers between 1 and */
    public static int countPrimeNumbers(int number) {
        int counter = 0;
        for(int i=2; i <= number; i++){
            if (isPrime(i)){
                counter++;
            }
        } return counter;
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
 }
