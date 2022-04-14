package day23_CustomMethods_Void;

public class PracticeTask_EachCharacter {
    //TASK:
    /*
     create a method named printEachChar that can print each
characters of a string
     */

    public static void main(String[] args) {
      printEachChar("I would like to have a cup of tea please.");
    }

    public static void printEachChar (String word){
        for (int i = 0; i < word.length(); i++) {
            char eachChar = word.charAt(i);
            System.out.println(eachChar);
        }
    }
}
