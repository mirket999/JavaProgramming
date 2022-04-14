package day36_Inheritance.practiceTasks.cryptoTokenTask;

public class CryptoToken {
    //TASK:
    /*
    create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge
     */
    public double price, marketCap, volume;
    public int quantity, circulatingSupply;
    public boolean isMineable;

    public CryptoToken(double price, double marketCap, double volume, int quantity, int circulatingSupply, boolean isMineable) {
        this.price = price;
        this.marketCap = marketCap;
        this.volume = volume;
        this.quantity = quantity;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice(){
       return price*quantity;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", quantity=" + quantity +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", Total price is= " + totalPrice() +
                '}';
    }
}
