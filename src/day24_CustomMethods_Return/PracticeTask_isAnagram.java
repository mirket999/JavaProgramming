package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask_isAnagram {
    //TASK:
    /*
    create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
     */
    public static void main(String[] args) {
        String str1 = "cba",
                str2 = "bac";

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String word1, String word2) {

        char[] ch1 = word1.toLowerCase().toCharArray(), // first we make String a char array, then sort it to be able to use Arrays.equal method.
                ch2 = word2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
