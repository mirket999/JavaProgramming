package day38_Inheritance.shapeTask;

public class Square extends Shape{
    /*
    Square
	s

	toString(): name, s, area, perimeter
     */
   public double side;

    public Square(double side) {
        super("Square");
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area ='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
