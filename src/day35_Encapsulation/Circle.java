package day35_Encapsulation;

public class Circle {
    //TASK:
    /*
    Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
     */

    private double radius;
    public static double pi;

    public double getRadius(){ //getter method
        return radius;
    }

    public void setRadius(double radius){ //Setter method
        if (radius<=0){
            System.out.println("Invalid radius value: " + radius);
            return;
        }
        this.radius=radius;
    }

    public Circle(double radius) { //Constructor
        setRadius(radius);
    }

    static { //static block
        pi=3.14;
    }

    public double calcArea(){
     return pi*radius*radius;
    }

    public double calcPerimeter(){
     return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                "area = " + calcArea() +
                "perimeter = " + calcPerimeter() +
                '}';
    }
}
