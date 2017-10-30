package Chapter_01;

/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
        perimeter = 2 * radius * pi
        area = radius * radius * pi
 */

public class Exercise_08 {

    public static void main(String[] args) {
        double pi = 3.14159;
        double radius = 5.5;

        System.out.print("Perimeter: ");
        System.out.println(2 * radius * pi);
        System.out.print("Area: ");
        System.out.print(3.14159 * radius * radius);
    }
}
