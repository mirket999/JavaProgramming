package day19_LoopPractices;

public class PracticeTask_FirstDuplicatedChar {
    /*
    Write a program that can return the first duplicated character
from a string
     */

    public static void main(String[] args) {

        String str = "abccddeffghh";
        String duplicatedChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }

            }

            if (count == 2 ) {

                System.out.println(ch1);
                break;
            }
        }










    }
}

