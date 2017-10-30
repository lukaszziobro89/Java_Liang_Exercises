package Chapter_05;
/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Pattern A       Pattern B       Pattern C       Pattern D
1               1 2 3 4 5 6     1               1 2 3 4 5 6
1 2             1 2 3 4 5       2 1             1 2 3 4 5
1 2 3           1 2 3 4         3 2 1           1 2 3 4
1 2 3 4         1 2 3           4 3 2 1         1 2 3
1 2 3 4 5       1 2             5 4 3 2 1       1 2
1 2 3 4 5 6     1               6 5 4 3 2 1     1
 */
public class Exercise_18 {
    public static void main(String[] args) {

        // Pattern A
        for (int i=1; i<=6; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        System.out.println("--------------");

        // Pattern B
        for (int i=1; i<=6; i++){
            for (int j=1; j <= 7 - i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        System.out.println("--------------");

        // Pattern C
        for (int i=1; i<=6; i++){
            // print spaces first
            for (int j=1; j <= 6 - i; j++){
                System.out.print("  ");
            }
            for (int k=1; k <= i; k++){
                System.out.print(" " + k);
            }
            System.out.print("\n");
        }

        System.out.println("--------------");

        // Pattern D
        for (int i=1; i<=6; i++){
            // print spaces first
            for (int j=i; j > 1; j--){
                System.out.print("  ");
            }
            for (int k=1; k <= 7 - i; k++){
                System.out.print(" " + k);
            }
            System.out.print("\n");
        }
    }
}
