package Chapter_19;
/*
(Maximum element in an array) Implement the following method that returns the maximum element in an array.
public static <E extends Comparable<E>> E max(E[] list)
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Integer[] list = new Integer[5];
        list[0]=1;
        list[1]=3;
        list[2]=21;
        list[3]=7;
        list[4]=12;

        System.out.println("Max element: " + max(list));
    }

    /** Returns max element from generic list */
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (E element: list){
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
}
