package day38_Inheritance.employee;

public class Pilot extends Employee{

    public Pilot(String name, String gender, String jobTitle, String companyName, double salary) {
        super(name, gender, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle + " " + name + " is FLYING ALL OVER THE WORLD.");
    }
}
