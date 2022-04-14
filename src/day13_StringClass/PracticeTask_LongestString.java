package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_LongestString {
 /*
 write a program that asks user to enter two strings, and print out the longest string

  */
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a string below:");
     String str1 = input.nextLine();

     System.out.println("Enter a string below:");
     String str2 = input.nextLine();
     input.close();
     if (str1.length() > str2.length()) {
         System.out.println("The longest String is str1 : " + str1);
     } else {
         System.out.println("The longest String is str2 : " + str2);
     }






 }
}
