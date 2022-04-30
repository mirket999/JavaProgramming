package day44_Abstraction.carTask;

public final class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }


    @Override
    public void autoPark() {

    }
}
