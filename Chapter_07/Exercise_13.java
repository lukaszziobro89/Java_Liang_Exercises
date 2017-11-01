package Chapter_07;
/*
(Random number chooser) Write a method that returns a random number between 1 and 10, excluding the numbers passed
in the argument. The method header is specified as follows:

public static int getRandom(int... numbers)
 */
public class Exercise_13 {
    public static void main(String[] args) {
        getRandom(1, 2, 3, 4, 5);
        getRandom(2, 3, 4, 7, 8);

    }

    /** Generate random integer and print it if not excluded in method arguments */
    public static int getRandom(int... numbers){
        int randomNum = 1 + (int)(Math.random() * 10);
        System.out.println("Random number generated: " + randomNum);
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != randomNum){
                System.out.println(numbers[i]);
            } else {
                System.out.println("-");
            }
        }
        return randomNum;
    }
}
