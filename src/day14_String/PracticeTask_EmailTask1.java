package day14_String;

import java.util.Scanner;

public class PracticeTask_EmailTask1 {
    /*
    Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last  name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email:");
        String email = input.nextLine();
        input.close();

        /*String swappedEmail = email.substring(email.indexOf("_") + 1, email.indexOf("@"))
                + "_"
                + email.substring(0, email.indexOf("_"))
                + email.substring(email.indexOf("@"));
        */


        if (email.contains("_")) {
            System.out.println(email.substring(email.indexOf("_") + 1, email.indexOf("@"))
                    + "_"
                    + email.substring(0, email.indexOf("_"))
                    + email.substring(email.indexOf("@")));
        } else {
            System.out.println(email);
        }


    }
}
