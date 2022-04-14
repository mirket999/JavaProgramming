package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro2 {
    public static void main(String[] args) {
         /*
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of month you wanna see");
        int monthNumber = input.nextInt();

        System.out.println(months[monthNumber-1]);

          */

        int[] numbers = {20, 10, 30, 40};
        System.out.println(numbers[2]);

        int[] numbers2 = new int[5];
        numbers2[2] = 30;

        System.out.println(Arrays.toString(numbers2));

        System.out.println("--------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }

        System.out.println("--------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);

        }

        System.out.println("--------------------------------------");

        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------------------------");


        int[] numbers3 = new int[100];

        for (int i = 0, j = 1; i <= 99; i++, j++) {
            numbers3[i] = j;
        }
        System.out.println(Arrays.toString(numbers3));

        System.out.println("-------------------------------------------------");

        char[] letters1 = new char[26];

        for (int i = 0, j = 'Z'; i < 26; i++, j--) {
            letters1[i] = (char) j;
        }
        System.out.println(Arrays.toString(letters1));

        System.out.println("-------------------------------------------------");

        char [] lowerCaseLetters = new char[26];


        for (int i = 0, j = 'a' ; i < 26 ; i++, j++) {
            lowerCaseLetters[i] = (char) j;
        }
        System.out.println(Arrays.toString(lowerCaseLetters));




















    }
}
