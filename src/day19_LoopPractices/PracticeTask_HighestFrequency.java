package day19_LoopPractices;

public class PracticeTask_HighestFrequency {
    /*
     Write a program that can find the character that has the highest frequency from a string
     */

    public static void main(String[] args) {
        /*  Alternative Way from Muhtar

        String str = "aaabbbbbccd";

        int highestFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count > highestFrequency){
                highestFrequency = count;
            }

        }


        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count == highestFrequency && !result.contains(ch+"")){
                result += ch;
            }

        }


        System.out.println( result);

         */
        String str = "aaakkllmmnn6666699999999";
        String result = "";

        int highestFrequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1==ch2) {
                    frequency++;
                }

            }
            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                result=ch1 + " has the highest frequency with the number of " + highestFrequency;
            }



        }

        System.out.println(result);


    }
}
