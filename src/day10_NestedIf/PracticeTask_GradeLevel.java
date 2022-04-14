package day10_NestedIf;

import java.util.Scanner;

public class PracticeTask_GradeLevel {
    public static void main(String[] args) {
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
        System.out.println("Please enter your grade level below:");
        byte gradeLevel = new Scanner(System.in).nextByte();

        String message = "";

        if (gradeLevel >= 1 && gradeLevel <= 18) {
            if (gradeLevel<= 5) {
                message = "Elementary school";
            }
            else if ( gradeLevel <= 6) {
                message = "Middle school";
            }
            else if ( gradeLevel <= 12) {
                message = "High school";
            }
         else if (gradeLevel <= 16) {
                message = "College";
            }
         else {
                message = "Grad School";
            }

        }
        else {
            message = "Invalid grade level given";
        }

        System.out.println(message);







    }
}
