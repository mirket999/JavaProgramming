package week03;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
    double number1, number2, number3, total;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sırayla 3 numara giriniz. \n Birinci numara:");
        number1 = scan.nextDouble();
        System.out.println("İkinci numara: ");
        number2 = scan.nextDouble();
        System.out.println("Üçüncü numara: ");
        number3 = scan.nextDouble();

        total = number1 + number2 + number3;

        System.out.println("Total is : " + total);





    }


}
