package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

      int [] arr = {1, 2, 3, 4};
      int number = 5;

      arr = addElement(arr,number);

        System.out.println(Arrays.toString(arr));
    }

    public static int [] addElement(int [] array, int number){
        int [] array2 = new int[array.length+1];
        //My Approach:
        for (int i = 0; i < array2.length; i++) {
            if (i== array2.length-1){
                array2[i] = number;
                break;
            }
            array2[i]=array[i]  ;
        }
        return array2;
    }
}
