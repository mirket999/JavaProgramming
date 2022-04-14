package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    /*

    + : Addition
    - : Substract
    * : Multiplication
    / : Division
            in math:
            10/4 = 2.5

            in java:
            10/4 = 2
            10.0/4 = 2.5
    % : Remainder
*/
    public static void main(String[] args) {

        System.out.println("12" + 1); //121, concatenation
        System.out.println(10 + 20); // 30, Addition
        System.out.println(100-50); // 50, Subtraction
        System.out.println(10 * 6); //60, multiplication

        System.out.println(100 / 3); // 33 integer/integer=integer
        System.out.println(10/4); // 2
        System.out.println(10.0 / 4); // 2.5 decimal/integer=decimal
        System.out.println(10 / 4.0); // 2.5 integer/decimal=decimal

        System.out.println(10d / 4); //2.5 We just add a "d" to one of the numbers.

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);

        double c = a/6.0; //16.66666
       // double c = (double)a/6;
        System.out.println(c);

        System.out.println(100D);



    }
}
