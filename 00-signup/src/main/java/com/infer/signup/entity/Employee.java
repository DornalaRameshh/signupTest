package com.infer.signup.entity;

import jakarta.persistence.*;

import java.util.Random;
import java.util.UUID;

@Entity
@Table(name="emp")
public class Employee {

    // write down your fields and provide mapping to database columns

    @Column(name="email")

    private String email;
    @Id
    @Column(name="rid",unique = true)
    private String uniqueRandomId;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="phone_num")
    private String phoneNum;


    public String getUniqueRandomId() {
        return uniqueRandomId;
    }

    public void setUniqueRandomId(String uniqueRandomId) {
        this.uniqueRandomId = uniqueRandomId;
    }

    public Employee(String uniqueRandomId) {
        this.uniqueRandomId = uniqueRandomId;
    }

   //Store the generated unique random ID

    // Other fields (email, name, password, phoneNumber)




    //generate constructor


    public Employee() {
    }

    public Employee( Long uniqueRandomId,String email, String name, String password, String phoneNum) {

        this.email = email;
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;

    }


    //generate getters and setters




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    //generate toString


    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", uniqueRandomId=" + uniqueRandomId +
                '}';
    }
}
