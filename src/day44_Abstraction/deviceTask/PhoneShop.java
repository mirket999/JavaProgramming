package day44_Abstraction.deviceTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("S1", "Medium", 2500, "white", true, true);
        PersonalComputer personalComputer = new PersonalComputer("HP", "s350", "Home", 1250, "Black", false, true);

        System.out.println(iphone);
        System.out.println(personalComputer);

        iphone.downloadApp();
        iphone.turnOn();
        personalComputer.turnOff();

    }
}
