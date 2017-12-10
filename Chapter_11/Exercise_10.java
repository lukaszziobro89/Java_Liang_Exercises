package Chapter_11;
import Chapter_11.Chapter_Classes.MyStack;
/*
(Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition.
Define a new stack class that extends ArrayList. Write a test program that prompts the user to enter five strings
and displays them in reverse order.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        // create MyStack class instance
        MyStack myStack = new MyStack();
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");
        myStack.push("Fourth");
        myStack.push("Fifth");

        // pop last element until MyStack is empty
        while (myStack.size() > 0){
            System.out.println(myStack.pop());
        }

    }
}
