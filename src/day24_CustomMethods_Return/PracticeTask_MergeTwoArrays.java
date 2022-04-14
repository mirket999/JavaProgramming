package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask_MergeTwoArrays {
    //TASK:
    /*
      create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}

     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3},
              arr2 = {4, 5};
      int [] array3 = mergeArrays(arr1, arr2);

        System.out.println(Arrays.toString(array3));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        int count = 0;

        for (int element : array1) {
            mergedArray[count] = element;
            count++;
        }
        for (int element : array2) {
            mergedArray[count] = element;
            count++;
        }


        return mergedArray;
    }
}
