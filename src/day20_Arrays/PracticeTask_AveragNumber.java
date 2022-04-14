package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeTask_AveragNumber {
    /*
    AverageNumber:
1. Ask the user how many numbers they want to
enter
2. get all the inputs from the user and store
them into an array
3. Iterate the array & return the average
number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int length = input.nextInt();
        int [] numbers = new int[length];
        double sum = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("Enter number " + (i+1));
          numbers[i] = input.nextInt();
          sum+=numbers[i];
        }
        double average = sum/length;
        System.out.println(Arrays.toString(numbers));
        System.out.println("average = " + average);
    }
}
