package day37_Inheritance.scrumTeam;

public class ScrumMaster extends Employee{
    /*
   Create a sub class of EMployee named ScrumMaster:

			Add any extra variable or method that ScrumMaster object need to have
     */
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

    public void arrangeMeeting(){
        System.out.println(jobTitle + " " + name + " is arranging meeting.");
    }

}
