package day35_Encapsulation.PracticeTasks;

public class Candies {

    //CandiesTask:
    /*
    Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

     */
  private String brand;
  private int quantity;
  private double price;
  private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.out.println("Quantity can not be zero or negative: " + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price<0){
            System.out.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candies(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
        setQuantity(quantity);

    }

    public String toString() {
        return "Candies{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ((price==0)? "free" : ", price=" + price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
