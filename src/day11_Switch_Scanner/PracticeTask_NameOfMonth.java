package day11_Switch_Scanner;

import java.util.Scanner;

public class PracticeTask_NameOfMonth {
    public static void main(String[] args) {

        System.out.println("Please enter a number to see the month which the number matches:");
        int numberOfMonth = new Scanner(System.in).nextInt();

        String nameOfMonth;
        switch (numberOfMonth) {
            case 1 :
                nameOfMonth = "Jan";
            break;
            case 2 :
                nameOfMonth = "Feb";
                break;
            case 3 :
                nameOfMonth = "Mar";
                break;
            case 4 :
                nameOfMonth = "Apr";
                break;
            case 5 :
                nameOfMonth = "May";
                break;
            case 6 :
                nameOfMonth = "Jun";
                break;
            case 7 :
                nameOfMonth = "Jul";
                break;
            case 8 :
                nameOfMonth = "Aug";
                break;
            case 9 :
                nameOfMonth = "Sep";
                break;
            case 10 :
                nameOfMonth = "Oct";
                break;
            case 11 :
                nameOfMonth = "Nov";
                break;
            case 12 :
                nameOfMonth = "Dec";
                break;
            default:
                nameOfMonth = "Invalid value";
                break;

        }

        System.out.println(nameOfMonth);









    }
}
