package day31_Constructors.PracticeTasks.CarpetTask;

public class Test {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3.5, 5, 40, true);
        System.out.println(carpet1);
        double totalPrice = carpet1.calcCost();
        System.out.println("totalPrice = " + totalPrice);


    }


}
