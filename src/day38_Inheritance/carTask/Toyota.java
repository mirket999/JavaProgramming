package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable.");
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }

/*
1. Toyota: extra methods:
				reliable()
*/


}
