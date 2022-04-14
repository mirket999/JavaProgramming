package day14_String;

import java.util.Scanner;

public class PracticeTask_WordStartsWithX {
    /*
    Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word which starts with \"x\"");
        String word = input.next();
        input.close();

        String message;

        if (word.charAt(0) == 'x') {
            message = word.substring(1);
        }     else {
            message = "The word doesn't start with x. Please enter again."  ;
        }

        System.out.println(message);
















    }
}
