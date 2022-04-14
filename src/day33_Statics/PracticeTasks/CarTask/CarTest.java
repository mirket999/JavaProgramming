package day33_Statics.PracticeTasks.CarTask;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Gray", 2021, 35000);

        System.out.println(car);
        car.drive();
    }
}
