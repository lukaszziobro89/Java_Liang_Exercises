package Chapter_19;
/*
(Generic linear search) Implement the following generic method for linear search.
public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Integer integerArrayList[] = new Integer[5];
        integerArrayList[0] = 1;
        integerArrayList[1] = 5;
        integerArrayList[2] = 9;

        System.out.println("Index of 5: " + linearSearch(integerArrayList,5));
        System.out.println("Index of 9: " + linearSearch(integerArrayList,9));

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0){
                return i;
            }
        }
        return -1;
    }
}
