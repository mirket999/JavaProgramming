package day20_Arrays;

import java.util.Arrays;

public class PracticeTask_ReverseIntegers {
    /*
     Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
     */
    public static void main(String[] args) {
      int array [] = {1,2,3,4,5};
      int [] reversedArray = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
        reversedArray [j] = array [i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
