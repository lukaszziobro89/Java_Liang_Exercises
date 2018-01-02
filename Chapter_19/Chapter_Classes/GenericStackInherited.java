package Chapter_19.Chapter_Classes;

import java.util.ArrayList;

public class GenericStackInherited<E> extends ArrayList<E> {

    public GenericStackInherited(){

    }

    public int getSize() {
        return size();
    }

    public E peek() {
        return get(getSize() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + toString();
    }


}
