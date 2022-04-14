package day14_String;

import java.util.Scanner;

public class PracticeTask_DigitUpperLowerSpecialChar {
    /*
    Ask user to enter a word,
       if the word starts with digits, print "first character is digit"
       if the word starts with uppercase letters, print "first character is lowercase letter"
       if the word starts with lowercase letters, print "first character is uppercase letter"
       if the word starts with special characters, print "first character is special character"


       HINT: 1. you need charAt() method
             2. Ascii Table
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.nextLine();
        input.close();

        String message;
        if (word.charAt(0) >= 48 && word.charAt(0) <= 57) {
            message = "first character is digit";
        } else if ((word.charAt(0) >= 65 && word.charAt(0) <= 90)) {
            message = "first character is UPPERCASE";
        } else if ((word.charAt(0) >= 97 && word.charAt(0) <= 122)) {
            message = "first character is lowercase letter";
        } else {
            message = "first character is special character";
        }

        System.out.println(message);
    }
}
