package day38_Inheritance.employee;

public class Tester extends Employee{

    public Tester(String name, String gender, String jobTitle, String companyName, double salary) {
        super(name, gender, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle + " " + name + " is working on TEST cases.");
    }
}
