package Chapter_03;
import java.util.Scanner;
/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper,
a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
whether the user or the computer wins, loses, or draws.
 */
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for user choice
        System.out.println("Scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();

        // generate computer choice
        int compChoice = (int)(Math.random() * 3);

        System.out.println("User: " + userChoice + " | Computer: " + compChoice);

        switch (userChoice){
            case 0:
                if (compChoice == 1){ System.out.println("You lost!"); break; }
                else if (compChoice == 2){System.out.println("You won!"); break;}
                else {System.out.println("It's a draw!"); break;}
            case 1:
                if (compChoice == 0){System.out.println("You won!"); break;}
                else if (compChoice == 2){System.out.println("You lost!"); break;}
                else {System.out.println("It's a draw!"); break;}
            case 2:
                if (compChoice == 0){System.out.println("You lost!"); break;}
                else if (compChoice == 1){System.out.println("You won!"); break;}
                else {System.out.println("It's a draw!"); break;}
        }
    }
}
