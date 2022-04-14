package day20_Arrays;

import java.util.Scanner;

public class PracticeTask_ItemsPrices {
    /*
    Items
1. Create an array named items with the
length of 5
2. Create an array named prices with the
length of 5
3. Ask user to enter item name and price 5
times and store them into the items and prices arrays
4. calculate the total price of the arrays
5. display each item name and price in
separate lines

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] items = new String[5];
        double [] prices = new double[5];
        double sum =0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the item " + (i+1));
            items [i] = input.nextLine();

            System.out.println("Enter the price of item " + (i+1));
            prices[i] = input.nextDouble() ;

            input.nextLine();
            sum+=prices[i];
            System.out.println(items[i] + ": " + prices[i]);


        }
        System.out.println("Total price is = $" + sum);

    }
}
