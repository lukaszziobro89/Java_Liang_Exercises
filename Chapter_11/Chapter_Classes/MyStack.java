package Chapter_11.Chapter_Classes;
import java.util.ArrayList;
public class MyStack extends ArrayList<Object>{

    /** Returns last object without removing it */
    public Object peek(){
        return get(size() - 1);
    }

    /** Returns and removes the top element from the stack */
    public Object pop(){
        Object last = get(size() - 1);
        remove(size() - 1);
        return last;
    }

    /** Adds a new element to the top of MyStack */
    public void push(Object stackObject){
        add(stackObject);
    }
}
