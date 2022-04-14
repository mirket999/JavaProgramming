package day09_IfStatements;

public class PracticeTask_Calculator {

    public static void main(String[] args) {
        double n1 = 40;
        double n2 = 30;
        char mathOperator = '9';
        //boolean otherOp = mathOperator == '*' || mathOperator == '/' || mathOperator == '-' || mathOperator == '+';
        boolean operator = mathOperator != '/' && mathOperator != '+' && mathOperator != '-' && mathOperator != '*';
        double result ;



        /*if (mathOperator == '/') { result = n1 / n2;}
        else if (mathOperator == '*') { result = n1 * n2;}
        else if (mathOperator == '-') { result = n1 - n2;}
        else {result = n1 + n2;}

        System.out.println(result);*/


        if (operator) {
            System.out.println("invalid");}
        else {
            if (mathOperator == '*') {
                result = n1 * n2;
            } else if (mathOperator == '-') {
                result = n1 - n2;
            } else if (mathOperator == '/') {
                result = n1 / n2;
            } else {
                result = n1 + n2;
            }
                System.out.println(result);
            }


        }

    }

