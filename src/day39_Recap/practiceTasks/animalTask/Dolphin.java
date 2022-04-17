package day39_Recap.practiceTasks.animalTask;

public class Dolphin extends FriendlyAnimal{
    /*
    Dolphin:
					Extra methods:
						swim()

     */
    public Dolphin(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating DOLPHIN FOOD.");
    }

    public void swim(){
        System.out.println(getName() + " is swimming.");
    }
}
