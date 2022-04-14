package day23_CustomMethods_Void;

public class PracticeTask_NameFormat {
    //TASK:
    /*
      write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
     */
    public static void main(String[] args) {
     formatName("ahMET", "KOCadag");
    }

    public static void formatName(String name, String surName){
        String formatName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + " " +
                surName.substring(0,1).toUpperCase() + surName.substring(1).toLowerCase();

        System.out.println("formatName = " + formatName);
    }
}
