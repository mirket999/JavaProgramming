package day10_NestedIf;

import java.util.Scanner;

public class PracticeTask_AgeGroups {
    public static void main(String[] args) {
    /*
    Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */
String message ;
        System.out.println("Please enter your age:");
        int age = new Scanner(System.in).nextInt();

        if (age <0 || age >=150 ) {
            message = "invalid";
        }
        else {
            if (age < 21) {
                message = "Teenager";
            }
            else if (age>=21 && age<55) {
                message = "Adult";
            }
            else {
                message = "Senior";
            }

        }
        System.out.println(message);
    }
}
