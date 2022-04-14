package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        //TASK:
        /*
        /*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";
			output:
				Java learn to day good a is Today
 */
         
    String sentence = "Today is a good day to learn Java";

    String [] sentenceArray = sentence.split(" ");

    String reversed = "";

        for (int i = sentenceArray.length - 1; i >= 0; i--) {
            reversed+=sentenceArray[i] + " ";
        }

        System.out.println("reversed = " + reversed);


    }
}
