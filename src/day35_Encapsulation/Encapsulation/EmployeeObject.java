package day35_Encapsulation.Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
    Employee employee1 = new Employee("Omer", 'F', 25, 120000);
        System.out.println(employee1);
        employee1.setAge(30);
        System.out.println(employee1);

    }
}
