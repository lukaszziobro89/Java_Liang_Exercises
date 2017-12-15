package Chapter_13;

import Chapter_13.Chapter_Classes.ComparableRectangle;

/*
(Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject and implement the Comparable interface.
Override the equals method in the Object class. Two Rectangle objects are equal if their areas are the same.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        ComparableRectangle rec1 = new ComparableRectangle(5,5);
        ComparableRectangle rec2 = new ComparableRectangle(5,6);
        ComparableRectangle rec3 = new ComparableRectangle(5,5);
        System.out.println("rec1 = rec2: " + rec1.equals(rec2));
        System.out.println("rec1 = rec3: " + rec1.equals(rec3));

    }
}
