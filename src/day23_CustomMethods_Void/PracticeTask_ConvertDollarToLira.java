package day23_CustomMethods_Void;

public class PracticeTask_ConvertDollarToLira {
    //TASK:
    /*
    create a method that can can convert dollar to lira
     */
    public static void main(String[] args) {
    convertDollarToLira(100);
    }

    public static void convertDollarToLira (double dollar){
    double lira = dollar*14.50;
        System.out.println("lira = " + lira);
    }
}
