package day35_Encapsulation.PracticeTasks;

public class Pizza {
    //Pizza Task:
    /*
    Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
     */

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

     public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

     public void setSize(String size) {

        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.out.println("Invalid size type: " + size);
            System.exit(1);
        }

       this.size=size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

     public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
         boolean b1 = numberOfCheeseTopping < 0;
         boolean b2 = size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3;
         boolean b3 = size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4;
         boolean b4 = size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5;

             if (b1 || b2 || b3 || b4) {
                 System.out.println("Invalid size or cheese topping number:" + size + " " + numberOfCheeseTopping);
                 System.exit(1);
             }
             this.numberOfCheeseTopping = numberOfCheeseTopping;
     }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        boolean b1 = numberOfPepperoniTopping < 0;
        boolean b2 = size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4;
        boolean b3 = size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5;
        boolean b4 = size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 6;

        if (b1 || b2 || b3 || b4) {
            System.out.println("Invalid size or pepperoni topping number:" + size + " " + numberOfPepperoniTopping);
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {

        return (size.equalsIgnoreCase("small")) ? 10 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2
                : (size.equalsIgnoreCase("medium")) ? 12 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2
                : 14 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Cost =" + calcCost() +
                '}';
    }

}
