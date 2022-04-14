package day17_While_DoWhile;

public class PracticeTask_DivisionMultiplication {
    /*
    Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

     */
    public static void main(String[] args) {

        int number1 = -225;
        int number2 = 210;
        int count = 0;

        if (number1>number2) {
            for (int i = number2; i <= number1; i += number2) {
                count++;

            }
            System.out.println("count = " + count + ", with a reminder of " + (number1%number2));
        }  else {
            System.out.println("Number 1 must be greater than Number 2. Try again.");
        }





    }
}
