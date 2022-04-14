package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

//age: 38 years old.
        byte age = 38;

//weight: 160 pounds
// byte weight = 160; //160 is out of byte' range
// byte num = -129; // -129 is out of byte' range
        short weight = 160; //160 is within the range of short

        //salary : 100000 $
        //short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; //int is the preferred data type for integer
        //no matter 100000 or 100_000. The recommended one is 100_000.

        long asset = 3_333_333_333L; //To force compiler to execute "long" we have to add l or L to the end of the number

        // tax: 0.26
        float tax = 0.26F; // "double" is used for all the decimals instead of "float".


        // char ---> if we use only one character, then we need to use "char" as variable.
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char grade = 'F';

        //boolean is used when it is needed to use T/F.
        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);

        /*STRING = sequence of characters, for multiple characters
        (123)-254-589   > String
        123254589       > int
        */



        String name = "Wooden Spoon";
        String city = "McLean";


    }

}
