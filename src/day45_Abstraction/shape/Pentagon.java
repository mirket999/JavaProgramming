package day45_Abstraction.shape;

public class Pentagon extends Shape {
    private double side;
    private double apothem;

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        if (apothem <= 0) {
            throw new RuntimeException("Invalid side value: " + side);
        }
        this.apothem = apothem;
    }

    public Pentagon(double side, double apothem) {
        super("Pentagon");
        setApothem(apothem);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("Invalid side value: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() { //Area of pentagon = 1/2 × p × a; where 'p' is the perimeter
                            // of the pentagon and 'a' is the apothem of a pentagon.
        return 0.5*perimeter()*apothem;
    }

    @Override
    public double perimeter() { //Perimeter = 5 × side length
        return 5*side;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "side=" + side +
                ", apothem=" + apothem +
                super.toString() +

                '}';
    }
}
