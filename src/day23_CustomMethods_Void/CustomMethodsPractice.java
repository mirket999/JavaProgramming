package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloCydeo5Times();
        System.out.println("----------------------------");
        helloWorld5Times();
        System.out.println("----------------------------");
        evenNumbers1To10();

    }



    
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void evenNumbers1To10 (){
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i + " ");
        }
    }
}
