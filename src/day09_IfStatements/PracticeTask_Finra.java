package day09_IfStatements;

import java.util.Scanner;
/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */
public class PracticeTask_Finra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number below :");
        int number = scan.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");
        }
        else if (number % 5 == 0) {
            System.out.println("RA");
        }
        else if (number % 3 == 0) {
            System.out.println("FIN");
        }
        else {
            System.err.println("Invalid number! Please enter a number which is multiple of 3, 5 or 15");

        }
    }
}
