
package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask_PositiveNegativeNumbers {
    /*
    1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

     */

    public static void main(String[] args) {
        System.out.println("Please enter 5 numbers to see how many of them are +/-");

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < 5; i++) {

            int number = new Scanner(System.in).nextInt();

            if (number > 0) {
                positiveCount++;
            }
            if (number < 0) {
                negativeCount++;
            }
                                
        }

        System.out.println("negativeCount = " + negativeCount);
        System.out.println("positiveCount = " + positiveCount);





    }

}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */