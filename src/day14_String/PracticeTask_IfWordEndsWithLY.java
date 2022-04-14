package day14_String;

import java.util.Scanner;

public class PracticeTask_IfWordEndsWithLY {
    /*
    ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word which ends with -ly:");
        String newWord = input.nextLine();
        input.close();

       String output = newWord.substring(newWord.length()-2) ;

       if (output.equals("ly")) {
            System.out.println("Really?");

        } else {
            System.out.println("Never mind!");
        }
    }
    }
