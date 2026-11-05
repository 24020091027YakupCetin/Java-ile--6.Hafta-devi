package mainTest;

import GeometricObject.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5, "red", true);    // Alan: 20
        Rectangle r2 = new Rectangle(2, 10, "blue", false); // Alan: 20
        Rectangle r3 = new Rectangle(3, 5, "green", true);  // Alan: 15

        System.out.println("--- EQUALS TESTİ ---");
        System.out.println("r1 ve r2 eşit mi? (Alanlar 20 vs 20): " + r1.equals(r2)); // true
        System.out.println("r1 ve r3 eşit mi? (Alanlar 20 vs 15): " + r1.equals(r3)); // false

        System.out.println("\n--- COMPARETO TESTİ ---");
        System.out.println("r1.compareTo(r3): " + r1.compareTo(r3)); // 1  (r1 büyük)
        System.out.println("r3.compareTo(r1): " + r3.compareTo(r1)); // -1 (r3 küçük)
        System.out.println("r1.compareTo(r2): " + r1.compareTo(r2)); // 0  (alanlar eşit)
    }
}
