package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{
    public double length, width;


    public Rectangle(double width, double length) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return (length+width)*2;
    }

    @Override
    public double perimeter() {
        return (length+width)*2;
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
