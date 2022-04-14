package day24_CustomMethods_Return;

public class PracticeTask_Reverse {
    //TASK:
    /*
     create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
     */

    public static void main(String[] args) {

    String str = "Java";

    String str2 = reverse(str);

        System.out.println("str2 = " + str2);


    }

    public static String reverse (String word){
        String reversedWord = "";

        //SOLUTION 1: String toCharArray() + Forr Loop method:
        /*char [] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
             reversedWord+= ch[i];
        }

         */

        //SOLUTION 2: Forr Loop +charAt(i) method:
        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord+= word.charAt(i);
        }


        return reversedWord;
    }
}
