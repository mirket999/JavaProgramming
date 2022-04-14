package day36_Inheritance.practiceTasks.sportsTask;

public class Sport {
    //TASK:
    /*
    Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

     */

    public String name, rules;
    public int numberOfPlayers, numberOfReferre;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferre) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
    }

    public void play(){
        System.out.println("Let's play " + name);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                '}';
    }
}
