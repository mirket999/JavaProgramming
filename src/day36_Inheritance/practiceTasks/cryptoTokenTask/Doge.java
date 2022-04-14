package day36_Inheritance.practiceTasks.cryptoTokenTask;

public class Doge extends CryptoToken{

    public Doge(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        super(price, marketCap, volume, quantity, circulatingSupply, isMineable);
    }
}
