package day12_Scanner;

import java.util.Scanner;

public class PracticeTask_HowManyPeopleLiveWith {
    /*
    Ask the user how many people they live with:
                if user lives with Less than 3 people: print "Live with less than 3 people"
                if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
                if the user lives with more than 6 people: print "Live with "more than 6 people"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many people do you live with?");
        int numberOfPeople = input.nextInt();
        String message;
        input.close();
        if (numberOfPeople > 6) {
            message = "Live with more than 6 people";
        } else if (numberOfPeople > 2) {
            message = "Live with 3 - 6 people";
        } else if (numberOfPeople >= 0) {
            message = "Live with less than 3 people";
        } else {
            message = "INVALID VALUE";


        }
        System.out.println(message);

    }


}
