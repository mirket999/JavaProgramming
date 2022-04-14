package day27_WrapperClasses;

public class UpperLowerEqual {
    public static void main(String[] args) {
        //TASK:
        /*
         Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
         */
        String str = "JAVA java";
        int countUpperCase =0;
        int countLowerCase =0;

        for (char each : str.toCharArray()) {
         if (Character.isUpperCase(each)){
             countUpperCase++;
         }
         if (Character.isLowerCase(each)){
             countLowerCase++;
         }
        }
        boolean isEqual = countLowerCase==countUpperCase;
        System.out.println("isEqual = " + isEqual);
    }
}
