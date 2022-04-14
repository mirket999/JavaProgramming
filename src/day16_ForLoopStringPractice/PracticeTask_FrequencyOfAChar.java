package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask_FrequencyOfAChar {
    /*
    Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = input.nextLine();

        System.out.println("Please enter a char:");
        char ch = input.nextLine().charAt(0);

        int countChar = 0;
        for (int i = 0; i < str.length()-1; i++) {

            char ch2 = str.charAt(i);

            if (ch == ch2) {
               countChar++;
            }

        }

        System.out.println("countChar = " + countChar);




    }
}