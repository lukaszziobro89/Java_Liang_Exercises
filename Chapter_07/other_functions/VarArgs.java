package Chapter_07.other_functions;

public class VarArgs {
    public static void main(String[] args) {
        printMax(2,3,4,1,5,3,15,1,3);
        printMax(new double[]{2.1, 2.2, 5.1, 3.1});
    }

    private static void printMax(double... numbers) {
        if (numbers.length == 0){
            System.out.println("No arguments provided.");
            return; // exit by return if no numbers provided
        }

        double resultMax =  numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > resultMax){
                resultMax  = numbers[i];
            }
        }
        System.out.println("Max is: " + resultMax);
    }
}
