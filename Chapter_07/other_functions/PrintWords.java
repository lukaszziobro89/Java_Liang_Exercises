package Chapter_07.other_functions;

public class PrintWords {
    public static void main(String[] args) {
        printWords("Lukasz","Ziobro");
        printWords("first", "second", "third", "fourth", "fifth");
    }

    // print all words provided as arguments
    private static void printWords(String... words) {
        if (words.length==0){
            System.out.println("No words provided.");
            return;
        }

        // print all words
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        // go to next line
        System.out.print("\n");
    }
}
