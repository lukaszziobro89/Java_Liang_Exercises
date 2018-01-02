package Chapter_19;
import Chapter_19.Chapter_Classes.GenericStack;
/*
(Revising Listing 19.1) Revise the GenericStack class in Listing 19.1 to implement it using an array rather than an ArrayList.
You should check the array size before adding a new element to the stack. If the array is full, create a new array that
doubles the current array size and copy the elements from the current array to the new array.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        GenericStack<String> genericStack = new GenericStack<>();
        System.out.println("Size: " + genericStack.getSize());
        genericStack.push("First");
        genericStack.push("Second");
        genericStack.push("3rd");
        genericStack.push("4th");
        System.out.println("Capacity: " + genericStack.getCapacity());
        genericStack.push("5th");
        System.out.println("Capacity: " + genericStack.getCapacity());
        genericStack.push("6th");
        System.out.println("Capacity: " + genericStack.getCapacity());


    }
}
