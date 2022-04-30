package day44_Abstraction.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " is sending message to " + phoneNum);
    }


}
