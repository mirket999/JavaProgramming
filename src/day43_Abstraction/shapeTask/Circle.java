package day43_Abstraction.shapeTask;

public class Circle extends Shape{
    private final double PI= 3.14;
    private double radius;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*PI;
    }

    @Override
    public double perimeter() {
        return 2*radius*PI;
    }
}
