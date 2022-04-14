package day14_String;

import java.util.Scanner;

public class PracticeTask_AccountNumber {
    /*
     Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account number:");
        String accountNumber = input.nextLine();
        input.close();

        boolean accountWith2 = accountNumber.charAt(0) == '2' && accountNumber.length() == 7;
        boolean accountWith5 = accountNumber.charAt(0) == '5' && accountNumber.length() == 10;

        String message;

        if (accountWith2 || accountWith5) {
            message = "Valid account";
        } else {
            message = "Invalid account";
        }

        System.out.println(message);
    }
}
