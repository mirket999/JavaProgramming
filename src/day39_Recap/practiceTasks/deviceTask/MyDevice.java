package day39_Recap.practiceTasks.deviceTask;

public class MyDevice {
    public static void main(String[] args) {
     /*
     Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
      */
      BlackBerry blackBerry = new BlackBerry("Blackberry", "Lite", 2500);
      blackBerry.freeze();
      blackBerry.call(54784521);
        System.out.println(blackBerry.getPrice());
    }
}
