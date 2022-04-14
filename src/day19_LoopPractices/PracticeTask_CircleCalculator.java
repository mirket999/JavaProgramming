package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask_CircleCalculator {
    /*
    Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the radius of the circle:");
            double radius = input.nextDouble();

            if (!(radius > 0)) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("Diameter of circle is: " + radius * 2);
            System.out.println("Area of circle is: " + radius * radius * 3.14);
            System.out.println("Perimeter of circle is: " + radius * 2 * 3.14);

            System.out.println("Would you like to calculate another circle? Yes/No");
            String wannaContinue = input.next();

            while (!(wannaContinue.equalsIgnoreCase("yes") || wannaContinue.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry. Would you like to calculate another circle? Yes/No");
                wannaContinue = input.next();
            }
            
            if (wannaContinue.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }


        }
    }
}
