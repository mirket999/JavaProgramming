package day38_Inheritance.carTask;

public class BMW extends Car {
    public BMW(String brand, String model, String color, int year, int miles, double price) {
        super(brand, model, color, year, miles, price);
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
