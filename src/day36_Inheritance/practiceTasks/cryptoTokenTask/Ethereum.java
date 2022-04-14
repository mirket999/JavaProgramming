package day36_Inheritance.practiceTasks.cryptoTokenTask;

public class Ethereum extends CryptoToken{
    public Ethereum(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        super(price, marketCap, volume, quantity, circulatingSupply, isMineable);
    }
}
