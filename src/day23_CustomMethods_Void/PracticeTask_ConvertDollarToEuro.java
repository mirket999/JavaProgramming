package day23_CustomMethods_Void;

public class PracticeTask_ConvertDollarToEuro {
    //TASK:
    /*
     create a method that can convert dollar to euro
     */
    public static void main(String[] args) {
    convertDollarToEuro(30);
    }

    public static void convertDollarToEuro (double dollar){
     double euro = dollar/1.13;
        System.out.println("euro = " + euro);
    }
}
