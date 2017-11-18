package Chapter_09;
/* (Use the Random class) Write a program that creates a Random object with seed 1000 and displays
the first 50 random  integers between 0 and 100 using the nextInt(100) method. */
import java.util.Random;
public class Exercise_04 {
    public static void main(String[] args) {

        Random randNum = new Random(1000);

        for (int i = 0; i < 5; i++) {
            System.out.println(randNum.nextInt(101));
        }

        randNum.setSeed(500); // change seed

        System.out.println("---");
        for (int i = 0; i < 5; i++) {
            System.out.println(randNum.nextInt(101));
        }
    }
}
