package Chapter_05;
/*
(Find numbers divisible by 5 or 6, but not both) Write a program that displays all the numbers from 100 to 200,
ten per line, that are divisible by 5 or 6, but not both. Numbers are separated by exactly one space.
 */
public class Exercise_11 {
    public static void main(String[] args) {

        // variables
        int counter = 0;


        for (int i=100; i <= 200; i++){
            if (i % 5 == 0 ^ i % 6 ==0){    // xor (^) operator means "this or that, but not both"
                System.out.print(i + " ");
                counter++;
                if (counter == 10){
                    System.out.print("\n");
                    counter = 0;
                }
            }
        }
    }
}
