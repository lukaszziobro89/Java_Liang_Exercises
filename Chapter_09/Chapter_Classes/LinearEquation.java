package Chapter_09.Chapter_Classes;

public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    /** Method that returns true if ad - bc is not 0. */
    public boolean isSolvable(){
        if ((a*d - b*c) !=0 ){
            return true;
        } else {
            return false;
        }
    }

    /** Methods return first the solution for the equation */
    public double getX(){
        return (e*d - b*f) / (a*d - b*c);
    }

    /** Methods return second the solution for the equation */
    public double gety(){
        return (a*f - e*c) / (a*d - b*c);
    }

    /** Method return results */
    public String returnResults(){
        if (isSolvable()){
            return "Solutions: " + getX() + " and " + gety();
        } else {
            return "The equation has no solution.";
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
}
