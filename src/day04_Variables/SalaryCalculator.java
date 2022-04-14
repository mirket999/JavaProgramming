package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourly Rate, weekly Hours

     int hourlyRate = 50;
     int weeklyHours = 40;

     int salary = hourlyRate * weeklyHours * 52;

        System.out.println("hourlyRate = $" + hourlyRate); // shortcut is: soutv
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);

        System.out.print("Your yearly salary is: $" + salary);
        //System.out.println(salary);



    }
}
