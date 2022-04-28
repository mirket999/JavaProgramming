package day43_Abstraction.animalTask;

public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }
}
