package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NthLargestNumber {
    public static void main(String[] args) {
        //TASK:
        /*
1. write a program that can return the nth largest number from an arraylist
			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5
			output:
				4
 */

        //finding the nth max number in an ArrayList:
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));

        int n = 3;

        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);

        System.out.println(max);


        
       //my approach: create a method that can find the Nth max number.
        int  [] array = {2, 6, 8, 9, 10, 12};
        int max1 = max(array, 5);

        System.out.println("max = " + max);
        




    }
    //returns the Nth max number in an array.
    public static int max(int [] array, int n){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int each : array) {
            list.add(each)   ;
        }

        for (int i = 0; i < 6; i++) {
            list2.add(Collections.max(list));
            list.removeIf(p-> p==Collections.max(list));
        }
        return list2.get(n-1);
    }
    
    
}
