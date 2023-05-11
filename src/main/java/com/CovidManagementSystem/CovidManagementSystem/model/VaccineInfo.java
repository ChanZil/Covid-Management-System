package com.CovidManagementSystem.CovidManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Document(collection = "vaccineInfo")
public class VaccineInfo {
    @Id
    String memberID;
    VaccineDate vaccineDate;
    String vaccineManufacturer;
    String exposureDate;
    String recoveryDate;


    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public VaccineDate getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(VaccineDate vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public String getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(String vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }

    public String getExposureDate() {
        return exposureDate;
    }

    public void setExposureDate(String exposureDate) {
        if(tools.validDate(exposureDate))
            this.exposureDate = exposureDate;
    }

    public String getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(String recoveryDate) {
        if(tools.validDate(recoveryDate))
            this.recoveryDate = recoveryDate;
    }
}
