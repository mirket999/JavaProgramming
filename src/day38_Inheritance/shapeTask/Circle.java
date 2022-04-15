package day38_Inheritance.shapeTask;

public class Circle extends Shape{
  /*
  Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
   */

    public double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius=radius;
    }

   @Override
    public double area(){
        return radius*pi*2;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
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
