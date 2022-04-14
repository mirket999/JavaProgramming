package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"}; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        //MY SOLUTION:
        String[] students = new String[group1.length + group2.length];  // 8

        for (int i = 0; i < group1.length; i++) {
           students[i] = group1[i];
        }
        for (int i = 0; i < group2.length; i++) {
            students[group1.length+i] = group2[i];
        }

        System.out.println(Arrays.toString(students));

       //MUHTAR'S SOLUTION:
        /*
                int i = 0;
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;
        }


        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));
         */
        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j =0;

        for (char each : ch1) {
            chars [j++] = each;
        }

        for (char each : ch2) {
            chars [j++] = each;
        }

        System.out.println(Arrays.toString(chars));

    }}