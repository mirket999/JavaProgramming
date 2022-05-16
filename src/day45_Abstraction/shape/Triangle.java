package day45_Abstraction.shape;

public class Triangle extends Shape{
    private double side;
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base<=0){
            throw new RuntimeException("Invalid base value: " + base);
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<=0){
            throw new RuntimeException("Invalid height value: " + height);
        }
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid side value: " + side);
        }
        this.side = side;
    }

    public Triangle(double side, double base, double height) {
        super("Triangle");
        setSide(base);
        setHeight(height);
        setSide(side);
    }


    @Override
    public double area() { // A = 1/2 × b × h.
        return 1/2*base*height;
    }

    @Override
    public double perimeter() { // P = a + b + c
        return 0;
    }
}
