package Chapter_09.Chapter_Classes;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** Method returns the discriminant */
    public double getDiscriminant(){
        return (Math.pow(b, 2) - 4 * a * c);
    }

    /** Method returns root1 */
    public double getRoot1(){
        if (getDiscriminant() < 0){
            return 0;
        } else{
            return (-b - Math.sqrt(getDiscriminant())) / (2.0 * a);
        }
    }

    /** Method returns root2 */
    public double getRoot2(){
        if (getDiscriminant() < 0){
            return 0;
        } else{
            return (-b + Math.sqrt(getDiscriminant())) / (2.0 * a);
        }
    }

    /** Method returns root0 */
    public double getRoot0(){
        if (getDiscriminant() == 0){
            return (-b  / (2.0 * a));
        } else {
            return 0;
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
}
