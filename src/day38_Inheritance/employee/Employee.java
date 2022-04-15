package day38_Inheritance.employee;

public class Employee {
/*
Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them
 */
    public String name, gender, jobTitle, companyName;
    public double salary;

    public Employee(String name, String gender, String jobTitle, String companyName, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
