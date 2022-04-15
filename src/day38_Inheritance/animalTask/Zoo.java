package day38_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Van", "big", "white", 6);
        Dog dog = new Dog("Husky", "Small", "Brown", 8);
        Tiger tiger = new Tiger("Bengal", "Large", "White", 21);
        Eagle eagle = new Eagle("BlackHawk", "Big", "black", 5);

        cat.eat();
        dog.eat();
        tiger.eat();
        eagle.eat();

    }


}
