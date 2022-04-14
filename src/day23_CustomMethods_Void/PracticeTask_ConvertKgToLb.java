package day23_CustomMethods_Void;

public class PracticeTask_ConvertKgToLb {
    //TASK:
    /*
    create a method that can convert kg to lb
     */

    public static void main(String[] args) {
        convertKgToLb(15.5);
    }




    public static void convertKgToLb (double kg){
        double lb = kg * 2.205;
        System.out.println("lb = " + lb);
    }
}
