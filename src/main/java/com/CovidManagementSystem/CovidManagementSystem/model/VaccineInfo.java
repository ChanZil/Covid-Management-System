package com.CovidManagementSystem.CovidManagementSystem.model;

import com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collation = "vaccineInfo")
public class VaccineInfo {
    @Id
    String memberID;
    String[] vaccineDate = new String[4];
    com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer vaccineManufacturer;
    String exposureDate;
    String recoveryDate;

    public VaccineInfo(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String[] getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(String[] vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }

    public String getExposureDate() {
        return exposureDate;
    }

    public void setExposureDate(String exposureDate) {
        this.exposureDate = exposureDate;
    }

    public String getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(String recoveryDate) {
        this.recoveryDate = recoveryDate;
    }
}
