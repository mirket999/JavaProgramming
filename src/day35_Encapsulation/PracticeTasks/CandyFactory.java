package day35_Encapsulation.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        /*
         1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
         */
      ArrayList<Candies> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Candies("M&M", 60, 1.5, false),
                new Candies("M&M", 50, 0.5, false),
                new Candies("M&M", 40, 2.5, false),
                new Candies("M&M", 30, 3.5, false),
                new Candies("M&M", 20, 2.75, false)
        ));

        for (Candies each : list) {
            System.out.println(each.getBrand() + " " + each.getPrice());
        }
    }
}
