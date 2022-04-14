package day14_String;

import java.util.Scanner;

public class PracticeTask_SubstarctFirstLetters {
 /*
 Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
  */
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter 2 words.\nFirst word:");
     String firstWord = input.nextLine();

     System.out.println("Second word: ");
     String secondWord = input.nextLine();

     input.close();

     String output = firstWord.substring(1) + secondWord.substring(1);

     System.out.println("output = " + output);















 }


}
