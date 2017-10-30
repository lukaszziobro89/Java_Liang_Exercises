package Chapter_05;
/*
(Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:

Kilograms  Pounds   |   Pounds      Kilograms
1             2.2   |   20               9.09
3             6.6   |   25              11.36
...
197         433.4   |   510            231.82
199         437.8   |   515            234.09
 */
public class Exercise_05 {
    public static void main(String[] args) {
        System.out.printf("%-9s %-9s %1s %9s %15s","Kilograms", "Pounds", "|", "Pounds", "Kilometers\n");

        int j=20;
        for (int i=1; i <= 5; i += 2){
            System.out.printf("%-10d %5.1f %4s %5d %18.2f\n", i, (i * 2.2), "|" , j, (j * 1.609));
            j += 5;
        }
    }
}
