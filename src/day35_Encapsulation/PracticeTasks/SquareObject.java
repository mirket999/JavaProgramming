package day35_Encapsulation.PracticeTasks;

public class SquareObject {
    public static void main(String[] args) {
    Square square1 = new Square(4);
    square1.setSide(5);

    double squareArea = square1.calcArea();
        System.out.println(squareArea);

        System.out.println(square1);
    }
}
