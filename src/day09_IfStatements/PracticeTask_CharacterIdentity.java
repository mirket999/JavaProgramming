package day09_IfStatements;

import java.util.Scanner;

public class PracticeTask_CharacterIdentity {
    public static void main(String[] args) {

      /*  char chr = 'ü';
        int nChar = chr;

        if (nChar >= 48 && nChar <= 57) {
            System.out.println("Digit");
        }
        else if ((nChar >= 65 && nChar <= 90) || (nChar >= 97 && nChar <= 122)) {
            System.out.println("Alphabetic Character");
        }
        else {
            System.out.println("Special Character");
        }
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character below:");

        char nChar = scan.next().charAt(0);
     

        if (nChar >= 48 && nChar <= 57) {
            System.out.println("Digit");
        }
        else if ((nChar >= 65 && nChar <= 90) || (nChar >= 97 && nChar <= 122)) {
            System.out.println("Alphabetic Character");
        }
        else {
            System.out.println("Special Character");
        }

/*Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */
    }
}
