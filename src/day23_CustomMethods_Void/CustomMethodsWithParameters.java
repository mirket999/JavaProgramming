package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        evenOrOdd(9);
        ageOfMan(1980);
        numbersXToY(10, 20);

    }


    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void ageOfMan(int birthYear) {

        System.out.println("Age of this person is: " + (2022-birthYear));
    }

    public static void numbersXToY (int from, int to){
        for (int i = from; i <= to ; i++) {
            System.out.print(i + " ");
        }
    }
}
