package day36_Inheritance.practiceTasks.cryptoTokenTask;

public class XRP extends CryptoToken{
    public XRP(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        super(price, marketCap, volume, quantity, circulatingSupply, isMineable);
    }
}
