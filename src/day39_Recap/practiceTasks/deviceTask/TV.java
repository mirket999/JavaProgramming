package day39_Recap.practiceTasks.deviceTask;

public class TV extends Device{
    /*
    Create a subclass of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
     */

    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void channelUp(){
        System.out.println(getBrand() + " " + getModel() + " channel up.");
    }

    public void channelDown(){
        System.out.println(getBrand() + " " + getModel() + " channel down.");
    }
}
