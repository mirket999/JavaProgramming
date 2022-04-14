package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingName = input.next();
        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = input.next();

        System.out.println("Enter your zip code: ");
        String zipCode = input.next();
        input.close();
        System.out.println(fullName);
        System.out.println(buildingName);
        System.out.println(streetName);
        System.out.println(cityName);
        System.out.println(stateName);
        System.out.println(zipCode);


    }
}
