package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeTask_Numbers1To100 {
    /*
     create an array that has the numbers 1 to 100
     */
    public static void main(String[] args) {

       int [] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers [i] = i+1;
        }

        System.out.println(Arrays.toString(numbers));





    }
}
