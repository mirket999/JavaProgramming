package day39_Recap.practiceTasks.deviceTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " is used for self defense.");
    }
}
