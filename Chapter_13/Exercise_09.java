package Chapter_13;

import Chapter_13.Chapter_Classes.ComparableCircle;

/*
(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface.
Override the equals method in the Object class. Two Circle objects are equal if their radius are the same.
 */
public class Exercise_09 {
    public static void main(String[] args) {
        // create instances of comparable circle
        ComparableCircle c1 = new ComparableCircle(0,0,5);
        ComparableCircle c2 = new ComparableCircle(0,0,10);
        ComparableCircle c3 = new ComparableCircle(0,0,5);
        // check equality of objects
        System.out.println("c1 == c2: "+ c1.equals(c2));
        System.out.println("c1 == c3: "+ c1.equals(c3));
        System.out.println("c2 == c3: "+ c2.equals(c3));

    }
}
