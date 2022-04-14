package day16_ForLoopStringPractice;

public class PracticeTask_FrequencyOfJava {
    /*
    write a program that can return the frequency of the a word Java from the sentence

           Ex:
               sentence = "Java Java";

               output:
                   2

               Hint: you need to create
     */
    public static void main(String[] args) {

        String str = "javajavajava";

        int countJava = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            
            String str2 = str.substring(i, i + 4);
            if (str2.equalsIgnoreCase("java")) {
                countJava++;
            }
        }

        System.out.println("countJava = " + countJava);
    }
}
