package Chapter_19;

/*
(Generic binary search) Implement the following method using binary search.
public static <E extends Comparable<E>> int binarySearch(E[] array, E key)
 */
public class Exercise_07 {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
        Integer[] array = new Integer[5];
        // unsorted ArrayList
        System.out.println("-----------------");
        array[0] = 17;
        array[1] = 5;
        array[2] = 1;
        array[3] = 12;
        array[4] = 22;

        sortArray(array);

        System.out.println("-----------------");
        System.out.println("Sorted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }

        System.out.println("Index for value 12: " + binarySearch(array, 12));
        System.out.println("Index for value 5: " + binarySearch(array, 5));
        System.out.println("Index for value 22: " + binarySearch(array, 22));

    }

    /** Generic binary search method */
    public static <E extends Comparable<E>> int binarySearch(E[] array, E key){
        int left = 0;
        int right = array.length - 1;
        int center = 0;

        while (left <= right){
            center = (left + right) / 2;
            if (array[center] == key){
                return center;
            } else if(array[center].compareTo(key) < 0){
                left = center + 1;
            } else {
                right = center - 1;
            }
        }
        return -1;
    }

    /** Generic sort array method */
    public static <E extends Comparable<E>> void sortArray(E[] array){
        // take into checking each element except last one
        for (int i = 0; i < array.length - 1; i++) {
            E currentMin = array[i];
            int minIndex = i;
            // compare current element with each till end of array
            for (int j = i + 1; j < array.length; j++) {
                // change currentMin and minIndex if required
                if (currentMin.compareTo(array[j]) > 0){
                    currentMin = array[j];
                    minIndex = j;
                }
            }
            // swap elements if required
            if (minIndex != i){
                array[minIndex] = array[i];
                array[i] = currentMin;
            }
        }

    }

}
