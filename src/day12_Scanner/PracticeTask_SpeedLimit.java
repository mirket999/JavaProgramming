package day12_Scanner;

import java.util.Scanner;

public class PracticeTask_SpeedLimit {
    /*
    2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
         Ex:
             speedLimit = 55;
             Enter current speed:
             105

             output:
             You're driving 50 mph over the limit. Slow down!

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int speedLimit = 55;

        System.out.println("Enter your current speed: ");
        int currentSpeed = input.nextInt();
        input.close();
        String message;
        int overLimit = currentSpeed - 55;

        if (currentSpeed >= 0) {
            if (currentSpeed < 56) {
                message = null;
            } else {
                message = "You're driving " + overLimit + "km over the limit. Slow down!";
            }
        } else {
            message = "Enter a valid speed value!!!";
        }

        System.out.println(message);

    }
}
