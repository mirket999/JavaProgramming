package day10_NestedIf;

import java.util.Scanner;

public class PracticeTask_Grade {
    public static void main(String[] args) {
        /*
        Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

        String message;
        System.out.println("Please enter the value:");
        Scanner scan = new Scanner(System.in);
        char grade = scan.next().charAt(0);

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            if (grade == 'A') {
                message = "excellent";
            }
            else if (grade == 'B') {
                message = "great job";
            }
            else if (grade == 'C') {
                message = "good";
            }
            else if (grade == 'D') {
                message = "passed";
            }
            else {
                message = "failed";
            }

        }
        else {
            message = "invalid";
        }


        System.out.println(message);


    }
}
