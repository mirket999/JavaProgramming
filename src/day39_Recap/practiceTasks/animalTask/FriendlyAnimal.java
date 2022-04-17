package day39_Recap.practiceTasks.animalTask;

public class FriendlyAnimal extends Animal{
    /*
     Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
     */
    public static boolean isWild=false;
    public static boolean isFriendly, isPlayable=true;


    public FriendlyAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void play(){
        System.out.println(getName() + " is playing.");
    }

    public void pet(){
        System.out.println(getName() + " likes to be petted.");
    }


}
