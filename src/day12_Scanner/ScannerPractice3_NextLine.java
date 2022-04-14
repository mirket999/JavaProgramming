package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = scan.nextLine();

        System.out.println(fullName);

    }
}
