package day39_Recap.cydeoTask;

public class Employee extends Person {
    /*
    Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
     */

    private int employeeId;
    private double salary;
    private String jobTitle;

    public Employee(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.out.println("Salary can not be less than or equal to zero.");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.out.println("Job Title can not be empty or blank.");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName() + " is working.");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
