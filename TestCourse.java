package MainTest;

import Course.Course;

public class TestCourse {
    public static void main(String[] args) {
        // Orijinal kursu oluşturma
        Course course1 = new Course("Java Programlama");
        course1.addStudent("Ahmet");
        course1.addStudent("Mehmet");

        // Kursu derin kopyalama ile klonlama
        Course course2 = (Course) course1.clone();

        // Klonlanan kursa yeni bir öğrenci ekleme
        course2.addStudent("Ayşe");

        // Orijinal ve Klon kursların öğrenci sayılarını basma
        System.out.println("Course 1 Öğrenci Sayısı: " + course1.getNumberOfStudents()); // 2 olmalı
        System.out.println("Course 2 Öğrenci Sayısı: " + course2.getNumberOfStudents()); // 3 olmalı

        System.out.println("\n--- Course 1 Öğrencileri ---");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(course1.getStudents()[i]);
        }

        System.out.println("\n--- Course 2 Öğrencileri ---");
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(course2.getStudents()[i]);
        }
    }
}