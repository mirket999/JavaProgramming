package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 2500;
        int secondNumber = 500;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;


        // 100+50 = 150
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);

        //100 - 50 = 50
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

        // 100 * 50 = 5000
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
    }
}
