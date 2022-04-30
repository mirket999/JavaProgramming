package day44_Abstraction.deviceTask;

public abstract class Device {

    //Device Task:
    /*
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price


	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()


	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed

	4. Create an interface named downloadable:

				Abstract method:
					downloadApp();

	5. Create a child interface of Downloadable named AndroidApps:

			Variables:
				AppStoreName, OS

	6. Create a child interface of Downloadable named AppleApps

			Variables:
				AppStoreName, OS


	7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces


	8. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop


	9. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
     */

    private final String brand, model, size;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if (brand==null || brand.isEmpty()){
            throw new RuntimeException("Invalid brand: " + brand);
        }
        this.brand = brand;
        if (model==null || model.isEmpty()){
            throw new RuntimeException("Invalid model: " + model);
        }
        this.model = model;
        if (size==null || size.isEmpty()){
            throw new RuntimeException("Invalid size: " + size);
        }
        this.size = size;
        this.price = price;
        this.color = color;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isEmpty()){
            throw new RuntimeException("Invalid color: " + color);
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
