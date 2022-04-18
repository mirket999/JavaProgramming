package day39_Recap.practiceTasks.statesTask;

public class Texas extends States{
/*
Create the following sub classes of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida
 */
    public Texas(String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super("Texas", abbreviation, politicalParty, governor, senator, population, stateTax);
    }
}
