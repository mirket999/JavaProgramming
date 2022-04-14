package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_FirstLastCharacter2 {
    /*
    write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write any String below:");
        String str = input.nextLine();

        if (str.charAt(0) == str.charAt(str.length()-1)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }








    }



}
