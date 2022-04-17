package day39_Recap.practiceTasks.deviceTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void faceTime(long telefonNumber){
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + telefonNumber);
    }
}
