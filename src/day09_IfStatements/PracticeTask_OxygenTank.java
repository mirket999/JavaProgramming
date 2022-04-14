package day09_IfStatements;

import java.util.Scanner;

/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you are at 50%

                USE ONE PRINT STATEMENT ONLY
 */
public class PracticeTask_OxygenTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your oxygen level?");
        int oxygenLevel = scanner.nextInt();
        String oxygen;
        String o90 = "Your tank is full",
                o80 = "Still okay",
                o70 = "Don't go too far",
                o60 = "Start to head back",
                o50 = "Be careful now you are at 50%",
                o40 = "End of the road...";


        if (oxygenLevel >= 90) {
            oxygen = o90;
        }
        else if (oxygenLevel >= 80 && oxygenLevel < 90) {
            oxygen = o80;
        }
        else if (oxygenLevel >= 70 && oxygenLevel < 80) {oxygen = o70;
        }
        else if (oxygenLevel >= 60 && oxygenLevel < 70) {oxygen = o60;
        }
        else if (oxygenLevel >= 50 && oxygenLevel < 60) {oxygen = o50;
        }
        else {
            oxygen = o40;
        }
        System.out.println(oxygen);




    }
}

