package day03_EscapeSequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock");//first it prints statement, then appends a new line.
        System.out.println("Who is this?");
        System.out.println("This is Java");
        System.out.println("-----------------------------");
        System.out.print("Knock Knock");
        System.out.print("Who is this?");
        System.out.println("-----------------------------");
        System.out.print("Hello Everyone, How are you all today? Today we will talk about escape sequences");//we will divide this message in order to make it readable easier.
        System.out.println("-----------------------------");
        System.out.print("Hello Everyone,");
        System.out.print(" How are you all today?");
        System.out.print(" Today we will talk about escape sequences");



    }

}
