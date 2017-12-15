package Chapter_13;

import Chapter_13.Chapter_Classes.MyStack;

/*
(Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        // create object of MyStack
        MyStack stack = new MyStack();
        try {
            // create clone of stack instance
            MyStack cloneStack = (MyStack)stack.clone();
            System.out.println("Size of cloned stack: " + cloneStack.getSize());
            // push to stack
            stack.push(25);
            System.out.println("Size of original stack: " + stack.getSize());
            System.out.println("Size of cloned stack: " + cloneStack.getSize());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
