package Chapter_13;
import Chapter_13.Chapter_Classes.ExtendedTriangle;

/*
(ExtendedTriangle class) Design a new ExtendedTriangle class that extends the abstract GeometricObject class.  Write a test program that prompts the
user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled.
The program should create a ExtendedTriangle object with these sides and set the color and filled properties using the input.
The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        double s1 = 5;
        double s2 = 6;
        double s3 = 5;
        String color = "blue";
        ExtendedTriangle extendedTriangle = new ExtendedTriangle(s1,s2,s3);
        extendedTriangle.setColor(color);
        extendedTriangle.setFilled(true);
        // invoke methods
        System.out.println("ExtendedTriangle is valid? " + extendedTriangle.isValid());
        System.out.println("Area: " + extendedTriangle.getArea());
        System.out.println("Perimeter: " + extendedTriangle.getPerimeter());
        System.out.println("Color: " + extendedTriangle.getColor());
        System.out.println("Is filled? " + extendedTriangle.isFilled());

    }
}
