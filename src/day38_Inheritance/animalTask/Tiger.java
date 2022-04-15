package day38_Inheritance.animalTask;

public class Tiger extends Animal{

    public Tiger(String breed, String size, String color, int age) {
        super("Tiger", breed, size, color, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " "+ breed + " is eating tiger food.");
    }

}
