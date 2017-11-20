/*
(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have the same length and all angles have
the same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:
    ■ A private int data field named n that defines the number of sides in the polygon with default value 3.
    ■ A private double data field named side that stores the length of the side with default value 1
    ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
    ■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
    ■ A no-arg constructor that creates a regular polygon with default values.
    ■ A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
    ■ A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
    ■ The accessor and mutator methods for all data fields.
    ■ The method getPerimeter() that returns the perimeter of the polygon.
    ■ The method getArea() that returns the area of the polygon.
    The formula for computing the area of a regular polygon is Area = (n * s2) / (4 * tan(pi / n))
Write a test program that creates three RegularPolygon objects,  created using the no-arg constructor,
using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).  For each object, display its perimeter and area.
 */
package Chapter_09;

import Chapter_09.Chapter_Classes.RegularPolygon;

public class Exercise_09 {
    public static void main(String[] args) {

        // create three instances of object RegularPolygon
        RegularPolygon regPol1 = new RegularPolygon();
        RegularPolygon regPol2 = new RegularPolygon(6, 4);
        RegularPolygon regPol3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // display perimeter and area for both
        System.out.println("Regular polygon 1 | Area: " + regPol1.getArea() + " - Perimeter: " + regPol1.getPerimeter());
        System.out.println("Regular polygon 2 | Area: " + regPol2.getArea() + " - Perimeter: " + regPol2.getPerimeter());
        System.out.println("Regular polygon 3 | Area: " + regPol3.getArea() + " - Perimeter: " + regPol3.getPerimeter());
    }
}
