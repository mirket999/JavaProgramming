package day36_Inheritance.practiceTasks.cryptoTokenTask;

public class Bitcoin extends CryptoToken{

    public Bitcoin(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        super(price, marketCap, volume, quantity, circulatingSupply, isMineable);
    }
}
