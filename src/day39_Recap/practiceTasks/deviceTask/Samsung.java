package day39_Recap.practiceTasks.deviceTask;

public class Samsung extends Phone{
    public Samsung(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void takePhoto(){
        System.out.println(getBrand() + " " + getModel() + " is taking photo.");
    }
}
