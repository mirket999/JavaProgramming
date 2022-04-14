package day23_CustomMethods_Void;

public class PracticeTask_EligibleToVote {
    //TASK:
    /*
     create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
     */
    public static void main(String[] args) {
     isEligibleToVote(20,"usa");
    }

    public static void isEligibleToVote (int age, String citizenship) {
        if (age >= 21 && citizenship.equalsIgnoreCase("USA")) {
            System.out.println("This person is eligible to vote.");
        } else {
            System.out.println("This person is NOT eligible to vote.");
        }

    }
    
}
