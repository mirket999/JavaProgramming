package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListSetPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6));

        Iterator<Integer> it = list.iterator();
        System.out.println("it.hasNext() = " + it.hasNext());
        System.out.println("it.next() = " + it.next());

        // remove için while döngüsünü dene.


    }
}
