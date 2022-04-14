package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask_SalaryCalculator {
    /*
     Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("How much you make an hour?");
            double hourlyIncome = input.nextDouble();

            if (!(hourlyIncome > 0)) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double weeklyHours = input.nextDouble();

            if (!(weeklyHours >= 1 && weeklyHours <= 144)) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double stateTaxRate = input.nextDouble();

            if (!(stateTaxRate >= 0 && stateTaxRate <= 10)) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double grossSalary = hourlyIncome * weeklyHours * 4;
            double federalTax = grossSalary * 0.26;
            double stateTax = grossSalary * 0.04;
            double netIncome = grossSalary - (federalTax + stateTax);

            System.out.println("Gross Salary per month is: Kr" + grossSalary);
            System.out.println("Federal Tax is: Kr" + federalTax);
            System.out.println("State Tax is: Kr" + stateTax);
            System.out.println("Total tax is: " + (federalTax + stateTax));
            System.out.println("Net Income per month is: Kr" + netIncome);

            System.out.println("Would you like to continue? Yes/No");
            String wannaContinue = input.next();

            if (!(wannaContinue.equalsIgnoreCase("yes") || wannaContinue.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (wannaContinue.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }

    }
}
