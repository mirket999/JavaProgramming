package day33_Statics.PracticeTasks.PersonTask;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Omer", 36, 'M');
        Person person2 = new Person("Breanna", 32, 'F');
        person1.eat("Tost");
        person1.drink("cola");
        person1.sleep();

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);
    }
}
