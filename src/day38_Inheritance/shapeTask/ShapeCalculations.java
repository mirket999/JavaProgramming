package day38_Inheritance.shapeTask;

public class ShapeCalculations {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(6.5, 4.6);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
