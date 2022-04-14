package day31_Constructors.PracticeTasks.ItemTask;

public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("Cheese", 14.50, 5);
        double totalPrice = item1.calcCost();
        System.out.println("totalPrice = " + totalPrice);
    }
}
