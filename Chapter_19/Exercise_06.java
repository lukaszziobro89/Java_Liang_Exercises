package Chapter_19;
/*
(Maximum element in a two-dimensional array) Write a generic method that returns the maximum element in a two-dimensional array.
public static <E extends Comparable<E>> E max(E[][] list)
 */
public class Exercise_06 {
    public static void main(String[] args) {
        Integer[][] list = new Integer[4][4];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = (int) (Math.random() * 100);
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");
        System.out.println("Max: " + max(list));

    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(max) > 0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
