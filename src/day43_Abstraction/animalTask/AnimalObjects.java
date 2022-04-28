package day43_Abstraction.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-------------------------------------------------");

        dog.eat();
        cat.eat();
        tiger.eat();
    }
}
