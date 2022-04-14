package day33_Statics.PracticeTasks.IphoneTask;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone Iphone1 = new day33_Statics.PracticeTasks.IphoneTask.Iphone("Iphone 12", "Black", 1000, "5.6 inches");

        System.out.println(Iphone1);

        Iphone1.faceTime(123456789);
        Iphone1.faceTime("gmail@yahoo.com");
        Iphone1.call(123456789);
        Iphone1.text(123456789);

    }
}
