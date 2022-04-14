package day12_Scanner;

import java.util.Scanner;

public class PracticeTask_CentToDollar {
    /*
    Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cent = input.nextInt();
        input.close();

        int centToDollar = cent/100;
        int centToCent = cent%100;

        System.out.println(centToDollar + " dollars and " + centToCent + " cents.");



    }


}
