package day17_While_DoWhile;

import java.util.Scanner;

public class PracticeTask_InsuranceQuote {
    /*
    Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();

        input.nextLine();
        System.out.println("Enter your gender: Male/Female/Not Listed");
        String gender = input.nextLine();

        // boolean isRightGender = gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")
        //        || gender.equalsIgnoreCase("Not listed");
        int price = 0;
        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")
                || gender.equalsIgnoreCase("Not listed"))) {
            System.out.println("Invalid gender format. Re-enter your gender:");
            gender = input.nextLine();
        }
        System.out.println("Are you married? yes/no");
        String married = input.next();

        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input. Are you married? yes/no");
            married = input.next();
        }

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while (age < 0 || age > 120) {
            System.out.println("Invalid input. Enter your age again:");
            age = input.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int mile = input.nextInt();

        while (mile < 5) {
            System.out.println("You can not enter less than 5 miles. How many miles do you drive in a day?");
            mile = input.nextInt();
        }
        input.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String insuranceCoverage = input.nextLine();

        System.out.println("Did you have any accidents or claims in past 5 years (Yes/No");
        String accident = input.next();

        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))) {
            System.out.println("Invalid input. Did you have any accidents or claims in past 5 years (Yes/No");
            accident = input.next();
        }

        System.out.println("Does your car have an anti-theft device (Yes/No)");
        String hasTheftDevice = input.next();

        while (!(hasTheftDevice.equalsIgnoreCase("yes") || hasTheftDevice.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry. Does your car have an anti-theft device (Yes/No)");
            hasTheftDevice = input.next();
        }

        if (insuranceCoverage.equalsIgnoreCase("liability")) {
            if (age < 25) {
                price = 90;
            }
            if (age >= 25) {
                price = 50;
            }
            if (mile <= 10) {
                price += 10;
            }
            if (mile > 10 && mile <= 50) {
                price += 30;
            }
            if (mile > 50) {
                price += 50;
            }

        }
        if (insuranceCoverage.equalsIgnoreCase("full coverage")) {
            if (age < 25) {
                price = 160;
            }
            if (age >= 25) {
                price = 120;
            }
            if (mile <= 10) {
                price += 20;
            }
            if (mile > 10 && mile <= 50) {
                price += 40;
            }
            if (mile > 50) {
                price += 70;
            }
        }

        if (hasTheftDevice.equalsIgnoreCase("yes")) {
            price -= price * 0.05;
        }
        if (accident.equalsIgnoreCase("yes")) {
            price += price * 0.15;
        }

        if (accident.equalsIgnoreCase("no")) {
            price -= price * 0.1;
        }
        if (married.equalsIgnoreCase("yes")) {
            price -= price * 0.05;
        }

        System.out.println("Mr/Mrs. " + name + ", Total price is : $" + price);
    }

}

