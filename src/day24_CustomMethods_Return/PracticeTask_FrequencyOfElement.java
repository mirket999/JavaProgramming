package day24_CustomMethods_Return;

public class PracticeTask_FrequencyOfElement {
    //TASK:
    /*
     create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
     */

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 2, 2};

        int frequency = frequencyOfElement(array, 1);
        System.out.println("frequency = " + frequency);

    }

    public static int frequencyOfElement(int[] array, int number) {
        int frequency = 0;
        for (int eachElement : array) {
            if (number == eachElement) {
                frequency++;
            }
        }
        return frequency;
    }
}
