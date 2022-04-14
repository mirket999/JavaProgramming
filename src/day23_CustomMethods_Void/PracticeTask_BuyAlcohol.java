package day23_CustomMethods_Void;

public class PracticeTask_BuyAlcohol {
    //TASK:
    /*
     create a method that can check if a person is eligible to buy
alcohol
     */
    public static void main(String[] args) {
     isEligibleToBuyAlcohol(23);
    }





    public static void isEligibleToBuyAlcohol (int age){
        if (age>=21){
            System.out.println("This person is eligible to buy alcohol");
        } else {
            System.out.println("This person is NOT eligible to buy alcohol");
        }
    }
}
