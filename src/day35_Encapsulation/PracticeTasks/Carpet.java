package day35_Encapsulation.PracticeTasks;

public class Carpet {
//TASK:
    /*
    3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice

     */
//width, length, unitPrice, isPersian (boolean)
  private double width;
  private double length;
  private double unitPrice;
  private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setWidth(double width){
        if (width<=0){
            System.err.println("Invalid width value: " + width);
            return;
        }
        this.width=width;
    }

    public void setLength(double length){
        if (length<=0){
            System.err.println("Invalid length value: " + length);
            return;
        }
        this.length=length;
    }

    public void setUnitPrice(double unitPrice){
        if (unitPrice<=0){
            System.err.println("Invalid unit price value: " + unitPrice);
            return;
        }
        this.unitPrice=unitPrice;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        setLength(length);
        setWidth(width);
        setUnitPrice(unitPrice);
        this.isPersian=isPersian;
    }

    public double calcCost(){
    return (isPersian)? ((width*length)*unitPrice)+200 : (width*length)*unitPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost=" + calcCost() +
                '}';
    }
}
