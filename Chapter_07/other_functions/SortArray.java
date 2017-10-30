package Chapter_07.other_functions;

public class SortArray {
    public static double[] selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
            //find the minimum
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j= i + 1; j <= list.length-1; j++){
                if (currentMin > list[j]){
                    currentMin = list[j]; // change current min value
                    currentMinIndex = j;  // change index of current min value
                }
            }

            // swap numbers if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}
