package day17_While_DoWhile;

import java.util.Scanner;

public class PracticeTask_SumOfNumbers {
    /*
    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while (number>0) {
            System.out.println("Enter a positive number:");
            number = input.nextInt();
            if (number<0) {
                break;
            }
            sum += number;


        }

        System.out.println("Sum of the numbers is = " + sum);








    }
}
