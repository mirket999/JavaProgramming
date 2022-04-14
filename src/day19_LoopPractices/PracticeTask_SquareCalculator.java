package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask_SquareCalculator {
    /*
      Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         while (true) {

        System.out.println("Enter the side of the square:");
        double sideOfSquare = input.nextDouble();

        if (!(sideOfSquare > 0)) {
            System.out.println("Invalid Entry for the side of the square");
            System.exit(0);
        }
        System.out.println("Area of square is: " + sideOfSquare * sideOfSquare);
        System.out.println("Perimeter of square is: " + sideOfSquare * 4);

        System.out.println("Would you like to calculate another Square? Yes/No");
        String wannaContinue = input.next();

             while (!(wannaContinue.equalsIgnoreCase("yes") || wannaContinue.equalsIgnoreCase("no"))) {
                 System.out.println("Invalid entry. Would you like to calculate another Square? Yes/No");
                 wannaContinue = input.next();

             }
        if (wannaContinue.equalsIgnoreCase("no")) {
            System.out.println("Thank you for using Cydeo Square Calculator APP");
            System.exit(0);
        }


    }




    }
}
