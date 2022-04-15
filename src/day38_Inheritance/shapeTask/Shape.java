package day38_Inheritance.shapeTask;

public class Shape {
    /*
    Shape:
	variable:
		name

	Add A constructor to set the filed

	Methods:
		area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter


Circle
	r
	pi

	toString(): name, r, pi, area, perimeter

Square
	s

	toString(): name, s, area, perimeter

Rectangle
	l
	w

	toString(): name, l, w, area, perimeter
     */
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
