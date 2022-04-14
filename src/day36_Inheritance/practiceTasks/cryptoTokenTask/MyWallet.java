package day36_Inheritance.practiceTasks.cryptoTokenTask;

import day32_Constructors.Car;

public class MyWallet {
    public static void main(String[] args) {
       /*
    create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
     */
        Bitcoin bitcoin = new Bitcoin(45500, 24000000, 1000000000, 2, 45646,true);
        double result= bitcoin.totalPrice();
        System.out.println(result);
        System.out.println(bitcoin);

        System.out.println("-----------------------------------------------------");

        Ethereum ethereum = new Ethereum(3550, 300000, 45000,35, 456123, true);
        ethereum.price = 5000;
        System.out.println(ethereum);

        System.out.println("-----------------------------------------------------");

        Cardano cardano = new Cardano(3.50,45000, 65000, 100, 85000, false);
        System.out.println(cardano);

        System.out.println("-----------------------------------------------------");

        Doge doge = new Doge(1.50, 45000, 65000, 500, 85000, false);
        System.out.println(doge);



    }


}
