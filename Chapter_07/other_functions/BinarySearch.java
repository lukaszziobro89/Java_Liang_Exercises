package Chapter_07.other_functions;

public class BinarySearch {
    public static void main(String[] args) {

        double[] numbers = new double[]{3, 1, 2, 4, 6, 7};

        // print initial list
        System.out.println("Initial list: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // sort array and then do binary search
        System.out.println("\nIndex of searching element from sorted list : " +
                binarySearch(SortArray.selectionSort(numbers), 2));

        // print sorted array
        System.out.println("Sorted list: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static int binarySearch(double[] list, double key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            }
            else if (key == list[mid]){
                return mid;
            } else{
                low = mid + 1;
            }
        }
        return -low - 1;
    }


}
