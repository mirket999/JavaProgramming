package day21_ForEachLoop;

public class PracticeTask_EvenAndOddNumbers {
    /*
    Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
     */
    public static void main(String[] args) {
        int [] numbers = {50, 33, 41, 98, 65, 41, 22};

        int countEven = 0;
        int countOdd = 0;
        for (int each : numbers) {
            if (each % 2 == 0) {
                countEven++;
            }
            if (each % 2 == 1) {
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);
    }
}
