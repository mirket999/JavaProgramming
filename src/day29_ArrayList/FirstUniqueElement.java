package day29_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);

        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(each);
                break;
            }

        }

        //my approach:
        //list.removeIf(p-> Collections.frequency(list,p)>1);//first remove all duplicated elements.
        //list.get(0); // since only unique elements are stored under list, element on index number 0 is the first unique element.

    }
}
