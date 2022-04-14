package week05;

import java.util.Scanner;

public class ReverseUsingCharATMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word and check if it is palindrome:\n--->");
        String palindrome = input.next();
        input.close();

        boolean ifPalindrome = palindrome.charAt(0) == palindrome.charAt(palindrome.length()-1)
        && palindrome.charAt(1) == palindrome.charAt(palindrome.length()-2)  ;

        String message = (ifPalindrome) ? "This word is Palindrome"
                : "This word is not Palindrome"  ;

        System.out.println(message);
     /*
     String word = "hello";

        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));

        String reversedWord = "";
        reversedWord+=word.charAt(4); // reversedWord =  reversedWord + word.charAt(4);
        reversedWord+=word.charAt(3); // += : shorthand operators
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else {
            System.out.println("The word is NOT Palindrome");
      */

    }
}