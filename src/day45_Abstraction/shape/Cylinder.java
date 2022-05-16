package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{
    private double radius;
    private double height;
    public final double pi = 3.14;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
    if (radius<=0){
        throw new RuntimeException("Invalid radius value: " + radius);
    }
        this.radius = radius;
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

    @Override
    public double area() {
        return 2*pi*radius*(radius+height); //total surface area of cylinder = 2πr(r + h)
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public double volume() { // V=πr2h
        return pi*radius*2*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                super.toString() +
                '}';
    }
}
