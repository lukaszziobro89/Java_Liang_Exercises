package Chapter_13;

import Chapter_13.Chapter_Classes.Octagon;

/*
(The Octagon class) Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable interfaces.
Assume that all eight sides of the octagon are of equal length. The area can be computed using the following formula:
    area = (2 + 4/sqrt(2))* side * side
Write a test program that creates an Octagon object with side value 5 and displays its area and perimeter.
Create a new object using the clone method and compare the two objects using the compareTo method.
 */
public class Exercise_11 {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        System.out.println("Area: " + octagon.getArea());
        System.out.println("Perimeter: " + octagon.getPerimeter());
        System.out.println(octagon.hashCode());
        try {
            Octagon octagonCloned = (Octagon)octagon.clone();
            System.out.println("Area: " + octagonCloned.getArea());
            System.out.println("Perimeter: " + octagonCloned.getPerimeter());
            System.out.println(octagonCloned.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
