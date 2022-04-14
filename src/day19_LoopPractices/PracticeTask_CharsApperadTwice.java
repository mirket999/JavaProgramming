package day19_LoopPractices;

public class PracticeTask_CharsApperadTwice {
    /*
    Write a program that can display all the characters that appeared
twice in the string.
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

            if (count == 2 && !duplicatedChars.contains(ch1 + "")) {
                duplicatedChars+=ch1;

            }
        }

        System.out.println(duplicatedChars);
    }
}
