/*The Rectangle class) Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle.
The class contains:
    ■ Two double data fields named width and height that specify the width and
    height of the rectangle. The default values are 1 for both width and height.
    ■ A no-arg constructor that creates a default rectangle.
    ■ A constructor that creates a rectangle with the specified width and height.
    ■ A method named getArea() that returns the area of this rectangle.
    ■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class. Write a test program that creates two Rectangle objects
one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area,
and perimeter of each rectangle in this order. */
package Chapter_09;
import Chapter_09.Chapter_Classes.Rectangle;
public class Exercise_01 {
    public static void main(String[] args) {

        // create rectangles
        Rectangle[] rectangles = new Rectangle[2];  // create array of Rectangle objects
        rectangles[0] = new Rectangle(4, 40);
        rectangles[1] = new Rectangle(3.5, 35.9);

        // iterate through array
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Width of rectangle " + i + ": " + rectangles[i].getWidth());
            System.out.println("Height of rectangle " + i + ": " + rectangles[i].getHeight());
            System.out.println("Area of rectangle " + i + ": " + rectangles[i].getArea());
            System.out.println("Perimeter of rectangle " + i + ": " + rectangles[i].getPerimeter());
        }
    }
}
