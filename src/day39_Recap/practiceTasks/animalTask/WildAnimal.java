package day39_Recap.practiceTasks.animalTask;

public class WildAnimal extends Animal{
    /*
    Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
     */

    public static boolean isWild=true;
    public static boolean isFriendly, isPlayable=false;

    public WildAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void hunt(){
        System.out.println(getName() + " is hunting.");
    }


}
