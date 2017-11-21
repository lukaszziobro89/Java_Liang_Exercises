package Chapter_09;

import Chapter_09.Chapter_Classes.QuadraticEquation;

/* (Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equation ax2 + bx + x = 0. The class contains:
■ Private data fields a, b, and c that represent three coefficients.
■ A constructor for the arguments for a, b, and c.
■ Three getter methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots of the equation
r1 = (-b - sqrt(b^2 - 4ac)) / 2a and r2 = (-b + sqrt(b^2 - 4ac)) / 2a
These methods are useful only if the discriminant is nonnegative. Let these methods return 0 if the discriminant is negative.
Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
If the discriminant is positive, display the two roots. If the discriminant is 0, display the one root.
Otherwise, display “The equation has no roots.” */
public class Exercise_10 {
    public static void main(String[] args) {

        // create quadratic equation
        QuadraticEquation equation = new QuadraticEquation(-5, 2, 3);

        // display results
        if (equation.getDiscriminant() < 0){
            System.out.println("The equation has no roots.");
        } else if (equation.getDiscriminant() == 0){
            System.out.println("The equation has one root: " + equation.getRoot0());
        } else {
            System.out.println("The equation has two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
        }
    }
}
