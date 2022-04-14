package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask_ReverseArray {
    //TASK:
    /*
    create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
     */
    public static void main(String[] args) {
    int [] numbers = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverseArray(numbers))); // We return data and now it is re-usable.

        int min = PracticeTask_MinNumberFromArray.minFromArray(reverseArray(numbers));//calling a method from a different class.

        System.out.println("min = " + min);
    }






    public static int [] reverseArray(int [] array){
        int [] reversedArray = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }
}
