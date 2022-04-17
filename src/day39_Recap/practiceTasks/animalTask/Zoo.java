package day39_Recap.practiceTasks.animalTask;

public class Zoo {
    public static void main(String[] args) {
        /*
        Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
         */

        Dog dog = new Dog("Josh", "husjy", "white", "Medium", 'M', 15);
        dog.bark();
        dog.eat();
        dog.drink();
        System.out.println(dog.getName());
    }
}
