package day13_StringClass;

import java.util.Scanner;

public class PracticeTask_Initials {
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your first name:");
        String firstName = input.nextLine();

        System.out.println("Write your second name:");
        String secondName = input.nextLine();

        System.out.println(firstName.charAt(0) + "." + secondName.charAt(0));





    }
}
