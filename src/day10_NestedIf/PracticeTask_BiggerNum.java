package day10_NestedIf;

import java.util.Scanner;

public class PracticeTask_BiggerNum {
    public static void main(String[] args) {
        /*
        Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
         */


        System.out.println("Please enter 3 numbers to learn which one is bigger:");
        System.out.println("First number:");
        int n1 = new Scanner(System.in).nextInt();

        System.out.println("Second number:");
        int n2 = new Scanner(System.in).nextInt();

        System.out.println("Third number:");
        int n3 = new Scanner(System.in).nextInt();

        String message =
        (n1 > n2 && n1 > n3)? "n1 is bigger" :(n2 > n1 && n2 > n3)? "n2 is bigger" : "n3 is bigger";

        System.out.println(message);








    }
}
