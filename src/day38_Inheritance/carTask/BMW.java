package day38_Inheritance.carTask;

public class BMW extends Car {

    public BMW(String model, int year, int miles, String color,   double price) {
        super("BMW", model, year, miles, color, price);
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to start " + brand + " " + model);
    }

    public void breaksDown() {
        System.out.println(brand + " " + model + " is breaking down.");
    }
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */
}
