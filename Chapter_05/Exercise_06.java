package Chapter_05;
/*
(Conversion from miles to kilometers) Write a program that displays the following two tables side by side:

Miles   Kilometers  |  Kilometers     Miles
1       1.609       |  20             12.430
2       3.218       |  25             15.538
...
9       14.481      |  60             37.290
10      16.090      |  65             40.398

 */
public class Exercise_06 {
    public static void main(String[] args) {
        System.out.printf("%-9s %-10s %1s %9s %9s","Miles", "Kilometers", "|", "Kilometers", "Miles\n");

        int j=20;
        for (int i=1; i <= 5; i++){
            System.out.printf("%-9d %1.3f %6s %1d %17.3f\n", i, (i * 1.609), "|" , j, (j * 0.62));
            j += 5;
        }
    }
}
