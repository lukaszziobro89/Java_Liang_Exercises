package Chapter_13;
import Chapter_13.Chapter_Classes.ComparableCircle;
/*
(The ComparableCircle class) Define a class named ComparableCircle that extends Circle and implements Comparable.
Implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        // create 2 instances of ComparableCircle object
        ComparableCircle c1 = new ComparableCircle(0,0,3);
        ComparableCircle c2 = new ComparableCircle(0,0,5);
        // compare which is greater
        System.out.println(c1.compareTo(c2));
    }
}
