package model;

public class User {
    //--------------Attributes----------
    private String firstNane;
    private String lastNane;
    private String email;
    private String phone;
    private int age;
    private Address address;

    //------------Constructors-------------------
    public User(String firstNane, String lastNane) {
        this.firstNane = firstNane;
        this.lastNane = lastNane;

        System.out.println("Nen object " + firstNane + " created");
    }

    //------------Getters/Setters--------------
    public String getFirstNane() {
        return firstNane.toUpperCase();
    }

    public void setFirstNane(String firstNane) {
        this.firstNane = firstNane;
    }

    public String getLastNane() {
        return lastNane.substring(0, 1);
    }

    public void setLastNane(String lastNane) {
        this.lastNane = lastNane;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone.replaceAll(" ", "");
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //-------------------Custom Methods---------------
    public String getFullName() {
        return firstNane + " " + lastNane;
    }
}
