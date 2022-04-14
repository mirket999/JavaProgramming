package day17_While_DoWhile;

import java.util.Scanner;

public class PracticeTask_Calculator {
    /*
    write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = input.nextInt();

        System.out.println("Enter a number again: ");
        int number2 = input.nextInt();

        System.out.println("Enter a operator: ");
        char operator = input.next().charAt(0);
        int result = 0;
        boolean isOperatorValid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
        while (!isOperatorValid) {
            System.out.println("Re-enter a valid operator.");
            operator = input.next().charAt(0);

            if (isOperatorValid) {
                break;

        }

        } if (operator == '+') {
            result = number1+number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1*number2;
        }  else {
            result = number1/number2;
        }

        System.out.println("result = " + result);




    }
}
