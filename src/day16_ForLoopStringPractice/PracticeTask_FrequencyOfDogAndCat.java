package day16_ForLoopStringPractice;

import java.util.Locale;

public class PracticeTask_FrequencyOfDogAndCat {
    /*
    write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
     */
    public static void main(String[] args) {

      String word = "catt dogg catdogg  catt dogDOgCAt";
      int cattCount = 0;
      int doggCount = 0;
       
        for (int i = 0; i <= word.length()-4 ; i++) {

            String s = word.substring(i, i+4);
            if (s.equalsIgnoreCase("catt")){
                cattCount++;
            }
            if (s.equalsIgnoreCase("dogg")) {
                doggCount++;
            }
        }

         boolean isEqual = cattCount == doggCount;
        System.out.println("doggCount = " + doggCount);
        System.out.println("cattCount = " + cattCount);
        System.out.println("isEqual = " + isEqual);


    }
}
