package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeTask_MinMaxNumber {
    /*
     Write a program that asks user to enter a number 10 times:
1. store all user entered numbers in an array
2. find the max number
3. find the min number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i+1));
            numbers[i] = input.nextInt();
            if (numbers[i] < min) {
               min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}
