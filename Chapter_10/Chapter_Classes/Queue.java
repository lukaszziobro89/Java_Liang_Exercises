package Chapter_10.Chapter_Classes;

public class Queue {
    private int[] elements; // An int[] data field named elements that stores the int values in the queue.
    private int size;       // A data field named size that stores the number of elements in the queue.

    // A constructor that creates a Queue object with default capacity 8.
    public Queue(){
        this.elements = new int[8];
    }

    // A constructor that create a Queue with provided capacity
    public Queue(int capacity){
        elements = new int[capacity];
    }

    /** Method adds v into the queue. */
    public void enqueue(int v){
        if(size >= elements.length){
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    /** Method that removes and returns the element from the queue. */
    public int dequeue(){
        int popElement = elements[0]; // remove first element
        size--;                       // decrease size of queue
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return popElement;
    }

    /** Method that returns true if the queue is empty. */
    public boolean empty(){
        return size == 0;
    }

    /** Method that returns the size of the queue. */
    public int getSize() {
        return size;
    }
}
