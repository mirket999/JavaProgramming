package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_FirstLastCharacter {
    /*
    write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String word = input.nextLine();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        input.close();
        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);


    }

}
