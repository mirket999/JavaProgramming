package day12_Scanner;

import java.util.Scanner;

public class PracticeTask_GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score to see your grade report;");
        int score = input.nextInt();
        String message = "A";
        input.close();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                message = "A";
            } else if (score >= 80) {
                message = "B";
            } else if (score >= 60) {
                message = "C";
            } else if (score >= 50) {
                message = "D";
            } else {
                message = "F";
            }
        } else {
            message = "INVALID SCORE";
        }
        System.out.println("Your grade level is: " + message);
    }


}
