package Chapter_07.other_functions;

public class CountLettersInArray {
    public static void main(String[] args) {
        // declare and create an empty array of characters
        char [] chars = createArray();

        // display the array
        System.out.println("------------------------------------");
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        // count occurrences of each letter
        int [] counts = countLetters(chars);

        //display counts
        System.out.println("------------------------------------");
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }

    /** Create array of 100 elements class 'char' and fill it with
     * lowercase letters using RandomCharacter class */
    private static char[] createArray() {
        // declare and create array of 100 elements
        char chars[] = new char[100];

        // fill array with lower case letters
        for (int i = 0; i < chars.length; i++) {
            // randomly generates lowercase letter and put into array
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        // return array
        return chars;
    }

    /** Display array */
    private static void displayArray(char[] chars) {
        int counter = 0;
        // iterate through whole chars array
        for (int i = 0; i < chars.length; i++) {
            counter++;
            if (counter == 20){
                // go to next line and reset counter if 20 letters in row
                System.out.print(chars[i] + "\n");
                counter = 0;
            } else{
                // print in current line if counter < 20
                System.out.print(chars[i] + " ");
            }
        }
    }

    /** Count occurrences of each letter */
    private static int[] countLetters(char[] chars) {
        // create array of counters for each single letter
        int[] counts = new int[26];

        // For each letter in chars array count occurrences
        for (int i = 0; i < chars.length; i++) {
            // add +1 to each counter using unicode
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    /** Display counter for each letter */
    private static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            // print using unicode (revert codes to counting, plus instead of minus)
            System.out.println(counts[i] + " " + (char)(i + 'a'));
        }
    }
}
