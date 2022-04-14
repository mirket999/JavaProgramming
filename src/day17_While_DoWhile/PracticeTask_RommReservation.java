package day17_While_DoWhile;

import java.util.Scanner;

public class PracticeTask_RommReservation {
    /*
    Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");
        String wannaRoom = input.next();

        while (!(wannaRoom.equalsIgnoreCase("yes") || wannaRoom.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer. Do you want to reserve a room? yes/no");
            wannaRoom = input.next();
        }
        input.nextLine();
        if (wannaRoom.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do  you want?\nKing Bed?\nQueen Bed?\nSingle Bed?");
            String roomType = input.nextLine() ;
            while (!(roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed")
                    || roomType.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid Room Type.\nWhich type of room do you want?\nKing Bed?\nQueen Bed?\nSingle Bed?");
                roomType = input.next();
            }
            if (roomType.equalsIgnoreCase("King Bed")) {
                System.out.println("King Bed ==> 120$");
            }
            if (roomType.equalsIgnoreCase("Queen Bed")) {
                System.out.println("Queen Bed ==> 100$");
            }
            if (roomType.equalsIgnoreCase("Single Bed")) {
                System.out.println("Single Bed ==> 80$");
            }
        }

         if (wannaRoom.equalsIgnoreCase("no")) {
             System.out.println("Have a nice day!");
         }
    }
}
