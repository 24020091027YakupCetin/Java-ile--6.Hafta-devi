package Course;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Öğrenci silme mantığı (gerekirse)
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    // Derin Kopyalama (Deep Copy) yapan clone metodu
    @Override
    public Object clone() {
        try {
            // Nesnenin kendisini kopyala (courseName ve numberOfStudents kopyalanır)
            Course courseClone = (Course) super.clone();
            
            // students dizisini derin kopyala (bağımsız yeni dizi oluşturur)
            courseClone.students = this.students.clone();
            
            return courseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}