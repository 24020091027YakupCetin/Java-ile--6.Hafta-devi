package person;

public class Person {

    private String name;
    private String adress;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String adress, String phoneNumber, String emailAdress) {
        this.adress = adress;
        this.emailAddress = emailAdress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "kişi adı:" + getName() + " ----- " + "sınıf adı:" + "person";
    }
}