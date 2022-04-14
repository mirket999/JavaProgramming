package day33_Statics.PracticeTasks.CircleTask;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);
        System.out.println(circle1.diameter);
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());
    }
}
