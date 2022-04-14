package day09_IfStatements;

import java.util.Scanner;

public class PracticeTask_ChooseLanguage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo call center.\nFor English, press 1.\nFor Spanish press 2.\nFor Turkish press 3.\nFor Russian press 4.\nFor French press 5.");


        int languageNumber = scan.nextInt();
        if (languageNumber == 1) {
            System.out.println("Hello, thank for your call");
        }
        else if (languageNumber == 2) {
            System.out.println("Hola, gracias para llamar");
        }
        else if (languageNumber == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        else if (languageNumber == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        }
        else if (languageNumber == 5) {
            System.out.println("Merci ,pour votre appel");
        }
        else {
            System.err.println("INVALID VALUE. PLEASE TRY AGAIN.");
        }


    }
}
