package day38_Inheritance.animalTask;

public class Eagle extends Animal{

    public Eagle(String breed, String size, String color, int age) {
        super("Eagle", breed, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " " + breed + " is eating eagle food.");
    }
}
