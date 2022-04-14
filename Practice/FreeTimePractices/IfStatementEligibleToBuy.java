package FreeTimePractices;

public class IfStatementEligibleToBuy {

    public static void main(String[] args) {
// we can execute same code with two different option.
// 1. char is_Student = 'Y'; and if (age >= 18 && is_Student == 'Y')
 //2. boolean isStudent = true; and if (age >= 18 && !isStudent)

        int age = 19;
       // boolean isStudent = true;
        char is_Student = 'Y';

       /* if (age >= 18 && !isStudent) {
            System.out.println("Eligible to buy alcohol.");
        }
        */
        if (age >= 18 && is_Student == 'Y') {
            System.out.println("Eligible to buy alcohol.");
        }
        else System.err.println("Is not eligible to buy alcohol.");


    }


}
