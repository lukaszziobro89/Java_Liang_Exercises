package Chapter_12;

public class Exercise_10 {
    public static void main(String[] args) {
        // example of OutOfMemoryError exception
        try {
            int[] temp = new int[1000000000];
            for (int i = 0; i < 1000000000; i++) {
                temp = new int[temp.length * 1000000000];
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
