package day15_ForLoop;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
double total = 0;

        for (int i = 0; i < 5; i+=2) {
            System.out.println("Enter a number:");
            total += input.nextInt();
        }
        System.out.println(total);





}





    }

