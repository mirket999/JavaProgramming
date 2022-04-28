package day43_Abstraction.animalTask;

public class Cat extends Animal{

    public Cat() {
        super("Cat");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating cat food.");
    }
}
