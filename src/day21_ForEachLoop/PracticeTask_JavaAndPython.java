package day21_ForEachLoop;

import java.util.Arrays;

public class PracticeTask_JavaAndPython {
    /*
    rite a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
     */
    public static void main(String[] args) {

        String sentence = "java python java java java";
        String [] splittedSentence = sentence.split(" ");
        int javaCount = 0;
        int pythonCount = 0;
        for (String each : splittedSentence){
            if (each.equalsIgnoreCase("java")) {
               javaCount++;
            }
            if (each.equalsIgnoreCase("python")) {
                pythonCount++;
            }
        }
        System.out.println("pythonCount = " + pythonCount);
        System.out.println("javaCount = " + javaCount);
    }
}
