package day43_Abstraction.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(6, 5.5);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        System.out.println("------------------------------------");


    }
}
