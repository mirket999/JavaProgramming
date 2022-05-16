package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", 2020, 202520, "Gray", 20000);
        Tesla tesla = new Tesla("Model S", 2020,202252, "Red",  35000);
        BMW bmw = new BMW("X5", 2015, 256321, "Red", 25000);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
