package day23_CustomMethods_Void;

public class PracticeTask_EachElement {
    //TASK:
    /*
     create a method named printEachElement that can print each
elements of an integer array
     */

    public static void main(String[] args) {
    int[] numbers =  {1, 2, 3, 4} ;
     printEachElement(numbers);
    }

    public static void printEachElement (int [] array){
        for (int each : array) {
            System.out.print(each + " ");
        }
    }
}
