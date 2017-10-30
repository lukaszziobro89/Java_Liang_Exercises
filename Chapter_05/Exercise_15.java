package Chapter_05;
/*
(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space.
 */
public class Exercise_15 {
    public static void main(String[] args) {
        // <33 ; 126>

        int counter = 0;

        for (int i = 33; i<=126; i++){
            System.out.print((char)i + " ");
            counter++;
            if (counter == 10){
                System.out.print("\n");
                counter = 0;
            }
        }
    }
}
