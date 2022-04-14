package FreeTimePractices;

public class IfStatementEligibleToVote {
    public static void main(String[] args) {

 /* We assume that if the person is both over 17 years and citizen,
then eligible to vote.
 */
        int age = 18;
        boolean isCitizen = false;

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible");
        }
        else System.out.println("Not eligible");

    }
}
