package day36_Inheritance.practiceTasks.employeeTask;

public class Teacher extends Employee{
    /*
    Create the sub class of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()
     */

    public void teaching(){
        System.out.println(jobTitle+" "+name+" is teaching");
    }

}
