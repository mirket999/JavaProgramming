package day10_NestedIf;

import java.util.Scanner;

public class PracticeTask_CrewAndPassangers {
    public static void main(String[] args) {
/*
Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
        int crew, passengers;
        String message;
        System.out.println("Please enter the number of people on the ship:");

        int total = new Scanner(System.in).nextInt();

        if (total == 50 || total == 100 || total == 150) {

            if (total==50) { message = "20 crew, 30 passengers";
            }
            else if (total==100) { message = "25 crew, 50 passengers";

            }
            else { message = "30 crew, 70 passengers ";
            }

        }
        else{
            message = "Any other number of people on the ship is not valid ";
        }

        System.out.println(message);
    }

}
