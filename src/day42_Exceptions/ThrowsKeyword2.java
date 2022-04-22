package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("-----------TEST STARTED------------");
        System.out.println(8/0); //throws keyword is used for only checked/unwanted exceptions. We should use try/catch block for unchecked exceptions.
        System.out.println("-----------TEST COMPLETED----------");
    }
}
