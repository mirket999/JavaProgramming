package day39_Recap.practiceTasks.deviceTask;

public class Phone extends Device{
/*
Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */
    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting with " + phoneNum);
    }


}
