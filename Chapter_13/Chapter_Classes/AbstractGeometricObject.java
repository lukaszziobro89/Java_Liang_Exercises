package Chapter_13.Chapter_Classes;
import java.util.Date;
public abstract class AbstractGeometricObject implements Comparable<AbstractGeometricObject>{
    // attributes (fields)
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // no-arg constructor
    protected AbstractGeometricObject(){
        dateCreated = new java.util.Date();
    }

    // args constructor
    protected AbstractGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    @Override
    public int compareTo(AbstractGeometricObject o) {
        if (getArea() > o.getArea()){
            return 1;
        } else if(getArea() == o.getArea()){
            return 0;
        } else {
            return -1;
        }
    }

    /** Returns max from 2 objects using compareTo method (Comparable interface) */
    public static AbstractGeometricObject max(AbstractGeometricObject o1, AbstractGeometricObject o2){
        if (o1.compareTo(o2) >= 0){
            return o1;
        } else {
            return o2;
        }
    }

    /** Abstract get area method - different for each subclass */
    public abstract double getArea();

    /** Abstract get perimeter method - different for each subclass */
    public abstract double getPerimeter();

    /** Return a string representation of object */
    @Override
    public String toString(){
        return "Created on " + dateCreated + " | Color: " + color + " | Filled: " + filled;
    }

    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
