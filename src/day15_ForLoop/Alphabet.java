package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
     for (char i = 'A'; i <= 'Z'; i++){
         System.out.print(i + " ");
     }

        System.out.println();
        System.out.println("--------------------------------------------");

        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------------------------");

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------------------------");
          
        for (char i = 1; i >= 10000; i++){
            System.out.print(i + " ");
        }
    }
}
