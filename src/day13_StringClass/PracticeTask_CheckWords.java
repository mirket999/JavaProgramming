package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_CheckWords {
   /*
   Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
    */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter 3 words:");
       System.out.println("First word:");
       String firstWord = input.next();

       System.out.println("Second word:");
       String secondWord = input.next();

       System.out.println("Third word:");
       String thirdWord = input.next();

       input.close();
       String message ;

       if (firstWord.length() == secondWord.length() && firstWord.length() == thirdWord.length()) {
           message = "All words are same length";
       } else if (firstWord.length() != secondWord.length() && firstWord.length() != thirdWord.length()) {
           message = "All different length";
       } else {
           message = "Not Same nor Different lengths";
       }

       System.out.println(message);
















   }
}
