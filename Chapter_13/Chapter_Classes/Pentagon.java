package Chapter_13.Chapter_Classes;
public class Pentagon extends AbstractGeometricObject implements Colorable{
    private double x;
    private double y;
    private double side;

    public Pentagon(){
        this(0,0,1);
    }

    public Pentagon(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public Pentagon(String color, boolean filled, double x, double y, double side) {
        super(color, filled);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((5/4)*(side*side)*(Math.cos(36)/Math.sin(36)));
    }

    @Override
    public double getPerimeter() {
        return (5 * side);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void howToColor(){
        System.out.println("");
    }
}
