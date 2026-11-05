package person;

public class Staff extends Employee {
    
    private String title;

    public Staff(String title, String office, double salary, String name, String adress, String phoneNumber, String emailAdress) {
        super(office, salary, name, adress, phoneNumber, emailAdress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "kişi adı:" + getName() + " ----- " + "sınıf adı:" + "Staff";
    }
}