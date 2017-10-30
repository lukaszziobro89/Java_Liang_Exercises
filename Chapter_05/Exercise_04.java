package Chapter_05;
/*
(Conversion from miles to kilometers) Write a program that displays the follow-
ing table (note that 1 mile is 1.609 kilometers):
Miles       Kilometers
1                1.609
2                3.218
...
9               14.481
10              16.090
 */
public class Exercise_04 {
    public static void main(String[] args) {
        System.out.printf("%-10s %10s","Miles", "Kilometers\n");

        for (int i=1; i<=10; i++){
            System.out.printf("%-10d %10.3f\n", i, (i * 1.609));
        }
    }
}
