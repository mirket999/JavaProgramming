package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_Reverse {
    /*
    Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
     */
    public static void main(String[] args) {
        System.out.println("Please enter an only 5-chars long word:");
        String word = new Scanner(System.in).next();


        String message;


        if (word.length() < 5) {
            message = "Too short!";
        } else if (word.length() > 5) {
            message = "Too long!";
        } else {
            message = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }

        System.out.println(message);
    }
}
