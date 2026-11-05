package person;

import java.util.Date;

public class Employee extends Person {
    
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String office, double salary, String name, String adress, String phoneNumber, String emailAddress) {
        super(name, adress, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
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
        return "kişi adı:" + getName() + "----- " + "sınıf adı:Employee";
    }
}