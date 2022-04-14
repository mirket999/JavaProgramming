package day23_CustomMethods_Void;

public class PracticeTask_CalculateSquare {
    //TASK:
    /*
     create a method that can calculate the area of a square
     */
    public static void main(String[] args) {
     areaOfSquare(4.5);
    }

    public static void areaOfSquare (double side ) {
        double areaOfSquare = side*side;
        System.out.println("areaOfSquare = " + areaOfSquare);
    }
}
