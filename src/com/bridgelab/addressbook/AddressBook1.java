package com.bridgelab.addressbook;

public class AddressBook1 {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private int phoneNumber;
    private String email;

    public AddressBook1() {

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        AddressBook1 obj = new AddressBook1();
        obj.setFirstName("Sarfaraz");
        obj.setLastName("khan");
        obj.setCity("nagpur");
        obj.setAddress("Hosa Yallapur Hosa Oni");
        obj.setEmail("abc@123");
        obj.setState("Maharashtra");
        obj.setZipCode(440002);
        obj.setPhoneNumber(9999999);
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
        System.out.println(obj.phoneNumber);
        System.out.println(obj.email);
        System.out.println(obj.getAddress());
        System.out.println(obj.city);
        System.out.println(obj.getState());
        System.out.println(obj.getZipCode());
    }
}


