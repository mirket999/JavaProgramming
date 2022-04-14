package day37_Inheritance.scrumTeam;

public class ProductOwner extends Employee{
    /*
    Create a sub class of EMployee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have
     */

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }


}
