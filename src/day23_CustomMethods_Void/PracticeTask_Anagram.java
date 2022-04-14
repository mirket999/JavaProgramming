package day23_CustomMethods_Void;

import java.util.Arrays;

public class PracticeTask_Anagram {
  //TASK:
  /*
   create a method that can check if two strings are anagram
ex:
anagram("silent", "listen")
output:
silent and listen are anagram
   */

    public static void main(String[] args) {
     isAnagram("listen", "silent");
    }

    public static void isAnagram (String firstWord, String secondWord){
        char [] firstWordChar = firstWord.toCharArray();
        Arrays.sort(firstWordChar);
        char [] secondWordChar = secondWord.toCharArray();
        Arrays.sort(secondWordChar);
        boolean isAnagram = false;
        if (Arrays.equals(firstWordChar,secondWordChar)) {
           isAnagram = true;
        }
        System.out.println("isAnagram = " + isAnagram);
    }
}
