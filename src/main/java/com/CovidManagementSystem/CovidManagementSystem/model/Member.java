package com.CovidManagementSystem.CovidManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class Member {
    String firstName;
    String lastName;
    @Id
    String id;
    String city;
    String street;
    int houseNumber;
    Date dateOfBirth;
    String phoneNumber;
    String mobilePhoneNumber;

    @PersistenceConstructor
    public Member(String firstName, String lastName,
                  String id, String city, String street,
                  int houseNumber, Date dateOfBirth,
                  String phoneNumber, String mobilePhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Member(String firstName, String lastName,
                  String id, String city, String street,
                  int houseNumber, Date dateOfBirth,
                  String mobilePhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.dateOfBirth = dateOfBirth;
        this.mobilePhoneNumber = mobilePhoneNumber;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
}
