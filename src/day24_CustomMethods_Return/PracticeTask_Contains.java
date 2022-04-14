package day24_CustomMethods_Return;

public class PracticeTask_Contains {
    //TASK:
    /*
     Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
     */
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6,7};
       int num = 10;

       boolean ifContains = ifContainsNumber(arr, num);

        System.out.println("ifContains = " + ifContains);
    }

    public static boolean ifContainsNumber (int [] array, int number){   //since expected result is true/false, set Return type as boolean.
        boolean ifContains = false;
        for (int eachElement : array) {
            if (number==eachElement){
              ifContains = true;
            }
        }
        return ifContains;
    }
}
