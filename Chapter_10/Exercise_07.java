package Chapter_10;
import Chapter_09.Chapter_Classes.Account;
import java.util.Scanner;
/*
(Game: ATM machine) Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine.
Create ten accounts in an array with id 0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an id.
If the id is entered incorrectly, ask the user to enter a correct id. Once an id is accepted, the main menu is displayed as
shown in the sample run. You can enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money,
and 4 for exiting the main menu. Once you exit, the system will prompt for an id again. Thus, once the system starts, it will not stop.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        int menuChoice = 0;
        int accountChoice = 0;
        double withdrawAmount;
        double depositAmount;

        // create array of accounts
        Account accounts[] = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 0.05);
        }

        // start ATM machine
        while (accountChoice == 0){
            System.out.println("---------------------");
            System.out.println("Enter an account id: ");
            System.out.println("---------------------");
            int accountID = choice.nextInt();
            menuChoice = 0;
                while (menuChoice != 5){
                    printMenu();
                    System.out.println("Enter a choice: ");
                    menuChoice = choice.nextInt();
                    switch (menuChoice){
                        case 1:
                            System.out.println("Account balance: " + accounts[accountID].getBalance());
                            break;
                        case 2:
                            System.out.println("Enter amount to withdraw: ");
                            withdrawAmount = choice.nextDouble();
                            accounts[accountID].withdraw(withdrawAmount);
                            System.out.println("Done!");
                            System.out.println("---------------------");
                            break;
                        case 3:
                            System.out.println("Enter amount to deposit: ");
                            depositAmount = choice.nextDouble();
                            accounts[accountID].deposit(depositAmount);
                            System.out.println("Done!");
                            System.out.println("---------------------");
                            break;
                        case 4:
                            System.out.println(accounts[accountID].printAccountInformation());
                            System.out.println("Done!");
                            System.out.println("---------------------");
                            break;
                        case 5:
                        System.out.println("---------------------");
                        break;
                    }
                }
        }
    }

    public static void printMenu(){
        System.out.println("Main menu:");
        System.out.println("\t1: Check balance");
        System.out.println("\t2: Withdraw");
        System.out.println("\t3: Deposit");
        System.out.println("\t4: Print account information");
        System.out.println("\t5: Exit");
    }
}
