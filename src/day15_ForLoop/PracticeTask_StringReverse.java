package day15_ForLoop;

public class PracticeTask_StringReverse {
    public static void main(String[] args) {

        String str = "Java";
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result += str.charAt(i);


        }
        System.out.print(result);



    }
}
