package day23_CustomMethods_Void;

public class PracticeTask_PrintEvenNumbers1To100 {
    //TASK:
    /*
     create a method that can print even numbers between 1~100 in a
same line saperated by space
     */

    public static void main(String[] args) {
        evenNumbers1To100();
    }

    public static  void evenNumbers1To100(){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i + " ");
        }
    }
}
