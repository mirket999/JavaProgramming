package day23_CustomMethods_Void;

public class PracticeTask_CalculateCircle {
    //TASK:
    /*
     create a method that can calculate the area of a circle
     */

    public static void main(String[] args) {
    areaOfCircle(6);
    }

    public static void areaOfCircle(double radius){
        double areaOfCircle = radius * radius * 3.14;
        System.out.println("areaOfCircle = " + areaOfCircle);
    }
}
