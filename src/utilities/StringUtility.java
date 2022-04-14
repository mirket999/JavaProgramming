package utilities;

import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {

    }
    
    //prints each character of a String
    public static String printEachCharacter(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        return word;
    }

    //returns the reversed String:
    public static String reverse(String word){
        String reversed ="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed+=word.charAt(i);
        }
        return reversed;
    }

    //returns true if given String is Palindrome
    public static boolean isPalindrome (String str){

       return str.equalsIgnoreCase(reverse(str));
    }

    // checks if given String is Anagram, returns boolean
    public static boolean isAnagram (String str1, String str2){
        char [] a = str1.toCharArray();
        Arrays.sort(a);
        char [] b = str2.toCharArray();
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    //removes duplicated charachters
    public static String removeDuplicates (String str){
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (!str2.contains(a + "")) {
                str2+=a;
            }
        }
       return str2;
    }
}
