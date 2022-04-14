package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        input.close();


        System.out.println("You are " + age + " and your name is " + fullName);


    }
}
