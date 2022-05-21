package day47_Polymorphism;

import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Animal animal = new Dog("Can", "Husky", 'M', 25, "Small", "White");
        animal.eat();
        //animal.bark();

//        Dog dog = (Dog) animal;
//        dog.bark();

        ( (Dog)animal).eat();


    }

}
