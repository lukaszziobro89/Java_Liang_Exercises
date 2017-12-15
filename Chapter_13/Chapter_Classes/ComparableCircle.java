package Chapter_13.Chapter_Classes;
import Chapter_10.Chapter_Classes.Circle2D;
public class ComparableCircle extends Circle2D implements Comparable<ComparableCircle> {
    // default no-arg constructor invoked from superclass
    public ComparableCircle(){
    }

    // args constructor invoked from superclass
    public ComparableCircle(double x, double y, double radius){
        super(x, y, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea()){
            return 1;
        } else if(getArea() < o.getArea()){
            return -1;
        } else {
            return 0;
        }
    }

    /** Overrided method allows to check if two objects
     * of ComparableCircle class are equals */
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof ComparableCircle && this.getRadius() == ((ComparableCircle) obj).getRadius());
    }

    /** Returns max from 2 objects using compareTo method (Comparable interface) */
    public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2){
        if (c1.compareTo(c2) >= 0){
            return c1;
        } else{
            return c2;
        }
    }
}
