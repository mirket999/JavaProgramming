package day39_Recap.practiceTasks.animalTask;

public class Parrot extends FriendlyAnimal{
    /*
 Parrot:
                 Extra methods:
                     fly()
                     sing()
  */

    public Parrot(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating PARROT FOOD.");
    }

    public void sing(){
        System.out.println(getName() + " is singing.");
    }

    public void fly(){
        System.out.println(getName() + " is flying.");
    }
}
