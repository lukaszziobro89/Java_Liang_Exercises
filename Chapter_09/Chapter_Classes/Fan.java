package Chapter_09.Chapter_Classes;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 1;
    private final int FAST = 1;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    // no-arg constructor
    public Fan(){
        speed = SLOW;
        radius = 5;
        color = "Blue";
    }

    /** A method named toString() that returns a string description for the fan. If the fan is on, the method returns the
    fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius
    along with the string “fan is off” in one combined string. */
    public String toString(){
        if (isOn()){
            return "Speed: " + getSpeed() + " | Color: " + getColor() + " | Radius: " + getRadius();
        } else {
            return "Color: " + getColor() + " | Radius: " + getRadius() + "| The fan is turned OFF.";
        }
    }

    // getters (accessors) and setters (mutators)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
