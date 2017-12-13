package Chapter_13;
import Chapter_13.Chapter_Classes.AbstractGeometricObject;
import Chapter_13.Chapter_Classes.Colorable;
import Chapter_13.Chapter_Classes.Pentagon;
import Chapter_13.Chapter_Classes.Square;
/*
(The Colorable interface) Design an interface named Colorable with a void method named howToColor().
Every class of a colorable object must implement the Colorable interface. Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to display the message "Color all four sides."
Draw a UML diagram that involves Colorable, Square, and GeometricObject. Write a test program that creates an array of five GeometricObjects.
For each object in the array, display its area and invoke its howToColor method if it is colorable.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        // create instances of inherited objects using self class
        Square square = new Square("Blue",true,0,0,2);
        // create instance of object using abstract and superclass
        AbstractGeometricObject pentagon = new Pentagon("Black",false,0,0,5);

        /** Invoke methods from object itself */
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square is filled? " + square.isFilled());
        square.howToColor();

        // invoking pentagon methods
        System.out.println("Pentagon area: " + pentagon.getArea());
        System.out.println("Pentagon is filled: " + pentagon.isFilled());

        /**
         * Inovoke interface method so need to cast
         *
         * */
        ((Colorable)pentagon).howToColor();

    }
}
