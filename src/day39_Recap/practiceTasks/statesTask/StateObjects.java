package day39_Recap.practiceTasks.statesTask;

public class StateObjects {

    public static void main(String[] args) {
     /*
    Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes
     */

     California california = new California("CL", "SD", "Arnold", "Rocky", 12000000, 12.5);
     california.setStateTax(25);
        System.out.println(california);
        System.out.println(california.getGovernor());
    }
}
