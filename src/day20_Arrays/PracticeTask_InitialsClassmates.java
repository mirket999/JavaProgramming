package day20_Arrays;

public class PracticeTask_InitialsClassmates {
    /*
     create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
     */
    public static void main(String[] args) {

       String [] classmates = {"Ali Osman", "Ali AYDIN", "Serhat Ucar", "Sercan Gelir", "Osman Kacar"} ;

       //SOLUTION 1:
       /* for (int i = 0; i < 5; i++) {

            System.out.println(classmates[i].charAt(0) + "." +
                    classmates[i].charAt(classmates[i].indexOf(" ")+1));
        }

        */

        //SOLUTION 2:
        String result = "";
        for(String each : classmates) {
           result = each.charAt(0) + ". " + each.charAt(each.indexOf(" ")+1);
            System.out.println("result = " + result);
            }

        }





    }

