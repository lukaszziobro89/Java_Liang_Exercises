package Chapter_19;

import Chapter_19.Chapter_Classes.GenericStackInherited;

/*
(Implement GenericStack using inheritance) In Listing 19.1, GenericStack is implemented using composition.
Define a new stack class that extends ArrayList.
Write a test program that prompts the user to enter five strings and displays them in reverse order.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        GenericStackInherited<String> genericStackInherited = new GenericStackInherited<>();
        genericStackInherited.getSize();
        genericStackInherited.push("1st");
        genericStackInherited.push("2nd");
        genericStackInherited.push("3rd");
        System.out.println(genericStackInherited.getSize());

    }
}
