package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_Travel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport (yes or no)?");
        String yesOrNo = input.next().toLowerCase();

        if (yesOrNo.equals("yes")) {     // if has passport
            int ticketCost = 1000;

            input.nextLine();
            System.out.println("Which country do you want to travel to?");
            String travelCountry = input.nextLine();

            System.out.println("How many bags will you take with ?");
            int bags = input.nextInt();
            ticketCost += bags * 50;

            System.out.println("How many people do you travel with?");
            short numberOfPeople = input.nextShort();
            if (numberOfPeople > 3) {
                ticketCost -= 300;
            } else {
                ticketCost -= numberOfPeople * 100;
            }
            input.nextLine();
            System.out.println("Enter the name of people who you wanna travel with:");
            String nameOfPeople = input.nextLine();

            System.out.println("Your ticket is booked to " + travelCountry +
                    ". We have charged extra for the " + bags +
                    " bags but you are traveling with " + nameOfPeople +
                    " so we are giving a discount. Your total cost is " + ticketCost);
        }
        else   // if has no valid passport;
        {
              int costWithoutPass = 200;
            System.out.println("When did your passport expire?");
            int expireDate = input.nextInt();
            int yearsSinceExpiraiton = 2022-expireDate;
            costWithoutPass += yearsSinceExpiraiton*75;

            input.nextLine();
            System.out.println("Which country will you travel?");
            String travelCountry = input.nextLine();

            System.out.println("Will you be travelling next year?");
            String ifTravelNextYear = input.next().toLowerCase();
            if (ifTravelNextYear.equals("yes")) {
                costWithoutPass += 100;
            }                          else {
                costWithoutPass -= 50;

            }
            System.out.println("Looks like your password has been expired for " + yearsSinceExpiraiton +
                    " years, but not to worry we will get it ready for you to travel to " + travelCountry +
                    ". Your total cost has come out to $" + costWithoutPass);


        }


    }

}
/*
3. Create a class called Travel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags, but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

 */
