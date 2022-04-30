package day44_Abstraction.deviceTask;

public class Google extends Phone implements Downloadable, AndroidApps{
    public Google(String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turning off.");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading app.");
    }
}
