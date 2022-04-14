package day24_CustomMethods_Return;

public class PracticeTask_isPalindrom {
    //TASK:
    /*
     By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
     */
    public static void main(String[] args) {
     String str = "kazak";

        boolean isPalindrom = isPalindrom(str)  ;

        System.out.println("isPalindrom = " + isPalindrom);

    }

    public static boolean isPalindrom (String word){
        boolean isPalindrom = false;
        String reversedWord = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord+=word.charAt(i);
        }
        if (reversedWord.equalsIgnoreCase(word)){
            isPalindrom = true;
        }

        return isPalindrom;
    }
}
