package Chapter_19.Chapter_Classes;

import java.util.Arrays;

public class GenericStack<E> {
    private int capacity = 5;
    private int size;
    private E[] array = (E[])new Object[capacity];

    public GenericStack(){

    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size ==0){
            return null;
        } else {
            return array[size-1];
        }
    }

    public void push(E o) {
        array[size++] = o;
        if (size == capacity) {
            E[] tmp = (E[])new Object[capacity *= 2];
            System.arraycopy(array, 0, tmp, 0, array.length);
            array = tmp;
        }
    }

    public E pop() {
        if(size == 0){
            return null;
        } else {
            return array[--size];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "stack: " + Arrays.toString(array);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}