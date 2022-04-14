package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask_AddElement {
    //TASK:
    /*
    create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
     */
    public static void main(String[] args) {
    int [] arr ={1,2,3};

    int [] array2 = addElement(arr,4);

        System.out.println(Arrays.toString(array2));
    }

    public static int [] addElement(int [] array, int number){
        int [] array2 = new int[array.length+1];
        int count =0;
        for (int element : array) {     // as first step, assign the elements from array to array2 starting from index 0.
           array2[count++] = element;

        }
        array2[array2.length-1]=number;  // since last index of array2 is 0, assign the given number directly.
        return array2;
    }
}
