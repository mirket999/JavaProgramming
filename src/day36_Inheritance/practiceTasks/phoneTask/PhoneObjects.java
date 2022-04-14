package day36_Inheritance.practiceTasks.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        // Create a class named Phone Objects and test of the sub class' objects

        IPhone iphone = new IPhone();
        iphone.setInfo("iphone 12", "5.6 inches", "Black", 1000);

        Samsung samsung = new Samsung();
        samsung.setInfo("galaxy S19", "6 inches", "White", 900);

        Nokia nokia = new Nokia();
        nokia.setInfo("Brik", "4 inches", "Pink", 60);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }
}
