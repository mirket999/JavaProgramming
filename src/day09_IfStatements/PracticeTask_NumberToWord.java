package day09_IfStatements;

public class PracticeTask_NumberToWord {
    public static void main(String[] args) {
        int number = 8;
        String name_number;

        if (number == 1) {
            name_number = "One";
        } else if (number == 2) {
            name_number = "Two";
        } else if (number == 3) {
            name_number = "Three";
        } else if (number == 4) {
            name_number = "Four";
        } else if (number == 5) {
            name_number = "Five";
        } else if (number == 6) {
            name_number = "Six";
        } else if (number == 7) {
            name_number = "Seven";
        } else if (number == 8) {
            name_number = "Eight";
        } else name_number = "Nine";

        System.out.println("name_number = " + name_number);
    }
}

