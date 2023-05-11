package com.CovidManagementSystem.CovidManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Document(collation = "member")
public class Member {
    String firstName;
    String lastName;
    @Id
    String id;
    String city;
    String street;
    int houseNumber;
    String dateOfBirth;
    String phoneNumber;
    String mobilePhoneNumber;

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
        if(Pattern.matches("[0-9]{9}", id))
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
        if(Pattern.matches("[0-9]+", String.valueOf(houseNumber)))
            this.houseNumber = houseNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(dateOfBirth);
            this.dateOfBirth = dateOfBirth;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(Pattern.matches("[0-9]{9}", phoneNumber))
            this.phoneNumber = phoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        if(Pattern.matches("[0-9]{10}", mobilePhoneNumber))
            this.mobilePhoneNumber = mobilePhoneNumber;
    }
}
