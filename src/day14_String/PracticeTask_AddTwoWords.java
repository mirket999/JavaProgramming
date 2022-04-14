package day14_String;

import java.util.Scanner;

public class PracticeTask_AddTwoWords {
    /*
     Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First word:");
        String firstWord = input.nextLine();

        System.out.println("Please enter Second word:");
        String secondWord = input.nextLine();

        input.close();
        String message;

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
            message = firstWord.substring(0, firstWord.length()-1) + secondWord.substring(0);
        }      else {
            message = "Last letter of the first word and first letter of the last word doesn't match!"  ;
        }

        System.out.println(message);








    }
}
