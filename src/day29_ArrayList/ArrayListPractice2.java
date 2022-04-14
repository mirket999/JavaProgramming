package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        //remove all names except "Ahmed" and "David"
        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David") );

        System.out.println(employees);

        System.out.println("--------------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );//converting array to ArrayList.

        list.removeIf( p -> p.charAt(0) == 'M' ); // lamnda

        names = list.toArray(new String[0]); //convert ArrayList back to array.

        System.out.println(Arrays.toString(names));





    }


}