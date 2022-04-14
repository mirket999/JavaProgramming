package day23_CustomMethods_Void;

public class PracticeTask_Calculator {
    //TASK:
    /*
    create a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result
     */

    public static void main(String[] args) {
    calculator(15,30,'+');
    }

    public static void calculator(int firstNumber, int secondNumber, char operator) {
        String result = "Invalid";
        if (operator == '-') {
            result = "Subtraction result is: " + (firstNumber - secondNumber);
        } else if (operator == '+') {
            result = "Addition result is: " + (firstNumber + secondNumber);
        } else if (operator == '*') {
            result = "Multiplication result is: " + (firstNumber * secondNumber);
        } else {
            result = "Divison result is: " + (firstNumber / secondNumber);
        }
        System.out.println("result = " + result);
    }
}
