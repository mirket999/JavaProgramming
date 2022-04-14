package day26_CustomMethodsPractice;

public class PracticeTasks_Calculations {
    public static void main(String[] args) {
        int sum = sum(60,80);
        System.out.println("sum = " + sum);

        double sum1 = sum(20.65, 65.45);
        System.out.println("sum1 = " + sum1);

        int subt = subtraction(60,42);
        System.out.println("subt = " + subt);

        double subt1 = subtraction(60.5, 40.2);
        System.out.println("subt1 = " + subt1);

        System.out.println("--------------------------------------------");
        int multiply = multiply(5,6);
        System.out.println("multiply = " + multiply);

        double multiply1 = multiply(20.3, 2.5);
        System.out.println("multiply1 = " + multiply1);

        System.out.println("--------------------------------------------");

        double division = division(21.0, 11.5);
        System.out.println("division = " + division);

        System.out.println("--------------------------------------------");

        boolean ifEven = ifEven(40);
        System.out.println("ifEven = " + ifEven);

        System.out.println("--------------------------------------------");

        boolean ifOdd = ifOdd(5) ;
        System.out.println("ifOdd = " + ifOdd);

        System.out.println("--------------------------------------------");

        int max = max(40,60);
        System.out.println("max = " + max);

        double max1 = max(65.9,89.6);
        System.out.println("max1 = " + max1);

        System.out.println("--------------------------------------------");

        int min = min(25,65);
        System.out.println("min = " + min);

        double min1 = min(20.5,65.4);
        System.out.println("min1 = " + min1);

        System.out.println("--------------------------------------------");

        int square = square(60);
        System.out.println("square = " + square);

        double square1 = square(60.5);
        System.out.println("square1 = " + square1);

        System.out.println("--------------------------------------------");

        

        
    }
    //return the square of a double
    public static double square(double a){
        return a*a;
    }

    // returns the square of an integer:
    public static int square (int a){
    return a*a;
    }

    // return the minimum number between two decimal numbers:
    public static double min(double a, double b){
        return (a<b)? a : b;
    }

    //return the minimum number between two integers;
    public static int min(int a, int b){
        return (a<b) ? a : b;
        
    }


    //returns the maximum number between two decimals:
    public static double max (double a, double b){
        double max = (a>b)? a : b;
        return max;
    }

    //returns the maximum number between two integers:
    public static int max (int a, int b){
        int max = (a>b)? a : b;
        return max;
    }

    //checks if an integer is odd number:
    public static boolean ifOdd (int a){
        return (a%2==1);
    }
    
    //checks if an integer is even number:
    public static boolean ifEven (int a){
        return (a%2==0);
    }
    
    //returns the division result of two double parameters;
    public static double division (double a, double b){
    return a/b;
    }

    //returns the multiplication of two decimals.
    public static double multiply ( double a, double b){
        return a*b;
    }

    //returns the multiplication of two integers.
    public static int multiply (int a, int b){
        return a*b;
    }

    //returns the subtraction of two decimals:
    public static double subtraction(double a, double b){
        return a-b;
    }

    //returns the subtraction of two integers:
    public static int subtraction(int a, int b){
        return a-b;
    }

    //returns the sum of two integers:
    public static int sum(int a, int b){
        return a+b ;
    }

    //returns the sum of two decimal numbers:
    public static double sum(double a, double b){
        return a+b;
    }
}
