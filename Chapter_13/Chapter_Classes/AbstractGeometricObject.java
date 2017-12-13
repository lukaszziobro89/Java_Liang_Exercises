package Chapter_13.Chapter_Classes;
import java.util.Date;
public abstract class AbstractGeometricObject {
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
