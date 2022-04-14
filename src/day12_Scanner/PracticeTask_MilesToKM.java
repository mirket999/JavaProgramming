package day12_Scanner;

import java.util.Scanner;

public class PracticeTask_MilesToKM {
    /*
    Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = input.nextDouble();
        input.close();
        double mileToKM = miles*1.609;

        System.out.println(miles + " equal to " + mileToKM + " kilometers.");









    }












}
