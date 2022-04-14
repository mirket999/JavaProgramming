package day35_Encapsulation.PracticeTasks;

public class Item {
    //Item Task:
    /*
    create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

     */
private String name;
private double unitPrice;
private int quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name){
        if (name.isEmpty() || name.isBlank() || name == null ){
            System.err.println("Invalid Name format(empty/blank/null): " + name);
            System.exit(1);
        }

        for (char each : name.toCharArray()) {
         if (!(Character.isLetterOrDigit(each) || each == ' ')){
             System.err.println("Invalid Name format(specialchar): " + name);
             System.exit(1);
         }

        }
        if (!Character.isLetter(name.charAt(0))){
            System.err.println("Invalid Name format(must start with letter): " + name);
            System.exit(1);
        }
        this.name=name;

    }

    public void setUnitPrice(double unitPrice){
        if (unitPrice<=0){
            System.err.println("Invalid unit price: " + unitPrice);
            return;
        }
        this.unitPrice=unitPrice;
    }

    public void setQuantity(int quantity){
        if (quantity<=0){
            System.err.println("Invalid quantity: " + quantity);
            System.exit(1);
        }
        if (name.equalsIgnoreCase("toilet paper") && quantity>1){
            System.err.println("Invalid item quantity. Max limit for toilet paper is 1.");
            System.exit(1);
        }
        this.quantity=quantity;
    }

    public Item(String name, double unitPrice, int quantity){
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}
