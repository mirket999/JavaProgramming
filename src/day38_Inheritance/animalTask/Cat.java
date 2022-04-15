package day38_Inheritance.animalTask;

public class Cat extends Animal{
    public Cat(String breed, String size, String color, int age) {
        super("Cat", breed, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " " + breed + " is eating cat food.");
    }




}
