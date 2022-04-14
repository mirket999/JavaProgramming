package day12_Scanner;
import java.util.Scanner;
public class PracticeTask_SalaryCalculator {
    /*
    3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
     */
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Enter your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("Enter your weekly working hours:");
        double weeklyHours = input.nextDouble();

        System.out.println("Enter  state tax rate:");
        double stateTax = input.nextDouble();

        System.out.println("Enter federal taxe rate:");
        double federalTax = input.nextDouble();

        input.close();

        double salary = hourlyRate*weeklyHours*4;
        double totalTax = stateTax+federalTax;
        double netIncome = salary - (salary*totalTax);

        System.out.println("Your Salary is : Kr" + salary);
        System.out.println("State tax rate is: " + stateTax);
        System.out.println("Federal tax rate is: " + federalTax);
        System.out.println("Total tax rate is: " + totalTax);
        System.out.println("Your net income is : Kr" + netIncome);

    }
}
