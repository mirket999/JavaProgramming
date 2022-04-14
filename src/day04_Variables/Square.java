package day04_Variables;
/*
Create a class named Square, write a program that can calculate
the area & perimeter of any given square
side
area = side * side;
perimeter = 4 * area
*/
public class Square {

    public static void main(String[] args) {

    /*  If the side is int:
        int side = 20;
        int area = side * side;
        int perimeter = 4 * side;*/

        double side = 3.5;
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.println("Area of the square is: " + area);
        System.out.println("Perimeter of the square is: " + perimeter);
    }
}
