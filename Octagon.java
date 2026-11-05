package GeomettricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
        this(0);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    // Comparable arayüzünün compareTo metodunun ezilmesi (Kenar uzunluklarına göre)
    @Override
    public int compareTo(Octagon o) {
        if (this.side > o.side)
            return 1;
        else if (this.side < o.side)
            return -1;
        else
            return 0;
    }

    // Cloneable arayüzünün clone metodunun ezilmesi (Sığ kopyalama / Shallow copy)
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Octagon) {
            return this.side == ((Octagon) o).side;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
