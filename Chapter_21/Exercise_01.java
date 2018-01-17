package Chapter_21;
import java.util.Arrays;
import java.util.LinkedHashSet;
/*
( Perform set operations on hash sets) Create two linked hash sets
{"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
{"George", "Katie", "Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection.
(You can clone the sets to preserve the original sets from being changed by these set methods.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        // create sets
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        // union
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> clonedUnionSet = (LinkedHashSet<String>)set1.clone();
        clonedUnionSet.addAll(set2);
        System.out.println("Union: " + clonedUnionSet);

        // difference
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> difference = (LinkedHashSet<String>)set1.clone();
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> set2Cloned = (LinkedHashSet<String>)set2.clone();
        difference.removeAll(set2); // elements which are in set1 and not in set2
        set2Cloned.removeAll(set1); // elements which are in set2 and not in set1
        difference.addAll(set2Cloned);
        System.out.println("Difference: " + difference);

        // intersection
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> intersection = (LinkedHashSet<String>)set1.clone();
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

    }
}
