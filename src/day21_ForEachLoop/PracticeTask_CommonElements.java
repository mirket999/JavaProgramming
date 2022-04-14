package day21_ForEachLoop;

public class PracticeTask_CommonElements {
    /*
    Write a program that can print out the common elements from two integer array
             Ex:
                 arr1: {1,2,3,4,5}
                 arr2: {4,5,6,7,8}

             output:
                 4 5


             MUST use for each loops
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 4},
                arr2 = {4, 5, 6, 7, 8};
       String result = "";
        for (int each : arr1) {
            for (int i = 0; i < arr2.length; i++) {
                if (each == arr2[i] && !result.contains(each + "")) {
                    result += each;
                }
            }
        }
        System.out.print(result);
    }
}
