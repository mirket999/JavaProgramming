package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "Gray", 2020, 123456, 20000);
        Tesla tesla = new Tesla("Model S", "Red",2022, 94990,  35000);
        BMW bmw = new BMW("BMW", "X5", "black",2020, 67350,  12000);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
