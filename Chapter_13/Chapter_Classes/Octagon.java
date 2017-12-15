package Chapter_13.Chapter_Classes;

public class Octagon extends AbstractGeometricObject implements Cloneable {
    private double side;

    public Octagon(){
        this(5);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4/(Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return (8 * side);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Octagon && this.getArea() == ((Octagon)obj).getArea());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            Octagon octagonClone = (Octagon)super.clone();
            return octagonClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
