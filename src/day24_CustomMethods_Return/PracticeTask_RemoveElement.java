package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask_RemoveElement {
    //TASK:
    /*
     create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

     */
    public static void main(String[] args) {
       int [] array = {10, 20, 30, 40, 50, 60};
       int index = 2;

       int [] array2 = removeElement(array,index) ;

        System.out.println(Arrays.toString(array2));

    }

    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }
}
