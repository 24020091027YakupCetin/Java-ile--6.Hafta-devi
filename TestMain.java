package Main;

import GeomettricObject.Octagon;

public class TestMain {
    public static void main(String[] args) {
        // Kenar uzunluğu 5 olan Octagon nesnesi oluşturma
        Octagon octagon1 = new Octagon(5);

        // Alan ve çevre bilgilerini ekrana yazırma
        System.out.println("Octagon 1 Alanı: " + octagon1.getArea());
        System.out.println("Octagon 1 Çevresi: " + octagon1.getPerimeter());

        // clone() metodu ile yeni bir nesne kopyalama
        Octagon octagon2 = (Octagon) octagon1.clone();

        // compareTo metodu ile iki nesneyi karşılaştırma
        int compareResult = octagon1.compareTo(octagon2);
        
        System.out.println("\n--- KARŞILAŞTIRMA SONUCU ---");
        if (compareResult == 0) {
            System.out.println("octagon1 ve klonlanan octagon2 birbirine eşittir.");
        } else if (compareResult > 0) {
            System.out.println("octagon1, octagon2 nesnesinden büyüktür.");
        } else {
            System.out.println("octagon1, octagon2 nesnesinden küçüktür.");
        }
    }
}
