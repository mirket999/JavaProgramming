package day36_Inheritance.practiceTasks.employeeTask;

public class Driver extends Employee{
/*
Create the sub class of Employee named Driver:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				drivering()
				toString()
 */

    public void driving(){
        System.out.println(jobTitle+" "+name+" is driving");
    }


}
