import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calculator integers = new Calculator();

        //Explains what this program does and asks for user input
        System.out.println("This program takes two integers and calculates the sum, difference, product and approximate quotient.");
        System.out.println("Please enter your first integer:");
        long integer1 = input.nextInt();
        System.out.println("Please enter your second integer:");
        long integer2 = input.nextInt();

        // Sets input1 and input2 in Calculator.java to the value of integer1 and integer 2
        integers.setInput(integer1, integer2);

        //Checks for false input
        System.out.println("Please enter one of four operators (+, -, *, /).");
        char operator = input.next().charAt(0);
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("You did not enter an operator, try again.");
                operator = input.next().charAt(0);
            }
        }

        // Checks for correct input and executes correct line of code
        if (operator == '+') {
            System.out.printf("The sum of your two integers (%d & %d) integers is: %d\n", integer1, integer2, integers.addition());
        }
        else if (operator == '-') {
            System.out.printf("The difference of your two integers (%d & %d) is: %d\n", integer1, integer2, integers.subtraction());
        }
        else if (operator == '*') {
            System.out.printf("The product of your two integers (%d & %d) is: %d\n", integer1, integer2, integers.multiplication());
        }
        else {
            System.out.printf("The approximate quotient of your two integers (%d & %d) to four decimal places is: %.3f\n", integer1, integer2, integers.division());
        }
    }
}

