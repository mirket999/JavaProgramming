package day20_Arrays;

import java.util.Arrays;

public class PracticeTask_MoveAllZerosToTheEnd {
    /*
     write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

     */
    public static void main(String[] args) {
        //MY SOLUTION:
        /*
        int [] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {
         reversedArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reversedArray));
        */

        //MY SOLUTION WITHOUT USING SORT METHOD:
        /*
                int[] array = {1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7};
        int[] arrayMoveZeros = new int[array.length];

        int k = 0;
        int l = 0;
        for (int each : array) {
            if (each == 0) {
                arrayMoveZeros[arrayMoveZeros.length - 1 - k++] = 0;
            } else {
                arrayMoveZeros[l++] = each;
            }
        }
        System.out.println(Arrays.toString(arrayMoveZeros));
         */

        ////MUHTAR'S SOLUTION:
        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0 ) {
                result[j++] = array[i];
            }

        }

        System.out.println(Arrays.toString(result));

    }
}
