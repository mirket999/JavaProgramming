package day09_IfStatements;

import java.util.Scanner;

public class PracticeTask_SalaryAfterTax {

    public static void main(String[] args) {

/*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary amount before tax :");
        double salaryBeforeTax = scan.nextDouble();
        System.out.println("Are you married? true or false?");
        boolean isMarried = scan.hasNextBoolean();

     if(isMarried)
     {
         if (salaryBeforeTax >= 130000) {
             System.out.println("Your salary after tax is (married): $" + salaryBeforeTax * 0.70);
         }
         else if (salaryBeforeTax >= 100000 && salaryBeforeTax < 130000) {
             System.out.println("Your salary after tax is (married): $" + salaryBeforeTax * 0.75);
         }
         else if (salaryBeforeTax >= 80000 && salaryBeforeTax < 100000) {
             System.out.println("Your salary after tax is (married): $" + salaryBeforeTax * 0.8);
         }
         else {System.out.println("Your salary after tax is (married): $" + salaryBeforeTax * 0.85);
         }


     }
     else
     {

         if (salaryBeforeTax >= 130000) {
             System.out.println("Your salary after tax is: $" + salaryBeforeTax * 0.65);
         }
         else if (salaryBeforeTax >= 100000 && salaryBeforeTax < 130000) {
             System.out.println("Your salary after tax is: $" + salaryBeforeTax * 0.70);
         }
         else if (salaryBeforeTax >= 80000 && salaryBeforeTax < 100000) {
             System.out.println("Your salary after tax is: $" + salaryBeforeTax * 0.75);
         }
         else {System.out.println("Your salary after tax is: $" + salaryBeforeTax * 0.8);
         }

     }


    }
}
