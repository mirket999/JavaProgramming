package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String model, int year, int miles, String color,   double price) {
        super("Tesla", model, year, miles, color, price);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " in autopilot mode.");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + brand + " " + model);
    }
}
