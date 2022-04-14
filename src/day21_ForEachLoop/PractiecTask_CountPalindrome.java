package day21_ForEachLoop;

public class PractiecTask_CountPalindrome {
    /*
    write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
     */
    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};
        int count = 0;

        for (String each : arr) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
                if (each.equals(reversed)) {
                    count++;
                    System.out.println(each);
                }
            }
        }
        System.out.println("count = " + count);


    }
}
