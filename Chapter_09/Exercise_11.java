/* (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
cx + dy = f
x = (ed - bf) / (ad - bc)
y = (af - ec) / (ad - bc)
The class contains:
    ■ Private data fields a, b, c, d, e, and f.
    ■ A constructor with the arguments for a, b, c, d, e, and f.
    ■ Six getter methods for a, b, c, d, e, and f.
    ■ A method named isSolvable() that returns true if ad - bc is not 0.
    ■ Methods getX() and getY() that return the solution for the equation.
Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.”  */
package Chapter_09;

import Chapter_09.Chapter_Classes.LinearEquation;

public class Exercise_11 {
    public static void main(String[] args) {

        // create object of LinearEquation class
        LinearEquation equation = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation equation1 = new LinearEquation(1, 4, 1, 4, 4, 5);

        //display results
        System.out.println("Equation 1: ");
        System.out.println(equation.returnResults());
        System.out.println("Equation 2: ");
        System.out.println(equation1.returnResults());


    }
}
