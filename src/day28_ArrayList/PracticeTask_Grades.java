package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PracticeTask_Grades {
    public static void main(String[] args) {
        //TASK:
        /*
        Given the following arraylists:
ArrayList<Integer>  scores = new ArrayList<>();
scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55,
45, 73, 73, 35, 47));
ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~
100
ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
Write a program that can count the total numbers of grade A, B, C,
D and F
         */
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        
        for (Integer each : scores) {
            if (each > 90) {
                gradeOfA.add(each);
            } else if (each > 80) {
                gradeOfB.add(each);
            } else if (each > 70) {
                gradeOfC.add(each);
            } else if (each > 60) {
                gradeOfD.add(each);
            } else {
                gradeOfF.add(each);
            }
        }
        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("Grade A number: " + gradeOfA.size());

        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("Grade B number: " + gradeOfB.size());

        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("Grade C number: " + gradeOfC.size());

        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("Grade D number: " + gradeOfD.size());

        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println("Grade F number: " + gradeOfF.size());


    }
}
