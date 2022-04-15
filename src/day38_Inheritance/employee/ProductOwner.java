package day38_Inheritance.employee;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String gender, String jobTitle, String companyName, double salary) {
        super(name, gender, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(jobTitle + " " + name + " is working on a NEW PROJECT.");
    }
}
