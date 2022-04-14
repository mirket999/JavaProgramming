package day11_Switch_Scanner;

import java.util.Scanner;

public class PracticeSelf_SwitchInSwitch {
    public static void main(String[] args) {

        System.err.println("Welcome to Java Lottery!");
        System.out.println("You have a chance to win a present!\nIf you are under 25, please enter --> 1!\nIf you are over 25 please enter --> 2 right under here!");
        int selection = new Scanner(System.in).nextInt();
        String message;

        switch (selection) {
            case 1:
                System.out.println("Are you interested in video game? please enter V");
                System.out.println("Are you interested in programming ? please enter P");
                Scanner scan = new Scanner(System.in);
                char isInterestedVideoGame = scan.next().charAt(0);
                switch (isInterestedVideoGame) {
                    case 'V':
                        message = "Congratulations! You won last version of Play Station!";
                        break;
                    case 'P':
                        message = "Congratulations! You won a 7-months Cydeo SDET course!";
                        break;
                    default:
                        message = "Please enter only V or P!";
                }
                break;
            case 2:
                System.out.println("Are you married? please enter Y/N");
                Scanner scanner = new Scanner(System.in);
                char isMarried = scanner.next().charAt(0);
                switch (isMarried) {
                    case 'Y':
                        message = "Congratulations! You won a holiday in Hawai!";
                        break;
                    case 'N':
                        message = "Congratulations! You won a one-week Italy holiday!";
                        break;
                    default:
                        message = "Please enter only 1 or 2!";
                }
                break;
            default:
                message = "Please ENTER only 1 or 2! ";


        }

        System.out.println(message);

    }

}
