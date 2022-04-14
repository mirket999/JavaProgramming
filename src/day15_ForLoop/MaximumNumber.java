package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mxNumber = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number>mxNumber){
                mxNumber = number;
            }

        }
        System.out.println(mxNumber);

    }
}
