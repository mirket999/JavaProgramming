package day09_IfStatements;

public class silinecek {

    public static void main(String[] args) {

        double n1 =5;
        double n2 = 6;
        char mathOp = '4';
        double result;
        String data = "bab";


        if (mathOp == '/') { result = n1 / n2;}
        else if (mathOp == '*') { result = n1 * n2;}
        else if (mathOp == '-') { result = n1 - n2;}
        else if (mathOp == '+') {result = n1 + n2;}

        else { System.out.println("invalid");
            }





    }
}
