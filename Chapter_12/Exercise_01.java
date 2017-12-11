package Chapter_12;
/*
(NumberFormatException) Listing 7.9, Calculator.java, is a simple commandline calculator.
Note that the program terminates if any operand is non-numeric. Write a program with an exception handler that deals with non-numeric operands;
then write another program without using an exception handler to achieve the same objective.
Your program should display a message that informs the user of the wrong operand type before exiting.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        int result = 0;

        try {
            // The result of the operation
            result = 0;

            // Determine the operator
            switch (args[1].charAt(0)) {
                case '+': result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                    break;
                case '-': result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                    break;
                case '.': result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;
                case '/': result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}




