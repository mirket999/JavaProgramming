package day23_CustomMethods_Void;

public class PracticeTask_PositiveNegativeZero {
    //TASK:
    /*
    create a method that can if the given integer is positive,
negative or zero
     */
    public static void main(String[] args) {
        PositiveNegativeOrZero(50);
    }


    public static void PositiveNegativeOrZero(double number){
        String positiveNegativeOrZero = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println("positiveNegativeOrZero = " + positiveNegativeOrZero);
    }
}
