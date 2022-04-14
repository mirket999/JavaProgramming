package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 10;
        String message = "";

        switch (number) {
            case 1: case 2: case 3: case 4: case 5:
                message = "Elemantary School";
                break;

            case 6: case 7: case 8:
                message = "Middle school";
                break;

            case 9: case 10: case 11: case 12:
                message = "High school";
                break;

            case 13: case 14: case 15: case 16:
                message = "College";
                break;

            case 17: case 18:
                message = "Grad School";
                break;

            default:
                message = "Invalid";

        }
        System.out.println(message);


    }


}
