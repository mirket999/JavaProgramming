package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        /*
        find out the unique elements from the array and assign them to a new array.
         */

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        
        for (String each : words) {
            int count = 0;

            for (int i = 0; i < words.length; i++) {
              if (each.equals(words[i])) {
                 count++;
              }

            }
            if (count==1) {
                System.out.println(each);
            }
        }








        
    }
}