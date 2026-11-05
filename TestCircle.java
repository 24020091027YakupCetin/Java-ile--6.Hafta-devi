package Main;

import GeometricObject.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(5.5);
        Circle c3 = new Circle(7.0);

        // equals testi
        System.out.println("c1, c2'ye eşit mi? " + c1.equals(c2)); // true
        System.out.println("c1, c3'e eşit mi? " + c1.equals(c3)); // false

        // compareTo testi
        System.out.println("c1.compareTo(c3): " + c1.compareTo(c3)); // -1 (c1 küçük)
        System.out.println("c3.compareTo(c1): " + c3.compareTo(c1)); // 1 (c3 büyük)
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2)); // 0 (eşit)
    }
}
