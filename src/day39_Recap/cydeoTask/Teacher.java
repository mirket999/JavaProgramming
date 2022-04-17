package day39_Recap.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender, employeeId, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is TEACHING.");
    }

}
