package day39_Recap.cydeoTask;

public class Tester extends Employee{

/*
Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */
    public Tester(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender, employeeId, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " + getName() + " is TESTING.");
    }

    public void createTicket(){
        System.out.println(getJobTitle()+ " " + getName() + " is CREATING TICKET.");
    }



}
