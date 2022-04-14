package day20_Arrays;

import java.util.Arrays;

public class PracticeTask_Numbers100To1 {
    /*
     create an array that has the numbers 100 to 1
     */
    public static void main(String[] args) {
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
             numbers [i] = 100-i;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
