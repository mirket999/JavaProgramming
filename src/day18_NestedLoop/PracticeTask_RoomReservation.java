package day18_NestedLoop;

import java.util.Scanner;

public class PracticeTask_RoomReservation {
    /*
    Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Which bedroom do you want to reserve?");
            String roomType = input.nextLine().toLowerCase();

            while (!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))) {
                System.err.println("Invalid option. Which bedroom do you want to reserve?\nEnter King Bed, Queen Bed or Single Bed");
                roomType = input.nextLine().toLowerCase();
            }
            System.out.println("How many nights do you want to stay?");
            int countOfNights = input.nextInt();

            while (!(countOfNights >= 1 && countOfNights <= 15)) {
                System.err.println("Invalid option. How many nights do you want to stay? You should select an option between 1~15");
                countOfNights = input.nextInt();
            }

            System.out.println("Would you like to reserve another room?");
            String wannaAnotherRoom = input.next().toLowerCase();

            while (!(wannaAnotherRoom.equals("yes") || wannaAnotherRoom.equals("no"))) {
                System.err.println("Invalid option. Would you like to reserve another room? Enter yes/no");
                wannaAnotherRoom = input.next().toLowerCase();
            }
            input.close();
            int nightlyPrice = (roomType.equals("king bed"))? 120 :(roomType.equals("queen bed"))? 100 : 80;

            if (wannaAnotherRoom.equals("no")) {
                System.out.println("Total price for " + roomType + " to stay " + countOfNights  + " nights is $" + nightlyPrice*countOfNights + ".");
                break;
            }


        }

    }
}
