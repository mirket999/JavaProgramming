package week02;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {
String name = "Omer";
        // output goes to console --- print or println
        System.out.println("Output");

        //How can i receive input for my JAVA class
        // 1. Create your scanner o
        Scanner input = new Scanner(System.in);

        // 2. Prompt the user for putting input
        System.out.println("Put your name : ");

        // 3. get the input;
        name = input.next();
    }
}
