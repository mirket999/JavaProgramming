package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_TipCalculator {
    /*
    Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Blue Fish Restaurant!");
        System.out.println("Split or No split (Yes or No)?");
        String isSplit = input.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        int checkAmount = input.nextInt();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next().toLowerCase();


        double totalPayment = 0;
        double totalTip = 0;


        if (serviceQuality.equals("excellent")) {
            totalTip = checkAmount*0.25;
            totalPayment = checkAmount + totalTip;
        } else if (serviceQuality.equals("great"))  {
            totalTip = checkAmount*0.2;
            totalPayment = checkAmount + totalTip;
        } else if (serviceQuality.equals("good"))  {
            totalTip = checkAmount*0.15;
            totalPayment = checkAmount + totalTip;
        } else if (serviceQuality.equals("fair"))  {
            totalTip = checkAmount*0.1;
            totalPayment = checkAmount + totalTip;
        } else {
            totalTip = checkAmount*0.05;
            totalPayment = checkAmount + totalTip;
        }
        double totalPerPerson = totalPayment/numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;


        System.out.println("Total to pay: " + totalPayment);
        System.out.println("Total tip: " + totalTip);

         if (isSplit.equals("yes")) {
             System.out.println("Number of people entered: " + numberOfPeople);
             System.out.println("Total per person: " + totalPerPerson);
             System.out.println("Tip per person: " + tipPerPerson);
         }

    }
}
