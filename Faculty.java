package person;

public class Faculty extends Employee {
    
    private String officeHours;
    private String rank;

    public Faculty(String officeHours, String rank, String office, double salary, String name, String adress, String phoneNumber, String emailAdress) {
        super(office, salary, name, adress, phoneNumber, emailAdress);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
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
        return "kişi adı:" + getName() + " ---- " + "sınıf adı:" + "Faculty";
    }
}