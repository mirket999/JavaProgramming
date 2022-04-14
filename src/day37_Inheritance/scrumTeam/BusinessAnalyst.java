package day37_Inheritance.scrumTeam;

public class BusinessAnalyst extends Employee {
    /*
    Create a sub class of EMployee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have
     */

    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }

}
