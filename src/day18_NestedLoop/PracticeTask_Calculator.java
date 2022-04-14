package day18_NestedLoop;

import java.util.Scanner;

public class PracticeTask_Calculator {
    /*
    Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result = 0;
        while (true) {
            System.out.println("enter the first number");
            int number1 = input.nextInt();

            System.out.println("enter a math operator");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("enter a VALID math operator");
                operator = input.next().charAt(0);
            }

            System.out.println("enter the second number");
            double number2 = input.nextDouble();

            if (operator == '+') {
                result = number1 + number2;
            }
            if (operator == '-') {
                result = number1 - number2;
            }
            if (operator == '*') {
                result = number1 * number2;
            }
            if (operator == '/') {
                result = number1 / number2;
            }

            System.out.println("result = " + result);

            System.out.println("Do you want to continue?");
            String wantsContinue = input.next().toLowerCase();

            while (!(wantsContinue.equals("yes") || wantsContinue.equals("no"))) {
                System.out.println("Do you want to continue? Enter only yes/no");
                wantsContinue = input.next().toLowerCase();
            }

            if (wantsContinue.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }


        }


    }
}
