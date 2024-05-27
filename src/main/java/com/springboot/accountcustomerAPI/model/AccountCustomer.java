package com.springboot.accountcustomerAPI.model;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name = "accountcustomer")
public class AccountCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "date_Created")
    private String DateCreated;

    public AccountCustomer() {
    }

    public AccountCustomer(String firstName, String lastName, long phoneNumber,String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber=phoneNumber;
        this.DateCreated=date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(String dateCreated) {
        DateCreated = dateCreated;
    }
}
