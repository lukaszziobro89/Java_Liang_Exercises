package Chapter_05;
/*
(Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all the prime numbers
between 2 and 1,000, inclusive. Display eight prime numbers per line. Numbers are separated by exactly one space.
 */
public class Exercise_20 {
public static void main(String[] args) {

    int NUMBER_OF_PRIMES_PER_LINE = 0; // Display 10 per line
    int number = 2; // A number to be tested for primeness

    System.out.println("Primes between 2 and 1000 \n");

     // Repeatedly find prime numbers
     for (number = 2; number <= 1000; number++) {
     // Assume the number is prime
     boolean isPrime = true; // Is the current number prime?

         // Test whether number is prime
         for (int divisor = 2; divisor <= number / 2; divisor++) {
             if (number % divisor == 0) { // If true, number is not prime
                isPrime = false; // Set isPrime to false
                break; // Exit the for loop
             }
         }
             // print if prime
             if (isPrime){
                 System.out.print(number + " ");
                 NUMBER_OF_PRIMES_PER_LINE++;
                 // go to next line if 8 primes per line
                 if (NUMBER_OF_PRIMES_PER_LINE == 8){
                     System.out.print("\n");
                     NUMBER_OF_PRIMES_PER_LINE = 0;
                 }
             }
        }
    }
}

