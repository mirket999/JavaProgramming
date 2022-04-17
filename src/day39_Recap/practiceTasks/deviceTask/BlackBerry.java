package day39_Recap.practiceTasks.deviceTask;

public class BlackBerry extends Phone{
    public BlackBerry(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void freeze(){
        System.out.println(getBrand() +" " +getModel() + " is freezing.");
    }
}
