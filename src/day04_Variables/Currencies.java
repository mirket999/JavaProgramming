package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 9.53;
        double euro = dollar / 1.16;
        double JPY = dollar * 114.14;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.24;


        //jpy, pound, peso, canadianDollar

        System.out.println(dollar + "$ = " + lira + "TL");
        System.out.println("euro = " + euro);
        System.out.println("CAD = " + CAD);
        System.out.println("pound = " + pound);
        System.out.println("JPY = " + JPY);
        System.out.println("CAD = " + CAD);
    }
}
