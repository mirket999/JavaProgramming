package day15_ForLoop;

import java.util.Scanner;

public class PracticeTask_FactorialNumber {
    public static void main(String[] args) {

        System.out.println("Please enter a number to calculate the factorial of this number:");
        int factorial = new Scanner(System.in).nextInt();
        int result =1;
        for (int i = factorial; i >= 1; i--) {

           result *= i;
        }

        System.out.println(factorial + "! = " +result);




    }
}
