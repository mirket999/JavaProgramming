package day45_Abstraction.shape;

public class Sphere extends Shape implements Volume{
    private double radius;
    // public final double pi = 3.14; -----> We dont need to declare pi in this class. It is inherited from Volume interface.


    public Sphere(double radius) {
        super("Sphere");
        setRadius(radius);
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

    @Override
    public double area() {
        return 4*pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public double volume() { //Volume of a sphere = 4/3 πr3
        return 4/3*pi*radius*radius*radius;
    }
    // public final double pi = 3.14;



}
