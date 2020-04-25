package casestudy.models;

import java.util.Date;

public class Customer {
    private String fullName;
    private String birthday;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services services;

    public Customer(){

    }
    public Customer(String fullName, String birthday, String gender, String idNumber, String phoneNumber, String email,
                    String customerType, String address, Services services){
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.services = services;


    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public void showInfor() {
        System.out.println( "1. Name: "+this.getFullName()+"\n"+
                "2. Birthday: "+this.getBirthday()+"\n"+
                "3. Gender: "+this.getGender()+"\n"+
                "4. ID Number: "+this.getIdNumber()+"\n"+
                "5. Phone Number: "+this.getPhoneNumber()+"\n"+
                "6. Email address: "+this.getEmail()+"\n"+
                "7. Type of Customer: "+this.getCustomerType()+"\n"+
                "8. Address: "+this.getAddress()
        );

    }
}
