import java.util.*;
public class Collections_GenericMethods {
    public static void main(String[] args) {

        Integer[] integers = new Integer[2];
        Double[] doubles = new Double[2];
        integers[0] = 100;
        integers[1] = 200;
        doubles[0] = 300.0;
        doubles[1] = 400.0;

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(120,"sda");
        hashMap.put(130,"sdb");
        hashMap.put(140,"sda");

        HashMap<Double, Boolean> hashMap1 = new HashMap<>();
        hashMap1.put(2.0, true);
        hashMap1.put(3.5, false);

        printGenericMap(hashMap);
        printGenericMap(hashMap1);

        // IMPLEMENTATIONS OF SET INTERFACE
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        printGenericSet(linkedHashSet);
        printGenericSet(hashSet);
        printGenericSet(treeSet);

        // IMPLEMENTATION OF LIST INTERFACE
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        printGenericList(arrayList);
        printGenericList(linkedList);

        // IMPLEMENTATION OF ARRAY
        printGenericArray(integers);
        printGenericArray(doubles);


    }

    /** Prints all set elements */
    private static <E> void printGenericSet(Set<E> generic){
        for (E setElement : generic){
            System.out.println(setElement);
        }
    }

    /** Print all array elements */
    private static <E> void printGenericArray(E[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /** Prints all map elements */
    private static <K, V> void printGenericMap(Map<K,V> genericMap){
        for(K element : genericMap.keySet()){
            String key = element.toString();
            String value = genericMap.get(element).toString();
            System.out.println("Key: " + key + " | Value: " + value);
        }
    }

    /** Prints all list elements */
    private static <E> void printGenericList(List<E> genericList){
        for (E listElement : genericList){
            System.out.println(listElement);
        }
    }


}
