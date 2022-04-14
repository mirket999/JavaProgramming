package day10_NestedIf;

import java.util.Scanner;

public class PracticeTask_Loans {
    public static void main(String[] args) {
    /*
    Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
     */

        System.out.println("Welcome to Bank of America. Please enter your name to continue...");
        String nameOfCustomer = new Scanner(System.in).next();

        System.out.println("Welcome " + nameOfCustomer + "!");

        System.out.println("Please enter your salary:");
        double salary = new Scanner(System.in).nextDouble();

        System.out.println("Please enter your credit score:");
        int creditScore = new Scanner(System.in).nextInt();

        String loan =
                (salary > 60000 && creditScore > 650)? "You are eligible to get loan" : "You are not eligible to get loan";

        System.out.println(loan);



    }


}
