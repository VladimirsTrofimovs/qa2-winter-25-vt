package model.mansrimi;

public class User {
    private String firstName;
    private String lastName;
    private String pk;
    private String phoneNr;

    public User(String firstName, String lastName, String pk, String phoneNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pk = pk;
        this.phoneNr = phoneNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }
}
