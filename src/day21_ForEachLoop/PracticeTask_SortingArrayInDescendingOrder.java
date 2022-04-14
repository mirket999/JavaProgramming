package day21_ForEachLoop;

import java.util.Arrays;

public class PracticeTask_SortingArrayInDescendingOrder {
    /*
    Write a program that sort the array of integer in descending order
     */
    public static void main(String[] args) {
        int [] numbers = {20, 30, 65, 87, 10, -90, 54};

        Arrays.sort(numbers);

        int [] numbersDescending = new int[numbers.length] ;
        System.out.println(Arrays.toString(numbers));

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
          numbersDescending [i] = numbers[j];
        }

        System.out.println(Arrays.toString(numbersDescending));
    }
}
