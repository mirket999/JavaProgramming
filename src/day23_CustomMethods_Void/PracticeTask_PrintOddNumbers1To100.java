package day23_CustomMethods_Void;

public class PracticeTask_PrintOddNumbers1To100 {
    public static void main(String[] args) {
    //TASK:
    /*
    create a method that can print odd numbers between 1~100 in a
same line separated by space.
     */
    oddNumbers1To100();
    }

    public static void oddNumbers1To100 () {
        for (int i = 1; i <=100 ; i+=2) {
            System.out.print(i + " ");
        }
    }
}
