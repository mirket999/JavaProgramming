package day38_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String breed, String size, String color, int age) {
        super("Dog", breed, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " " + breed + " is eating dog food.");
    }
}
