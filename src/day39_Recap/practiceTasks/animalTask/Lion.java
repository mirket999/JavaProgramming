package day39_Recap.practiceTasks.animalTask;

public class Lion extends WildAnimal{
    /*
     Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile

     */
    public Lion(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting LION FOOD.");
    }

}
