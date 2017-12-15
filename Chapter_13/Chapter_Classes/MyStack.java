package Chapter_13.Chapter_Classes;
import java.util.ArrayList;
public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    /** Overrided clone() method allows to clone object */
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            MyStack myStackClone = (MyStack)super.clone();
            myStackClone.list = (ArrayList<Object>)(list.clone());
            return myStackClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + list.toString();
    }
}
