package day20_Arrays;

public class PracticeTask_ReverseClassmates {
    /*
    create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

     */
    public static void main(String[] args) {

         String [] classmates = {"Ali Osman", "Ali AYDIN", "Serhat Ucar", "Sercan Gelir", "Osman Kacar"};


        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reversedName = "";
            for (int j = name.length()-1; j >= 0 ; j--) {
             reversedName+= name.charAt(j);
            }
            System.out.println("reversedName = " + reversedName);
        }




    }
}
