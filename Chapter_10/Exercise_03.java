package Chapter_10;
import Chapter_10.Chapter_Classes.MyInteger;
/*
(The MyInteger class) Design a class named MyInteger. The class contains:
    ■ An int data field named value that stores the int value represented by this object.
    ■ A constructor that creates a MyInteger object for the specified int value.
    ■ A getter method that returns the int value.
    ■ The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.
    ■ The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
    ■ The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true
    if the specified value is even, odd, or prime, respectively.
    ■ The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.
    ■ A static method parseInt(char[]) that converts an array of numeric characters to an int value.
    ■ A static method parseInt(String) that converts a string into an int value.
Write a client program that tests all methods in the class.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        // create instance of MyInteger class
        MyInteger myNum = new MyInteger(4);
        MyInteger myNum2 = new MyInteger(7);

        // invoke from instance of class
        System.out.println(myNum.getValue());
        System.out.println(myNum.isEven());
        System.out.println(myNum.isOdd());
        System.out.println(myNum.isPrime());

        System.out.println(myNum2.getValue());
        System.out.println(myNum2.isEven());
        System.out.println(myNum2.isOdd());
        System.out.println(myNum2.isPrime());

        // static methods, invoking from class - not need to create instance of object
        System.out.println("Invoke from class: " + MyInteger.isEven(3));
        System.out.println("Invoke from class: " + MyInteger.isOdd(3));
        System.out.println("Invoke from class: " + MyInteger.isPrime(7));
        System.out.println("Invoke from class: "+ MyInteger.parseInt("234"));

    }
}
