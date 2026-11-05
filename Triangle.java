package GeometricObjecttest;

import GeometricObject.GeometricObject;

public class Triangle extends GeometricObject {
    
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String renk, boolean filled) {
        super(renk, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public double getArea() {
        double u = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
        return Math.sqrt(u * (u - this.getSide1()) * (u - this.getSide2()) * (u - this.getSide3()));
    }
    
    public double getPerimeter() {
        return (this.getSide1() + this.getSide2() + this.getSide3());
    }
    
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}