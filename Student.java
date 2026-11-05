package person;

public class Student extends Person {
    
    public static final String FRESHMAN = "1. Sınıf";
    public static final String SOPHOMORE = "2. Sınıf";
    public static final String JUNIOR = "3. Sınıf";
    public static final String SENIOR = "4. Sınıf";
    
    private String status;

    public Student(String status, String name, String adress, String phoneNumber, String emailAddress) {
        super(name, adress, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "kişi adı:" + getName() + "----- " + "sınıf adı:Student";
    }
}