package day44_Abstraction.carTask;

public class CarShop {


    public static void main(String[] args) {
        Toyota toyota = new Toyota("Toyota", "Camry", 2010, 20000, "white");
        Honda honda = new Honda("Honda", "Civic", 2013, 15000, "Black");
        BMW bmw = new BMW("BMW", "3.20i", 2011, 18500, "Red");
        Audi audi = new Audi("Audi", "A3", 2018, 35000, "Purple");
        Mercedes mercedes = new Mercedes("Mercedes", "4MATIC", 2015, 24000, "Yellow");
        Tesla tesla = new Tesla("Tesla", "T1", 2021, 65000, "Green");
        CydeoCar cydeoCar = new CydeoCar("CydeoCar", "EU8", 2022, 120000, "Grey");

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(cydeoCar);

        toyota.drive();
        honda.start();
        bmw.drive();
        audi.autoPark();
        mercedes.autoPark();
        tesla.selfDrive();
        tesla.autoPark();


    }
}
