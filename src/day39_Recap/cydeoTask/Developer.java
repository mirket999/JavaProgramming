package day39_Recap.cydeoTask;

public class Developer extends Employee{
    /*
    Create a subclass of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
     */
    public Developer(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender, employeeId, salary, jobTitle);
    }

  /*  @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is CODING.");
    }*/

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is FIXING BUGS.");
    }


}
