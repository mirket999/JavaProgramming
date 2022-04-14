package day36_Inheritance.practiceTasks.sportsTask;

public class SportsObjects {
    public static void main(String[] args) {
        AmericanFootball americanFootball = new AmericanFootball("ABC", 14, 4);
        americanFootball.play();
        System.out.println(americanFootball);

        System.out.println("------------------------------------------");

        Football football = new Football("DEF", 11, 6);
        football.play();
        System.out.println(football);

        System.out.println("-------------------------------------------");

        Baseball baseball = new Baseball("GHI", 12, 6);
        baseball.name="BASEBALL";
        System.out.println(baseball);

        System.out.println("-------------------------------------------");

        Basketball basketball = new Basketball("JKL", 12, 14);
        basketball.play();
        System.out.println(basketball);
    }
}
