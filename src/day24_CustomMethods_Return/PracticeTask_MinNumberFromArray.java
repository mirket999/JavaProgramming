package day24_CustomMethods_Return;

public class PracticeTask_MinNumberFromArray {
    //TASK:
    /*
    create a method that can return the minimum number from an array of integers
     */
    public static void main(String[] args) {
     int [] numbers = {6, 2, 3, 1, 4, 5};
        System.out.println(minFromArray(numbers));    }


    public static int minFromArray (int [] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
     return min;
    }



}
