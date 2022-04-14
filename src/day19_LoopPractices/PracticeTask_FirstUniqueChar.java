package day19_LoopPractices;

public class PracticeTask_FirstUniqueChar {
    /*
     Write a program that can return the index number of the first
unique character.
     */
    public static void main(String[] args) {
        String str = "abccaddeffghhb";
       

       /*   SOLUTION WITHOUT NESTED LOOP
       for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
                System.out.println(ch1);
                break;
            }

        }

        */

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
            char ch2 = str.charAt(j);
            if (ch1==ch2) {
                count++;
            }
           
            }
            if (count==1) {
                System.out.println(str.indexOf(ch1));
                break;
            }
        }





    }
}
